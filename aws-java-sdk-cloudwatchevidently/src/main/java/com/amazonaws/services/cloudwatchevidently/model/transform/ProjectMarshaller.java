/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevidently.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectMarshaller {

    private static final MarshallingInfo<Long> ACTIVEEXPERIMENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeExperimentCount").build();
    private static final MarshallingInfo<Long> ACTIVELAUNCHCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeLaunchCount").build();
    private static final MarshallingInfo<StructuredPojo> APPCONFIGRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appConfigResource").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DATADELIVERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataDelivery").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Long> EXPERIMENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("experimentCount").build();
    private static final MarshallingInfo<Long> FEATURECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("featureCount").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> LAUNCHCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("launchCount").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

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
            protocolMarshaller.marshall(project.getActiveExperimentCount(), ACTIVEEXPERIMENTCOUNT_BINDING);
            protocolMarshaller.marshall(project.getActiveLaunchCount(), ACTIVELAUNCHCOUNT_BINDING);
            protocolMarshaller.marshall(project.getAppConfigResource(), APPCONFIGRESOURCE_BINDING);
            protocolMarshaller.marshall(project.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(project.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(project.getDataDelivery(), DATADELIVERY_BINDING);
            protocolMarshaller.marshall(project.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(project.getExperimentCount(), EXPERIMENTCOUNT_BINDING);
            protocolMarshaller.marshall(project.getFeatureCount(), FEATURECOUNT_BINDING);
            protocolMarshaller.marshall(project.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(project.getLaunchCount(), LAUNCHCOUNT_BINDING);
            protocolMarshaller.marshall(project.getName(), NAME_BINDING);
            protocolMarshaller.marshall(project.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(project.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
