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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectSourceMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<Integer> GITCLONEDEPTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gitCloneDepth").build();
    private static final MarshallingInfo<StructuredPojo> GITSUBMODULESCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gitSubmodulesConfig").build();
    private static final MarshallingInfo<String> BUILDSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("buildspec").build();
    private static final MarshallingInfo<StructuredPojo> AUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("auth").build();
    private static final MarshallingInfo<Boolean> REPORTBUILDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reportBuildStatus").build();
    private static final MarshallingInfo<Boolean> INSECURESSL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("insecureSsl").build();
    private static final MarshallingInfo<String> SOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceIdentifier").build();

    private static final ProjectSourceMarshaller instance = new ProjectSourceMarshaller();

    public static ProjectSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProjectSource projectSource, ProtocolMarshaller protocolMarshaller) {

        if (projectSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(projectSource.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(projectSource.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(projectSource.getGitCloneDepth(), GITCLONEDEPTH_BINDING);
            protocolMarshaller.marshall(projectSource.getGitSubmodulesConfig(), GITSUBMODULESCONFIG_BINDING);
            protocolMarshaller.marshall(projectSource.getBuildspec(), BUILDSPEC_BINDING);
            protocolMarshaller.marshall(projectSource.getAuth(), AUTH_BINDING);
            protocolMarshaller.marshall(projectSource.getReportBuildStatus(), REPORTBUILDSTATUS_BINDING);
            protocolMarshaller.marshall(projectSource.getInsecureSsl(), INSECURESSL_BINDING);
            protocolMarshaller.marshall(projectSource.getSourceIdentifier(), SOURCEIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
