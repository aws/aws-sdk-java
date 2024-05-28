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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportMetadataModelAssessmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportMetadataModelAssessmentRequestMarshaller {

    private static final MarshallingInfo<String> MIGRATIONPROJECTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationProjectIdentifier").build();
    private static final MarshallingInfo<String> SELECTIONRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectionRules").build();
    private static final MarshallingInfo<String> FILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FileName").build();
    private static final MarshallingInfo<List> ASSESSMENTREPORTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssessmentReportTypes").build();

    private static final ExportMetadataModelAssessmentRequestMarshaller instance = new ExportMetadataModelAssessmentRequestMarshaller();

    public static ExportMetadataModelAssessmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportMetadataModelAssessmentRequest exportMetadataModelAssessmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (exportMetadataModelAssessmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportMetadataModelAssessmentRequest.getMigrationProjectIdentifier(), MIGRATIONPROJECTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(exportMetadataModelAssessmentRequest.getSelectionRules(), SELECTIONRULES_BINDING);
            protocolMarshaller.marshall(exportMetadataModelAssessmentRequest.getFileName(), FILENAME_BINDING);
            protocolMarshaller.marshall(exportMetadataModelAssessmentRequest.getAssessmentReportTypes(), ASSESSMENTREPORTTYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
