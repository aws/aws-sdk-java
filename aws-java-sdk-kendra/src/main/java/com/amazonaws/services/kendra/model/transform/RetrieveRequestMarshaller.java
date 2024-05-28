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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RetrieveRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RetrieveRequestMarshaller {

    private static final MarshallingInfo<String> INDEXID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexId").build();
    private static final MarshallingInfo<String> QUERYTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueryText").build();
    private static final MarshallingInfo<StructuredPojo> ATTRIBUTEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeFilter").build();
    private static final MarshallingInfo<List> REQUESTEDDOCUMENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedDocumentAttributes").build();
    private static final MarshallingInfo<List> DOCUMENTRELEVANCEOVERRIDECONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentRelevanceOverrideConfigurations").build();
    private static final MarshallingInfo<Integer> PAGENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageNumber").build();
    private static final MarshallingInfo<Integer> PAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageSize").build();
    private static final MarshallingInfo<StructuredPojo> USERCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserContext").build();

    private static final RetrieveRequestMarshaller instance = new RetrieveRequestMarshaller();

    public static RetrieveRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RetrieveRequest retrieveRequest, ProtocolMarshaller protocolMarshaller) {

        if (retrieveRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(retrieveRequest.getIndexId(), INDEXID_BINDING);
            protocolMarshaller.marshall(retrieveRequest.getQueryText(), QUERYTEXT_BINDING);
            protocolMarshaller.marshall(retrieveRequest.getAttributeFilter(), ATTRIBUTEFILTER_BINDING);
            protocolMarshaller.marshall(retrieveRequest.getRequestedDocumentAttributes(), REQUESTEDDOCUMENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(retrieveRequest.getDocumentRelevanceOverrideConfigurations(), DOCUMENTRELEVANCEOVERRIDECONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(retrieveRequest.getPageNumber(), PAGENUMBER_BINDING);
            protocolMarshaller.marshall(retrieveRequest.getPageSize(), PAGESIZE_BINDING);
            protocolMarshaller.marshall(retrieveRequest.getUserContext(), USERCONTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
