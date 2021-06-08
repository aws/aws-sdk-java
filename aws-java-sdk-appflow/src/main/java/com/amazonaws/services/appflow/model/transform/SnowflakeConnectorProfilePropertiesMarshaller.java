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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnowflakeConnectorProfilePropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnowflakeConnectorProfilePropertiesMarshaller {

    private static final MarshallingInfo<String> WAREHOUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("warehouse").build();
    private static final MarshallingInfo<String> STAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stage").build();
    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketName").build();
    private static final MarshallingInfo<String> BUCKETPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketPrefix").build();
    private static final MarshallingInfo<String> PRIVATELINKSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateLinkServiceName").build();
    private static final MarshallingInfo<String> ACCOUNTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountName").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();

    private static final SnowflakeConnectorProfilePropertiesMarshaller instance = new SnowflakeConnectorProfilePropertiesMarshaller();

    public static SnowflakeConnectorProfilePropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnowflakeConnectorProfileProperties snowflakeConnectorProfileProperties, ProtocolMarshaller protocolMarshaller) {

        if (snowflakeConnectorProfileProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snowflakeConnectorProfileProperties.getWarehouse(), WAREHOUSE_BINDING);
            protocolMarshaller.marshall(snowflakeConnectorProfileProperties.getStage(), STAGE_BINDING);
            protocolMarshaller.marshall(snowflakeConnectorProfileProperties.getBucketName(), BUCKETNAME_BINDING);
            protocolMarshaller.marshall(snowflakeConnectorProfileProperties.getBucketPrefix(), BUCKETPREFIX_BINDING);
            protocolMarshaller.marshall(snowflakeConnectorProfileProperties.getPrivateLinkServiceName(), PRIVATELINKSERVICENAME_BINDING);
            protocolMarshaller.marshall(snowflakeConnectorProfileProperties.getAccountName(), ACCOUNTNAME_BINDING);
            protocolMarshaller.marshall(snowflakeConnectorProfileProperties.getRegion(), REGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
