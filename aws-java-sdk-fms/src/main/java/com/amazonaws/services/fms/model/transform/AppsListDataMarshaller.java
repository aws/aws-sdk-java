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
 * AppsListDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppsListDataMarshaller {

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
    private static final MarshallingInfo<List> APPSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AppsList").build();
    private static final MarshallingInfo<Map> PREVIOUSAPPSLIST_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousAppsList").build();

    private static final AppsListDataMarshaller instance = new AppsListDataMarshaller();

    public static AppsListDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppsListData appsListData, ProtocolMarshaller protocolMarshaller) {

        if (appsListData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appsListData.getListId(), LISTID_BINDING);
            protocolMarshaller.marshall(appsListData.getListName(), LISTNAME_BINDING);
            protocolMarshaller.marshall(appsListData.getListUpdateToken(), LISTUPDATETOKEN_BINDING);
            protocolMarshaller.marshall(appsListData.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(appsListData.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(appsListData.getAppsList(), APPSLIST_BINDING);
            protocolMarshaller.marshall(appsListData.getPreviousAppsList(), PREVIOUSAPPSLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
