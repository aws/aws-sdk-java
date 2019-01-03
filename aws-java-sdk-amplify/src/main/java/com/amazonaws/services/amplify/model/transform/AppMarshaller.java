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
 * AppMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> APPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> REPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repository").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IAMSERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamServiceRoleArn").build();
    private static final MarshallingInfo<Map> ENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariables").build();
    private static final MarshallingInfo<String> DEFAULTDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultDomain").build();
    private static final MarshallingInfo<Boolean> ENABLEBRANCHAUTOBUILD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableBranchAutoBuild").build();
    private static final MarshallingInfo<Boolean> ENABLEBASICAUTH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableBasicAuth").build();
    private static final MarshallingInfo<String> BASICAUTHCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basicAuthCredentials").build();
    private static final MarshallingInfo<List> CUSTOMRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("customRules").build();
    private static final MarshallingInfo<StructuredPojo> PRODUCTIONBRANCH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("productionBranch").build();
    private static final MarshallingInfo<String> BUILDSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("buildSpec").build();

    private static final AppMarshaller instance = new AppMarshaller();

    public static AppMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(App app, ProtocolMarshaller protocolMarshaller) {

        if (app == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(app.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(app.getAppArn(), APPARN_BINDING);
            protocolMarshaller.marshall(app.getName(), NAME_BINDING);
            protocolMarshaller.marshall(app.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(app.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(app.getRepository(), REPOSITORY_BINDING);
            protocolMarshaller.marshall(app.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(app.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(app.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(app.getIamServiceRoleArn(), IAMSERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(app.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
            protocolMarshaller.marshall(app.getDefaultDomain(), DEFAULTDOMAIN_BINDING);
            protocolMarshaller.marshall(app.getEnableBranchAutoBuild(), ENABLEBRANCHAUTOBUILD_BINDING);
            protocolMarshaller.marshall(app.getEnableBasicAuth(), ENABLEBASICAUTH_BINDING);
            protocolMarshaller.marshall(app.getBasicAuthCredentials(), BASICAUTHCREDENTIALS_BINDING);
            protocolMarshaller.marshall(app.getCustomRules(), CUSTOMRULES_BINDING);
            protocolMarshaller.marshall(app.getProductionBranch(), PRODUCTIONBRANCH_BINDING);
            protocolMarshaller.marshall(app.getBuildSpec(), BUILDSPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
