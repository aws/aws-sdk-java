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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataRepositoryConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataRepositoryConfigurationMarshaller {

    private static final MarshallingInfo<String> IMPORTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportPath").build();
    private static final MarshallingInfo<String> EXPORTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportPath").build();
    private static final MarshallingInfo<Integer> IMPORTEDFILECHUNKSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedFileChunkSize").build();

    private static final DataRepositoryConfigurationMarshaller instance = new DataRepositoryConfigurationMarshaller();

    public static DataRepositoryConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataRepositoryConfiguration dataRepositoryConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (dataRepositoryConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataRepositoryConfiguration.getImportPath(), IMPORTPATH_BINDING);
            protocolMarshaller.marshall(dataRepositoryConfiguration.getExportPath(), EXPORTPATH_BINDING);
            protocolMarshaller.marshall(dataRepositoryConfiguration.getImportedFileChunkSize(), IMPORTEDFILECHUNKSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
