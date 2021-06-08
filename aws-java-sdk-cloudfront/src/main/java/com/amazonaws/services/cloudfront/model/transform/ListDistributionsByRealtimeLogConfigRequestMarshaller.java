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
 * ListDistributionsByRealtimeLogConfigRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionsByRealtimeLogConfigRequestMarshaller implements
        Marshaller<Request<ListDistributionsByRealtimeLogConfigRequest>, ListDistributionsByRealtimeLogConfigRequest> {

    public Request<ListDistributionsByRealtimeLogConfigRequest> marshall(ListDistributionsByRealtimeLogConfigRequest listDistributionsByRealtimeLogConfigRequest) {

        if (listDistributionsByRealtimeLogConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListDistributionsByRealtimeLogConfigRequest> request = new DefaultRequest<ListDistributionsByRealtimeLogConfigRequest>(
                listDistributionsByRealtimeLogConfigRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2020-05-31/distributionsByRealtimeLogConfig/";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            xmlWriter.startElement("ListDistributionsByRealtimeLogConfigRequest");
            if (listDistributionsByRealtimeLogConfigRequest != null) {

                if (listDistributionsByRealtimeLogConfigRequest.getMarker() != null) {
                    xmlWriter.startElement("Marker").value(listDistributionsByRealtimeLogConfigRequest.getMarker()).endElement();
                }

                if (listDistributionsByRealtimeLogConfigRequest.getMaxItems() != null) {
                    xmlWriter.startElement("MaxItems").value(listDistributionsByRealtimeLogConfigRequest.getMaxItems()).endElement();
                }

                if (listDistributionsByRealtimeLogConfigRequest.getRealtimeLogConfigName() != null) {
                    xmlWriter.startElement("RealtimeLogConfigName").value(listDistributionsByRealtimeLogConfigRequest.getRealtimeLogConfigName()).endElement();
                }

                if (listDistributionsByRealtimeLogConfigRequest.getRealtimeLogConfigArn() != null) {
                    xmlWriter.startElement("RealtimeLogConfigArn").value(listDistributionsByRealtimeLogConfigRequest.getRealtimeLogConfigArn()).endElement();
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
