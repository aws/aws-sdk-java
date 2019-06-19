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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metrics that are returned, including the metric name, namespace, and dimensions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDataResult> metricDataResults;
    /**
     * <p>
     * A token that marks the next batch of returned results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a message.
     * An example of a message that may be returned is <code>Maximum number of allowed metrics exceeded</code>. If there
     * is a message, as much of the operation as possible is still executed.
     * </p>
     * <p>
     * A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any message
     * about a specific metric returned by the operation appears in the <code>MetricDataResult</code> object returned
     * for that metric.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MessageData> messages;

    /**
     * <p>
     * The metrics that are returned, including the metric name, namespace, and dimensions.
     * </p>
     * 
     * @return The metrics that are returned, including the metric name, namespace, and dimensions.
     */

    public java.util.List<MetricDataResult> getMetricDataResults() {
        if (metricDataResults == null) {
            metricDataResults = new com.amazonaws.internal.SdkInternalList<MetricDataResult>();
        }
        return metricDataResults;
    }

    /**
     * <p>
     * The metrics that are returned, including the metric name, namespace, and dimensions.
     * </p>
     * 
     * @param metricDataResults
     *        The metrics that are returned, including the metric name, namespace, and dimensions.
     */

    public void setMetricDataResults(java.util.Collection<MetricDataResult> metricDataResults) {
        if (metricDataResults == null) {
            this.metricDataResults = null;
            return;
        }

        this.metricDataResults = new com.amazonaws.internal.SdkInternalList<MetricDataResult>(metricDataResults);
    }

    /**
     * <p>
     * The metrics that are returned, including the metric name, namespace, and dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDataResults(java.util.Collection)} or {@link #withMetricDataResults(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDataResults
     *        The metrics that are returned, including the metric name, namespace, and dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataResult withMetricDataResults(MetricDataResult... metricDataResults) {
        if (this.metricDataResults == null) {
            setMetricDataResults(new com.amazonaws.internal.SdkInternalList<MetricDataResult>(metricDataResults.length));
        }
        for (MetricDataResult ele : metricDataResults) {
            this.metricDataResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics that are returned, including the metric name, namespace, and dimensions.
     * </p>
     * 
     * @param metricDataResults
     *        The metrics that are returned, including the metric name, namespace, and dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataResult withMetricDataResults(java.util.Collection<MetricDataResult> metricDataResults) {
        setMetricDataResults(metricDataResults);
        return this;
    }

    /**
     * <p>
     * A token that marks the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A token that marks the next batch of returned results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that marks the next batch of returned results.
     * </p>
     * 
     * @return A token that marks the next batch of returned results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that marks the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A token that marks the next batch of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a message.
     * An example of a message that may be returned is <code>Maximum number of allowed metrics exceeded</code>. If there
     * is a message, as much of the operation as possible is still executed.
     * </p>
     * <p>
     * A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any message
     * about a specific metric returned by the operation appears in the <code>MetricDataResult</code> object returned
     * for that metric.
     * </p>
     * 
     * @return Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a
     *         message. An example of a message that may be returned is
     *         <code>Maximum number of allowed metrics exceeded</code>. If there is a message, as much of the operation
     *         as possible is still executed.</p>
     *         <p>
     *         A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any
     *         message about a specific metric returned by the operation appears in the <code>MetricDataResult</code>
     *         object returned for that metric.
     */

    public java.util.List<MessageData> getMessages() {
        if (messages == null) {
            messages = new com.amazonaws.internal.SdkInternalList<MessageData>();
        }
        return messages;
    }

    /**
     * <p>
     * Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a message.
     * An example of a message that may be returned is <code>Maximum number of allowed metrics exceeded</code>. If there
     * is a message, as much of the operation as possible is still executed.
     * </p>
     * <p>
     * A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any message
     * about a specific metric returned by the operation appears in the <code>MetricDataResult</code> object returned
     * for that metric.
     * </p>
     * 
     * @param messages
     *        Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a
     *        message. An example of a message that may be returned is
     *        <code>Maximum number of allowed metrics exceeded</code>. If there is a message, as much of the operation
     *        as possible is still executed.</p>
     *        <p>
     *        A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any
     *        message about a specific metric returned by the operation appears in the <code>MetricDataResult</code>
     *        object returned for that metric.
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
     * Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a message.
     * An example of a message that may be returned is <code>Maximum number of allowed metrics exceeded</code>. If there
     * is a message, as much of the operation as possible is still executed.
     * </p>
     * <p>
     * A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any message
     * about a specific metric returned by the operation appears in the <code>MetricDataResult</code> object returned
     * for that metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a
     *        message. An example of a message that may be returned is
     *        <code>Maximum number of allowed metrics exceeded</code>. If there is a message, as much of the operation
     *        as possible is still executed.</p>
     *        <p>
     *        A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any
     *        message about a specific metric returned by the operation appears in the <code>MetricDataResult</code>
     *        object returned for that metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataResult withMessages(MessageData... messages) {
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
     * Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a message.
     * An example of a message that may be returned is <code>Maximum number of allowed metrics exceeded</code>. If there
     * is a message, as much of the operation as possible is still executed.
     * </p>
     * <p>
     * A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any message
     * about a specific metric returned by the operation appears in the <code>MetricDataResult</code> object returned
     * for that metric.
     * </p>
     * 
     * @param messages
     *        Contains a message about this <code>GetMetricData</code> operation, if the operation results in such a
     *        message. An example of a message that may be returned is
     *        <code>Maximum number of allowed metrics exceeded</code>. If there is a message, as much of the operation
     *        as possible is still executed.</p>
     *        <p>
     *        A message appears here only if it is related to the global <code>GetMetricData</code> operation. Any
     *        message about a specific metric returned by the operation appears in the <code>MetricDataResult</code>
     *        object returned for that metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataResult withMessages(java.util.Collection<MessageData> messages) {
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
        if (getMetricDataResults() != null)
            sb.append("MetricDataResults: ").append(getMetricDataResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof GetMetricDataResult == false)
            return false;
        GetMetricDataResult other = (GetMetricDataResult) obj;
        if (other.getMetricDataResults() == null ^ this.getMetricDataResults() == null)
            return false;
        if (other.getMetricDataResults() != null && other.getMetricDataResults().equals(this.getMetricDataResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getMetricDataResults() == null) ? 0 : getMetricDataResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricDataResult clone() {
        try {
            return (GetMetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
