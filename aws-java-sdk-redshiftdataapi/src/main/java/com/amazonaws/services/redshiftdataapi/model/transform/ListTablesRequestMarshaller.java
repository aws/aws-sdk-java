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
package com.amazonaws.services.redshiftdataapi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftdataapi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListTablesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListTablesRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterIdentifier").build();
    private static final MarshallingInfo<String> CONNECTEDDATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectedDatabase").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<String> DBUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DbUser").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<String> SCHEMAPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaPattern").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<String> TABLEPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablePattern").build();

    private static final ListTablesRequestMarshaller instance = new ListTablesRequestMarshaller();

    public static ListTablesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListTablesRequest listTablesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listTablesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listTablesRequest.getClusterIdentifier(), CLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getConnectedDatabase(), CONNECTEDDATABASE_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getDbUser(), DBUSER_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getSchemaPattern(), SCHEMAPATTERN_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(listTablesRequest.getTablePattern(), TABLEPATTERN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
