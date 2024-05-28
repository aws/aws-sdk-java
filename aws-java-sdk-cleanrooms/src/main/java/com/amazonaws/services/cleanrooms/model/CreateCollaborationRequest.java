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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateCollaboration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCollaborationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of initial members, not including the creator. This list is immutable.
     * </p>
     */
    private java.util.List<MemberSpecification> members;
    /**
     * <p>
     * The display name for a collaboration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The abilities granted to the collaboration creator.
     * </p>
     */
    private java.util.List<String> creatorMemberAbilities;
    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     */
    private String creatorDisplayName;
    /**
     * <p>
     * The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
     * </p>
     */
    private DataEncryptionMetadata dataEncryptionMetadata;
    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     */
    private String queryLogStatus;
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
     * The collaboration creator's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer.
     * </p>
     */
    private PaymentConfiguration creatorPaymentConfiguration;

    /**
     * <p>
     * A list of initial members, not including the creator. This list is immutable.
     * </p>
     * 
     * @return A list of initial members, not including the creator. This list is immutable.
     */

    public java.util.List<MemberSpecification> getMembers() {
        return members;
    }

    /**
     * <p>
     * A list of initial members, not including the creator. This list is immutable.
     * </p>
     * 
     * @param members
     *        A list of initial members, not including the creator. This list is immutable.
     */

    public void setMembers(java.util.Collection<MemberSpecification> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<MemberSpecification>(members);
    }

    /**
     * <p>
     * A list of initial members, not including the creator. This list is immutable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        A list of initial members, not including the creator. This list is immutable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest withMembers(MemberSpecification... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<MemberSpecification>(members.length));
        }
        for (MemberSpecification ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of initial members, not including the creator. This list is immutable.
     * </p>
     * 
     * @param members
     *        A list of initial members, not including the creator. This list is immutable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest withMembers(java.util.Collection<MemberSpecification> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The display name for a collaboration.
     * </p>
     * 
     * @param name
     *        The display name for a collaboration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for a collaboration.
     * </p>
     * 
     * @return The display name for a collaboration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name for a collaboration.
     * </p>
     * 
     * @param name
     *        The display name for a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     * 
     * @param description
     *        A description of the collaboration provided by the collaboration owner.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     * 
     * @return A description of the collaboration provided by the collaboration owner.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the collaboration provided by the collaboration owner.
     * </p>
     * 
     * @param description
     *        A description of the collaboration provided by the collaboration owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration creator.
     * </p>
     * 
     * @return The abilities granted to the collaboration creator.
     * @see MemberAbility
     */

    public java.util.List<String> getCreatorMemberAbilities() {
        return creatorMemberAbilities;
    }

    /**
     * <p>
     * The abilities granted to the collaboration creator.
     * </p>
     * 
     * @param creatorMemberAbilities
     *        The abilities granted to the collaboration creator.
     * @see MemberAbility
     */

    public void setCreatorMemberAbilities(java.util.Collection<String> creatorMemberAbilities) {
        if (creatorMemberAbilities == null) {
            this.creatorMemberAbilities = null;
            return;
        }

        this.creatorMemberAbilities = new java.util.ArrayList<String>(creatorMemberAbilities);
    }

    /**
     * <p>
     * The abilities granted to the collaboration creator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreatorMemberAbilities(java.util.Collection)} or
     * {@link #withCreatorMemberAbilities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param creatorMemberAbilities
     *        The abilities granted to the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public CreateCollaborationRequest withCreatorMemberAbilities(String... creatorMemberAbilities) {
        if (this.creatorMemberAbilities == null) {
            setCreatorMemberAbilities(new java.util.ArrayList<String>(creatorMemberAbilities.length));
        }
        for (String ele : creatorMemberAbilities) {
            this.creatorMemberAbilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration creator.
     * </p>
     * 
     * @param creatorMemberAbilities
     *        The abilities granted to the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public CreateCollaborationRequest withCreatorMemberAbilities(java.util.Collection<String> creatorMemberAbilities) {
        setCreatorMemberAbilities(creatorMemberAbilities);
        return this;
    }

    /**
     * <p>
     * The abilities granted to the collaboration creator.
     * </p>
     * 
     * @param creatorMemberAbilities
     *        The abilities granted to the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAbility
     */

    public CreateCollaborationRequest withCreatorMemberAbilities(MemberAbility... creatorMemberAbilities) {
        java.util.ArrayList<String> creatorMemberAbilitiesCopy = new java.util.ArrayList<String>(creatorMemberAbilities.length);
        for (MemberAbility value : creatorMemberAbilities) {
            creatorMemberAbilitiesCopy.add(value.toString());
        }
        if (getCreatorMemberAbilities() == null) {
            setCreatorMemberAbilities(creatorMemberAbilitiesCopy);
        } else {
            getCreatorMemberAbilities().addAll(creatorMemberAbilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @param creatorDisplayName
     *        The display name of the collaboration creator.
     */

    public void setCreatorDisplayName(String creatorDisplayName) {
        this.creatorDisplayName = creatorDisplayName;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @return The display name of the collaboration creator.
     */

    public String getCreatorDisplayName() {
        return this.creatorDisplayName;
    }

    /**
     * <p>
     * The display name of the collaboration creator.
     * </p>
     * 
     * @param creatorDisplayName
     *        The display name of the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest withCreatorDisplayName(String creatorDisplayName) {
        setCreatorDisplayName(creatorDisplayName);
        return this;
    }

    /**
     * <p>
     * The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
     * </p>
     * 
     * @param dataEncryptionMetadata
     *        The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
     */

    public void setDataEncryptionMetadata(DataEncryptionMetadata dataEncryptionMetadata) {
        this.dataEncryptionMetadata = dataEncryptionMetadata;
    }

    /**
     * <p>
     * The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
     * </p>
     * 
     * @return The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
     */

    public DataEncryptionMetadata getDataEncryptionMetadata() {
        return this.dataEncryptionMetadata;
    }

    /**
     * <p>
     * The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
     * </p>
     * 
     * @param dataEncryptionMetadata
     *        The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest withDataEncryptionMetadata(DataEncryptionMetadata dataEncryptionMetadata) {
        setDataEncryptionMetadata(dataEncryptionMetadata);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @see CollaborationQueryLogStatus
     */

    public void setQueryLogStatus(String queryLogStatus) {
        this.queryLogStatus = queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @return An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @see CollaborationQueryLogStatus
     */

    public String getQueryLogStatus() {
        return this.queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollaborationQueryLogStatus
     */

    public CreateCollaborationRequest withQueryLogStatus(String queryLogStatus) {
        setQueryLogStatus(queryLogStatus);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollaborationQueryLogStatus
     */

    public CreateCollaborationRequest withQueryLogStatus(CollaborationQueryLogStatus queryLogStatus) {
        this.queryLogStatus = queryLogStatus.toString();
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

    public CreateCollaborationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCollaborationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest addTagsEntry(String key, String value) {
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

    public CreateCollaborationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The collaboration creator's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer.
     * </p>
     * 
     * @param creatorPaymentConfiguration
     *        The collaboration creator's payment responsibilities set by the collaboration creator. </p>
     *        <p>
     *        If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then
     *        the member who can query is the default payer.
     */

    public void setCreatorPaymentConfiguration(PaymentConfiguration creatorPaymentConfiguration) {
        this.creatorPaymentConfiguration = creatorPaymentConfiguration;
    }

    /**
     * <p>
     * The collaboration creator's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer.
     * </p>
     * 
     * @return The collaboration creator's payment responsibilities set by the collaboration creator. </p>
     *         <p>
     *         If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then
     *         the member who can query is the default payer.
     */

    public PaymentConfiguration getCreatorPaymentConfiguration() {
        return this.creatorPaymentConfiguration;
    }

    /**
     * <p>
     * The collaboration creator's payment responsibilities set by the collaboration creator.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer.
     * </p>
     * 
     * @param creatorPaymentConfiguration
     *        The collaboration creator's payment responsibilities set by the collaboration creator. </p>
     *        <p>
     *        If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then
     *        the member who can query is the default payer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollaborationRequest withCreatorPaymentConfiguration(PaymentConfiguration creatorPaymentConfiguration) {
        setCreatorPaymentConfiguration(creatorPaymentConfiguration);
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
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatorMemberAbilities() != null)
            sb.append("CreatorMemberAbilities: ").append(getCreatorMemberAbilities()).append(",");
        if (getCreatorDisplayName() != null)
            sb.append("CreatorDisplayName: ").append(getCreatorDisplayName()).append(",");
        if (getDataEncryptionMetadata() != null)
            sb.append("DataEncryptionMetadata: ").append(getDataEncryptionMetadata()).append(",");
        if (getQueryLogStatus() != null)
            sb.append("QueryLogStatus: ").append(getQueryLogStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatorPaymentConfiguration() != null)
            sb.append("CreatorPaymentConfiguration: ").append(getCreatorPaymentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCollaborationRequest == false)
            return false;
        CreateCollaborationRequest other = (CreateCollaborationRequest) obj;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatorMemberAbilities() == null ^ this.getCreatorMemberAbilities() == null)
            return false;
        if (other.getCreatorMemberAbilities() != null && other.getCreatorMemberAbilities().equals(this.getCreatorMemberAbilities()) == false)
            return false;
        if (other.getCreatorDisplayName() == null ^ this.getCreatorDisplayName() == null)
            return false;
        if (other.getCreatorDisplayName() != null && other.getCreatorDisplayName().equals(this.getCreatorDisplayName()) == false)
            return false;
        if (other.getDataEncryptionMetadata() == null ^ this.getDataEncryptionMetadata() == null)
            return false;
        if (other.getDataEncryptionMetadata() != null && other.getDataEncryptionMetadata().equals(this.getDataEncryptionMetadata()) == false)
            return false;
        if (other.getQueryLogStatus() == null ^ this.getQueryLogStatus() == null)
            return false;
        if (other.getQueryLogStatus() != null && other.getQueryLogStatus().equals(this.getQueryLogStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatorPaymentConfiguration() == null ^ this.getCreatorPaymentConfiguration() == null)
            return false;
        if (other.getCreatorPaymentConfiguration() != null && other.getCreatorPaymentConfiguration().equals(this.getCreatorPaymentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatorMemberAbilities() == null) ? 0 : getCreatorMemberAbilities().hashCode());
        hashCode = prime * hashCode + ((getCreatorDisplayName() == null) ? 0 : getCreatorDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDataEncryptionMetadata() == null) ? 0 : getDataEncryptionMetadata().hashCode());
        hashCode = prime * hashCode + ((getQueryLogStatus() == null) ? 0 : getQueryLogStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatorPaymentConfiguration() == null) ? 0 : getCreatorPaymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateCollaborationRequest clone() {
        return (CreateCollaborationRequest) super.clone();
    }

}
