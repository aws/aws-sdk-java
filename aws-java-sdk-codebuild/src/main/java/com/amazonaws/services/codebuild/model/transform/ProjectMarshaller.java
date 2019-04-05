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
 * ProjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
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
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("created").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModified").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> WEBHOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("webhook").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();
    private static final MarshallingInfo<StructuredPojo> BADGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("badge").build();
    private static final MarshallingInfo<StructuredPojo> LOGSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logsConfig").build();

    private static final ProjectMarshaller instance = new ProjectMarshaller();

    public static ProjectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Project project, ProtocolMarshaller protocolMarshaller) {

        if (project == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(project.getName(), NAME_BINDING);
            protocolMarshaller.marshall(project.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(project.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(project.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(project.getSecondarySources(), SECONDARYSOURCES_BINDING);
            protocolMarshaller.marshall(project.getArtifacts(), ARTIFACTS_BINDING);
            protocolMarshaller.marshall(project.getSecondaryArtifacts(), SECONDARYARTIFACTS_BINDING);
            protocolMarshaller.marshall(project.getCache(), CACHE_BINDING);
            protocolMarshaller.marshall(project.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(project.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(project.getTimeoutInMinutes(), TIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(project.getQueuedTimeoutInMinutes(), QUEUEDTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(project.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(project.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(project.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(project.getLastModified(), LASTMODIFIED_BINDING);
            protocolMarshaller.marshall(project.getWebhook(), WEBHOOK_BINDING);
            protocolMarshaller.marshall(project.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(project.getBadge(), BADGE_BINDING);
            protocolMarshaller.marshall(project.getLogsConfig(), LOGSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
