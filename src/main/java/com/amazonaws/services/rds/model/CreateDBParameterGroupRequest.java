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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBParameterGroup(CreateDBParameterGroupRequest) CreateDBParameterGroup operation}.
 * <p>
 * Creates a new DB Parameter Group.
 * </p>
 * <p>
 * A DB Parameter Group is initially created with the default parameters
 * for the database engine used by the DB Instance. To provide custom
 * values for any of the parameters, you must modify the group after
 * creating it using <i>ModifyDBParameterGroup</i> . Once you've created
 * a DB Parameter Group, you need to associate it with your DB Instance
 * using <i>ModifyDBInstance</i> . When you associate a new DB Parameter
 * Group with a running DB Instance, you need to reboot the DB Instance
 * for the new DB Parameter Group and associated settings to take effect.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBParameterGroup(CreateDBParameterGroupRequest)
 */
public class CreateDBParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Parameter Group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     */
    private String dBParameterGroupName;

    /**
     * The DB Parameter Group Family name. A DB Parameter Group can be
     * associated with one and only one DB Parameter Group Family, and can be
     * applied only to a DB Instance running a database engine and engine
     * version compatible with that DB Parameter Group Family.
     */
    private String dBParameterGroupFamily;

    /**
     * The description for the DB Parameter Group.
     */
    private String description;

    /**
     * Default constructor for a new CreateDBParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBParameterGroupRequest() {}
    
    /**
     * Constructs a new CreateDBParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBParameterGroupName The name of the DB Parameter Group. <p>
     * Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <note>This value is
     * stored as a lower-case string.</note>
     * @param dBParameterGroupFamily The DB Parameter Group Family name. A DB
     * Parameter Group can be associated with one and only one DB Parameter
     * Group Family, and can be applied only to a DB Instance running a
     * database engine and engine version compatible with that DB Parameter
     * Group Family.
     * @param description The description for the DB Parameter Group.
     */
    public CreateDBParameterGroupRequest(String dBParameterGroupName, String dBParameterGroupFamily, String description) {
        this.dBParameterGroupName = dBParameterGroupName;
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        this.description = description;
    }

    
    
    /**
     * The name of the DB Parameter Group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     *
     * @return The name of the DB Parameter Group. <p> Constraints: <ul> <li>Must be
     *         1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     *
     * @param dBParameterGroupName The name of the DB Parameter Group. <p> Constraints: <ul> <li>Must be
     *         1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group. <p> Constraints: <ul> <li>Must be
     *         1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * The DB Parameter Group Family name. A DB Parameter Group can be
     * associated with one and only one DB Parameter Group Family, and can be
     * applied only to a DB Instance running a database engine and engine
     * version compatible with that DB Parameter Group Family.
     *
     * @return The DB Parameter Group Family name. A DB Parameter Group can be
     *         associated with one and only one DB Parameter Group Family, and can be
     *         applied only to a DB Instance running a database engine and engine
     *         version compatible with that DB Parameter Group Family.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * The DB Parameter Group Family name. A DB Parameter Group can be
     * associated with one and only one DB Parameter Group Family, and can be
     * applied only to a DB Instance running a database engine and engine
     * version compatible with that DB Parameter Group Family.
     *
     * @param dBParameterGroupFamily The DB Parameter Group Family name. A DB Parameter Group can be
     *         associated with one and only one DB Parameter Group Family, and can be
     *         applied only to a DB Instance running a database engine and engine
     *         version compatible with that DB Parameter Group Family.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The DB Parameter Group Family name. A DB Parameter Group can be
     * associated with one and only one DB Parameter Group Family, and can be
     * applied only to a DB Instance running a database engine and engine
     * version compatible with that DB Parameter Group Family.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The DB Parameter Group Family name. A DB Parameter Group can be
     *         associated with one and only one DB Parameter Group Family, and can be
     *         applied only to a DB Instance running a database engine and engine
     *         version compatible with that DB Parameter Group Family.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBParameterGroupRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }
    
    
    /**
     * The description for the DB Parameter Group.
     *
     * @return The description for the DB Parameter Group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the DB Parameter Group.
     *
     * @param description The description for the DB Parameter Group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the DB Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the DB Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBParameterGroupRequest withDescription(String description) {
        this.description = description;
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
        if (dBParameterGroupName != null) sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        if (dBParameterGroupFamily != null) sb.append("DBParameterGroupFamily: " + dBParameterGroupFamily + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateDBParameterGroupRequest == false) return false;
        CreateDBParameterGroupRequest other = (CreateDBParameterGroupRequest)obj;
        
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null) return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false) return false; 
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null) return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    