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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes whether a WorkSpace image needs to be updated with the latest drivers and other components required by
 * Amazon WorkSpaces.
 * </p>
 * <note>
 * <p>
 * Only Windows 10 WorkSpace images can be programmatically updated at this time.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     * </p>
     */
    private Boolean updateAvailable;
    /**
     * <p>
     * A description of whether updates for the WorkSpace image are pending or available.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     * </p>
     * 
     * @param updateAvailable
     *        Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     */

    public void setUpdateAvailable(Boolean updateAvailable) {
        this.updateAvailable = updateAvailable;
    }

    /**
     * <p>
     * Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     * </p>
     * 
     * @return Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     */

    public Boolean getUpdateAvailable() {
        return this.updateAvailable;
    }

    /**
     * <p>
     * Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     * </p>
     * 
     * @param updateAvailable
     *        Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResult withUpdateAvailable(Boolean updateAvailable) {
        setUpdateAvailable(updateAvailable);
        return this;
    }

    /**
     * <p>
     * Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     * </p>
     * 
     * @return Indicates whether updated drivers or other components are available for the specified WorkSpace image.
     */

    public Boolean isUpdateAvailable() {
        return this.updateAvailable;
    }

    /**
     * <p>
     * A description of whether updates for the WorkSpace image are pending or available.
     * </p>
     * 
     * @param description
     *        A description of whether updates for the WorkSpace image are pending or available.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of whether updates for the WorkSpace image are pending or available.
     * </p>
     * 
     * @return A description of whether updates for the WorkSpace image are pending or available.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of whether updates for the WorkSpace image are pending or available.
     * </p>
     * 
     * @param description
     *        A description of whether updates for the WorkSpace image are pending or available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResult withDescription(String description) {
        setDescription(description);
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
        if (getUpdateAvailable() != null)
            sb.append("UpdateAvailable: ").append(getUpdateAvailable()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResult == false)
            return false;
        UpdateResult other = (UpdateResult) obj;
        if (other.getUpdateAvailable() == null ^ this.getUpdateAvailable() == null)
            return false;
        if (other.getUpdateAvailable() != null && other.getUpdateAvailable().equals(this.getUpdateAvailable()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateAvailable() == null) ? 0 : getUpdateAvailable().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResult clone() {
        try {
            return (UpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.UpdateResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
