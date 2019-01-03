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
 * TestInvokeAuthorizerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestInvokeAuthorizerRequestMarshaller {

    private static final MarshallingInfo<String> RESTAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("restapi_id").build();
    private static final MarshallingInfo<String> AUTHORIZERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("authorizer_id").build();
    private static final MarshallingInfo<Map> HEADERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("headers").build();
    private static final MarshallingInfo<Map> MULTIVALUEHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("multiValueHeaders").build();
    private static final MarshallingInfo<String> PATHWITHQUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pathWithQueryString").build();
    private static final MarshallingInfo<String> BODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("body").build();
    private static final MarshallingInfo<Map> STAGEVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageVariables").build();
    private static final MarshallingInfo<Map> ADDITIONALCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalContext").build();

    private static final TestInvokeAuthorizerRequestMarshaller instance = new TestInvokeAuthorizerRequestMarshaller();

    public static TestInvokeAuthorizerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest, ProtocolMarshaller protocolMarshaller) {

        if (testInvokeAuthorizerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getRestApiId(), RESTAPIID_BINDING);
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getAuthorizerId(), AUTHORIZERID_BINDING);
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getHeaders(), HEADERS_BINDING);
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getMultiValueHeaders(), MULTIVALUEHEADERS_BINDING);
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getPathWithQueryString(), PATHWITHQUERYSTRING_BINDING);
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getStageVariables(), STAGEVARIABLES_BINDING);
            protocolMarshaller.marshall(testInvokeAuthorizerRequest.getAdditionalContext(), ADDITIONALCONTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
