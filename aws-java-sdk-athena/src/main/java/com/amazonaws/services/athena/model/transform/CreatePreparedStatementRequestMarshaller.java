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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePreparedStatementRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePreparedStatementRequestMarshaller {

    private static final MarshallingInfo<String> STATEMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatementName").build();
    private static final MarshallingInfo<String> WORKGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkGroup").build();
    private static final MarshallingInfo<String> QUERYSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryStatement").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final CreatePreparedStatementRequestMarshaller instance = new CreatePreparedStatementRequestMarshaller();

    public static CreatePreparedStatementRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePreparedStatementRequest createPreparedStatementRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPreparedStatementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPreparedStatementRequest.getStatementName(), STATEMENTNAME_BINDING);
            protocolMarshaller.marshall(createPreparedStatementRequest.getWorkGroup(), WORKGROUP_BINDING);
            protocolMarshaller.marshall(createPreparedStatementRequest.getQueryStatement(), QUERYSTATEMENT_BINDING);
            protocolMarshaller.marshall(createPreparedStatementRequest.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
