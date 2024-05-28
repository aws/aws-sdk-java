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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the logging configuration settings for the pipe.
 * </p>
 * <p>
 * When you call <code>UpdatePipe</code>, EventBridge updates the fields in the
 * <code>PipeLogConfigurationParameters</code> object atomically as one and overrides existing values. This is by
 * design. If you don't specify an optional field in any of the Amazon Web Services service parameters objects (
 * <code>CloudwatchLogsLogDestinationParameters</code>, <code>FirehoseLogDestinationParameters</code>, or
 * <code>S3LogDestinationParameters</code>), EventBridge sets that field to its system-default value during the update.
 * </p>
 * <p>
 * For example, suppose when you created the pipe you specified a Kinesis Data Firehose stream log destination. You then
 * update the pipe to add an Amazon S3 log destination. In addition to specifying the
 * <code>S3LogDestinationParameters</code> for the new log destination, you must also specify the fields in the
 * <code>FirehoseLogDestinationParameters</code> object in order to retain the Kinesis Data Firehose stream log
 * destination.
 * </p>
 * <p>
 * For more information on generating pipe log records, see <a
 * href="eventbridge/latest/userguide/eb-pipes-logs.html">Log EventBridge Pipes</a> in the <i>Amazon EventBridge User
 * Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeLogConfigurationParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeLogConfigurationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon CloudWatch Logs logging configuration settings for the pipe.
     * </p>
     */
    private CloudwatchLogsLogDestinationParameters cloudwatchLogsLogDestination;
    /**
     * <p>
     * The Amazon Kinesis Data Firehose logging configuration settings for the pipe.
     * </p>
     */
    private FirehoseLogDestinationParameters firehoseLogDestination;
    /**
     * <p>
     * Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     * <code>awsRequest</code> fields) in the log messages for this pipe.
     * </p>
     * <p>
     * This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     * >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The default is <code>OFF</code>.
     * </p>
     */
    private java.util.List<String> includeExecutionData;
    /**
     * <p>
     * The level of logging detail to include. This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level">Specifying
     * EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     */
    private String level;
    /**
     * <p>
     * The Amazon S3 logging configuration settings for the pipe.
     * </p>
     */
    private S3LogDestinationParameters s3LogDestination;

    /**
     * <p>
     * The Amazon CloudWatch Logs logging configuration settings for the pipe.
     * </p>
     * 
     * @param cloudwatchLogsLogDestination
     *        The Amazon CloudWatch Logs logging configuration settings for the pipe.
     */

    public void setCloudwatchLogsLogDestination(CloudwatchLogsLogDestinationParameters cloudwatchLogsLogDestination) {
        this.cloudwatchLogsLogDestination = cloudwatchLogsLogDestination;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs logging configuration settings for the pipe.
     * </p>
     * 
     * @return The Amazon CloudWatch Logs logging configuration settings for the pipe.
     */

    public CloudwatchLogsLogDestinationParameters getCloudwatchLogsLogDestination() {
        return this.cloudwatchLogsLogDestination;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs logging configuration settings for the pipe.
     * </p>
     * 
     * @param cloudwatchLogsLogDestination
     *        The Amazon CloudWatch Logs logging configuration settings for the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeLogConfigurationParameters withCloudwatchLogsLogDestination(CloudwatchLogsLogDestinationParameters cloudwatchLogsLogDestination) {
        setCloudwatchLogsLogDestination(cloudwatchLogsLogDestination);
        return this;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose logging configuration settings for the pipe.
     * </p>
     * 
     * @param firehoseLogDestination
     *        The Amazon Kinesis Data Firehose logging configuration settings for the pipe.
     */

    public void setFirehoseLogDestination(FirehoseLogDestinationParameters firehoseLogDestination) {
        this.firehoseLogDestination = firehoseLogDestination;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose logging configuration settings for the pipe.
     * </p>
     * 
     * @return The Amazon Kinesis Data Firehose logging configuration settings for the pipe.
     */

    public FirehoseLogDestinationParameters getFirehoseLogDestination() {
        return this.firehoseLogDestination;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose logging configuration settings for the pipe.
     * </p>
     * 
     * @param firehoseLogDestination
     *        The Amazon Kinesis Data Firehose logging configuration settings for the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeLogConfigurationParameters withFirehoseLogDestination(FirehoseLogDestinationParameters firehoseLogDestination) {
        setFirehoseLogDestination(firehoseLogDestination);
        return this;
    }

    /**
     * <p>
     * Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     * <code>awsRequest</code> fields) in the log messages for this pipe.
     * </p>
     * <p>
     * This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     * >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The default is <code>OFF</code>.
     * </p>
     * 
     * @return Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     *         <code>awsRequest</code> fields) in the log messages for this pipe.</p>
     *         <p>
     *         This applies to all log destinations for the pipe.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     *         >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     *         </p>
     *         <p>
     *         The default is <code>OFF</code>.
     * @see IncludeExecutionDataOption
     */

    public java.util.List<String> getIncludeExecutionData() {
        return includeExecutionData;
    }

    /**
     * <p>
     * Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     * <code>awsRequest</code> fields) in the log messages for this pipe.
     * </p>
     * <p>
     * This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     * >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The default is <code>OFF</code>.
     * </p>
     * 
     * @param includeExecutionData
     *        Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     *        <code>awsRequest</code> fields) in the log messages for this pipe.</p>
     *        <p>
     *        This applies to all log destinations for the pipe.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     *        >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     *        </p>
     *        <p>
     *        The default is <code>OFF</code>.
     * @see IncludeExecutionDataOption
     */

    public void setIncludeExecutionData(java.util.Collection<String> includeExecutionData) {
        if (includeExecutionData == null) {
            this.includeExecutionData = null;
            return;
        }

        this.includeExecutionData = new java.util.ArrayList<String>(includeExecutionData);
    }

    /**
     * <p>
     * Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     * <code>awsRequest</code> fields) in the log messages for this pipe.
     * </p>
     * <p>
     * This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     * >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The default is <code>OFF</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeExecutionData(java.util.Collection)} or {@link #withIncludeExecutionData(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param includeExecutionData
     *        Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     *        <code>awsRequest</code> fields) in the log messages for this pipe.</p>
     *        <p>
     *        This applies to all log destinations for the pipe.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     *        >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     *        </p>
     *        <p>
     *        The default is <code>OFF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncludeExecutionDataOption
     */

    public PipeLogConfigurationParameters withIncludeExecutionData(String... includeExecutionData) {
        if (this.includeExecutionData == null) {
            setIncludeExecutionData(new java.util.ArrayList<String>(includeExecutionData.length));
        }
        for (String ele : includeExecutionData) {
            this.includeExecutionData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     * <code>awsRequest</code> fields) in the log messages for this pipe.
     * </p>
     * <p>
     * This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     * >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The default is <code>OFF</code>.
     * </p>
     * 
     * @param includeExecutionData
     *        Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     *        <code>awsRequest</code> fields) in the log messages for this pipe.</p>
     *        <p>
     *        This applies to all log destinations for the pipe.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     *        >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     *        </p>
     *        <p>
     *        The default is <code>OFF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncludeExecutionDataOption
     */

    public PipeLogConfigurationParameters withIncludeExecutionData(java.util.Collection<String> includeExecutionData) {
        setIncludeExecutionData(includeExecutionData);
        return this;
    }

    /**
     * <p>
     * Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     * <code>awsRequest</code> fields) in the log messages for this pipe.
     * </p>
     * <p>
     * This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     * >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The default is <code>OFF</code>.
     * </p>
     * 
     * @param includeExecutionData
     *        Specify <code>ON</code> to include the execution data (specifically, the <code>payload</code> and
     *        <code>awsRequest</code> fields) in the log messages for this pipe.</p>
     *        <p>
     *        This applies to all log destinations for the pipe.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data"
     *        >Including execution data in logs</a> in the <i>Amazon EventBridge User Guide</i>.
     *        </p>
     *        <p>
     *        The default is <code>OFF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncludeExecutionDataOption
     */

    public PipeLogConfigurationParameters withIncludeExecutionData(IncludeExecutionDataOption... includeExecutionData) {
        java.util.ArrayList<String> includeExecutionDataCopy = new java.util.ArrayList<String>(includeExecutionData.length);
        for (IncludeExecutionDataOption value : includeExecutionData) {
            includeExecutionDataCopy.add(value.toString());
        }
        if (getIncludeExecutionData() == null) {
            setIncludeExecutionData(includeExecutionDataCopy);
        } else {
            getIncludeExecutionData().addAll(includeExecutionDataCopy);
        }
        return this;
    }

    /**
     * <p>
     * The level of logging detail to include. This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level">Specifying
     * EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param level
     *        The level of logging detail to include. This applies to all log destinations for the pipe.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level"
     *        >Specifying EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * @see LogLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The level of logging detail to include. This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level">Specifying
     * EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @return The level of logging detail to include. This applies to all log destinations for the pipe.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level"
     *         >Specifying EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * @see LogLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The level of logging detail to include. This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level">Specifying
     * EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param level
     *        The level of logging detail to include. This applies to all log destinations for the pipe.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level"
     *        >Specifying EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public PipeLogConfigurationParameters withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The level of logging detail to include. This applies to all log destinations for the pipe.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level">Specifying
     * EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param level
     *        The level of logging detail to include. This applies to all log destinations for the pipe.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-level"
     *        >Specifying EventBridge Pipes log level</a> in the <i>Amazon EventBridge User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public PipeLogConfigurationParameters withLevel(LogLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 logging configuration settings for the pipe.
     * </p>
     * 
     * @param s3LogDestination
     *        The Amazon S3 logging configuration settings for the pipe.
     */

    public void setS3LogDestination(S3LogDestinationParameters s3LogDestination) {
        this.s3LogDestination = s3LogDestination;
    }

    /**
     * <p>
     * The Amazon S3 logging configuration settings for the pipe.
     * </p>
     * 
     * @return The Amazon S3 logging configuration settings for the pipe.
     */

    public S3LogDestinationParameters getS3LogDestination() {
        return this.s3LogDestination;
    }

    /**
     * <p>
     * The Amazon S3 logging configuration settings for the pipe.
     * </p>
     * 
     * @param s3LogDestination
     *        The Amazon S3 logging configuration settings for the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeLogConfigurationParameters withS3LogDestination(S3LogDestinationParameters s3LogDestination) {
        setS3LogDestination(s3LogDestination);
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
        if (getCloudwatchLogsLogDestination() != null)
            sb.append("CloudwatchLogsLogDestination: ").append(getCloudwatchLogsLogDestination()).append(",");
        if (getFirehoseLogDestination() != null)
            sb.append("FirehoseLogDestination: ").append(getFirehoseLogDestination()).append(",");
        if (getIncludeExecutionData() != null)
            sb.append("IncludeExecutionData: ").append(getIncludeExecutionData()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getS3LogDestination() != null)
            sb.append("S3LogDestination: ").append(getS3LogDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeLogConfigurationParameters == false)
            return false;
        PipeLogConfigurationParameters other = (PipeLogConfigurationParameters) obj;
        if (other.getCloudwatchLogsLogDestination() == null ^ this.getCloudwatchLogsLogDestination() == null)
            return false;
        if (other.getCloudwatchLogsLogDestination() != null && other.getCloudwatchLogsLogDestination().equals(this.getCloudwatchLogsLogDestination()) == false)
            return false;
        if (other.getFirehoseLogDestination() == null ^ this.getFirehoseLogDestination() == null)
            return false;
        if (other.getFirehoseLogDestination() != null && other.getFirehoseLogDestination().equals(this.getFirehoseLogDestination()) == false)
            return false;
        if (other.getIncludeExecutionData() == null ^ this.getIncludeExecutionData() == null)
            return false;
        if (other.getIncludeExecutionData() != null && other.getIncludeExecutionData().equals(this.getIncludeExecutionData()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getS3LogDestination() == null ^ this.getS3LogDestination() == null)
            return false;
        if (other.getS3LogDestination() != null && other.getS3LogDestination().equals(this.getS3LogDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudwatchLogsLogDestination() == null) ? 0 : getCloudwatchLogsLogDestination().hashCode());
        hashCode = prime * hashCode + ((getFirehoseLogDestination() == null) ? 0 : getFirehoseLogDestination().hashCode());
        hashCode = prime * hashCode + ((getIncludeExecutionData() == null) ? 0 : getIncludeExecutionData().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getS3LogDestination() == null) ? 0 : getS3LogDestination().hashCode());
        return hashCode;
    }

    @Override
    public PipeLogConfigurationParameters clone() {
        try {
            return (PipeLogConfigurationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeLogConfigurationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
