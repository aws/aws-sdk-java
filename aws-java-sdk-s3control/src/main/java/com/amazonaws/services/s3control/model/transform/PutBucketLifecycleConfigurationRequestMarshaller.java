/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * PutBucketLifecycleConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBucketLifecycleConfigurationRequestMarshaller implements
        Marshaller<Request<PutBucketLifecycleConfigurationRequest>, PutBucketLifecycleConfigurationRequest> {

    public Request<PutBucketLifecycleConfigurationRequest> marshall(PutBucketLifecycleConfigurationRequest putBucketLifecycleConfigurationRequest) {

        if (putBucketLifecycleConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutBucketLifecycleConfigurationRequest> request = new DefaultRequest<PutBucketLifecycleConfigurationRequest>(
                putBucketLifecycleConfigurationRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PUT);

        if (putBucketLifecycleConfigurationRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(putBucketLifecycleConfigurationRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/bucket/{name}/lifecycleconfiguration";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "name",
                putBucketLifecycleConfigurationRequest.getBucket());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            LifecycleConfiguration lifecycleConfiguration = putBucketLifecycleConfigurationRequest.getLifecycleConfiguration();
            if (lifecycleConfiguration != null) {
                xmlWriter.startElement("LifecycleConfiguration");

                java.util.List<LifecycleRule> lifecycleConfigurationRulesList = lifecycleConfiguration.getRules();
                if (lifecycleConfigurationRulesList != null) {
                    xmlWriter.startElement("Rules");

                    for (LifecycleRule lifecycleConfigurationRulesListValue : lifecycleConfigurationRulesList) {
                        xmlWriter.startElement("Rule");

                        {
                            LifecycleExpiration expiration = lifecycleConfigurationRulesListValue.getExpiration();
                            if (expiration != null) {
                                xmlWriter.startElement("Expiration");

                                if (expiration.getDate() != null) {
                                    xmlWriter.startElement("Date").value(expiration.getDate()).endElement();
                                }

                                if (expiration.getDays() != null) {
                                    xmlWriter.startElement("Days").value(expiration.getDays()).endElement();
                                }

                                if (expiration.getExpiredObjectDeleteMarker() != null) {
                                    xmlWriter.startElement("ExpiredObjectDeleteMarker").value(expiration.getExpiredObjectDeleteMarker()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (lifecycleConfigurationRulesListValue.getID() != null) {
                            xmlWriter.startElement("ID").value(lifecycleConfigurationRulesListValue.getID()).endElement();
                        }

                        {
                            LifecycleRuleFilter filter = lifecycleConfigurationRulesListValue.getFilter();
                            if (filter != null) {
                                xmlWriter.startElement("Filter");

                                if (filter.getPrefix() != null) {
                                    xmlWriter.startElement("Prefix").value(filter.getPrefix()).endElement();
                                }

                                {
                                    S3Tag tag = filter.getTag();
                                    if (tag != null) {
                                        xmlWriter.startElement("Tag");

                                        if (tag.getKey() != null) {
                                            xmlWriter.startElement("Key").value(tag.getKey()).endElement();
                                        }

                                        if (tag.getValue() != null) {
                                            xmlWriter.startElement("Value").value(tag.getValue()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    LifecycleRuleAndOperator and = filter.getAnd();
                                    if (and != null) {
                                        xmlWriter.startElement("And");

                                        if (and.getPrefix() != null) {
                                            xmlWriter.startElement("Prefix").value(and.getPrefix()).endElement();
                                        }

                                        java.util.List<S3Tag> lifecycleRuleAndOperatorTagsList = and.getTags();
                                        if (lifecycleRuleAndOperatorTagsList != null) {
                                            xmlWriter.startElement("Tags");

                                            for (S3Tag lifecycleRuleAndOperatorTagsListValue : lifecycleRuleAndOperatorTagsList) {
                                                xmlWriter.startElement("member");

                                                if (lifecycleRuleAndOperatorTagsListValue.getKey() != null) {
                                                    xmlWriter.startElement("Key").value(lifecycleRuleAndOperatorTagsListValue.getKey()).endElement();
                                                }

                                                if (lifecycleRuleAndOperatorTagsListValue.getValue() != null) {
                                                    xmlWriter.startElement("Value").value(lifecycleRuleAndOperatorTagsListValue.getValue()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (lifecycleConfigurationRulesListValue.getStatus() != null) {
                            xmlWriter.startElement("Status").value(lifecycleConfigurationRulesListValue.getStatus()).endElement();
                        }

                        java.util.List<Transition> lifecycleRuleTransitionsList = lifecycleConfigurationRulesListValue.getTransitions();
                        if (lifecycleRuleTransitionsList != null) {
                            xmlWriter.startElement("Transitions");

                            for (Transition lifecycleRuleTransitionsListValue : lifecycleRuleTransitionsList) {
                                xmlWriter.startElement("Transition");

                                if (lifecycleRuleTransitionsListValue.getDate() != null) {
                                    xmlWriter.startElement("Date").value(lifecycleRuleTransitionsListValue.getDate()).endElement();
                                }

                                if (lifecycleRuleTransitionsListValue.getDays() != null) {
                                    xmlWriter.startElement("Days").value(lifecycleRuleTransitionsListValue.getDays()).endElement();
                                }

                                if (lifecycleRuleTransitionsListValue.getStorageClass() != null) {
                                    xmlWriter.startElement("StorageClass").value(lifecycleRuleTransitionsListValue.getStorageClass()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }

                        java.util.List<NoncurrentVersionTransition> lifecycleRuleNoncurrentVersionTransitionsList = lifecycleConfigurationRulesListValue
                                .getNoncurrentVersionTransitions();
                        if (lifecycleRuleNoncurrentVersionTransitionsList != null) {
                            xmlWriter.startElement("NoncurrentVersionTransitions");

                            for (NoncurrentVersionTransition lifecycleRuleNoncurrentVersionTransitionsListValue : lifecycleRuleNoncurrentVersionTransitionsList) {
                                xmlWriter.startElement("NoncurrentVersionTransition");

                                if (lifecycleRuleNoncurrentVersionTransitionsListValue.getNoncurrentDays() != null) {
                                    xmlWriter.startElement("NoncurrentDays").value(lifecycleRuleNoncurrentVersionTransitionsListValue.getNoncurrentDays())
                                            .endElement();
                                }

                                if (lifecycleRuleNoncurrentVersionTransitionsListValue.getStorageClass() != null) {
                                    xmlWriter.startElement("StorageClass").value(lifecycleRuleNoncurrentVersionTransitionsListValue.getStorageClass())
                                            .endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }

                        {
                            NoncurrentVersionExpiration noncurrentVersionExpiration = lifecycleConfigurationRulesListValue.getNoncurrentVersionExpiration();
                            if (noncurrentVersionExpiration != null) {
                                xmlWriter.startElement("NoncurrentVersionExpiration");

                                if (noncurrentVersionExpiration.getNoncurrentDays() != null) {
                                    xmlWriter.startElement("NoncurrentDays").value(noncurrentVersionExpiration.getNoncurrentDays()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            AbortIncompleteMultipartUpload abortIncompleteMultipartUpload = lifecycleConfigurationRulesListValue
                                    .getAbortIncompleteMultipartUpload();
                            if (abortIncompleteMultipartUpload != null) {
                                xmlWriter.startElement("AbortIncompleteMultipartUpload");

                                if (abortIncompleteMultipartUpload.getDaysAfterInitiation() != null) {
                                    xmlWriter.startElement("DaysAfterInitiation").value(abortIncompleteMultipartUpload.getDaysAfterInitiation()).endElement();
                                }
                                xmlWriter.endElement();
                            }
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
