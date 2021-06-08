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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartBuildBatchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartBuildBatchRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectName").build();
    private static final MarshallingInfo<List> SECONDARYSOURCESOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondarySourcesOverride").build();
    private static final MarshallingInfo<List> SECONDARYSOURCESVERSIONOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondarySourcesVersionOverride").build();
    private static final MarshallingInfo<String> SOURCEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceVersion").build();
    private static final MarshallingInfo<StructuredPojo> ARTIFACTSOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifactsOverride").build();
    private static final MarshallingInfo<List> SECONDARYARTIFACTSOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondaryArtifactsOverride").build();
    private static final MarshallingInfo<List> ENVIRONMENTVARIABLESOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariablesOverride").build();
    private static final MarshallingInfo<String> SOURCETYPEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceTypeOverride").build();
    private static final MarshallingInfo<String> SOURCELOCATIONOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceLocationOverride").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEAUTHOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceAuthOverride").build();
    private static final MarshallingInfo<Integer> GITCLONEDEPTHOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gitCloneDepthOverride").build();
    private static final MarshallingInfo<StructuredPojo> GITSUBMODULESCONFIGOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gitSubmodulesConfigOverride").build();
    private static final MarshallingInfo<String> BUILDSPECOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildspecOverride").build();
    private static final MarshallingInfo<Boolean> INSECURESSLOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("insecureSslOverride").build();
    private static final MarshallingInfo<Boolean> REPORTBUILDBATCHSTATUSOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reportBuildBatchStatusOverride").build();
    private static final MarshallingInfo<String> ENVIRONMENTTYPEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentTypeOverride").build();
    private static final MarshallingInfo<String> IMAGEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageOverride").build();
    private static final MarshallingInfo<String> COMPUTETYPEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeTypeOverride").build();
    private static final MarshallingInfo<String> CERTIFICATEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateOverride").build();
    private static final MarshallingInfo<StructuredPojo> CACHEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheOverride").build();
    private static final MarshallingInfo<String> SERVICEROLEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRoleOverride").build();
    private static final MarshallingInfo<Boolean> PRIVILEGEDMODEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privilegedModeOverride").build();
    private static final MarshallingInfo<Integer> BUILDTIMEOUTINMINUTESOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildTimeoutInMinutesOverride").build();
    private static final MarshallingInfo<Integer> QUEUEDTIMEOUTINMINUTESOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queuedTimeoutInMinutesOverride").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEYOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKeyOverride").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("idempotencyToken").build();
    private static final MarshallingInfo<StructuredPojo> LOGSCONFIGOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logsConfigOverride").build();
    private static final MarshallingInfo<StructuredPojo> REGISTRYCREDENTIALOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registryCredentialOverride").build();
    private static final MarshallingInfo<String> IMAGEPULLCREDENTIALSTYPEOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imagePullCredentialsTypeOverride").build();
    private static final MarshallingInfo<StructuredPojo> BUILDBATCHCONFIGOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildBatchConfigOverride").build();
    private static final MarshallingInfo<Boolean> DEBUGSESSIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("debugSessionEnabled").build();

    private static final StartBuildBatchRequestMarshaller instance = new StartBuildBatchRequestMarshaller();

    public static StartBuildBatchRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartBuildBatchRequest startBuildBatchRequest, ProtocolMarshaller protocolMarshaller) {

        if (startBuildBatchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startBuildBatchRequest.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getSecondarySourcesOverride(), SECONDARYSOURCESOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getSecondarySourcesVersionOverride(), SECONDARYSOURCESVERSIONOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getSourceVersion(), SOURCEVERSION_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getArtifactsOverride(), ARTIFACTSOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getSecondaryArtifactsOverride(), SECONDARYARTIFACTSOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getEnvironmentVariablesOverride(), ENVIRONMENTVARIABLESOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getSourceTypeOverride(), SOURCETYPEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getSourceLocationOverride(), SOURCELOCATIONOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getSourceAuthOverride(), SOURCEAUTHOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getGitCloneDepthOverride(), GITCLONEDEPTHOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getGitSubmodulesConfigOverride(), GITSUBMODULESCONFIGOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getBuildspecOverride(), BUILDSPECOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getInsecureSslOverride(), INSECURESSLOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getReportBuildBatchStatusOverride(), REPORTBUILDBATCHSTATUSOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getEnvironmentTypeOverride(), ENVIRONMENTTYPEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getImageOverride(), IMAGEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getComputeTypeOverride(), COMPUTETYPEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getCertificateOverride(), CERTIFICATEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getCacheOverride(), CACHEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getServiceRoleOverride(), SERVICEROLEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getPrivilegedModeOverride(), PRIVILEGEDMODEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getBuildTimeoutInMinutesOverride(), BUILDTIMEOUTINMINUTESOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getQueuedTimeoutInMinutesOverride(), QUEUEDTIMEOUTINMINUTESOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getEncryptionKeyOverride(), ENCRYPTIONKEYOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getLogsConfigOverride(), LOGSCONFIGOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getRegistryCredentialOverride(), REGISTRYCREDENTIALOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getImagePullCredentialsTypeOverride(), IMAGEPULLCREDENTIALSTYPEOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getBuildBatchConfigOverride(), BUILDBATCHCONFIGOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildBatchRequest.getDebugSessionEnabled(), DEBUGSESSIONENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
