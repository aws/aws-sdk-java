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
package com.amazonaws.services.qldb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qldb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportJournalToS3RequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportJournalToS3RequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<java.util.Date> INCLUSIVESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusiveStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXCLUSIVEENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusiveEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> S3EXPORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ExportConfiguration").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();

    private static final ExportJournalToS3RequestMarshaller instance = new ExportJournalToS3RequestMarshaller();

    public static ExportJournalToS3RequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportJournalToS3Request exportJournalToS3Request, ProtocolMarshaller protocolMarshaller) {

        if (exportJournalToS3Request == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportJournalToS3Request.getName(), NAME_BINDING);
            protocolMarshaller.marshall(exportJournalToS3Request.getInclusiveStartTime(), INCLUSIVESTARTTIME_BINDING);
            protocolMarshaller.marshall(exportJournalToS3Request.getExclusiveEndTime(), EXCLUSIVEENDTIME_BINDING);
            protocolMarshaller.marshall(exportJournalToS3Request.getS3ExportConfiguration(), S3EXPORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(exportJournalToS3Request.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
