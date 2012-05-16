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
 * Contains the result of a successful invocation of the DescribeDBEngineVersions action.
 * </p>
 */
public class DescribeDBEngineVersionsResult {

    /**
     * The identifier returned to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of <code>DBEngineVersion</code> elements.
     */
    private java.util.List<DBEngineVersion> dBEngineVersions;

    /**
     * The identifier returned to allow retrieval of paginated results.
     *
     * @return The identifier returned to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The identifier returned to allow retrieval of paginated results.
     *
     * @param marker The identifier returned to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The identifier returned to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The identifier returned to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     *
     * @return A list of <code>DBEngineVersion</code> elements.
     */
    public java.util.List<DBEngineVersion> getDBEngineVersions() {
        
        if (dBEngineVersions == null) {
            dBEngineVersions = new java.util.ArrayList<DBEngineVersion>();
        }
        return dBEngineVersions;
    }
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     *
     * @param dBEngineVersions A list of <code>DBEngineVersion</code> elements.
     */
    public void setDBEngineVersions(java.util.Collection<DBEngineVersion> dBEngineVersions) {
        if (dBEngineVersions == null) {
            this.dBEngineVersions = null;
            return;
        }

        java.util.List<DBEngineVersion> dBEngineVersionsCopy = new java.util.ArrayList<DBEngineVersion>(dBEngineVersions.size());
        dBEngineVersionsCopy.addAll(dBEngineVersions);
        this.dBEngineVersions = dBEngineVersionsCopy;
    }
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBEngineVersions A list of <code>DBEngineVersion</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsResult withDBEngineVersions(DBEngineVersion... dBEngineVersions) {
        if (getDBEngineVersions() == null) setDBEngineVersions(new java.util.ArrayList<DBEngineVersion>(dBEngineVersions.length));
        for (DBEngineVersion value : dBEngineVersions) {
            getDBEngineVersions().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBEngineVersions A list of <code>DBEngineVersion</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsResult withDBEngineVersions(java.util.Collection<DBEngineVersion> dBEngineVersions) {
        if (dBEngineVersions == null) {
            this.dBEngineVersions = null;
        } else {
            java.util.List<DBEngineVersion> dBEngineVersionsCopy = new java.util.ArrayList<DBEngineVersion>(dBEngineVersions.size());
            dBEngineVersionsCopy.addAll(dBEngineVersions);
            this.dBEngineVersions = dBEngineVersionsCopy;
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
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (dBEngineVersions != null) sb.append("DBEngineVersions: " + dBEngineVersions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBEngineVersions() == null) ? 0 : getDBEngineVersions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeDBEngineVersionsResult == false) return false;
        DescribeDBEngineVersionsResult other = (DescribeDBEngineVersionsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBEngineVersions() == null ^ this.getDBEngineVersions() == null) return false;
        if (other.getDBEngineVersions() != null && other.getDBEngineVersions().equals(this.getDBEngineVersions()) == false) return false; 
        return true;
    }
    
}
    