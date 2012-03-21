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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest) CreateDBSecurityGroup operation}.
 * <p>
 * Creates a new DB Security Group. DB Security Groups control access to
 * a DB Instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest)
 */
public class CreateDBSecurityGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     */
    private String dBSecurityGroupName;

    /**
     * The description for the DB Security Group.
     */
    private String dBSecurityGroupDescription;

    /**
     * The Id of VPC. Indicates which VPC this DB Security Group should
     * belong to. Must be specified to create a DB Security Group for a VPC;
     * may not be specified otherwise.
     */
    private String eC2VpcId;

    /**
     * Default constructor for a new CreateDBSecurityGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBSecurityGroupRequest() {}
    
    /**
     * Constructs a new CreateDBSecurityGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBSecurityGroupName The name for the DB Security Group. This
     * value is stored as a lowercase string. <p>Constraints: Must contain no
     * more than 255 alphanumeric characters or hyphens. Must not be
     * "Default". <p>Example: <code>mysecuritygroup</code>
     * @param dBSecurityGroupDescription The description for the DB Security
     * Group.
     */
    public CreateDBSecurityGroupRequest(String dBSecurityGroupName, String dBSecurityGroupDescription) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }

    
    
    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     *
     * @return The name for the DB Security Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters or hyphens. Must not be "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     *
     * @param dBSecurityGroupName The name for the DB Security Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters or hyphens. Must not be "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters or hyphens. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name for the DB Security Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters or hyphens. Must not be "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBSecurityGroupRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }
    
    
    /**
     * The description for the DB Security Group.
     *
     * @return The description for the DB Security Group.
     */
    public String getDBSecurityGroupDescription() {
        return dBSecurityGroupDescription;
    }
    
    /**
     * The description for the DB Security Group.
     *
     * @param dBSecurityGroupDescription The description for the DB Security Group.
     */
    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }
    
    /**
     * The description for the DB Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupDescription The description for the DB Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBSecurityGroupRequest withDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
        return this;
    }
    
    
    /**
     * The Id of VPC. Indicates which VPC this DB Security Group should
     * belong to. Must be specified to create a DB Security Group for a VPC;
     * may not be specified otherwise.
     *
     * @return The Id of VPC. Indicates which VPC this DB Security Group should
     *         belong to. Must be specified to create a DB Security Group for a VPC;
     *         may not be specified otherwise.
     */
    public String getEC2VpcId() {
        return eC2VpcId;
    }
    
    /**
     * The Id of VPC. Indicates which VPC this DB Security Group should
     * belong to. Must be specified to create a DB Security Group for a VPC;
     * may not be specified otherwise.
     *
     * @param eC2VpcId The Id of VPC. Indicates which VPC this DB Security Group should
     *         belong to. Must be specified to create a DB Security Group for a VPC;
     *         may not be specified otherwise.
     */
    public void setEC2VpcId(String eC2VpcId) {
        this.eC2VpcId = eC2VpcId;
    }
    
    /**
     * The Id of VPC. Indicates which VPC this DB Security Group should
     * belong to. Must be specified to create a DB Security Group for a VPC;
     * may not be specified otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2VpcId The Id of VPC. Indicates which VPC this DB Security Group should
     *         belong to. Must be specified to create a DB Security Group for a VPC;
     *         may not be specified otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBSecurityGroupRequest withEC2VpcId(String eC2VpcId) {
        this.eC2VpcId = eC2VpcId;
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
        if (dBSecurityGroupName != null) sb.append("DBSecurityGroupName: " + dBSecurityGroupName + ", ");
        if (dBSecurityGroupDescription != null) sb.append("DBSecurityGroupDescription: " + dBSecurityGroupDescription + ", ");
        if (eC2VpcId != null) sb.append("EC2VpcId: " + eC2VpcId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getEC2VpcId() == null) ? 0 : getEC2VpcId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateDBSecurityGroupRequest == false) return false;
        CreateDBSecurityGroupRequest other = (CreateDBSecurityGroupRequest)obj;
        
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null) return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false) return false; 
        if (other.getDBSecurityGroupDescription() == null ^ this.getDBSecurityGroupDescription() == null) return false;
        if (other.getDBSecurityGroupDescription() != null && other.getDBSecurityGroupDescription().equals(this.getDBSecurityGroupDescription()) == false) return false; 
        if (other.getEC2VpcId() == null ^ this.getEC2VpcId() == null) return false;
        if (other.getEC2VpcId() != null && other.getEC2VpcId().equals(this.getEC2VpcId()) == false) return false; 
        return true;
    }
    
}
    