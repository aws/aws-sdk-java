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

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public interface Deployable {

    /**
     * @return Destination host.
     */
    public String getHost();
    
    /**
     * Initiate deployment. Actual deployment is expected to happen after all
     * dependencies of the current Deployable are deployed.
     */
    public void deploy();

    /**
     * Url used to access deployed component
     * @return promise the Url which becomes ready after successful deployment.
     */
    public Promise<String> getUrl();
    
}
