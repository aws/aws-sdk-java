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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListHITs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHITsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String nextToken;
    /**
     * <p>
     * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by
     * this call.
     * </p>
     */
    private Integer numResults;
    /**
     * <p>
     * The list of HIT elements returned by the query.
     * </p>
     */
    private java.util.List<HIT> hITs;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHITsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by
     * this call.
     * </p>
     * 
     * @param numResults
     *        The number of HITs on this page in the filtered results list, equivalent to the number of HITs being
     *        returned by this call.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by
     * this call.
     * </p>
     * 
     * @return The number of HITs on this page in the filtered results list, equivalent to the number of HITs being
     *         returned by this call.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by
     * this call.
     * </p>
     * 
     * @param numResults
     *        The number of HITs on this page in the filtered results list, equivalent to the number of HITs being
     *        returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHITsResult withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * <p>
     * The list of HIT elements returned by the query.
     * </p>
     * 
     * @return The list of HIT elements returned by the query.
     */

    public java.util.List<HIT> getHITs() {
        return hITs;
    }

    /**
     * <p>
     * The list of HIT elements returned by the query.
     * </p>
     * 
     * @param hITs
     *        The list of HIT elements returned by the query.
     */

    public void setHITs(java.util.Collection<HIT> hITs) {
        if (hITs == null) {
            this.hITs = null;
            return;
        }

        this.hITs = new java.util.ArrayList<HIT>(hITs);
    }

    /**
     * <p>
     * The list of HIT elements returned by the query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHITs(java.util.Collection)} or {@link #withHITs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hITs
     *        The list of HIT elements returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHITsResult withHITs(HIT... hITs) {
        if (this.hITs == null) {
            setHITs(new java.util.ArrayList<HIT>(hITs.length));
        }
        for (HIT ele : hITs) {
            this.hITs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of HIT elements returned by the query.
     * </p>
     * 
     * @param hITs
     *        The list of HIT elements returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHITsResult withHITs(java.util.Collection<HIT> hITs) {
        setHITs(hITs);
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
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getHITs() != null)
            sb.append("HITs: ").append(getHITs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHITsResult == false)
            return false;
        ListHITsResult other = (ListHITsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getHITs() == null ^ this.getHITs() == null)
            return false;
        if (other.getHITs() != null && other.getHITs().equals(this.getHITs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getHITs() == null) ? 0 : getHITs().hashCode());
        return hashCode;
    }

    @Override
    public ListHITsResult clone() {
        try {
            return (ListHITsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
