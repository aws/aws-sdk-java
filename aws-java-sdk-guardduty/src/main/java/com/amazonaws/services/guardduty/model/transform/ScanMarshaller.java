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
 * ScanMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScanMarshaller {

    private static final MarshallingInfo<String> DETECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorId").build();
    private static final MarshallingInfo<String> ADMINDETECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminDetectorId").build();
    private static final MarshallingInfo<String> SCANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanId").build();
    private static final MarshallingInfo<String> SCANSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanStatus").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReason").build();
    private static final MarshallingInfo<java.util.Date> SCANSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> SCANENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> TRIGGERDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("triggerDetails").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceDetails").build();
    private static final MarshallingInfo<StructuredPojo> SCANRESULTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanResultDetails").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<Long> TOTALBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("totalBytes").build();
    private static final MarshallingInfo<Long> FILECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fileCount").build();
    private static final MarshallingInfo<List> ATTACHEDVOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachedVolumes").build();

    private static final ScanMarshaller instance = new ScanMarshaller();

    public static ScanMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Scan scan, ProtocolMarshaller protocolMarshaller) {

        if (scan == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scan.getDetectorId(), DETECTORID_BINDING);
            protocolMarshaller.marshall(scan.getAdminDetectorId(), ADMINDETECTORID_BINDING);
            protocolMarshaller.marshall(scan.getScanId(), SCANID_BINDING);
            protocolMarshaller.marshall(scan.getScanStatus(), SCANSTATUS_BINDING);
            protocolMarshaller.marshall(scan.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(scan.getScanStartTime(), SCANSTARTTIME_BINDING);
            protocolMarshaller.marshall(scan.getScanEndTime(), SCANENDTIME_BINDING);
            protocolMarshaller.marshall(scan.getTriggerDetails(), TRIGGERDETAILS_BINDING);
            protocolMarshaller.marshall(scan.getResourceDetails(), RESOURCEDETAILS_BINDING);
            protocolMarshaller.marshall(scan.getScanResultDetails(), SCANRESULTDETAILS_BINDING);
            protocolMarshaller.marshall(scan.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(scan.getTotalBytes(), TOTALBYTES_BINDING);
            protocolMarshaller.marshall(scan.getFileCount(), FILECOUNT_BINDING);
            protocolMarshaller.marshall(scan.getAttachedVolumes(), ATTACHEDVOLUMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
