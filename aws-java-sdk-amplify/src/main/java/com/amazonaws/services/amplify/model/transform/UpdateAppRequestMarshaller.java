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
 * UpdateAppRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAppRequestMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> IAMSERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamServiceRoleArn").build();
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
    private static final MarshallingInfo<String> BUILDSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("buildSpec").build();

    private static final UpdateAppRequestMarshaller instance = new UpdateAppRequestMarshaller();

    public static UpdateAppRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAppRequest updateAppRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAppRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAppRequest.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getIamServiceRoleArn(), IAMSERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getEnableBranchAutoBuild(), ENABLEBRANCHAUTOBUILD_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getEnableBasicAuth(), ENABLEBASICAUTH_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getBasicAuthCredentials(), BASICAUTHCREDENTIALS_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getCustomRules(), CUSTOMRULES_BINDING);
            protocolMarshaller.marshall(updateAppRequest.getBuildSpec(), BUILDSPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
