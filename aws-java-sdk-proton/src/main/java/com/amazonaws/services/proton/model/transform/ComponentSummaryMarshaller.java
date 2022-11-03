/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComponentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentStatus").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentStatusMessage").build();
    private static final MarshallingInfo<String> ENVIRONMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentName").build();
    private static final MarshallingInfo<java.util.Date> LASTDEPLOYMENTATTEMPTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastDeploymentAttemptedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTDEPLOYMENTSUCCEEDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastDeploymentSucceededAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> SERVICEINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceInstanceName").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceName").build();

    private static final ComponentSummaryMarshaller instance = new ComponentSummaryMarshaller();

    public static ComponentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentSummary componentSummary, ProtocolMarshaller protocolMarshaller) {

        if (componentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(componentSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(componentSummary.getDeploymentStatus(), DEPLOYMENTSTATUS_BINDING);
            protocolMarshaller.marshall(componentSummary.getDeploymentStatusMessage(), DEPLOYMENTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(componentSummary.getEnvironmentName(), ENVIRONMENTNAME_BINDING);
            protocolMarshaller.marshall(componentSummary.getLastDeploymentAttemptedAt(), LASTDEPLOYMENTATTEMPTEDAT_BINDING);
            protocolMarshaller.marshall(componentSummary.getLastDeploymentSucceededAt(), LASTDEPLOYMENTSUCCEEDEDAT_BINDING);
            protocolMarshaller.marshall(componentSummary.getLastModifiedAt(), LASTMODIFIEDAT_BINDING);
            protocolMarshaller.marshall(componentSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(componentSummary.getServiceInstanceName(), SERVICEINSTANCENAME_BINDING);
            protocolMarshaller.marshall(componentSummary.getServiceName(), SERVICENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
