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
package com.amazonaws.services.apigateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateIntegrationResponseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateIntegrationResponseRequestMarshaller {

    private static final MarshallingInfo<String> RESTAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("restapi_id").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("resource_id").build();
    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("http_method").build();
    private static final MarshallingInfo<String> STATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("status_code").build();
    private static final MarshallingInfo<List> PATCHOPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("patchOperations").build();

    private static final UpdateIntegrationResponseRequestMarshaller instance = new UpdateIntegrationResponseRequestMarshaller();

    public static UpdateIntegrationResponseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateIntegrationResponseRequest updateIntegrationResponseRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateIntegrationResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateIntegrationResponseRequest.getRestApiId(), RESTAPIID_BINDING);
            protocolMarshaller.marshall(updateIntegrationResponseRequest.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(updateIntegrationResponseRequest.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(updateIntegrationResponseRequest.getStatusCode(), STATUSCODE_BINDING);
            protocolMarshaller.marshall(updateIntegrationResponseRequest.getPatchOperations(), PATCHOPERATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
