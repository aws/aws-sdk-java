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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SqlApplicationConfigurationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SqlApplicationConfigurationUpdateMarshaller {

    private static final MarshallingInfo<List> INPUTUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputUpdates").build();
    private static final MarshallingInfo<List> OUTPUTUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputUpdates").build();
    private static final MarshallingInfo<List> REFERENCEDATASOURCEUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceDataSourceUpdates").build();

    private static final SqlApplicationConfigurationUpdateMarshaller instance = new SqlApplicationConfigurationUpdateMarshaller();

    public static SqlApplicationConfigurationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SqlApplicationConfigurationUpdate sqlApplicationConfigurationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (sqlApplicationConfigurationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sqlApplicationConfigurationUpdate.getInputUpdates(), INPUTUPDATES_BINDING);
            protocolMarshaller.marshall(sqlApplicationConfigurationUpdate.getOutputUpdates(), OUTPUTUPDATES_BINDING);
            protocolMarshaller.marshall(sqlApplicationConfigurationUpdate.getReferenceDataSourceUpdates(), REFERENCEDATASOURCEUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
