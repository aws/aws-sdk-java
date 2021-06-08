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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PackageDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PackageDetailsMarshaller {

    private static final MarshallingInfo<String> PACKAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PackageID").build();
    private static final MarshallingInfo<String> PACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageName").build();
    private static final MarshallingInfo<String> PACKAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageType").build();
    private static final MarshallingInfo<String> PACKAGEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageDescription").build();
    private static final MarshallingInfo<String> PACKAGESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> AVAILABLEPACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailablePackageVersion").build();
    private static final MarshallingInfo<StructuredPojo> ERRORDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorDetails").build();

    private static final PackageDetailsMarshaller instance = new PackageDetailsMarshaller();

    public static PackageDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PackageDetails packageDetails, ProtocolMarshaller protocolMarshaller) {

        if (packageDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(packageDetails.getPackageID(), PACKAGEID_BINDING);
            protocolMarshaller.marshall(packageDetails.getPackageName(), PACKAGENAME_BINDING);
            protocolMarshaller.marshall(packageDetails.getPackageType(), PACKAGETYPE_BINDING);
            protocolMarshaller.marshall(packageDetails.getPackageDescription(), PACKAGEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(packageDetails.getPackageStatus(), PACKAGESTATUS_BINDING);
            protocolMarshaller.marshall(packageDetails.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(packageDetails.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(packageDetails.getAvailablePackageVersion(), AVAILABLEPACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(packageDetails.getErrorDetails(), ERRORDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
