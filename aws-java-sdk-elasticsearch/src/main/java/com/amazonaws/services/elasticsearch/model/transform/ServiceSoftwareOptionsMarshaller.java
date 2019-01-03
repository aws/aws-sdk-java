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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceSoftwareOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceSoftwareOptionsMarshaller {

    private static final MarshallingInfo<String> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentVersion").build();
    private static final MarshallingInfo<String> NEWVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewVersion").build();
    private static final MarshallingInfo<Boolean> UPDATEAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateAvailable").build();
    private static final MarshallingInfo<Boolean> CANCELLABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Cancellable").build();
    private static final MarshallingInfo<String> UPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateStatus").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> AUTOMATEDUPDATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomatedUpdateDate").timestampFormat("unixTimestamp").build();

    private static final ServiceSoftwareOptionsMarshaller instance = new ServiceSoftwareOptionsMarshaller();

    public static ServiceSoftwareOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceSoftwareOptions serviceSoftwareOptions, ProtocolMarshaller protocolMarshaller) {

        if (serviceSoftwareOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceSoftwareOptions.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(serviceSoftwareOptions.getNewVersion(), NEWVERSION_BINDING);
            protocolMarshaller.marshall(serviceSoftwareOptions.getUpdateAvailable(), UPDATEAVAILABLE_BINDING);
            protocolMarshaller.marshall(serviceSoftwareOptions.getCancellable(), CANCELLABLE_BINDING);
            protocolMarshaller.marshall(serviceSoftwareOptions.getUpdateStatus(), UPDATESTATUS_BINDING);
            protocolMarshaller.marshall(serviceSoftwareOptions.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(serviceSoftwareOptions.getAutomatedUpdateDate(), AUTOMATEDUPDATEDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
