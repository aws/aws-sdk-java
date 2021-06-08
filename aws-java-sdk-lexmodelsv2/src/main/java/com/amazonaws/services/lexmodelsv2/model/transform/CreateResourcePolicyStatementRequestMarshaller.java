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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateResourcePolicyStatementRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateResourcePolicyStatementRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> STATEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statementId").build();
    private static final MarshallingInfo<String> EFFECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("effect").build();
    private static final MarshallingInfo<List> PRINCIPAL_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("principal").build();
    private static final MarshallingInfo<List> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("action").build();
    private static final MarshallingInfo<Map> CONDITION_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("condition").build();
    private static final MarshallingInfo<String> EXPECTEDREVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("expectedRevisionId").build();

    private static final CreateResourcePolicyStatementRequestMarshaller instance = new CreateResourcePolicyStatementRequestMarshaller();

    public static CreateResourcePolicyStatementRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateResourcePolicyStatementRequest createResourcePolicyStatementRequest, ProtocolMarshaller protocolMarshaller) {

        if (createResourcePolicyStatementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createResourcePolicyStatementRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(createResourcePolicyStatementRequest.getStatementId(), STATEMENTID_BINDING);
            protocolMarshaller.marshall(createResourcePolicyStatementRequest.getEffect(), EFFECT_BINDING);
            protocolMarshaller.marshall(createResourcePolicyStatementRequest.getPrincipal(), PRINCIPAL_BINDING);
            protocolMarshaller.marshall(createResourcePolicyStatementRequest.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(createResourcePolicyStatementRequest.getCondition(), CONDITION_BINDING);
            protocolMarshaller.marshall(createResourcePolicyStatementRequest.getExpectedRevisionId(), EXPECTEDREVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
