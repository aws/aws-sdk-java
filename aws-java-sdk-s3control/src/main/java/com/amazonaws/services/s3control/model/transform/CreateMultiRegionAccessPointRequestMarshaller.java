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
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;

/**
 * CreateMultiRegionAccessPointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMultiRegionAccessPointRequestMarshaller implements
        Marshaller<Request<CreateMultiRegionAccessPointRequest>, CreateMultiRegionAccessPointRequest> {

    public Request<CreateMultiRegionAccessPointRequest> marshall(CreateMultiRegionAccessPointRequest createMultiRegionAccessPointRequest) {

        if (createMultiRegionAccessPointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateMultiRegionAccessPointRequest> request = new DefaultRequest<CreateMultiRegionAccessPointRequest>(createMultiRegionAccessPointRequest,
                "AWSS3Control");

        request.setHttpMethod(HttpMethodName.POST);

        if (createMultiRegionAccessPointRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(createMultiRegionAccessPointRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/async-requests/mrap/create";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("CreateMultiRegionAccessPointRequest");
            if (createMultiRegionAccessPointRequest != null) {

                xmlWriter.startElement("ClientToken").value(IdempotentUtils.resolveString(createMultiRegionAccessPointRequest.getClientToken())).endElement();

                {
                    CreateMultiRegionAccessPointInput details = createMultiRegionAccessPointRequest.getDetails();
                    if (details != null) {
                        xmlWriter.startElement("Details");

                        if (details.getName() != null) {
                            xmlWriter.startElement("Name").value(details.getName()).endElement();
                        }

                        {
                            PublicAccessBlockConfiguration publicAccessBlock = details.getPublicAccessBlock();
                            if (publicAccessBlock != null) {
                                xmlWriter.startElement("PublicAccessBlock");

                                if (publicAccessBlock.getBlockPublicAcls() != null) {
                                    xmlWriter.startElement("BlockPublicAcls").value(publicAccessBlock.getBlockPublicAcls()).endElement();
                                }

                                if (publicAccessBlock.getIgnorePublicAcls() != null) {
                                    xmlWriter.startElement("IgnorePublicAcls").value(publicAccessBlock.getIgnorePublicAcls()).endElement();
                                }

                                if (publicAccessBlock.getBlockPublicPolicy() != null) {
                                    xmlWriter.startElement("BlockPublicPolicy").value(publicAccessBlock.getBlockPublicPolicy()).endElement();
                                }

                                if (publicAccessBlock.getRestrictPublicBuckets() != null) {
                                    xmlWriter.startElement("RestrictPublicBuckets").value(publicAccessBlock.getRestrictPublicBuckets()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        java.util.List<Region> createMultiRegionAccessPointInputRegionsList = details.getRegions();
                        if (createMultiRegionAccessPointInputRegionsList != null) {
                            xmlWriter.startElement("Regions");

                            for (Region createMultiRegionAccessPointInputRegionsListValue : createMultiRegionAccessPointInputRegionsList) {
                                xmlWriter.startElement("Region");

                                if (createMultiRegionAccessPointInputRegionsListValue.getBucket() != null) {
                                    xmlWriter.startElement("Bucket").value(createMultiRegionAccessPointInputRegionsListValue.getBucket()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
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
