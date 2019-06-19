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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that describes change information about changes made to your hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the change request was submitted in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     * 8601 format</a> and Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751 UTC.
     * </p>
     */
    private java.util.Date submittedAt;
    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a> action to get
     * detailed information about the change.
     * </p>
     */
    private String comment;

    /**
     * Default constructor for ChangeInfo object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public ChangeInfo() {
    }

    /**
     * Constructs a new ChangeInfo object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     *        The ID of the request.
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.
     * @param submittedAt
     *        The date and time that the change request was submitted in <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and Coordinated Universal Time (UTC).
     *        For example, the value <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751
     *        UTC.
     */
    public ChangeInfo(String id, String status, java.util.Date submittedAt) {
        setId(id);
        setStatus(status);
        setSubmittedAt(submittedAt);
    }

    /**
     * Constructs a new ChangeInfo object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     *        The ID of the request.
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.
     * @param submittedAt
     *        The date and time that the change request was submitted in <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and Coordinated Universal Time (UTC).
     *        For example, the value <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751
     *        UTC.
     */
    public ChangeInfo(String id, ChangeStatus status, java.util.Date submittedAt) {
        setId(id);
        setStatus(status.toString());
        setSubmittedAt(submittedAt);
    }

    /**
     * <p>
     * The ID of the request.
     * </p>
     * 
     * @param id
     *        The ID of the request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the request.
     * </p>
     * 
     * @return The ID of the request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the request.
     * </p>
     * 
     * @param id
     *        The ID of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.
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
     * 
     * @return The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *         applied to all Amazon Route 53 DNS servers.
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
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public ChangeInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.
     * @see ChangeStatus
     */

    public void setStatus(ChangeStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that this request has not yet been applied to
     * all Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param status
     *        The current state of the request. <code>PENDING</code> indicates that this request has not yet been
     *        applied to all Amazon Route 53 DNS servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public ChangeInfo withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the change request was submitted in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     * 8601 format</a> and Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751 UTC.
     * </p>
     * 
     * @param submittedAt
     *        The date and time that the change request was submitted in <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and Coordinated Universal Time (UTC).
     *        For example, the value <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751
     *        UTC.
     */

    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    /**
     * <p>
     * The date and time that the change request was submitted in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     * 8601 format</a> and Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751 UTC.
     * </p>
     * 
     * @return The date and time that the change request was submitted in <a
     *         href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and Coordinated Universal Time (UTC).
     *         For example, the value <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751
     *         UTC.
     */

    public java.util.Date getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * <p>
     * The date and time that the change request was submitted in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     * 8601 format</a> and Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751 UTC.
     * </p>
     * 
     * @param submittedAt
     *        The date and time that the change request was submitted in <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and Coordinated Universal Time (UTC).
     *        For example, the value <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at 17:48:16.751
     *        UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeInfo withSubmittedAt(java.util.Date submittedAt) {
        setSubmittedAt(submittedAt);
        return this;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a> action to get
     * detailed information about the change.
     * </p>
     * 
     * @param comment
     *        A complex type that describes change information about changes made to your hosted zone.</p>
     *        <p>
     *        This element contains an ID that you use when performing a <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a> action to
     *        get detailed information about the change.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a> action to get
     * detailed information about the change.
     * </p>
     * 
     * @return A complex type that describes change information about changes made to your hosted zone.</p>
     *         <p>
     *         This element contains an ID that you use when performing a <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a> action to
     *         get detailed information about the change.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a> action to get
     * detailed information about the change.
     * </p>
     * 
     * @param comment
     *        A complex type that describes change information about changes made to your hosted zone.</p>
     *        <p>
     *        This element contains an ID that you use when performing a <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a> action to
     *        get detailed information about the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeInfo withComment(String comment) {
        setComment(comment);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubmittedAt() != null)
            sb.append("SubmittedAt: ").append(getSubmittedAt()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeInfo == false)
            return false;
        ChangeInfo other = (ChangeInfo) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubmittedAt() == null ^ this.getSubmittedAt() == null)
            return false;
        if (other.getSubmittedAt() != null && other.getSubmittedAt().equals(this.getSubmittedAt()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubmittedAt() == null) ? 0 : getSubmittedAt().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public ChangeInfo clone() {
        try {
            return (ChangeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
