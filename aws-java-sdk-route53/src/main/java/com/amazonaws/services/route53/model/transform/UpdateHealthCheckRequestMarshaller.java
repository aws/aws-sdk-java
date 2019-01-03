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
 * UpdateHealthCheckRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHealthCheckRequestMarshaller implements Marshaller<Request<UpdateHealthCheckRequest>, UpdateHealthCheckRequest> {

    public Request<UpdateHealthCheckRequest> marshall(UpdateHealthCheckRequest updateHealthCheckRequest) {

        if (updateHealthCheckRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateHealthCheckRequest> request = new DefaultRequest<UpdateHealthCheckRequest>(updateHealthCheckRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-04-01/healthcheck/{HealthCheckId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "HealthCheckId",
                updateHealthCheckRequest.getHealthCheckId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("UpdateHealthCheckRequest");
            if (updateHealthCheckRequest != null) {

                if (updateHealthCheckRequest.getHealthCheckVersion() != null) {
                    xmlWriter.startElement("HealthCheckVersion").value(updateHealthCheckRequest.getHealthCheckVersion()).endElement();
                }

                if (updateHealthCheckRequest.getIPAddress() != null) {
                    xmlWriter.startElement("IPAddress").value(updateHealthCheckRequest.getIPAddress()).endElement();
                }

                if (updateHealthCheckRequest.getPort() != null) {
                    xmlWriter.startElement("Port").value(updateHealthCheckRequest.getPort()).endElement();
                }

                if (updateHealthCheckRequest.getResourcePath() != null) {
                    xmlWriter.startElement("ResourcePath").value(updateHealthCheckRequest.getResourcePath()).endElement();
                }

                if (updateHealthCheckRequest.getFullyQualifiedDomainName() != null) {
                    xmlWriter.startElement("FullyQualifiedDomainName").value(updateHealthCheckRequest.getFullyQualifiedDomainName()).endElement();
                }

                if (updateHealthCheckRequest.getSearchString() != null) {
                    xmlWriter.startElement("SearchString").value(updateHealthCheckRequest.getSearchString()).endElement();
                }

                if (updateHealthCheckRequest.getFailureThreshold() != null) {
                    xmlWriter.startElement("FailureThreshold").value(updateHealthCheckRequest.getFailureThreshold()).endElement();
                }

                if (updateHealthCheckRequest.getInverted() != null) {
                    xmlWriter.startElement("Inverted").value(updateHealthCheckRequest.getInverted()).endElement();
                }

                if (updateHealthCheckRequest.getDisabled() != null) {
                    xmlWriter.startElement("Disabled").value(updateHealthCheckRequest.getDisabled()).endElement();
                }

                if (updateHealthCheckRequest.getHealthThreshold() != null) {
                    xmlWriter.startElement("HealthThreshold").value(updateHealthCheckRequest.getHealthThreshold()).endElement();
                }

                com.amazonaws.internal.SdkInternalList<String> updateHealthCheckRequestChildHealthChecksList = (com.amazonaws.internal.SdkInternalList<String>) updateHealthCheckRequest
                        .getChildHealthChecks();
                if (!updateHealthCheckRequestChildHealthChecksList.isEmpty() || !updateHealthCheckRequestChildHealthChecksList.isAutoConstruct()) {
                    xmlWriter.startElement("ChildHealthChecks");

                    for (String updateHealthCheckRequestChildHealthChecksListValue : updateHealthCheckRequestChildHealthChecksList) {
                        xmlWriter.startElement("ChildHealthCheck");
                        xmlWriter.value(updateHealthCheckRequestChildHealthChecksListValue);
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                if (updateHealthCheckRequest.getEnableSNI() != null) {
                    xmlWriter.startElement("EnableSNI").value(updateHealthCheckRequest.getEnableSNI()).endElement();
                }

                com.amazonaws.internal.SdkInternalList<String> updateHealthCheckRequestRegionsList = (com.amazonaws.internal.SdkInternalList<String>) updateHealthCheckRequest
                        .getRegions();
                if (!updateHealthCheckRequestRegionsList.isEmpty() || !updateHealthCheckRequestRegionsList.isAutoConstruct()) {
                    xmlWriter.startElement("Regions");

                    for (String updateHealthCheckRequestRegionsListValue : updateHealthCheckRequestRegionsList) {
                        xmlWriter.startElement("Region");
                        xmlWriter.value(updateHealthCheckRequestRegionsListValue);
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                AlarmIdentifier alarmIdentifier = updateHealthCheckRequest.getAlarmIdentifier();
                if (alarmIdentifier != null) {
                    xmlWriter.startElement("AlarmIdentifier");

                    if (alarmIdentifier.getRegion() != null) {
                        xmlWriter.startElement("Region").value(alarmIdentifier.getRegion()).endElement();
                    }

                    if (alarmIdentifier.getName() != null) {
                        xmlWriter.startElement("Name").value(alarmIdentifier.getName()).endElement();
                    }
                    xmlWriter.endElement();
                }

                if (updateHealthCheckRequest.getInsufficientDataHealthStatus() != null) {
                    xmlWriter.startElement("InsufficientDataHealthStatus").value(updateHealthCheckRequest.getInsufficientDataHealthStatus()).endElement();
                }

                com.amazonaws.internal.SdkInternalList<String> updateHealthCheckRequestResetElementsList = (com.amazonaws.internal.SdkInternalList<String>) updateHealthCheckRequest
                        .getResetElements();
                if (!updateHealthCheckRequestResetElementsList.isEmpty() || !updateHealthCheckRequestResetElementsList.isAutoConstruct()) {
                    xmlWriter.startElement("ResetElements");

                    for (String updateHealthCheckRequestResetElementsListValue : updateHealthCheckRequestResetElementsList) {
                        xmlWriter.startElement("ResettableElementName");
                        xmlWriter.value(updateHealthCheckRequestResetElementsListValue);
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
