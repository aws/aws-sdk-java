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
 * BuildMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BuildMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CURRENTPHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentPhase").build();
    private static final MarshallingInfo<String> BUILDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildStatus").build();
    private static final MarshallingInfo<String> SOURCEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceVersion").build();
    private static final MarshallingInfo<String> RESOLVEDSOURCEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolvedSourceVersion").build();
    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectName").build();
    private static final MarshallingInfo<List> PHASES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("phases").build();
    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("source").build();
    private static final MarshallingInfo<List> SECONDARYSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondarySources").build();
    private static final MarshallingInfo<List> SECONDARYSOURCEVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondarySourceVersions").build();
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
    private static final MarshallingInfo<StructuredPojo> LOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logs").build();
    private static final MarshallingInfo<Integer> TIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInMinutes").build();
    private static final MarshallingInfo<Integer> QUEUEDTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queuedTimeoutInMinutes").build();
    private static final MarshallingInfo<Boolean> BUILDCOMPLETE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildComplete").build();
    private static final MarshallingInfo<String> INITIATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("initiator").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKINTERFACE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterface").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKey").build();

    private static final BuildMarshaller instance = new BuildMarshaller();

    public static BuildMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Build build, ProtocolMarshaller protocolMarshaller) {

        if (build == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(build.getId(), ID_BINDING);
            protocolMarshaller.marshall(build.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(build.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(build.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(build.getCurrentPhase(), CURRENTPHASE_BINDING);
            protocolMarshaller.marshall(build.getBuildStatus(), BUILDSTATUS_BINDING);
            protocolMarshaller.marshall(build.getSourceVersion(), SOURCEVERSION_BINDING);
            protocolMarshaller.marshall(build.getResolvedSourceVersion(), RESOLVEDSOURCEVERSION_BINDING);
            protocolMarshaller.marshall(build.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(build.getPhases(), PHASES_BINDING);
            protocolMarshaller.marshall(build.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(build.getSecondarySources(), SECONDARYSOURCES_BINDING);
            protocolMarshaller.marshall(build.getSecondarySourceVersions(), SECONDARYSOURCEVERSIONS_BINDING);
            protocolMarshaller.marshall(build.getArtifacts(), ARTIFACTS_BINDING);
            protocolMarshaller.marshall(build.getSecondaryArtifacts(), SECONDARYARTIFACTS_BINDING);
            protocolMarshaller.marshall(build.getCache(), CACHE_BINDING);
            protocolMarshaller.marshall(build.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(build.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(build.getLogs(), LOGS_BINDING);
            protocolMarshaller.marshall(build.getTimeoutInMinutes(), TIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(build.getQueuedTimeoutInMinutes(), QUEUEDTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(build.getBuildComplete(), BUILDCOMPLETE_BINDING);
            protocolMarshaller.marshall(build.getInitiator(), INITIATOR_BINDING);
            protocolMarshaller.marshall(build.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(build.getNetworkInterface(), NETWORKINTERFACE_BINDING);
            protocolMarshaller.marshall(build.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
