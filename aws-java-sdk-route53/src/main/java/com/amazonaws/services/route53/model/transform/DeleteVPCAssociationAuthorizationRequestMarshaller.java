/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;

import com.amazonaws.util.XMLWriter;

/**
 * DeleteVPCAssociationAuthorizationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVPCAssociationAuthorizationRequestMarshaller implements
        Marshaller<Request<DeleteVPCAssociationAuthorizationRequest>, DeleteVPCAssociationAuthorizationRequest> {

    public Request<DeleteVPCAssociationAuthorizationRequest> marshall(DeleteVPCAssociationAuthorizationRequest deleteVPCAssociationAuthorizationRequest) {

        if (deleteVPCAssociationAuthorizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteVPCAssociationAuthorizationRequest> request = new DefaultRequest<DeleteVPCAssociationAuthorizationRequest>(
                deleteVPCAssociationAuthorizationRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-04-01/hostedzone/{Id}/deauthorizevpcassociation";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id",
                deleteVPCAssociationAuthorizationRequest.getHostedZoneId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("DeleteVPCAssociationAuthorizationRequest");
            if (deleteVPCAssociationAuthorizationRequest != null) {

                VPC vPC = deleteVPCAssociationAuthorizationRequest.getVPC();
                if (vPC != null) {
                    xmlWriter.startElement("VPC");

                    if (vPC.getVPCRegion() != null) {
                        xmlWriter.startElement("VPCRegion").value(vPC.getVPCRegion()).endElement();
                    }

                    if (vPC.getVPCId() != null) {
                        xmlWriter.startElement("VPCId").value(vPC.getVPCId()).endElement();
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
