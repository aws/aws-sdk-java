/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateAccessGrantRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessGrantRequestMarshaller implements Marshaller<Request<CreateAccessGrantRequest>, CreateAccessGrantRequest> {

    public Request<CreateAccessGrantRequest> marshall(CreateAccessGrantRequest createAccessGrantRequest) {

        if (createAccessGrantRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAccessGrantRequest> request = new DefaultRequest<CreateAccessGrantRequest>(createAccessGrantRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.POST);

        if (createAccessGrantRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(createAccessGrantRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/accessgrantsinstance/grant";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("CreateAccessGrantRequest");
            if (createAccessGrantRequest != null) {

                if (createAccessGrantRequest.getAccessGrantsLocationId() != null) {
                    xmlWriter.startElement("AccessGrantsLocationId").value(createAccessGrantRequest.getAccessGrantsLocationId()).endElement();
                }

                {
                    AccessGrantsLocationConfiguration accessGrantsLocationConfiguration = createAccessGrantRequest.getAccessGrantsLocationConfiguration();
                    if (accessGrantsLocationConfiguration != null) {
                        xmlWriter.startElement("AccessGrantsLocationConfiguration");

                        if (accessGrantsLocationConfiguration.getS3SubPrefix() != null) {
                            xmlWriter.startElement("S3SubPrefix").value(accessGrantsLocationConfiguration.getS3SubPrefix()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    Grantee grantee = createAccessGrantRequest.getGrantee();
                    if (grantee != null) {
                        xmlWriter.startElement("Grantee");

                        if (grantee.getGranteeType() != null) {
                            xmlWriter.startElement("GranteeType").value(grantee.getGranteeType()).endElement();
                        }

                        if (grantee.getGranteeIdentifier() != null) {
                            xmlWriter.startElement("GranteeIdentifier").value(grantee.getGranteeIdentifier()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                if (createAccessGrantRequest.getPermission() != null) {
                    xmlWriter.startElement("Permission").value(createAccessGrantRequest.getPermission()).endElement();
                }

                if (createAccessGrantRequest.getApplicationArn() != null) {
                    xmlWriter.startElement("ApplicationArn").value(createAccessGrantRequest.getApplicationArn()).endElement();
                }

                if (createAccessGrantRequest.getS3PrefixType() != null) {
                    xmlWriter.startElement("S3PrefixType").value(createAccessGrantRequest.getS3PrefixType()).endElement();
                }

                java.util.List<Tag> createAccessGrantRequestTagsList = createAccessGrantRequest.getTags();
                if (createAccessGrantRequestTagsList != null) {
                    xmlWriter.startElement("Tags");

                    for (Tag createAccessGrantRequestTagsListValue : createAccessGrantRequestTagsList) {
                        xmlWriter.startElement("Tag");

                        if (createAccessGrantRequestTagsListValue.getKey() != null) {
                            xmlWriter.startElement("Key").value(createAccessGrantRequestTagsListValue.getKey()).endElement();
                        }

                        if (createAccessGrantRequestTagsListValue.getValue() != null) {
                            xmlWriter.startElement("Value").value(createAccessGrantRequestTagsListValue.getValue()).endElement();
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
