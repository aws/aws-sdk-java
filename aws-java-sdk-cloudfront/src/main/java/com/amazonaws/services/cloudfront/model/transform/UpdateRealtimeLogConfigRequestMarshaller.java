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
 * UpdateRealtimeLogConfigRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRealtimeLogConfigRequestMarshaller implements Marshaller<Request<UpdateRealtimeLogConfigRequest>, UpdateRealtimeLogConfigRequest> {

    public Request<UpdateRealtimeLogConfigRequest> marshall(UpdateRealtimeLogConfigRequest updateRealtimeLogConfigRequest) {

        if (updateRealtimeLogConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateRealtimeLogConfigRequest> request = new DefaultRequest<UpdateRealtimeLogConfigRequest>(updateRealtimeLogConfigRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/2020-05-31/realtime-log-config/";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            xmlWriter.startElement("UpdateRealtimeLogConfigRequest");
            if (updateRealtimeLogConfigRequest != null) {

                com.amazonaws.internal.SdkInternalList<EndPoint> updateRealtimeLogConfigRequestEndPointsList = (com.amazonaws.internal.SdkInternalList<EndPoint>) updateRealtimeLogConfigRequest
                        .getEndPoints();
                if (!updateRealtimeLogConfigRequestEndPointsList.isEmpty() || !updateRealtimeLogConfigRequestEndPointsList.isAutoConstruct()) {
                    xmlWriter.startElement("EndPoints");

                    for (EndPoint updateRealtimeLogConfigRequestEndPointsListValue : updateRealtimeLogConfigRequestEndPointsList) {
                        xmlWriter.startElement("member");

                        if (updateRealtimeLogConfigRequestEndPointsListValue.getStreamType() != null) {
                            xmlWriter.startElement("StreamType").value(updateRealtimeLogConfigRequestEndPointsListValue.getStreamType()).endElement();
                        }

                        {
                            KinesisStreamConfig kinesisStreamConfig = updateRealtimeLogConfigRequestEndPointsListValue.getKinesisStreamConfig();
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

                com.amazonaws.internal.SdkInternalList<String> updateRealtimeLogConfigRequestFieldsList = (com.amazonaws.internal.SdkInternalList<String>) updateRealtimeLogConfigRequest
                        .getFields();
                if (!updateRealtimeLogConfigRequestFieldsList.isEmpty() || !updateRealtimeLogConfigRequestFieldsList.isAutoConstruct()) {
                    xmlWriter.startElement("Fields");

                    for (String updateRealtimeLogConfigRequestFieldsListValue : updateRealtimeLogConfigRequestFieldsList) {
                        xmlWriter.startElement("Field");
                        xmlWriter.value(updateRealtimeLogConfigRequestFieldsListValue);
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                if (updateRealtimeLogConfigRequest.getName() != null) {
                    xmlWriter.startElement("Name").value(updateRealtimeLogConfigRequest.getName()).endElement();
                }

                if (updateRealtimeLogConfigRequest.getARN() != null) {
                    xmlWriter.startElement("ARN").value(updateRealtimeLogConfigRequest.getARN()).endElement();
                }

                if (updateRealtimeLogConfigRequest.getSamplingRate() != null) {
                    xmlWriter.startElement("SamplingRate").value(updateRealtimeLogConfigRequest.getSamplingRate()).endElement();
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
