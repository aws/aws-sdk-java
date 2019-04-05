/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.amazonaws.services.codedeploy.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.codedeploy.model.GetDeploymentRequest;
import com.amazonaws.services.codedeploy.model.GetDeploymentResult;
import com.amazonaws.services.codedeploy.AmazonCodeDeploy;

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentFunction implements SdkFunction<GetDeploymentRequest, GetDeploymentResult> {

    /**
     * Represents the service client
     */
    private final AmazonCodeDeploy client;

    /**
     * Constructs a new GetDeploymentFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public GetDeploymentFunction(AmazonCodeDeploy client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param getDeploymentRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public GetDeploymentResult apply(GetDeploymentRequest getDeploymentRequest) {
        return client.getDeployment(getDeploymentRequest);
    }
}
