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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TableInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableInputMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Owner").build();
    private static final MarshallingInfo<java.util.Date> LASTACCESSTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastAccessTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTANALYZEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastAnalyzedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> RETENTION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Retention").build();
    private static final MarshallingInfo<StructuredPojo> STORAGEDESCRIPTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageDescriptor").build();
    private static final MarshallingInfo<List> PARTITIONKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PartitionKeys").build();
    private static final MarshallingInfo<String> VIEWORIGINALTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewOriginalText").build();
    private static final MarshallingInfo<String> VIEWEXPANDEDTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewExpandedText").build();
    private static final MarshallingInfo<String> TABLETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableType").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();

    private static final TableInputMarshaller instance = new TableInputMarshaller();

    public static TableInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableInput tableInput, ProtocolMarshaller protocolMarshaller) {

        if (tableInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableInput.getName(), NAME_BINDING);
            protocolMarshaller.marshall(tableInput.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(tableInput.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(tableInput.getLastAccessTime(), LASTACCESSTIME_BINDING);
            protocolMarshaller.marshall(tableInput.getLastAnalyzedTime(), LASTANALYZEDTIME_BINDING);
            protocolMarshaller.marshall(tableInput.getRetention(), RETENTION_BINDING);
            protocolMarshaller.marshall(tableInput.getStorageDescriptor(), STORAGEDESCRIPTOR_BINDING);
            protocolMarshaller.marshall(tableInput.getPartitionKeys(), PARTITIONKEYS_BINDING);
            protocolMarshaller.marshall(tableInput.getViewOriginalText(), VIEWORIGINALTEXT_BINDING);
            protocolMarshaller.marshall(tableInput.getViewExpandedText(), VIEWEXPANDEDTEXT_BINDING);
            protocolMarshaller.marshall(tableInput.getTableType(), TABLETYPE_BINDING);
            protocolMarshaller.marshall(tableInput.getParameters(), PARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
