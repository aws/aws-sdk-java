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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ThirdPartyJobDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThirdPartyJobDataMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTIONTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionTypeId").build();
    private static final MarshallingInfo<StructuredPojo> ACTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> PIPELINECONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineContext").build();
    private static final MarshallingInfo<List> INPUTARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputArtifacts").build();
    private static final MarshallingInfo<List> OUTPUTARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputArtifacts").build();
    private static final MarshallingInfo<StructuredPojo> ARTIFACTCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifactCredentials").build();
    private static final MarshallingInfo<String> CONTINUATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("continuationToken").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKey").build();

    private static final ThirdPartyJobDataMarshaller instance = new ThirdPartyJobDataMarshaller();

    public static ThirdPartyJobDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ThirdPartyJobData thirdPartyJobData, ProtocolMarshaller protocolMarshaller) {

        if (thirdPartyJobData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(thirdPartyJobData.getActionTypeId(), ACTIONTYPEID_BINDING);
            protocolMarshaller.marshall(thirdPartyJobData.getActionConfiguration(), ACTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(thirdPartyJobData.getPipelineContext(), PIPELINECONTEXT_BINDING);
            protocolMarshaller.marshall(thirdPartyJobData.getInputArtifacts(), INPUTARTIFACTS_BINDING);
            protocolMarshaller.marshall(thirdPartyJobData.getOutputArtifacts(), OUTPUTARTIFACTS_BINDING);
            protocolMarshaller.marshall(thirdPartyJobData.getArtifactCredentials(), ARTIFACTCREDENTIALS_BINDING);
            protocolMarshaller.marshall(thirdPartyJobData.getContinuationToken(), CONTINUATIONTOKEN_BINDING);
            protocolMarshaller.marshall(thirdPartyJobData.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
