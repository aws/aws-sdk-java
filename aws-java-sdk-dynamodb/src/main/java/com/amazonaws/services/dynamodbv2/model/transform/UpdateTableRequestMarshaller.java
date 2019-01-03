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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateTableRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTableRequestMarshaller {

    private static final MarshallingInfo<List> ATTRIBUTEDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeDefinitions").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<String> BILLINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BillingMode").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDTHROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedThroughput").build();
    private static final MarshallingInfo<List> GLOBALSECONDARYINDEXUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalSecondaryIndexUpdates").build();
    private static final MarshallingInfo<StructuredPojo> STREAMSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamSpecification").build();
    private static final MarshallingInfo<StructuredPojo> SSESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SSESpecification").build();

    private static final UpdateTableRequestMarshaller instance = new UpdateTableRequestMarshaller();

    public static UpdateTableRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTableRequest updateTableRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTableRequest.getAttributeDefinitions(), ATTRIBUTEDEFINITIONS_BINDING);
            protocolMarshaller.marshall(updateTableRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(updateTableRequest.getBillingMode(), BILLINGMODE_BINDING);
            protocolMarshaller.marshall(updateTableRequest.getProvisionedThroughput(), PROVISIONEDTHROUGHPUT_BINDING);
            protocolMarshaller.marshall(updateTableRequest.getGlobalSecondaryIndexUpdates(), GLOBALSECONDARYINDEXUPDATES_BINDING);
            protocolMarshaller.marshall(updateTableRequest.getStreamSpecification(), STREAMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(updateTableRequest.getSSESpecification(), SSESPECIFICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
