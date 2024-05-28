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
 * GraphqlApiMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GraphqlApiMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationType").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logConfig").build();
    private static final MarshallingInfo<StructuredPojo> USERPOOLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userPoolConfig").build();
    private static final MarshallingInfo<StructuredPojo> OPENIDCONNECTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIDConnectConfig").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<Map> URIS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uris").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> ADDITIONALAUTHENTICATIONPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalAuthenticationProviders").build();
    private static final MarshallingInfo<Boolean> XRAYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xrayEnabled").build();
    private static final MarshallingInfo<String> WAFWEBACLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("wafWebAclArn").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAAUTHORIZERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaAuthorizerConfig").build();
    private static final MarshallingInfo<Map> DNS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dns").build();
    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("visibility").build();
    private static final MarshallingInfo<String> APITYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apiType").build();
    private static final MarshallingInfo<String> MERGEDAPIEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergedApiExecutionRoleArn").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("owner").build();
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

    private static final GraphqlApiMarshaller instance = new GraphqlApiMarshaller();

    public static GraphqlApiMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GraphqlApi graphqlApi, ProtocolMarshaller protocolMarshaller) {

        if (graphqlApi == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(graphqlApi.getName(), NAME_BINDING);
            protocolMarshaller.marshall(graphqlApi.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(graphqlApi.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(graphqlApi.getLogConfig(), LOGCONFIG_BINDING);
            protocolMarshaller.marshall(graphqlApi.getUserPoolConfig(), USERPOOLCONFIG_BINDING);
            protocolMarshaller.marshall(graphqlApi.getOpenIDConnectConfig(), OPENIDCONNECTCONFIG_BINDING);
            protocolMarshaller.marshall(graphqlApi.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(graphqlApi.getUris(), URIS_BINDING);
            protocolMarshaller.marshall(graphqlApi.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(graphqlApi.getAdditionalAuthenticationProviders(), ADDITIONALAUTHENTICATIONPROVIDERS_BINDING);
            protocolMarshaller.marshall(graphqlApi.getXrayEnabled(), XRAYENABLED_BINDING);
            protocolMarshaller.marshall(graphqlApi.getWafWebAclArn(), WAFWEBACLARN_BINDING);
            protocolMarshaller.marshall(graphqlApi.getLambdaAuthorizerConfig(), LAMBDAAUTHORIZERCONFIG_BINDING);
            protocolMarshaller.marshall(graphqlApi.getDns(), DNS_BINDING);
            protocolMarshaller.marshall(graphqlApi.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(graphqlApi.getApiType(), APITYPE_BINDING);
            protocolMarshaller.marshall(graphqlApi.getMergedApiExecutionRoleArn(), MERGEDAPIEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(graphqlApi.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(graphqlApi.getOwnerContact(), OWNERCONTACT_BINDING);
            protocolMarshaller.marshall(graphqlApi.getIntrospectionConfig(), INTROSPECTIONCONFIG_BINDING);
            protocolMarshaller.marshall(graphqlApi.getQueryDepthLimit(), QUERYDEPTHLIMIT_BINDING);
            protocolMarshaller.marshall(graphqlApi.getResolverCountLimit(), RESOLVERCOUNTLIMIT_BINDING);
            protocolMarshaller.marshall(graphqlApi.getEnhancedMetricsConfig(), ENHANCEDMETRICSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
