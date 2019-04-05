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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountLimitMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountLimitMarshaller {

    private static final MarshallingInfo<Long> TOTALCODESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TotalCodeSize").build();
    private static final MarshallingInfo<Long> CODESIZEUNZIPPED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeSizeUnzipped").build();
    private static final MarshallingInfo<Long> CODESIZEZIPPED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeSizeZipped").build();
    private static final MarshallingInfo<Integer> CONCURRENTEXECUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConcurrentExecutions").build();
    private static final MarshallingInfo<Integer> UNRESERVEDCONCURRENTEXECUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnreservedConcurrentExecutions").build();

    private static final AccountLimitMarshaller instance = new AccountLimitMarshaller();

    public static AccountLimitMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountLimit accountLimit, ProtocolMarshaller protocolMarshaller) {

        if (accountLimit == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountLimit.getTotalCodeSize(), TOTALCODESIZE_BINDING);
            protocolMarshaller.marshall(accountLimit.getCodeSizeUnzipped(), CODESIZEUNZIPPED_BINDING);
            protocolMarshaller.marshall(accountLimit.getCodeSizeZipped(), CODESIZEZIPPED_BINDING);
            protocolMarshaller.marshall(accountLimit.getConcurrentExecutions(), CONCURRENTEXECUTIONS_BINDING);
            protocolMarshaller.marshall(accountLimit.getUnreservedConcurrentExecutions(), UNRESERVEDCONCURRENTEXECUTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
