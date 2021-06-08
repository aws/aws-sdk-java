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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportSummaryMarshaller {

    private static final MarshallingInfo<String> IMPORTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("importId").build();
    private static final MarshallingInfo<String> IMPORTEDRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importedResourceId").build();
    private static final MarshallingInfo<String> IMPORTEDRESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importedResourceName").build();
    private static final MarshallingInfo<String> IMPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importStatus").build();
    private static final MarshallingInfo<String> MERGESTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergeStrategy").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final ImportSummaryMarshaller instance = new ImportSummaryMarshaller();

    public static ImportSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportSummary importSummary, ProtocolMarshaller protocolMarshaller) {

        if (importSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importSummary.getImportId(), IMPORTID_BINDING);
            protocolMarshaller.marshall(importSummary.getImportedResourceId(), IMPORTEDRESOURCEID_BINDING);
            protocolMarshaller.marshall(importSummary.getImportedResourceName(), IMPORTEDRESOURCENAME_BINDING);
            protocolMarshaller.marshall(importSummary.getImportStatus(), IMPORTSTATUS_BINDING);
            protocolMarshaller.marshall(importSummary.getMergeStrategy(), MERGESTRATEGY_BINDING);
            protocolMarshaller.marshall(importSummary.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(importSummary.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
