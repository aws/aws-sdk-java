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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an add-on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AddonInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the add-on.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The type of the add-on.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An object that represents information about available add-on versions and compatible Kubernetes versions.
     * </p>
     */
    private java.util.List<AddonVersionInfo> addonVersions;

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @return The name of the add-on.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInfo withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The type of the add-on.
     * </p>
     * 
     * @param type
     *        The type of the add-on.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the add-on.
     * </p>
     * 
     * @return The type of the add-on.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the add-on.
     * </p>
     * 
     * @param type
     *        The type of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * An object that represents information about available add-on versions and compatible Kubernetes versions.
     * </p>
     * 
     * @return An object that represents information about available add-on versions and compatible Kubernetes versions.
     */

    public java.util.List<AddonVersionInfo> getAddonVersions() {
        return addonVersions;
    }

    /**
     * <p>
     * An object that represents information about available add-on versions and compatible Kubernetes versions.
     * </p>
     * 
     * @param addonVersions
     *        An object that represents information about available add-on versions and compatible Kubernetes versions.
     */

    public void setAddonVersions(java.util.Collection<AddonVersionInfo> addonVersions) {
        if (addonVersions == null) {
            this.addonVersions = null;
            return;
        }

        this.addonVersions = new java.util.ArrayList<AddonVersionInfo>(addonVersions);
    }

    /**
     * <p>
     * An object that represents information about available add-on versions and compatible Kubernetes versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddonVersions(java.util.Collection)} or {@link #withAddonVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param addonVersions
     *        An object that represents information about available add-on versions and compatible Kubernetes versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInfo withAddonVersions(AddonVersionInfo... addonVersions) {
        if (this.addonVersions == null) {
            setAddonVersions(new java.util.ArrayList<AddonVersionInfo>(addonVersions.length));
        }
        for (AddonVersionInfo ele : addonVersions) {
            this.addonVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents information about available add-on versions and compatible Kubernetes versions.
     * </p>
     * 
     * @param addonVersions
     *        An object that represents information about available add-on versions and compatible Kubernetes versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonInfo withAddonVersions(java.util.Collection<AddonVersionInfo> addonVersions) {
        setAddonVersions(addonVersions);
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
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAddonVersions() != null)
            sb.append("AddonVersions: ").append(getAddonVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonInfo == false)
            return false;
        AddonInfo other = (AddonInfo) obj;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAddonVersions() == null ^ this.getAddonVersions() == null)
            return false;
        if (other.getAddonVersions() != null && other.getAddonVersions().equals(this.getAddonVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAddonVersions() == null) ? 0 : getAddonVersions().hashCode());
        return hashCode;
    }

    @Override
    public AddonInfo clone() {
        try {
            return (AddonInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AddonInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
