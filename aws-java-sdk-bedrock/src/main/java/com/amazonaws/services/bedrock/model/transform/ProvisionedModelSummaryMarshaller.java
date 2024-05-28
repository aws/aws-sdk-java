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
package com.amazonaws.services.bedrock.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionedModelSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionedModelSummaryMarshaller {

    private static final MarshallingInfo<String> PROVISIONEDMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("provisionedModelName").build();
    private static final MarshallingInfo<String> PROVISIONEDMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("provisionedModelArn").build();
    private static final MarshallingInfo<String> MODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelArn").build();
    private static final MarshallingInfo<String> DESIREDMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredModelArn").build();
    private static final MarshallingInfo<String> FOUNDATIONMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("foundationModelArn").build();
    private static final MarshallingInfo<Integer> MODELUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelUnits").build();
    private static final MarshallingInfo<Integer> DESIREDMODELUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredModelUnits").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> COMMITMENTDURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitmentDuration").build();
    private static final MarshallingInfo<java.util.Date> COMMITMENTEXPIRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitmentExpirationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTime").timestampFormat("iso8601").build();

    private static final ProvisionedModelSummaryMarshaller instance = new ProvisionedModelSummaryMarshaller();

    public static ProvisionedModelSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionedModelSummary provisionedModelSummary, ProtocolMarshaller protocolMarshaller) {

        if (provisionedModelSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionedModelSummary.getProvisionedModelName(), PROVISIONEDMODELNAME_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getProvisionedModelArn(), PROVISIONEDMODELARN_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getModelArn(), MODELARN_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getDesiredModelArn(), DESIREDMODELARN_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getFoundationModelArn(), FOUNDATIONMODELARN_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getModelUnits(), MODELUNITS_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getDesiredModelUnits(), DESIREDMODELUNITS_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getCommitmentDuration(), COMMITMENTDURATION_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getCommitmentExpirationTime(), COMMITMENTEXPIRATIONTIME_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(provisionedModelSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
