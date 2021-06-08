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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsApiGatewayV2ApiDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsApiGatewayV2ApiDetailsMarshaller {

    private static final MarshallingInfo<String> APIENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiEndpoint").build();
    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiId").build();
    private static final MarshallingInfo<String> APIKEYSELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiKeySelectionExpression").build();
    private static final MarshallingInfo<String> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> PROTOCOLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtocolType").build();
    private static final MarshallingInfo<String> ROUTESELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteSelectionExpression").build();
    private static final MarshallingInfo<StructuredPojo> CORSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CorsConfiguration").build();

    private static final AwsApiGatewayV2ApiDetailsMarshaller instance = new AwsApiGatewayV2ApiDetailsMarshaller();

    public static AwsApiGatewayV2ApiDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsApiGatewayV2ApiDetails awsApiGatewayV2ApiDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsApiGatewayV2ApiDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getApiEndpoint(), APIENDPOINT_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getApiKeySelectionExpression(), APIKEYSELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getProtocolType(), PROTOCOLTYPE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getRouteSelectionExpression(), ROUTESELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2ApiDetails.getCorsConfiguration(), CORSCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
