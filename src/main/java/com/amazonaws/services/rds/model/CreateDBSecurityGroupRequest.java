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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest) CreateDBSecurityGroup operation}.
 * <p>
 * Creates a new DB Security Group. DB Security Groups control access to a DB Instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest)
 */
public class CreateDBSecurityGroupRequest extends AmazonWebServiceRequest  implements Serializable  {

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
        if (getDBSecurityGroupName() != null) sb.append("DBSecurityGroupName: " + getDBSecurityGroupName() + ", ");
        if (getDBSecurityGroupDescription() != null) sb.append("DBSecurityGroupDescription: " + getDBSecurityGroupDescription() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription().hashCode()); 
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
        return true;
    }
    
}
    