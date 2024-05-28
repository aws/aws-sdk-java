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
 * TimeSeriesDataPointSummaryFormOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeSeriesDataPointSummaryFormOutputMarshaller {

    private static final MarshallingInfo<String> CONTENTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentSummary").build();
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

    private static final TimeSeriesDataPointSummaryFormOutputMarshaller instance = new TimeSeriesDataPointSummaryFormOutputMarshaller();

    public static TimeSeriesDataPointSummaryFormOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeSeriesDataPointSummaryFormOutput timeSeriesDataPointSummaryFormOutput, ProtocolMarshaller protocolMarshaller) {

        if (timeSeriesDataPointSummaryFormOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeSeriesDataPointSummaryFormOutput.getContentSummary(), CONTENTSUMMARY_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointSummaryFormOutput.getFormName(), FORMNAME_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointSummaryFormOutput.getId(), ID_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointSummaryFormOutput.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointSummaryFormOutput.getTypeIdentifier(), TYPEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(timeSeriesDataPointSummaryFormOutput.getTypeRevision(), TYPEREVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
