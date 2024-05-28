/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * PutBucketReplicationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBucketReplicationRequestMarshaller implements Marshaller<Request<PutBucketReplicationRequest>, PutBucketReplicationRequest> {

    public Request<PutBucketReplicationRequest> marshall(PutBucketReplicationRequest putBucketReplicationRequest) {

        if (putBucketReplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutBucketReplicationRequest> request = new DefaultRequest<PutBucketReplicationRequest>(putBucketReplicationRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PUT);

        if (putBucketReplicationRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(putBucketReplicationRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/bucket/{name}/replication";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "name", putBucketReplicationRequest.getBucket());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            ReplicationConfiguration replicationConfiguration = putBucketReplicationRequest.getReplicationConfiguration();
            if (replicationConfiguration != null) {
                xmlWriter.startElement("ReplicationConfiguration");

                if (replicationConfiguration.getRole() != null) {
                    xmlWriter.startElement("Role").value(replicationConfiguration.getRole()).endElement();
                }

                java.util.List<ReplicationRule> replicationConfigurationRulesList = replicationConfiguration.getRules();
                if (replicationConfigurationRulesList != null) {
                    xmlWriter.startElement("Rules");

                    for (ReplicationRule replicationConfigurationRulesListValue : replicationConfigurationRulesList) {
                        xmlWriter.startElement("Rule");

                        if (replicationConfigurationRulesListValue.getID() != null) {
                            xmlWriter.startElement("ID").value(replicationConfigurationRulesListValue.getID()).endElement();
                        }

                        if (replicationConfigurationRulesListValue.getPriority() != null) {
                            xmlWriter.startElement("Priority").value(replicationConfigurationRulesListValue.getPriority()).endElement();
                        }

                        if (replicationConfigurationRulesListValue.getPrefix() != null) {
                            xmlWriter.startElement("Prefix").value(replicationConfigurationRulesListValue.getPrefix()).endElement();
                        }

                        {
                            ReplicationRuleFilter filter = replicationConfigurationRulesListValue.getFilter();
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
                                    ReplicationRuleAndOperator and = filter.getAnd();
                                    if (and != null) {
                                        xmlWriter.startElement("And");

                                        if (and.getPrefix() != null) {
                                            xmlWriter.startElement("Prefix").value(and.getPrefix()).endElement();
                                        }

                                        java.util.List<S3Tag> replicationRuleAndOperatorTagsList = and.getTags();
                                        if (replicationRuleAndOperatorTagsList != null) {
                                            xmlWriter.startElement("Tags");

                                            for (S3Tag replicationRuleAndOperatorTagsListValue : replicationRuleAndOperatorTagsList) {
                                                xmlWriter.startElement("member");

                                                if (replicationRuleAndOperatorTagsListValue.getKey() != null) {
                                                    xmlWriter.startElement("Key").value(replicationRuleAndOperatorTagsListValue.getKey()).endElement();
                                                }

                                                if (replicationRuleAndOperatorTagsListValue.getValue() != null) {
                                                    xmlWriter.startElement("Value").value(replicationRuleAndOperatorTagsListValue.getValue()).endElement();
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

                        if (replicationConfigurationRulesListValue.getStatus() != null) {
                            xmlWriter.startElement("Status").value(replicationConfigurationRulesListValue.getStatus()).endElement();
                        }

                        {
                            SourceSelectionCriteria sourceSelectionCriteria = replicationConfigurationRulesListValue.getSourceSelectionCriteria();
                            if (sourceSelectionCriteria != null) {
                                xmlWriter.startElement("SourceSelectionCriteria");

                                {
                                    SseKmsEncryptedObjects sseKmsEncryptedObjects = sourceSelectionCriteria.getSseKmsEncryptedObjects();
                                    if (sseKmsEncryptedObjects != null) {
                                        xmlWriter.startElement("SseKmsEncryptedObjects");

                                        if (sseKmsEncryptedObjects.getStatus() != null) {
                                            xmlWriter.startElement("Status").value(sseKmsEncryptedObjects.getStatus()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    ReplicaModifications replicaModifications = sourceSelectionCriteria.getReplicaModifications();
                                    if (replicaModifications != null) {
                                        xmlWriter.startElement("ReplicaModifications");

                                        if (replicaModifications.getStatus() != null) {
                                            xmlWriter.startElement("Status").value(replicaModifications.getStatus()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ExistingObjectReplication existingObjectReplication = replicationConfigurationRulesListValue.getExistingObjectReplication();
                            if (existingObjectReplication != null) {
                                xmlWriter.startElement("ExistingObjectReplication");

                                if (existingObjectReplication.getStatus() != null) {
                                    xmlWriter.startElement("Status").value(existingObjectReplication.getStatus()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            Destination destination = replicationConfigurationRulesListValue.getDestination();
                            if (destination != null) {
                                xmlWriter.startElement("Destination");

                                if (destination.getAccount() != null) {
                                    xmlWriter.startElement("Account").value(destination.getAccount()).endElement();
                                }

                                if (destination.getBucket() != null) {
                                    xmlWriter.startElement("Bucket").value(destination.getBucket()).endElement();
                                }

                                {
                                    ReplicationTime replicationTime = destination.getReplicationTime();
                                    if (replicationTime != null) {
                                        xmlWriter.startElement("ReplicationTime");

                                        if (replicationTime.getStatus() != null) {
                                            xmlWriter.startElement("Status").value(replicationTime.getStatus()).endElement();
                                        }

                                        {
                                            ReplicationTimeValue time = replicationTime.getTime();
                                            if (time != null) {
                                                xmlWriter.startElement("Time");

                                                if (time.getMinutes() != null) {
                                                    xmlWriter.startElement("Minutes").value(time.getMinutes()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    AccessControlTranslation accessControlTranslation = destination.getAccessControlTranslation();
                                    if (accessControlTranslation != null) {
                                        xmlWriter.startElement("AccessControlTranslation");

                                        if (accessControlTranslation.getOwner() != null) {
                                            xmlWriter.startElement("Owner").value(accessControlTranslation.getOwner()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    EncryptionConfiguration encryptionConfiguration = destination.getEncryptionConfiguration();
                                    if (encryptionConfiguration != null) {
                                        xmlWriter.startElement("EncryptionConfiguration");

                                        if (encryptionConfiguration.getReplicaKmsKeyID() != null) {
                                            xmlWriter.startElement("ReplicaKmsKeyID").value(encryptionConfiguration.getReplicaKmsKeyID()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    Metrics metrics = destination.getMetrics();
                                    if (metrics != null) {
                                        xmlWriter.startElement("Metrics");

                                        if (metrics.getStatus() != null) {
                                            xmlWriter.startElement("Status").value(metrics.getStatus()).endElement();
                                        }

                                        {
                                            ReplicationTimeValue eventThreshold = metrics.getEventThreshold();
                                            if (eventThreshold != null) {
                                                xmlWriter.startElement("EventThreshold");

                                                if (eventThreshold.getMinutes() != null) {
                                                    xmlWriter.startElement("Minutes").value(eventThreshold.getMinutes()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                if (destination.getStorageClass() != null) {
                                    xmlWriter.startElement("StorageClass").value(destination.getStorageClass()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            DeleteMarkerReplication deleteMarkerReplication = replicationConfigurationRulesListValue.getDeleteMarkerReplication();
                            if (deleteMarkerReplication != null) {
                                xmlWriter.startElement("DeleteMarkerReplication");

                                if (deleteMarkerReplication.getStatus() != null) {
                                    xmlWriter.startElement("Status").value(deleteMarkerReplication.getStatus()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (replicationConfigurationRulesListValue.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(replicationConfigurationRulesListValue.getBucket()).endElement();
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
