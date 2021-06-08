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
package com.amazonaws.services.qldbsession.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qldbsession.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecuteStatementResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecuteStatementResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIRSTPAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirstPage").build();
    private static final MarshallingInfo<StructuredPojo> TIMINGINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimingInformation").build();
    private static final MarshallingInfo<StructuredPojo> CONSUMEDIOS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumedIOs").build();

    private static final ExecuteStatementResultMarshaller instance = new ExecuteStatementResultMarshaller();

    public static ExecuteStatementResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecuteStatementResult executeStatementResult, ProtocolMarshaller protocolMarshaller) {

        if (executeStatementResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executeStatementResult.getFirstPage(), FIRSTPAGE_BINDING);
            protocolMarshaller.marshall(executeStatementResult.getTimingInformation(), TIMINGINFORMATION_BINDING);
            protocolMarshaller.marshall(executeStatementResult.getConsumedIOs(), CONSUMEDIOS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
