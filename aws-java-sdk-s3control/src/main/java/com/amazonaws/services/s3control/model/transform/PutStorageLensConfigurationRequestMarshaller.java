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
 * PutStorageLensConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStorageLensConfigurationRequestMarshaller implements
        Marshaller<Request<PutStorageLensConfigurationRequest>, PutStorageLensConfigurationRequest> {

    public Request<PutStorageLensConfigurationRequest> marshall(PutStorageLensConfigurationRequest putStorageLensConfigurationRequest) {

        if (putStorageLensConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutStorageLensConfigurationRequest> request = new DefaultRequest<PutStorageLensConfigurationRequest>(putStorageLensConfigurationRequest,
                "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PUT);

        if (putStorageLensConfigurationRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(putStorageLensConfigurationRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/storagelens/{storagelensid}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "storagelensid",
                putStorageLensConfigurationRequest.getConfigId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("PutStorageLensConfigurationRequest");
            if (putStorageLensConfigurationRequest != null) {

                {
                    StorageLensConfiguration storageLensConfiguration = putStorageLensConfigurationRequest.getStorageLensConfiguration();
                    if (storageLensConfiguration != null) {
                        xmlWriter.startElement("StorageLensConfiguration");

                        if (storageLensConfiguration.getId() != null) {
                            xmlWriter.startElement("Id").value(storageLensConfiguration.getId()).endElement();
                        }

                        {
                            AccountLevel accountLevel = storageLensConfiguration.getAccountLevel();
                            if (accountLevel != null) {
                                xmlWriter.startElement("AccountLevel");

                                {
                                    ActivityMetrics activityMetrics = accountLevel.getActivityMetrics();
                                    if (activityMetrics != null) {
                                        xmlWriter.startElement("ActivityMetrics");

                                        if (activityMetrics.getIsEnabled() != null) {
                                            xmlWriter.startElement("IsEnabled").value(activityMetrics.getIsEnabled()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    BucketLevel bucketLevel = accountLevel.getBucketLevel();
                                    if (bucketLevel != null) {
                                        xmlWriter.startElement("BucketLevel");

                                        {
                                            ActivityMetrics activityMetrics = bucketLevel.getActivityMetrics();
                                            if (activityMetrics != null) {
                                                xmlWriter.startElement("ActivityMetrics");

                                                if (activityMetrics.getIsEnabled() != null) {
                                                    xmlWriter.startElement("IsEnabled").value(activityMetrics.getIsEnabled()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }

                                        {
                                            PrefixLevel prefixLevel = bucketLevel.getPrefixLevel();
                                            if (prefixLevel != null) {
                                                xmlWriter.startElement("PrefixLevel");

                                                {
                                                    PrefixLevelStorageMetrics storageMetrics = prefixLevel.getStorageMetrics();
                                                    if (storageMetrics != null) {
                                                        xmlWriter.startElement("StorageMetrics");

                                                        if (storageMetrics.getIsEnabled() != null) {
                                                            xmlWriter.startElement("IsEnabled").value(storageMetrics.getIsEnabled()).endElement();
                                                        }

                                                        {
                                                            SelectionCriteria selectionCriteria = storageMetrics.getSelectionCriteria();
                                                            if (selectionCriteria != null) {
                                                                xmlWriter.startElement("SelectionCriteria");

                                                                if (selectionCriteria.getDelimiter() != null) {
                                                                    xmlWriter.startElement("Delimiter").value(selectionCriteria.getDelimiter()).endElement();
                                                                }

                                                                if (selectionCriteria.getMaxDepth() != null) {
                                                                    xmlWriter.startElement("MaxDepth").value(selectionCriteria.getMaxDepth()).endElement();
                                                                }

                                                                if (selectionCriteria.getMinStorageBytesPercentage() != null) {
                                                                    xmlWriter.startElement("MinStorageBytesPercentage")
                                                                            .value(selectionCriteria.getMinStorageBytesPercentage()).endElement();
                                                                }
                                                                xmlWriter.endElement();
                                                            }
                                                        }
                                                        xmlWriter.endElement();
                                                    }
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            Include include = storageLensConfiguration.getInclude();
                            if (include != null) {
                                xmlWriter.startElement("Include");

                                java.util.List<String> includeBucketsList = include.getBuckets();
                                if (includeBucketsList != null) {
                                    xmlWriter.startElement("Buckets");

                                    for (String includeBucketsListValue : includeBucketsList) {
                                        xmlWriter.startElement("Arn");
                                        xmlWriter.value(includeBucketsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                java.util.List<String> includeRegionsList = include.getRegions();
                                if (includeRegionsList != null) {
                                    xmlWriter.startElement("Regions");

                                    for (String includeRegionsListValue : includeRegionsList) {
                                        xmlWriter.startElement("Region");
                                        xmlWriter.value(includeRegionsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            Exclude exclude = storageLensConfiguration.getExclude();
                            if (exclude != null) {
                                xmlWriter.startElement("Exclude");

                                java.util.List<String> excludeBucketsList = exclude.getBuckets();
                                if (excludeBucketsList != null) {
                                    xmlWriter.startElement("Buckets");

                                    for (String excludeBucketsListValue : excludeBucketsList) {
                                        xmlWriter.startElement("Arn");
                                        xmlWriter.value(excludeBucketsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                java.util.List<String> excludeRegionsList = exclude.getRegions();
                                if (excludeRegionsList != null) {
                                    xmlWriter.startElement("Regions");

                                    for (String excludeRegionsListValue : excludeRegionsList) {
                                        xmlWriter.startElement("Region");
                                        xmlWriter.value(excludeRegionsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            StorageLensDataExport dataExport = storageLensConfiguration.getDataExport();
                            if (dataExport != null) {
                                xmlWriter.startElement("DataExport");

                                {
                                    S3BucketDestination s3BucketDestination = dataExport.getS3BucketDestination();
                                    if (s3BucketDestination != null) {
                                        xmlWriter.startElement("S3BucketDestination");

                                        if (s3BucketDestination.getFormat() != null) {
                                            xmlWriter.startElement("Format").value(s3BucketDestination.getFormat()).endElement();
                                        }

                                        if (s3BucketDestination.getOutputSchemaVersion() != null) {
                                            xmlWriter.startElement("OutputSchemaVersion").value(s3BucketDestination.getOutputSchemaVersion()).endElement();
                                        }

                                        if (s3BucketDestination.getAccountId() != null) {
                                            xmlWriter.startElement("AccountId").value(s3BucketDestination.getAccountId()).endElement();
                                        }

                                        if (s3BucketDestination.getArn() != null) {
                                            xmlWriter.startElement("Arn").value(s3BucketDestination.getArn()).endElement();
                                        }

                                        if (s3BucketDestination.getPrefix() != null) {
                                            xmlWriter.startElement("Prefix").value(s3BucketDestination.getPrefix()).endElement();
                                        }

                                        {
                                            StorageLensDataExportEncryption encryption = s3BucketDestination.getEncryption();
                                            if (encryption != null) {
                                                xmlWriter.startElement("Encryption");

                                                {
                                                    SSES3 sSES3 = encryption.getSSES3();
                                                    if (sSES3 != null) {
                                                        xmlWriter.startElement("SSE-S3");

                                                        xmlWriter.endElement();
                                                    }
                                                }

                                                {
                                                    SSEKMS sSEKMS = encryption.getSSEKMS();
                                                    if (sSEKMS != null) {
                                                        xmlWriter.startElement("SSE-KMS");

                                                        if (sSEKMS.getKeyId() != null) {
                                                            xmlWriter.startElement("KeyId").value(sSEKMS.getKeyId()).endElement();
                                                        }
                                                        xmlWriter.endElement();
                                                    }
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (storageLensConfiguration.getIsEnabled() != null) {
                            xmlWriter.startElement("IsEnabled").value(storageLensConfiguration.getIsEnabled()).endElement();
                        }

                        {
                            StorageLensAwsOrg awsOrg = storageLensConfiguration.getAwsOrg();
                            if (awsOrg != null) {
                                xmlWriter.startElement("AwsOrg");

                                if (awsOrg.getArn() != null) {
                                    xmlWriter.startElement("Arn").value(awsOrg.getArn()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (storageLensConfiguration.getStorageLensArn() != null) {
                            xmlWriter.startElement("StorageLensArn").value(storageLensConfiguration.getStorageLensArn()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                java.util.List<StorageLensTag> putStorageLensConfigurationRequestTagsList = putStorageLensConfigurationRequest.getTags();
                if (putStorageLensConfigurationRequestTagsList != null) {
                    xmlWriter.startElement("Tags");

                    for (StorageLensTag putStorageLensConfigurationRequestTagsListValue : putStorageLensConfigurationRequestTagsList) {
                        xmlWriter.startElement("Tag");

                        if (putStorageLensConfigurationRequestTagsListValue.getKey() != null) {
                            xmlWriter.startElement("Key").value(putStorageLensConfigurationRequestTagsListValue.getKey()).endElement();
                        }

                        if (putStorageLensConfigurationRequestTagsListValue.getValue() != null) {
                            xmlWriter.startElement("Value").value(putStorageLensConfigurationRequestTagsListValue.getValue()).endElement();
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
