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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateProjectRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateProjectRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("source").build();
    private static final MarshallingInfo<List> SECONDARYSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondarySources").build();
    private static final MarshallingInfo<StructuredPojo> ARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifacts").build();
    private static final MarshallingInfo<List> SECONDARYARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondaryArtifacts").build();
    private static final MarshallingInfo<StructuredPojo> CACHE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cache").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environment").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRole").build();
    private static final MarshallingInfo<Integer> TIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInMinutes").build();
    private static final MarshallingInfo<Integer> QUEUEDTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queuedTimeoutInMinutes").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKey").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();
    private static final MarshallingInfo<Boolean> BADGEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("badgeEnabled").build();
    private static final MarshallingInfo<StructuredPojo> LOGSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logsConfig").build();

    private static final CreateProjectRequestMarshaller instance = new CreateProjectRequestMarshaller();

    public static CreateProjectRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateProjectRequest createProjectRequest, ProtocolMarshaller protocolMarshaller) {

        if (createProjectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createProjectRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getSecondarySources(), SECONDARYSOURCES_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getArtifacts(), ARTIFACTS_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getSecondaryArtifacts(), SECONDARYARTIFACTS_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getCache(), CACHE_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getTimeoutInMinutes(), TIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getQueuedTimeoutInMinutes(), QUEUEDTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getBadgeEnabled(), BADGEENABLED_BINDING);
            protocolMarshaller.marshall(createProjectRequest.getLogsConfig(), LOGSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
