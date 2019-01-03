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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDynamicThingGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDynamicThingGroupRequestMarshaller {

    private static final MarshallingInfo<String> THINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("thingGroupName").build();
    private static final MarshallingInfo<StructuredPojo> THINGGROUPPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupProperties").build();
    private static final MarshallingInfo<Long> EXPECTEDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedVersion").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("indexName").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryString").build();
    private static final MarshallingInfo<String> QUERYVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryVersion").build();

    private static final UpdateDynamicThingGroupRequestMarshaller instance = new UpdateDynamicThingGroupRequestMarshaller();

    public static UpdateDynamicThingGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDynamicThingGroupRequest updateDynamicThingGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDynamicThingGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDynamicThingGroupRequest.getThingGroupName(), THINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(updateDynamicThingGroupRequest.getThingGroupProperties(), THINGGROUPPROPERTIES_BINDING);
            protocolMarshaller.marshall(updateDynamicThingGroupRequest.getExpectedVersion(), EXPECTEDVERSION_BINDING);
            protocolMarshaller.marshall(updateDynamicThingGroupRequest.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(updateDynamicThingGroupRequest.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(updateDynamicThingGroupRequest.getQueryVersion(), QUERYVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
