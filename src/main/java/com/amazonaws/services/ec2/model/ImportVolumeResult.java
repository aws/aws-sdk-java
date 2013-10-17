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
 * Import Volume Result
 */
public class ImportVolumeResult implements Serializable {

    private ConversionTask conversionTask;

    /**
     * Returns the value of the ConversionTask property for this object.
     *
     * @return The value of the ConversionTask property for this object.
     */
    public ConversionTask getConversionTask() {
        return conversionTask;
    }
    
    /**
     * Sets the value of the ConversionTask property for this object.
     *
     * @param conversionTask The new value for the ConversionTask property for this object.
     */
    public void setConversionTask(ConversionTask conversionTask) {
        this.conversionTask = conversionTask;
    }
    
    /**
     * Sets the value of the ConversionTask property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTask The new value for the ConversionTask property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportVolumeResult withConversionTask(ConversionTask conversionTask) {
        this.conversionTask = conversionTask;
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
        if (getConversionTask() != null) sb.append("ConversionTask: " + getConversionTask() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConversionTask() == null) ? 0 : getConversionTask().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportVolumeResult == false) return false;
        ImportVolumeResult other = (ImportVolumeResult)obj;
        
        if (other.getConversionTask() == null ^ this.getConversionTask() == null) return false;
        if (other.getConversionTask() != null && other.getConversionTask().equals(this.getConversionTask()) == false) return false; 
        return true;
    }
    
}
    