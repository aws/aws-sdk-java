/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Metric Filter Match Record
 */
public class MetricFilterMatchRecord implements Serializable {

    private Long eventNumber;

    private String eventMessage;

    private java.util.Map<String,String> extractedValues;

    /**
     * Returns the value of the EventNumber property for this object.
     *
     * @return The value of the EventNumber property for this object.
     */
    public Long getEventNumber() {
        return eventNumber;
    }
    
    /**
     * Sets the value of the EventNumber property for this object.
     *
     * @param eventNumber The new value for the EventNumber property for this object.
     */
    public void setEventNumber(Long eventNumber) {
        this.eventNumber = eventNumber;
    }
    
    /**
     * Sets the value of the EventNumber property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventNumber The new value for the EventNumber property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilterMatchRecord withEventNumber(Long eventNumber) {
        this.eventNumber = eventNumber;
        return this;
    }

    /**
     * Returns the value of the EventMessage property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     *
     * @return The value of the EventMessage property for this object.
     */
    public String getEventMessage() {
        return eventMessage;
    }
    
    /**
     * Sets the value of the EventMessage property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     *
     * @param eventMessage The new value for the EventMessage property for this object.
     */
    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }
    
    /**
     * Sets the value of the EventMessage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     *
     * @param eventMessage The new value for the EventMessage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilterMatchRecord withEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
        return this;
    }

    /**
     * Returns the value of the ExtractedValues property for this object.
     *
     * @return The value of the ExtractedValues property for this object.
     */
    public java.util.Map<String,String> getExtractedValues() {
        
        if (extractedValues == null) {
            extractedValues = new java.util.HashMap<String,String>();
        }
        return extractedValues;
    }
    
    /**
     * Sets the value of the ExtractedValues property for this object.
     *
     * @param extractedValues The new value for the ExtractedValues property for this object.
     */
    public void setExtractedValues(java.util.Map<String,String> extractedValues) {
        this.extractedValues = extractedValues;
    }
    
    /**
     * Sets the value of the ExtractedValues property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param extractedValues The new value for the ExtractedValues property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MetricFilterMatchRecord withExtractedValues(java.util.Map<String,String> extractedValues) {
        setExtractedValues(extractedValues);
        return this;
    }

    /**
     * Sets the value of the ExtractedValues property for this object.
     * <p>
     * The method adds a new key-value pair into ExtractedValues parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ExtractedValues.
     * @param value The corresponding value of the entry to be added into ExtractedValues.
     */
    public MetricFilterMatchRecord addExtractedValuesEntry(String key, String value) {
        if (null == this.extractedValues) {
            this.extractedValues = new java.util.HashMap<String,String>();
        }
        if (this.extractedValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.extractedValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExtractedValues.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public MetricFilterMatchRecord clearExtractedValuesEntries() {
        this.extractedValues = null;
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
        if (getEventNumber() != null) sb.append("EventNumber: " + getEventNumber() + ",");
        if (getEventMessage() != null) sb.append("EventMessage: " + getEventMessage() + ",");
        if (getExtractedValues() != null) sb.append("ExtractedValues: " + getExtractedValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventNumber() == null) ? 0 : getEventNumber().hashCode()); 
        hashCode = prime * hashCode + ((getEventMessage() == null) ? 0 : getEventMessage().hashCode()); 
        hashCode = prime * hashCode + ((getExtractedValues() == null) ? 0 : getExtractedValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MetricFilterMatchRecord == false) return false;
        MetricFilterMatchRecord other = (MetricFilterMatchRecord)obj;
        
        if (other.getEventNumber() == null ^ this.getEventNumber() == null) return false;
        if (other.getEventNumber() != null && other.getEventNumber().equals(this.getEventNumber()) == false) return false; 
        if (other.getEventMessage() == null ^ this.getEventMessage() == null) return false;
        if (other.getEventMessage() != null && other.getEventMessage().equals(this.getEventMessage()) == false) return false; 
        if (other.getExtractedValues() == null ^ this.getExtractedValues() == null) return false;
        if (other.getExtractedValues() != null && other.getExtractedValues().equals(this.getExtractedValues()) == false) return false; 
        return true;
    }
    
}
    