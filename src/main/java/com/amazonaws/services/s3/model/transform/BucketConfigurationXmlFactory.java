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
package com.amazonaws.services.s3.model.transform;

import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.CORSRule.AllowedMethods;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration.TopicConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
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
     *	  <IndexDocument>
     *	    <Suffix>index.html</Suffix>
     *	  </IndexDocument>
     *	  <ErrorDocument>
     *	    <Key>404.html</Key>
     *	  </ErrorDocument>
     *	</WebsiteConfiguration>
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
    /*
     * <LifecycleConfiguration>
        <Rule>
            <ID>Expire object after 10 days</ID>
            <Prefix>prefix</Prefix>
            <Status>Enabled</Status>
            <Expiration>
                <Days>10</Days>
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
        if ( rule.getId() != null ) {
            xml.start("ID").value(rule.getId()).end();
        }
        xml.start("Prefix").value(rule.getPrefix()).end();
        xml.start("Status").value(rule.getStatus()).end();
        xml.start("Expiration");
        xml.start("Days").value("" + rule.getExpirationInDays()).end();
        xml.end(); // </Expiration>
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
