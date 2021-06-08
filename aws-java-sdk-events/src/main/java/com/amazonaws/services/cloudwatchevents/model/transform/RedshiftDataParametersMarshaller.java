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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RedshiftDataParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RedshiftDataParametersMarshaller {

    private static final MarshallingInfo<String> SECRETMANAGERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretManagerArn").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<String> DBUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DbUser").build();
    private static final MarshallingInfo<String> SQL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sql").build();
    private static final MarshallingInfo<String> STATEMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatementName").build();
    private static final MarshallingInfo<Boolean> WITHEVENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WithEvent").build();

    private static final RedshiftDataParametersMarshaller instance = new RedshiftDataParametersMarshaller();

    public static RedshiftDataParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RedshiftDataParameters redshiftDataParameters, ProtocolMarshaller protocolMarshaller) {

        if (redshiftDataParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(redshiftDataParameters.getSecretManagerArn(), SECRETMANAGERARN_BINDING);
            protocolMarshaller.marshall(redshiftDataParameters.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(redshiftDataParameters.getDbUser(), DBUSER_BINDING);
            protocolMarshaller.marshall(redshiftDataParameters.getSql(), SQL_BINDING);
            protocolMarshaller.marshall(redshiftDataParameters.getStatementName(), STATEMENTNAME_BINDING);
            protocolMarshaller.marshall(redshiftDataParameters.getWithEvent(), WITHEVENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
