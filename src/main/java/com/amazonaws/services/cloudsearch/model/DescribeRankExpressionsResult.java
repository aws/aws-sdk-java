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
 * A response message that contains the rank expressions for a search domain.
 * </p>
 */
public class DescribeRankExpressionsResult implements Serializable {

    /**
     * The rank expressions configured for the domain.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RankExpressionStatus> rankExpressions;

    /**
     * The rank expressions configured for the domain.
     *
     * @return The rank expressions configured for the domain.
     */
    public java.util.List<RankExpressionStatus> getRankExpressions() {
        if (rankExpressions == null) {
              rankExpressions = new com.amazonaws.internal.ListWithAutoConstructFlag<RankExpressionStatus>();
              rankExpressions.setAutoConstruct(true);
        }
        return rankExpressions;
    }
    
    /**
     * The rank expressions configured for the domain.
     *
     * @param rankExpressions The rank expressions configured for the domain.
     */
    public void setRankExpressions(java.util.Collection<RankExpressionStatus> rankExpressions) {
        if (rankExpressions == null) {
            this.rankExpressions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RankExpressionStatus> rankExpressionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RankExpressionStatus>(rankExpressions.size());
        rankExpressionsCopy.addAll(rankExpressions);
        this.rankExpressions = rankExpressionsCopy;
    }
    
    /**
     * The rank expressions configured for the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rankExpressions The rank expressions configured for the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRankExpressionsResult withRankExpressions(RankExpressionStatus... rankExpressions) {
        if (getRankExpressions() == null) setRankExpressions(new java.util.ArrayList<RankExpressionStatus>(rankExpressions.length));
        for (RankExpressionStatus value : rankExpressions) {
            getRankExpressions().add(value);
        }
        return this;
    }
    
    /**
     * The rank expressions configured for the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rankExpressions The rank expressions configured for the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRankExpressionsResult withRankExpressions(java.util.Collection<RankExpressionStatus> rankExpressions) {
        if (rankExpressions == null) {
            this.rankExpressions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RankExpressionStatus> rankExpressionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RankExpressionStatus>(rankExpressions.size());
            rankExpressionsCopy.addAll(rankExpressions);
            this.rankExpressions = rankExpressionsCopy;
        }

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
        if (getRankExpressions() != null) sb.append("RankExpressions: " + getRankExpressions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRankExpressions() == null) ? 0 : getRankExpressions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRankExpressionsResult == false) return false;
        DescribeRankExpressionsResult other = (DescribeRankExpressionsResult)obj;
        
        if (other.getRankExpressions() == null ^ this.getRankExpressions() == null) return false;
        if (other.getRankExpressions() != null && other.getRankExpressions().equals(this.getRankExpressions()) == false) return false; 
        return true;
    }
    
}
    