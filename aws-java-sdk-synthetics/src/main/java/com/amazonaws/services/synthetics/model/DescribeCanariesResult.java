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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCanariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information about one canary.
     * </p>
     */
    private java.util.List<Canary> canaries;
    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanaries</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information about one canary.
     * </p>
     * 
     * @return Returns an array. Each item in the array contains the full information about one canary.
     */

    public java.util.List<Canary> getCanaries() {
        return canaries;
    }

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information about one canary.
     * </p>
     * 
     * @param canaries
     *        Returns an array. Each item in the array contains the full information about one canary.
     */

    public void setCanaries(java.util.Collection<Canary> canaries) {
        if (canaries == null) {
            this.canaries = null;
            return;
        }

        this.canaries = new java.util.ArrayList<Canary>(canaries);
    }

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information about one canary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCanaries(java.util.Collection)} or {@link #withCanaries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param canaries
     *        Returns an array. Each item in the array contains the full information about one canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesResult withCanaries(Canary... canaries) {
        if (this.canaries == null) {
            setCanaries(new java.util.ArrayList<Canary>(canaries.length));
        }
        for (Canary ele : canaries) {
            this.canaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information about one canary.
     * </p>
     * 
     * @param canaries
     *        Returns an array. Each item in the array contains the full information about one canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesResult withCanaries(java.util.Collection<Canary> canaries) {
        setCanaries(canaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanaries</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeCanaries</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanaries</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>DescribeCanaries</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanaries</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeCanaries</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesResult withNextToken(String nextToken) {
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
        if (getCanaries() != null)
            sb.append("Canaries: ").append(getCanaries()).append(",");
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

        if (obj instanceof DescribeCanariesResult == false)
            return false;
        DescribeCanariesResult other = (DescribeCanariesResult) obj;
        if (other.getCanaries() == null ^ this.getCanaries() == null)
            return false;
        if (other.getCanaries() != null && other.getCanaries().equals(this.getCanaries()) == false)
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

        hashCode = prime * hashCode + ((getCanaries() == null) ? 0 : getCanaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCanariesResult clone() {
        try {
            return (DescribeCanariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
