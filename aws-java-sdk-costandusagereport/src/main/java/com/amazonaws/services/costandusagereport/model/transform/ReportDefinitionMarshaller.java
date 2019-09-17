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
package com.amazonaws.services.costandusagereport.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costandusagereport.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportDefinitionMarshaller {

    private static final MarshallingInfo<String> REPORTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportName").build();
    private static final MarshallingInfo<String> TIMEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TimeUnit").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<String> COMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compression").build();
    private static final MarshallingInfo<List> ADDITIONALSCHEMAELEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalSchemaElements").build();
    private static final MarshallingInfo<String> S3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Bucket").build();
    private static final MarshallingInfo<String> S3PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Prefix").build();
    private static final MarshallingInfo<String> S3REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Region").build();
    private static final MarshallingInfo<List> ADDITIONALARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalArtifacts").build();
    private static final MarshallingInfo<Boolean> REFRESHCLOSEDREPORTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshClosedReports").build();
    private static final MarshallingInfo<String> REPORTVERSIONING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportVersioning").build();

    private static final ReportDefinitionMarshaller instance = new ReportDefinitionMarshaller();

    public static ReportDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportDefinition reportDefinition, ProtocolMarshaller protocolMarshaller) {

        if (reportDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportDefinition.getReportName(), REPORTNAME_BINDING);
            protocolMarshaller.marshall(reportDefinition.getTimeUnit(), TIMEUNIT_BINDING);
            protocolMarshaller.marshall(reportDefinition.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(reportDefinition.getCompression(), COMPRESSION_BINDING);
            protocolMarshaller.marshall(reportDefinition.getAdditionalSchemaElements(), ADDITIONALSCHEMAELEMENTS_BINDING);
            protocolMarshaller.marshall(reportDefinition.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(reportDefinition.getS3Prefix(), S3PREFIX_BINDING);
            protocolMarshaller.marshall(reportDefinition.getS3Region(), S3REGION_BINDING);
            protocolMarshaller.marshall(reportDefinition.getAdditionalArtifacts(), ADDITIONALARTIFACTS_BINDING);
            protocolMarshaller.marshall(reportDefinition.getRefreshClosedReports(), REFRESHCLOSEDREPORTS_BINDING);
            protocolMarshaller.marshall(reportDefinition.getReportVersioning(), REPORTVERSIONING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
