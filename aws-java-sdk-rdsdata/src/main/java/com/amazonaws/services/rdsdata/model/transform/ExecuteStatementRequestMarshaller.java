/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rdsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecuteStatementRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecuteStatementRequestMarshaller {

    private static final MarshallingInfo<Boolean> CONTINUEAFTERTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("continueAfterTimeout").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("database").build();
    private static final MarshallingInfo<Boolean> INCLUDERESULTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeResultMetadata").build();
    private static final MarshallingInfo<List> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("parameters").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<StructuredPojo> RESULTSETOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resultSetOptions").build();
    private static final MarshallingInfo<String> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("schema").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("secretArn").build();
    private static final MarshallingInfo<String> SQL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sql").build();
    private static final MarshallingInfo<String> TRANSACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionId").build();

    private static final ExecuteStatementRequestMarshaller instance = new ExecuteStatementRequestMarshaller();

    public static ExecuteStatementRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecuteStatementRequest executeStatementRequest, ProtocolMarshaller protocolMarshaller) {

        if (executeStatementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executeStatementRequest.getContinueAfterTimeout(), CONTINUEAFTERTIMEOUT_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getIncludeResultMetadata(), INCLUDERESULTMETADATA_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getResultSetOptions(), RESULTSETOPTIONS_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getSql(), SQL_BINDING);
            protocolMarshaller.marshall(executeStatementRequest.getTransactionId(), TRANSACTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
