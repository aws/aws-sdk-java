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
package com.amazonaws.services.logs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeMetricFiltersRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeMetricFiltersRequestMarshaller {

    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupName").build();
    private static final MarshallingInfo<String> FILTERNAMEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterNamePrefix").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricName").build();
    private static final MarshallingInfo<String> METRICNAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricNamespace").build();

    private static final DescribeMetricFiltersRequestMarshaller instance = new DescribeMetricFiltersRequestMarshaller();

    public static DescribeMetricFiltersRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeMetricFiltersRequest describeMetricFiltersRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeMetricFiltersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeMetricFiltersRequest.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(describeMetricFiltersRequest.getFilterNamePrefix(), FILTERNAMEPREFIX_BINDING);
            protocolMarshaller.marshall(describeMetricFiltersRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeMetricFiltersRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(describeMetricFiltersRequest.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(describeMetricFiltersRequest.getMetricNamespace(), METRICNAMESPACE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
