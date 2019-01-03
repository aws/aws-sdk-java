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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RdsHttpEndpointConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RdsHttpEndpointConfigMarshaller {

    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsRegion").build();
    private static final MarshallingInfo<String> DBCLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dbClusterIdentifier").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("databaseName").build();
    private static final MarshallingInfo<String> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("schema").build();
    private static final MarshallingInfo<String> AWSSECRETSTOREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsSecretStoreArn").build();

    private static final RdsHttpEndpointConfigMarshaller instance = new RdsHttpEndpointConfigMarshaller();

    public static RdsHttpEndpointConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RdsHttpEndpointConfig rdsHttpEndpointConfig, ProtocolMarshaller protocolMarshaller) {

        if (rdsHttpEndpointConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rdsHttpEndpointConfig.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(rdsHttpEndpointConfig.getDbClusterIdentifier(), DBCLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(rdsHttpEndpointConfig.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(rdsHttpEndpointConfig.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(rdsHttpEndpointConfig.getAwsSecretStoreArn(), AWSSECRETSTOREARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
