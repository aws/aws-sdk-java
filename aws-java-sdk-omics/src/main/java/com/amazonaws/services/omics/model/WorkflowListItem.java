/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/WorkflowListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the workflow was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The workflow's digest.
     * </p>
     */
    private String digest;
    /**
     * <p>
     * The workflow's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The workflow's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The workflow's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The workflow's type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     * 
     * @param arn
     *        The workflow's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     * 
     * @return The workflow's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The workflow's ARN.
     * </p>
     * 
     * @param arn
     *        The workflow's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowListItem withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the workflow was created.
     * </p>
     * 
     * @param creationTime
     *        When the workflow was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the workflow was created.
     * </p>
     * 
     * @return When the workflow was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the workflow was created.
     * </p>
     * 
     * @param creationTime
     *        When the workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowListItem withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The workflow's digest.
     * </p>
     * 
     * @param digest
     *        The workflow's digest.
     */

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The workflow's digest.
     * </p>
     * 
     * @return The workflow's digest.
     */

    public String getDigest() {
        return this.digest;
    }

    /**
     * <p>
     * The workflow's digest.
     * </p>
     * 
     * @param digest
     *        The workflow's digest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowListItem withDigest(String digest) {
        setDigest(digest);
        return this;
    }

    /**
     * <p>
     * The workflow's ID.
     * </p>
     * 
     * @param id
     *        The workflow's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The workflow's ID.
     * </p>
     * 
     * @return The workflow's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The workflow's ID.
     * </p>
     * 
     * @param id
     *        The workflow's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowListItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The workflow's name.
     * </p>
     * 
     * @param name
     *        The workflow's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The workflow's name.
     * </p>
     * 
     * @return The workflow's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The workflow's name.
     * </p>
     * 
     * @param name
     *        The workflow's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowListItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @param status
     *        The workflow's status.
     * @see WorkflowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @return The workflow's status.
     * @see WorkflowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @param status
     *        The workflow's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStatus
     */

    public WorkflowListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The workflow's status.
     * </p>
     * 
     * @param status
     *        The workflow's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStatus
     */

    public WorkflowListItem withStatus(WorkflowStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @param type
     *        The workflow's type.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @return The workflow's type.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @param type
     *        The workflow's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowListItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The workflow's type.
     * </p>
     * 
     * @param type
     *        The workflow's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowListItem withType(WorkflowType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDigest() != null)
            sb.append("Digest: ").append(getDigest()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowListItem == false)
            return false;
        WorkflowListItem other = (WorkflowListItem) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowListItem clone() {
        try {
            return (WorkflowListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.WorkflowListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
