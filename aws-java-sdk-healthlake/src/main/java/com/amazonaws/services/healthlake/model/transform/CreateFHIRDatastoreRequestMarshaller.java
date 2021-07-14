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
package com.amazonaws.services.healthlake.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.healthlake.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFHIRDatastoreRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFHIRDatastoreRequestMarshaller {

    private static final MarshallingInfo<String> DATASTORENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatastoreName").build();
    private static final MarshallingInfo<String> DATASTORETYPEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatastoreTypeVersion").build();
    private static final MarshallingInfo<StructuredPojo> SSECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SseConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> PRELOADDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreloadDataConfig").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateFHIRDatastoreRequestMarshaller instance = new CreateFHIRDatastoreRequestMarshaller();

    public static CreateFHIRDatastoreRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFHIRDatastoreRequest createFHIRDatastoreRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFHIRDatastoreRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFHIRDatastoreRequest.getDatastoreName(), DATASTORENAME_BINDING);
            protocolMarshaller.marshall(createFHIRDatastoreRequest.getDatastoreTypeVersion(), DATASTORETYPEVERSION_BINDING);
            protocolMarshaller.marshall(createFHIRDatastoreRequest.getSseConfiguration(), SSECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createFHIRDatastoreRequest.getPreloadDataConfig(), PRELOADDATACONFIG_BINDING);
            protocolMarshaller.marshall(createFHIRDatastoreRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createFHIRDatastoreRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
