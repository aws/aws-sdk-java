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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryExecutionMarshaller {

    private static final MarshallingInfo<String> QUERYEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryExecutionId").build();
    private static final MarshallingInfo<String> QUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Query").build();
    private static final MarshallingInfo<String> STATEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatementType").build();
    private static final MarshallingInfo<StructuredPojo> RESULTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> QUERYEXECUTIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryExecutionContext").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> STATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Statistics").build();
    private static final MarshallingInfo<String> WORKGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkGroup").build();

    private static final QueryExecutionMarshaller instance = new QueryExecutionMarshaller();

    public static QueryExecutionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryExecution queryExecution, ProtocolMarshaller protocolMarshaller) {

        if (queryExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryExecution.getQueryExecutionId(), QUERYEXECUTIONID_BINDING);
            protocolMarshaller.marshall(queryExecution.getQuery(), QUERY_BINDING);
            protocolMarshaller.marshall(queryExecution.getStatementType(), STATEMENTTYPE_BINDING);
            protocolMarshaller.marshall(queryExecution.getResultConfiguration(), RESULTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(queryExecution.getQueryExecutionContext(), QUERYEXECUTIONCONTEXT_BINDING);
            protocolMarshaller.marshall(queryExecution.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(queryExecution.getStatistics(), STATISTICS_BINDING);
            protocolMarshaller.marshall(queryExecution.getWorkGroup(), WORKGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
