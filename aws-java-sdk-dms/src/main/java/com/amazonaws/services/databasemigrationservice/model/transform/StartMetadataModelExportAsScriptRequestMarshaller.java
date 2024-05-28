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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartMetadataModelExportAsScriptRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMetadataModelExportAsScriptRequestMarshaller {

    private static final MarshallingInfo<String> MIGRATIONPROJECTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationProjectIdentifier").build();
    private static final MarshallingInfo<String> SELECTIONRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectionRules").build();
    private static final MarshallingInfo<String> ORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Origin").build();
    private static final MarshallingInfo<String> FILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FileName").build();

    private static final StartMetadataModelExportAsScriptRequestMarshaller instance = new StartMetadataModelExportAsScriptRequestMarshaller();

    public static StartMetadataModelExportAsScriptRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMetadataModelExportAsScriptRequest startMetadataModelExportAsScriptRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMetadataModelExportAsScriptRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMetadataModelExportAsScriptRequest.getMigrationProjectIdentifier(), MIGRATIONPROJECTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(startMetadataModelExportAsScriptRequest.getSelectionRules(), SELECTIONRULES_BINDING);
            protocolMarshaller.marshall(startMetadataModelExportAsScriptRequest.getOrigin(), ORIGIN_BINDING);
            protocolMarshaller.marshall(startMetadataModelExportAsScriptRequest.getFileName(), FILENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
