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
package com.amazonaws.services.rdsdata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rdsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecuteSqlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecuteSqlRequestMarshaller {

    private static final MarshallingInfo<String> AWSSECRETSTOREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsSecretStoreArn").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("database").build();
    private static final MarshallingInfo<String> DBCLUSTERORINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dbClusterOrInstanceArn").build();
    private static final MarshallingInfo<String> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("schema").build();
    private static final MarshallingInfo<String> SQLSTATEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sqlStatements").build();

    private static final ExecuteSqlRequestMarshaller instance = new ExecuteSqlRequestMarshaller();

    public static ExecuteSqlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecuteSqlRequest executeSqlRequest, ProtocolMarshaller protocolMarshaller) {

        if (executeSqlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executeSqlRequest.getAwsSecretStoreArn(), AWSSECRETSTOREARN_BINDING);
            protocolMarshaller.marshall(executeSqlRequest.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(executeSqlRequest.getDbClusterOrInstanceArn(), DBCLUSTERORINSTANCEARN_BINDING);
            protocolMarshaller.marshall(executeSqlRequest.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(executeSqlRequest.getSqlStatements(), SQLSTATEMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
