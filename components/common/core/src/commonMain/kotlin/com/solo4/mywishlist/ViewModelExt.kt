package com.solo4.mywishlist

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.solo4.mywishlist.arch.mvi.MviViewModel
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.qualifier.StringQualifier
import org.koin.core.scope.Scope
import org.koin.ext.getFullName
import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.compose.koinInject

inline fun <reified T : MviViewModel<*, *, *>> Module.mviViewModelFactory(
    crossinline creator: Scope.(CreationExtras) -> T
): KoinDefinition<out ViewModelProvider.Factory> {
    return factory(qualifier = StringQualifier(T::class.getFullName())) {
        viewModelFactory {
            initializer creationExtras@{
                creator.invoke(this@factory, this@creationExtras)
            }
        }
    }
}

@Composable
inline fun <reified T : MviViewModel<*, *, *>> mviViewModel(): T {
    return viewModel(factory = koinInject(qualifier = StringQualifier(T::class.getFullName())))
}