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
package com.amazonaws.services.greengrass.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BulkDeploymentMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BulkDeploymentMetricsMarshaller {

    private static final MarshallingInfo<Integer> INVALIDINPUTRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvalidInputRecords").build();
    private static final MarshallingInfo<Integer> RECORDSPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordsProcessed").build();
    private static final MarshallingInfo<Integer> RETRYATTEMPTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryAttempts").build();

    private static final BulkDeploymentMetricsMarshaller instance = new BulkDeploymentMetricsMarshaller();

    public static BulkDeploymentMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BulkDeploymentMetrics bulkDeploymentMetrics, ProtocolMarshaller protocolMarshaller) {

        if (bulkDeploymentMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bulkDeploymentMetrics.getInvalidInputRecords(), INVALIDINPUTRECORDS_BINDING);
            protocolMarshaller.marshall(bulkDeploymentMetrics.getRecordsProcessed(), RECORDSPROCESSED_BINDING);
            protocolMarshaller.marshall(bulkDeploymentMetrics.getRetryAttempts(), RETRYATTEMPTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
