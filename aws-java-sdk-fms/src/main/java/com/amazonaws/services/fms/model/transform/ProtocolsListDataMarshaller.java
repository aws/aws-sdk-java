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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProtocolsListDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProtocolsListDataMarshaller {

    private static final MarshallingInfo<String> LISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ListId").build();
    private static final MarshallingInfo<String> LISTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ListName").build();
    private static final MarshallingInfo<String> LISTUPDATETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListUpdateToken").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> PROTOCOLSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProtocolsList").build();
    private static final MarshallingInfo<Map> PREVIOUSPROTOCOLSLIST_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousProtocolsList").build();

    private static final ProtocolsListDataMarshaller instance = new ProtocolsListDataMarshaller();

    public static ProtocolsListDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProtocolsListData protocolsListData, ProtocolMarshaller protocolMarshaller) {

        if (protocolsListData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(protocolsListData.getListId(), LISTID_BINDING);
            protocolMarshaller.marshall(protocolsListData.getListName(), LISTNAME_BINDING);
            protocolMarshaller.marshall(protocolsListData.getListUpdateToken(), LISTUPDATETOKEN_BINDING);
            protocolMarshaller.marshall(protocolsListData.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(protocolsListData.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(protocolsListData.getProtocolsList(), PROTOCOLSLIST_BINDING);
            protocolMarshaller.marshall(protocolsListData.getPreviousProtocolsList(), PREVIOUSPROTOCOLSLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
