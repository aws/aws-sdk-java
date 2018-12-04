/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StartBuildRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartBuildRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectName").build();
    private static final MarshallingInfo<String> SOURCEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceVersion").build();
    private static final MarshallingInfo<StructuredPojo> ARTIFACTSOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifactsOverride").build();
    private static final MarshallingInfo<List> ENVIRONMENTVARIABLESOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariablesOverride").build();
    private static final MarshallingInfo<Integer> GITCLONEDEPTHOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gitCloneDepthOverride").build();
    private static final MarshallingInfo<String> BUILDSPECOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("buildspecOverride").build();
    private static final MarshallingInfo<Integer> TIMEOUTINMINUTESOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInMinutesOverride").build();

    private static final StartBuildRequestMarshaller instance = new StartBuildRequestMarshaller();

    public static StartBuildRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartBuildRequest startBuildRequest, ProtocolMarshaller protocolMarshaller) {

        if (startBuildRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startBuildRequest.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(startBuildRequest.getSourceVersion(), SOURCEVERSION_BINDING);
            protocolMarshaller.marshall(startBuildRequest.getArtifactsOverride(), ARTIFACTSOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildRequest.getEnvironmentVariablesOverride(), ENVIRONMENTVARIABLESOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildRequest.getGitCloneDepthOverride(), GITCLONEDEPTHOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildRequest.getBuildspecOverride(), BUILDSPECOVERRIDE_BINDING);
            protocolMarshaller.marshall(startBuildRequest.getTimeoutInMinutesOverride(), TIMEOUTINMINUTESOVERRIDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
