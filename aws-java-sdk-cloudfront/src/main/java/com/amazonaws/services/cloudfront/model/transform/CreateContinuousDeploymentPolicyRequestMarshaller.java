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
 * CreateContinuousDeploymentPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContinuousDeploymentPolicyRequestMarshaller implements
        Marshaller<Request<CreateContinuousDeploymentPolicyRequest>, CreateContinuousDeploymentPolicyRequest> {

    public Request<CreateContinuousDeploymentPolicyRequest> marshall(CreateContinuousDeploymentPolicyRequest createContinuousDeploymentPolicyRequest) {

        if (createContinuousDeploymentPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateContinuousDeploymentPolicyRequest> request = new DefaultRequest<CreateContinuousDeploymentPolicyRequest>(
                createContinuousDeploymentPolicyRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2020-05-31/continuous-deployment-policy";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig = createContinuousDeploymentPolicyRequest.getContinuousDeploymentPolicyConfig();
            if (continuousDeploymentPolicyConfig != null) {
                xmlWriter.startElement("ContinuousDeploymentPolicyConfig");

                {
                    StagingDistributionDnsNames stagingDistributionDnsNames = continuousDeploymentPolicyConfig.getStagingDistributionDnsNames();
                    if (stagingDistributionDnsNames != null) {
                        xmlWriter.startElement("StagingDistributionDnsNames");

                        if (stagingDistributionDnsNames.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(stagingDistributionDnsNames.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<String> stagingDistributionDnsNamesItemsList = (com.amazonaws.internal.SdkInternalList<String>) stagingDistributionDnsNames
                                .getItems();
                        if (!stagingDistributionDnsNamesItemsList.isEmpty() || !stagingDistributionDnsNamesItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (String stagingDistributionDnsNamesItemsListValue : stagingDistributionDnsNamesItemsList) {
                                xmlWriter.startElement("DnsName");
                                xmlWriter.value(stagingDistributionDnsNamesItemsListValue);
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                if (continuousDeploymentPolicyConfig.getEnabled() != null) {
                    xmlWriter.startElement("Enabled").value(continuousDeploymentPolicyConfig.getEnabled()).endElement();
                }

                {
                    TrafficConfig trafficConfig = continuousDeploymentPolicyConfig.getTrafficConfig();
                    if (trafficConfig != null) {
                        xmlWriter.startElement("TrafficConfig");

                        {
                            ContinuousDeploymentSingleWeightConfig singleWeightConfig = trafficConfig.getSingleWeightConfig();
                            if (singleWeightConfig != null) {
                                xmlWriter.startElement("SingleWeightConfig");

                                if (singleWeightConfig.getWeight() != null) {
                                    xmlWriter.startElement("Weight").value(singleWeightConfig.getWeight()).endElement();
                                }

                                {
                                    SessionStickinessConfig sessionStickinessConfig = singleWeightConfig.getSessionStickinessConfig();
                                    if (sessionStickinessConfig != null) {
                                        xmlWriter.startElement("SessionStickinessConfig");

                                        if (sessionStickinessConfig.getIdleTTL() != null) {
                                            xmlWriter.startElement("IdleTTL").value(sessionStickinessConfig.getIdleTTL()).endElement();
                                        }

                                        if (sessionStickinessConfig.getMaximumTTL() != null) {
                                            xmlWriter.startElement("MaximumTTL").value(sessionStickinessConfig.getMaximumTTL()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ContinuousDeploymentSingleHeaderConfig singleHeaderConfig = trafficConfig.getSingleHeaderConfig();
                            if (singleHeaderConfig != null) {
                                xmlWriter.startElement("SingleHeaderConfig");

                                if (singleHeaderConfig.getHeader() != null) {
                                    xmlWriter.startElement("Header").value(singleHeaderConfig.getHeader()).endElement();
                                }

                                if (singleHeaderConfig.getValue() != null) {
                                    xmlWriter.startElement("Value").value(singleHeaderConfig.getValue()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (trafficConfig.getType() != null) {
                            xmlWriter.startElement("Type").value(trafficConfig.getType()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                xmlWriter.endElement();
            }

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
