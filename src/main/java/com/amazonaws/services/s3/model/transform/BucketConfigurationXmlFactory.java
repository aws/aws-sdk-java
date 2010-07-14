/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration.TopicConfiguration;

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
}
