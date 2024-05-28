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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the installed EKS add-on (GuardDuty security agent).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AddonDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Version of the installed EKS add-on.
     * </p>
     */
    private String addonVersion;
    /**
     * <p>
     * Status of the installed EKS add-on.
     * </p>
     */
    private String addonStatus;

    /**
     * <p>
     * Version of the installed EKS add-on.
     * </p>
     * 
     * @param addonVersion
     *        Version of the installed EKS add-on.
     */

    public void setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
    }

    /**
     * <p>
     * Version of the installed EKS add-on.
     * </p>
     * 
     * @return Version of the installed EKS add-on.
     */

    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * <p>
     * Version of the installed EKS add-on.
     * </p>
     * 
     * @param addonVersion
     *        Version of the installed EKS add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonDetails withAddonVersion(String addonVersion) {
        setAddonVersion(addonVersion);
        return this;
    }

    /**
     * <p>
     * Status of the installed EKS add-on.
     * </p>
     * 
     * @param addonStatus
     *        Status of the installed EKS add-on.
     */

    public void setAddonStatus(String addonStatus) {
        this.addonStatus = addonStatus;
    }

    /**
     * <p>
     * Status of the installed EKS add-on.
     * </p>
     * 
     * @return Status of the installed EKS add-on.
     */

    public String getAddonStatus() {
        return this.addonStatus;
    }

    /**
     * <p>
     * Status of the installed EKS add-on.
     * </p>
     * 
     * @param addonStatus
     *        Status of the installed EKS add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonDetails withAddonStatus(String addonStatus) {
        setAddonStatus(addonStatus);
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
        if (getAddonStatus() != null)
            sb.append("AddonStatus: ").append(getAddonStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonDetails == false)
            return false;
        AddonDetails other = (AddonDetails) obj;
        if (other.getAddonVersion() == null ^ this.getAddonVersion() == null)
            return false;
        if (other.getAddonVersion() != null && other.getAddonVersion().equals(this.getAddonVersion()) == false)
            return false;
        if (other.getAddonStatus() == null ^ this.getAddonStatus() == null)
            return false;
        if (other.getAddonStatus() != null && other.getAddonStatus().equals(this.getAddonStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddonVersion() == null) ? 0 : getAddonVersion().hashCode());
        hashCode = prime * hashCode + ((getAddonStatus() == null) ? 0 : getAddonStatus().hashCode());
        return hashCode;
    }

    @Override
    public AddonDetails clone() {
        try {
            return (AddonDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AddonDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
