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
package com.amazonaws.services.dataexchange.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportRevisionsToS3ResponseDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportRevisionsToS3ResponseDetailsMarshaller {

    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encryption").build();
    private static final MarshallingInfo<List> REVISIONDESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionDestinations").build();

    private static final ExportRevisionsToS3ResponseDetailsMarshaller instance = new ExportRevisionsToS3ResponseDetailsMarshaller();

    public static ExportRevisionsToS3ResponseDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportRevisionsToS3ResponseDetails exportRevisionsToS3ResponseDetails, ProtocolMarshaller protocolMarshaller) {

        if (exportRevisionsToS3ResponseDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportRevisionsToS3ResponseDetails.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(exportRevisionsToS3ResponseDetails.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(exportRevisionsToS3ResponseDetails.getRevisionDestinations(), REVISIONDESTINATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
