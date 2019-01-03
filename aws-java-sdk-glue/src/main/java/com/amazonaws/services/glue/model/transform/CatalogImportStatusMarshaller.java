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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CatalogImportStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CatalogImportStatusMarshaller {

    private static final MarshallingInfo<Boolean> IMPORTCOMPLETED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportCompleted").build();
    private static final MarshallingInfo<java.util.Date> IMPORTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IMPORTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedBy").build();

    private static final CatalogImportStatusMarshaller instance = new CatalogImportStatusMarshaller();

    public static CatalogImportStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CatalogImportStatus catalogImportStatus, ProtocolMarshaller protocolMarshaller) {

        if (catalogImportStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(catalogImportStatus.getImportCompleted(), IMPORTCOMPLETED_BINDING);
            protocolMarshaller.marshall(catalogImportStatus.getImportTime(), IMPORTTIME_BINDING);
            protocolMarshaller.marshall(catalogImportStatus.getImportedBy(), IMPORTEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
