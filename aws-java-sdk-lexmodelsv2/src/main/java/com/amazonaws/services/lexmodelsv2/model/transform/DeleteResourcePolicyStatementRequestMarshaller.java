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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteResourcePolicyStatementRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteResourcePolicyStatementRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> STATEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("statementId").build();
    private static final MarshallingInfo<String> EXPECTEDREVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("expectedRevisionId").build();

    private static final DeleteResourcePolicyStatementRequestMarshaller instance = new DeleteResourcePolicyStatementRequestMarshaller();

    public static DeleteResourcePolicyStatementRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteResourcePolicyStatementRequest deleteResourcePolicyStatementRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteResourcePolicyStatementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteResourcePolicyStatementRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(deleteResourcePolicyStatementRequest.getStatementId(), STATEMENTID_BINDING);
            protocolMarshaller.marshall(deleteResourcePolicyStatementRequest.getExpectedRevisionId(), EXPECTEDREVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
