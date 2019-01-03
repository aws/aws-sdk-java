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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/BatchGetTraces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTracesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Full traces for the specified requests.
     * </p>
     */
    private java.util.List<Trace> traces;
    /**
     * <p>
     * Trace IDs of requests that haven't been processed.
     * </p>
     */
    private java.util.List<String> unprocessedTraceIds;
    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Full traces for the specified requests.
     * </p>
     * 
     * @return Full traces for the specified requests.
     */

    public java.util.List<Trace> getTraces() {
        return traces;
    }

    /**
     * <p>
     * Full traces for the specified requests.
     * </p>
     * 
     * @param traces
     *        Full traces for the specified requests.
     */

    public void setTraces(java.util.Collection<Trace> traces) {
        if (traces == null) {
            this.traces = null;
            return;
        }

        this.traces = new java.util.ArrayList<Trace>(traces);
    }

    /**
     * <p>
     * Full traces for the specified requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraces(java.util.Collection)} or {@link #withTraces(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param traces
     *        Full traces for the specified requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTracesResult withTraces(Trace... traces) {
        if (this.traces == null) {
            setTraces(new java.util.ArrayList<Trace>(traces.length));
        }
        for (Trace ele : traces) {
            this.traces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Full traces for the specified requests.
     * </p>
     * 
     * @param traces
     *        Full traces for the specified requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTracesResult withTraces(java.util.Collection<Trace> traces) {
        setTraces(traces);
        return this;
    }

    /**
     * <p>
     * Trace IDs of requests that haven't been processed.
     * </p>
     * 
     * @return Trace IDs of requests that haven't been processed.
     */

    public java.util.List<String> getUnprocessedTraceIds() {
        return unprocessedTraceIds;
    }

    /**
     * <p>
     * Trace IDs of requests that haven't been processed.
     * </p>
     * 
     * @param unprocessedTraceIds
     *        Trace IDs of requests that haven't been processed.
     */

    public void setUnprocessedTraceIds(java.util.Collection<String> unprocessedTraceIds) {
        if (unprocessedTraceIds == null) {
            this.unprocessedTraceIds = null;
            return;
        }

        this.unprocessedTraceIds = new java.util.ArrayList<String>(unprocessedTraceIds);
    }

    /**
     * <p>
     * Trace IDs of requests that haven't been processed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedTraceIds(java.util.Collection)} or {@link #withUnprocessedTraceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedTraceIds
     *        Trace IDs of requests that haven't been processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTracesResult withUnprocessedTraceIds(String... unprocessedTraceIds) {
        if (this.unprocessedTraceIds == null) {
            setUnprocessedTraceIds(new java.util.ArrayList<String>(unprocessedTraceIds.length));
        }
        for (String ele : unprocessedTraceIds) {
            this.unprocessedTraceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Trace IDs of requests that haven't been processed.
     * </p>
     * 
     * @param unprocessedTraceIds
     *        Trace IDs of requests that haven't been processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTracesResult withUnprocessedTraceIds(java.util.Collection<String> unprocessedTraceIds) {
        setUnprocessedTraceIds(unprocessedTraceIds);
        return this;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @return Pagination token. Not used.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTracesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTraces() != null)
            sb.append("Traces: ").append(getTraces()).append(",");
        if (getUnprocessedTraceIds() != null)
            sb.append("UnprocessedTraceIds: ").append(getUnprocessedTraceIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTracesResult == false)
            return false;
        BatchGetTracesResult other = (BatchGetTracesResult) obj;
        if (other.getTraces() == null ^ this.getTraces() == null)
            return false;
        if (other.getTraces() != null && other.getTraces().equals(this.getTraces()) == false)
            return false;
        if (other.getUnprocessedTraceIds() == null ^ this.getUnprocessedTraceIds() == null)
            return false;
        if (other.getUnprocessedTraceIds() != null && other.getUnprocessedTraceIds().equals(this.getUnprocessedTraceIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTraces() == null) ? 0 : getTraces().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedTraceIds() == null) ? 0 : getUnprocessedTraceIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTracesResult clone() {
        try {
            return (BatchGetTracesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
