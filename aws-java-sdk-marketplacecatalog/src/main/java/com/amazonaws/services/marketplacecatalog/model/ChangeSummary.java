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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This object is a container for common summary information about the change. The summary doesn't contain the whole
 * change structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ChangeSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the change.
     * </p>
     */
    private String changeType;
    /**
     * <p>
     * The entity to be changed.
     * </p>
     */
    private Entity entity;
    /**
     * <p>
     * An array of <code>ErrorDetail</code> objects associated with the change.
     * </p>
     */
    private java.util.List<ErrorDetail> errorDetailList;

    /**
     * <p>
     * The type of the change.
     * </p>
     * 
     * @param changeType
     *        The type of the change.
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * The type of the change.
     * </p>
     * 
     * @return The type of the change.
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * The type of the change.
     * </p>
     * 
     * @param changeType
     *        The type of the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSummary withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     * 
     * @param entity
     *        The entity to be changed.
     */

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     * 
     * @return The entity to be changed.
     */

    public Entity getEntity() {
        return this.entity;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     * 
     * @param entity
     *        The entity to be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSummary withEntity(Entity entity) {
        setEntity(entity);
        return this;
    }

    /**
     * <p>
     * An array of <code>ErrorDetail</code> objects associated with the change.
     * </p>
     * 
     * @return An array of <code>ErrorDetail</code> objects associated with the change.
     */

    public java.util.List<ErrorDetail> getErrorDetailList() {
        return errorDetailList;
    }

    /**
     * <p>
     * An array of <code>ErrorDetail</code> objects associated with the change.
     * </p>
     * 
     * @param errorDetailList
     *        An array of <code>ErrorDetail</code> objects associated with the change.
     */

    public void setErrorDetailList(java.util.Collection<ErrorDetail> errorDetailList) {
        if (errorDetailList == null) {
            this.errorDetailList = null;
            return;
        }

        this.errorDetailList = new java.util.ArrayList<ErrorDetail>(errorDetailList);
    }

    /**
     * <p>
     * An array of <code>ErrorDetail</code> objects associated with the change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorDetailList(java.util.Collection)} or {@link #withErrorDetailList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param errorDetailList
     *        An array of <code>ErrorDetail</code> objects associated with the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSummary withErrorDetailList(ErrorDetail... errorDetailList) {
        if (this.errorDetailList == null) {
            setErrorDetailList(new java.util.ArrayList<ErrorDetail>(errorDetailList.length));
        }
        for (ErrorDetail ele : errorDetailList) {
            this.errorDetailList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ErrorDetail</code> objects associated with the change.
     * </p>
     * 
     * @param errorDetailList
     *        An array of <code>ErrorDetail</code> objects associated with the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSummary withErrorDetailList(java.util.Collection<ErrorDetail> errorDetailList) {
        setErrorDetailList(errorDetailList);
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
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType()).append(",");
        if (getEntity() != null)
            sb.append("Entity: ").append(getEntity()).append(",");
        if (getErrorDetailList() != null)
            sb.append("ErrorDetailList: ").append(getErrorDetailList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSummary == false)
            return false;
        ChangeSummary other = (ChangeSummary) obj;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        if (other.getEntity() == null ^ this.getEntity() == null)
            return false;
        if (other.getEntity() != null && other.getEntity().equals(this.getEntity()) == false)
            return false;
        if (other.getErrorDetailList() == null ^ this.getErrorDetailList() == null)
            return false;
        if (other.getErrorDetailList() != null && other.getErrorDetailList().equals(this.getErrorDetailList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getEntity() == null) ? 0 : getEntity().hashCode());
        hashCode = prime * hashCode + ((getErrorDetailList() == null) ? 0 : getErrorDetailList().hashCode());
        return hashCode;
    }

    @Override
    public ChangeSummary clone() {
        try {
            return (ChangeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.ChangeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
