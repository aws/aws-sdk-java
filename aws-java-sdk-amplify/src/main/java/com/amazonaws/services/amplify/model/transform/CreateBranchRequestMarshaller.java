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
package com.amazonaws.services.amplify.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplify.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBranchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBranchRequestMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> BRANCHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("branchName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> STAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stage").build();
    private static final MarshallingInfo<String> FRAMEWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("framework").build();
    private static final MarshallingInfo<Boolean> ENABLENOTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableNotification").build();
    private static final MarshallingInfo<Boolean> ENABLEAUTOBUILD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableAutoBuild").build();
    private static final MarshallingInfo<Map> ENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariables").build();
    private static final MarshallingInfo<String> BASICAUTHCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basicAuthCredentials").build();
    private static final MarshallingInfo<Boolean> ENABLEBASICAUTH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableBasicAuth").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> BUILDSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("buildSpec").build();
    private static final MarshallingInfo<String> TTL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ttl").build();

    private static final CreateBranchRequestMarshaller instance = new CreateBranchRequestMarshaller();

    public static CreateBranchRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBranchRequest createBranchRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBranchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBranchRequest.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getBranchName(), BRANCHNAME_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getStage(), STAGE_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getFramework(), FRAMEWORK_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getEnableNotification(), ENABLENOTIFICATION_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getEnableAutoBuild(), ENABLEAUTOBUILD_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getBasicAuthCredentials(), BASICAUTHCREDENTIALS_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getEnableBasicAuth(), ENABLEBASICAUTH_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getBuildSpec(), BUILDSPEC_BINDING);
            protocolMarshaller.marshall(createBranchRequest.getTtl(), TTL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
