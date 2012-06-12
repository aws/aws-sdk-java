/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * 
 * </p>
 */
public class DescribeOptionGroupOptionsResult {

    /**
     * List of available options.
     */
    private java.util.List<OptionGroupOption> optionGroupOptions;

    private String marker;

    /**
     * List of available options.
     *
     * @return List of available options.
     */
    public java.util.List<OptionGroupOption> getOptionGroupOptions() {
        
        if (optionGroupOptions == null) {
            optionGroupOptions = new java.util.ArrayList<OptionGroupOption>();
        }
        return optionGroupOptions;
    }
    
    /**
     * List of available options.
     *
     * @param optionGroupOptions List of available options.
     */
    public void setOptionGroupOptions(java.util.Collection<OptionGroupOption> optionGroupOptions) {
        if (optionGroupOptions == null) {
            this.optionGroupOptions = null;
            return;
        }

        java.util.List<OptionGroupOption> optionGroupOptionsCopy = new java.util.ArrayList<OptionGroupOption>(optionGroupOptions.size());
        optionGroupOptionsCopy.addAll(optionGroupOptions);
        this.optionGroupOptions = optionGroupOptionsCopy;
    }
    
    /**
     * List of available options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupOptions List of available options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOptionGroupOptionsResult withOptionGroupOptions(OptionGroupOption... optionGroupOptions) {
        if (getOptionGroupOptions() == null) setOptionGroupOptions(new java.util.ArrayList<OptionGroupOption>(optionGroupOptions.length));
        for (OptionGroupOption value : optionGroupOptions) {
            getOptionGroupOptions().add(value);
        }
        return this;
    }
    
    /**
     * List of available options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupOptions List of available options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOptionGroupOptionsResult withOptionGroupOptions(java.util.Collection<OptionGroupOption> optionGroupOptions) {
        if (optionGroupOptions == null) {
            this.optionGroupOptions = null;
        } else {
            java.util.List<OptionGroupOption> optionGroupOptionsCopy = new java.util.ArrayList<OptionGroupOption>(optionGroupOptions.size());
            optionGroupOptionsCopy.addAll(optionGroupOptions);
            this.optionGroupOptions = optionGroupOptionsCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the Marker property for this object.
     *
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     *
     * @param marker The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The new value for the Marker property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeOptionGroupOptionsResult withMarker(String marker) {
        this.marker = marker;
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
        if (optionGroupOptions != null) sb.append("OptionGroupOptions: " + optionGroupOptions + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionGroupOptions() == null) ? 0 : getOptionGroupOptions().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeOptionGroupOptionsResult == false) return false;
        DescribeOptionGroupOptionsResult other = (DescribeOptionGroupOptionsResult)obj;
        
        if (other.getOptionGroupOptions() == null ^ this.getOptionGroupOptions() == null) return false;
        if (other.getOptionGroupOptions() != null && other.getOptionGroupOptions().equals(this.getOptionGroupOptions()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    