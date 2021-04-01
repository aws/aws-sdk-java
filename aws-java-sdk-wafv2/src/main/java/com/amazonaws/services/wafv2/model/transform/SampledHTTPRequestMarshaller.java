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
package com.amazonaws.services.wafv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SampledHTTPRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SampledHTTPRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> REQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Request").build();
    private static final MarshallingInfo<Long> WEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Weight").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> RULENAMEWITHINRULEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleNameWithinRuleGroup").build();
    private static final MarshallingInfo<List> REQUESTHEADERSINSERTED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestHeadersInserted").build();
    private static final MarshallingInfo<Integer> RESPONSECODESENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseCodeSent").build();
    private static final MarshallingInfo<List> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Labels").build();

    private static final SampledHTTPRequestMarshaller instance = new SampledHTTPRequestMarshaller();

    public static SampledHTTPRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SampledHTTPRequest sampledHTTPRequest, ProtocolMarshaller protocolMarshaller) {

        if (sampledHTTPRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sampledHTTPRequest.getRequest(), REQUEST_BINDING);
            protocolMarshaller.marshall(sampledHTTPRequest.getWeight(), WEIGHT_BINDING);
            protocolMarshaller.marshall(sampledHTTPRequest.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(sampledHTTPRequest.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(sampledHTTPRequest.getRuleNameWithinRuleGroup(), RULENAMEWITHINRULEGROUP_BINDING);
            protocolMarshaller.marshall(sampledHTTPRequest.getRequestHeadersInserted(), REQUESTHEADERSINSERTED_BINDING);
            protocolMarshaller.marshall(sampledHTTPRequest.getResponseCodeSent(), RESPONSECODESENT_BINDING);
            protocolMarshaller.marshall(sampledHTTPRequest.getLabels(), LABELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
