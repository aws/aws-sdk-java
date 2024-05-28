/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KxEnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KxEnvironmentMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TGWSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tgwStatus").build();
    private static final MarshallingInfo<String> DNSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dnsStatus").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ENVIRONMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentArn").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> DEDICATEDSERVICEACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dedicatedServiceAccountId").build();
    private static final MarshallingInfo<StructuredPojo> TRANSITGATEWAYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transitGatewayConfiguration").build();
    private static final MarshallingInfo<List> CUSTOMDNSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customDNSConfiguration").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> AVAILABILITYZONEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZoneIds").build();
    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateAuthorityArn").build();

    private static final KxEnvironmentMarshaller instance = new KxEnvironmentMarshaller();

    public static KxEnvironmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KxEnvironment kxEnvironment, ProtocolMarshaller protocolMarshaller) {

        if (kxEnvironment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kxEnvironment.getName(), NAME_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getTgwStatus(), TGWSTATUS_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getDnsStatus(), DNSSTATUS_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getEnvironmentArn(), ENVIRONMENTARN_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getDedicatedServiceAccountId(), DEDICATEDSERVICEACCOUNTID_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getTransitGatewayConfiguration(), TRANSITGATEWAYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getCustomDNSConfiguration(), CUSTOMDNSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getCreationTimestamp(), CREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getUpdateTimestamp(), UPDATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getAvailabilityZoneIds(), AVAILABILITYZONEIDS_BINDING);
            protocolMarshaller.marshall(kxEnvironment.getCertificateAuthorityArn(), CERTIFICATEAUTHORITYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
