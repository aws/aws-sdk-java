/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeDBSecurityGroupsResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>DBSecurityGroup</a> instances.
     */
    private java.util.List<DBSecurityGroup> dBSecurityGroups;

    /**
     * The marker obtained from a previous operation response.
     *
     * @return The marker obtained from a previous operation response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @param marker The marker obtained from a previous operation response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker obtained from a previous operation response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A list of <a>DBSecurityGroup</a> instances.
     */
    public java.util.List<DBSecurityGroup> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new java.util.ArrayList<DBSecurityGroup>();
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     */
    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroup> dBSecurityGroups) {
        java.util.List<DBSecurityGroup> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroup>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsResult withDBSecurityGroups(DBSecurityGroup... dBSecurityGroups) {
        for (DBSecurityGroup value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsResult withDBSecurityGroups(java.util.Collection<DBSecurityGroup> dBSecurityGroups) {
        java.util.List<DBSecurityGroup> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroup>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;

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
        sb.append("Marker: " + marker + ", ");
        sb.append("DBSecurityGroups: " + dBSecurityGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    