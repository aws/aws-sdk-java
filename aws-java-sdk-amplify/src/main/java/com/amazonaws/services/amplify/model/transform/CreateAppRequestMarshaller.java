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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplify.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAppRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAppRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> REPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repository").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> IAMSERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamServiceRoleArn").build();
    private static final MarshallingInfo<String> OAUTHTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oauthToken").build();
    private static final MarshallingInfo<Map> ENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariables").build();
    private static final MarshallingInfo<Boolean> ENABLEBRANCHAUTOBUILD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableBranchAutoBuild").build();
    private static final MarshallingInfo<Boolean> ENABLEBASICAUTH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableBasicAuth").build();
    private static final MarshallingInfo<String> BASICAUTHCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basicAuthCredentials").build();
    private static final MarshallingInfo<List> CUSTOMRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("customRules").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> BUILDSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("buildSpec").build();

    private static final CreateAppRequestMarshaller instance = new CreateAppRequestMarshaller();

    public static CreateAppRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAppRequest createAppRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAppRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAppRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createAppRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAppRequest.getRepository(), REPOSITORY_BINDING);
            protocolMarshaller.marshall(createAppRequest.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(createAppRequest.getIamServiceRoleArn(), IAMSERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(createAppRequest.getOauthToken(), OAUTHTOKEN_BINDING);
            protocolMarshaller.marshall(createAppRequest.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
            protocolMarshaller.marshall(createAppRequest.getEnableBranchAutoBuild(), ENABLEBRANCHAUTOBUILD_BINDING);
            protocolMarshaller.marshall(createAppRequest.getEnableBasicAuth(), ENABLEBASICAUTH_BINDING);
            protocolMarshaller.marshall(createAppRequest.getBasicAuthCredentials(), BASICAUTHCREDENTIALS_BINDING);
            protocolMarshaller.marshall(createAppRequest.getCustomRules(), CUSTOMRULES_BINDING);
            protocolMarshaller.marshall(createAppRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createAppRequest.getBuildSpec(), BUILDSPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
