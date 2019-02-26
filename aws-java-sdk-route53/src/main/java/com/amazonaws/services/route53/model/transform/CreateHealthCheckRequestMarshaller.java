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
 * CreateHealthCheckRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHealthCheckRequestMarshaller implements Marshaller<Request<CreateHealthCheckRequest>, CreateHealthCheckRequest> {

    public Request<CreateHealthCheckRequest> marshall(CreateHealthCheckRequest createHealthCheckRequest) {

        if (createHealthCheckRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateHealthCheckRequest> request = new DefaultRequest<CreateHealthCheckRequest>(createHealthCheckRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-04-01/healthcheck";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("CreateHealthCheckRequest");
            if (createHealthCheckRequest != null) {

                if (createHealthCheckRequest.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(createHealthCheckRequest.getCallerReference()).endElement();
                }

                HealthCheckConfig healthCheckConfig = createHealthCheckRequest.getHealthCheckConfig();
                if (healthCheckConfig != null) {
                    xmlWriter.startElement("HealthCheckConfig");

                    if (healthCheckConfig.getIPAddress() != null) {
                        xmlWriter.startElement("IPAddress").value(healthCheckConfig.getIPAddress()).endElement();
                    }

                    if (healthCheckConfig.getPort() != null) {
                        xmlWriter.startElement("Port").value(healthCheckConfig.getPort()).endElement();
                    }

                    if (healthCheckConfig.getType() != null) {
                        xmlWriter.startElement("Type").value(healthCheckConfig.getType()).endElement();
                    }

                    if (healthCheckConfig.getResourcePath() != null) {
                        xmlWriter.startElement("ResourcePath").value(healthCheckConfig.getResourcePath()).endElement();
                    }

                    if (healthCheckConfig.getFullyQualifiedDomainName() != null) {
                        xmlWriter.startElement("FullyQualifiedDomainName").value(healthCheckConfig.getFullyQualifiedDomainName()).endElement();
                    }

                    if (healthCheckConfig.getSearchString() != null) {
                        xmlWriter.startElement("SearchString").value(healthCheckConfig.getSearchString()).endElement();
                    }

                    if (healthCheckConfig.getRequestInterval() != null) {
                        xmlWriter.startElement("RequestInterval").value(healthCheckConfig.getRequestInterval()).endElement();
                    }

                    if (healthCheckConfig.getFailureThreshold() != null) {
                        xmlWriter.startElement("FailureThreshold").value(healthCheckConfig.getFailureThreshold()).endElement();
                    }

                    if (healthCheckConfig.getMeasureLatency() != null) {
                        xmlWriter.startElement("MeasureLatency").value(healthCheckConfig.getMeasureLatency()).endElement();
                    }

                    if (healthCheckConfig.getInverted() != null) {
                        xmlWriter.startElement("Inverted").value(healthCheckConfig.getInverted()).endElement();
                    }

                    if (healthCheckConfig.getDisabled() != null) {
                        xmlWriter.startElement("Disabled").value(healthCheckConfig.getDisabled()).endElement();
                    }

                    if (healthCheckConfig.getHealthThreshold() != null) {
                        xmlWriter.startElement("HealthThreshold").value(healthCheckConfig.getHealthThreshold()).endElement();
                    }

                    com.amazonaws.internal.SdkInternalList<String> healthCheckConfigChildHealthChecksList = (com.amazonaws.internal.SdkInternalList<String>) healthCheckConfig
                            .getChildHealthChecks();
                    if (!healthCheckConfigChildHealthChecksList.isEmpty() || !healthCheckConfigChildHealthChecksList.isAutoConstruct()) {
                        xmlWriter.startElement("ChildHealthChecks");

                        for (String healthCheckConfigChildHealthChecksListValue : healthCheckConfigChildHealthChecksList) {
                            xmlWriter.startElement("ChildHealthCheck");
                            xmlWriter.value(healthCheckConfigChildHealthChecksListValue);
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    if (healthCheckConfig.getEnableSNI() != null) {
                        xmlWriter.startElement("EnableSNI").value(healthCheckConfig.getEnableSNI()).endElement();
                    }

                    com.amazonaws.internal.SdkInternalList<String> healthCheckConfigRegionsList = (com.amazonaws.internal.SdkInternalList<String>) healthCheckConfig
                            .getRegions();
                    if (!healthCheckConfigRegionsList.isEmpty() || !healthCheckConfigRegionsList.isAutoConstruct()) {
                        xmlWriter.startElement("Regions");

                        for (String healthCheckConfigRegionsListValue : healthCheckConfigRegionsList) {
                            xmlWriter.startElement("Region");
                            xmlWriter.value(healthCheckConfigRegionsListValue);
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    AlarmIdentifier alarmIdentifier = healthCheckConfig.getAlarmIdentifier();
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

                    if (healthCheckConfig.getInsufficientDataHealthStatus() != null) {
                        xmlWriter.startElement("InsufficientDataHealthStatus").value(healthCheckConfig.getInsufficientDataHealthStatus()).endElement();
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
