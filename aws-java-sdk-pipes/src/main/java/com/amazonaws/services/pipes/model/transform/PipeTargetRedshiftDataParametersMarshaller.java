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
package com.amazonaws.services.pipes.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipeTargetRedshiftDataParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeTargetRedshiftDataParametersMarshaller {

    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<String> DBUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DbUser").build();
    private static final MarshallingInfo<String> SECRETMANAGERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretManagerArn").build();
    private static final MarshallingInfo<List> SQLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sqls").build();
    private static final MarshallingInfo<String> STATEMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatementName").build();
    private static final MarshallingInfo<Boolean> WITHEVENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WithEvent").build();

    private static final PipeTargetRedshiftDataParametersMarshaller instance = new PipeTargetRedshiftDataParametersMarshaller();

    public static PipeTargetRedshiftDataParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeTargetRedshiftDataParameters pipeTargetRedshiftDataParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeTargetRedshiftDataParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeTargetRedshiftDataParameters.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(pipeTargetRedshiftDataParameters.getDbUser(), DBUSER_BINDING);
            protocolMarshaller.marshall(pipeTargetRedshiftDataParameters.getSecretManagerArn(), SECRETMANAGERARN_BINDING);
            protocolMarshaller.marshall(pipeTargetRedshiftDataParameters.getSqls(), SQLS_BINDING);
            protocolMarshaller.marshall(pipeTargetRedshiftDataParameters.getStatementName(), STATEMENTNAME_BINDING);
            protocolMarshaller.marshall(pipeTargetRedshiftDataParameters.getWithEvent(), WITHEVENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
