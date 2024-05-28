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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents the background work that RAM performs when you invoke the
 * <a>ReplacePermissionAssociations</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ReplacePermissionAssociationsWork"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplacePermissionAssociationsWork implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the background task associated with one <a>ReplacePermissionAssociations</a> request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the managed permission that this background task is replacing.
     * </p>
     */
    private String fromPermissionArn;
    /**
     * <p>
     * The version of the managed permission that this background task is replacing.
     * </p>
     */
    private String fromPermissionVersion;
    /**
     * <p>
     * The ARN of the managed permission that this background task is associating with the resource shares in place of
     * the managed permission and version specified in <code>fromPermissionArn</code> and
     * <code>fromPermissionVersion</code>.
     * </p>
     */
    private String toPermissionArn;
    /**
     * <p>
     * The version of the managed permission that this background task is associating with the resource shares. This is
     * always the version that is currently the default for this managed permission.
     * </p>
     */
    private String toPermissionVersion;
    /**
     * <p>
     * Specifies the current status of the background tasks for the specified ID. The output is one of the following
     * strings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Specifies the reason for a <code>FAILED</code> status. This field is present only when there <code>status</code>
     * is <code>FAILED</code>.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The date and time when this asynchronous background task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time when the status of this background task was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The unique identifier for the background task associated with one <a>ReplacePermissionAssociations</a> request.
     * </p>
     * 
     * @param id
     *        The unique identifier for the background task associated with one <a>ReplacePermissionAssociations</a>
     *        request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the background task associated with one <a>ReplacePermissionAssociations</a> request.
     * </p>
     * 
     * @return The unique identifier for the background task associated with one <a>ReplacePermissionAssociations</a>
     *         request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the background task associated with one <a>ReplacePermissionAssociations</a> request.
     * </p>
     * 
     * @param id
     *        The unique identifier for the background task associated with one <a>ReplacePermissionAssociations</a>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the managed permission that this background task is replacing.
     * </p>
     * 
     * @param fromPermissionArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the managed permission that this background task is replacing.
     */

    public void setFromPermissionArn(String fromPermissionArn) {
        this.fromPermissionArn = fromPermissionArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the managed permission that this background task is replacing.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of the managed permission that this background task is replacing.
     */

    public String getFromPermissionArn() {
        return this.fromPermissionArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the managed permission that this background task is replacing.
     * </p>
     * 
     * @param fromPermissionArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the managed permission that this background task is replacing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withFromPermissionArn(String fromPermissionArn) {
        setFromPermissionArn(fromPermissionArn);
        return this;
    }

    /**
     * <p>
     * The version of the managed permission that this background task is replacing.
     * </p>
     * 
     * @param fromPermissionVersion
     *        The version of the managed permission that this background task is replacing.
     */

    public void setFromPermissionVersion(String fromPermissionVersion) {
        this.fromPermissionVersion = fromPermissionVersion;
    }

    /**
     * <p>
     * The version of the managed permission that this background task is replacing.
     * </p>
     * 
     * @return The version of the managed permission that this background task is replacing.
     */

    public String getFromPermissionVersion() {
        return this.fromPermissionVersion;
    }

    /**
     * <p>
     * The version of the managed permission that this background task is replacing.
     * </p>
     * 
     * @param fromPermissionVersion
     *        The version of the managed permission that this background task is replacing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withFromPermissionVersion(String fromPermissionVersion) {
        setFromPermissionVersion(fromPermissionVersion);
        return this;
    }

    /**
     * <p>
     * The ARN of the managed permission that this background task is associating with the resource shares in place of
     * the managed permission and version specified in <code>fromPermissionArn</code> and
     * <code>fromPermissionVersion</code>.
     * </p>
     * 
     * @param toPermissionArn
     *        The ARN of the managed permission that this background task is associating with the resource shares in
     *        place of the managed permission and version specified in <code>fromPermissionArn</code> and
     *        <code>fromPermissionVersion</code>.
     */

    public void setToPermissionArn(String toPermissionArn) {
        this.toPermissionArn = toPermissionArn;
    }

    /**
     * <p>
     * The ARN of the managed permission that this background task is associating with the resource shares in place of
     * the managed permission and version specified in <code>fromPermissionArn</code> and
     * <code>fromPermissionVersion</code>.
     * </p>
     * 
     * @return The ARN of the managed permission that this background task is associating with the resource shares in
     *         place of the managed permission and version specified in <code>fromPermissionArn</code> and
     *         <code>fromPermissionVersion</code>.
     */

    public String getToPermissionArn() {
        return this.toPermissionArn;
    }

    /**
     * <p>
     * The ARN of the managed permission that this background task is associating with the resource shares in place of
     * the managed permission and version specified in <code>fromPermissionArn</code> and
     * <code>fromPermissionVersion</code>.
     * </p>
     * 
     * @param toPermissionArn
     *        The ARN of the managed permission that this background task is associating with the resource shares in
     *        place of the managed permission and version specified in <code>fromPermissionArn</code> and
     *        <code>fromPermissionVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withToPermissionArn(String toPermissionArn) {
        setToPermissionArn(toPermissionArn);
        return this;
    }

    /**
     * <p>
     * The version of the managed permission that this background task is associating with the resource shares. This is
     * always the version that is currently the default for this managed permission.
     * </p>
     * 
     * @param toPermissionVersion
     *        The version of the managed permission that this background task is associating with the resource shares.
     *        This is always the version that is currently the default for this managed permission.
     */

    public void setToPermissionVersion(String toPermissionVersion) {
        this.toPermissionVersion = toPermissionVersion;
    }

    /**
     * <p>
     * The version of the managed permission that this background task is associating with the resource shares. This is
     * always the version that is currently the default for this managed permission.
     * </p>
     * 
     * @return The version of the managed permission that this background task is associating with the resource shares.
     *         This is always the version that is currently the default for this managed permission.
     */

    public String getToPermissionVersion() {
        return this.toPermissionVersion;
    }

    /**
     * <p>
     * The version of the managed permission that this background task is associating with the resource shares. This is
     * always the version that is currently the default for this managed permission.
     * </p>
     * 
     * @param toPermissionVersion
     *        The version of the managed permission that this background task is associating with the resource shares.
     *        This is always the version that is currently the default for this managed permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withToPermissionVersion(String toPermissionVersion) {
        setToPermissionVersion(toPermissionVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the background tasks for the specified ID. The output is one of the following
     * strings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Specifies the current status of the background tasks for the specified ID. The output is one of the
     *        following strings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current status of the background tasks for the specified ID. The output is one of the following
     * strings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the current status of the background tasks for the specified ID. The output is one of the
     *         following strings:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>
     *         </p>
     *         </li>
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the current status of the background tasks for the specified ID. The output is one of the following
     * strings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Specifies the current status of the background tasks for the specified ID. The output is one of the
     *        following strings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public ReplacePermissionAssociationsWork withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the background tasks for the specified ID. The output is one of the following
     * strings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Specifies the current status of the background tasks for the specified ID. The output is one of the
     *        following strings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public ReplacePermissionAssociationsWork withStatus(ReplacePermissionAssociationsWorkStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the reason for a <code>FAILED</code> status. This field is present only when there <code>status</code>
     * is <code>FAILED</code>.
     * </p>
     * 
     * @param statusMessage
     *        Specifies the reason for a <code>FAILED</code> status. This field is present only when there
     *        <code>status</code> is <code>FAILED</code>.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Specifies the reason for a <code>FAILED</code> status. This field is present only when there <code>status</code>
     * is <code>FAILED</code>.
     * </p>
     * 
     * @return Specifies the reason for a <code>FAILED</code> status. This field is present only when there
     *         <code>status</code> is <code>FAILED</code>.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Specifies the reason for a <code>FAILED</code> status. This field is present only when there <code>status</code>
     * is <code>FAILED</code>.
     * </p>
     * 
     * @param statusMessage
     *        Specifies the reason for a <code>FAILED</code> status. This field is present only when there
     *        <code>status</code> is <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The date and time when this asynchronous background task was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when this asynchronous background task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time when this asynchronous background task was created.
     * </p>
     * 
     * @return The date and time when this asynchronous background task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time when this asynchronous background task was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when this asynchronous background task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the status of this background task was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the status of this background task was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the status of this background task was last updated.
     * </p>
     * 
     * @return The date and time when the status of this background task was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the status of this background task was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the status of this background task was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsWork withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getFromPermissionArn() != null)
            sb.append("FromPermissionArn: ").append(getFromPermissionArn()).append(",");
        if (getFromPermissionVersion() != null)
            sb.append("FromPermissionVersion: ").append(getFromPermissionVersion()).append(",");
        if (getToPermissionArn() != null)
            sb.append("ToPermissionArn: ").append(getToPermissionArn()).append(",");
        if (getToPermissionVersion() != null)
            sb.append("ToPermissionVersion: ").append(getToPermissionVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplacePermissionAssociationsWork == false)
            return false;
        ReplacePermissionAssociationsWork other = (ReplacePermissionAssociationsWork) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFromPermissionArn() == null ^ this.getFromPermissionArn() == null)
            return false;
        if (other.getFromPermissionArn() != null && other.getFromPermissionArn().equals(this.getFromPermissionArn()) == false)
            return false;
        if (other.getFromPermissionVersion() == null ^ this.getFromPermissionVersion() == null)
            return false;
        if (other.getFromPermissionVersion() != null && other.getFromPermissionVersion().equals(this.getFromPermissionVersion()) == false)
            return false;
        if (other.getToPermissionArn() == null ^ this.getToPermissionArn() == null)
            return false;
        if (other.getToPermissionArn() != null && other.getToPermissionArn().equals(this.getToPermissionArn()) == false)
            return false;
        if (other.getToPermissionVersion() == null ^ this.getToPermissionVersion() == null)
            return false;
        if (other.getToPermissionVersion() != null && other.getToPermissionVersion().equals(this.getToPermissionVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFromPermissionArn() == null) ? 0 : getFromPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getFromPermissionVersion() == null) ? 0 : getFromPermissionVersion().hashCode());
        hashCode = prime * hashCode + ((getToPermissionArn() == null) ? 0 : getToPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getToPermissionVersion() == null) ? 0 : getToPermissionVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ReplacePermissionAssociationsWork clone() {
        try {
            return (ReplacePermissionAssociationsWork) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.ReplacePermissionAssociationsWorkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
