/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Returns information about an override event for approval rules for a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ApprovalRuleOverriddenEventMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalRuleOverriddenEventMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The status of the override event.
     * </p>
     */
    private String overrideStatus;

    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the pull request when the override event occurred.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     * 
     * @return The revision ID of the pull request when the override event occurred.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the pull request when the override event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalRuleOverriddenEventMetadata withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * 
     * @param overrideStatus
     *        The status of the override event.
     * @see OverrideStatus
     */

    public void setOverrideStatus(String overrideStatus) {
        this.overrideStatus = overrideStatus;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * 
     * @return The status of the override event.
     * @see OverrideStatus
     */

    public String getOverrideStatus() {
        return this.overrideStatus;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * 
     * @param overrideStatus
     *        The status of the override event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverrideStatus
     */

    public ApprovalRuleOverriddenEventMetadata withOverrideStatus(String overrideStatus) {
        setOverrideStatus(overrideStatus);
        return this;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * 
     * @param overrideStatus
     *        The status of the override event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverrideStatus
     */

    public ApprovalRuleOverriddenEventMetadata withOverrideStatus(OverrideStatus overrideStatus) {
        this.overrideStatus = overrideStatus.toString();
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
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getOverrideStatus() != null)
            sb.append("OverrideStatus: ").append(getOverrideStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRuleOverriddenEventMetadata == false)
            return false;
        ApprovalRuleOverriddenEventMetadata other = (ApprovalRuleOverriddenEventMetadata) obj;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getOverrideStatus() == null ^ this.getOverrideStatus() == null)
            return false;
        if (other.getOverrideStatus() != null && other.getOverrideStatus().equals(this.getOverrideStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getOverrideStatus() == null) ? 0 : getOverrideStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApprovalRuleOverriddenEventMetadata clone() {
        try {
            return (ApprovalRuleOverriddenEventMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ApprovalRuleOverriddenEventMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
