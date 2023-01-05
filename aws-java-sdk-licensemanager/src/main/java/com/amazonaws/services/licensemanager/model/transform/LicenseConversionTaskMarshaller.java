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
package com.amazonaws.services.licensemanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LicenseConversionTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseConversionTaskMarshaller {

    private static final MarshallingInfo<String> LICENSECONVERSIONTASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseConversionTaskId").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<StructuredPojo> SOURCELICENSECONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLicenseContext").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONLICENSECONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationLicenseContext").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LICENSECONVERSIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseConversionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();

    private static final LicenseConversionTaskMarshaller instance = new LicenseConversionTaskMarshaller();

    public static LicenseConversionTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LicenseConversionTask licenseConversionTask, ProtocolMarshaller protocolMarshaller) {

        if (licenseConversionTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(licenseConversionTask.getLicenseConversionTaskId(), LICENSECONVERSIONTASKID_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getSourceLicenseContext(), SOURCELICENSECONTEXT_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getDestinationLicenseContext(), DESTINATIONLICENSECONTEXT_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getLicenseConversionTime(), LICENSECONVERSIONTIME_BINDING);
            protocolMarshaller.marshall(licenseConversionTask.getEndTime(), ENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
