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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the following actions:
 * </p>
 * 
 * <ul>
 * <li> DescribeDBSecurityGroups </li>
 * <li> AuthorizeDBSecurityGroupIngress </li>
 * <li> CreateDBSecurityGroup </li>
 * <li> RevokeDBSecurityGroupIngress </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the DescribeDBSecurityGroups action.
 * </p>
 */
public class DBSecurityGroup implements Serializable {

    /**
     * Provides the AWS ID of the owner of a specific DB security group.
     */
    private String ownerId;

    /**
     * Specifies the name of the DB security group.
     */
    private String dBSecurityGroupName;

    /**
     * Provides the description of the DB security group.
     */
    private String dBSecurityGroupDescription;

    /**
     * Provides the VpcId of the DB security group.
     */
    private String vpcId;

    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * Contains a list of <a>IPRange</a> elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IPRange> iPRanges;

    /**
     * Provides the AWS ID of the owner of a specific DB security group.
     *
     * @return Provides the AWS ID of the owner of a specific DB security group.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * Provides the AWS ID of the owner of a specific DB security group.
     *
     * @param ownerId Provides the AWS ID of the owner of a specific DB security group.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * Provides the AWS ID of the owner of a specific DB security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId Provides the AWS ID of the owner of a specific DB security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Specifies the name of the DB security group.
     *
     * @return Specifies the name of the DB security group.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * Specifies the name of the DB security group.
     *
     * @param dBSecurityGroupName Specifies the name of the DB security group.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * Specifies the name of the DB security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName Specifies the name of the DB security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * Provides the description of the DB security group.
     *
     * @return Provides the description of the DB security group.
     */
    public String getDBSecurityGroupDescription() {
        return dBSecurityGroupDescription;
    }
    
    /**
     * Provides the description of the DB security group.
     *
     * @param dBSecurityGroupDescription Provides the description of the DB security group.
     */
    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }
    
    /**
     * Provides the description of the DB security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupDescription Provides the description of the DB security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
        return this;
    }

    /**
     * Provides the VpcId of the DB security group.
     *
     * @return Provides the VpcId of the DB security group.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Provides the VpcId of the DB security group.
     *
     * @param vpcId Provides the VpcId of the DB security group.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Provides the VpcId of the DB security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Provides the VpcId of the DB security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @return Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        if (eC2SecurityGroups == null) {
              eC2SecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>();
              eC2SecurityGroups.setAutoConstruct(true);
        }
        return eC2SecurityGroups;
    }
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @param eC2SecurityGroups Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>(eC2SecurityGroups.size());
        eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
        this.eC2SecurityGroups = eC2SecurityGroupsCopy;
    }
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (getEC2SecurityGroups() == null) setEC2SecurityGroups(new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups.length));
        for (EC2SecurityGroup value : eC2SecurityGroups) {
            getEC2SecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>(eC2SecurityGroups.size());
            eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
            this.eC2SecurityGroups = eC2SecurityGroupsCopy;
        }

        return this;
    }

    /**
     * Contains a list of <a>IPRange</a> elements.
     *
     * @return Contains a list of <a>IPRange</a> elements.
     */
    public java.util.List<IPRange> getIPRanges() {
        if (iPRanges == null) {
              iPRanges = new com.amazonaws.internal.ListWithAutoConstructFlag<IPRange>();
              iPRanges.setAutoConstruct(true);
        }
        return iPRanges;
    }
    
    /**
     * Contains a list of <a>IPRange</a> elements.
     *
     * @param iPRanges Contains a list of <a>IPRange</a> elements.
     */
    public void setIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IPRange> iPRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IPRange>(iPRanges.size());
        iPRangesCopy.addAll(iPRanges);
        this.iPRanges = iPRangesCopy;
    }
    
    /**
     * Contains a list of <a>IPRange</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iPRanges Contains a list of <a>IPRange</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withIPRanges(IPRange... iPRanges) {
        if (getIPRanges() == null) setIPRanges(new java.util.ArrayList<IPRange>(iPRanges.length));
        for (IPRange value : iPRanges) {
            getIPRanges().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of <a>IPRange</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iPRanges Contains a list of <a>IPRange</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSecurityGroup withIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IPRange> iPRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IPRange>(iPRanges.size());
            iPRangesCopy.addAll(iPRanges);
            this.iPRanges = iPRangesCopy;
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
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getDBSecurityGroupName() != null) sb.append("DBSecurityGroupName: " + getDBSecurityGroupName() + ",");
        if (getDBSecurityGroupDescription() != null) sb.append("DBSecurityGroupDescription: " + getDBSecurityGroupDescription() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getEC2SecurityGroups() != null) sb.append("EC2SecurityGroups: " + getEC2SecurityGroups() + ",");
        if (getIPRanges() != null) sb.append("IPRanges: " + getIPRanges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getIPRanges() == null) ? 0 : getIPRanges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBSecurityGroup == false) return false;
        DBSecurityGroup other = (DBSecurityGroup)obj;
        
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null) return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false) return false; 
        if (other.getDBSecurityGroupDescription() == null ^ this.getDBSecurityGroupDescription() == null) return false;
        if (other.getDBSecurityGroupDescription() != null && other.getDBSecurityGroupDescription().equals(this.getDBSecurityGroupDescription()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null) return false;
        if (other.getEC2SecurityGroups() != null && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false) return false; 
        if (other.getIPRanges() == null ^ this.getIPRanges() == null) return false;
        if (other.getIPRanges() != null && other.getIPRanges().equals(this.getIPRanges()) == false) return false; 
        return true;
    }
    
}
    