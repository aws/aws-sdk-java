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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for results from <code>DescribeReservedInstances</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of Reserved Instances in the current Region.
     * </p>
     */
    private java.util.List<ReservedInstance> reservedInstances;

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of Reserved Instances in the current Region.
     * </p>
     * 
     * @return List of Reserved Instances in the current Region.
     */

    public java.util.List<ReservedInstance> getReservedInstances() {
        return reservedInstances;
    }

    /**
     * <p>
     * List of Reserved Instances in the current Region.
     * </p>
     * 
     * @param reservedInstances
     *        List of Reserved Instances in the current Region.
     */

    public void setReservedInstances(java.util.Collection<ReservedInstance> reservedInstances) {
        if (reservedInstances == null) {
            this.reservedInstances = null;
            return;
        }

        this.reservedInstances = new java.util.ArrayList<ReservedInstance>(reservedInstances);
    }

    /**
     * <p>
     * List of Reserved Instances in the current Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstances(java.util.Collection)} or {@link #withReservedInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param reservedInstances
     *        List of Reserved Instances in the current Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesResult withReservedInstances(ReservedInstance... reservedInstances) {
        if (this.reservedInstances == null) {
            setReservedInstances(new java.util.ArrayList<ReservedInstance>(reservedInstances.length));
        }
        for (ReservedInstance ele : reservedInstances) {
            this.reservedInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Reserved Instances in the current Region.
     * </p>
     * 
     * @param reservedInstances
     *        List of Reserved Instances in the current Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesResult withReservedInstances(java.util.Collection<ReservedInstance> reservedInstances) {
        setReservedInstances(reservedInstances);
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
        if (getReservedInstances() != null)
            sb.append("ReservedInstances: ").append(getReservedInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesResult == false)
            return false;
        DescribeReservedInstancesResult other = (DescribeReservedInstancesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservedInstances() == null ^ this.getReservedInstances() == null)
            return false;
        if (other.getReservedInstances() != null && other.getReservedInstances().equals(this.getReservedInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReservedInstances() == null) ? 0 : getReservedInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesResult clone() {
        try {
            return (DescribeReservedInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
