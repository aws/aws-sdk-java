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
 * RedshiftDestinationUpdateMarshaller
 */
public class RedshiftDestinationUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RedshiftDestinationUpdate redshiftDestinationUpdate, StructuredJsonGenerator jsonGenerator) {

        if (redshiftDestinationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (redshiftDestinationUpdate.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(redshiftDestinationUpdate.getRoleARN());
            }
            if (redshiftDestinationUpdate.getClusterJDBCURL() != null) {
                jsonGenerator.writeFieldName("ClusterJDBCURL").writeValue(redshiftDestinationUpdate.getClusterJDBCURL());
            }
            if (redshiftDestinationUpdate.getCopyCommand() != null) {
                jsonGenerator.writeFieldName("CopyCommand");
                CopyCommandJsonMarshaller.getInstance().marshall(redshiftDestinationUpdate.getCopyCommand(), jsonGenerator);
            }
            if (redshiftDestinationUpdate.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(redshiftDestinationUpdate.getUsername());
            }
            if (redshiftDestinationUpdate.getPassword() != null) {
                jsonGenerator.writeFieldName("Password").writeValue(redshiftDestinationUpdate.getPassword());
            }
            if (redshiftDestinationUpdate.getRetryOptions() != null) {
                jsonGenerator.writeFieldName("RetryOptions");
                RedshiftRetryOptionsJsonMarshaller.getInstance().marshall(redshiftDestinationUpdate.getRetryOptions(), jsonGenerator);
            }
            if (redshiftDestinationUpdate.getS3Update() != null) {
                jsonGenerator.writeFieldName("S3Update");
                S3DestinationUpdateJsonMarshaller.getInstance().marshall(redshiftDestinationUpdate.getS3Update(), jsonGenerator);
            }
            if (redshiftDestinationUpdate.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(redshiftDestinationUpdate.getCloudWatchLoggingOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RedshiftDestinationUpdateJsonMarshaller instance;

    public static RedshiftDestinationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDestinationUpdateJsonMarshaller();
        return instance;
    }

}
