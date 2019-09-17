/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.addParameterIfNotNull;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writePrefix;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.AccessControlTranslation;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.NoncurrentVersionTransition;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Transition;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CORSRule.AllowedMethods;
import com.amazonaws.services.s3.model.CloudFunctionConfiguration;
import com.amazonaws.services.s3.model.DeleteMarkerReplication;
import com.amazonaws.services.s3.model.Filter;
import com.amazonaws.services.s3.model.FilterRule;
import com.amazonaws.services.s3.model.LambdaConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.services.s3.model.PublicAccessBlockConfiguration;
import com.amazonaws.services.s3.model.QueueConfiguration;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3KeyFilter;
import com.amazonaws.services.s3.model.ServerSideEncryptionByDefault;
import com.amazonaws.services.s3.model.ServerSideEncryptionConfiguration;
import com.amazonaws.services.s3.model.ServerSideEncryptionRule;
import com.amazonaws.services.s3.model.SseKmsEncryptedObjects;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.TopicConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryDestination;
import com.amazonaws.services.s3.model.inventory.InventoryEncryption;
import com.amazonaws.services.s3.model.inventory.InventoryFilter;
import com.amazonaws.services.s3.model.inventory.InventoryFilterPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventorySchedule;
import com.amazonaws.services.s3.model.inventory.ServerSideEncryptionKMS;
import com.amazonaws.services.s3.model.inventory.ServerSideEncryptionS3;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePredicateVisitor;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsPredicateVisitor;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.services.s3.model.replication.ReplicationFilter;
import com.amazonaws.services.s3.model.replication.ReplicationFilterPredicate;
import com.amazonaws.util.CollectionUtils;
import java.util.List;
import java.util.Map;

/**
 * Converts bucket configuration objects into XML byte arrays.
 */
public class BucketConfigurationXmlFactory {

    /**
     * Converts the specified versioning configuration into an XML byte array.
     *
     * @param versioningConfiguration
     *            The configuration to convert.
     *
     * @return The XML byte array representation.
     */
    public byte[] convertToXmlByteArray(BucketVersioningConfiguration versioningConfiguration) {
        XmlWriter xml = new XmlWriter();
        xml.start("VersioningConfiguration", "xmlns", Constants.XML_NAMESPACE);
        xml.start("Status").value(versioningConfiguration.getStatus()).end();

        Boolean mfaDeleteEnabled = versioningConfiguration.isMfaDeleteEnabled();
        if (mfaDeleteEnabled != null) {
            if (mfaDeleteEnabled) {
                xml.start("MfaDelete").value("Enabled").end();
            } else {
                xml.start("MfaDelete").value("Disabled").end();
            }
        }

        xml.end();

        return xml.getBytes();
    }

    /**
     * Converts the specified accelerate configuration into an XML byte array.
     *
     * @param accelerateConfiguration
     *            The configuration to convert.
     *
     * @return The XML byte array representation.
     */
    public byte[] convertToXmlByteArray(BucketAccelerateConfiguration accelerateConfiguration) {
        XmlWriter xml = new XmlWriter();
        xml.start("AccelerateConfiguration", "xmlns", Constants.XML_NAMESPACE);
        xml.start("Status").value(accelerateConfiguration.getStatus()).end();
        xml.end();
        return xml.getBytes();
    }

    /**
     * Converts the specified logging configuration into an XML byte array.
     *
     * @param loggingConfiguration
     *            The configuration to convert.
     *
     * @return The XML byte array representation.
     */
    public byte[] convertToXmlByteArray(BucketLoggingConfiguration loggingConfiguration) {
        // Default log file prefix to the empty string if none is specified
        String logFilePrefix = loggingConfiguration.getLogFilePrefix();
        if (logFilePrefix == null)
            logFilePrefix = "";

        XmlWriter xml = new XmlWriter();
        xml.start("BucketLoggingStatus", "xmlns", Constants.XML_NAMESPACE);
        if (loggingConfiguration.isLoggingEnabled()) {
            xml.start("LoggingEnabled");
            xml.start("TargetBucket").value(loggingConfiguration.getDestinationBucketName()).end();
            xml.start("TargetPrefix").value(loggingConfiguration.getLogFilePrefix()).end();
            xml.end();
        }
        xml.end();

        return xml.getBytes();
    }

    /**
     * Converts the specified notification configuration into an XML byte array.
     *
     * @param notificationConfiguration
     *            The configuration to convert.
     *
     * @return The XML byte array representation.
     */
    public byte[] convertToXmlByteArray(
            BucketNotificationConfiguration notificationConfiguration) {
        XmlWriter xml = new XmlWriter();
        xml.start("NotificationConfiguration", "xmlns", Constants.XML_NAMESPACE);
        Map<String, NotificationConfiguration> configurations = notificationConfiguration
                .getConfigurations();

        for (Map.Entry<String, NotificationConfiguration> entry : configurations
                .entrySet()) {
            String configName = entry.getKey();
            NotificationConfiguration config = entry.getValue();
            if (config instanceof TopicConfiguration) {
                xml.start("TopicConfiguration");
                xml.start("Id").value(configName).end();
                xml.start("Topic")
                        .value(((TopicConfiguration) config).getTopicARN())
                        .end();
                addEventsAndFilterCriteria(xml, config);
                xml.end();
            } else if (config instanceof QueueConfiguration) {
                xml.start("QueueConfiguration");
                xml.start("Id").value(configName).end();
                xml.start("Queue")
                        .value(((QueueConfiguration) config).getQueueARN())
                        .end();
                addEventsAndFilterCriteria(xml, config);
                xml.end();
            } else if (config instanceof CloudFunctionConfiguration) {
                xml.start("CloudFunctionConfiguration");
                xml.start("Id").value(configName).end();
                xml.start("InvocationRole")
                        .value(((CloudFunctionConfiguration) config)
                                .getInvocationRoleARN()).end();
                xml.start("CloudFunction")
                        .value(((CloudFunctionConfiguration) config).getCloudFunctionARN())
                        .end();
                addEventsAndFilterCriteria(xml, config);
                xml.end();
            } else if (config instanceof LambdaConfiguration) {
                xml.start("CloudFunctionConfiguration");
                xml.start("Id").value(configName).end();
                xml.start("CloudFunction")
                        .value(((LambdaConfiguration) config).getFunctionARN())
                        .end();
                addEventsAndFilterCriteria(xml, config);
                xml.end();
            }
        }
        xml.end();
        return xml.getBytes();
    }

    private void addEventsAndFilterCriteria(XmlWriter xml, NotificationConfiguration config) {
        for (String event : config.getEvents()) {
            xml.start("Event").value(event).end();
        }

        Filter filter = config.getFilter();
        if (filter != null) {
            validateFilter(filter);
            xml.start("Filter");
            if (filter.getS3KeyFilter() != null) {
                validateS3KeyFilter(filter.getS3KeyFilter());
                xml.start("S3Key");
                for (FilterRule filterRule : filter.getS3KeyFilter().getFilterRules()) {
                    xml.start("FilterRule");
                    xml.start("Name").value(filterRule.getName()).end();
                    xml.start("Value").value(filterRule.getValue()).end();
                    xml.end();
                }
                xml.end();
            }
            xml.end();
        }
    }

    private void validateFilter(Filter filter) {
        if (filter.getS3KeyFilter() == null) {
            throw new SdkClientException("Cannot have a Filter without any criteria");
        }
    }

    /**
     * If S3Key filter is set make sure it has at least one rule
     */
    private void validateS3KeyFilter(S3KeyFilter s3KeyFilter) {
        if (CollectionUtils.isNullOrEmpty(s3KeyFilter.getFilterRules())) {
            throw new SdkClientException("Cannot have an S3KeyFilter without any filter rules");
        }
    }

    private void writeReplicationPrefix(final XmlWriter xml, final ReplicationRule rule) {
        // If no filter is set stick with the legacy behavior where we treat a null prefix as empty prefix.
        if (rule.getFilter() == null) {
            xml.start("Prefix").value(rule.getPrefix() == null ? "" : rule.getPrefix()).end();
        } else if (rule.getPrefix() != null) {
            throw new IllegalArgumentException(
                    "Prefix cannot be used with Filter. Use ReplicationPrefixPredicate to create a ReplicationFilter");
        }
    }

    public byte[] convertToXmlByteArray(BucketReplicationConfiguration replicationConfiguration) {
        XmlWriter xml = new XmlWriter();
        xml.start("ReplicationConfiguration");
        Map<String, ReplicationRule> rules = replicationConfiguration
                .getRules();

        final String role = replicationConfiguration.getRoleARN();
        xml.start("Role").value(role).end();
        for (Map.Entry<String, ReplicationRule> entry : rules
                .entrySet()) {
            final String ruleId = entry.getKey();
            final ReplicationRule rule = entry.getValue();

            xml.start("Rule");
            xml.start("ID").value(ruleId).end();
            Integer priority = rule.getPriority();
            if (priority != null) {
                xml.start("Priority").value(Integer.toString(priority)).end();
            }
            xml.start("Status").value(rule.getStatus()).end();
            DeleteMarkerReplication deleteMarkerReplication = rule.getDeleteMarkerReplication();
            if (deleteMarkerReplication != null) {
                xml.start("DeleteMarkerReplication").start("Status").value(deleteMarkerReplication.getStatus()).end().end();
            }
            writeReplicationPrefix(xml, rule);
            writeReplicationFilter(xml, rule.getFilter());

            if (rule.getSourceSelectionCriteria() != null) {
                xml.start("SourceSelectionCriteria");
                SseKmsEncryptedObjects sseKmsEncryptedObjects = rule.getSourceSelectionCriteria().getSseKmsEncryptedObjects();
                if (sseKmsEncryptedObjects != null) {
                    xml.start("SseKmsEncryptedObjects");
                    addParameterIfNotNull(xml, "Status", sseKmsEncryptedObjects.getStatus());
                    xml.end();
                }
                xml.end();
            }

            final ReplicationDestinationConfig config = rule.getDestinationConfig();
            xml.start("Destination");
            xml.start("Bucket").value(config.getBucketARN()).end();

            addParameterIfNotNull(xml, "Account", config.getAccount());

            if (config.getStorageClass() != null) {
                xml.start("StorageClass").value(config.getStorageClass()).end();
            }

            final AccessControlTranslation accessControlTranslation = config.getAccessControlTranslation();
            if (accessControlTranslation != null) {
                xml.start("AccessControlTranslation");
                addParameterIfNotNull(xml, "Owner", accessControlTranslation.getOwner());
                xml.end();
            }
            if (config.getEncryptionConfiguration() != null) {
                xml.start("EncryptionConfiguration");
                addParameterIfNotNull(xml, "ReplicaKmsKeyID",
                                      config.getEncryptionConfiguration().getReplicaKmsKeyID());
                xml.end();
            }

            xml.end();

            xml.end();
        }
        xml.end();
        return xml.getBytes();
    }

    /**
     * Converts the specified website configuration into an XML byte array to
     * send to S3.
     *
     * Sample XML:
     * <WebsiteConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
     *    <IndexDocument>
     *      <Suffix>index.html</Suffix>
     *    </IndexDocument>
     *    <ErrorDocument>
     *      <Key>404.html</Key>
     *    </ErrorDocument>
     *  </WebsiteConfiguration>
     *
     * @param websiteConfiguration
     *            The configuration to convert.
     * @return The XML byte array representation.
     */
    public byte[] convertToXmlByteArray(BucketWebsiteConfiguration websiteConfiguration) {
        XmlWriter xml = new XmlWriter();
        xml.start("WebsiteConfiguration", "xmlns", Constants.XML_NAMESPACE);

        if (websiteConfiguration.getIndexDocumentSuffix() != null) {
            XmlWriter indexDocumentElement = xml.start("IndexDocument");
            indexDocumentElement.start("Suffix").value(websiteConfiguration.getIndexDocumentSuffix()).end();
            indexDocumentElement.end();
        }

        if (websiteConfiguration.getErrorDocument() != null) {
            XmlWriter errorDocumentElement = xml.start("ErrorDocument");
            errorDocumentElement.start("Key").value(websiteConfiguration.getErrorDocument()).end();
            errorDocumentElement.end();
        }

        RedirectRule redirectAllRequestsTo = websiteConfiguration.getRedirectAllRequestsTo();
        if (redirectAllRequestsTo != null) {
            XmlWriter redirectAllRequestsElement = xml.start("RedirectAllRequestsTo");
            if (redirectAllRequestsTo.getprotocol() != null) {
                xml.start("Protocol").value(redirectAllRequestsTo.getprotocol()).end();
            }

            if (redirectAllRequestsTo.getHostName() != null) {
                xml.start("HostName").value(redirectAllRequestsTo.getHostName()).end();
            }

            if (redirectAllRequestsTo.getReplaceKeyPrefixWith() != null) {
                xml.start("ReplaceKeyPrefixWith").value(redirectAllRequestsTo.getReplaceKeyPrefixWith()).end();
            }

            if (redirectAllRequestsTo.getReplaceKeyWith() != null) {
                xml.start("ReplaceKeyWith").value(redirectAllRequestsTo.getReplaceKeyWith()).end();
            }
            redirectAllRequestsElement.end();
        }

        if (websiteConfiguration.getRoutingRules() != null && websiteConfiguration.getRoutingRules().size() > 0) {

            XmlWriter routingRules = xml.start("RoutingRules");
            for (RoutingRule rule : websiteConfiguration.getRoutingRules()) {
                writeRule(routingRules, rule);
            }

            routingRules.end();
        }

        xml.end();
        return xml.getBytes();
    }

    /**
     * Converts the specified {@link BucketLifecycleConfiguration} object to an XML fragment that
     * can be sent to Amazon S3.
     *
     * @param config
     *            The {@link BucketLifecycleConfiguration}
     */
     /* <LifecycleConfiguration>
           <Rule>
               <ID>logs-rule</ID>
               <Status>Enabled</Status>
               <Transition>
                   <Days>30</Days>
                   <StorageClass>GLACIER</StorageClass>
               </Transition>
               <Expiration>
                   <Days>365</Days>
               </Expiration>
               <NoncurrentVersionTransition>
                   <NoncurrentDays>7</NoncurrentDays>
                   <StorageClass>GLACIER</StorageClass>
               </NoncurrentVersionTransition>
               <NoncurrentVersionExpiration>
                   <NoncurrentDays>14</NoncurrentDays>
               </NoncurrentVersionExpiration>
               <Filter> <!-- A filter can have only one of Prefix, Tag or And. -->
                 <Prefix>logs/</Prefix>
                 <Tag>
                    <Key>key1</Key>
                    <Value>value1</Value>
                 </Tag>
                 <And>
                    <Prefix>logs/</Prefix>
                    <Tag>
                        <Key>key1</Key>
                        <Value>value1</Value>
                    </Tag>
                    <Tag>
                        <Key>key1</Key>
                        <Value>value1</Value>
                    </Tag>
                 </And>
           </Filter>
           </Rule>
           <Rule>
               <ID>image-rule</ID>
               <Prefix>image/</Prefix>
               <Status>Enabled</Status>
               <Transition>
                   <Date>2012-12-31T00:00:00.000Z</Date>
                   <StorageClass>GLACIER</StorageClass>
               </Transition>
               <Expiration>
                   <Date>2020-12-31T00:00:00.000Z</Date>
               </Expiration>
               <AbortIncompleteMultipartUpload>
                   <DaysAfterInitiation>10</DaysAfterInitiation>
               </AbortIncompleteMultipartUpload>
          </Rule>
    </LifecycleConfiguration>
    */
    public byte[] convertToXmlByteArray(BucketLifecycleConfiguration config) throws SdkClientException {

        XmlWriter xml = new XmlWriter();
        xml.start("LifecycleConfiguration");

        for (Rule rule : config.getRules()) {
            writeRule(xml, rule);
        }

        xml.end();

        return xml.getBytes();
    }

    /**
     * Converts the specified {@link BucketCrossOriginConfiguration} object to an XML fragment that
     * can be sent to Amazon S3.
     *
     * @param config
     *            The {@link BucketCrossOriginConfiguration}
     */
    /*
     * <CORSConfiguration>
             <CORSRule>
               <AllowedOrigin>http://www.foobar.com</AllowedOrigin>
               <AllowedMethod>GET</AllowedMethod>
               <MaxAgeSeconds>3000</MaxAgeSec>
               <ExposeHeader>x-amz-server-side-encryption</ExposeHeader>
             </CORSRule>
       </CORSConfiguration>
     */
    public byte[] convertToXmlByteArray(BucketCrossOriginConfiguration config) throws SdkClientException {

        XmlWriter xml = new XmlWriter();
        xml.start("CORSConfiguration", "xmlns", Constants.XML_NAMESPACE);

        for (CORSRule rule : config.getRules()) {
            writeRule(xml, rule);
        }

        xml.end();

        return xml.getBytes();
    }

    private void writeLifecyclePrefix(final XmlWriter xml, final Rule rule) {
        // If no filter is set stick with the legacy behavior where we treat a null prefix as empty prefix.
        if (rule.getFilter() == null) {
            xml.start("Prefix").value(rule.getPrefix() == null ? "" : rule.getPrefix()).end();
        } else if (rule.getPrefix() != null) {
            throw new IllegalArgumentException(
                    "Prefix cannot be used with Filter. Use LifecyclePrefixPredicate to create a LifecycleFilter");
        }
    }

    private void writeRule(XmlWriter xml, Rule rule) {
        xml.start("Rule");
        if (rule.getId() != null) {
            xml.start("ID").value(rule.getId()).end();
        }
        writeLifecyclePrefix(xml, rule);
        xml.start("Status").value(rule.getStatus()).end();
        writeLifecycleFilter(xml, rule.getFilter());

        addTransitions(xml, rule.getTransitions());
        addNoncurrentTransitions(xml, rule.getNoncurrentVersionTransitions());

        if (hasCurrentExpirationPolicy(rule)) {
            // The rule attributes below are mutually exclusive, the service will throw an error if
            // more than one is provided
            xml.start("Expiration");
            if (rule.getExpirationInDays() != -1) {
                xml.start("Days").value("" + rule.getExpirationInDays()).end();
            }
            if (rule.getExpirationDate() != null) {
                xml.start("Date").value(ServiceUtils.formatIso8601Date(rule.getExpirationDate())).end();
            }
            if (rule.isExpiredObjectDeleteMarker() == true) {
                xml.start("ExpiredObjectDeleteMarker").value("true").end();
            }
            xml.end(); // </Expiration>
        }

        if (rule.getNoncurrentVersionExpirationInDays() != -1) {
            xml.start("NoncurrentVersionExpiration");
            xml.start("NoncurrentDays")
                .value(Integer.toString(
                    rule.getNoncurrentVersionExpirationInDays()))
                .end();
            xml.end(); // </NoncurrentVersionExpiration>
        }

        if (rule.getAbortIncompleteMultipartUpload() != null) {
            xml.start("AbortIncompleteMultipartUpload");
            xml.start("DaysAfterInitiation").
                    value(Integer.toString(rule.getAbortIncompleteMultipartUpload().getDaysAfterInitiation()))
                    .end();
            xml.end(); // </AbortIncompleteMultipartUpload>
        }

        xml.end(); // </Rule>
    }


    private void addTransitions(XmlWriter xml, List<Transition> transitions) {
        if (transitions == null || transitions.isEmpty()) {
            return;
        }

        for (Transition t : transitions) {
            if (t != null) {
                xml.start("Transition");
                if (t.getDate() != null) {
                    xml.start("Date");
                    xml.value(ServiceUtils.formatIso8601Date(t.getDate()));
                    xml.end();
                }
                if (t.getDays() != -1) {
                    xml.start("Days");
                    xml.value(Integer.toString(t.getDays()));
                    xml.end();
                }

                xml.start("StorageClass");
                xml.value(t.getStorageClassAsString());
                xml.end(); // <StorageClass>
                xml.end(); // </Transition>
            }
        }
    }

    private void addNoncurrentTransitions(XmlWriter xml,
            List<NoncurrentVersionTransition> transitions) {
        if (transitions == null || transitions.isEmpty()) {
            return;
        }

        for (NoncurrentVersionTransition t : transitions) {
            if (t != null) {
                xml.start("NoncurrentVersionTransition");
                if (t.getDays() != -1) {
                    xml.start("NoncurrentDays");
                    xml.value(Integer.toString(t.getDays()));
                    xml.end();
                }

                xml.start("StorageClass");
                xml.value(t.getStorageClassAsString());
                xml.end(); // </StorageClass>
                xml.end(); // </NoncurrentVersionTransition>
            }
        }
    }

    private void writeLifecycleFilter(XmlWriter xml, LifecycleFilter filter) {
        if (filter == null) {
            return;
        }

        xml.start("Filter");
        writeLifecycleFilterPredicate(xml, filter.getPredicate());
        xml.end();
    }

    private void writeLifecycleFilterPredicate(XmlWriter xml, LifecycleFilterPredicate predicate) {
        if (predicate == null) {
            return;
        }
        predicate.accept(new LifecyclePredicateVisitorImpl(xml));
    }

    private void writeReplicationFilter(XmlWriter xml, ReplicationFilter filter) {
        if (filter == null) {
            return;
        }

        xml.start("Filter");
        writeReplicationPredicate(xml, filter.getPredicate());
        xml.end();
    }

    private void writeReplicationPredicate(XmlWriter xml, ReplicationFilterPredicate predicate) {
        if (predicate == null) {
            return;
        }
        predicate.accept(new ReplicationPredicateVisitorImpl(xml));
    }

    public byte[] convertToXmlByteArray(ServerSideEncryptionConfiguration sseConfig) {
        XmlWriter xml = new XmlWriter();
        xml.start("ServerSideEncryptionConfiguration", "xmlns", Constants.XML_NAMESPACE);
        for (ServerSideEncryptionRule rule : sseConfig.getRules()) {
            xml.start("Rule");
            writeServerSideEncryptionByDefault(xml, rule.getApplyServerSideEncryptionByDefault());
            xml.end();
        }
        xml.end();
        return xml.getBytes();
    }

    private void writeServerSideEncryptionByDefault(XmlWriter xml, ServerSideEncryptionByDefault sseByDefault) {
        if (sseByDefault == null) {
            return;
        }
        xml.start("ApplyServerSideEncryptionByDefault");
        addParameterIfNotNull(xml, "SSEAlgorithm", sseByDefault.getSSEAlgorithm());
        addParameterIfNotNull(xml, "KMSMasterKeyID", sseByDefault.getKMSMasterKeyID());
        xml.end();
    }

    public byte[] convertToXmlByteArray(PublicAccessBlockConfiguration config) {
        XmlWriter xml = new XmlWriter();
        xml.start("PublicAccessBlockConfiguration", "xmlns", Constants.XML_NAMESPACE);
        addBooleanParameterIfNotNull(xml, "BlockPublicAcls", config.getBlockPublicAcls());
        addBooleanParameterIfNotNull(xml, "IgnorePublicAcls", config.getIgnorePublicAcls());
        addBooleanParameterIfNotNull(xml, "BlockPublicPolicy", config.getBlockPublicPolicy());
        addBooleanParameterIfNotNull(xml, "RestrictPublicBuckets", config.getRestrictPublicBuckets());
        xml.end();
        return xml.getBytes();
    }

    private class LifecyclePredicateVisitorImpl implements LifecyclePredicateVisitor {
        private final XmlWriter xml;

        public LifecyclePredicateVisitorImpl(XmlWriter xml) {
            this.xml = xml;
        }

        @Override
        public void visit(LifecyclePrefixPredicate lifecyclePrefixPredicate) {
            writePrefix(xml, lifecyclePrefixPredicate.getPrefix());
        }

        @Override
        public void visit(LifecycleTagPredicate lifecycleTagPredicate) {
            writeTag(xml, lifecycleTagPredicate.getTag());
        }

        @Override
        public void visit(LifecycleAndOperator lifecycleAndOperator) {
            xml.start("And");
            for (LifecycleFilterPredicate predicate : lifecycleAndOperator.getOperands()) {
                predicate.accept(this);
            }
            xml.end(); // </And>
        }
    }

    /**
     * @param rule
     * @return True if rule has a current expiration (<Expiration/>) policy set
     */
    private boolean hasCurrentExpirationPolicy(Rule rule) {
        return rule.getExpirationInDays() != -1 || rule.getExpirationDate() != null || rule.isExpiredObjectDeleteMarker();
    }

    private void writeRule(XmlWriter xml, CORSRule rule) {
        xml.start("CORSRule");
        if (rule.getId() != null) {
            xml.start("ID").value(rule.getId()).end();
        }
        if (rule.getAllowedOrigins() != null) {
            for (String origin : rule.getAllowedOrigins()) {
                xml.start("AllowedOrigin").value(origin).end();
            }
        }
        if (rule.getAllowedMethods() != null) {
            for (AllowedMethods method : rule.getAllowedMethods()) {
                xml.start("AllowedMethod").value(method.toString()).end();
            }
        }
        if(rule.getMaxAgeSeconds() != 0) {
            xml.start("MaxAgeSeconds").value(Integer.toString(rule.getMaxAgeSeconds())).end();
        }
        if (rule.getExposedHeaders() != null) {
            for (String header : rule.getExposedHeaders()) {
                xml.start("ExposeHeader").value(header).end();
            }
        }
        if (rule.getAllowedHeaders() != null) {
            for(String header : rule.getAllowedHeaders()) {
                xml.start("AllowedHeader").value(header).end();
            }
        }
        xml.end();//</CORSRule>
    }

    private void writeRule(XmlWriter xml, RoutingRule rule) {
        xml.start("RoutingRule");
        RoutingRuleCondition condition = rule.getCondition();
        if (condition != null) {
            xml.start("Condition");
            xml.start("KeyPrefixEquals");
            if (condition.getKeyPrefixEquals() != null) {
                xml.value(condition.getKeyPrefixEquals());
            }
            xml.end(); // </KeyPrefixEquals">

            if (condition.getHttpErrorCodeReturnedEquals() != null) {
                xml.start("HttpErrorCodeReturnedEquals ").value(condition.getHttpErrorCodeReturnedEquals()).end();
            }

            xml.end(); // </Condition>
        }

        xml.start("Redirect");
        RedirectRule redirect = rule.getRedirect();
        if (redirect != null) {
            if (redirect.getprotocol() != null) {
                xml.start("Protocol").value(redirect.getprotocol()).end();
            }

            if (redirect.getHostName() != null) {
                xml.start("HostName").value(redirect.getHostName()).end();
            }

            if (redirect.getReplaceKeyPrefixWith() != null) {
                xml.start("ReplaceKeyPrefixWith").value(redirect.getReplaceKeyPrefixWith()).end();
            }

            if (redirect.getReplaceKeyWith() != null) {
                xml.start("ReplaceKeyWith").value(redirect.getReplaceKeyWith()).end();
            }

            if (redirect.getHttpRedirectCode() != null) {
                xml.start("HttpRedirectCode").value(redirect.getHttpRedirectCode()).end();
            }
        }
        xml.end(); // </Redirect>
        xml.end();// </CORSRule>
    }


    /**
     * Converts the specified {@link BucketTaggingConfiguration} object to an XML fragment that
     * can be sent to Amazon S3.
     *
     * @param config
     *            The {@link BucketTaggingConfiguration}
     */
    /*
     * <Tagging>
         <TagSet>
            <Tag>
                   <Key>Project</Key>
                   <Value>Foo</Value>
            </Tag>
            <Tag>
                   <Key>User</Key>
                   <Value>nschnarr</Value>
            </Tag>
         </TagSet>
        </Tagging>
    */
    public byte[] convertToXmlByteArray(BucketTaggingConfiguration config) throws SdkClientException {

        XmlWriter xml = new XmlWriter();
        xml.start("Tagging");

        for (TagSet tagset : config.getAllTagSets()) {
            writeRule(xml, tagset);
        }

        xml.end();

        return xml.getBytes();
    }

    /**
     * Converts the specified {@link InventoryConfiguration} object to an XML fragment that
     * can be sent to Amazon S3.
     *
     * @param config
     *            The {@link InventoryConfiguration}
     */
     /*
        <?xml version="1.0" encoding="UTF-8"?>
        <InventoryConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
           <Destination>
              <S3BucketDestination>
                 <AccountId>A2OCNCIEQW9MSG</AccountId>
                 <Bucket>s3-object-inventory-list-gamma-us-east-1</Bucket>
                 <Format>CSV</Format>
                 <Prefix>string</Prefix>
              </S3BucketDestination>
           </Destination>
           <IsEnabled>true</IsEnabled>
           <Filter>
              <Prefix>string</Prefix>
           </Filter>
           <Id>configId</Id>
           <IncludedObjectVersions>All</IncludedObjectVersions>
           <OptionalFields>
              <Field>Size</Field>
              <Field>LastModifiedDate</Field>
              <Field>StorageClass</Field>
              <Field>ETag</Field>
              <Field>IsMultipartUploaded</Field>
              <Field>ReplicationStatus</Field>
           </OptionalFields>
           <Schedule>
              <Frequency>Daily</Frequency>
           </Schedule>
        </InventoryConfiguration>
    */
    public byte[] convertToXmlByteArray(InventoryConfiguration config) throws SdkClientException {
        XmlWriter xml = new XmlWriter();
        xml.start("InventoryConfiguration", "xmlns", Constants.XML_NAMESPACE);

        xml.start("Id").value(config.getId()).end();
        xml.start("IsEnabled").value(String.valueOf(config.isEnabled())).end();
        xml.start("IncludedObjectVersions").value(config.getIncludedObjectVersions()).end();

        writeInventoryDestination(xml, config.getDestination());
        writeInventoryFilter(xml, config.getInventoryFilter());
        addInventorySchedule(xml, config.getSchedule());
        addInventoryOptionalFields(xml, config.getOptionalFields());

        xml.end(); // </InventoryConfiguration>

        return xml.getBytes();
    }

    private void writeInventoryDestination(XmlWriter xml, InventoryDestination destination) {
        if (destination == null) {
            return;
        }

        xml.start("Destination");
        InventoryS3BucketDestination s3BucketDestination = destination.getS3BucketDestination();
        if (s3BucketDestination != null) {
            xml.start("S3BucketDestination");
            addParameterIfNotNull(xml, "AccountId", s3BucketDestination.getAccountId());
            addParameterIfNotNull(xml, "Bucket", s3BucketDestination.getBucketArn());
            addParameterIfNotNull(xml, "Prefix", s3BucketDestination.getPrefix());
            addParameterIfNotNull(xml, "Format", s3BucketDestination.getFormat());
            writeInventoryEncryption(xml, s3BucketDestination.getEncryption());
            xml.end(); // </S3BucketDestination>
        }
        xml.end(); // </Destination>
    }

    private void writeInventoryEncryption(XmlWriter xml, InventoryEncryption encryption) {
        if (encryption == null) {
            return;
        }
        xml.start("Encryption");
        if (encryption instanceof ServerSideEncryptionS3) {
            xml.start("SSE-S3").end();
        } else if (encryption instanceof ServerSideEncryptionKMS) {
            xml.start("SSE-KMS");
            addParameterIfNotNull(xml, "KeyId", ((ServerSideEncryptionKMS) encryption).getKeyId());
            xml.end();
        }
        xml.end();
    }

    private void writeInventoryFilter(XmlWriter xml, InventoryFilter inventoryFilter) {
        if (inventoryFilter == null) {
            return;
        }

        xml.start("Filter");
        writeInventoryFilterPredicate(xml, inventoryFilter.getPredicate());
        xml.end();
    }

    private void writeInventoryFilterPredicate(XmlWriter xml, InventoryFilterPredicate predicate) {
        if (predicate == null) {
            return;
        }

        if (predicate instanceof InventoryPrefixPredicate) {
            writePrefix(xml, ((InventoryPrefixPredicate) predicate).getPrefix());
        }
    }

    private void addInventorySchedule(XmlWriter xml, InventorySchedule schedule) {
        if (schedule == null) {
            return;
        }

        xml.start("Schedule");
        addParameterIfNotNull(xml, "Frequency", schedule.getFrequency());
        xml.end();
    }

    private void addInventoryOptionalFields(XmlWriter xml, List<String> optionalFields) {
        if (CollectionUtils.isNullOrEmpty(optionalFields)) {
            return;
        }

        xml.start("OptionalFields");
        for (String field : optionalFields) {
            xml.start("Field").value(field).end();
        }
        xml.end();
    }

    private void writeRule(XmlWriter xml, TagSet tagset) {
        xml.start("TagSet");
        for ( String key : tagset.getAllTags().keySet() ) {
            xml.start("Tag");
            xml.start("Key").value(key).end();
            xml.start("Value").value(tagset.getTag(key)).end();
            xml.end(); // </Tag>
        }
        xml.end(); // </TagSet>
    }

    private boolean hasTags(TagSet tagSet) {
        return tagSet != null && tagSet.getAllTags() != null && tagSet.getAllTags().size() > 0;
    }

    /**
     * Converts the specified {@link com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration} object to an
     * XML fragment that can be sent to Amazon S3.
     *
     * @param config
     *            The {@link com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration}
     */
     /*
      * <AnalyticsConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
           <Id>XXX</Id>
           <Filter>
             <And>
               <Prefix>documents/</Prefix>
               <Tag>
                 <Key>foo</Key>
                 <Value>bar</Value>
               </Tag>
             </And>
           </Filter>
           <StorageClassAnalysis>
             <DataExport>
               <OutputSchemaVersion>1</OutputSchemaVersion>
               <Destination>
                 <S3BucketDestination>
                   <Format>CSV</Format>
                   <BucketAccountId>123456789</BucketAccountId>
                   <Bucket>destination-bucket</Bucket>
                   <Prefix>destination-prefix</Prefix>
                 </S3BucketDestination>
               </Destination>
             </DataExport>
           </StorageClassAnalysis>
        </AnalyticsConfiguration>
     */
    public byte[] convertToXmlByteArray(AnalyticsConfiguration config) throws SdkClientException {
        XmlWriter xml = new XmlWriter();

        xml.start("AnalyticsConfiguration", "xmlns", Constants.XML_NAMESPACE);

        addParameterIfNotNull(xml, "Id", config.getId());
        writeAnalyticsFilter(xml, config.getFilter());
        writeStorageClassAnalysis(xml, config.getStorageClassAnalysis());

        xml.end();

        return xml.getBytes();
    }

    private void writeAnalyticsFilter(XmlWriter xml, AnalyticsFilter filter) {
        if (filter == null) {
            return;
        }

        xml.start("Filter");
        writeAnalyticsFilterPredicate(xml, filter.getPredicate());
        xml.end();
    }

    private void writeAnalyticsFilterPredicate(XmlWriter xml, AnalyticsFilterPredicate predicate) {
        if (predicate == null) {
            return;
        }

        predicate.accept(new AnalyticsPredicateVisitorImpl(xml));
    }

    private void writeStorageClassAnalysis(XmlWriter xml, StorageClassAnalysis storageClassAnalysis) {
        if (storageClassAnalysis == null) return;

        xml.start("StorageClassAnalysis");
        if (storageClassAnalysis.getDataExport() != null) {
            StorageClassAnalysisDataExport dataExport = storageClassAnalysis.getDataExport();

            xml.start("DataExport");

            addParameterIfNotNull(xml, "OutputSchemaVersion", dataExport.getOutputSchemaVersion());
            writeAnalyticsExportDestination(xml, dataExport.getDestination());

            xml.end(); // </DataExport>
        }

        xml.end(); // </StorageClassAnalysis>
    }

    private void writeAnalyticsExportDestination(XmlWriter xml, AnalyticsExportDestination destination) {
        if (destination == null) {
            return;
        }

        xml.start("Destination");

        if (destination.getS3BucketDestination() != null) {
            xml.start("S3BucketDestination");
            AnalyticsS3BucketDestination s3BucketDestination = destination.getS3BucketDestination();
            addParameterIfNotNull(xml, "Format", s3BucketDestination.getFormat());
            addParameterIfNotNull(xml, "BucketAccountId", s3BucketDestination.getBucketAccountId());
            addParameterIfNotNull(xml, "Bucket", s3BucketDestination.getBucketArn());
            addParameterIfNotNull(xml, "Prefix", s3BucketDestination.getPrefix());
            xml.end();  // </S3BucketDestination>
        }

        xml.end(); // </Destination>
    }

    /**
     * Converts the specified {@link com.amazonaws.services.s3.model.metrics.MetricsConfiguration}
     * object to an XML fragment that can be sent to Amazon S3.
     *
     * @param config
     *            The {@link com.amazonaws.services.s3.model.metrics.MetricsConfiguration}.
     */
     /*
      * <MetricsConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
           <Id>metrics-id</Id>
           <Filter>
           <!-- A filter should have only one of Prefix, Tag or And-->
             <Prefix>prefix</Prefix>
             <Tag>
                 <Key>Project</Key>
                 <Value>Foo</Value>
             </Tag>
             <And>
               <Prefix>documents/</Prefix>
               <Tag>
                 <Key>foo</Key>
                 <Value>bar</Value>
               </Tag>
             </And>
           </Filter>
        </MetricsConfiguration>
     */
    public byte[] convertToXmlByteArray(MetricsConfiguration config) throws SdkClientException {
        XmlWriter xml = new XmlWriter();

        xml.start("MetricsConfiguration", "xmlns", Constants.XML_NAMESPACE);

        addParameterIfNotNull(xml, "Id", config.getId());
        writeMetricsFilter(xml, config.getFilter());

        xml.end();

        return xml.getBytes();
    }

    private void writeMetricsFilter(XmlWriter xml, MetricsFilter filter) {
        if (filter == null) {
            return;
        }

        xml.start("Filter");
        writeMetricsFilterPredicate(xml, filter.getPredicate());
        xml.end();
    }

    private void writeMetricsFilterPredicate(XmlWriter xml, MetricsFilterPredicate predicate) {
        if (predicate == null) {
            return;
        }

        predicate.accept(new MetricsPredicateVisitorImpl(xml));
    }

    private class MetricsPredicateVisitorImpl implements MetricsPredicateVisitor {
        private final XmlWriter xml;

        public MetricsPredicateVisitorImpl(XmlWriter xml) {
            this.xml = xml;
        }

        @Override
        public void visit(MetricsPrefixPredicate metricsPrefixPredicate) {
            writePrefix(xml, metricsPrefixPredicate.getPrefix());
        }

        @Override
        public void visit(MetricsTagPredicate metricsTagPredicate) {
            writeTag(xml, metricsTagPredicate.getTag());
        }

        @Override
        public void visit(MetricsAndOperator metricsAndOperator) {
            xml.start("And");
            for (MetricsFilterPredicate predicate : metricsAndOperator.getOperands()) {
                predicate.accept(this);
            }
            xml.end();
        }
    }

    private void addBooleanParameterIfNotNull(XmlWriter xml, String xmlTagName, Boolean value) {
        if (value != null) {
            xml.start(xmlTagName).value(value.toString()).end();
        }
    }

    private void writeTag(XmlWriter xml, Tag tag) {
        if (tag == null) {
            return;
        }
        xml.start("Tag");
        xml.start("Key").value(tag.getKey()).end();
        xml.start("Value").value(tag.getValue()).end();
        xml.end();
    }

}
