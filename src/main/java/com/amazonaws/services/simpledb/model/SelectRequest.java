/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#select(SelectRequest) Select operation}.
 * <p>
 * The <code>Select</code> operation returns a set of attributes for <code>ItemNames</code> that match the select expression. <code>Select</code> is
 * similar to the standard SQL SELECT statement.
 * </p>
 * <p>
 * The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number of items returned per page to
 * enforce this limit. For example, if the client asks to retrieve 2500 items, but each individual item is 10 kB in size, the system returns 100 items
 * and an appropriate <code>NextToken</code> so the client can access the next page of results.
 * </p>
 * <p>
 * For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#select(SelectRequest)
 */
public class SelectRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The expression used to query the domain.
     */
    private String selectExpression;

    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * <code>ItemNames</code>.
     */
    private String nextToken;

    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     */
    private Boolean consistentRead;

    /**
     * Default constructor for a new SelectRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SelectRequest() {}
    
    /**
     * Constructs a new SelectRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param selectExpression The expression used to query the domain.
     */
    public SelectRequest(String selectExpression) {
        setSelectExpression(selectExpression);
    }

    /**
     * Constructs a new SelectRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param selectExpression The expression used to query the domain.
     * @param consistentRead Determines whether or not strong consistency
     * should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be
     * returned. Otherwise, results will be consistent eventually, and the
     * client may not see data that was written immediately before your read.
     */
    public SelectRequest(String selectExpression, Boolean consistentRead) {
        setSelectExpression(selectExpression);
        setConsistentRead(consistentRead);
    }

    /**
     * The expression used to query the domain.
     *
     * @return The expression used to query the domain.
     */
    public String getSelectExpression() {
        return selectExpression;
    }
    
    /**
     * The expression used to query the domain.
     *
     * @param selectExpression The expression used to query the domain.
     */
    public void setSelectExpression(String selectExpression) {
        this.selectExpression = selectExpression;
    }
    
    /**
     * The expression used to query the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param selectExpression The expression used to query the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SelectRequest withSelectExpression(String selectExpression) {
        this.selectExpression = selectExpression;
        return this;
    }

    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * <code>ItemNames</code>.
     *
     * @return A string informing Amazon SimpleDB where to start the next list of
     *         <code>ItemNames</code>.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * <code>ItemNames</code>.
     *
     * @param nextToken A string informing Amazon SimpleDB where to start the next list of
     *         <code>ItemNames</code>.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * <code>ItemNames</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string informing Amazon SimpleDB where to start the next list of
     *         <code>ItemNames</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SelectRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     *
     * @return Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     *
     * @param consistentRead Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SelectRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     *
     * @return Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSelectExpression() != null) sb.append("SelectExpression: " + getSelectExpression() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSelectExpression() == null) ? 0 : getSelectExpression().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SelectRequest == false) return false;
        SelectRequest other = (SelectRequest)obj;
        
        if (other.getSelectExpression() == null ^ this.getSelectExpression() == null) return false;
        if (other.getSelectExpression() != null && other.getSelectExpression().equals(this.getSelectExpression()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        return true;
    }
    
}
    