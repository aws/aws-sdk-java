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
 * DomainPackageDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainPackageDetailsMarshaller {

    private static final MarshallingInfo<String> PACKAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PackageID").build();
    private static final MarshallingInfo<String> PACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageName").build();
    private static final MarshallingInfo<String> PACKAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageType").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> DOMAINPACKAGESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainPackageStatus").build();
    private static final MarshallingInfo<String> PACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageVersion").build();
    private static final MarshallingInfo<String> REFERENCEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferencePath").build();
    private static final MarshallingInfo<StructuredPojo> ERRORDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorDetails").build();

    private static final DomainPackageDetailsMarshaller instance = new DomainPackageDetailsMarshaller();

    public static DomainPackageDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainPackageDetails domainPackageDetails, ProtocolMarshaller protocolMarshaller) {

        if (domainPackageDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainPackageDetails.getPackageID(), PACKAGEID_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getPackageName(), PACKAGENAME_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getPackageType(), PACKAGETYPE_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getDomainPackageStatus(), DOMAINPACKAGESTATUS_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getPackageVersion(), PACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getReferencePath(), REFERENCEPATH_BINDING);
            protocolMarshaller.marshall(domainPackageDetails.getErrorDetails(), ERRORDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
