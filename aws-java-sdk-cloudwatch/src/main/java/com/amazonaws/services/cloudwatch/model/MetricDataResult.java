/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A <code>GetMetricData</code> call returns an array of <code>MetricDataResult</code> structures. Each of these
 * structures includes the data points for that metric, along with the timestamps of those data points and other
 * identifying information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricDataResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataResult implements Serializable, Cloneable {

    /**
     * <p>
     * The short name you specified to represent this metric.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The human-readable label associated with the data.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches
     * the number of values and the value for Timestamps[x] is Values[x].
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Date> timestamps;
    /**
     * <p>
     * The data points for the metric corresponding to <code>Timestamps</code>. The number of values always matches the
     * number of timestamps and the timestamp for Values[x] is Timestamps[x].
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Double> values;
    /**
     * <p>
     * The status of the returned data. <code>Complete</code> indicates that all data points in the requested time range
     * were returned. <code>PartialData</code> means that an incomplete set of data points were returned. You can use
     * the <code>NextToken</code> value that was returned and repeat your request to get more data points.
     * <code>NextToken</code> is not returned if you are performing a math expression. <code>InternalError</code>
     * indicates that an error occurred. Retry your request using <code>NextToken</code>, if present.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A list of messages with additional information about the data returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MessageData> messages;

    /**
     * <p>
     * The short name you specified to represent this metric.
     * </p>
     * 
     * @param id
     *        The short name you specified to represent this metric.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The short name you specified to represent this metric.
     * </p>
     * 
     * @return The short name you specified to represent this metric.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The short name you specified to represent this metric.
     * </p>
     * 
     * @param id
     *        The short name you specified to represent this metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The human-readable label associated with the data.
     * </p>
     * 
     * @param label
     *        The human-readable label associated with the data.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The human-readable label associated with the data.
     * </p>
     * 
     * @return The human-readable label associated with the data.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The human-readable label associated with the data.
     * </p>
     * 
     * @param label
     *        The human-readable label associated with the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches
     * the number of values and the value for Timestamps[x] is Values[x].
     * </p>
     * 
     * @return The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always
     *         matches the number of values and the value for Timestamps[x] is Values[x].
     */

    public java.util.List<java.util.Date> getTimestamps() {
        if (timestamps == null) {
            timestamps = new com.amazonaws.internal.SdkInternalList<java.util.Date>();
        }
        return timestamps;
    }

    /**
     * <p>
     * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches
     * the number of values and the value for Timestamps[x] is Values[x].
     * </p>
     * 
     * @param timestamps
     *        The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always
     *        matches the number of values and the value for Timestamps[x] is Values[x].
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new com.amazonaws.internal.SdkInternalList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches
     * the number of values and the value for Timestamps[x] is Values[x].
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always
     *        matches the number of values and the value for Timestamps[x] is Values[x].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new com.amazonaws.internal.SdkInternalList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches
     * the number of values and the value for Timestamps[x] is Values[x].
     * </p>
     * 
     * @param timestamps
     *        The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always
     *        matches the number of values and the value for Timestamps[x] is Values[x].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>
     * The data points for the metric corresponding to <code>Timestamps</code>. The number of values always matches the
     * number of timestamps and the timestamp for Values[x] is Timestamps[x].
     * </p>
     * 
     * @return The data points for the metric corresponding to <code>Timestamps</code>. The number of values always
     *         matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
     */

    public java.util.List<Double> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<Double>();
        }
        return values;
    }

    /**
     * <p>
     * The data points for the metric corresponding to <code>Timestamps</code>. The number of values always matches the
     * number of timestamps and the timestamp for Values[x] is Timestamps[x].
     * </p>
     * 
     * @param values
     *        The data points for the metric corresponding to <code>Timestamps</code>. The number of values always
     *        matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<Double>(values);
    }

    /**
     * <p>
     * The data points for the metric corresponding to <code>Timestamps</code>. The number of values always matches the
     * number of timestamps and the timestamp for Values[x] is Timestamps[x].
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The data points for the metric corresponding to <code>Timestamps</code>. The number of values always
     *        matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withValues(Double... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data points for the metric corresponding to <code>Timestamps</code>. The number of values always matches the
     * number of timestamps and the timestamp for Values[x] is Timestamps[x].
     * </p>
     * 
     * @param values
     *        The data points for the metric corresponding to <code>Timestamps</code>. The number of values always
     *        matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withValues(java.util.Collection<Double> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The status of the returned data. <code>Complete</code> indicates that all data points in the requested time range
     * were returned. <code>PartialData</code> means that an incomplete set of data points were returned. You can use
     * the <code>NextToken</code> value that was returned and repeat your request to get more data points.
     * <code>NextToken</code> is not returned if you are performing a math expression. <code>InternalError</code>
     * indicates that an error occurred. Retry your request using <code>NextToken</code>, if present.
     * </p>
     * 
     * @param statusCode
     *        The status of the returned data. <code>Complete</code> indicates that all data points in the requested
     *        time range were returned. <code>PartialData</code> means that an incomplete set of data points were
     *        returned. You can use the <code>NextToken</code> value that was returned and repeat your request to get
     *        more data points. <code>NextToken</code> is not returned if you are performing a math expression.
     *        <code>InternalError</code> indicates that an error occurred. Retry your request using
     *        <code>NextToken</code>, if present.
     * @see StatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status of the returned data. <code>Complete</code> indicates that all data points in the requested time range
     * were returned. <code>PartialData</code> means that an incomplete set of data points were returned. You can use
     * the <code>NextToken</code> value that was returned and repeat your request to get more data points.
     * <code>NextToken</code> is not returned if you are performing a math expression. <code>InternalError</code>
     * indicates that an error occurred. Retry your request using <code>NextToken</code>, if present.
     * </p>
     * 
     * @return The status of the returned data. <code>Complete</code> indicates that all data points in the requested
     *         time range were returned. <code>PartialData</code> means that an incomplete set of data points were
     *         returned. You can use the <code>NextToken</code> value that was returned and repeat your request to get
     *         more data points. <code>NextToken</code> is not returned if you are performing a math expression.
     *         <code>InternalError</code> indicates that an error occurred. Retry your request using
     *         <code>NextToken</code>, if present.
     * @see StatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status of the returned data. <code>Complete</code> indicates that all data points in the requested time range
     * were returned. <code>PartialData</code> means that an incomplete set of data points were returned. You can use
     * the <code>NextToken</code> value that was returned and repeat your request to get more data points.
     * <code>NextToken</code> is not returned if you are performing a math expression. <code>InternalError</code>
     * indicates that an error occurred. Retry your request using <code>NextToken</code>, if present.
     * </p>
     * 
     * @param statusCode
     *        The status of the returned data. <code>Complete</code> indicates that all data points in the requested
     *        time range were returned. <code>PartialData</code> means that an incomplete set of data points were
     *        returned. You can use the <code>NextToken</code> value that was returned and repeat your request to get
     *        more data points. <code>NextToken</code> is not returned if you are performing a math expression.
     *        <code>InternalError</code> indicates that an error occurred. Retry your request using
     *        <code>NextToken</code>, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusCode
     */

    public MetricDataResult withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status of the returned data. <code>Complete</code> indicates that all data points in the requested time range
     * were returned. <code>PartialData</code> means that an incomplete set of data points were returned. You can use
     * the <code>NextToken</code> value that was returned and repeat your request to get more data points.
     * <code>NextToken</code> is not returned if you are performing a math expression. <code>InternalError</code>
     * indicates that an error occurred. Retry your request using <code>NextToken</code>, if present.
     * </p>
     * 
     * @param statusCode
     *        The status of the returned data. <code>Complete</code> indicates that all data points in the requested
     *        time range were returned. <code>PartialData</code> means that an incomplete set of data points were
     *        returned. You can use the <code>NextToken</code> value that was returned and repeat your request to get
     *        more data points. <code>NextToken</code> is not returned if you are performing a math expression.
     *        <code>InternalError</code> indicates that an error occurred. Retry your request using
     *        <code>NextToken</code>, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusCode
     */

    public MetricDataResult withStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * A list of messages with additional information about the data returned.
     * </p>
     * 
     * @return A list of messages with additional information about the data returned.
     */

    public java.util.List<MessageData> getMessages() {
        if (messages == null) {
            messages = new com.amazonaws.internal.SdkInternalList<MessageData>();
        }
        return messages;
    }

    /**
     * <p>
     * A list of messages with additional information about the data returned.
     * </p>
     * 
     * @param messages
     *        A list of messages with additional information about the data returned.
     */

    public void setMessages(java.util.Collection<MessageData> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new com.amazonaws.internal.SdkInternalList<MessageData>(messages);
    }

    /**
     * <p>
     * A list of messages with additional information about the data returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        A list of messages with additional information about the data returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withMessages(MessageData... messages) {
        if (this.messages == null) {
            setMessages(new com.amazonaws.internal.SdkInternalList<MessageData>(messages.length));
        }
        for (MessageData ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of messages with additional information about the data returned.
     * </p>
     * 
     * @param messages
     *        A list of messages with additional information about the data returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withMessages(java.util.Collection<MessageData> messages) {
        setMessages(messages);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDataResult == false)
            return false;
        MetricDataResult other = (MetricDataResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        return hashCode;
    }

    @Override
    public MetricDataResult clone() {
        try {
            return (MetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
