/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateGraphqlApiRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateGraphqlApiRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logConfig").build();
    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationType").build();
    private static final MarshallingInfo<StructuredPojo> USERPOOLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userPoolConfig").build();
    private static final MarshallingInfo<StructuredPojo> OPENIDCONNECTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIDConnectConfig").build();
    private static final MarshallingInfo<List> ADDITIONALAUTHENTICATIONPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalAuthenticationProviders").build();
    private static final MarshallingInfo<Boolean> XRAYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xrayEnabled").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAAUTHORIZERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaAuthorizerConfig").build();
    private static final MarshallingInfo<String> MERGEDAPIEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergedApiExecutionRoleArn").build();
    private static final MarshallingInfo<String> OWNERCONTACT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerContact").build();
    private static final MarshallingInfo<String> INTROSPECTIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("introspectionConfig").build();
    private static final MarshallingInfo<Integer> QUERYDEPTHLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryDepthLimit").build();
    private static final MarshallingInfo<Integer> RESOLVERCOUNTLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolverCountLimit").build();
    private static final MarshallingInfo<StructuredPojo> ENHANCEDMETRICSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedMetricsConfig").build();

    private static final UpdateGraphqlApiRequestMarshaller instance = new UpdateGraphqlApiRequestMarshaller();

    public static UpdateGraphqlApiRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateGraphqlApiRequest updateGraphqlApiRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateGraphqlApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateGraphqlApiRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getLogConfig(), LOGCONFIG_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getUserPoolConfig(), USERPOOLCONFIG_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getOpenIDConnectConfig(), OPENIDCONNECTCONFIG_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getAdditionalAuthenticationProviders(), ADDITIONALAUTHENTICATIONPROVIDERS_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getXrayEnabled(), XRAYENABLED_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getLambdaAuthorizerConfig(), LAMBDAAUTHORIZERCONFIG_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getMergedApiExecutionRoleArn(), MERGEDAPIEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getOwnerContact(), OWNERCONTACT_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getIntrospectionConfig(), INTROSPECTIONCONFIG_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getQueryDepthLimit(), QUERYDEPTHLIMIT_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getResolverCountLimit(), RESOLVERCOUNTLIMIT_BINDING);
            protocolMarshaller.marshall(updateGraphqlApiRequest.getEnhancedMetricsConfig(), ENHANCEDMETRICSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
