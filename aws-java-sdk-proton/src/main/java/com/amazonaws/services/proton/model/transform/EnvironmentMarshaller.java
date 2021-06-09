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
package com.amazonaws.services.proton.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnvironmentMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentStatus").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentStatusMessage").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ENVIRONMENTACCOUNTCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentAccountConnectionId").build();
    private static final MarshallingInfo<String> ENVIRONMENTACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentAccountId").build();
    private static final MarshallingInfo<java.util.Date> LASTDEPLOYMENTATTEMPTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastDeploymentAttemptedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTDEPLOYMENTSUCCEEDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastDeploymentSucceededAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROTONSERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("protonServiceRoleArn").build();
    private static final MarshallingInfo<String> PROVISIONING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("provisioning").build();
    private static final MarshallingInfo<String> SPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("spec").build();
    private static final MarshallingInfo<String> TEMPLATEMAJORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateMajorVersion").build();
    private static final MarshallingInfo<String> TEMPLATEMINORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateMinorVersion").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateName").build();

    private static final EnvironmentMarshaller instance = new EnvironmentMarshaller();

    public static EnvironmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Environment environment, ProtocolMarshaller protocolMarshaller) {

        if (environment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(environment.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(environment.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(environment.getDeploymentStatus(), DEPLOYMENTSTATUS_BINDING);
            protocolMarshaller.marshall(environment.getDeploymentStatusMessage(), DEPLOYMENTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(environment.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(environment.getEnvironmentAccountConnectionId(), ENVIRONMENTACCOUNTCONNECTIONID_BINDING);
            protocolMarshaller.marshall(environment.getEnvironmentAccountId(), ENVIRONMENTACCOUNTID_BINDING);
            protocolMarshaller.marshall(environment.getLastDeploymentAttemptedAt(), LASTDEPLOYMENTATTEMPTEDAT_BINDING);
            protocolMarshaller.marshall(environment.getLastDeploymentSucceededAt(), LASTDEPLOYMENTSUCCEEDEDAT_BINDING);
            protocolMarshaller.marshall(environment.getName(), NAME_BINDING);
            protocolMarshaller.marshall(environment.getProtonServiceRoleArn(), PROTONSERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(environment.getProvisioning(), PROVISIONING_BINDING);
            protocolMarshaller.marshall(environment.getSpec(), SPEC_BINDING);
            protocolMarshaller.marshall(environment.getTemplateMajorVersion(), TEMPLATEMAJORVERSION_BINDING);
            protocolMarshaller.marshall(environment.getTemplateMinorVersion(), TEMPLATEMINORVERSION_BINDING);
            protocolMarshaller.marshall(environment.getTemplateName(), TEMPLATENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
