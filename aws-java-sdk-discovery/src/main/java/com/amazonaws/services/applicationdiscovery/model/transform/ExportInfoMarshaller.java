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
package com.amazonaws.services.applicationdiscovery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportInfoMarshaller {

    private static final MarshallingInfo<String> EXPORTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("exportId").build();
    private static final MarshallingInfo<String> EXPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exportStatus").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> CONFIGURATIONSDOWNLOADURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationsDownloadUrl").build();
    private static final MarshallingInfo<java.util.Date> EXPORTREQUESTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exportRequestTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> ISTRUNCATED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isTruncated").build();
    private static final MarshallingInfo<java.util.Date> REQUESTEDSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestedStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REQUESTEDENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestedEndTime").timestampFormat("unixTimestamp").build();

    private static final ExportInfoMarshaller instance = new ExportInfoMarshaller();

    public static ExportInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportInfo exportInfo, ProtocolMarshaller protocolMarshaller) {

        if (exportInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportInfo.getExportId(), EXPORTID_BINDING);
            protocolMarshaller.marshall(exportInfo.getExportStatus(), EXPORTSTATUS_BINDING);
            protocolMarshaller.marshall(exportInfo.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(exportInfo.getConfigurationsDownloadUrl(), CONFIGURATIONSDOWNLOADURL_BINDING);
            protocolMarshaller.marshall(exportInfo.getExportRequestTime(), EXPORTREQUESTTIME_BINDING);
            protocolMarshaller.marshall(exportInfo.getIsTruncated(), ISTRUNCATED_BINDING);
            protocolMarshaller.marshall(exportInfo.getRequestedStartTime(), REQUESTEDSTARTTIME_BINDING);
            protocolMarshaller.marshall(exportInfo.getRequestedEndTime(), REQUESTEDENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
