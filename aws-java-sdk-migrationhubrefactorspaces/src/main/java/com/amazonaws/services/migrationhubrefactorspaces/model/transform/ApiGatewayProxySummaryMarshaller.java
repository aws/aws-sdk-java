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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubrefactorspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApiGatewayProxySummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApiGatewayProxySummaryMarshaller {

    private static final MarshallingInfo<String> APIGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiGatewayId").build();
    private static final MarshallingInfo<String> ENDPOINTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointType").build();
    private static final MarshallingInfo<String> NLBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NlbArn").build();
    private static final MarshallingInfo<String> NLBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NlbName").build();
    private static final MarshallingInfo<String> PROXYURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProxyUrl").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageName").build();
    private static final MarshallingInfo<String> VPCLINKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcLinkId").build();

    private static final ApiGatewayProxySummaryMarshaller instance = new ApiGatewayProxySummaryMarshaller();

    public static ApiGatewayProxySummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApiGatewayProxySummary apiGatewayProxySummary, ProtocolMarshaller protocolMarshaller) {

        if (apiGatewayProxySummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(apiGatewayProxySummary.getApiGatewayId(), APIGATEWAYID_BINDING);
            protocolMarshaller.marshall(apiGatewayProxySummary.getEndpointType(), ENDPOINTTYPE_BINDING);
            protocolMarshaller.marshall(apiGatewayProxySummary.getNlbArn(), NLBARN_BINDING);
            protocolMarshaller.marshall(apiGatewayProxySummary.getNlbName(), NLBNAME_BINDING);
            protocolMarshaller.marshall(apiGatewayProxySummary.getProxyUrl(), PROXYURL_BINDING);
            protocolMarshaller.marshall(apiGatewayProxySummary.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(apiGatewayProxySummary.getVpcLinkId(), VPCLINKID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
