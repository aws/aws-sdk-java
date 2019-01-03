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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Chef configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ChefConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChefConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to enable Berkshelf.
     * </p>
     */
    private Boolean manageBerkshelf;
    /**
     * <p>
     * The Berkshelf version.
     * </p>
     */
    private String berkshelfVersion;

    /**
     * <p>
     * Whether to enable Berkshelf.
     * </p>
     * 
     * @param manageBerkshelf
     *        Whether to enable Berkshelf.
     */

    public void setManageBerkshelf(Boolean manageBerkshelf) {
        this.manageBerkshelf = manageBerkshelf;
    }

    /**
     * <p>
     * Whether to enable Berkshelf.
     * </p>
     * 
     * @return Whether to enable Berkshelf.
     */

    public Boolean getManageBerkshelf() {
        return this.manageBerkshelf;
    }

    /**
     * <p>
     * Whether to enable Berkshelf.
     * </p>
     * 
     * @param manageBerkshelf
     *        Whether to enable Berkshelf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChefConfiguration withManageBerkshelf(Boolean manageBerkshelf) {
        setManageBerkshelf(manageBerkshelf);
        return this;
    }

    /**
     * <p>
     * Whether to enable Berkshelf.
     * </p>
     * 
     * @return Whether to enable Berkshelf.
     */

    public Boolean isManageBerkshelf() {
        return this.manageBerkshelf;
    }

    /**
     * <p>
     * The Berkshelf version.
     * </p>
     * 
     * @param berkshelfVersion
     *        The Berkshelf version.
     */

    public void setBerkshelfVersion(String berkshelfVersion) {
        this.berkshelfVersion = berkshelfVersion;
    }

    /**
     * <p>
     * The Berkshelf version.
     * </p>
     * 
     * @return The Berkshelf version.
     */

    public String getBerkshelfVersion() {
        return this.berkshelfVersion;
    }

    /**
     * <p>
     * The Berkshelf version.
     * </p>
     * 
     * @param berkshelfVersion
     *        The Berkshelf version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChefConfiguration withBerkshelfVersion(String berkshelfVersion) {
        setBerkshelfVersion(berkshelfVersion);
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
        if (getManageBerkshelf() != null)
            sb.append("ManageBerkshelf: ").append(getManageBerkshelf()).append(",");
        if (getBerkshelfVersion() != null)
            sb.append("BerkshelfVersion: ").append(getBerkshelfVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChefConfiguration == false)
            return false;
        ChefConfiguration other = (ChefConfiguration) obj;
        if (other.getManageBerkshelf() == null ^ this.getManageBerkshelf() == null)
            return false;
        if (other.getManageBerkshelf() != null && other.getManageBerkshelf().equals(this.getManageBerkshelf()) == false)
            return false;
        if (other.getBerkshelfVersion() == null ^ this.getBerkshelfVersion() == null)
            return false;
        if (other.getBerkshelfVersion() != null && other.getBerkshelfVersion().equals(this.getBerkshelfVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManageBerkshelf() == null) ? 0 : getManageBerkshelf().hashCode());
        hashCode = prime * hashCode + ((getBerkshelfVersion() == null) ? 0 : getBerkshelfVersion().hashCode());
        return hashCode;
    }

    @Override
    public ChefConfiguration clone() {
        try {
            return (ChefConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.ChefConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
