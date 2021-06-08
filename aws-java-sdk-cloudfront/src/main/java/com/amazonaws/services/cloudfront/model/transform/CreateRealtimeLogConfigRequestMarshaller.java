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
package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;

import com.amazonaws.util.XMLWriter;

/**
 * CreateRealtimeLogConfigRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRealtimeLogConfigRequestMarshaller implements Marshaller<Request<CreateRealtimeLogConfigRequest>, CreateRealtimeLogConfigRequest> {

    public Request<CreateRealtimeLogConfigRequest> marshall(CreateRealtimeLogConfigRequest createRealtimeLogConfigRequest) {

        if (createRealtimeLogConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRealtimeLogConfigRequest> request = new DefaultRequest<CreateRealtimeLogConfigRequest>(createRealtimeLogConfigRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2020-05-31/realtime-log-config";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            xmlWriter.startElement("CreateRealtimeLogConfigRequest");
            if (createRealtimeLogConfigRequest != null) {

                com.amazonaws.internal.SdkInternalList<EndPoint> createRealtimeLogConfigRequestEndPointsList = (com.amazonaws.internal.SdkInternalList<EndPoint>) createRealtimeLogConfigRequest
                        .getEndPoints();
                if (!createRealtimeLogConfigRequestEndPointsList.isEmpty() || !createRealtimeLogConfigRequestEndPointsList.isAutoConstruct()) {
                    xmlWriter.startElement("EndPoints");

                    for (EndPoint createRealtimeLogConfigRequestEndPointsListValue : createRealtimeLogConfigRequestEndPointsList) {
                        xmlWriter.startElement("member");

                        if (createRealtimeLogConfigRequestEndPointsListValue.getStreamType() != null) {
                            xmlWriter.startElement("StreamType").value(createRealtimeLogConfigRequestEndPointsListValue.getStreamType()).endElement();
                        }

                        {
                            KinesisStreamConfig kinesisStreamConfig = createRealtimeLogConfigRequestEndPointsListValue.getKinesisStreamConfig();
                            if (kinesisStreamConfig != null) {
                                xmlWriter.startElement("KinesisStreamConfig");

                                if (kinesisStreamConfig.getRoleARN() != null) {
                                    xmlWriter.startElement("RoleARN").value(kinesisStreamConfig.getRoleARN()).endElement();
                                }

                                if (kinesisStreamConfig.getStreamARN() != null) {
                                    xmlWriter.startElement("StreamARN").value(kinesisStreamConfig.getStreamARN()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                com.amazonaws.internal.SdkInternalList<String> createRealtimeLogConfigRequestFieldsList = (com.amazonaws.internal.SdkInternalList<String>) createRealtimeLogConfigRequest
                        .getFields();
                if (!createRealtimeLogConfigRequestFieldsList.isEmpty() || !createRealtimeLogConfigRequestFieldsList.isAutoConstruct()) {
                    xmlWriter.startElement("Fields");

                    for (String createRealtimeLogConfigRequestFieldsListValue : createRealtimeLogConfigRequestFieldsList) {
                        xmlWriter.startElement("Field");
                        xmlWriter.value(createRealtimeLogConfigRequestFieldsListValue);
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                if (createRealtimeLogConfigRequest.getName() != null) {
                    xmlWriter.startElement("Name").value(createRealtimeLogConfigRequest.getName()).endElement();
                }

                if (createRealtimeLogConfigRequest.getSamplingRate() != null) {
                    xmlWriter.startElement("SamplingRate").value(createRealtimeLogConfigRequest.getSamplingRate()).endElement();
                }
            }
            xmlWriter.endElement();

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
