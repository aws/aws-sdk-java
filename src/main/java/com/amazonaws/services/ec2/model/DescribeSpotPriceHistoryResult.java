/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * Describe Spot Price History Result
 */
public class DescribeSpotPriceHistoryResult {

    private java.util.List<SpotPrice> spotPriceHistory;

    /**
     * The string marking the next set of results returned. Displays empty if
     * there are no more results to be returned.
     */
    private String nextToken;

    /**
     * Returns the value of the SpotPriceHistory property for this object.
     *
     * @return The value of the SpotPriceHistory property for this object.
     */
    public java.util.List<SpotPrice> getSpotPriceHistory() {
        if (spotPriceHistory == null) {
            spotPriceHistory = new java.util.ArrayList<SpotPrice>();
        }
        return spotPriceHistory;
    }
    
    /**
     * Sets the value of the SpotPriceHistory property for this object.
     *
     * @param spotPriceHistory The new value for the SpotPriceHistory property for this object.
     */
    public void setSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        java.util.List<SpotPrice> spotPriceHistoryCopy = new java.util.ArrayList<SpotPrice>();
        if (spotPriceHistory != null) {
            spotPriceHistoryCopy.addAll(spotPriceHistory);
        }
        this.spotPriceHistory = spotPriceHistoryCopy;
    }
    
    /**
     * Sets the value of the SpotPriceHistory property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPriceHistory The new value for the SpotPriceHistory property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotPriceHistoryResult withSpotPriceHistory(SpotPrice... spotPriceHistory) {
        for (SpotPrice value : spotPriceHistory) {
            getSpotPriceHistory().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SpotPriceHistory property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPriceHistory The new value for the SpotPriceHistory property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotPriceHistoryResult withSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        java.util.List<SpotPrice> spotPriceHistoryCopy = new java.util.ArrayList<SpotPrice>();
        if (spotPriceHistory != null) {
            spotPriceHistoryCopy.addAll(spotPriceHistory);
        }
        this.spotPriceHistory = spotPriceHistoryCopy;

        return this;
    }
    
    /**
     * The string marking the next set of results returned. Displays empty if
     * there are no more results to be returned.
     *
     * @return The string marking the next set of results returned. Displays empty if
     *         there are no more results to be returned.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The string marking the next set of results returned. Displays empty if
     * there are no more results to be returned.
     *
     * @param nextToken The string marking the next set of results returned. Displays empty if
     *         there are no more results to be returned.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The string marking the next set of results returned. Displays empty if
     * there are no more results to be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The string marking the next set of results returned. Displays empty if
     *         there are no more results to be returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotPriceHistoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        sb.append("SpotPriceHistory: " + spotPriceHistory + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    