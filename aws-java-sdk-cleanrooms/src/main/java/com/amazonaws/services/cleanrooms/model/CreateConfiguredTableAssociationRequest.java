/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfiguredTableAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configured table association. This name is used to query the underlying configured table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the configured table association.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured table is associated to the
     * collaboration that this membership belongs to. Currently accepts a membership ID.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A unique identifier for the configured table to be associated to. Currently accepts a configured table ID.
     * </p>
     */
    private String configuredTableIdentifier;
    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the configured table association. This name is used to query the underlying configured table.
     * </p>
     * 
     * @param name
     *        The name of the configured table association. This name is used to query the underlying configured table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured table association. This name is used to query the underlying configured table.
     * </p>
     * 
     * @return The name of the configured table association. This name is used to query the underlying configured table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured table association. This name is used to query the underlying configured table.
     * </p>
     * 
     * @param name
     *        The name of the configured table association. This name is used to query the underlying configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the configured table association.
     * </p>
     * 
     * @param description
     *        A description for the configured table association.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the configured table association.
     * </p>
     * 
     * @return A description for the configured table association.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the configured table association.
     * </p>
     * 
     * @param description
     *        A description for the configured table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured table is associated to the
     * collaboration that this membership belongs to. Currently accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The configured table is associated to
     *        the collaboration that this membership belongs to. Currently accepts a membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured table is associated to the
     * collaboration that this membership belongs to. Currently accepts a membership ID.
     * </p>
     * 
     * @return A unique identifier for one of your memberships for a collaboration. The configured table is associated
     *         to the collaboration that this membership belongs to. Currently accepts a membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured table is associated to the
     * collaboration that this membership belongs to. Currently accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The configured table is associated to
     *        the collaboration that this membership belongs to. Currently accepts a membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the configured table to be associated to. Currently accepts a configured table ID.
     * </p>
     * 
     * @param configuredTableIdentifier
     *        A unique identifier for the configured table to be associated to. Currently accepts a configured table ID.
     */

    public void setConfiguredTableIdentifier(String configuredTableIdentifier) {
        this.configuredTableIdentifier = configuredTableIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the configured table to be associated to. Currently accepts a configured table ID.
     * </p>
     * 
     * @return A unique identifier for the configured table to be associated to. Currently accepts a configured table
     *         ID.
     */

    public String getConfiguredTableIdentifier() {
        return this.configuredTableIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the configured table to be associated to. Currently accepts a configured table ID.
     * </p>
     * 
     * @param configuredTableIdentifier
     *        A unique identifier for the configured table to be associated to. Currently accepts a configured table ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest withConfiguredTableIdentifier(String configuredTableIdentifier) {
        setConfiguredTableIdentifier(configuredTableIdentifier);
        return this;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @param roleArn
     *        The service will assume this role to access catalog metadata and query the table.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @return The service will assume this role to access catalog metadata and query the table.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @param roleArn
     *        The service will assume this role to access catalog metadata and query the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @return An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *         optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *         in IAM policies to control access to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConfiguredTableAssociationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getConfiguredTableIdentifier() != null)
            sb.append("ConfiguredTableIdentifier: ").append(getConfiguredTableIdentifier()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfiguredTableAssociationRequest == false)
            return false;
        CreateConfiguredTableAssociationRequest other = (CreateConfiguredTableAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getConfiguredTableIdentifier() == null ^ this.getConfiguredTableIdentifier() == null)
            return false;
        if (other.getConfiguredTableIdentifier() != null && other.getConfiguredTableIdentifier().equals(this.getConfiguredTableIdentifier()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getConfiguredTableIdentifier() == null) ? 0 : getConfiguredTableIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfiguredTableAssociationRequest clone() {
        return (CreateConfiguredTableAssociationRequest) super.clone();
    }

}
