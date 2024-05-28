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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateGraphqlApiRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateGraphqlApiRequestMarshaller {

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
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> ADDITIONALAUTHENTICATIONPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalAuthenticationProviders").build();
    private static final MarshallingInfo<Boolean> XRAYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xrayEnabled").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAAUTHORIZERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaAuthorizerConfig").build();
    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("visibility").build();
    private static final MarshallingInfo<String> APITYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apiType").build();
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

    private static final CreateGraphqlApiRequestMarshaller instance = new CreateGraphqlApiRequestMarshaller();

    public static CreateGraphqlApiRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateGraphqlApiRequest createGraphqlApiRequest, ProtocolMarshaller protocolMarshaller) {

        if (createGraphqlApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createGraphqlApiRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getLogConfig(), LOGCONFIG_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getUserPoolConfig(), USERPOOLCONFIG_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getOpenIDConnectConfig(), OPENIDCONNECTCONFIG_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getAdditionalAuthenticationProviders(), ADDITIONALAUTHENTICATIONPROVIDERS_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getXrayEnabled(), XRAYENABLED_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getLambdaAuthorizerConfig(), LAMBDAAUTHORIZERCONFIG_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getApiType(), APITYPE_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getMergedApiExecutionRoleArn(), MERGEDAPIEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getOwnerContact(), OWNERCONTACT_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getIntrospectionConfig(), INTROSPECTIONCONFIG_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getQueryDepthLimit(), QUERYDEPTHLIMIT_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getResolverCountLimit(), RESOLVERCOUNTLIMIT_BINDING);
            protocolMarshaller.marshall(createGraphqlApiRequest.getEnhancedMetricsConfig(), ENHANCEDMETRICSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
