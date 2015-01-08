/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Returned for a successful ListDatasets request.
 * </p>
 */
public class ListDatasetsResult implements Serializable {

    /**
     * A set of datasets.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Dataset> datasets;

    /**
     * Number of datasets returned.
     */
    private Integer count;

    /**
     * A pagination token for obtaining the next page of results.
     */
    private String nextToken;

    /**
     * A set of datasets.
     *
     * @return A set of datasets.
     */
    public java.util.List<Dataset> getDatasets() {
        if (datasets == null) {
              datasets = new com.amazonaws.internal.ListWithAutoConstructFlag<Dataset>();
              datasets.setAutoConstruct(true);
        }
        return datasets;
    }
    
    /**
     * A set of datasets.
     *
     * @param datasets A set of datasets.
     */
    public void setDatasets(java.util.Collection<Dataset> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Dataset> datasetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dataset>(datasets.size());
        datasetsCopy.addAll(datasets);
        this.datasets = datasetsCopy;
    }
    
    /**
     * A set of datasets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasets A set of datasets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDatasetsResult withDatasets(Dataset... datasets) {
        if (getDatasets() == null) setDatasets(new java.util.ArrayList<Dataset>(datasets.length));
        for (Dataset value : datasets) {
            getDatasets().add(value);
        }
        return this;
    }
    
    /**
     * A set of datasets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasets A set of datasets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDatasetsResult withDatasets(java.util.Collection<Dataset> datasets) {
        if (datasets == null) {
            this.datasets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Dataset> datasetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dataset>(datasets.size());
            datasetsCopy.addAll(datasets);
            this.datasets = datasetsCopy;
        }

        return this;
    }

    /**
     * Number of datasets returned.
     *
     * @return Number of datasets returned.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * Number of datasets returned.
     *
     * @param count Number of datasets returned.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * Number of datasets returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count Number of datasets returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDatasetsResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * A pagination token for obtaining the next page of results.
     *
     * @return A pagination token for obtaining the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token for obtaining the next page of results.
     *
     * @param nextToken A pagination token for obtaining the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token for obtaining the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A pagination token for obtaining the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDatasetsResult withNextToken(String nextToken) {
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
        if (getDatasets() != null) sb.append("Datasets: " + getDatasets() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDatasetsResult == false) return false;
        ListDatasetsResult other = (ListDatasetsResult)obj;
        
        if (other.getDatasets() == null ^ this.getDatasets() == null) return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    