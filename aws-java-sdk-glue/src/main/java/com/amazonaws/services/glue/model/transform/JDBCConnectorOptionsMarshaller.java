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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JDBCConnectorOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JDBCConnectorOptionsMarshaller {

    private static final MarshallingInfo<String> FILTERPREDICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterPredicate").build();
    private static final MarshallingInfo<String> PARTITIONCOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartitionColumn").build();
    private static final MarshallingInfo<Long> LOWERBOUND_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LowerBound").build();
    private static final MarshallingInfo<Long> UPPERBOUND_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UpperBound").build();
    private static final MarshallingInfo<Long> NUMPARTITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NumPartitions").build();
    private static final MarshallingInfo<List> JOBBOOKMARKKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobBookmarkKeys").build();
    private static final MarshallingInfo<String> JOBBOOKMARKKEYSSORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobBookmarkKeysSortOrder").build();
    private static final MarshallingInfo<Map> DATATYPEMAPPING_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataTypeMapping").build();

    private static final JDBCConnectorOptionsMarshaller instance = new JDBCConnectorOptionsMarshaller();

    public static JDBCConnectorOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JDBCConnectorOptions jDBCConnectorOptions, ProtocolMarshaller protocolMarshaller) {

        if (jDBCConnectorOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jDBCConnectorOptions.getFilterPredicate(), FILTERPREDICATE_BINDING);
            protocolMarshaller.marshall(jDBCConnectorOptions.getPartitionColumn(), PARTITIONCOLUMN_BINDING);
            protocolMarshaller.marshall(jDBCConnectorOptions.getLowerBound(), LOWERBOUND_BINDING);
            protocolMarshaller.marshall(jDBCConnectorOptions.getUpperBound(), UPPERBOUND_BINDING);
            protocolMarshaller.marshall(jDBCConnectorOptions.getNumPartitions(), NUMPARTITIONS_BINDING);
            protocolMarshaller.marshall(jDBCConnectorOptions.getJobBookmarkKeys(), JOBBOOKMARKKEYS_BINDING);
            protocolMarshaller.marshall(jDBCConnectorOptions.getJobBookmarkKeysSortOrder(), JOBBOOKMARKKEYSSORTORDER_BINDING);
            protocolMarshaller.marshall(jDBCConnectorOptions.getDataTypeMapping(), DATATYPEMAPPING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
