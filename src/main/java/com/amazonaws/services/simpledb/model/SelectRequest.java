/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Select Request
 */
public class SelectRequest extends AmazonWebServiceRequest {
        
    /**
     * The expression used to query the domain.
     */
    private String selectExpression;

    /**
     * String that tells Amazon SimpleDB where to start the next list of Item
     * Names.
     */
    private String nextToken;

    /**
     * True if strong consistency should be enforced when data is read from
     * SimpleDB, meaning that any data previously written to SimpleDB will be
     * returned. Without specifying this parameter, results will be
     * eventually consistent, and you may not see data that was written
     * immediately before your read.
     */
    private Boolean consistentRead;

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
     * String that tells Amazon SimpleDB where to start the next list of Item
     * Names.
     *
     * @return String that tells Amazon SimpleDB where to start the next list of Item
     *         Names.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * String that tells Amazon SimpleDB where to start the next list of Item
     * Names.
     *
     * @param nextToken String that tells Amazon SimpleDB where to start the next list of Item
     *         Names.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * String that tells Amazon SimpleDB where to start the next list of Item
     * Names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken String that tells Amazon SimpleDB where to start the next list of Item
     *         Names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SelectRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * True if strong consistency should be enforced when data is read from
     * SimpleDB, meaning that any data previously written to SimpleDB will be
     * returned. Without specifying this parameter, results will be
     * eventually consistent, and you may not see data that was written
     * immediately before your read.
     *
     * @return True if strong consistency should be enforced when data is read from
     *         SimpleDB, meaning that any data previously written to SimpleDB will be
     *         returned. Without specifying this parameter, results will be
     *         eventually consistent, and you may not see data that was written
     *         immediately before your read.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * True if strong consistency should be enforced when data is read from
     * SimpleDB, meaning that any data previously written to SimpleDB will be
     * returned. Without specifying this parameter, results will be
     * eventually consistent, and you may not see data that was written
     * immediately before your read.
     *
     * @param consistentRead True if strong consistency should be enforced when data is read from
     *         SimpleDB, meaning that any data previously written to SimpleDB will be
     *         returned. Without specifying this parameter, results will be
     *         eventually consistent, and you may not see data that was written
     *         immediately before your read.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * True if strong consistency should be enforced when data is read from
     * SimpleDB, meaning that any data previously written to SimpleDB will be
     * returned. Without specifying this parameter, results will be
     * eventually consistent, and you may not see data that was written
     * immediately before your read.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead True if strong consistency should be enforced when data is read from
     *         SimpleDB, meaning that any data previously written to SimpleDB will be
     *         returned. Without specifying this parameter, results will be
     *         eventually consistent, and you may not see data that was written
     *         immediately before your read.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SelectRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }
    
    
    /**
     * True if strong consistency should be enforced when data is read from
     * SimpleDB, meaning that any data previously written to SimpleDB will be
     * returned. Without specifying this parameter, results will be
     * eventually consistent, and you may not see data that was written
     * immediately before your read.
     *
     * @return True if strong consistency should be enforced when data is read from
     *         SimpleDB, meaning that any data previously written to SimpleDB will be
     *         returned. Without specifying this parameter, results will be
     *         eventually consistent, and you may not see data that was written
     *         immediately before your read.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }
    
}
    