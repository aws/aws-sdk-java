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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredAudienceModelAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfiguredAudienceModelAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured audience model is associated
     * to the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A unique identifier for the configured audience model that you want to associate.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     */
    private String configuredAudienceModelAssociationName;
    /**
     * <p>
     * When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource being
     * associated is configured for Clean Rooms to manage permissions related to the given collaboration. When
     * <code>FALSE</code>, indicates that the configured audience model resource owner will manage permissions related
     * to the given collaboration.
     * </p>
     * <p>
     * Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the resource
     * policy for the <code>cleanrooms-ml</code> resource when you call the
     * <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration creator and
     * specify <code>TRUE</code>, you must have the same permissions when you call the <a>DeleteMember</a> and
     * <a>DeleteCollaboration</a> APIs.
     * </p>
     */
    private Boolean manageResourcePolicies;
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
     * A description of the configured audience model association.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured audience model is associated
     * to the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The configured audience model is
     *        associated to the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured audience model is associated
     * to the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @return A unique identifier for one of your memberships for a collaboration. The configured audience model is
     *         associated to the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The configured audience model is associated
     * to the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The configured audience model is
     *        associated to the collaboration that this membership belongs to. Accepts a membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelAssociationRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the configured audience model that you want to associate.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        A unique identifier for the configured audience model that you want to associate.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * A unique identifier for the configured audience model that you want to associate.
     * </p>
     * 
     * @return A unique identifier for the configured audience model that you want to associate.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * A unique identifier for the configured audience model that you want to associate.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        A unique identifier for the configured audience model that you want to associate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelAssociationRequest withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     * 
     * @param configuredAudienceModelAssociationName
     *        The name of the configured audience model association.
     */

    public void setConfiguredAudienceModelAssociationName(String configuredAudienceModelAssociationName) {
        this.configuredAudienceModelAssociationName = configuredAudienceModelAssociationName;
    }

    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     * 
     * @return The name of the configured audience model association.
     */

    public String getConfiguredAudienceModelAssociationName() {
        return this.configuredAudienceModelAssociationName;
    }

    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     * 
     * @param configuredAudienceModelAssociationName
     *        The name of the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelAssociationRequest withConfiguredAudienceModelAssociationName(String configuredAudienceModelAssociationName) {
        setConfiguredAudienceModelAssociationName(configuredAudienceModelAssociationName);
        return this;
    }

    /**
     * <p>
     * When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource being
     * associated is configured for Clean Rooms to manage permissions related to the given collaboration. When
     * <code>FALSE</code>, indicates that the configured audience model resource owner will manage permissions related
     * to the given collaboration.
     * </p>
     * <p>
     * Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the resource
     * policy for the <code>cleanrooms-ml</code> resource when you call the
     * <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration creator and
     * specify <code>TRUE</code>, you must have the same permissions when you call the <a>DeleteMember</a> and
     * <a>DeleteCollaboration</a> APIs.
     * </p>
     * 
     * @param manageResourcePolicies
     *        When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource
     *        being associated is configured for Clean Rooms to manage permissions related to the given collaboration.
     *        When <code>FALSE</code>, indicates that the configured audience model resource owner will manage
     *        permissions related to the given collaboration.</p>
     *        <p>
     *        Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the
     *        resource policy for the <code>cleanrooms-ml</code> resource when you call the
     *        <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration
     *        creator and specify <code>TRUE</code>, you must have the same permissions when you call the
     *        <a>DeleteMember</a> and <a>DeleteCollaboration</a> APIs.
     */

    public void setManageResourcePolicies(Boolean manageResourcePolicies) {
        this.manageResourcePolicies = manageResourcePolicies;
    }

    /**
     * <p>
     * When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource being
     * associated is configured for Clean Rooms to manage permissions related to the given collaboration. When
     * <code>FALSE</code>, indicates that the configured audience model resource owner will manage permissions related
     * to the given collaboration.
     * </p>
     * <p>
     * Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the resource
     * policy for the <code>cleanrooms-ml</code> resource when you call the
     * <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration creator and
     * specify <code>TRUE</code>, you must have the same permissions when you call the <a>DeleteMember</a> and
     * <a>DeleteCollaboration</a> APIs.
     * </p>
     * 
     * @return When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource
     *         being associated is configured for Clean Rooms to manage permissions related to the given collaboration.
     *         When <code>FALSE</code>, indicates that the configured audience model resource owner will manage
     *         permissions related to the given collaboration.</p>
     *         <p>
     *         Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the
     *         resource policy for the <code>cleanrooms-ml</code> resource when you call the
     *         <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration
     *         creator and specify <code>TRUE</code>, you must have the same permissions when you call the
     *         <a>DeleteMember</a> and <a>DeleteCollaboration</a> APIs.
     */

    public Boolean getManageResourcePolicies() {
        return this.manageResourcePolicies;
    }

    /**
     * <p>
     * When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource being
     * associated is configured for Clean Rooms to manage permissions related to the given collaboration. When
     * <code>FALSE</code>, indicates that the configured audience model resource owner will manage permissions related
     * to the given collaboration.
     * </p>
     * <p>
     * Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the resource
     * policy for the <code>cleanrooms-ml</code> resource when you call the
     * <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration creator and
     * specify <code>TRUE</code>, you must have the same permissions when you call the <a>DeleteMember</a> and
     * <a>DeleteCollaboration</a> APIs.
     * </p>
     * 
     * @param manageResourcePolicies
     *        When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource
     *        being associated is configured for Clean Rooms to manage permissions related to the given collaboration.
     *        When <code>FALSE</code>, indicates that the configured audience model resource owner will manage
     *        permissions related to the given collaboration.</p>
     *        <p>
     *        Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the
     *        resource policy for the <code>cleanrooms-ml</code> resource when you call the
     *        <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration
     *        creator and specify <code>TRUE</code>, you must have the same permissions when you call the
     *        <a>DeleteMember</a> and <a>DeleteCollaboration</a> APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelAssociationRequest withManageResourcePolicies(Boolean manageResourcePolicies) {
        setManageResourcePolicies(manageResourcePolicies);
        return this;
    }

    /**
     * <p>
     * When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource being
     * associated is configured for Clean Rooms to manage permissions related to the given collaboration. When
     * <code>FALSE</code>, indicates that the configured audience model resource owner will manage permissions related
     * to the given collaboration.
     * </p>
     * <p>
     * Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the resource
     * policy for the <code>cleanrooms-ml</code> resource when you call the
     * <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration creator and
     * specify <code>TRUE</code>, you must have the same permissions when you call the <a>DeleteMember</a> and
     * <a>DeleteCollaboration</a> APIs.
     * </p>
     * 
     * @return When <code>TRUE</code>, indicates that the resource policy for the configured audience model resource
     *         being associated is configured for Clean Rooms to manage permissions related to the given collaboration.
     *         When <code>FALSE</code>, indicates that the configured audience model resource owner will manage
     *         permissions related to the given collaboration.</p>
     *         <p>
     *         Setting this to <code>TRUE</code> requires you to have permissions to create, update, and delete the
     *         resource policy for the <code>cleanrooms-ml</code> resource when you call the
     *         <a>DeleteConfiguredAudienceModelAssociation</a> resource. In addition, if you are the collaboration
     *         creator and specify <code>TRUE</code>, you must have the same permissions when you call the
     *         <a>DeleteMember</a> and <a>DeleteCollaboration</a> APIs.
     */

    public Boolean isManageResourcePolicies() {
        return this.manageResourcePolicies;
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

    public CreateConfiguredAudienceModelAssociationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConfiguredAudienceModelAssociationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelAssociationRequest addTagsEntry(String key, String value) {
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

    public CreateConfiguredAudienceModelAssociationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A description of the configured audience model association.
     * </p>
     * 
     * @param description
     *        A description of the configured audience model association.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the configured audience model association.
     * </p>
     * 
     * @return A description of the configured audience model association.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the configured audience model association.
     * </p>
     * 
     * @param description
     *        A description of the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelAssociationRequest withDescription(String description) {
        setDescription(description);
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getConfiguredAudienceModelAssociationName() != null)
            sb.append("ConfiguredAudienceModelAssociationName: ").append(getConfiguredAudienceModelAssociationName()).append(",");
        if (getManageResourcePolicies() != null)
            sb.append("ManageResourcePolicies: ").append(getManageResourcePolicies()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfiguredAudienceModelAssociationRequest == false)
            return false;
        CreateConfiguredAudienceModelAssociationRequest other = (CreateConfiguredAudienceModelAssociationRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getConfiguredAudienceModelAssociationName() == null ^ this.getConfiguredAudienceModelAssociationName() == null)
            return false;
        if (other.getConfiguredAudienceModelAssociationName() != null
                && other.getConfiguredAudienceModelAssociationName().equals(this.getConfiguredAudienceModelAssociationName()) == false)
            return false;
        if (other.getManageResourcePolicies() == null ^ this.getManageResourcePolicies() == null)
            return false;
        if (other.getManageResourcePolicies() != null && other.getManageResourcePolicies().equals(this.getManageResourcePolicies()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelAssociationName() == null) ? 0 : getConfiguredAudienceModelAssociationName().hashCode());
        hashCode = prime * hashCode + ((getManageResourcePolicies() == null) ? 0 : getManageResourcePolicies().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfiguredAudienceModelAssociationRequest clone() {
        return (CreateConfiguredAudienceModelAssociationRequest) super.clone();
    }

}
