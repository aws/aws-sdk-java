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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateStageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateStageRequestMarshaller {

    private static final MarshallingInfo<String> RESTAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("restapi_id").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageName").build();
    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> CACHECLUSTERENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheClusterEnabled").build();
    private static final MarshallingInfo<String> CACHECLUSTERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheClusterSize").build();
    private static final MarshallingInfo<Map> VARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("variables").build();
    private static final MarshallingInfo<String> DOCUMENTATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("documentationVersion").build();
    private static final MarshallingInfo<StructuredPojo> CANARYSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canarySettings").build();
    private static final MarshallingInfo<Boolean> TRACINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tracingEnabled").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateStageRequestMarshaller instance = new CreateStageRequestMarshaller();

    public static CreateStageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateStageRequest createStageRequest, ProtocolMarshaller protocolMarshaller) {

        if (createStageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createStageRequest.getRestApiId(), RESTAPIID_BINDING);
            protocolMarshaller.marshall(createStageRequest.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(createStageRequest.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(createStageRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createStageRequest.getCacheClusterEnabled(), CACHECLUSTERENABLED_BINDING);
            protocolMarshaller.marshall(createStageRequest.getCacheClusterSize(), CACHECLUSTERSIZE_BINDING);
            protocolMarshaller.marshall(createStageRequest.getVariables(), VARIABLES_BINDING);
            protocolMarshaller.marshall(createStageRequest.getDocumentationVersion(), DOCUMENTATIONVERSION_BINDING);
            protocolMarshaller.marshall(createStageRequest.getCanarySettings(), CANARYSETTINGS_BINDING);
            protocolMarshaller.marshall(createStageRequest.getTracingEnabled(), TRACINGENABLED_BINDING);
            protocolMarshaller.marshall(createStageRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
