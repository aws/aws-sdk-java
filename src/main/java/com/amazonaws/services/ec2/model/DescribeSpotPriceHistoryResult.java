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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * 
 * </p>
 */
public class DescribeSpotPriceHistoryResult {

    /**
     * 
     */
    private java.util.List<SpotPrice> spotPriceHistory;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<SpotPrice> getSpotPriceHistory() {
        if (spotPriceHistory == null) {
            spotPriceHistory = new java.util.ArrayList<SpotPrice>();
        }
        return spotPriceHistory;
    }
    
    /**
     * 
     *
     * @param spotPriceHistory 
     */
    public void setSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        java.util.List<SpotPrice> spotPriceHistoryCopy = new java.util.ArrayList<SpotPrice>();
        if (spotPriceHistory != null) {
            spotPriceHistoryCopy.addAll(spotPriceHistory);
        }
        this.spotPriceHistory = spotPriceHistoryCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPriceHistory 
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
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPriceHistory 
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
        sb.append("}");
        return sb.toString();
    }
    
}
    