/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.examples.deployment;

import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class ApplicationStack {

    private List<Deployable> components;
    
    private Deployable frontendComponent;

    public List<Deployable> getComponents() {
        return components;
    }

    public void setComponents(List<Deployable> components) {
        this.components = components;
    }

    public Deployable getFrontendComponent() {
        return frontendComponent;
    }
    
    public void setFrontendComponent(Deployable frontendComponent) {
        this.frontendComponent = frontendComponent;
    }

    public void deploy() {
        // Note that order in which components are iterated doesn't matter.
        // The component.deploy() initiates deployment but actual component deployment 
        // happens only when all downstream dependencies are satisfied.
        for (Deployable component : components) {
            component.deploy();
        }
    }

    public Promise<String> getUrl() {
        return frontendComponent.getUrl();
    }

}
