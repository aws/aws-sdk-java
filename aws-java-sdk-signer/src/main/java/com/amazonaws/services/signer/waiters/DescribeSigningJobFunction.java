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

package com.amazonaws.services.signer.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.signer.model.DescribeSigningJobRequest;
import com.amazonaws.services.signer.model.DescribeSigningJobResult;
import com.amazonaws.services.signer.AWSsigner;

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSigningJobFunction implements SdkFunction<DescribeSigningJobRequest, DescribeSigningJobResult> {

    /**
     * Represents the service client
     */
    private final AWSsigner client;

    /**
     * Constructs a new DescribeSigningJobFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public DescribeSigningJobFunction(AWSsigner client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param describeSigningJobRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public DescribeSigningJobResult apply(DescribeSigningJobRequest describeSigningJobRequest) {
        return client.describeSigningJob(describeSigningJobRequest);
    }
}
