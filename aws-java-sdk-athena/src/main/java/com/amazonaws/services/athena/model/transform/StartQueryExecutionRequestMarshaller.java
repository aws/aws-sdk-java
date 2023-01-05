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
package com.amazonaws.services.athena.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartQueryExecutionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartQueryExecutionRequestMarshaller {

    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryString").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<StructuredPojo> QUERYEXECUTIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryExecutionContext").build();
    private static final MarshallingInfo<StructuredPojo> RESULTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultConfiguration").build();
    private static final MarshallingInfo<String> WORKGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkGroup").build();
    private static final MarshallingInfo<List> EXECUTIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionParameters").build();
    private static final MarshallingInfo<StructuredPojo> RESULTREUSECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultReuseConfiguration").build();

    private static final StartQueryExecutionRequestMarshaller instance = new StartQueryExecutionRequestMarshaller();

    public static StartQueryExecutionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartQueryExecutionRequest startQueryExecutionRequest, ProtocolMarshaller protocolMarshaller) {

        if (startQueryExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startQueryExecutionRequest.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(startQueryExecutionRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(startQueryExecutionRequest.getQueryExecutionContext(), QUERYEXECUTIONCONTEXT_BINDING);
            protocolMarshaller.marshall(startQueryExecutionRequest.getResultConfiguration(), RESULTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(startQueryExecutionRequest.getWorkGroup(), WORKGROUP_BINDING);
            protocolMarshaller.marshall(startQueryExecutionRequest.getExecutionParameters(), EXECUTIONPARAMETERS_BINDING);
            protocolMarshaller.marshall(startQueryExecutionRequest.getResultReuseConfiguration(), RESULTREUSECONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
