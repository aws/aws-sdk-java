/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FeatureGroupSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FeatureGroupSummaryMarshaller {

    private static final MarshallingInfo<String> FEATUREGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureGroupName").build();
    private static final MarshallingInfo<String> FEATUREGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureGroupArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FEATUREGROUPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureGroupStatus").build();
    private static final MarshallingInfo<StructuredPojo> OFFLINESTORESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfflineStoreStatus").build();

    private static final FeatureGroupSummaryMarshaller instance = new FeatureGroupSummaryMarshaller();

    public static FeatureGroupSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FeatureGroupSummary featureGroupSummary, ProtocolMarshaller protocolMarshaller) {

        if (featureGroupSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(featureGroupSummary.getFeatureGroupName(), FEATUREGROUPNAME_BINDING);
            protocolMarshaller.marshall(featureGroupSummary.getFeatureGroupArn(), FEATUREGROUPARN_BINDING);
            protocolMarshaller.marshall(featureGroupSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(featureGroupSummary.getFeatureGroupStatus(), FEATUREGROUPSTATUS_BINDING);
            protocolMarshaller.marshall(featureGroupSummary.getOfflineStoreStatus(), OFFLINESTORESTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
