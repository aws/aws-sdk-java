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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a pull request event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PullRequestEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     */
    private java.util.Date eventDate;
    /**
     * <p>
     * The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update
     * event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * </p>
     */
    private String pullRequestEventType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     */
    private String actorArn;
    /**
     * <p>
     * Information about the source and destination branches for the pull request.
     * </p>
     */
    private PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata;
    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     */
    private PullRequestStatusChangedEventMetadata pullRequestStatusChangedEventMetadata;
    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     */
    private PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata;
    /**
     * <p>
     * Information about the change in mergability state for the pull request event.
     * </p>
     */
    private PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata;

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @return The system-generated ID of the pull request.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestEvent withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     * 
     * @param eventDate
     *        The day and time of the pull request event, in timestamp format.
     */

    public void setEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     * 
     * @return The day and time of the pull request event, in timestamp format.
     */

    public java.util.Date getEventDate() {
        return this.eventDate;
    }

    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     * 
     * @param eventDate
     *        The day and time of the pull request event, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestEvent withEventDate(java.util.Date eventDate) {
        setEventDate(eventDate);
        return this;
    }

    /**
     * <p>
     * The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update
     * event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * </p>
     * 
     * @param pullRequestEventType
     *        The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or
     *        update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * @see PullRequestEventType
     */

    public void setPullRequestEventType(String pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType;
    }

    /**
     * <p>
     * The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update
     * event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * </p>
     * 
     * @return The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or
     *         update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * @see PullRequestEventType
     */

    public String getPullRequestEventType() {
        return this.pullRequestEventType;
    }

    /**
     * <p>
     * The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update
     * event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * </p>
     * 
     * @param pullRequestEventType
     *        The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or
     *        update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestEventType
     */

    public PullRequestEvent withPullRequestEventType(String pullRequestEventType) {
        setPullRequestEventType(pullRequestEventType);
        return this;
    }

    /**
     * <p>
     * The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update
     * event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * </p>
     * 
     * @param pullRequestEventType
     *        The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or
     *        update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestEventType
     */

    public PullRequestEvent withPullRequestEventType(PullRequestEventType pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     * 
     * @param actorArn
     *        The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating
     *        the pull request with additional commits or changing the status of a pull request.
     */

    public void setActorArn(String actorArn) {
        this.actorArn = actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating
     *         the pull request with additional commits or changing the status of a pull request.
     */

    public String getActorArn() {
        return this.actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     * 
     * @param actorArn
     *        The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating
     *        the pull request with additional commits or changing the status of a pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestEvent withActorArn(String actorArn) {
        setActorArn(actorArn);
        return this;
    }

    /**
     * <p>
     * Information about the source and destination branches for the pull request.
     * </p>
     * 
     * @param pullRequestCreatedEventMetadata
     *        Information about the source and destination branches for the pull request.
     */

    public void setPullRequestCreatedEventMetadata(PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata) {
        this.pullRequestCreatedEventMetadata = pullRequestCreatedEventMetadata;
    }

    /**
     * <p>
     * Information about the source and destination branches for the pull request.
     * </p>
     * 
     * @return Information about the source and destination branches for the pull request.
     */

    public PullRequestCreatedEventMetadata getPullRequestCreatedEventMetadata() {
        return this.pullRequestCreatedEventMetadata;
    }

    /**
     * <p>
     * Information about the source and destination branches for the pull request.
     * </p>
     * 
     * @param pullRequestCreatedEventMetadata
     *        Information about the source and destination branches for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestEvent withPullRequestCreatedEventMetadata(PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata) {
        setPullRequestCreatedEventMetadata(pullRequestCreatedEventMetadata);
        return this;
    }

    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     * 
     * @param pullRequestStatusChangedEventMetadata
     *        Information about the change in status for the pull request event.
     */

    public void setPullRequestStatusChangedEventMetadata(PullRequestStatusChangedEventMetadata pullRequestStatusChangedEventMetadata) {
        this.pullRequestStatusChangedEventMetadata = pullRequestStatusChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     * 
     * @return Information about the change in status for the pull request event.
     */

    public PullRequestStatusChangedEventMetadata getPullRequestStatusChangedEventMetadata() {
        return this.pullRequestStatusChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     * 
     * @param pullRequestStatusChangedEventMetadata
     *        Information about the change in status for the pull request event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestEvent withPullRequestStatusChangedEventMetadata(PullRequestStatusChangedEventMetadata pullRequestStatusChangedEventMetadata) {
        setPullRequestStatusChangedEventMetadata(pullRequestStatusChangedEventMetadata);
        return this;
    }

    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     * 
     * @param pullRequestSourceReferenceUpdatedEventMetadata
     *        Information about the updated source branch for the pull request event.
     */

    public void setPullRequestSourceReferenceUpdatedEventMetadata(PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata) {
        this.pullRequestSourceReferenceUpdatedEventMetadata = pullRequestSourceReferenceUpdatedEventMetadata;
    }

    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     * 
     * @return Information about the updated source branch for the pull request event.
     */

    public PullRequestSourceReferenceUpdatedEventMetadata getPullRequestSourceReferenceUpdatedEventMetadata() {
        return this.pullRequestSourceReferenceUpdatedEventMetadata;
    }

    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     * 
     * @param pullRequestSourceReferenceUpdatedEventMetadata
     *        Information about the updated source branch for the pull request event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestEvent withPullRequestSourceReferenceUpdatedEventMetadata(
            PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata) {
        setPullRequestSourceReferenceUpdatedEventMetadata(pullRequestSourceReferenceUpdatedEventMetadata);
        return this;
    }

    /**
     * <p>
     * Information about the change in mergability state for the pull request event.
     * </p>
     * 
     * @param pullRequestMergedStateChangedEventMetadata
     *        Information about the change in mergability state for the pull request event.
     */

    public void setPullRequestMergedStateChangedEventMetadata(PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata) {
        this.pullRequestMergedStateChangedEventMetadata = pullRequestMergedStateChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in mergability state for the pull request event.
     * </p>
     * 
     * @return Information about the change in mergability state for the pull request event.
     */

    public PullRequestMergedStateChangedEventMetadata getPullRequestMergedStateChangedEventMetadata() {
        return this.pullRequestMergedStateChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in mergability state for the pull request event.
     * </p>
     * 
     * @param pullRequestMergedStateChangedEventMetadata
     *        Information about the change in mergability state for the pull request event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestEvent withPullRequestMergedStateChangedEventMetadata(PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata) {
        setPullRequestMergedStateChangedEventMetadata(pullRequestMergedStateChangedEventMetadata);
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getEventDate() != null)
            sb.append("EventDate: ").append(getEventDate()).append(",");
        if (getPullRequestEventType() != null)
            sb.append("PullRequestEventType: ").append(getPullRequestEventType()).append(",");
        if (getActorArn() != null)
            sb.append("ActorArn: ").append(getActorArn()).append(",");
        if (getPullRequestCreatedEventMetadata() != null)
            sb.append("PullRequestCreatedEventMetadata: ").append(getPullRequestCreatedEventMetadata()).append(",");
        if (getPullRequestStatusChangedEventMetadata() != null)
            sb.append("PullRequestStatusChangedEventMetadata: ").append(getPullRequestStatusChangedEventMetadata()).append(",");
        if (getPullRequestSourceReferenceUpdatedEventMetadata() != null)
            sb.append("PullRequestSourceReferenceUpdatedEventMetadata: ").append(getPullRequestSourceReferenceUpdatedEventMetadata()).append(",");
        if (getPullRequestMergedStateChangedEventMetadata() != null)
            sb.append("PullRequestMergedStateChangedEventMetadata: ").append(getPullRequestMergedStateChangedEventMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestEvent == false)
            return false;
        PullRequestEvent other = (PullRequestEvent) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getEventDate() == null ^ this.getEventDate() == null)
            return false;
        if (other.getEventDate() != null && other.getEventDate().equals(this.getEventDate()) == false)
            return false;
        if (other.getPullRequestEventType() == null ^ this.getPullRequestEventType() == null)
            return false;
        if (other.getPullRequestEventType() != null && other.getPullRequestEventType().equals(this.getPullRequestEventType()) == false)
            return false;
        if (other.getActorArn() == null ^ this.getActorArn() == null)
            return false;
        if (other.getActorArn() != null && other.getActorArn().equals(this.getActorArn()) == false)
            return false;
        if (other.getPullRequestCreatedEventMetadata() == null ^ this.getPullRequestCreatedEventMetadata() == null)
            return false;
        if (other.getPullRequestCreatedEventMetadata() != null
                && other.getPullRequestCreatedEventMetadata().equals(this.getPullRequestCreatedEventMetadata()) == false)
            return false;
        if (other.getPullRequestStatusChangedEventMetadata() == null ^ this.getPullRequestStatusChangedEventMetadata() == null)
            return false;
        if (other.getPullRequestStatusChangedEventMetadata() != null
                && other.getPullRequestStatusChangedEventMetadata().equals(this.getPullRequestStatusChangedEventMetadata()) == false)
            return false;
        if (other.getPullRequestSourceReferenceUpdatedEventMetadata() == null ^ this.getPullRequestSourceReferenceUpdatedEventMetadata() == null)
            return false;
        if (other.getPullRequestSourceReferenceUpdatedEventMetadata() != null
                && other.getPullRequestSourceReferenceUpdatedEventMetadata().equals(this.getPullRequestSourceReferenceUpdatedEventMetadata()) == false)
            return false;
        if (other.getPullRequestMergedStateChangedEventMetadata() == null ^ this.getPullRequestMergedStateChangedEventMetadata() == null)
            return false;
        if (other.getPullRequestMergedStateChangedEventMetadata() != null
                && other.getPullRequestMergedStateChangedEventMetadata().equals(this.getPullRequestMergedStateChangedEventMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getEventDate() == null) ? 0 : getEventDate().hashCode());
        hashCode = prime * hashCode + ((getPullRequestEventType() == null) ? 0 : getPullRequestEventType().hashCode());
        hashCode = prime * hashCode + ((getActorArn() == null) ? 0 : getActorArn().hashCode());
        hashCode = prime * hashCode + ((getPullRequestCreatedEventMetadata() == null) ? 0 : getPullRequestCreatedEventMetadata().hashCode());
        hashCode = prime * hashCode + ((getPullRequestStatusChangedEventMetadata() == null) ? 0 : getPullRequestStatusChangedEventMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestSourceReferenceUpdatedEventMetadata() == null) ? 0 : getPullRequestSourceReferenceUpdatedEventMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestMergedStateChangedEventMetadata() == null) ? 0 : getPullRequestMergedStateChangedEventMetadata().hashCode());
        return hashCode;
    }

    @Override
    public PullRequestEvent clone() {
        try {
            return (PullRequestEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PullRequestEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
