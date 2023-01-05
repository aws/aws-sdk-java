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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A VMware tag is a tag attached to a specific virtual machine. A <a
 * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_Tag.html">tag</a> is a key-value pair you can
 * use to manage, filter, and search for your resources.
 * </p>
 * <p>
 * The content of VMware tags can be matched to Amazon Web Services tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/VmwareTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VmwareTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The is the category of VMware.
     * </p>
     */
    private String vmwareCategory;
    /**
     * <p>
     * This is a user-defined description of a VMware tag.
     * </p>
     */
    private String vmwareTagDescription;
    /**
     * <p>
     * This is the user-defined name of a VMware tag.
     * </p>
     */
    private String vmwareTagName;

    /**
     * <p>
     * The is the category of VMware.
     * </p>
     * 
     * @param vmwareCategory
     *        The is the category of VMware.
     */

    public void setVmwareCategory(String vmwareCategory) {
        this.vmwareCategory = vmwareCategory;
    }

    /**
     * <p>
     * The is the category of VMware.
     * </p>
     * 
     * @return The is the category of VMware.
     */

    public String getVmwareCategory() {
        return this.vmwareCategory;
    }

    /**
     * <p>
     * The is the category of VMware.
     * </p>
     * 
     * @param vmwareCategory
     *        The is the category of VMware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmwareTag withVmwareCategory(String vmwareCategory) {
        setVmwareCategory(vmwareCategory);
        return this;
    }

    /**
     * <p>
     * This is a user-defined description of a VMware tag.
     * </p>
     * 
     * @param vmwareTagDescription
     *        This is a user-defined description of a VMware tag.
     */

    public void setVmwareTagDescription(String vmwareTagDescription) {
        this.vmwareTagDescription = vmwareTagDescription;
    }

    /**
     * <p>
     * This is a user-defined description of a VMware tag.
     * </p>
     * 
     * @return This is a user-defined description of a VMware tag.
     */

    public String getVmwareTagDescription() {
        return this.vmwareTagDescription;
    }

    /**
     * <p>
     * This is a user-defined description of a VMware tag.
     * </p>
     * 
     * @param vmwareTagDescription
     *        This is a user-defined description of a VMware tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmwareTag withVmwareTagDescription(String vmwareTagDescription) {
        setVmwareTagDescription(vmwareTagDescription);
        return this;
    }

    /**
     * <p>
     * This is the user-defined name of a VMware tag.
     * </p>
     * 
     * @param vmwareTagName
     *        This is the user-defined name of a VMware tag.
     */

    public void setVmwareTagName(String vmwareTagName) {
        this.vmwareTagName = vmwareTagName;
    }

    /**
     * <p>
     * This is the user-defined name of a VMware tag.
     * </p>
     * 
     * @return This is the user-defined name of a VMware tag.
     */

    public String getVmwareTagName() {
        return this.vmwareTagName;
    }

    /**
     * <p>
     * This is the user-defined name of a VMware tag.
     * </p>
     * 
     * @param vmwareTagName
     *        This is the user-defined name of a VMware tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmwareTag withVmwareTagName(String vmwareTagName) {
        setVmwareTagName(vmwareTagName);
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
        if (getVmwareCategory() != null)
            sb.append("VmwareCategory: ").append(getVmwareCategory()).append(",");
        if (getVmwareTagDescription() != null)
            sb.append("VmwareTagDescription: ").append(getVmwareTagDescription()).append(",");
        if (getVmwareTagName() != null)
            sb.append("VmwareTagName: ").append(getVmwareTagName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VmwareTag == false)
            return false;
        VmwareTag other = (VmwareTag) obj;
        if (other.getVmwareCategory() == null ^ this.getVmwareCategory() == null)
            return false;
        if (other.getVmwareCategory() != null && other.getVmwareCategory().equals(this.getVmwareCategory()) == false)
            return false;
        if (other.getVmwareTagDescription() == null ^ this.getVmwareTagDescription() == null)
            return false;
        if (other.getVmwareTagDescription() != null && other.getVmwareTagDescription().equals(this.getVmwareTagDescription()) == false)
            return false;
        if (other.getVmwareTagName() == null ^ this.getVmwareTagName() == null)
            return false;
        if (other.getVmwareTagName() != null && other.getVmwareTagName().equals(this.getVmwareTagName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVmwareCategory() == null) ? 0 : getVmwareCategory().hashCode());
        hashCode = prime * hashCode + ((getVmwareTagDescription() == null) ? 0 : getVmwareTagDescription().hashCode());
        hashCode = prime * hashCode + ((getVmwareTagName() == null) ? 0 : getVmwareTagName().hashCode());
        return hashCode;
    }

    @Override
    public VmwareTag clone() {
        try {
            return (VmwareTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.VmwareTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
