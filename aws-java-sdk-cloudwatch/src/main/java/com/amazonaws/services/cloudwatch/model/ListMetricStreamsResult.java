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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetricStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetricStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that marks the start of the next batch of returned results. You can use this token in a subsequent
     * operation to get the next batch of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The array of metric stream information.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricStreamEntry> entries;

    /**
     * <p>
     * The token that marks the start of the next batch of returned results. You can use this token in a subsequent
     * operation to get the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results. You can use this token in a
     *        subsequent operation to get the next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results. You can use this token in a subsequent
     * operation to get the next batch of results.
     * </p>
     * 
     * @return The token that marks the start of the next batch of returned results. You can use this token in a
     *         subsequent operation to get the next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results. You can use this token in a subsequent
     * operation to get the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results. You can use this token in a
     *        subsequent operation to get the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricStreamsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The array of metric stream information.
     * </p>
     * 
     * @return The array of metric stream information.
     */

    public java.util.List<MetricStreamEntry> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<MetricStreamEntry>();
        }
        return entries;
    }

    /**
     * <p>
     * The array of metric stream information.
     * </p>
     * 
     * @param entries
     *        The array of metric stream information.
     */

    public void setEntries(java.util.Collection<MetricStreamEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<MetricStreamEntry>(entries);
    }

    /**
     * <p>
     * The array of metric stream information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The array of metric stream information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricStreamsResult withEntries(MetricStreamEntry... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<MetricStreamEntry>(entries.length));
        }
        for (MetricStreamEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of metric stream information.
     * </p>
     * 
     * @param entries
     *        The array of metric stream information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricStreamsResult withEntries(java.util.Collection<MetricStreamEntry> entries) {
        setEntries(entries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetricStreamsResult == false)
            return false;
        ListMetricStreamsResult other = (ListMetricStreamsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public ListMetricStreamsResult clone() {
        try {
            return (ListMetricStreamsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
