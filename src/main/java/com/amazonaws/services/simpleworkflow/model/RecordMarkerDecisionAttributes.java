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
package com.amazonaws.services.simpleworkflow.model;

/**
 * <p>
 * Provides details of the <code>RecordMarker</code> decision.
 * </p>
 */
public class RecordMarkerDecisionAttributes {

    /**
     * The name of the marker. This filed is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String markerName;

    /**
     * Optional details of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String details;

    /**
     * The name of the marker. This filed is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the marker. This filed is required.
     */
    public String getMarkerName() {
        return markerName;
    }
    
    /**
     * The name of the marker. This filed is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param markerName The name of the marker. This filed is required.
     */
    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }
    
    /**
     * The name of the marker. This filed is required.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param markerName The name of the marker. This filed is required.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RecordMarkerDecisionAttributes withMarkerName(String markerName) {
        this.markerName = markerName;
        return this;
    }
    
    
    /**
     * Optional details of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional details of the marker.
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * Optional details of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Optional details of the marker.
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * Optional details of the marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Optional details of the marker.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RecordMarkerDecisionAttributes withDetails(String details) {
        this.details = details;
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
        if (markerName != null) sb.append("MarkerName: " + markerName + ", ");
        if (details != null) sb.append("Details: " + details + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarkerName() == null) ? 0 : getMarkerName().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof RecordMarkerDecisionAttributes == false) return false;
        RecordMarkerDecisionAttributes other = (RecordMarkerDecisionAttributes)obj;
        
        if (other.getMarkerName() == null ^ this.getMarkerName() == null) return false;
        if (other.getMarkerName() != null && other.getMarkerName().equals(this.getMarkerName()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        return true;
    }
    
}
    