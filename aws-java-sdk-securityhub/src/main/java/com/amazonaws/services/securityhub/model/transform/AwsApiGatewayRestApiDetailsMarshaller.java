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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsApiGatewayRestApiDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsApiGatewayRestApiDetailsMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<List> BINARYMEDIATYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinaryMediaTypes").build();
    private static final MarshallingInfo<Integer> MINIMUMCOMPRESSIONSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumCompressionSize").build();
    private static final MarshallingInfo<String> APIKEYSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiKeySource").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointConfiguration").build();

    private static final AwsApiGatewayRestApiDetailsMarshaller instance = new AwsApiGatewayRestApiDetailsMarshaller();

    public static AwsApiGatewayRestApiDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsApiGatewayRestApiDetails awsApiGatewayRestApiDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsApiGatewayRestApiDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getBinaryMediaTypes(), BINARYMEDIATYPES_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getMinimumCompressionSize(), MINIMUMCOMPRESSIONSIZE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getApiKeySource(), APIKEYSOURCE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayRestApiDetails.getEndpointConfiguration(), ENDPOINTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
