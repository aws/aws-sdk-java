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
package com.amazonaws.services.opsworks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchLogsLogStreamMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchLogsLogStreamMarshaller {

    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogGroupName").build();
    private static final MarshallingInfo<String> DATETIMEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatetimeFormat").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TimeZone").build();
    private static final MarshallingInfo<String> FILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("File").build();
    private static final MarshallingInfo<String> FILEFINGERPRINTLINES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileFingerprintLines").build();
    private static final MarshallingInfo<String> MULTILINESTARTPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultiLineStartPattern").build();
    private static final MarshallingInfo<String> INITIALPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitialPosition").build();
    private static final MarshallingInfo<String> ENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Encoding").build();
    private static final MarshallingInfo<Integer> BUFFERDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BufferDuration").build();
    private static final MarshallingInfo<Integer> BATCHCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchCount").build();
    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();

    private static final CloudWatchLogsLogStreamMarshaller instance = new CloudWatchLogsLogStreamMarshaller();

    public static CloudWatchLogsLogStreamMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchLogsLogStream cloudWatchLogsLogStream, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchLogsLogStream == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getDatetimeFormat(), DATETIMEFORMAT_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getTimeZone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getFile(), FILE_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getFileFingerprintLines(), FILEFINGERPRINTLINES_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getMultiLineStartPattern(), MULTILINESTARTPATTERN_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getInitialPosition(), INITIALPOSITION_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getEncoding(), ENCODING_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getBufferDuration(), BUFFERDURATION_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getBatchCount(), BATCHCOUNT_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogStream.getBatchSize(), BATCHSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
