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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakerfeaturestoreruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteRecordRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteRecordRequestMarshaller {

    private static final MarshallingInfo<String> FEATUREGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("FeatureGroupName").build();
    private static final MarshallingInfo<String> RECORDIDENTIFIERVALUEASSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("RecordIdentifierValueAsString").build();
    private static final MarshallingInfo<String> EVENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("EventTime").build();

    private static final DeleteRecordRequestMarshaller instance = new DeleteRecordRequestMarshaller();

    public static DeleteRecordRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteRecordRequest deleteRecordRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteRecordRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteRecordRequest.getFeatureGroupName(), FEATUREGROUPNAME_BINDING);
            protocolMarshaller.marshall(deleteRecordRequest.getRecordIdentifierValueAsString(), RECORDIDENTIFIERVALUEASSTRING_BINDING);
            protocolMarshaller.marshall(deleteRecordRequest.getEventTime(), EVENTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
