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
 * DescribeLogStreamsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeLogStreamsRequestMarshaller {

    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupName").build();
    private static final MarshallingInfo<String> LOGSTREAMNAMEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logStreamNamePrefix").build();
    private static final MarshallingInfo<String> ORDERBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("orderBy").build();
    private static final MarshallingInfo<Boolean> DESCENDING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("descending").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("limit").build();

    private static final DescribeLogStreamsRequestMarshaller instance = new DescribeLogStreamsRequestMarshaller();

    public static DescribeLogStreamsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeLogStreamsRequest describeLogStreamsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeLogStreamsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeLogStreamsRequest.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(describeLogStreamsRequest.getLogStreamNamePrefix(), LOGSTREAMNAMEPREFIX_BINDING);
            protocolMarshaller.marshall(describeLogStreamsRequest.getOrderBy(), ORDERBY_BINDING);
            protocolMarshaller.marshall(describeLogStreamsRequest.getDescending(), DESCENDING_BINDING);
            protocolMarshaller.marshall(describeLogStreamsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeLogStreamsRequest.getLimit(), LIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
