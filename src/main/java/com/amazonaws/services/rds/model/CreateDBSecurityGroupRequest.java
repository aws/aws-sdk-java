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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest) CreateDBSecurityGroup operation}.
 * <p>
 * This API creates a new database security group. Database Security
 * groups control access to a database instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest)
 */
public class CreateDBSecurityGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string.
     */
    private String dBSecurityGroupName;

    /**
     * The description for the DB Security Group.
     */
    private String dBSecurityGroupDescription;

    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string.
     *
     * @return The name for the DB Security Group. This value is stored as a
     *         lowercase string.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string.
     *
     * @param dBSecurityGroupName The name for the DB Security Group. This value is stored as a
     *         lowercase string.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name for the DB Security Group. This value is stored as a
     * lowercase string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name for the DB Security Group. This value is stored as a
     *         lowercase string.
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
        sb.append("DBSecurityGroupName: " + dBSecurityGroupName + ", ");
        sb.append("DBSecurityGroupDescription: " + dBSecurityGroupDescription + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    