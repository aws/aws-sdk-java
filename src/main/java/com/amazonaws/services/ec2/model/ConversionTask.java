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
 * Conversion Task
 */
public class ConversionTask implements Serializable {

    private String conversionTaskId;

    private String expirationTime;

    private ImportInstanceTaskDetails importInstance;

    private ImportVolumeTaskDetails importVolume;

    private String state;

    private String statusMessage;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Returns the value of the ConversionTaskId property for this object.
     *
     * @return The value of the ConversionTaskId property for this object.
     */
    public String getConversionTaskId() {
        return conversionTaskId;
    }
    
    /**
     * Sets the value of the ConversionTaskId property for this object.
     *
     * @param conversionTaskId The new value for the ConversionTaskId property for this object.
     */
    public void setConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
    }
    
    /**
     * Sets the value of the ConversionTaskId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTaskId The new value for the ConversionTaskId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConversionTask withConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
        return this;
    }

    /**
     * Returns the value of the ExpirationTime property for this object.
     *
     * @return The value of the ExpirationTime property for this object.
     */
    public String getExpirationTime() {
        return expirationTime;
    }
    
    /**
     * Sets the value of the ExpirationTime property for this object.
     *
     * @param expirationTime The new value for the ExpirationTime property for this object.
     */
    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }
    
    /**
     * Sets the value of the ExpirationTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expirationTime The new value for the ExpirationTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConversionTask withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Returns the value of the ImportInstance property for this object.
     *
     * @return The value of the ImportInstance property for this object.
     */
    public ImportInstanceTaskDetails getImportInstance() {
        return importInstance;
    }
    
    /**
     * Sets the value of the ImportInstance property for this object.
     *
     * @param importInstance The new value for the ImportInstance property for this object.
     */
    public void setImportInstance(ImportInstanceTaskDetails importInstance) {
        this.importInstance = importInstance;
    }
    
    /**
     * Sets the value of the ImportInstance property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importInstance The new value for the ImportInstance property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConversionTask withImportInstance(ImportInstanceTaskDetails importInstance) {
        this.importInstance = importInstance;
        return this;
    }

    /**
     * Returns the value of the ImportVolume property for this object.
     *
     * @return The value of the ImportVolume property for this object.
     */
    public ImportVolumeTaskDetails getImportVolume() {
        return importVolume;
    }
    
    /**
     * Sets the value of the ImportVolume property for this object.
     *
     * @param importVolume The new value for the ImportVolume property for this object.
     */
    public void setImportVolume(ImportVolumeTaskDetails importVolume) {
        this.importVolume = importVolume;
    }
    
    /**
     * Sets the value of the ImportVolume property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importVolume The new value for the ImportVolume property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConversionTask withImportVolume(ImportVolumeTaskDetails importVolume) {
        this.importVolume = importVolume;
        return this;
    }

    /**
     * Returns the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @return The value of the State property for this object.
     *
     * @see ConversionTaskState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @see ConversionTaskState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConversionTaskState
     */
    public ConversionTask withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @see ConversionTaskState
     */
    public void setState(ConversionTaskState state) {
        this.state = state.toString();
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConversionTaskState
     */
    public ConversionTask withState(ConversionTaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns the value of the StatusMessage property for this object.
     *
     * @return The value of the StatusMessage property for this object.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * Sets the value of the StatusMessage property for this object.
     *
     * @param statusMessage The new value for the StatusMessage property for this object.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * Sets the value of the StatusMessage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage The new value for the StatusMessage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConversionTask withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Returns the value of the Tags property for this object.
     *
     * @return The value of the Tags property for this object.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     *
     * @param tags The new value for the Tags property for this object.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConversionTask withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConversionTask withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (getConversionTaskId() != null) sb.append("ConversionTaskId: " + getConversionTaskId() + ",");
        if (getExpirationTime() != null) sb.append("ExpirationTime: " + getExpirationTime() + ",");
        if (getImportInstance() != null) sb.append("ImportInstance: " + getImportInstance() + ",");
        if (getImportVolume() != null) sb.append("ImportVolume: " + getImportVolume() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConversionTaskId() == null) ? 0 : getConversionTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode()); 
        hashCode = prime * hashCode + ((getImportInstance() == null) ? 0 : getImportInstance().hashCode()); 
        hashCode = prime * hashCode + ((getImportVolume() == null) ? 0 : getImportVolume().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConversionTask == false) return false;
        ConversionTask other = (ConversionTask)obj;
        
        if (other.getConversionTaskId() == null ^ this.getConversionTaskId() == null) return false;
        if (other.getConversionTaskId() != null && other.getConversionTaskId().equals(this.getConversionTaskId()) == false) return false; 
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null) return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false) return false; 
        if (other.getImportInstance() == null ^ this.getImportInstance() == null) return false;
        if (other.getImportInstance() != null && other.getImportInstance().equals(this.getImportInstance()) == false) return false; 
        if (other.getImportVolume() == null ^ this.getImportVolume() == null) return false;
        if (other.getImportVolume() != null && other.getImportVolume().equals(this.getImportVolume()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    