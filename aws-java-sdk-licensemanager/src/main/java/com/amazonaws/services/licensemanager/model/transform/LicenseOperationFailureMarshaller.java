/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LicenseOperationFailureMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseOperationFailureMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<java.util.Date> FAILURETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> OPERATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationName").build();
    private static final MarshallingInfo<String> RESOURCEOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceOwnerId").build();
    private static final MarshallingInfo<String> OPERATIONREQUESTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationRequestedBy").build();
    private static final MarshallingInfo<List> METADATALIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetadataList").build();

    private static final LicenseOperationFailureMarshaller instance = new LicenseOperationFailureMarshaller();

    public static LicenseOperationFailureMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LicenseOperationFailure licenseOperationFailure, ProtocolMarshaller protocolMarshaller) {

        if (licenseOperationFailure == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(licenseOperationFailure.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(licenseOperationFailure.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(licenseOperationFailure.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(licenseOperationFailure.getFailureTime(), FAILURETIME_BINDING);
            protocolMarshaller.marshall(licenseOperationFailure.getOperationName(), OPERATIONNAME_BINDING);
            protocolMarshaller.marshall(licenseOperationFailure.getResourceOwnerId(), RESOURCEOWNERID_BINDING);
            protocolMarshaller.marshall(licenseOperationFailure.getOperationRequestedBy(), OPERATIONREQUESTEDBY_BINDING);
            protocolMarshaller.marshall(licenseOperationFailure.getMetadataList(), METADATALIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
