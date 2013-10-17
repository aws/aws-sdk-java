/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model.transform;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Update Streaming Distribution Request Marshaller
 */
public class UpdateStreamingDistributionRequestMarshaller implements Marshaller<Request<UpdateStreamingDistributionRequest>, UpdateStreamingDistributionRequest> {

    public Request<UpdateStreamingDistributionRequest> marshall(UpdateStreamingDistributionRequest updateStreamingDistributionRequest) {
        if (updateStreamingDistributionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateStreamingDistributionRequest> request = new DefaultRequest<UpdateStreamingDistributionRequest>(updateStreamingDistributionRequest, "AmazonCloudFront");
        request.setHttpMethod(HttpMethodName.PUT);
        if (updateStreamingDistributionRequest.getIfMatch() != null)
        	request.addHeader("If-Match", StringUtils.fromString(updateStreamingDistributionRequest.getIfMatch()));
        

        String uriResourcePath = "2013-09-27/streaming-distribution/{Id}/config"; 
        uriResourcePath = uriResourcePath.replace("{Id}", getString(updateStreamingDistributionRequest.getId())); 

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
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2013-09-27/");

            
                    if (updateStreamingDistributionRequest != null) {
            StreamingDistributionConfig streamingDistributionConfigStreamingDistributionConfig = updateStreamingDistributionRequest.getStreamingDistributionConfig();
            if (streamingDistributionConfigStreamingDistributionConfig != null) {
                xmlWriter.startElement("StreamingDistributionConfig");
                if (streamingDistributionConfigStreamingDistributionConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(streamingDistributionConfigStreamingDistributionConfig.getCallerReference()).endElement();
                }
                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    S3Origin s3OriginS3Origin = streamingDistributionConfigStreamingDistributionConfig.getS3Origin();
                    if (s3OriginS3Origin != null) {
                        xmlWriter.startElement("S3Origin");
                        if (s3OriginS3Origin.getDomainName() != null) {
                            xmlWriter.startElement("DomainName").value(s3OriginS3Origin.getDomainName()).endElement();
                        }
                        if (s3OriginS3Origin.getOriginAccessIdentity() != null) {
                            xmlWriter.startElement("OriginAccessIdentity").value(s3OriginS3Origin.getOriginAccessIdentity()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    Aliases aliasesAliases = streamingDistributionConfigStreamingDistributionConfig.getAliases();
                    if (aliasesAliases != null) {
                        xmlWriter.startElement("Aliases");
                        if (aliasesAliases.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(aliasesAliases.getQuantity()).endElement();
                        }

                        if (aliasesAliases != null) {
                            java.util.List<String> aliasesAliasesitemsList = aliasesAliases.getItems();
                            if (aliasesAliasesitemsList != null && aliasesAliasesitemsList.size() > 0) {
                                int aliasesAliasesitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (String aliasesAliasesitemsListValue : aliasesAliasesitemsList) {

                                xmlWriter.startElement("CNAME");
                                    xmlWriter.value(aliasesAliasesitemsListValue);
                                xmlWriter.endElement();


                                    aliasesAliasesitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (streamingDistributionConfigStreamingDistributionConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(streamingDistributionConfigStreamingDistributionConfig.getComment()).endElement();
                }
                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    StreamingLoggingConfig streamingLoggingConfigLogging = streamingDistributionConfigStreamingDistributionConfig.getLogging();
                    if (streamingLoggingConfigLogging != null) {
                        xmlWriter.startElement("Logging");
                        if (streamingLoggingConfigLogging.isEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(streamingLoggingConfigLogging.isEnabled()).endElement();
                        }
                        if (streamingLoggingConfigLogging.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(streamingLoggingConfigLogging.getBucket()).endElement();
                        }
                        if (streamingLoggingConfigLogging.getPrefix() != null) {
                            xmlWriter.startElement("Prefix").value(streamingLoggingConfigLogging.getPrefix()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    TrustedSigners trustedSignersTrustedSigners = streamingDistributionConfigStreamingDistributionConfig.getTrustedSigners();
                    if (trustedSignersTrustedSigners != null) {
                        xmlWriter.startElement("TrustedSigners");
                        if (trustedSignersTrustedSigners.isEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(trustedSignersTrustedSigners.isEnabled()).endElement();
                        }
                        if (trustedSignersTrustedSigners.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(trustedSignersTrustedSigners.getQuantity()).endElement();
                        }

                        if (trustedSignersTrustedSigners != null) {
                            java.util.List<String> trustedSignersTrustedSignersitemsList = trustedSignersTrustedSigners.getItems();
                            if (trustedSignersTrustedSignersitemsList != null && trustedSignersTrustedSignersitemsList.size() > 0) {
                                int trustedSignersTrustedSignersitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (String trustedSignersTrustedSignersitemsListValue : trustedSignersTrustedSignersitemsList) {

                                xmlWriter.startElement("AwsAccountNumber");
                                    xmlWriter.value(trustedSignersTrustedSignersitemsListValue);
                                xmlWriter.endElement();


                                    trustedSignersTrustedSignersitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (streamingDistributionConfigStreamingDistributionConfig.getPriceClass() != null) {
                    xmlWriter.startElement("PriceClass").value(streamingDistributionConfigStreamingDistributionConfig.getPriceClass()).endElement();
                }
                if (streamingDistributionConfigStreamingDistributionConfig.isEnabled() != null) {
                    xmlWriter.startElement("Enabled").value(streamingDistributionConfigStreamingDistributionConfig.isEnabled()).endElement();
                }
                xmlWriter.endElement();
            }
        }


            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes("UTF-8").length));
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
