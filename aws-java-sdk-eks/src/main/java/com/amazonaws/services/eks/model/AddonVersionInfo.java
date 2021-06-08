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
 * Information about an add-on version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AddonVersionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonVersionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the add-on.
     * </p>
     */
    private String addonVersion;
    /**
     * <p>
     * The architectures that the version supports.
     * </p>
     */
    private java.util.List<String> architecture;
    /**
     * <p>
     * An object that represents the compatibilities of a version.
     * </p>
     */
    private java.util.List<Compatibility> compatibilities;

    /**
     * <p>
     * The version of the add-on.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on.
     */

    public void setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
    }

    /**
     * <p>
     * The version of the add-on.
     * </p>
     * 
     * @return The version of the add-on.
     */

    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * <p>
     * The version of the add-on.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonVersionInfo withAddonVersion(String addonVersion) {
        setAddonVersion(addonVersion);
        return this;
    }

    /**
     * <p>
     * The architectures that the version supports.
     * </p>
     * 
     * @return The architectures that the version supports.
     */

    public java.util.List<String> getArchitecture() {
        return architecture;
    }

    /**
     * <p>
     * The architectures that the version supports.
     * </p>
     * 
     * @param architecture
     *        The architectures that the version supports.
     */

    public void setArchitecture(java.util.Collection<String> architecture) {
        if (architecture == null) {
            this.architecture = null;
            return;
        }

        this.architecture = new java.util.ArrayList<String>(architecture);
    }

    /**
     * <p>
     * The architectures that the version supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchitecture(java.util.Collection)} or {@link #withArchitecture(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param architecture
     *        The architectures that the version supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonVersionInfo withArchitecture(String... architecture) {
        if (this.architecture == null) {
            setArchitecture(new java.util.ArrayList<String>(architecture.length));
        }
        for (String ele : architecture) {
            this.architecture.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The architectures that the version supports.
     * </p>
     * 
     * @param architecture
     *        The architectures that the version supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonVersionInfo withArchitecture(java.util.Collection<String> architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * An object that represents the compatibilities of a version.
     * </p>
     * 
     * @return An object that represents the compatibilities of a version.
     */

    public java.util.List<Compatibility> getCompatibilities() {
        return compatibilities;
    }

    /**
     * <p>
     * An object that represents the compatibilities of a version.
     * </p>
     * 
     * @param compatibilities
     *        An object that represents the compatibilities of a version.
     */

    public void setCompatibilities(java.util.Collection<Compatibility> compatibilities) {
        if (compatibilities == null) {
            this.compatibilities = null;
            return;
        }

        this.compatibilities = new java.util.ArrayList<Compatibility>(compatibilities);
    }

    /**
     * <p>
     * An object that represents the compatibilities of a version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibilities(java.util.Collection)} or {@link #withCompatibilities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param compatibilities
     *        An object that represents the compatibilities of a version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonVersionInfo withCompatibilities(Compatibility... compatibilities) {
        if (this.compatibilities == null) {
            setCompatibilities(new java.util.ArrayList<Compatibility>(compatibilities.length));
        }
        for (Compatibility ele : compatibilities) {
            this.compatibilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents the compatibilities of a version.
     * </p>
     * 
     * @param compatibilities
     *        An object that represents the compatibilities of a version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonVersionInfo withCompatibilities(java.util.Collection<Compatibility> compatibilities) {
        setCompatibilities(compatibilities);
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
        if (getAddonVersion() != null)
            sb.append("AddonVersion: ").append(getAddonVersion()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getCompatibilities() != null)
            sb.append("Compatibilities: ").append(getCompatibilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonVersionInfo == false)
            return false;
        AddonVersionInfo other = (AddonVersionInfo) obj;
        if (other.getAddonVersion() == null ^ this.getAddonVersion() == null)
            return false;
        if (other.getAddonVersion() != null && other.getAddonVersion().equals(this.getAddonVersion()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getCompatibilities() == null ^ this.getCompatibilities() == null)
            return false;
        if (other.getCompatibilities() != null && other.getCompatibilities().equals(this.getCompatibilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddonVersion() == null) ? 0 : getAddonVersion().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getCompatibilities() == null) ? 0 : getCompatibilities().hashCode());
        return hashCode;
    }

    @Override
    public AddonVersionInfo clone() {
        try {
            return (AddonVersionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AddonVersionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
