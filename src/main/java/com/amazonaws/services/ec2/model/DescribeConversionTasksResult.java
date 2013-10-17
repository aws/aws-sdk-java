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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Describe Conversion Tasks Result
 */
public class DescribeConversionTasksResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<ConversionTask> conversionTasks;

    /**
     * Returns the value of the ConversionTasks property for this object.
     *
     * @return The value of the ConversionTasks property for this object.
     */
    public java.util.List<ConversionTask> getConversionTasks() {
        if (conversionTasks == null) {
              conversionTasks = new com.amazonaws.internal.ListWithAutoConstructFlag<ConversionTask>();
              conversionTasks.setAutoConstruct(true);
        }
        return conversionTasks;
    }
    
    /**
     * Sets the value of the ConversionTasks property for this object.
     *
     * @param conversionTasks The new value for the ConversionTasks property for this object.
     */
    public void setConversionTasks(java.util.Collection<ConversionTask> conversionTasks) {
        if (conversionTasks == null) {
            this.conversionTasks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConversionTask> conversionTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConversionTask>(conversionTasks.size());
        conversionTasksCopy.addAll(conversionTasks);
        this.conversionTasks = conversionTasksCopy;
    }
    
    /**
     * Sets the value of the ConversionTasks property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTasks The new value for the ConversionTasks property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConversionTasksResult withConversionTasks(ConversionTask... conversionTasks) {
        if (getConversionTasks() == null) setConversionTasks(new java.util.ArrayList<ConversionTask>(conversionTasks.length));
        for (ConversionTask value : conversionTasks) {
            getConversionTasks().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ConversionTasks property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTasks The new value for the ConversionTasks property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConversionTasksResult withConversionTasks(java.util.Collection<ConversionTask> conversionTasks) {
        if (conversionTasks == null) {
            this.conversionTasks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConversionTask> conversionTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConversionTask>(conversionTasks.size());
            conversionTasksCopy.addAll(conversionTasks);
            this.conversionTasks = conversionTasksCopy;
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
        if (getConversionTasks() != null) sb.append("ConversionTasks: " + getConversionTasks() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConversionTasks() == null) ? 0 : getConversionTasks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConversionTasksResult == false) return false;
        DescribeConversionTasksResult other = (DescribeConversionTasksResult)obj;
        
        if (other.getConversionTasks() == null ^ this.getConversionTasks() == null) return false;
        if (other.getConversionTasks() != null && other.getConversionTasks().equals(this.getConversionTasks()) == false) return false; 
        return true;
    }
    
}
    