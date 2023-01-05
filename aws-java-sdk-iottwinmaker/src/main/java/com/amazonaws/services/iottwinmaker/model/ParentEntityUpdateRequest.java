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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parent entity update request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ParentEntityUpdateRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParentEntityUpdateRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the update.
     * </p>
     */
    private String updateType;
    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     */
    private String parentEntityId;

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @param updateType
     *        The type of the update.
     * @see ParentEntityUpdateType
     */

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @return The type of the update.
     * @see ParentEntityUpdateType
     */

    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @param updateType
     *        The type of the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParentEntityUpdateType
     */

    public ParentEntityUpdateRequest withUpdateType(String updateType) {
        setUpdateType(updateType);
        return this;
    }

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @param updateType
     *        The type of the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParentEntityUpdateType
     */

    public ParentEntityUpdateRequest withUpdateType(ParentEntityUpdateType updateType) {
        this.updateType = updateType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the parent entity.
     */

    public void setParentEntityId(String parentEntityId) {
        this.parentEntityId = parentEntityId;
    }

    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     * 
     * @return The ID of the parent entity.
     */

    public String getParentEntityId() {
        return this.parentEntityId;
    }

    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the parent entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentEntityUpdateRequest withParentEntityId(String parentEntityId) {
        setParentEntityId(parentEntityId);
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
        if (getUpdateType() != null)
            sb.append("UpdateType: ").append(getUpdateType()).append(",");
        if (getParentEntityId() != null)
            sb.append("ParentEntityId: ").append(getParentEntityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParentEntityUpdateRequest == false)
            return false;
        ParentEntityUpdateRequest other = (ParentEntityUpdateRequest) obj;
        if (other.getUpdateType() == null ^ this.getUpdateType() == null)
            return false;
        if (other.getUpdateType() != null && other.getUpdateType().equals(this.getUpdateType()) == false)
            return false;
        if (other.getParentEntityId() == null ^ this.getParentEntityId() == null)
            return false;
        if (other.getParentEntityId() != null && other.getParentEntityId().equals(this.getParentEntityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateType() == null) ? 0 : getUpdateType().hashCode());
        hashCode = prime * hashCode + ((getParentEntityId() == null) ? 0 : getParentEntityId().hashCode());
        return hashCode;
    }

    @Override
    public ParentEntityUpdateRequest clone() {
        try {
            return (ParentEntityUpdateRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ParentEntityUpdateRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
