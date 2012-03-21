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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#deleteDBSecurityGroup(DeleteDBSecurityGroupRequest) DeleteDBSecurityGroup operation}.
 * <p>
 * Deletes a DB Security Group.
 * </p>
 * <p>
 * <b>NOTE:</b>The specified DB Security Group must not be associated
 * with any DB Instances.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteDBSecurityGroup(DeleteDBSecurityGroupRequest)
 */
public class DeleteDBSecurityGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Security Group to delete. <note>You cannot delete
     * the default DB Security Group.</note> <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBSecurityGroupName;

    /**
     * Default constructor for a new DeleteDBSecurityGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteDBSecurityGroupRequest() {}
    
    /**
     * Constructs a new DeleteDBSecurityGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBSecurityGroupName The name of the DB Security Group to
     * delete. <note>You cannot delete the default DB Security Group.</note>
     * <p> Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public DeleteDBSecurityGroupRequest(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    
    
    /**
     * The name of the DB Security Group to delete. <note>You cannot delete
     * the default DB Security Group.</note> <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return The name of the DB Security Group to delete. <note>You cannot delete
     *         the default DB Security Group.</note> <p> Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to delete. <note>You cannot delete
     * the default DB Security Group.</note> <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBSecurityGroupName The name of the DB Security Group to delete. <note>You cannot delete
     *         the default DB Security Group.</note> <p> Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to delete. <note>You cannot delete
     * the default DB Security Group.</note> <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name of the DB Security Group to delete. <note>You cannot delete
     *         the default DB Security Group.</note> <p> Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDBSecurityGroupRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
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
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DeleteDBSecurityGroupRequest == false) return false;
        DeleteDBSecurityGroupRequest other = (DeleteDBSecurityGroupRequest)obj;
        
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null) return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false) return false; 
        return true;
    }
    
}
    