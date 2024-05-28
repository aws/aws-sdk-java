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
package com.amazonaws.services.mailmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mailmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartArchiveExportRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartArchiveExportRequestMarshaller {

    private static final MarshallingInfo<String> ARCHIVEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ArchiveId").build();
    private static final MarshallingInfo<StructuredPojo> EXPORTDESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportDestinationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filters").build();
    private static final MarshallingInfo<java.util.Date> FROMTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<java.util.Date> TOTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ToTimestamp").timestampFormat("unixTimestamp").build();

    private static final StartArchiveExportRequestMarshaller instance = new StartArchiveExportRequestMarshaller();

    public static StartArchiveExportRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartArchiveExportRequest startArchiveExportRequest, ProtocolMarshaller protocolMarshaller) {

        if (startArchiveExportRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startArchiveExportRequest.getArchiveId(), ARCHIVEID_BINDING);
            protocolMarshaller.marshall(startArchiveExportRequest.getExportDestinationConfiguration(), EXPORTDESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(startArchiveExportRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(startArchiveExportRequest.getFromTimestamp(), FROMTIMESTAMP_BINDING);
            protocolMarshaller.marshall(startArchiveExportRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(startArchiveExportRequest.getToTimestamp(), TOTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
