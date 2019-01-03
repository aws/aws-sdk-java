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

package com.amazonaws.services.opsworkscm.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest;
import com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult;
import com.amazonaws.services.opsworkscm.AWSOpsWorksCM;

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeAssociationStatusFunction implements SdkFunction<DescribeNodeAssociationStatusRequest, DescribeNodeAssociationStatusResult> {

    /**
     * Represents the service client
     */
    private final AWSOpsWorksCM client;

    /**
     * Constructs a new DescribeNodeAssociationStatusFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public DescribeNodeAssociationStatusFunction(AWSOpsWorksCM client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param describeNodeAssociationStatusRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public DescribeNodeAssociationStatusResult apply(DescribeNodeAssociationStatusRequest describeNodeAssociationStatusRequest) {
        return client.describeNodeAssociationStatus(describeNodeAssociationStatusRequest);
    }
}
