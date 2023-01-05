/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubrefactorspaces.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubrefactorspaces.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateServiceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateServiceRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ApplicationIdentifier").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ENDPOINTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointType").build();
    private static final MarshallingInfo<String> ENVIRONMENTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("EnvironmentIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaEndpoint").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> URLENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UrlEndpoint").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();

    private static final CreateServiceRequestMarshaller instance = new CreateServiceRequestMarshaller();

    public static CreateServiceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateServiceRequest createServiceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createServiceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createServiceRequest.getApplicationIdentifier(), APPLICATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getEndpointType(), ENDPOINTTYPE_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getEnvironmentIdentifier(), ENVIRONMENTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getLambdaEndpoint(), LAMBDAENDPOINT_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getUrlEndpoint(), URLENDPOINT_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
