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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBParameterGroup(CreateDBParameterGroupRequest) CreateDBParameterGroup operation}.
 * <p>
 * Creates a new DB parameter group.
 * </p>
 * <p>
 * A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for
 * any of the parameters, you must modify the group after creating it using <i>ModifyDBParameterGroup</i> . Once you've created a DB parameter group, you
 * need to associate it with your DB instance using <i>ModifyDBInstance</i> . When you associate a new DB parameter group with a running DB instance, you
 * need to reboot the DB Instance for the new DB parameter group and associated settings to take effect.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBParameterGroup(CreateDBParameterGroupRequest)
 */
public class CreateDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the DB parameter group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     */
    private String dBParameterGroupName;

    /**
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     */
    private String dBParameterGroupFamily;

    /**
     * The description for the DB parameter group.
     */
    private String description;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

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
     * @param dBParameterGroupName The name of the DB parameter group. <p>
     * Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <note>This value is
     * stored as a lower-case string.</note>
     * @param dBParameterGroupFamily The DB parameter group family name. A DB
     * parameter group can be associated with one and only one DB parameter
     * group family, and can be applied only to a DB instance running a
     * database engine and engine version compatible with that DB parameter
     * group family.
     * @param description The description for the DB parameter group.
     */
    public CreateDBParameterGroupRequest(String dBParameterGroupName, String dBParameterGroupFamily, String description) {
        setDBParameterGroupName(dBParameterGroupName);
        setDBParameterGroupFamily(dBParameterGroupFamily);
        setDescription(description);
    }

    /**
     * The name of the DB parameter group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     *
     * @return The name of the DB parameter group. <p> Constraints: <ul> <li>Must be
     *         1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     *
     * @param dBParameterGroupName The name of the DB parameter group. <p> Constraints: <ul> <li>Must be
     *         1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group. <p> Constraints: <ul> <li>Must be
     * 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB parameter group. <p> Constraints: <ul> <li>Must be
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
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     *
     * @return The DB parameter group family name. A DB parameter group can be
     *         associated with one and only one DB parameter group family, and can be
     *         applied only to a DB instance running a database engine and engine
     *         version compatible with that DB parameter group family.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     *
     * @param dBParameterGroupFamily The DB parameter group family name. A DB parameter group can be
     *         associated with one and only one DB parameter group family, and can be
     *         applied only to a DB instance running a database engine and engine
     *         version compatible with that DB parameter group family.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The DB parameter group family name. A DB parameter group can be
     * associated with one and only one DB parameter group family, and can be
     * applied only to a DB instance running a database engine and engine
     * version compatible with that DB parameter group family.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The DB parameter group family name. A DB parameter group can be
     *         associated with one and only one DB parameter group family, and can be
     *         applied only to a DB instance running a database engine and engine
     *         version compatible with that DB parameter group family.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBParameterGroupRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * The description for the DB parameter group.
     *
     * @return The description for the DB parameter group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the DB parameter group.
     *
     * @param description The description for the DB parameter group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the DB parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the DB parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBParameterGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBParameterGroupRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (getDBParameterGroupName() != null) sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getDBParameterGroupFamily() != null) sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
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
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    