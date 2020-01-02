/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateAccessPointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPointRequestMarshaller implements Marshaller<Request<CreateAccessPointRequest>, CreateAccessPointRequest> {

    public Request<CreateAccessPointRequest> marshall(CreateAccessPointRequest createAccessPointRequest) {

        if (createAccessPointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAccessPointRequest> request = new DefaultRequest<CreateAccessPointRequest>(createAccessPointRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PUT);

        if (createAccessPointRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(createAccessPointRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/accesspoint/{name}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "name", createAccessPointRequest.getName());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("CreateAccessPointRequest");
            if (createAccessPointRequest != null) {

                if (createAccessPointRequest.getBucket() != null) {
                    xmlWriter.startElement("Bucket").value(createAccessPointRequest.getBucket()).endElement();
                }

                {
                    VpcConfiguration vpcConfiguration = createAccessPointRequest.getVpcConfiguration();
                    if (vpcConfiguration != null) {
                        xmlWriter.startElement("VpcConfiguration");

                        if (vpcConfiguration.getVpcId() != null) {
                            xmlWriter.startElement("VpcId").value(vpcConfiguration.getVpcId()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    PublicAccessBlockConfiguration publicAccessBlockConfiguration = createAccessPointRequest.getPublicAccessBlockConfiguration();
                    if (publicAccessBlockConfiguration != null) {
                        xmlWriter.startElement("PublicAccessBlockConfiguration");

                        if (publicAccessBlockConfiguration.getBlockPublicAcls() != null) {
                            xmlWriter.startElement("BlockPublicAcls").value(publicAccessBlockConfiguration.getBlockPublicAcls()).endElement();
                        }

                        if (publicAccessBlockConfiguration.getIgnorePublicAcls() != null) {
                            xmlWriter.startElement("IgnorePublicAcls").value(publicAccessBlockConfiguration.getIgnorePublicAcls()).endElement();
                        }

                        if (publicAccessBlockConfiguration.getBlockPublicPolicy() != null) {
                            xmlWriter.startElement("BlockPublicPolicy").value(publicAccessBlockConfiguration.getBlockPublicPolicy()).endElement();
                        }

                        if (publicAccessBlockConfiguration.getRestrictPublicBuckets() != null) {
                            xmlWriter.startElement("RestrictPublicBuckets").value(publicAccessBlockConfiguration.getRestrictPublicBuckets()).endElement();
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
