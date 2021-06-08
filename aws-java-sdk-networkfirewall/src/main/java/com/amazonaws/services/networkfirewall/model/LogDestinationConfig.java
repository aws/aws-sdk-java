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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines where AWS Network Firewall sends logs for the firewall for one log type. This is used in
 * <a>LoggingConfiguration</a>. You can send each type of log to an Amazon S3 bucket, a CloudWatch log group, or a
 * Kinesis Data Firehose delivery stream.
 * </p>
 * <p>
 * Network Firewall generates logs for stateful rule groups. You can save alert and flow log types. The stateful rules
 * engine records flow logs for all network traffic that it receives. It records alert logs for traffic that matches
 * stateful rules that have the rule action set to <code>DROP</code> or <code>ALERT</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/LogDestinationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDestinationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action setting that
     * sends an alert log message. Flow logs are standard network traffic flow logs.
     * </p>
     */
    private String logType;
    /**
     * <p>
     * The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a CloudWatch log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     */
    private String logDestinationType;
    /**
     * <p>
     * The named location for the logs, provided in a key:value mapping that is specific to the chosen destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Amazon S3 bucket, provide the name of the bucket, with key <code>bucketName</code>, and optionally provide
     * a prefix, with key <code>prefix</code>. The following example specifies an Amazon S3 bucket named
     * <code>DOC-EXAMPLE-BUCKET</code> and the prefix <code>alerts</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a CloudWatch log group, provide the name of the CloudWatch log group, with key <code>logGroup</code>. The
     * following example specifies a log group named <code>alert-log-group</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "logGroup": "alert-log-group" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key
     * <code>deliveryStream</code>. The following example specifies a delivery stream named
     * <code>alert-delivery-stream</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "deliveryStream": "alert-delivery-stream" }</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> logDestination;

    /**
     * <p>
     * The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action setting that
     * sends an alert log message. Flow logs are standard network traffic flow logs.
     * </p>
     * 
     * @param logType
     *        The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action
     *        setting that sends an alert log message. Flow logs are standard network traffic flow logs.
     * @see LogType
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action setting that
     * sends an alert log message. Flow logs are standard network traffic flow logs.
     * </p>
     * 
     * @return The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action
     *         setting that sends an alert log message. Flow logs are standard network traffic flow logs.
     * @see LogType
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action setting that
     * sends an alert log message. Flow logs are standard network traffic flow logs.
     * </p>
     * 
     * @param logType
     *        The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action
     *        setting that sends an alert log message. Flow logs are standard network traffic flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogDestinationConfig withLogType(String logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action setting that
     * sends an alert log message. Flow logs are standard network traffic flow logs.
     * </p>
     * 
     * @param logType
     *        The type of log to send. Alert logs report traffic that matches a <a>StatefulRule</a> with an action
     *        setting that sends an alert log message. Flow logs are standard network traffic flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogDestinationConfig withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a CloudWatch log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @param logDestinationType
     *        The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a
     *        CloudWatch log group, or a Kinesis Data Firehose delivery stream.
     * @see LogDestinationType
     */

    public void setLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    /**
     * <p>
     * The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a CloudWatch log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @return The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a
     *         CloudWatch log group, or a Kinesis Data Firehose delivery stream.
     * @see LogDestinationType
     */

    public String getLogDestinationType() {
        return this.logDestinationType;
    }

    /**
     * <p>
     * The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a CloudWatch log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @param logDestinationType
     *        The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a
     *        CloudWatch log group, or a Kinesis Data Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public LogDestinationConfig withLogDestinationType(String logDestinationType) {
        setLogDestinationType(logDestinationType);
        return this;
    }

    /**
     * <p>
     * The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a CloudWatch log
     * group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * 
     * @param logDestinationType
     *        The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a
     *        CloudWatch log group, or a Kinesis Data Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDestinationType
     */

    public LogDestinationConfig withLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * The named location for the logs, provided in a key:value mapping that is specific to the chosen destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Amazon S3 bucket, provide the name of the bucket, with key <code>bucketName</code>, and optionally provide
     * a prefix, with key <code>prefix</code>. The following example specifies an Amazon S3 bucket named
     * <code>DOC-EXAMPLE-BUCKET</code> and the prefix <code>alerts</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a CloudWatch log group, provide the name of the CloudWatch log group, with key <code>logGroup</code>. The
     * following example specifies a log group named <code>alert-log-group</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "logGroup": "alert-log-group" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key
     * <code>deliveryStream</code>. The following example specifies a delivery stream named
     * <code>alert-delivery-stream</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "deliveryStream": "alert-delivery-stream" }</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The named location for the logs, provided in a key:value mapping that is specific to the chosen
     *         destination type. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an Amazon S3 bucket, provide the name of the bucket, with key <code>bucketName</code>, and optionally
     *         provide a prefix, with key <code>prefix</code>. The following example specifies an Amazon S3 bucket named
     *         <code>DOC-EXAMPLE-BUCKET</code> and the prefix <code>alerts</code>:
     *         </p>
     *         <p>
     *         <code>"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For a CloudWatch log group, provide the name of the CloudWatch log group, with key <code>logGroup</code>.
     *         The following example specifies a log group named <code>alert-log-group</code>:
     *         </p>
     *         <p>
     *         <code>"LogDestination": { "logGroup": "alert-log-group" }</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key
     *         <code>deliveryStream</code>. The following example specifies a delivery stream named
     *         <code>alert-delivery-stream</code>:
     *         </p>
     *         <p>
     *         <code>"LogDestination": { "deliveryStream": "alert-delivery-stream" }</code>
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getLogDestination() {
        return logDestination;
    }

    /**
     * <p>
     * The named location for the logs, provided in a key:value mapping that is specific to the chosen destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Amazon S3 bucket, provide the name of the bucket, with key <code>bucketName</code>, and optionally provide
     * a prefix, with key <code>prefix</code>. The following example specifies an Amazon S3 bucket named
     * <code>DOC-EXAMPLE-BUCKET</code> and the prefix <code>alerts</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a CloudWatch log group, provide the name of the CloudWatch log group, with key <code>logGroup</code>. The
     * following example specifies a log group named <code>alert-log-group</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "logGroup": "alert-log-group" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key
     * <code>deliveryStream</code>. The following example specifies a delivery stream named
     * <code>alert-delivery-stream</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "deliveryStream": "alert-delivery-stream" }</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logDestination
     *        The named location for the logs, provided in a key:value mapping that is specific to the chosen
     *        destination type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Amazon S3 bucket, provide the name of the bucket, with key <code>bucketName</code>, and optionally
     *        provide a prefix, with key <code>prefix</code>. The following example specifies an Amazon S3 bucket named
     *        <code>DOC-EXAMPLE-BUCKET</code> and the prefix <code>alerts</code>:
     *        </p>
     *        <p>
     *        <code>"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a CloudWatch log group, provide the name of the CloudWatch log group, with key <code>logGroup</code>.
     *        The following example specifies a log group named <code>alert-log-group</code>:
     *        </p>
     *        <p>
     *        <code>"LogDestination": { "logGroup": "alert-log-group" }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key
     *        <code>deliveryStream</code>. The following example specifies a delivery stream named
     *        <code>alert-delivery-stream</code>:
     *        </p>
     *        <p>
     *        <code>"LogDestination": { "deliveryStream": "alert-delivery-stream" }</code>
     *        </p>
     *        </li>
     */

    public void setLogDestination(java.util.Map<String, String> logDestination) {
        this.logDestination = logDestination;
    }

    /**
     * <p>
     * The named location for the logs, provided in a key:value mapping that is specific to the chosen destination type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Amazon S3 bucket, provide the name of the bucket, with key <code>bucketName</code>, and optionally provide
     * a prefix, with key <code>prefix</code>. The following example specifies an Amazon S3 bucket named
     * <code>DOC-EXAMPLE-BUCKET</code> and the prefix <code>alerts</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a CloudWatch log group, provide the name of the CloudWatch log group, with key <code>logGroup</code>. The
     * following example specifies a log group named <code>alert-log-group</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "logGroup": "alert-log-group" }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key
     * <code>deliveryStream</code>. The following example specifies a delivery stream named
     * <code>alert-delivery-stream</code>:
     * </p>
     * <p>
     * <code>"LogDestination": { "deliveryStream": "alert-delivery-stream" }</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logDestination
     *        The named location for the logs, provided in a key:value mapping that is specific to the chosen
     *        destination type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Amazon S3 bucket, provide the name of the bucket, with key <code>bucketName</code>, and optionally
     *        provide a prefix, with key <code>prefix</code>. The following example specifies an Amazon S3 bucket named
     *        <code>DOC-EXAMPLE-BUCKET</code> and the prefix <code>alerts</code>:
     *        </p>
     *        <p>
     *        <code>"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a CloudWatch log group, provide the name of the CloudWatch log group, with key <code>logGroup</code>.
     *        The following example specifies a log group named <code>alert-log-group</code>:
     *        </p>
     *        <p>
     *        <code>"LogDestination": { "logGroup": "alert-log-group" }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key
     *        <code>deliveryStream</code>. The following example specifies a delivery stream named
     *        <code>alert-delivery-stream</code>:
     *        </p>
     *        <p>
     *        <code>"LogDestination": { "deliveryStream": "alert-delivery-stream" }</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDestinationConfig withLogDestination(java.util.Map<String, String> logDestination) {
        setLogDestination(logDestination);
        return this;
    }

    /**
     * Add a single LogDestination entry
     *
     * @see LogDestinationConfig#withLogDestination
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LogDestinationConfig addLogDestinationEntry(String key, String value) {
        if (null == this.logDestination) {
            this.logDestination = new java.util.HashMap<String, String>();
        }
        if (this.logDestination.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logDestination.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogDestination.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDestinationConfig clearLogDestinationEntries() {
        this.logDestination = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType()).append(",");
        if (getLogDestinationType() != null)
            sb.append("LogDestinationType: ").append(getLogDestinationType()).append(",");
        if (getLogDestination() != null)
            sb.append("LogDestination: ").append(getLogDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogDestinationConfig == false)
            return false;
        LogDestinationConfig other = (LogDestinationConfig) obj;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        if (other.getLogDestinationType() == null ^ this.getLogDestinationType() == null)
            return false;
        if (other.getLogDestinationType() != null && other.getLogDestinationType().equals(this.getLogDestinationType()) == false)
            return false;
        if (other.getLogDestination() == null ^ this.getLogDestination() == null)
            return false;
        if (other.getLogDestination() != null && other.getLogDestination().equals(this.getLogDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode + ((getLogDestinationType() == null) ? 0 : getLogDestinationType().hashCode());
        hashCode = prime * hashCode + ((getLogDestination() == null) ? 0 : getLogDestination().hashCode());
        return hashCode;
    }

    @Override
    public LogDestinationConfig clone() {
        try {
            return (LogDestinationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.LogDestinationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
