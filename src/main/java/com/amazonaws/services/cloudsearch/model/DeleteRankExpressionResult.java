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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * A response message that contains the status of a deleted <code>RankExpression</code> .
 * </p>
 */
public class DeleteRankExpressionResult implements Serializable {

    /**
     * The value of a <code>RankExpression</code> and its current status.
     */
    private RankExpressionStatus rankExpression;

    /**
     * The value of a <code>RankExpression</code> and its current status.
     *
     * @return The value of a <code>RankExpression</code> and its current status.
     */
    public RankExpressionStatus getRankExpression() {
        return rankExpression;
    }
    
    /**
     * The value of a <code>RankExpression</code> and its current status.
     *
     * @param rankExpression The value of a <code>RankExpression</code> and its current status.
     */
    public void setRankExpression(RankExpressionStatus rankExpression) {
        this.rankExpression = rankExpression;
    }
    
    /**
     * The value of a <code>RankExpression</code> and its current status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rankExpression The value of a <code>RankExpression</code> and its current status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteRankExpressionResult withRankExpression(RankExpressionStatus rankExpression) {
        this.rankExpression = rankExpression;
        return this;
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
        if (getRankExpression() != null) sb.append("RankExpression: " + getRankExpression() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRankExpression() == null) ? 0 : getRankExpression().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteRankExpressionResult == false) return false;
        DeleteRankExpressionResult other = (DeleteRankExpressionResult)obj;
        
        if (other.getRankExpression() == null ^ this.getRankExpression() == null) return false;
        if (other.getRankExpression() != null && other.getRankExpression().equals(this.getRankExpression()) == false) return false; 
        return true;
    }
    
}
    