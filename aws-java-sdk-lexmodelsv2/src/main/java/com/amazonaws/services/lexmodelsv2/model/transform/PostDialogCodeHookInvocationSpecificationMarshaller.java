/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * PostDialogCodeHookInvocationSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostDialogCodeHookInvocationSpecificationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SUCCESSRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("successResponse").build();
    private static final MarshallingInfo<StructuredPojo> SUCCESSNEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("successNextStep").build();
    private static final MarshallingInfo<StructuredPojo> SUCCESSCONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("successConditional").build();
    private static final MarshallingInfo<StructuredPojo> FAILURERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureResponse").build();
    private static final MarshallingInfo<StructuredPojo> FAILURENEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureNextStep").build();
    private static final MarshallingInfo<StructuredPojo> FAILURECONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureConditional").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUTRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutResponse").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUTNEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutNextStep").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUTCONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutConditional").build();

    private static final PostDialogCodeHookInvocationSpecificationMarshaller instance = new PostDialogCodeHookInvocationSpecificationMarshaller();

    public static PostDialogCodeHookInvocationSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostDialogCodeHookInvocationSpecification postDialogCodeHookInvocationSpecification, ProtocolMarshaller protocolMarshaller) {

        if (postDialogCodeHookInvocationSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getSuccessResponse(), SUCCESSRESPONSE_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getSuccessNextStep(), SUCCESSNEXTSTEP_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getSuccessConditional(), SUCCESSCONDITIONAL_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getFailureResponse(), FAILURERESPONSE_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getFailureNextStep(), FAILURENEXTSTEP_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getFailureConditional(), FAILURECONDITIONAL_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getTimeoutResponse(), TIMEOUTRESPONSE_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getTimeoutNextStep(), TIMEOUTNEXTSTEP_BINDING);
            protocolMarshaller.marshall(postDialogCodeHookInvocationSpecification.getTimeoutConditional(), TIMEOUTCONDITIONAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
