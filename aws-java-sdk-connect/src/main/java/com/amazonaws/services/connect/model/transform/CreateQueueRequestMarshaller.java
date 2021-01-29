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
package com.amazonaws.services.connect.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateQueueRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateQueueRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> OUTBOUNDCALLERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundCallerConfig").build();
    private static final MarshallingInfo<String> HOURSOFOPERATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HoursOfOperationId").build();
    private static final MarshallingInfo<Integer> MAXCONTACTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxContacts").build();
    private static final MarshallingInfo<List> QUICKCONNECTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuickConnectIds").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateQueueRequestMarshaller instance = new CreateQueueRequestMarshaller();

    public static CreateQueueRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateQueueRequest createQueueRequest, ProtocolMarshaller protocolMarshaller) {

        if (createQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createQueueRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getOutboundCallerConfig(), OUTBOUNDCALLERCONFIG_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getHoursOfOperationId(), HOURSOFOPERATIONID_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getMaxContacts(), MAXCONTACTS_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getQuickConnectIds(), QUICKCONNECTIDS_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
