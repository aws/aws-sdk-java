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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * The input for a ListChangeBatchesByHostedZone request.
 * </p>
 */
public class ListChangeBatchesByHostedZoneResult implements Serializable, Cloneable {

    /**
     * The maximum number of items on a page.
     */
    private String maxItems;

    /**
     * The page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String marker;

    /**
     * A flag that indicates if there are more change batches to list.
     */
    private Boolean isTruncated;

    /**
     * The change batches within the given hosted zone and time period.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ChangeBatchRecord> changeBatchRecords;

    /**
     * The next page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String nextMarker;

    /**
     * The maximum number of items on a page.
     *
     * @return The maximum number of items on a page.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of items on a page.
     *
     * @param maxItems The maximum number of items on a page.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of items on a page.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of items on a page.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByHostedZoneResult withMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * The page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The page marker.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker The page marker.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The page marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker The page marker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByHostedZoneResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A flag that indicates if there are more change batches to list.
     *
     * @return A flag that indicates if there are more change batches to list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates if there are more change batches to list.
     *
     * @param isTruncated A flag that indicates if there are more change batches to list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates if there are more change batches to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates if there are more change batches to list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByHostedZoneResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates if there are more change batches to list.
     *
     * @return A flag that indicates if there are more change batches to list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * The change batches within the given hosted zone and time period.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The change batches within the given hosted zone and time period.
     */
    public java.util.List<ChangeBatchRecord> getChangeBatchRecords() {
        if (changeBatchRecords == null) {
              changeBatchRecords = new com.amazonaws.internal.ListWithAutoConstructFlag<ChangeBatchRecord>();
              changeBatchRecords.setAutoConstruct(true);
        }
        return changeBatchRecords;
    }
    
    /**
     * The change batches within the given hosted zone and time period.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changeBatchRecords The change batches within the given hosted zone and time period.
     */
    public void setChangeBatchRecords(java.util.Collection<ChangeBatchRecord> changeBatchRecords) {
        if (changeBatchRecords == null) {
            this.changeBatchRecords = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ChangeBatchRecord> changeBatchRecordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ChangeBatchRecord>(changeBatchRecords.size());
        changeBatchRecordsCopy.addAll(changeBatchRecords);
        this.changeBatchRecords = changeBatchRecordsCopy;
    }
    
    /**
     * The change batches within the given hosted zone and time period.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setChangeBatchRecords(java.util.Collection)} or
     * {@link #withChangeBatchRecords(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changeBatchRecords The change batches within the given hosted zone and time period.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByHostedZoneResult withChangeBatchRecords(ChangeBatchRecord... changeBatchRecords) {
        if (getChangeBatchRecords() == null) setChangeBatchRecords(new java.util.ArrayList<ChangeBatchRecord>(changeBatchRecords.length));
        for (ChangeBatchRecord value : changeBatchRecords) {
            getChangeBatchRecords().add(value);
        }
        return this;
    }
    
    /**
     * The change batches within the given hosted zone and time period.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changeBatchRecords The change batches within the given hosted zone and time period.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByHostedZoneResult withChangeBatchRecords(java.util.Collection<ChangeBatchRecord> changeBatchRecords) {
        if (changeBatchRecords == null) {
            this.changeBatchRecords = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ChangeBatchRecord> changeBatchRecordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ChangeBatchRecord>(changeBatchRecords.size());
            changeBatchRecordsCopy.addAll(changeBatchRecords);
            this.changeBatchRecords = changeBatchRecordsCopy;
        }

        return this;
    }

    /**
     * The next page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The next page marker.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * The next page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param nextMarker The next page marker.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * The next page marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param nextMarker The next page marker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByHostedZoneResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getChangeBatchRecords() != null) sb.append("ChangeBatchRecords: " + getChangeBatchRecords() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getChangeBatchRecords() == null) ? 0 : getChangeBatchRecords().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListChangeBatchesByHostedZoneResult == false) return false;
        ListChangeBatchesByHostedZoneResult other = (ListChangeBatchesByHostedZoneResult)obj;
        
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getChangeBatchRecords() == null ^ this.getChangeBatchRecords() == null) return false;
        if (other.getChangeBatchRecords() != null && other.getChangeBatchRecords().equals(this.getChangeBatchRecords()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public ListChangeBatchesByHostedZoneResult clone() {
        try {
            return (ListChangeBatchesByHostedZoneResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    