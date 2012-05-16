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
        	request.addHeader("If-Match", updateStreamingDistributionRequest.getIfMatch());
        

        String uriResourcePath = "2012-03-15/streaming-distribution/{Id}/config"; 
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
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2012-03-15/");

                    if (updateStreamingDistributionRequest != null) {
            StreamingDistributionConfig streamingDistributionConfigStreamingDistributionConfig = updateStreamingDistributionRequest.getStreamingDistributionConfig();
            if (streamingDistributionConfigStreamingDistributionConfig != null) {
                xmlWriter.startElement("StreamingDistributionConfig");
                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    S3Origin s3OriginS3Origin = streamingDistributionConfigStreamingDistributionConfig.getS3Origin();
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
                if (streamingDistributionConfigStreamingDistributionConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(streamingDistributionConfigStreamingDistributionConfig.getCallerReference()).endElement();
                }

                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    java.util.List<String> cNAMEList = streamingDistributionConfigStreamingDistributionConfig.getCNAME();
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
                if (streamingDistributionConfigStreamingDistributionConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(streamingDistributionConfigStreamingDistributionConfig.getComment()).endElement();
                }
                if (streamingDistributionConfigStreamingDistributionConfig.isEnabled() != null) {
                    xmlWriter.startElement("Enabled").value(streamingDistributionConfigStreamingDistributionConfig.isEnabled()).endElement();
                }
                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    LoggingConfig loggingConfigLogging = streamingDistributionConfigStreamingDistributionConfig.getLogging();
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
                if (streamingDistributionConfigStreamingDistributionConfig != null) {
                    TrustedSigners trustedSignersTrustedSigners = streamingDistributionConfigStreamingDistributionConfig.getTrustedSigners();
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
