/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The record of a change within AWS Audit Manager, such as a modified assessment, a delegated control set, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ChangeLog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeLog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The changelog object type, such as an assessment, control, or control set.
     * </p>
     */
    private String objectType;
    /**
     * <p>
     * The name of the changelog object.
     * </p>
     */
    private String objectName;
    /**
     * <p>
     * The action performed.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The time of creation for the changelog object.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The IAM user or role that performed the action.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * The changelog object type, such as an assessment, control, or control set.
     * </p>
     * 
     * @param objectType
     *        The changelog object type, such as an assessment, control, or control set.
     * @see ObjectTypeEnum
     */

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * <p>
     * The changelog object type, such as an assessment, control, or control set.
     * </p>
     * 
     * @return The changelog object type, such as an assessment, control, or control set.
     * @see ObjectTypeEnum
     */

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * <p>
     * The changelog object type, such as an assessment, control, or control set.
     * </p>
     * 
     * @param objectType
     *        The changelog object type, such as an assessment, control, or control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectTypeEnum
     */

    public ChangeLog withObjectType(String objectType) {
        setObjectType(objectType);
        return this;
    }

    /**
     * <p>
     * The changelog object type, such as an assessment, control, or control set.
     * </p>
     * 
     * @param objectType
     *        The changelog object type, such as an assessment, control, or control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectTypeEnum
     */

    public ChangeLog withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the changelog object.
     * </p>
     * 
     * @param objectName
     *        The name of the changelog object.
     */

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * <p>
     * The name of the changelog object.
     * </p>
     * 
     * @return The name of the changelog object.
     */

    public String getObjectName() {
        return this.objectName;
    }

    /**
     * <p>
     * The name of the changelog object.
     * </p>
     * 
     * @param objectName
     *        The name of the changelog object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeLog withObjectName(String objectName) {
        setObjectName(objectName);
        return this;
    }

    /**
     * <p>
     * The action performed.
     * </p>
     * 
     * @param action
     *        The action performed.
     * @see ActionEnum
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action performed.
     * </p>
     * 
     * @return The action performed.
     * @see ActionEnum
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action performed.
     * </p>
     * 
     * @param action
     *        The action performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionEnum
     */

    public ChangeLog withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action performed.
     * </p>
     * 
     * @param action
     *        The action performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionEnum
     */

    public ChangeLog withAction(ActionEnum action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The time of creation for the changelog object.
     * </p>
     * 
     * @param createdAt
     *        The time of creation for the changelog object.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time of creation for the changelog object.
     * </p>
     * 
     * @return The time of creation for the changelog object.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time of creation for the changelog object.
     * </p>
     * 
     * @param createdAt
     *        The time of creation for the changelog object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeLog withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The IAM user or role that performed the action.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that performed the action.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The IAM user or role that performed the action.
     * </p>
     * 
     * @return The IAM user or role that performed the action.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The IAM user or role that performed the action.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeLog withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
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
        if (getObjectType() != null)
            sb.append("ObjectType: ").append(getObjectType()).append(",");
        if (getObjectName() != null)
            sb.append("ObjectName: ").append(getObjectName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeLog == false)
            return false;
        ChangeLog other = (ChangeLog) obj;
        if (other.getObjectType() == null ^ this.getObjectType() == null)
            return false;
        if (other.getObjectType() != null && other.getObjectType().equals(this.getObjectType()) == false)
            return false;
        if (other.getObjectName() == null ^ this.getObjectName() == null)
            return false;
        if (other.getObjectName() != null && other.getObjectName().equals(this.getObjectName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        hashCode = prime * hashCode + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public ChangeLog clone() {
        try {
            return (ChangeLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ChangeLogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
