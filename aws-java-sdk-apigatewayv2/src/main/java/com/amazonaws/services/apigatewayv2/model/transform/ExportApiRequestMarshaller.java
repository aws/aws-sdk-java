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
package com.amazonaws.services.apigatewayv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportApiRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportApiRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> EXPORTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("exportVersion").build();
    private static final MarshallingInfo<Boolean> INCLUDEEXTENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("includeExtensions").build();
    private static final MarshallingInfo<String> OUTPUTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("outputType").build();
    private static final MarshallingInfo<String> SPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("specification").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("stageName").build();

    private static final ExportApiRequestMarshaller instance = new ExportApiRequestMarshaller();

    public static ExportApiRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportApiRequest exportApiRequest, ProtocolMarshaller protocolMarshaller) {

        if (exportApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportApiRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(exportApiRequest.getExportVersion(), EXPORTVERSION_BINDING);
            protocolMarshaller.marshall(exportApiRequest.getIncludeExtensions(), INCLUDEEXTENSIONS_BINDING);
            protocolMarshaller.marshall(exportApiRequest.getOutputType(), OUTPUTTYPE_BINDING);
            protocolMarshaller.marshall(exportApiRequest.getSpecification(), SPECIFICATION_BINDING);
            protocolMarshaller.marshall(exportApiRequest.getStageName(), STAGENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
