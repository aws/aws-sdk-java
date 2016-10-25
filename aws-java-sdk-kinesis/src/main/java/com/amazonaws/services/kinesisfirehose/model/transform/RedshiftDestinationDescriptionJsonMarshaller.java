/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RedshiftDestinationDescriptionMarshaller
 */
public class RedshiftDestinationDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RedshiftDestinationDescription redshiftDestinationDescription, StructuredJsonGenerator jsonGenerator) {

        if (redshiftDestinationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (redshiftDestinationDescription.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(redshiftDestinationDescription.getRoleARN());
            }
            if (redshiftDestinationDescription.getClusterJDBCURL() != null) {
                jsonGenerator.writeFieldName("ClusterJDBCURL").writeValue(redshiftDestinationDescription.getClusterJDBCURL());
            }
            if (redshiftDestinationDescription.getCopyCommand() != null) {
                jsonGenerator.writeFieldName("CopyCommand");
                CopyCommandJsonMarshaller.getInstance().marshall(redshiftDestinationDescription.getCopyCommand(), jsonGenerator);
            }
            if (redshiftDestinationDescription.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(redshiftDestinationDescription.getUsername());
            }
            if (redshiftDestinationDescription.getRetryOptions() != null) {
                jsonGenerator.writeFieldName("RetryOptions");
                RedshiftRetryOptionsJsonMarshaller.getInstance().marshall(redshiftDestinationDescription.getRetryOptions(), jsonGenerator);
            }
            if (redshiftDestinationDescription.getS3DestinationDescription() != null) {
                jsonGenerator.writeFieldName("S3DestinationDescription");
                S3DestinationDescriptionJsonMarshaller.getInstance().marshall(redshiftDestinationDescription.getS3DestinationDescription(), jsonGenerator);
            }
            if (redshiftDestinationDescription.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(redshiftDestinationDescription.getCloudWatchLoggingOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RedshiftDestinationDescriptionJsonMarshaller instance;

    public static RedshiftDestinationDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDestinationDescriptionJsonMarshaller();
        return instance;
    }

}
