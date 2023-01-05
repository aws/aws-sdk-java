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
package com.amazonaws.services.s3control.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;

import com.amazonaws.util.XMLWriter;

/**
 * SubmitMultiRegionAccessPointRoutesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitMultiRegionAccessPointRoutesRequestMarshaller implements
        Marshaller<Request<SubmitMultiRegionAccessPointRoutesRequest>, SubmitMultiRegionAccessPointRoutesRequest> {

    public Request<SubmitMultiRegionAccessPointRoutesRequest> marshall(SubmitMultiRegionAccessPointRoutesRequest submitMultiRegionAccessPointRoutesRequest) {

        if (submitMultiRegionAccessPointRoutesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SubmitMultiRegionAccessPointRoutesRequest> request = new DefaultRequest<SubmitMultiRegionAccessPointRoutesRequest>(
                submitMultiRegionAccessPointRoutesRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PATCH);

        if (submitMultiRegionAccessPointRoutesRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(submitMultiRegionAccessPointRoutesRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/mrap/instances/{mrap+}/routes";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.GREEDY.marshall(uriResourcePath, "mrap", submitMultiRegionAccessPointRoutesRequest.getMrap());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("SubmitMultiRegionAccessPointRoutesRequest");
            if (submitMultiRegionAccessPointRoutesRequest != null) {

                java.util.List<MultiRegionAccessPointRoute> submitMultiRegionAccessPointRoutesRequestRouteUpdatesList = submitMultiRegionAccessPointRoutesRequest
                        .getRouteUpdates();
                if (submitMultiRegionAccessPointRoutesRequestRouteUpdatesList != null) {
                    xmlWriter.startElement("RouteUpdates");

                    for (MultiRegionAccessPointRoute submitMultiRegionAccessPointRoutesRequestRouteUpdatesListValue : submitMultiRegionAccessPointRoutesRequestRouteUpdatesList) {
                        xmlWriter.startElement("Route");

                        if (submitMultiRegionAccessPointRoutesRequestRouteUpdatesListValue.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(submitMultiRegionAccessPointRoutesRequestRouteUpdatesListValue.getBucket()).endElement();
                        }

                        if (submitMultiRegionAccessPointRoutesRequestRouteUpdatesListValue.getRegion() != null) {
                            xmlWriter.startElement("Region").value(submitMultiRegionAccessPointRoutesRequestRouteUpdatesListValue.getRegion()).endElement();
                        }

                        if (submitMultiRegionAccessPointRoutesRequestRouteUpdatesListValue.getTrafficDialPercentage() != null) {
                            xmlWriter.startElement("TrafficDialPercentage")
                                    .value(submitMultiRegionAccessPointRoutesRequestRouteUpdatesListValue.getTrafficDialPercentage()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
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
