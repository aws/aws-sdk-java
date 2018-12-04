/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
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
import com.amazonaws.services.s3.model.Filter;
import com.amazonaws.services.s3.model.FilterRule;
import com.amazonaws.services.s3.model.LambdaConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.services.s3.model.QueueConfiguration;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3KeyFilter;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.TopicConfiguration;
import com.amazonaws.util.CollectionUtils;

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
            throw new AmazonClientException("Cannot have a Filter without any criteria");
        }
    }

    /**
     * If S3Key filter is set make sure it has at least one rule
     */
    private void validateS3KeyFilter(S3KeyFilter s3KeyFilter) {
        if (CollectionUtils.isNullOrEmpty(s3KeyFilter.getFilterRules())) {
            throw new AmazonClientException("Cannot have an S3KeyFilter without any filter rules");
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
            xml.start("Prefix").value(rule.getPrefix()).end();
            xml.start("Status").value(rule.getStatus()).end();

            final ReplicationDestinationConfig config = rule.getDestinationConfig();
            xml.start("Destination");
            xml.start("Bucket").value(config.getBucketARN()).end();
            if (config.getStorageClass() != null) {
                xml.start("StorageClass").value(config.getStorageClass()).end();
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
               <Prefix>logs/</Prefix>
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
    public byte[] convertToXmlByteArray(BucketLifecycleConfiguration config) throws AmazonClientException {

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
    public byte[] convertToXmlByteArray(BucketCrossOriginConfiguration config) throws AmazonClientException {

        XmlWriter xml = new XmlWriter();
        xml.start("CORSConfiguration", "xmlns", Constants.XML_NAMESPACE);

        for (CORSRule rule : config.getRules()) {
            writeRule(xml, rule);
        }

        xml.end();

        return xml.getBytes();
    }

    private void writeRule(XmlWriter xml, Rule rule) {
        xml.start("Rule");
        if (rule.getId() != null) {
            xml.start("ID").value(rule.getId()).end();
        }
        xml.start("Prefix").value(rule.getPrefix()).end();
        xml.start("Status").value(rule.getStatus()).end();

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
                xml.value(t.getStorageClass().toString());
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
                xml.value(t.getStorageClass().toString());
                xml.end(); // </StorageClass>
                xml.end(); // </NoncurrentVersionTransition>
            }
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
    public byte[] convertToXmlByteArray(BucketTaggingConfiguration config) throws AmazonClientException {

        XmlWriter xml = new XmlWriter();
        xml.start("Tagging");

        for (TagSet tagset : config.getAllTagSets()) {
            writeRule(xml, tagset);
        }

        xml.end();

        return xml.getBytes();
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

}
