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
package com.amazonaws.services.devopsguru.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LogAnomalyClassMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LogAnomalyClassMarshaller {

    private static final MarshallingInfo<String> LOGSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogStreamName").build();
    private static final MarshallingInfo<String> LOGANOMALYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogAnomalyType").build();
    private static final MarshallingInfo<String> LOGANOMALYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogAnomalyToken").build();
    private static final MarshallingInfo<String> LOGEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogEventId").build();
    private static final MarshallingInfo<String> EXPLANATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Explanation").build();
    private static final MarshallingInfo<Integer> NUMBEROFLOGLINESOCCURRENCES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfLogLinesOccurrences").build();
    private static final MarshallingInfo<java.util.Date> LOGEVENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogEventTimestamp").timestampFormat("unixTimestamp").build();

    private static final LogAnomalyClassMarshaller instance = new LogAnomalyClassMarshaller();

    public static LogAnomalyClassMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LogAnomalyClass logAnomalyClass, ProtocolMarshaller protocolMarshaller) {

        if (logAnomalyClass == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(logAnomalyClass.getLogStreamName(), LOGSTREAMNAME_BINDING);
            protocolMarshaller.marshall(logAnomalyClass.getLogAnomalyType(), LOGANOMALYTYPE_BINDING);
            protocolMarshaller.marshall(logAnomalyClass.getLogAnomalyToken(), LOGANOMALYTOKEN_BINDING);
            protocolMarshaller.marshall(logAnomalyClass.getLogEventId(), LOGEVENTID_BINDING);
            protocolMarshaller.marshall(logAnomalyClass.getExplanation(), EXPLANATION_BINDING);
            protocolMarshaller.marshall(logAnomalyClass.getNumberOfLogLinesOccurrences(), NUMBEROFLOGLINESOCCURRENCES_BINDING);
            protocolMarshaller.marshall(logAnomalyClass.getLogEventTimestamp(), LOGEVENTTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
