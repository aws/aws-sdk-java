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
 * Contains the result of a successful invocation of the following
 * actions:
 * </p>
 * 
 * <ul>
 * <li> CreateDBSubnetGroup </li>
 * <li> ModifyDBSubnetGroup </li>
 * <li> DescribeDBSubnetGroups </li>
 * <li> DeleteDBSubnetGroup </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the
 * DescribeDBSubnetGroups action.
 * </p>
 */
public class DBSubnetGroup {

    /**
     * Specifies the name of the DB Subnet Group.
     */
    private String dBSubnetGroupName;

    /**
     * Provides the description of the DB Subnet Group.
     */
    private String dBSubnetGroupDescription;

    /**
     * Provides the VpcId of the DB Subnet Group.
     */
    private String vpcId;

    /**
     * Provides the status of the DB Subnet Group.
     */
    private String subnetGroupStatus;

    /**
     * Contains a list of <a>Subnets</a> elements.
     */
    private java.util.List<Subnet> subnets;

    /**
     * Specifies the name of the DB Subnet Group.
     *
     * @return Specifies the name of the DB Subnet Group.
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * Specifies the name of the DB Subnet Group.
     *
     * @param dBSubnetGroupName Specifies the name of the DB Subnet Group.
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * Specifies the name of the DB Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName Specifies the name of the DB Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSubnetGroup withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }
    
    
    /**
     * Provides the description of the DB Subnet Group.
     *
     * @return Provides the description of the DB Subnet Group.
     */
    public String getDBSubnetGroupDescription() {
        return dBSubnetGroupDescription;
    }
    
    /**
     * Provides the description of the DB Subnet Group.
     *
     * @param dBSubnetGroupDescription Provides the description of the DB Subnet Group.
     */
    public void setDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
    }
    
    /**
     * Provides the description of the DB Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupDescription Provides the description of the DB Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSubnetGroup withDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
        return this;
    }
    
    
    /**
     * Provides the VpcId of the DB Subnet Group.
     *
     * @return Provides the VpcId of the DB Subnet Group.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Provides the VpcId of the DB Subnet Group.
     *
     * @param vpcId Provides the VpcId of the DB Subnet Group.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Provides the VpcId of the DB Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Provides the VpcId of the DB Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSubnetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    /**
     * Provides the status of the DB Subnet Group.
     *
     * @return Provides the status of the DB Subnet Group.
     */
    public String getSubnetGroupStatus() {
        return subnetGroupStatus;
    }
    
    /**
     * Provides the status of the DB Subnet Group.
     *
     * @param subnetGroupStatus Provides the status of the DB Subnet Group.
     */
    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }
    
    /**
     * Provides the status of the DB Subnet Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetGroupStatus Provides the status of the DB Subnet Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
        return this;
    }
    
    
    /**
     * Contains a list of <a>Subnets</a> elements.
     *
     * @return Contains a list of <a>Subnets</a> elements.
     */
    public java.util.List<Subnet> getSubnets() {
        
        if (subnets == null) {
            subnets = new java.util.ArrayList<Subnet>();
        }
        return subnets;
    }
    
    /**
     * Contains a list of <a>Subnets</a> elements.
     *
     * @param subnets Contains a list of <a>Subnets</a> elements.
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        java.util.List<Subnet> subnetsCopy = new java.util.ArrayList<Subnet>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * Contains a list of <a>Subnets</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Contains a list of <a>Subnets</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSubnetGroup withSubnets(Subnet... subnets) {
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<Subnet>(subnets.length));
        for (Subnet value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of <a>Subnets</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Contains a list of <a>Subnets</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            java.util.List<Subnet> subnetsCopy = new java.util.ArrayList<Subnet>(subnets.size());
            subnetsCopy.addAll(subnets);
            this.subnets = subnetsCopy;
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
        if (dBSubnetGroupName != null) sb.append("DBSubnetGroupName: " + dBSubnetGroupName + ", ");
        if (dBSubnetGroupDescription != null) sb.append("DBSubnetGroupDescription: " + dBSubnetGroupDescription + ", ");
        if (vpcId != null) sb.append("VpcId: " + vpcId + ", ");
        if (subnetGroupStatus != null) sb.append("SubnetGroupStatus: " + subnetGroupStatus + ", ");
        if (subnets != null) sb.append("Subnets: " + subnets + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupDescription() == null) ? 0 : getDBSubnetGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode()); 
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DBSubnetGroup == false) return false;
        DBSubnetGroup other = (DBSubnetGroup)obj;
        
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.getDBSubnetGroupDescription() == null ^ this.getDBSubnetGroupDescription() == null) return false;
        if (other.getDBSubnetGroupDescription() != null && other.getDBSubnetGroupDescription().equals(this.getDBSubnetGroupDescription()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null) return false;
        if (other.getSubnetGroupStatus() != null && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false) return false; 
        if (other.getSubnets() == null ^ this.getSubnets() == null) return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false) return false; 
        return true;
    }
    
}
    