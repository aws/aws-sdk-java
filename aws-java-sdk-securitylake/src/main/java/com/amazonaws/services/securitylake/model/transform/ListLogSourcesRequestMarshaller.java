/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListLogSourcesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListLogSourcesRequestMarshaller {

    private static final MarshallingInfo<List> INPUTORDER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputOrder").build();
    private static final MarshallingInfo<Map> LISTALLDIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listAllDimensions").build();
    private static final MarshallingInfo<List> LISTSINGLEDIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listSingleDimension").build();
    private static final MarshallingInfo<Map> LISTTWODIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listTwoDimensions").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();

    private static final ListLogSourcesRequestMarshaller instance = new ListLogSourcesRequestMarshaller();

    public static ListLogSourcesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListLogSourcesRequest listLogSourcesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listLogSourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listLogSourcesRequest.getInputOrder(), INPUTORDER_BINDING);
            protocolMarshaller.marshall(listLogSourcesRequest.getListAllDimensions(), LISTALLDIMENSIONS_BINDING);
            protocolMarshaller.marshall(listLogSourcesRequest.getListSingleDimension(), LISTSINGLEDIMENSION_BINDING);
            protocolMarshaller.marshall(listLogSourcesRequest.getListTwoDimensions(), LISTTWODIMENSIONS_BINDING);
            protocolMarshaller.marshall(listLogSourcesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listLogSourcesRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
