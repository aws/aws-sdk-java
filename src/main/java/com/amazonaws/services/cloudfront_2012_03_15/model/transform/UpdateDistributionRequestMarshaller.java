/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront_2012_03_15.model.transform;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront_2012_03_15.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Update Distribution Request Marshaller
 */
public class UpdateDistributionRequestMarshaller implements Marshaller<Request<UpdateDistributionRequest>, UpdateDistributionRequest> {

    public Request<UpdateDistributionRequest> marshall(UpdateDistributionRequest updateDistributionRequest) {
        if (updateDistributionRequest == null) { 
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateDistributionRequest> request = new DefaultRequest<UpdateDistributionRequest>(updateDistributionRequest, "AmazonCloudFront");
        request.setHttpMethod(HttpMethodName.PUT);
        if (updateDistributionRequest.getIfMatch() != null) 
        	request.addHeader("If-Match", updateDistributionRequest.getIfMatch());
        

        String uriResourcePath = "2012-03-15/distribution/{Id}/config"; 
        uriResourcePath = uriResourcePath.replace("{Id}", getString(updateDistributionRequest.getId())); 

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);

        
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2012-03-15/");

                    if (updateDistributionRequest != null) {
            DistributionConfig distributionConfigDistributionConfig = updateDistributionRequest.getDistributionConfig();
            if (distributionConfigDistributionConfig != null) {
                xmlWriter.startElement("DistributionConfig");
                if (distributionConfigDistributionConfig != null) {
                    S3Origin s3OriginS3Origin = distributionConfigDistributionConfig.getS3Origin();
                    if (s3OriginS3Origin != null) {
                        xmlWriter.startElement("S3Origin");
                        if (s3OriginS3Origin.getDNSName() != null) {
                            xmlWriter.startElement("DNSName").value(s3OriginS3Origin.getDNSName()).endElement();
                        }
                        if (s3OriginS3Origin.getOriginAccessIdentity() != null) {
                            xmlWriter.startElement("OriginAccessIdentity").value(s3OriginS3Origin.getOriginAccessIdentity()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig != null) {
                    CustomOrigin customOriginCustomOrigin = distributionConfigDistributionConfig.getCustomOrigin();
                    if (customOriginCustomOrigin != null) {
                        xmlWriter.startElement("CustomOrigin");
                        if (customOriginCustomOrigin.getDNSName() != null) {
                            xmlWriter.startElement("DNSName").value(customOriginCustomOrigin.getDNSName()).endElement();
                        }
                        if (customOriginCustomOrigin.getHTTPPort() != null) {
                            xmlWriter.startElement("HTTPPort").value(customOriginCustomOrigin.getHTTPPort()).endElement();
                        }
                        if (customOriginCustomOrigin.getHTTPSPort() != null) {
                            xmlWriter.startElement("HTTPSPort").value(customOriginCustomOrigin.getHTTPSPort()).endElement();
                        }
                        if (customOriginCustomOrigin.getOriginProtocolPolicy() != null) {
                            xmlWriter.startElement("OriginProtocolPolicy").value(customOriginCustomOrigin.getOriginProtocolPolicy()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(distributionConfigDistributionConfig.getCallerReference()).endElement();
                }

                if (distributionConfigDistributionConfig != null) {
                    java.util.List<String> cNAMEList = distributionConfigDistributionConfig.getCNAME();
                    if (cNAMEList != null && cNAMEList.size() > 0) {
                        int cNAMEListIndex = 1;
                        for (String cNAMEListValue : cNAMEList) {

                        xmlWriter.startElement("CNAME");
                            xmlWriter.value(cNAMEListValue);
                        xmlWriter.endElement();


                            cNAMEListIndex++;
                        }
                    }
                }
                if (distributionConfigDistributionConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(distributionConfigDistributionConfig.getComment()).endElement();
                }
                if (distributionConfigDistributionConfig.isEnabled() != null) {
                    xmlWriter.startElement("Enabled").value(distributionConfigDistributionConfig.isEnabled()).endElement();
                }
                if (distributionConfigDistributionConfig != null) {
                    LoggingConfig loggingConfigLogging = distributionConfigDistributionConfig.getLogging();
                    if (loggingConfigLogging != null) {
                        xmlWriter.startElement("Logging");
                        if (loggingConfigLogging.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(loggingConfigLogging.getBucket()).endElement();
                        }
                        if (loggingConfigLogging.getPrefix() != null) {
                            xmlWriter.startElement("Prefix").value(loggingConfigLogging.getPrefix()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig != null) {
                    TrustedSigners trustedSignersTrustedSigners = distributionConfigDistributionConfig.getTrustedSigners();
                    if (trustedSignersTrustedSigners != null) {
                        xmlWriter.startElement("TrustedSigners");
                        if (trustedSignersTrustedSigners.getSelf() != null) {
                            xmlWriter.startElement("Self").value(trustedSignersTrustedSigners.getSelf()).endElement();
                        }

                        if (trustedSignersTrustedSigners != null) {
                            java.util.List<String> awsAccountNumbersList = trustedSignersTrustedSigners.getAwsAccountNumbers();
                            if (awsAccountNumbersList != null && awsAccountNumbersList.size() > 0) {
                                int awsAccountNumbersListIndex = 1;
                                for (String awsAccountNumbersListValue : awsAccountNumbersList) {

                                xmlWriter.startElement("AwsAccountNumber");
                                    xmlWriter.value(awsAccountNumbersListValue);
                                xmlWriter.endElement();


                                    awsAccountNumbersListIndex++;
                                }
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig != null) {
                    RequiredProtocols requiredProtocolsRequiredProtocols = distributionConfigDistributionConfig.getRequiredProtocols();
                    if (requiredProtocolsRequiredProtocols != null) {
                        xmlWriter.startElement("RequiredProtocols");

                        if (requiredProtocolsRequiredProtocols != null) {
                            java.util.List<String> protocolsList = requiredProtocolsRequiredProtocols.getProtocols();
                            if (protocolsList != null && protocolsList.size() > 0) {
                                int protocolsListIndex = 1;
                                for (String protocolsListValue : protocolsList) {

                                xmlWriter.startElement("Protocol");
                                    xmlWriter.value(protocolsListValue);
                                xmlWriter.endElement();


                                    protocolsListIndex++;
                                }
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig.getDefaultRootObject() != null) {
                    xmlWriter.startElement("DefaultRootObject").value(distributionConfigDistributionConfig.getDefaultRootObject()).endElement();
                }
                if (distributionConfigDistributionConfig != null) {
                    CachingBehavior cachingBehaviorCachingBehavior = distributionConfigDistributionConfig.getCachingBehavior();
                    if (cachingBehaviorCachingBehavior != null) {
                        xmlWriter.startElement("CachingBehavior");
                        if (cachingBehaviorCachingBehavior.getMinTTL() != null) {
                            xmlWriter.startElement("MinTTL").value(cachingBehaviorCachingBehavior.getMinTTL()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                xmlWriter.endElement();
            }
        }


            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes().length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
