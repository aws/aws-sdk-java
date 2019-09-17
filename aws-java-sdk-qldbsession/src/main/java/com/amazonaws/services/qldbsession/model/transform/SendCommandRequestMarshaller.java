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
package com.amazonaws.services.qldbsession.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qldbsession.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendCommandRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendCommandRequestMarshaller {

    private static final MarshallingInfo<String> SESSIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionToken").build();
    private static final MarshallingInfo<StructuredPojo> STARTSESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartSession").build();
    private static final MarshallingInfo<StructuredPojo> STARTTRANSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTransaction").build();
    private static final MarshallingInfo<StructuredPojo> ENDSESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndSession").build();
    private static final MarshallingInfo<StructuredPojo> COMMITTRANSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommitTransaction").build();
    private static final MarshallingInfo<StructuredPojo> ABORTTRANSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AbortTransaction").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTESTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecuteStatement").build();
    private static final MarshallingInfo<StructuredPojo> FETCHPAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FetchPage").build();

    private static final SendCommandRequestMarshaller instance = new SendCommandRequestMarshaller();

    public static SendCommandRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendCommandRequest sendCommandRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendCommandRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendCommandRequest.getSessionToken(), SESSIONTOKEN_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getStartSession(), STARTSESSION_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getStartTransaction(), STARTTRANSACTION_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getEndSession(), ENDSESSION_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getCommitTransaction(), COMMITTRANSACTION_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getAbortTransaction(), ABORTTRANSACTION_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getExecuteStatement(), EXECUTESTATEMENT_BINDING);
            protocolMarshaller.marshall(sendCommandRequest.getFetchPage(), FETCHPAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
