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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsMarshaller {

    private static final MarshallingInfo<String> AUTOMATEDUPDATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomatedUpdateDate").build();
    private static final MarshallingInfo<Boolean> CANCELLABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Cancellable").build();
    private static final MarshallingInfo<String> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentVersion").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> NEWVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewVersion").build();
    private static final MarshallingInfo<Boolean> UPDATEAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateAvailable").build();
    private static final MarshallingInfo<String> UPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateStatus").build();
    private static final MarshallingInfo<Boolean> OPTIONALDEPLOYMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptionalDeployment").build();

    private static final AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsMarshaller instance = new AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsMarshaller();

    public static AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails awsOpenSearchServiceDomainServiceSoftwareOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsOpenSearchServiceDomainServiceSoftwareOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getAutomatedUpdateDate(), AUTOMATEDUPDATEDATE_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getCancellable(), CANCELLABLE_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getNewVersion(), NEWVERSION_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getUpdateAvailable(), UPDATEAVAILABLE_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getUpdateStatus(), UPDATESTATUS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.getOptionalDeployment(), OPTIONALDEPLOYMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
