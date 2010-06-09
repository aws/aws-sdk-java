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
public class DBSecurityGroup {

    /**
     * Provides the AWS ID of the owner of a specific DB Security Group.
     */
    private String ownerId;

    /**
     * Specifies the name of the DB Security Group.
     */
    private String dBSecurityGroupName;

    /**
     * Provides the description of the database security group.
     */
    private String dBSecurityGroupDescription;

    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    private java.util.List<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * Contains a list of <a>IPRange</a> elements.
     */
    private java.util.List<IPRange> iPRanges;

    /**
     * Provides the AWS ID of the owner of a specific DB Security Group.
     *
     * @return Provides the AWS ID of the owner of a specific DB Security Group.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * Provides the AWS ID of the owner of a specific DB Security Group.
     *
     * @param ownerId Provides the AWS ID of the owner of a specific DB Security Group.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * Provides the AWS ID of the owner of a specific DB Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId Provides the AWS ID of the owner of a specific DB Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSecurityGroup withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    
    /**
     * Specifies the name of the DB Security Group.
     *
     * @return Specifies the name of the DB Security Group.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * Specifies the name of the DB Security Group.
     *
     * @param dBSecurityGroupName Specifies the name of the DB Security Group.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * Specifies the name of the DB Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName Specifies the name of the DB Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSecurityGroup withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }
    
    
    /**
     * Provides the description of the database security group.
     *
     * @return Provides the description of the database security group.
     */
    public String getDBSecurityGroupDescription() {
        return dBSecurityGroupDescription;
    }
    
    /**
     * Provides the description of the database security group.
     *
     * @param dBSecurityGroupDescription Provides the description of the database security group.
     */
    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }
    
    /**
     * Provides the description of the database security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupDescription Provides the description of the database security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSecurityGroup withDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
        return this;
    }
    
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @return Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        if (eC2SecurityGroups == null) {
            eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>();
        }
        return eC2SecurityGroups;
    }
    
    /**
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     *
     * @param eC2SecurityGroups Contains a list of <a>EC2SecurityGroup</a> elements.
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        java.util.List<EC2SecurityGroup> eC2SecurityGroupsCopy = new java.util.ArrayList<EC2SecurityGroup>();
        if (eC2SecurityGroups != null) {
            eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
        }
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
        java.util.List<EC2SecurityGroup> eC2SecurityGroupsCopy = new java.util.ArrayList<EC2SecurityGroup>();
        if (eC2SecurityGroups != null) {
            eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
        }
        this.eC2SecurityGroups = eC2SecurityGroupsCopy;

        return this;
    }
    
    /**
     * Contains a list of <a>IPRange</a> elements.
     *
     * @return Contains a list of <a>IPRange</a> elements.
     */
    public java.util.List<IPRange> getIPRanges() {
        if (iPRanges == null) {
            iPRanges = new java.util.ArrayList<IPRange>();
        }
        return iPRanges;
    }
    
    /**
     * Contains a list of <a>IPRange</a> elements.
     *
     * @param iPRanges Contains a list of <a>IPRange</a> elements.
     */
    public void setIPRanges(java.util.Collection<IPRange> iPRanges) {
        java.util.List<IPRange> iPRangesCopy = new java.util.ArrayList<IPRange>();
        if (iPRanges != null) {
            iPRangesCopy.addAll(iPRanges);
        }
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
        java.util.List<IPRange> iPRangesCopy = new java.util.ArrayList<IPRange>();
        if (iPRanges != null) {
            iPRangesCopy.addAll(iPRanges);
        }
        this.iPRanges = iPRangesCopy;

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
        
        sb.append("OwnerId: " + ownerId + ", ");
        sb.append("DBSecurityGroupName: " + dBSecurityGroupName + ", ");
        sb.append("DBSecurityGroupDescription: " + dBSecurityGroupDescription + ", ");
        sb.append("EC2SecurityGroups: " + eC2SecurityGroups + ", ");
        sb.append("IPRanges: " + iPRanges + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    