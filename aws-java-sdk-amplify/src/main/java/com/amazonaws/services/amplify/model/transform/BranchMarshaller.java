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
 * BranchMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BranchMarshaller {

    private static final MarshallingInfo<String> BRANCHARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("branchArn").build();
    private static final MarshallingInfo<String> BRANCHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("branchName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> STAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stage").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<Boolean> ENABLENOTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableNotification").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> ENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariables").build();
    private static final MarshallingInfo<Boolean> ENABLEAUTOBUILD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableAutoBuild").build();
    private static final MarshallingInfo<List> CUSTOMDOMAINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("customDomains").build();
    private static final MarshallingInfo<String> FRAMEWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("framework").build();
    private static final MarshallingInfo<String> ACTIVEJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeJobId").build();
    private static final MarshallingInfo<String> TOTALNUMBEROFJOBS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalNumberOfJobs").build();
    private static final MarshallingInfo<Boolean> ENABLEBASICAUTH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableBasicAuth").build();
    private static final MarshallingInfo<String> THUMBNAILURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thumbnailUrl").build();
    private static final MarshallingInfo<String> BASICAUTHCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basicAuthCredentials").build();
    private static final MarshallingInfo<String> BUILDSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("buildSpec").build();
    private static final MarshallingInfo<String> TTL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ttl").build();

    private static final BranchMarshaller instance = new BranchMarshaller();

    public static BranchMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Branch branch, ProtocolMarshaller protocolMarshaller) {

        if (branch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(branch.getBranchArn(), BRANCHARN_BINDING);
            protocolMarshaller.marshall(branch.getBranchName(), BRANCHNAME_BINDING);
            protocolMarshaller.marshall(branch.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(branch.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(branch.getStage(), STAGE_BINDING);
            protocolMarshaller.marshall(branch.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(branch.getEnableNotification(), ENABLENOTIFICATION_BINDING);
            protocolMarshaller.marshall(branch.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(branch.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(branch.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
            protocolMarshaller.marshall(branch.getEnableAutoBuild(), ENABLEAUTOBUILD_BINDING);
            protocolMarshaller.marshall(branch.getCustomDomains(), CUSTOMDOMAINS_BINDING);
            protocolMarshaller.marshall(branch.getFramework(), FRAMEWORK_BINDING);
            protocolMarshaller.marshall(branch.getActiveJobId(), ACTIVEJOBID_BINDING);
            protocolMarshaller.marshall(branch.getTotalNumberOfJobs(), TOTALNUMBEROFJOBS_BINDING);
            protocolMarshaller.marshall(branch.getEnableBasicAuth(), ENABLEBASICAUTH_BINDING);
            protocolMarshaller.marshall(branch.getThumbnailUrl(), THUMBNAILURL_BINDING);
            protocolMarshaller.marshall(branch.getBasicAuthCredentials(), BASICAUTHCREDENTIALS_BINDING);
            protocolMarshaller.marshall(branch.getBuildSpec(), BUILDSPEC_BINDING);
            protocolMarshaller.marshall(branch.getTtl(), TTL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
