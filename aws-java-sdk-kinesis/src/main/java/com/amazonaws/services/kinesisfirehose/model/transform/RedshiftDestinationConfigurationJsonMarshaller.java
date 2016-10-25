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
 * RedshiftDestinationConfigurationMarshaller
 */
public class RedshiftDestinationConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RedshiftDestinationConfiguration redshiftDestinationConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (redshiftDestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (redshiftDestinationConfiguration.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(redshiftDestinationConfiguration.getRoleARN());
            }
            if (redshiftDestinationConfiguration.getClusterJDBCURL() != null) {
                jsonGenerator.writeFieldName("ClusterJDBCURL").writeValue(redshiftDestinationConfiguration.getClusterJDBCURL());
            }
            if (redshiftDestinationConfiguration.getCopyCommand() != null) {
                jsonGenerator.writeFieldName("CopyCommand");
                CopyCommandJsonMarshaller.getInstance().marshall(redshiftDestinationConfiguration.getCopyCommand(), jsonGenerator);
            }
            if (redshiftDestinationConfiguration.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(redshiftDestinationConfiguration.getUsername());
            }
            if (redshiftDestinationConfiguration.getPassword() != null) {
                jsonGenerator.writeFieldName("Password").writeValue(redshiftDestinationConfiguration.getPassword());
            }
            if (redshiftDestinationConfiguration.getRetryOptions() != null) {
                jsonGenerator.writeFieldName("RetryOptions");
                RedshiftRetryOptionsJsonMarshaller.getInstance().marshall(redshiftDestinationConfiguration.getRetryOptions(), jsonGenerator);
            }
            if (redshiftDestinationConfiguration.getS3Configuration() != null) {
                jsonGenerator.writeFieldName("S3Configuration");
                S3DestinationConfigurationJsonMarshaller.getInstance().marshall(redshiftDestinationConfiguration.getS3Configuration(), jsonGenerator);
            }
            if (redshiftDestinationConfiguration.getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller.getInstance().marshall(redshiftDestinationConfiguration.getCloudWatchLoggingOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RedshiftDestinationConfigurationJsonMarshaller instance;

    public static RedshiftDestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDestinationConfigurationJsonMarshaller();
        return instance;
    }

}
