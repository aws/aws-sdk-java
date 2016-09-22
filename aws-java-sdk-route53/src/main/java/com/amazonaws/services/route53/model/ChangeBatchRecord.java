/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that lists the changes and information for a ChangeBatch.
 * </p>
 */
@Deprecated
public class ChangeBatchRecord implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the request. Use this ID to track when the change has completed across all Amazon Route 53 DNS servers.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time the change was submitted, in the format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the
     * ISO 8601 standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time indicates that the time
     * is listed in Coordinated Universal Time (UTC).
     * </p>
     */
    private java.util.Date submittedAt;
    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * </p>
     */
    private String status;
    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed information
     * about the change.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The AWS account ID attached to the changes.
     * </p>
     */
    private String submitter;
    /**
     * <p>
     * A list of changes made in the ChangeBatch.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Change> changes;

    /**
     * <p>
     * The ID of the request. Use this ID to track when the change has completed across all Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param id
     *        The ID of the request. Use this ID to track when the change has completed across all Amazon Route 53 DNS
     *        servers.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the request. Use this ID to track when the change has completed across all Amazon Route 53 DNS servers.
     * </p>
     * 
     * @return The ID of the request. Use this ID to track when the change has completed across all Amazon Route 53 DNS
     *         servers.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the request. Use this ID to track when the change has completed across all Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param id
     *        The ID of the request. Use this ID to track when the change has completed across all Amazon Route 53 DNS
     *        servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeBatchRecord withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time the change was submitted, in the format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the
     * ISO 8601 standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time indicates that the time
     * is listed in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param submittedAt
     *        The date and time the change was submitted, in the format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified
     *        in the ISO 8601 standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time indicates
     *        that the time is listed in Coordinated Universal Time (UTC).
     */

    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    /**
     * <p>
     * The date and time the change was submitted, in the format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the
     * ISO 8601 standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time indicates that the time
     * is listed in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time the change was submitted, in the format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified
     *         in the ISO 8601 standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time indicates
     *         that the time is listed in Coordinated Universal Time (UTC).
     */

    public java.util.Date getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * <p>
     * The date and time the change was submitted, in the format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the
     * ISO 8601 standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time indicates that the time
     * is listed in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param submittedAt
     *        The date and time the change was submitted, in the format <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified
     *        in the ISO 8601 standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after the time indicates
     *        that the time is listed in Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeBatchRecord withSubmittedAt(java.util.Date submittedAt) {
        setSubmittedAt(submittedAt);
        return this;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * </p>
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.</p>
     *        <p>
     *        Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * @see ChangeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * </p>
     * 
     * @return The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *         applied to all Amazon Route 53 DNS servers.</p>
     *         <p>
     *         Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * @see ChangeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * </p>
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.</p>
     *        <p>
     *        Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public ChangeBatchRecord withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * </p>
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.</p>
     *        <p>
     *        Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * @see ChangeStatus
     */

    public void setStatus(ChangeStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * </p>
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.</p>
     *        <p>
     *        Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public ChangeBatchRecord withStatus(ChangeStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed information
     * about the change.
     * </p>
     * 
     * @param comment
     *        A complex type that describes change information about changes made to your hosted zone.</p>
     *        <p>
     *        This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed
     *        information about the change.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed information
     * about the change.
     * </p>
     * 
     * @return A complex type that describes change information about changes made to your hosted zone.</p>
     *         <p>
     *         This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed
     *         information about the change.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed information
     * about the change.
     * </p>
     * 
     * @param comment
     *        A complex type that describes change information about changes made to your hosted zone.</p>
     *        <p>
     *        This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed
     *        information about the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeBatchRecord withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The AWS account ID attached to the changes.
     * </p>
     * 
     * @param submitter
     *        The AWS account ID attached to the changes.
     */

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    /**
     * <p>
     * The AWS account ID attached to the changes.
     * </p>
     * 
     * @return The AWS account ID attached to the changes.
     */

    public String getSubmitter() {
        return this.submitter;
    }

    /**
     * <p>
     * The AWS account ID attached to the changes.
     * </p>
     * 
     * @param submitter
     *        The AWS account ID attached to the changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeBatchRecord withSubmitter(String submitter) {
        setSubmitter(submitter);
        return this;
    }

    /**
     * <p>
     * A list of changes made in the ChangeBatch.
     * </p>
     * 
     * @return A list of changes made in the ChangeBatch.
     */

    public java.util.List<Change> getChanges() {
        if (changes == null) {
            changes = new com.amazonaws.internal.SdkInternalList<Change>();
        }
        return changes;
    }

    /**
     * <p>
     * A list of changes made in the ChangeBatch.
     * </p>
     * 
     * @param changes
     *        A list of changes made in the ChangeBatch.
     */

    public void setChanges(java.util.Collection<Change> changes) {
        if (changes == null) {
            this.changes = null;
            return;
        }

        this.changes = new com.amazonaws.internal.SdkInternalList<Change>(changes);
    }

    /**
     * <p>
     * A list of changes made in the ChangeBatch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChanges(java.util.Collection)} or {@link #withChanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param changes
     *        A list of changes made in the ChangeBatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeBatchRecord withChanges(Change... changes) {
        if (this.changes == null) {
            setChanges(new com.amazonaws.internal.SdkInternalList<Change>(changes.length));
        }
        for (Change ele : changes) {
            this.changes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of changes made in the ChangeBatch.
     * </p>
     * 
     * @param changes
     *        A list of changes made in the ChangeBatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeBatchRecord withChanges(java.util.Collection<Change> changes) {
        setChanges(changes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getSubmittedAt() != null)
            sb.append("SubmittedAt: " + getSubmittedAt() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getSubmitter() != null)
            sb.append("Submitter: " + getSubmitter() + ",");
        if (getChanges() != null)
            sb.append("Changes: " + getChanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeBatchRecord == false)
            return false;
        ChangeBatchRecord other = (ChangeBatchRecord) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSubmittedAt() == null ^ this.getSubmittedAt() == null)
            return false;
        if (other.getSubmittedAt() != null && other.getSubmittedAt().equals(this.getSubmittedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getSubmitter() == null ^ this.getSubmitter() == null)
            return false;
        if (other.getSubmitter() != null && other.getSubmitter().equals(this.getSubmitter()) == false)
            return false;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSubmittedAt() == null) ? 0 : getSubmittedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getSubmitter() == null) ? 0 : getSubmitter().hashCode());
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        return hashCode;
    }

    @Override
    public ChangeBatchRecord clone() {
        try {
            return (ChangeBatchRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
