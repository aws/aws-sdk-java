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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateOTAUpdateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateOTAUpdateRequestMarshaller {

    private static final MarshallingInfo<String> OTAUPDATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("otaUpdateId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targets").build();
    private static final MarshallingInfo<String> TARGETSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetSelection").build();
    private static final MarshallingInfo<StructuredPojo> AWSJOBEXECUTIONSROLLOUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsJobExecutionsRolloutConfig").build();
    private static final MarshallingInfo<List> FILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("files").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<Map> ADDITIONALPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalParameters").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateOTAUpdateRequestMarshaller instance = new CreateOTAUpdateRequestMarshaller();

    public static CreateOTAUpdateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateOTAUpdateRequest createOTAUpdateRequest, ProtocolMarshaller protocolMarshaller) {

        if (createOTAUpdateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createOTAUpdateRequest.getOtaUpdateId(), OTAUPDATEID_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getTargetSelection(), TARGETSELECTION_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getAwsJobExecutionsRolloutConfig(), AWSJOBEXECUTIONSROLLOUTCONFIG_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getFiles(), FILES_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getAdditionalParameters(), ADDITIONALPARAMETERS_BINDING);
            protocolMarshaller.marshall(createOTAUpdateRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
