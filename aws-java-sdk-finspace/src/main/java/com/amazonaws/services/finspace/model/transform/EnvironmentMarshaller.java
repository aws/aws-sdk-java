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
package com.amazonaws.services.finspace.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnvironmentMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> ENVIRONMENTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentUrl").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ENVIRONMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentArn").build();
    private static final MarshallingInfo<String> SAGEMAKERSTUDIODOMAINURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sageMakerStudioDomainUrl").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> DEDICATEDSERVICEACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dedicatedServiceAccountId").build();
    private static final MarshallingInfo<String> FEDERATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("federationMode").build();
    private static final MarshallingInfo<StructuredPojo> FEDERATIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("federationParameters").build();

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
            protocolMarshaller.marshall(environment.getName(), NAME_BINDING);
            protocolMarshaller.marshall(environment.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(environment.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(environment.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(environment.getEnvironmentUrl(), ENVIRONMENTURL_BINDING);
            protocolMarshaller.marshall(environment.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(environment.getEnvironmentArn(), ENVIRONMENTARN_BINDING);
            protocolMarshaller.marshall(environment.getSageMakerStudioDomainUrl(), SAGEMAKERSTUDIODOMAINURL_BINDING);
            protocolMarshaller.marshall(environment.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(environment.getDedicatedServiceAccountId(), DEDICATEDSERVICEACCOUNTID_BINDING);
            protocolMarshaller.marshall(environment.getFederationMode(), FEDERATIONMODE_BINDING);
            protocolMarshaller.marshall(environment.getFederationParameters(), FEDERATIONPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
