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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateDeliveryStreamRequest Marshaller
 */
public class CreateDeliveryStreamRequestMarshaller implements Marshaller<Request<CreateDeliveryStreamRequest>, CreateDeliveryStreamRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateDeliveryStreamRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateDeliveryStreamRequest> marshall(CreateDeliveryStreamRequest createDeliveryStreamRequest) {

        if (createDeliveryStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDeliveryStreamRequest> request = new DefaultRequest<CreateDeliveryStreamRequest>(createDeliveryStreamRequest, "AmazonKinesisFirehose");
        request.addHeader("X-Amz-Target", "Firehose_20150804.CreateDeliveryStream");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createDeliveryStreamRequest.getDeliveryStreamName() != null) {
                jsonGenerator.writeFieldName("DeliveryStreamName").writeValue(createDeliveryStreamRequest.getDeliveryStreamName());
            }
            if (createDeliveryStreamRequest.getS3DestinationConfiguration() != null) {
                jsonGenerator.writeFieldName("S3DestinationConfiguration");
                S3DestinationConfigurationJsonMarshaller.getInstance().marshall(createDeliveryStreamRequest.getS3DestinationConfiguration(), jsonGenerator);
            }
            if (createDeliveryStreamRequest.getRedshiftDestinationConfiguration() != null) {
                jsonGenerator.writeFieldName("RedshiftDestinationConfiguration");
                RedshiftDestinationConfigurationJsonMarshaller.getInstance().marshall(createDeliveryStreamRequest.getRedshiftDestinationConfiguration(),
                        jsonGenerator);
            }
            if (createDeliveryStreamRequest.getElasticsearchDestinationConfiguration() != null) {
                jsonGenerator.writeFieldName("ElasticsearchDestinationConfiguration");
                ElasticsearchDestinationConfigurationJsonMarshaller.getInstance().marshall(
                        createDeliveryStreamRequest.getElasticsearchDestinationConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
