/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the activity information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/Activity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Activity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The activity type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp when the action was performed.
     * </p>
     */
    private java.util.Date timeStamp;
    /**
     * <p>
     * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     * performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the
     * subfolders and documents within the parent folder (the indirect activity).
     * </p>
     */
    private Boolean isIndirectActivity;
    /**
     * <p>
     * The ID of the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The user who performed the action.
     * </p>
     */
    private UserMetadata initiator;
    /**
     * <p>
     * The list of users or groups impacted by this action. This is an optional field and is filled for the following
     * sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
     * </p>
     */
    private Participants participants;
    /**
     * <p>
     * The metadata of the resource involved in the user action.
     * </p>
     */
    private ResourceMetadata resourceMetadata;
    /**
     * <p>
     * The original parent of the resource. This is an optional field and is filled for move activities.
     * </p>
     */
    private ResourceMetadata originalParent;
    /**
     * <p>
     * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
     * </p>
     */
    private CommentMetadata commentMetadata;

    /**
     * <p>
     * The activity type.
     * </p>
     * 
     * @param type
     *        The activity type.
     * @see ActivityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The activity type.
     * </p>
     * 
     * @return The activity type.
     * @see ActivityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The activity type.
     * </p>
     * 
     * @param type
     *        The activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityType
     */

    public Activity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The activity type.
     * </p>
     * 
     * @param type
     *        The activity type.
     * @see ActivityType
     */

    public void setType(ActivityType type) {
        withType(type);
    }

    /**
     * <p>
     * The activity type.
     * </p>
     * 
     * @param type
     *        The activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityType
     */

    public Activity withType(ActivityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the action was performed.
     * </p>
     * 
     * @param timeStamp
     *        The timestamp when the action was performed.
     */

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * <p>
     * The timestamp when the action was performed.
     * </p>
     * 
     * @return The timestamp when the action was performed.
     */

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * <p>
     * The timestamp when the action was performed.
     * </p>
     * 
     * @param timeStamp
     *        The timestamp when the action was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withTimeStamp(java.util.Date timeStamp) {
        setTimeStamp(timeStamp);
        return this;
    }

    /**
     * <p>
     * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     * performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the
     * subfolders and documents within the parent folder (the indirect activity).
     * </p>
     * 
     * @param isIndirectActivity
     *        Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     *        performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of
     *        the subfolders and documents within the parent folder (the indirect activity).
     */

    public void setIsIndirectActivity(Boolean isIndirectActivity) {
        this.isIndirectActivity = isIndirectActivity;
    }

    /**
     * <p>
     * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     * performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the
     * subfolders and documents within the parent folder (the indirect activity).
     * </p>
     * 
     * @return Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     *         performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of
     *         the subfolders and documents within the parent folder (the indirect activity).
     */

    public Boolean getIsIndirectActivity() {
        return this.isIndirectActivity;
    }

    /**
     * <p>
     * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     * performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the
     * subfolders and documents within the parent folder (the indirect activity).
     * </p>
     * 
     * @param isIndirectActivity
     *        Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     *        performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of
     *        the subfolders and documents within the parent folder (the indirect activity).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withIsIndirectActivity(Boolean isIndirectActivity) {
        setIsIndirectActivity(isIndirectActivity);
        return this;
    }

    /**
     * <p>
     * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     * performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the
     * subfolders and documents within the parent folder (the indirect activity).
     * </p>
     * 
     * @return Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity
     *         performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of
     *         the subfolders and documents within the parent folder (the indirect activity).
     */

    public Boolean isIndirectActivity() {
        return this.isIndirectActivity;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @return The ID of the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The user who performed the action.
     * </p>
     * 
     * @param initiator
     *        The user who performed the action.
     */

    public void setInitiator(UserMetadata initiator) {
        this.initiator = initiator;
    }

    /**
     * <p>
     * The user who performed the action.
     * </p>
     * 
     * @return The user who performed the action.
     */

    public UserMetadata getInitiator() {
        return this.initiator;
    }

    /**
     * <p>
     * The user who performed the action.
     * </p>
     * 
     * @param initiator
     *        The user who performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withInitiator(UserMetadata initiator) {
        setInitiator(initiator);
        return this;
    }

    /**
     * <p>
     * The list of users or groups impacted by this action. This is an optional field and is filled for the following
     * sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
     * </p>
     * 
     * @param participants
     *        The list of users or groups impacted by this action. This is an optional field and is filled for the
     *        following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED,
     *        FOLDER_UNSHARED.
     */

    public void setParticipants(Participants participants) {
        this.participants = participants;
    }

    /**
     * <p>
     * The list of users or groups impacted by this action. This is an optional field and is filled for the following
     * sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
     * </p>
     * 
     * @return The list of users or groups impacted by this action. This is an optional field and is filled for the
     *         following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED,
     *         FOLDER_UNSHARED.
     */

    public Participants getParticipants() {
        return this.participants;
    }

    /**
     * <p>
     * The list of users or groups impacted by this action. This is an optional field and is filled for the following
     * sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
     * </p>
     * 
     * @param participants
     *        The list of users or groups impacted by this action. This is an optional field and is filled for the
     *        following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED,
     *        FOLDER_UNSHARED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withParticipants(Participants participants) {
        setParticipants(participants);
        return this;
    }

    /**
     * <p>
     * The metadata of the resource involved in the user action.
     * </p>
     * 
     * @param resourceMetadata
     *        The metadata of the resource involved in the user action.
     */

    public void setResourceMetadata(ResourceMetadata resourceMetadata) {
        this.resourceMetadata = resourceMetadata;
    }

    /**
     * <p>
     * The metadata of the resource involved in the user action.
     * </p>
     * 
     * @return The metadata of the resource involved in the user action.
     */

    public ResourceMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }

    /**
     * <p>
     * The metadata of the resource involved in the user action.
     * </p>
     * 
     * @param resourceMetadata
     *        The metadata of the resource involved in the user action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withResourceMetadata(ResourceMetadata resourceMetadata) {
        setResourceMetadata(resourceMetadata);
        return this;
    }

    /**
     * <p>
     * The original parent of the resource. This is an optional field and is filled for move activities.
     * </p>
     * 
     * @param originalParent
     *        The original parent of the resource. This is an optional field and is filled for move activities.
     */

    public void setOriginalParent(ResourceMetadata originalParent) {
        this.originalParent = originalParent;
    }

    /**
     * <p>
     * The original parent of the resource. This is an optional field and is filled for move activities.
     * </p>
     * 
     * @return The original parent of the resource. This is an optional field and is filled for move activities.
     */

    public ResourceMetadata getOriginalParent() {
        return this.originalParent;
    }

    /**
     * <p>
     * The original parent of the resource. This is an optional field and is filled for move activities.
     * </p>
     * 
     * @param originalParent
     *        The original parent of the resource. This is an optional field and is filled for move activities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withOriginalParent(ResourceMetadata originalParent) {
        setOriginalParent(originalParent);
        return this;
    }

    /**
     * <p>
     * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
     * </p>
     * 
     * @param commentMetadata
     *        Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
     */

    public void setCommentMetadata(CommentMetadata commentMetadata) {
        this.commentMetadata = commentMetadata;
    }

    /**
     * <p>
     * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
     * </p>
     * 
     * @return Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
     */

    public CommentMetadata getCommentMetadata() {
        return this.commentMetadata;
    }

    /**
     * <p>
     * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
     * </p>
     * 
     * @param commentMetadata
     *        Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withCommentMetadata(CommentMetadata commentMetadata) {
        setCommentMetadata(commentMetadata);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTimeStamp() != null)
            sb.append("TimeStamp: ").append(getTimeStamp()).append(",");
        if (getIsIndirectActivity() != null)
            sb.append("IsIndirectActivity: ").append(getIsIndirectActivity()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getInitiator() != null)
            sb.append("Initiator: ").append(getInitiator()).append(",");
        if (getParticipants() != null)
            sb.append("Participants: ").append(getParticipants()).append(",");
        if (getResourceMetadata() != null)
            sb.append("ResourceMetadata: ").append(getResourceMetadata()).append(",");
        if (getOriginalParent() != null)
            sb.append("OriginalParent: ").append(getOriginalParent()).append(",");
        if (getCommentMetadata() != null)
            sb.append("CommentMetadata: ").append(getCommentMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Activity == false)
            return false;
        Activity other = (Activity) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTimeStamp() == null ^ this.getTimeStamp() == null)
            return false;
        if (other.getTimeStamp() != null && other.getTimeStamp().equals(this.getTimeStamp()) == false)
            return false;
        if (other.getIsIndirectActivity() == null ^ this.getIsIndirectActivity() == null)
            return false;
        if (other.getIsIndirectActivity() != null && other.getIsIndirectActivity().equals(this.getIsIndirectActivity()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getInitiator() == null ^ this.getInitiator() == null)
            return false;
        if (other.getInitiator() != null && other.getInitiator().equals(this.getInitiator()) == false)
            return false;
        if (other.getParticipants() == null ^ this.getParticipants() == null)
            return false;
        if (other.getParticipants() != null && other.getParticipants().equals(this.getParticipants()) == false)
            return false;
        if (other.getResourceMetadata() == null ^ this.getResourceMetadata() == null)
            return false;
        if (other.getResourceMetadata() != null && other.getResourceMetadata().equals(this.getResourceMetadata()) == false)
            return false;
        if (other.getOriginalParent() == null ^ this.getOriginalParent() == null)
            return false;
        if (other.getOriginalParent() != null && other.getOriginalParent().equals(this.getOriginalParent()) == false)
            return false;
        if (other.getCommentMetadata() == null ^ this.getCommentMetadata() == null)
            return false;
        if (other.getCommentMetadata() != null && other.getCommentMetadata().equals(this.getCommentMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTimeStamp() == null) ? 0 : getTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getIsIndirectActivity() == null) ? 0 : getIsIndirectActivity().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getInitiator() == null) ? 0 : getInitiator().hashCode());
        hashCode = prime * hashCode + ((getParticipants() == null) ? 0 : getParticipants().hashCode());
        hashCode = prime * hashCode + ((getResourceMetadata() == null) ? 0 : getResourceMetadata().hashCode());
        hashCode = prime * hashCode + ((getOriginalParent() == null) ? 0 : getOriginalParent().hashCode());
        hashCode = prime * hashCode + ((getCommentMetadata() == null) ? 0 : getCommentMetadata().hashCode());
        return hashCode;
    }

    @Override
    public Activity clone() {
        try {
            return (Activity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.ActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
