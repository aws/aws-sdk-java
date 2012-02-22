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

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.annotations.Wait;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;

public abstract class DeployableBase implements Deployable {

    private String host;

    List<Deployable> dependsOn = new ArrayList<Deployable>();
    

    @Override
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    protected void addDependsOn(List<? extends Deployable> deployable) {
        dependsOn.addAll(deployable);
    }

    private Settable<String> url = new Settable<String>();

    @Override
    public void deploy() {
        List<Promise<?>> dependsOnPromises = new ArrayList<Promise<?>>();
        for (Deployable deployable : dependsOn) {
            dependsOnPromises.add(deployable.getUrl());
        }
        deploy(dependsOnPromises);
    }

    @Asynchronous
    private void deploy(@Wait List<Promise<?>> dependsOnPromises) {
        // chain links one promise to the result of the other one
        url.chain(deploySelf());
    }

    @Override
    public Promise<String> getUrl() {
        return url;
    }
    
    /**
     * Perform actual deployment.
     * @return Url used to access this Deployable
     */
    protected abstract Promise<String> deploySelf();

}
