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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the metric stream.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the metric stream.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are
     * streamed by this metric stream.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricStreamFilter> includeFilters;
    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are not
     * streamed by this metric stream. In this case, all other metric namespaces in the account are streamed by this
     * metric stream.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricStreamFilter> excludeFilters;
    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
     * </p>
     */
    private String firehoseArn;
    /**
     * <p>
     * The ARN of the IAM role that is used by this metric stream.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The state of the metric stream. The possible values are <code>running</code> and <code>stopped</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date that the metric stream was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date of the most recent update to the metric stream's configuration.
     * </p>
     */
    private java.util.Date lastUpdateDate;
    /** <p/> */
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

    public GetMetricStreamResult withArn(String arn) {
        setArn(arn);
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

    public GetMetricStreamResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are
     * streamed by this metric stream.
     * </p>
     * 
     * @return If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *         are streamed by this metric stream.
     */

    public java.util.List<MetricStreamFilter> getIncludeFilters() {
        if (includeFilters == null) {
            includeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>();
        }
        return includeFilters;
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are
     * streamed by this metric stream.
     * </p>
     * 
     * @param includeFilters
     *        If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *        are streamed by this metric stream.
     */

    public void setIncludeFilters(java.util.Collection<MetricStreamFilter> includeFilters) {
        if (includeFilters == null) {
            this.includeFilters = null;
            return;
        }

        this.includeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(includeFilters);
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are
     * streamed by this metric stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeFilters(java.util.Collection)} or {@link #withIncludeFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includeFilters
     *        If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *        are streamed by this metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withIncludeFilters(MetricStreamFilter... includeFilters) {
        if (this.includeFilters == null) {
            setIncludeFilters(new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(includeFilters.length));
        }
        for (MetricStreamFilter ele : includeFilters) {
            this.includeFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are
     * streamed by this metric stream.
     * </p>
     * 
     * @param includeFilters
     *        If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *        are streamed by this metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withIncludeFilters(java.util.Collection<MetricStreamFilter> includeFilters) {
        setIncludeFilters(includeFilters);
        return this;
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are not
     * streamed by this metric stream. In this case, all other metric namespaces in the account are streamed by this
     * metric stream.
     * </p>
     * 
     * @return If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *         are not streamed by this metric stream. In this case, all other metric namespaces in the account are
     *         streamed by this metric stream.
     */

    public java.util.List<MetricStreamFilter> getExcludeFilters() {
        if (excludeFilters == null) {
            excludeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>();
        }
        return excludeFilters;
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are not
     * streamed by this metric stream. In this case, all other metric namespaces in the account are streamed by this
     * metric stream.
     * </p>
     * 
     * @param excludeFilters
     *        If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *        are not streamed by this metric stream. In this case, all other metric namespaces in the account are
     *        streamed by this metric stream.
     */

    public void setExcludeFilters(java.util.Collection<MetricStreamFilter> excludeFilters) {
        if (excludeFilters == null) {
            this.excludeFilters = null;
            return;
        }

        this.excludeFilters = new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(excludeFilters);
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are not
     * streamed by this metric stream. In this case, all other metric namespaces in the account are streamed by this
     * metric stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeFilters(java.util.Collection)} or {@link #withExcludeFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludeFilters
     *        If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *        are not streamed by this metric stream. In this case, all other metric namespaces in the account are
     *        streamed by this metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withExcludeFilters(MetricStreamFilter... excludeFilters) {
        if (this.excludeFilters == null) {
            setExcludeFilters(new com.amazonaws.internal.SdkInternalList<MetricStreamFilter>(excludeFilters.length));
        }
        for (MetricStreamFilter ele : excludeFilters) {
            this.excludeFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If this array of metric namespaces is present, then these namespaces are the only metric namespaces that are not
     * streamed by this metric stream. In this case, all other metric namespaces in the account are streamed by this
     * metric stream.
     * </p>
     * 
     * @param excludeFilters
     *        If this array of metric namespaces is present, then these namespaces are the only metric namespaces that
     *        are not streamed by this metric stream. In this case, all other metric namespaces in the account are
     *        streamed by this metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withExcludeFilters(java.util.Collection<MetricStreamFilter> excludeFilters) {
        setExcludeFilters(excludeFilters);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
     * </p>
     * 
     * @param firehoseArn
     *        The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
     */

    public void setFirehoseArn(String firehoseArn) {
        this.firehoseArn = firehoseArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
     * </p>
     * 
     * @return The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
     */

    public String getFirehoseArn() {
        return this.firehoseArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
     * </p>
     * 
     * @param firehoseArn
     *        The ARN of the Amazon Kinesis Firehose delivery stream that is used by this metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withFirehoseArn(String firehoseArn) {
        setFirehoseArn(firehoseArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used by this metric stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that is used by this metric stream.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used by this metric stream.
     * </p>
     * 
     * @return The ARN of the IAM role that is used by this metric stream.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used by this metric stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that is used by this metric stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The state of the metric stream. The possible values are <code>running</code> and <code>stopped</code>.
     * </p>
     * 
     * @param state
     *        The state of the metric stream. The possible values are <code>running</code> and <code>stopped</code>.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the metric stream. The possible values are <code>running</code> and <code>stopped</code>.
     * </p>
     * 
     * @return The state of the metric stream. The possible values are <code>running</code> and <code>stopped</code>.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the metric stream. The possible values are <code>running</code> and <code>stopped</code>.
     * </p>
     * 
     * @param state
     *        The state of the metric stream. The possible values are <code>running</code> and <code>stopped</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The date that the metric stream was created.
     * </p>
     * 
     * @param creationDate
     *        The date that the metric stream was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date that the metric stream was created.
     * </p>
     * 
     * @return The date that the metric stream was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date that the metric stream was created.
     * </p>
     * 
     * @param creationDate
     *        The date that the metric stream was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date of the most recent update to the metric stream's configuration.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date of the most recent update to the metric stream's configuration.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date of the most recent update to the metric stream's configuration.
     * </p>
     * 
     * @return The date of the most recent update to the metric stream's configuration.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date of the most recent update to the metric stream's configuration.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date of the most recent update to the metric stream's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStreamResult withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * <p/>
     * 
     * @param outputFormat
     * @see MetricStreamOutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p/>
     * 
     * @return
     * @see MetricStreamOutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p/>
     * 
     * @param outputFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStreamOutputFormat
     */

    public GetMetricStreamResult withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p/>
     * 
     * @param outputFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStreamOutputFormat
     */

    public GetMetricStreamResult withOutputFormat(MetricStreamOutputFormat outputFormat) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIncludeFilters() != null)
            sb.append("IncludeFilters: ").append(getIncludeFilters()).append(",");
        if (getExcludeFilters() != null)
            sb.append("ExcludeFilters: ").append(getExcludeFilters()).append(",");
        if (getFirehoseArn() != null)
            sb.append("FirehoseArn: ").append(getFirehoseArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate()).append(",");
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

        if (obj instanceof GetMetricStreamResult == false)
            return false;
        GetMetricStreamResult other = (GetMetricStreamResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIncludeFilters() == null ^ this.getIncludeFilters() == null)
            return false;
        if (other.getIncludeFilters() != null && other.getIncludeFilters().equals(this.getIncludeFilters()) == false)
            return false;
        if (other.getExcludeFilters() == null ^ this.getExcludeFilters() == null)
            return false;
        if (other.getExcludeFilters() != null && other.getExcludeFilters().equals(this.getExcludeFilters()) == false)
            return false;
        if (other.getFirehoseArn() == null ^ this.getFirehoseArn() == null)
            return false;
        if (other.getFirehoseArn() != null && other.getFirehoseArn().equals(this.getFirehoseArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIncludeFilters() == null) ? 0 : getIncludeFilters().hashCode());
        hashCode = prime * hashCode + ((getExcludeFilters() == null) ? 0 : getExcludeFilters().hashCode());
        hashCode = prime * hashCode + ((getFirehoseArn() == null) ? 0 : getFirehoseArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricStreamResult clone() {
        try {
            return (GetMetricStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
