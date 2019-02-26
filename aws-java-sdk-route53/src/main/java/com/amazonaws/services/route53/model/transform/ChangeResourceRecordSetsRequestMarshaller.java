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
 * ChangeResourceRecordSetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeResourceRecordSetsRequestMarshaller implements Marshaller<Request<ChangeResourceRecordSetsRequest>, ChangeResourceRecordSetsRequest> {

    public Request<ChangeResourceRecordSetsRequest> marshall(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest) {

        if (changeResourceRecordSetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ChangeResourceRecordSetsRequest> request = new DefaultRequest<ChangeResourceRecordSetsRequest>(changeResourceRecordSetsRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-04-01/hostedzone/{Id}/rrset/";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", changeResourceRecordSetsRequest.getHostedZoneId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("ChangeResourceRecordSetsRequest");
            if (changeResourceRecordSetsRequest != null) {

                ChangeBatch changeBatch = changeResourceRecordSetsRequest.getChangeBatch();
                if (changeBatch != null) {
                    xmlWriter.startElement("ChangeBatch");

                    if (changeBatch.getComment() != null) {
                        xmlWriter.startElement("Comment").value(changeBatch.getComment()).endElement();
                    }

                    com.amazonaws.internal.SdkInternalList<Change> changeBatchChangesList = (com.amazonaws.internal.SdkInternalList<Change>) changeBatch
                            .getChanges();
                    if (!changeBatchChangesList.isEmpty() || !changeBatchChangesList.isAutoConstruct()) {
                        xmlWriter.startElement("Changes");

                        for (Change changeBatchChangesListValue : changeBatchChangesList) {
                            xmlWriter.startElement("Change");

                            if (changeBatchChangesListValue.getAction() != null) {
                                xmlWriter.startElement("Action").value(changeBatchChangesListValue.getAction()).endElement();
                            }

                            ResourceRecordSet resourceRecordSet = changeBatchChangesListValue.getResourceRecordSet();
                            if (resourceRecordSet != null) {
                                xmlWriter.startElement("ResourceRecordSet");

                                if (resourceRecordSet.getName() != null) {
                                    xmlWriter.startElement("Name").value(resourceRecordSet.getName()).endElement();
                                }

                                if (resourceRecordSet.getType() != null) {
                                    xmlWriter.startElement("Type").value(resourceRecordSet.getType()).endElement();
                                }

                                if (resourceRecordSet.getSetIdentifier() != null) {
                                    xmlWriter.startElement("SetIdentifier").value(resourceRecordSet.getSetIdentifier()).endElement();
                                }

                                if (resourceRecordSet.getWeight() != null) {
                                    xmlWriter.startElement("Weight").value(resourceRecordSet.getWeight()).endElement();
                                }

                                if (resourceRecordSet.getRegion() != null) {
                                    xmlWriter.startElement("Region").value(resourceRecordSet.getRegion()).endElement();
                                }

                                GeoLocation geoLocation = resourceRecordSet.getGeoLocation();
                                if (geoLocation != null) {
                                    xmlWriter.startElement("GeoLocation");

                                    if (geoLocation.getContinentCode() != null) {
                                        xmlWriter.startElement("ContinentCode").value(geoLocation.getContinentCode()).endElement();
                                    }

                                    if (geoLocation.getCountryCode() != null) {
                                        xmlWriter.startElement("CountryCode").value(geoLocation.getCountryCode()).endElement();
                                    }

                                    if (geoLocation.getSubdivisionCode() != null) {
                                        xmlWriter.startElement("SubdivisionCode").value(geoLocation.getSubdivisionCode()).endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                if (resourceRecordSet.getFailover() != null) {
                                    xmlWriter.startElement("Failover").value(resourceRecordSet.getFailover()).endElement();
                                }

                                if (resourceRecordSet.getMultiValueAnswer() != null) {
                                    xmlWriter.startElement("MultiValueAnswer").value(resourceRecordSet.getMultiValueAnswer()).endElement();
                                }

                                if (resourceRecordSet.getTTL() != null) {
                                    xmlWriter.startElement("TTL").value(resourceRecordSet.getTTL()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<ResourceRecord> resourceRecordSetResourceRecordsList = (com.amazonaws.internal.SdkInternalList<ResourceRecord>) resourceRecordSet
                                        .getResourceRecords();
                                if (!resourceRecordSetResourceRecordsList.isEmpty() || !resourceRecordSetResourceRecordsList.isAutoConstruct()) {
                                    xmlWriter.startElement("ResourceRecords");

                                    for (ResourceRecord resourceRecordSetResourceRecordsListValue : resourceRecordSetResourceRecordsList) {
                                        xmlWriter.startElement("ResourceRecord");

                                        if (resourceRecordSetResourceRecordsListValue.getValue() != null) {
                                            xmlWriter.startElement("Value").value(resourceRecordSetResourceRecordsListValue.getValue()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                AliasTarget aliasTarget = resourceRecordSet.getAliasTarget();
                                if (aliasTarget != null) {
                                    xmlWriter.startElement("AliasTarget");

                                    if (aliasTarget.getHostedZoneId() != null) {
                                        xmlWriter.startElement("HostedZoneId").value(aliasTarget.getHostedZoneId()).endElement();
                                    }

                                    if (aliasTarget.getDNSName() != null) {
                                        xmlWriter.startElement("DNSName").value(aliasTarget.getDNSName()).endElement();
                                    }

                                    if (aliasTarget.getEvaluateTargetHealth() != null) {
                                        xmlWriter.startElement("EvaluateTargetHealth").value(aliasTarget.getEvaluateTargetHealth()).endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                if (resourceRecordSet.getHealthCheckId() != null) {
                                    xmlWriter.startElement("HealthCheckId").value(resourceRecordSet.getHealthCheckId()).endElement();
                                }

                                if (resourceRecordSet.getTrafficPolicyInstanceId() != null) {
                                    xmlWriter.startElement("TrafficPolicyInstanceId").value(resourceRecordSet.getTrafficPolicyInstanceId()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
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
