package com.example.development.ComponentDependenciesExample;

import com.example.development.Base.BaseComponent;
import com.example.development.scope.ActivityScope;

import dagger.Component;

/**
 * Created by Shekar on 7/10/15.
 */

@ActivityScope
@Component(
        dependencies = BaseComponent.class,
        modules = {
                DependenciesExampleModule.class
        })
public interface DependenciesExampleComponent {
    void inject(DependenciesExampleActivity exampleActivity);
}
