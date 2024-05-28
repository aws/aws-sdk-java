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
package com.amazonaws.services.verifiedpermissions.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.verifiedpermissions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchIsAuthorizedWithTokenOutputItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchIsAuthorizedWithTokenOutputItemMarshaller {

    private static final MarshallingInfo<StructuredPojo> REQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("request").build();
    private static final MarshallingInfo<String> DECISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("decision").build();
    private static final MarshallingInfo<List> DETERMININGPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("determiningPolicies").build();
    private static final MarshallingInfo<List> ERRORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errors").build();

    private static final BatchIsAuthorizedWithTokenOutputItemMarshaller instance = new BatchIsAuthorizedWithTokenOutputItemMarshaller();

    public static BatchIsAuthorizedWithTokenOutputItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchIsAuthorizedWithTokenOutputItem batchIsAuthorizedWithTokenOutputItem, ProtocolMarshaller protocolMarshaller) {

        if (batchIsAuthorizedWithTokenOutputItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenOutputItem.getRequest(), REQUEST_BINDING);
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenOutputItem.getDecision(), DECISION_BINDING);
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenOutputItem.getDeterminingPolicies(), DETERMININGPOLICIES_BINDING);
            protocolMarshaller.marshall(batchIsAuthorizedWithTokenOutputItem.getErrors(), ERRORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
