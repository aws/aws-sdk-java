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

package com.amazonaws.services.route53.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.route53.model.GetChangeRequest;
import com.amazonaws.services.route53.model.GetChangeResult;
import com.amazonaws.services.route53.AmazonRoute53;

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangeFunction implements SdkFunction<GetChangeRequest, GetChangeResult> {

    /**
     * Represents the service client
     */
    private final AmazonRoute53 client;

    /**
     * Constructs a new GetChangeFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public GetChangeFunction(AmazonRoute53 client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param getChangeRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public GetChangeResult apply(GetChangeRequest getChangeRequest) {
        return client.getChange(getChangeRequest);
    }
}
