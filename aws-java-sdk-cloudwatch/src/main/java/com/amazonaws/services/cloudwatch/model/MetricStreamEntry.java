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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure contains the configuration information about one metric stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricStreamEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStreamEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the metric stream.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date that the metric stream was originally created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date that the configuration of this metric stream was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdateDate;
    /**
     * <p>
     * The name of the metric stream.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
     * </p>
     */
    private String firehoseArn;
    /**
     * <p>
     * The current state of this stream. Valid values are <code>running</code> and <code>stopped</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The output format of this metric stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     * </p>
     */
    private String outputFormat;

    /**
     * <p>
     * The ARN of the metric stream.
     * </p>
     * 
     * @param arn
     *        The ARN of the metric stream.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the metric stream.
     * </p>
     * 
     * @return The ARN of the metric stream.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the metric stream.
     * </p>
     * 
     * @param arn
     *        The ARN of the metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamEntry withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date that the metric stream was originally created.
     * </p>
     * 
     * @param creationDate
     *        The date that the metric stream was originally created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date that the metric stream was originally created.
     * </p>
     * 
     * @return The date that the metric stream was originally created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date that the metric stream was originally created.
     * </p>
     * 
     * @param creationDate
     *        The date that the metric stream was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamEntry withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date that the configuration of this metric stream was most recently updated.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date that the configuration of this metric stream was most recently updated.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date that the configuration of this metric stream was most recently updated.
     * </p>
     * 
     * @return The date that the configuration of this metric stream was most recently updated.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date that the configuration of this metric stream was most recently updated.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date that the configuration of this metric stream was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamEntry withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The name of the metric stream.
     * </p>
     * 
     * @param name
     *        The name of the metric stream.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric stream.
     * </p>
     * 
     * @return The name of the metric stream.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric stream.
     * </p>
     * 
     * @param name
     *        The name of the metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
     * </p>
     * 
     * @param firehoseArn
     *        The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
     */

    public void setFirehoseArn(String firehoseArn) {
        this.firehoseArn = firehoseArn;
    }

    /**
     * <p>
     * The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
     * </p>
     * 
     * @return The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
     */

    public String getFirehoseArn() {
        return this.firehoseArn;
    }

    /**
     * <p>
     * The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
     * </p>
     * 
     * @param firehoseArn
     *        The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamEntry withFirehoseArn(String firehoseArn) {
        setFirehoseArn(firehoseArn);
        return this;
    }

    /**
     * <p>
     * The current state of this stream. Valid values are <code>running</code> and <code>stopped</code>.
     * </p>
     * 
     * @param state
     *        The current state of this stream. Valid values are <code>running</code> and <code>stopped</code>.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of this stream. Valid values are <code>running</code> and <code>stopped</code>.
     * </p>
     * 
     * @return The current state of this stream. Valid values are <code>running</code> and <code>stopped</code>.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of this stream. Valid values are <code>running</code> and <code>stopped</code>.
     * </p>
     * 
     * @param state
     *        The current state of this stream. Valid values are <code>running</code> and <code>stopped</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamEntry withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The output format of this metric stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     * </p>
     * 
     * @param outputFormat
     *        The output format of this metric stream. Valid values are <code>json</code> and
     *        <code>opentelemetry0.7</code>.
     * @see MetricStreamOutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The output format of this metric stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     * </p>
     * 
     * @return The output format of this metric stream. Valid values are <code>json</code> and
     *         <code>opentelemetry0.7</code>.
     * @see MetricStreamOutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The output format of this metric stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     * </p>
     * 
     * @param outputFormat
     *        The output format of this metric stream. Valid values are <code>json</code> and
     *        <code>opentelemetry0.7</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStreamOutputFormat
     */

    public MetricStreamEntry withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The output format of this metric stream. Valid values are <code>json</code> and <code>opentelemetry0.7</code>.
     * </p>
     * 
     * @param outputFormat
     *        The output format of this metric stream. Valid values are <code>json</code> and
     *        <code>opentelemetry0.7</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStreamOutputFormat
     */

    public MetricStreamEntry withOutputFormat(MetricStreamOutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFirehoseArn() != null)
            sb.append("FirehoseArn: ").append(getFirehoseArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricStreamEntry == false)
            return false;
        MetricStreamEntry other = (MetricStreamEntry) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFirehoseArn() == null ^ this.getFirehoseArn() == null)
            return false;
        if (other.getFirehoseArn() != null && other.getFirehoseArn().equals(this.getFirehoseArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFirehoseArn() == null) ? 0 : getFirehoseArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        return hashCode;
    }

    @Override
    public MetricStreamEntry clone() {
        try {
            return (MetricStreamEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
