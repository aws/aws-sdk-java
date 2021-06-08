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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSchemaVersionsDiffRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSchemaVersionsDiffRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCHEMAID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaId").build();
    private static final MarshallingInfo<StructuredPojo> FIRSTSCHEMAVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirstSchemaVersionNumber").build();
    private static final MarshallingInfo<StructuredPojo> SECONDSCHEMAVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondSchemaVersionNumber").build();
    private static final MarshallingInfo<String> SCHEMADIFFTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaDiffType").build();

    private static final GetSchemaVersionsDiffRequestMarshaller instance = new GetSchemaVersionsDiffRequestMarshaller();

    public static GetSchemaVersionsDiffRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSchemaVersionsDiffRequest getSchemaVersionsDiffRequest, ProtocolMarshaller protocolMarshaller) {

        if (getSchemaVersionsDiffRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSchemaVersionsDiffRequest.getSchemaId(), SCHEMAID_BINDING);
            protocolMarshaller.marshall(getSchemaVersionsDiffRequest.getFirstSchemaVersionNumber(), FIRSTSCHEMAVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(getSchemaVersionsDiffRequest.getSecondSchemaVersionNumber(), SECONDSCHEMAVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(getSchemaVersionsDiffRequest.getSchemaDiffType(), SCHEMADIFFTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
