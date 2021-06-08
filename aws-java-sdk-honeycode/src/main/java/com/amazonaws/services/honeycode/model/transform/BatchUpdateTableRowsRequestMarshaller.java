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
package com.amazonaws.services.honeycode.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.honeycode.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchUpdateTableRowsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchUpdateTableRowsRequestMarshaller {

    private static final MarshallingInfo<String> WORKBOOKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workbookId").build();
    private static final MarshallingInfo<String> TABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("tableId").build();
    private static final MarshallingInfo<List> ROWSTOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rowsToUpdate").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken").build();

    private static final BatchUpdateTableRowsRequestMarshaller instance = new BatchUpdateTableRowsRequestMarshaller();

    public static BatchUpdateTableRowsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchUpdateTableRowsRequest batchUpdateTableRowsRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchUpdateTableRowsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchUpdateTableRowsRequest.getWorkbookId(), WORKBOOKID_BINDING);
            protocolMarshaller.marshall(batchUpdateTableRowsRequest.getTableId(), TABLEID_BINDING);
            protocolMarshaller.marshall(batchUpdateTableRowsRequest.getRowsToUpdate(), ROWSTOUPDATE_BINDING);
            protocolMarshaller.marshall(batchUpdateTableRowsRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
