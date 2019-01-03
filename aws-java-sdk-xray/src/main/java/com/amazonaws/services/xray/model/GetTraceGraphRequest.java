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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTraceGraphRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Trace IDs of requests for which to generate a service graph.
     * </p>
     */
    private java.util.List<String> traceIds;
    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Trace IDs of requests for which to generate a service graph.
     * </p>
     * 
     * @return Trace IDs of requests for which to generate a service graph.
     */

    public java.util.List<String> getTraceIds() {
        return traceIds;
    }

    /**
     * <p>
     * Trace IDs of requests for which to generate a service graph.
     * </p>
     * 
     * @param traceIds
     *        Trace IDs of requests for which to generate a service graph.
     */

    public void setTraceIds(java.util.Collection<String> traceIds) {
        if (traceIds == null) {
            this.traceIds = null;
            return;
        }

        this.traceIds = new java.util.ArrayList<String>(traceIds);
    }

    /**
     * <p>
     * Trace IDs of requests for which to generate a service graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraceIds(java.util.Collection)} or {@link #withTraceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param traceIds
     *        Trace IDs of requests for which to generate a service graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceGraphRequest withTraceIds(String... traceIds) {
        if (this.traceIds == null) {
            setTraceIds(new java.util.ArrayList<String>(traceIds.length));
        }
        for (String ele : traceIds) {
            this.traceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Trace IDs of requests for which to generate a service graph.
     * </p>
     * 
     * @param traceIds
     *        Trace IDs of requests for which to generate a service graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceGraphRequest withTraceIds(java.util.Collection<String> traceIds) {
        setTraceIds(traceIds);
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

    public GetTraceGraphRequest withNextToken(String nextToken) {
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
        if (getTraceIds() != null)
            sb.append("TraceIds: ").append(getTraceIds()).append(",");
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

        if (obj instanceof GetTraceGraphRequest == false)
            return false;
        GetTraceGraphRequest other = (GetTraceGraphRequest) obj;
        if (other.getTraceIds() == null ^ this.getTraceIds() == null)
            return false;
        if (other.getTraceIds() != null && other.getTraceIds().equals(this.getTraceIds()) == false)
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

        hashCode = prime * hashCode + ((getTraceIds() == null) ? 0 : getTraceIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTraceGraphRequest clone() {
        return (GetTraceGraphRequest) super.clone();
    }

}
