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
package com.amazonaws.services.finspacedata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDataViewRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDataViewRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<Boolean> AUTOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoUpdate").build();
    private static final MarshallingInfo<List> SORTCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortColumns").build();
    private static final MarshallingInfo<List> PARTITIONCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("partitionColumns").build();
    private static final MarshallingInfo<Long> ASOFTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("asOfTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONTYPEPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationTypeParams").build();

    private static final CreateDataViewRequestMarshaller instance = new CreateDataViewRequestMarshaller();

    public static CreateDataViewRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDataViewRequest createDataViewRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDataViewRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDataViewRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createDataViewRequest.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(createDataViewRequest.getAutoUpdate(), AUTOUPDATE_BINDING);
            protocolMarshaller.marshall(createDataViewRequest.getSortColumns(), SORTCOLUMNS_BINDING);
            protocolMarshaller.marshall(createDataViewRequest.getPartitionColumns(), PARTITIONCOLUMNS_BINDING);
            protocolMarshaller.marshall(createDataViewRequest.getAsOfTimestamp(), ASOFTIMESTAMP_BINDING);
            protocolMarshaller.marshall(createDataViewRequest.getDestinationTypeParams(), DESTINATIONTYPEPARAMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
