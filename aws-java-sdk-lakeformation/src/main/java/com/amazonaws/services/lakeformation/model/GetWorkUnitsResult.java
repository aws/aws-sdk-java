/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A structure for the output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkUnitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     * execution service.
     * </p>
     */
    private java.util.List<WorkUnitRange> workUnitRanges;

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @return A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *         list is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the plan query operation.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     * 
     * @return The ID of the plan query operation.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the plan query operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitsResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     * execution service.
     * </p>
     * 
     * @return A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     *         execution service.
     */

    public java.util.List<WorkUnitRange> getWorkUnitRanges() {
        return workUnitRanges;
    }

    /**
     * <p>
     * A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     * execution service.
     * </p>
     * 
     * @param workUnitRanges
     *        A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     *        execution service.
     */

    public void setWorkUnitRanges(java.util.Collection<WorkUnitRange> workUnitRanges) {
        if (workUnitRanges == null) {
            this.workUnitRanges = null;
            return;
        }

        this.workUnitRanges = new java.util.ArrayList<WorkUnitRange>(workUnitRanges);
    }

    /**
     * <p>
     * A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     * execution service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkUnitRanges(java.util.Collection)} or {@link #withWorkUnitRanges(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param workUnitRanges
     *        A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     *        execution service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitsResult withWorkUnitRanges(WorkUnitRange... workUnitRanges) {
        if (this.workUnitRanges == null) {
            setWorkUnitRanges(new java.util.ArrayList<WorkUnitRange>(workUnitRanges.length));
        }
        for (WorkUnitRange ele : workUnitRanges) {
            this.workUnitRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     * execution service.
     * </p>
     * 
     * @param workUnitRanges
     *        A <code>WorkUnitRangeList</code> object that specifies the valid range of work unit IDs for querying the
     *        execution service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitsResult withWorkUnitRanges(java.util.Collection<WorkUnitRange> workUnitRanges) {
        setWorkUnitRanges(workUnitRanges);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getWorkUnitRanges() != null)
            sb.append("WorkUnitRanges: ").append(getWorkUnitRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkUnitsResult == false)
            return false;
        GetWorkUnitsResult other = (GetWorkUnitsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getWorkUnitRanges() == null ^ this.getWorkUnitRanges() == null)
            return false;
        if (other.getWorkUnitRanges() != null && other.getWorkUnitRanges().equals(this.getWorkUnitRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getWorkUnitRanges() == null) ? 0 : getWorkUnitRanges().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkUnitsResult clone() {
        try {
            return (GetWorkUnitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
