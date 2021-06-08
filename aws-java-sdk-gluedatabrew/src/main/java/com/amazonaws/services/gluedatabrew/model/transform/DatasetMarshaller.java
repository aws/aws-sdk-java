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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<StructuredPojo> FORMATOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FormatOptions").build();
    private static final MarshallingInfo<StructuredPojo> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Input").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Source").build();
    private static final MarshallingInfo<StructuredPojo> PATHOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PathOptions").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();

    private static final DatasetMarshaller instance = new DatasetMarshaller();

    public static DatasetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Dataset dataset, ProtocolMarshaller protocolMarshaller) {

        if (dataset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataset.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(dataset.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(dataset.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(dataset.getName(), NAME_BINDING);
            protocolMarshaller.marshall(dataset.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(dataset.getFormatOptions(), FORMATOPTIONS_BINDING);
            protocolMarshaller.marshall(dataset.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(dataset.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(dataset.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(dataset.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(dataset.getPathOptions(), PATHOPTIONS_BINDING);
            protocolMarshaller.marshall(dataset.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(dataset.getResourceArn(), RESOURCEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
