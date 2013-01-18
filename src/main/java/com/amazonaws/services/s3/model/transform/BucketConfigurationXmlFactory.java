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
package com.amazonaws.services.s3.model.transform;

import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Transition;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration.TopicConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CORSRule.AllowedMethods;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.TagSet;

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
    public byte[] convertToXmlByteArray(BucketNotificationConfiguration notificationConfiguration) {
        XmlWriter xml = new XmlWriter();
        xml.start("NotificationConfiguration", "xmlns", Constants.XML_NAMESPACE);

        List<TopicConfiguration> topicConfigurations = notificationConfiguration.getTopicConfigurations();
        for ( TopicConfiguration topicConfiguration : topicConfigurations ) {
            xml.start( "TopicConfiguration" );
            xml.start( "Topic" ).value( topicConfiguration.getTopic() ).end();
            xml.start( "Event" ).value( topicConfiguration.getEvent() ).end();
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

        Transition transition = rule.getTransition();
        if (transition != null) {
            xml.start("Transition");
            if (transition.getDate() != null) {
                xml.start("Date");
                xml.value(ServiceUtils.formatIso8601Date(transition.getDate()));
                xml.end();
            }
            if (transition.getDays() != -1) {
                xml.start("Days");
                xml.value(Integer.toString(transition.getDays()));
                xml.end();
            }

            xml.start("StorageClass");
            xml.value(transition.getStorageClass().toString());
            xml.end(); // <StorageClass>
            xml.end(); // </Transition>
        }

        if (rule.getExpirationInDays() != -1) {
            xml.start("Expiration");
            xml.start("Days").value("" + rule.getExpirationInDays()).end();
            xml.end(); // </Expiration>
        }

        if (rule.getExpirationDate() != null) {
            xml.start("Expiration");
            xml.start("Date").value(ServiceUtils.formatIso8601Date(rule.getExpirationDate())).end();
            xml.end(); // </Expiration>
        }

        xml.end(); // </Rule>
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
        if (rule.getCondition() != null) {
            xml.start("Condition");
            xml.start("KeyPrefixEquals");
            if (rule.getCondition().getKeyPrefixEquals() != null) {
                xml.value(rule.getCondition().getKeyPrefixEquals());
            }
            xml.end(); // </KeyPrefixEquals">

            if (rule.getCondition().getHttpErrorCodeReturnedEquals() != null) {
                xml.start("HttpErrorCodeReturnedEquals ").value(rule.getCondition().getHttpErrorCodeReturnedEquals()).end();
            }

            xml.end(); // </Condition>
        }

        xml.start("Redirect");
        if (rule.getRedirect() != null) {
            if (rule.getRedirect().getprotocol() != null) {
                xml.start("Protocol").value(rule.getRedirect().getprotocol()).end();
            }

            if (rule.getRedirect().getHostName() != null) {
                xml.start("HostName").value(rule.getRedirect().getHostName()).end();
            }

            if (rule.getRedirect().getReplaceKeyPrefixWith() != null) {
                xml.start("ReplaceKeyPrefixWith").value(rule.getRedirect().getReplaceKeyPrefixWith()).end();
            }

            if (rule.getRedirect().getReplaceKeyWith() != null) {
                xml.start("ReplaceKeyWith").value(rule.getRedirect().getReplaceKeyWith()).end();
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
