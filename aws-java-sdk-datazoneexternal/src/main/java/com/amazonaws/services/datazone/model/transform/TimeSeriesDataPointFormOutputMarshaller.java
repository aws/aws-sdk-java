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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeSeriesDataPointFormOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeSeriesDataPointFormOutputMarshaller {

    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("content").build();
    private static final MarshallingInfo<String> FORMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("formName").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TYPEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("typeIdentifier").build();
    private static final MarshallingInfo<String> TYPEREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("typeRevision").build();

    private static final TimeSeriesDataPointFormOutputMarshaller instance = new TimeSeriesDataPointFormOutputMarshaller();

    public static TimeSeriesDataPointFormOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeSeriesDataPointFormOutput timeSeriesDataPointFormOutput, ProtocolMarshaller protocolMarshaller) {

        if (timeSeriesDataPointFormOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeSeriesDataPointFormOutput.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointFormOutput.getFormName(), FORMNAME_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointFormOutput.getId(), ID_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointFormOutput.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointFormOutput.getTypeIdentifier(), TYPEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointFormOutput.getTypeRevision(), TYPEREVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
