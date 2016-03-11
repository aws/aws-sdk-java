/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeTableRestoreStatusResult implements Serializable, Cloneable {

    /**
     * A list of status details for one or more table restore requests.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TableRestoreStatus> tableRestoreStatusDetails;

    /**
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     */
    private String marker;

    /**
     * A list of status details for one or more table restore requests.
     *
     * @return A list of status details for one or more table restore requests.
     */
    public java.util.List<TableRestoreStatus> getTableRestoreStatusDetails() {
        if (tableRestoreStatusDetails == null) {
              tableRestoreStatusDetails = new com.amazonaws.internal.ListWithAutoConstructFlag<TableRestoreStatus>();
              tableRestoreStatusDetails.setAutoConstruct(true);
        }
        return tableRestoreStatusDetails;
    }
    
    /**
     * A list of status details for one or more table restore requests.
     *
     * @param tableRestoreStatusDetails A list of status details for one or more table restore requests.
     */
    public void setTableRestoreStatusDetails(java.util.Collection<TableRestoreStatus> tableRestoreStatusDetails) {
        if (tableRestoreStatusDetails == null) {
            this.tableRestoreStatusDetails = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TableRestoreStatus> tableRestoreStatusDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TableRestoreStatus>(tableRestoreStatusDetails.size());
        tableRestoreStatusDetailsCopy.addAll(tableRestoreStatusDetails);
        this.tableRestoreStatusDetails = tableRestoreStatusDetailsCopy;
    }
    
    /**
     * A list of status details for one or more table restore requests.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTableRestoreStatusDetails(java.util.Collection)}
     * or {@link #withTableRestoreStatusDetails(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableRestoreStatusDetails A list of status details for one or more table restore requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTableRestoreStatusResult withTableRestoreStatusDetails(TableRestoreStatus... tableRestoreStatusDetails) {
        if (getTableRestoreStatusDetails() == null) setTableRestoreStatusDetails(new java.util.ArrayList<TableRestoreStatus>(tableRestoreStatusDetails.length));
        for (TableRestoreStatus value : tableRestoreStatusDetails) {
            getTableRestoreStatusDetails().add(value);
        }
        return this;
    }
    
    /**
     * A list of status details for one or more table restore requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableRestoreStatusDetails A list of status details for one or more table restore requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTableRestoreStatusResult withTableRestoreStatusDetails(java.util.Collection<TableRestoreStatus> tableRestoreStatusDetails) {
        if (tableRestoreStatusDetails == null) {
            this.tableRestoreStatusDetails = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TableRestoreStatus> tableRestoreStatusDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TableRestoreStatus>(tableRestoreStatusDetails.size());
            tableRestoreStatusDetailsCopy.addAll(tableRestoreStatusDetails);
            this.tableRestoreStatusDetails = tableRestoreStatusDetailsCopy;
        }

        return this;
    }

    /**
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     *
     * @return A pagination token that can be used in a subsequent
     *         <a>DescribeTableRestoreStatus</a> request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     *
     * @param marker A pagination token that can be used in a subsequent
     *         <a>DescribeTableRestoreStatus</a> request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A pagination token that can be used in a subsequent
     *         <a>DescribeTableRestoreStatus</a> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTableRestoreStatusResult withMarker(String marker) {
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
        if (getTableRestoreStatusDetails() != null) sb.append("TableRestoreStatusDetails: " + getTableRestoreStatusDetails() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableRestoreStatusDetails() == null) ? 0 : getTableRestoreStatusDetails().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTableRestoreStatusResult == false) return false;
        DescribeTableRestoreStatusResult other = (DescribeTableRestoreStatusResult)obj;
        
        if (other.getTableRestoreStatusDetails() == null ^ this.getTableRestoreStatusDetails() == null) return false;
        if (other.getTableRestoreStatusDetails() != null && other.getTableRestoreStatusDetails().equals(this.getTableRestoreStatusDetails()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeTableRestoreStatusResult clone() {
        try {
            return (DescribeTableRestoreStatusResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    