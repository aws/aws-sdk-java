/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDataSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDataSetRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Map> PHYSICALTABLEMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhysicalTableMap").build();
    private static final MarshallingInfo<Map> LOGICALTABLEMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogicalTableMap").build();
    private static final MarshallingInfo<String> IMPORTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportMode").build();
    private static final MarshallingInfo<List> COLUMNGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ColumnGroups").build();
    private static final MarshallingInfo<StructuredPojo> ROWLEVELPERMISSIONDATASET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowLevelPermissionDataSet").build();

    private static final UpdateDataSetRequestMarshaller instance = new UpdateDataSetRequestMarshaller();

    public static UpdateDataSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDataSetRequest updateDataSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDataSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDataSetRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(updateDataSetRequest.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(updateDataSetRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateDataSetRequest.getPhysicalTableMap(), PHYSICALTABLEMAP_BINDING);
            protocolMarshaller.marshall(updateDataSetRequest.getLogicalTableMap(), LOGICALTABLEMAP_BINDING);
            protocolMarshaller.marshall(updateDataSetRequest.getImportMode(), IMPORTMODE_BINDING);
            protocolMarshaller.marshall(updateDataSetRequest.getColumnGroups(), COLUMNGROUPS_BINDING);
            protocolMarshaller.marshall(updateDataSetRequest.getRowLevelPermissionDataSet(), ROWLEVELPERMISSIONDATASET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
