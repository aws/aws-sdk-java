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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EbsVolumeScanDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EbsVolumeScanDetailsMarshaller {

    private static final MarshallingInfo<String> SCANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanId").build();
    private static final MarshallingInfo<java.util.Date> SCANSTARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanStartedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> SCANCOMPLETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanCompletedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TRIGGERFINDINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("triggerFindingId").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sources").build();
    private static final MarshallingInfo<StructuredPojo> SCANDETECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanDetections").build();

    private static final EbsVolumeScanDetailsMarshaller instance = new EbsVolumeScanDetailsMarshaller();

    public static EbsVolumeScanDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EbsVolumeScanDetails ebsVolumeScanDetails, ProtocolMarshaller protocolMarshaller) {

        if (ebsVolumeScanDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ebsVolumeScanDetails.getScanId(), SCANID_BINDING);
            protocolMarshaller.marshall(ebsVolumeScanDetails.getScanStartedAt(), SCANSTARTEDAT_BINDING);
            protocolMarshaller.marshall(ebsVolumeScanDetails.getScanCompletedAt(), SCANCOMPLETEDAT_BINDING);
            protocolMarshaller.marshall(ebsVolumeScanDetails.getTriggerFindingId(), TRIGGERFINDINGID_BINDING);
            protocolMarshaller.marshall(ebsVolumeScanDetails.getSources(), SOURCES_BINDING);
            protocolMarshaller.marshall(ebsVolumeScanDetails.getScanDetections(), SCANDETECTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
