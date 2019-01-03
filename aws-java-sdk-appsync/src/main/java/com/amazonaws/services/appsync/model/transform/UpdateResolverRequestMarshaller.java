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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateResolverRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateResolverRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> TYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("typeName").build();
    private static final MarshallingInfo<String> FIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("fieldName").build();
    private static final MarshallingInfo<String> DATASOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSourceName").build();
    private static final MarshallingInfo<String> REQUESTMAPPINGTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestMappingTemplate").build();
    private static final MarshallingInfo<String> RESPONSEMAPPINGTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseMappingTemplate").build();
    private static final MarshallingInfo<String> KIND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kind").build();
    private static final MarshallingInfo<StructuredPojo> PIPELINECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineConfig").build();

    private static final UpdateResolverRequestMarshaller instance = new UpdateResolverRequestMarshaller();

    public static UpdateResolverRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateResolverRequest updateResolverRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateResolverRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateResolverRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(updateResolverRequest.getTypeName(), TYPENAME_BINDING);
            protocolMarshaller.marshall(updateResolverRequest.getFieldName(), FIELDNAME_BINDING);
            protocolMarshaller.marshall(updateResolverRequest.getDataSourceName(), DATASOURCENAME_BINDING);
            protocolMarshaller.marshall(updateResolverRequest.getRequestMappingTemplate(), REQUESTMAPPINGTEMPLATE_BINDING);
            protocolMarshaller.marshall(updateResolverRequest.getResponseMappingTemplate(), RESPONSEMAPPINGTEMPLATE_BINDING);
            protocolMarshaller.marshall(updateResolverRequest.getKind(), KIND_BINDING);
            protocolMarshaller.marshall(updateResolverRequest.getPipelineConfig(), PIPELINECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
