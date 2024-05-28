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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMediaInsightsPipelineConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMediaInsightsPipelineConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("identifier").build();
    private static final MarshallingInfo<String> RESOURCEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAccessRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> REALTIMEALERTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RealTimeAlertConfiguration").build();
    private static final MarshallingInfo<List> ELEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Elements").build();

    private static final UpdateMediaInsightsPipelineConfigurationRequestMarshaller instance = new UpdateMediaInsightsPipelineConfigurationRequestMarshaller();

    public static UpdateMediaInsightsPipelineConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMediaInsightsPipelineConfigurationRequest updateMediaInsightsPipelineConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMediaInsightsPipelineConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMediaInsightsPipelineConfigurationRequest.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateMediaInsightsPipelineConfigurationRequest.getResourceAccessRoleArn(), RESOURCEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(updateMediaInsightsPipelineConfigurationRequest.getRealTimeAlertConfiguration(), REALTIMEALERTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateMediaInsightsPipelineConfigurationRequest.getElements(), ELEMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
