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
 * CreateStreamingDistributionWithTagsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamingDistributionWithTagsRequestMarshaller implements
        Marshaller<Request<CreateStreamingDistributionWithTagsRequest>, CreateStreamingDistributionWithTagsRequest> {

    public Request<CreateStreamingDistributionWithTagsRequest> marshall(CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest) {

        if (createStreamingDistributionWithTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateStreamingDistributionWithTagsRequest> request = new DefaultRequest<CreateStreamingDistributionWithTagsRequest>(
                createStreamingDistributionWithTagsRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2018-11-05/streaming-distribution?WithTags";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            StreamingDistributionConfigWithTags streamingDistributionConfigWithTags = createStreamingDistributionWithTagsRequest
                    .getStreamingDistributionConfigWithTags();
            if (streamingDistributionConfigWithTags != null) {
                xmlWriter.startElement("StreamingDistributionConfigWithTags");

                StreamingDistributionConfig streamingDistributionConfig = streamingDistributionConfigWithTags.getStreamingDistributionConfig();
                if (streamingDistributionConfig != null) {
                    xmlWriter.startElement("StreamingDistributionConfig");

                    if (streamingDistributionConfig.getCallerReference() != null) {
                        xmlWriter.startElement("CallerReference").value(streamingDistributionConfig.getCallerReference()).endElement();
                    }

                    S3Origin s3Origin = streamingDistributionConfig.getS3Origin();
                    if (s3Origin != null) {
                        xmlWriter.startElement("S3Origin");

                        if (s3Origin.getDomainName() != null) {
                            xmlWriter.startElement("DomainName").value(s3Origin.getDomainName()).endElement();
                        }

                        if (s3Origin.getOriginAccessIdentity() != null) {
                            xmlWriter.startElement("OriginAccessIdentity").value(s3Origin.getOriginAccessIdentity()).endElement();
                        }
                        xmlWriter.endElement();
                    }

                    Aliases aliases = streamingDistributionConfig.getAliases();
                    if (aliases != null) {
                        xmlWriter.startElement("Aliases");

                        if (aliases.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(aliases.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<String> aliasesItemsList = (com.amazonaws.internal.SdkInternalList<String>) aliases.getItems();
                        if (!aliasesItemsList.isEmpty() || !aliasesItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (String aliasesItemsListValue : aliasesItemsList) {
                                xmlWriter.startElement("CNAME");
                                xmlWriter.value(aliasesItemsListValue);
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    if (streamingDistributionConfig.getComment() != null) {
                        xmlWriter.startElement("Comment").value(streamingDistributionConfig.getComment()).endElement();
                    }

                    StreamingLoggingConfig logging = streamingDistributionConfig.getLogging();
                    if (logging != null) {
                        xmlWriter.startElement("Logging");

                        if (logging.getEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(logging.getEnabled()).endElement();
                        }

                        if (logging.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(logging.getBucket()).endElement();
                        }

                        if (logging.getPrefix() != null) {
                            xmlWriter.startElement("Prefix").value(logging.getPrefix()).endElement();
                        }
                        xmlWriter.endElement();
                    }

                    TrustedSigners trustedSigners = streamingDistributionConfig.getTrustedSigners();
                    if (trustedSigners != null) {
                        xmlWriter.startElement("TrustedSigners");

                        if (trustedSigners.getEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(trustedSigners.getEnabled()).endElement();
                        }

                        if (trustedSigners.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(trustedSigners.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<String> trustedSignersItemsList = (com.amazonaws.internal.SdkInternalList<String>) trustedSigners
                                .getItems();
                        if (!trustedSignersItemsList.isEmpty() || !trustedSignersItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (String trustedSignersItemsListValue : trustedSignersItemsList) {
                                xmlWriter.startElement("AwsAccountNumber");
                                xmlWriter.value(trustedSignersItemsListValue);
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    if (streamingDistributionConfig.getPriceClass() != null) {
                        xmlWriter.startElement("PriceClass").value(streamingDistributionConfig.getPriceClass()).endElement();
                    }

                    if (streamingDistributionConfig.getEnabled() != null) {
                        xmlWriter.startElement("Enabled").value(streamingDistributionConfig.getEnabled()).endElement();
                    }
                    xmlWriter.endElement();
                }

                Tags tags = streamingDistributionConfigWithTags.getTags();
                if (tags != null) {
                    xmlWriter.startElement("Tags");

                    com.amazonaws.internal.SdkInternalList<Tag> tagsItemsList = (com.amazonaws.internal.SdkInternalList<Tag>) tags.getItems();
                    if (!tagsItemsList.isEmpty() || !tagsItemsList.isAutoConstruct()) {
                        xmlWriter.startElement("Items");

                        for (Tag tagsItemsListValue : tagsItemsList) {
                            xmlWriter.startElement("Tag");

                            if (tagsItemsListValue.getKey() != null) {
                                xmlWriter.startElement("Key").value(tagsItemsListValue.getKey()).endElement();
                            }

                            if (tagsItemsListValue.getValue() != null) {
                                xmlWriter.startElement("Value").value(tagsItemsListValue.getValue()).endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
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
