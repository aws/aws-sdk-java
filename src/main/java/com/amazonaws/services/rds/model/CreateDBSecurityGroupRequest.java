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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest) CreateDBSecurityGroup operation}.
 * <p>
 * Creates a new DB security group. DB security groups control access to a DB instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBSecurityGroup(CreateDBSecurityGroupRequest)
 */
public class CreateDBSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name for the DB security group. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li> <li>May not contain spaces</li> </ul>
     * <p>Example: <code>mysecuritygroup</code>
     */
    private String dBSecurityGroupName;

    /**
     * The description for the DB security group.
     */
    private String dBSecurityGroupDescription;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

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
     * @param dBSecurityGroupName The name for the DB security group. This
     * value is stored as a lowercase string. <p>Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> <li>Must not be "Default"</li> <li>May not contain
     * spaces</li> </ul> <p>Example: <code>mysecuritygroup</code>
     * @param dBSecurityGroupDescription The description for the DB security
     * group.
     */
    public CreateDBSecurityGroupRequest(String dBSecurityGroupName, String dBSecurityGroupDescription) {
        setDBSecurityGroupName(dBSecurityGroupName);
        setDBSecurityGroupDescription(dBSecurityGroupDescription);
    }

    /**
     * The name for the DB security group. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li> <li>May not contain spaces</li> </ul>
     * <p>Example: <code>mysecuritygroup</code>
     *
     * @return The name for the DB security group. This value is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>Must not be "Default"</li> <li>May not contain spaces</li> </ul>
     *         <p>Example: <code>mysecuritygroup</code>
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name for the DB security group. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li> <li>May not contain spaces</li> </ul>
     * <p>Example: <code>mysecuritygroup</code>
     *
     * @param dBSecurityGroupName The name for the DB security group. This value is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>Must not be "Default"</li> <li>May not contain spaces</li> </ul>
     *         <p>Example: <code>mysecuritygroup</code>
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name for the DB security group. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li> <li>May not contain spaces</li> </ul>
     * <p>Example: <code>mysecuritygroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name for the DB security group. This value is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>Must not be "Default"</li> <li>May not contain spaces</li> </ul>
     *         <p>Example: <code>mysecuritygroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBSecurityGroupRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * The description for the DB security group.
     *
     * @return The description for the DB security group.
     */
    public String getDBSecurityGroupDescription() {
        return dBSecurityGroupDescription;
    }
    
    /**
     * The description for the DB security group.
     *
     * @param dBSecurityGroupDescription The description for the DB security group.
     */
    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }
    
    /**
     * The description for the DB security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupDescription The description for the DB security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBSecurityGroupRequest withDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
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
    public CreateDBSecurityGroupRequest withTags(Tag... tags) {
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
    public CreateDBSecurityGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBSecurityGroupName() != null) sb.append("DBSecurityGroupName: " + getDBSecurityGroupName() + ",");
        if (getDBSecurityGroupDescription() != null) sb.append("DBSecurityGroupDescription: " + getDBSecurityGroupDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
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
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    