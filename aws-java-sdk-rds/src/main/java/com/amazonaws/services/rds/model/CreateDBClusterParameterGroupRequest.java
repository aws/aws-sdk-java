/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest) CreateDBClusterParameterGroup operation}.
 * <p>
 * Creates a new DB cluster parameter group.
 * </p>
 * <p>
 * Parameters in a DB cluster parameter group apply to all of the
 * instances in a DB cluster.
 * </p>
 * <p>
 * A DB cluster parameter group is initially created with the default
 * parameters for the database engine used by instances in the DB
 * cluster. To provide custom values for any of the parameters, you must
 * modify the group after creating it using
 * ModifyDBClusterParameterGroup. Once you've created a DB cluster
 * parameter group, you need to associate it with your DB cluster using
 * ModifyDBCluster. When you associate a new DB cluster parameter group
 * with a running DB cluster, you need to reboot the DB instances in the
 * DB cluster without failover for the new DB cluster parameter group and
 * associated settings to take effect.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> After you create a DB cluster parameter group, you
 * should wait at least 5 minutes before creating your first DB cluster
 * that uses that DB cluster parameter group as the default parameter
 * group. This allows Amazon RDS to fully complete the create action
 * before the DB cluster parameter group is used as the default for a new
 * DB cluster. This is especially important for parameters that are
 * critical when creating the default database for a DB cluster, such as
 * the character set for the default database defined by the
 * character_set_database parameter. You can use the Parameter Groups
 * option of the Amazon RDS console or the DescribeDBClusterParameters
 * command to verify that your DB cluster parameter group has been
 * created or modified.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest)
 */
public class CreateDBClusterParameterGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     */
    private String dBClusterParameterGroupName;

    /**
     * The DB cluster parameter group family name. A DB cluster parameter
     * group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a
     * database engine and engine version compatible with that DB cluster
     * parameter group family.
     */
    private String dBParameterGroupFamily;

    /**
     * The description for the DB cluster parameter group.
     */
    private String description;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     *
     * @return The name of the DB cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <note>This value is stored as a
     *         lowercase string.</note>
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <note>This value is stored as a
     *         lowercase string.</note>
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <note>This value is stored as a
     * lowercase string.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <note>This value is stored as a
     *         lowercase string.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterParameterGroupRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * The DB cluster parameter group family name. A DB cluster parameter
     * group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a
     * database engine and engine version compatible with that DB cluster
     * parameter group family.
     *
     * @return The DB cluster parameter group family name. A DB cluster parameter
     *         group can be associated with one and only one DB cluster parameter
     *         group family, and can be applied only to a DB cluster running a
     *         database engine and engine version compatible with that DB cluster
     *         parameter group family.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * The DB cluster parameter group family name. A DB cluster parameter
     * group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a
     * database engine and engine version compatible with that DB cluster
     * parameter group family.
     *
     * @param dBParameterGroupFamily The DB cluster parameter group family name. A DB cluster parameter
     *         group can be associated with one and only one DB cluster parameter
     *         group family, and can be applied only to a DB cluster running a
     *         database engine and engine version compatible with that DB cluster
     *         parameter group family.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The DB cluster parameter group family name. A DB cluster parameter
     * group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a
     * database engine and engine version compatible with that DB cluster
     * parameter group family.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The DB cluster parameter group family name. A DB cluster parameter
     *         group can be associated with one and only one DB cluster parameter
     *         group family, and can be applied only to a DB cluster running a
     *         database engine and engine version compatible with that DB cluster
     *         parameter group family.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterParameterGroupRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * The description for the DB cluster parameter group.
     *
     * @return The description for the DB cluster parameter group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the DB cluster parameter group.
     *
     * @param description The description for the DB cluster parameter group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the DB cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the DB cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterParameterGroupRequest withDescription(String description) {
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
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterParameterGroupRequest withTags(Tag... tags) {
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
    public CreateDBClusterParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBClusterParameterGroupName() != null) sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
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
        
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDBClusterParameterGroupRequest == false) return false;
        CreateDBClusterParameterGroupRequest other = (CreateDBClusterParameterGroupRequest)obj;
        
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null) return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false) return false; 
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null) return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateDBClusterParameterGroupRequest clone() {
        
            return (CreateDBClusterParameterGroupRequest) super.clone();
    }

}
    