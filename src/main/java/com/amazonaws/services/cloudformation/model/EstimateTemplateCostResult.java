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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The output for a EstimateTemplateCost action.
 * </p>
 */
public class EstimateTemplateCostResult implements Serializable {

    /**
     * An AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     */
    private String url;

    /**
     * An AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     *
     * @return An AWS Simple Monthly Calculator URL with a query string that
     *         describes the resources required to run the template.
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * An AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     *
     * @param url An AWS Simple Monthly Calculator URL with a query string that
     *         describes the resources required to run the template.
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * An AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param url An AWS Simple Monthly Calculator URL with a query string that
     *         describes the resources required to run the template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EstimateTemplateCostResult withUrl(String url) {
        this.url = url;
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
        if (getUrl() != null) sb.append("Url: " + getUrl() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EstimateTemplateCostResult == false) return false;
        EstimateTemplateCostResult other = (EstimateTemplateCostResult)obj;
        
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false; 
        return true;
    }
    
}
    