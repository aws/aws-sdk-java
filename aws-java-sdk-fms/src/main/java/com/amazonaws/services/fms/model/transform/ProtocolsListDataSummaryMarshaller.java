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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProtocolsListDataSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProtocolsListDataSummaryMarshaller {

    private static final MarshallingInfo<String> LISTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ListArn").build();
    private static final MarshallingInfo<String> LISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ListId").build();
    private static final MarshallingInfo<String> LISTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ListName").build();
    private static final MarshallingInfo<List> PROTOCOLSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProtocolsList").build();

    private static final ProtocolsListDataSummaryMarshaller instance = new ProtocolsListDataSummaryMarshaller();

    public static ProtocolsListDataSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProtocolsListDataSummary protocolsListDataSummary, ProtocolMarshaller protocolMarshaller) {

        if (protocolsListDataSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(protocolsListDataSummary.getListArn(), LISTARN_BINDING);
            protocolMarshaller.marshall(protocolsListDataSummary.getListId(), LISTID_BINDING);
            protocolMarshaller.marshall(protocolsListDataSummary.getListName(), LISTNAME_BINDING);
            protocolMarshaller.marshall(protocolsListDataSummary.getProtocolsList(), PROTOCOLSLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
