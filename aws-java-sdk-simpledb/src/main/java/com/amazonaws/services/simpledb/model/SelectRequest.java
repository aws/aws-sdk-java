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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The expression used to query the domain. */
    private String selectExpression;
    /** A string informing Amazon SimpleDB where to start the next list of <code>ItemNames</code>. */
    private String nextToken;
    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     */
    private Boolean consistentRead;

    /**
     * Default constructor for SelectRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public SelectRequest() {
    }

    /**
     * Constructs a new SelectRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param selectExpression
     *        The expression used to query the domain.
     */
    public SelectRequest(String selectExpression) {
        setSelectExpression(selectExpression);
    }

    /**
     * Constructs a new SelectRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param selectExpression
     *        The expression used to query the domain.
     * @param consistentRead
     *        Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *        <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *        consistent eventually, and the client may not see data that was written immediately before your read.
     */
    public SelectRequest(String selectExpression, Boolean consistentRead) {
        setSelectExpression(selectExpression);
        setConsistentRead(consistentRead);
    }

    /**
     * The expression used to query the domain.
     * 
     * @param selectExpression
     *        The expression used to query the domain.
     */

    public void setSelectExpression(String selectExpression) {
        this.selectExpression = selectExpression;
    }

    /**
     * The expression used to query the domain.
     * 
     * @return The expression used to query the domain.
     */

    public String getSelectExpression() {
        return this.selectExpression;
    }

    /**
     * The expression used to query the domain.
     * 
     * @param selectExpression
     *        The expression used to query the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectRequest withSelectExpression(String selectExpression) {
        setSelectExpression(selectExpression);
        return this;
    }

    /**
     * A string informing Amazon SimpleDB where to start the next list of <code>ItemNames</code>.
     * 
     * @param nextToken
     *        A string informing Amazon SimpleDB where to start the next list of <code>ItemNames</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A string informing Amazon SimpleDB where to start the next list of <code>ItemNames</code>.
     * 
     * @return A string informing Amazon SimpleDB where to start the next list of <code>ItemNames</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A string informing Amazon SimpleDB where to start the next list of <code>ItemNames</code>.
     * 
     * @param nextToken
     *        A string informing Amazon SimpleDB where to start the next list of <code>ItemNames</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @param consistentRead
     *        Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *        <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *        consistent eventually, and the client may not see data that was written immediately before your read.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @return Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *         <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was written immediately before your read.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @param consistentRead
     *        Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *        <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *        consistent eventually, and the client may not see data that was written immediately before your read.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectRequest withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @return Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *         <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was written immediately before your read.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
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
        if (getSelectExpression() != null)
            sb.append("SelectExpression: ").append(getSelectExpression()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: ").append(getConsistentRead());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectRequest == false)
            return false;
        SelectRequest other = (SelectRequest) obj;
        if (other.getSelectExpression() == null ^ this.getSelectExpression() == null)
            return false;
        if (other.getSelectExpression() != null && other.getSelectExpression().equals(this.getSelectExpression()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectExpression() == null) ? 0 : getSelectExpression().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        return hashCode;
    }

    @Override
    public SelectRequest clone() {
        return (SelectRequest) super.clone();
    }

}
