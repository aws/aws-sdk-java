/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnalyticsDataAssociationResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnalyticsDataAssociationResultMarshaller {

    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<String> TARGETACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetAccountId").build();
    private static final MarshallingInfo<String> RESOURCESHAREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceShareId").build();
    private static final MarshallingInfo<String> RESOURCESHAREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceShareArn").build();

    private static final AnalyticsDataAssociationResultMarshaller instance = new AnalyticsDataAssociationResultMarshaller();

    public static AnalyticsDataAssociationResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnalyticsDataAssociationResult analyticsDataAssociationResult, ProtocolMarshaller protocolMarshaller) {

        if (analyticsDataAssociationResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(analyticsDataAssociationResult.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(analyticsDataAssociationResult.getTargetAccountId(), TARGETACCOUNTID_BINDING);
            protocolMarshaller.marshall(analyticsDataAssociationResult.getResourceShareId(), RESOURCESHAREID_BINDING);
            protocolMarshaller.marshall(analyticsDataAssociationResult.getResourceShareArn(), RESOURCESHAREARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
