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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SalesforceChatterFeedConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SalesforceChatterFeedConfigurationMarshaller {

    private static final MarshallingInfo<String> DOCUMENTDATAFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentDataFieldName").build();
    private static final MarshallingInfo<String> DOCUMENTTITLEFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentTitleFieldName").build();
    private static final MarshallingInfo<List> FIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldMappings").build();
    private static final MarshallingInfo<List> INCLUDEFILTERTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeFilterTypes").build();

    private static final SalesforceChatterFeedConfigurationMarshaller instance = new SalesforceChatterFeedConfigurationMarshaller();

    public static SalesforceChatterFeedConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SalesforceChatterFeedConfiguration salesforceChatterFeedConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (salesforceChatterFeedConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(salesforceChatterFeedConfiguration.getDocumentDataFieldName(), DOCUMENTDATAFIELDNAME_BINDING);
            protocolMarshaller.marshall(salesforceChatterFeedConfiguration.getDocumentTitleFieldName(), DOCUMENTTITLEFIELDNAME_BINDING);
            protocolMarshaller.marshall(salesforceChatterFeedConfiguration.getFieldMappings(), FIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(salesforceChatterFeedConfiguration.getIncludeFilterTypes(), INCLUDEFILTERTYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
