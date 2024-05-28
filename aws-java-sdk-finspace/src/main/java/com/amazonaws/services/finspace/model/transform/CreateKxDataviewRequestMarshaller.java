/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateKxDataviewRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateKxDataviewRequestMarshaller {

    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("databaseName").build();
    private static final MarshallingInfo<String> DATAVIEWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataviewName").build();
    private static final MarshallingInfo<String> AZMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("azMode").build();
    private static final MarshallingInfo<String> AVAILABILITYZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZoneId").build();
    private static final MarshallingInfo<String> CHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changesetId").build();
    private static final MarshallingInfo<List> SEGMENTCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentConfigurations").build();
    private static final MarshallingInfo<Boolean> AUTOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoUpdate").build();
    private static final MarshallingInfo<Boolean> READWRITE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readWrite").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateKxDataviewRequestMarshaller instance = new CreateKxDataviewRequestMarshaller();

    public static CreateKxDataviewRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateKxDataviewRequest createKxDataviewRequest, ProtocolMarshaller protocolMarshaller) {

        if (createKxDataviewRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createKxDataviewRequest.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getDataviewName(), DATAVIEWNAME_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getAzMode(), AZMODE_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getAvailabilityZoneId(), AVAILABILITYZONEID_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getChangesetId(), CHANGESETID_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getSegmentConfigurations(), SEGMENTCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getAutoUpdate(), AUTOUPDATE_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getReadWrite(), READWRITE_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createKxDataviewRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
