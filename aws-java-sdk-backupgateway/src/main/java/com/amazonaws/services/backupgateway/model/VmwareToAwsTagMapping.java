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
 * This displays the mapping of on-premises VMware tags to the corresponding Amazon Web Services tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/VmwareToAwsTagMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VmwareToAwsTagMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key part of the Amazon Web Services tag's key-value pair.
     * </p>
     */
    private String awsTagKey;
    /**
     * <p>
     * The value part of the Amazon Web Services tag's key-value pair.
     * </p>
     */
    private String awsTagValue;
    /**
     * <p>
     * The is the category of VMware.
     * </p>
     */
    private String vmwareCategory;
    /**
     * <p>
     * This is the user-defined name of a VMware tag.
     * </p>
     */
    private String vmwareTagName;

    /**
     * <p>
     * The key part of the Amazon Web Services tag's key-value pair.
     * </p>
     * 
     * @param awsTagKey
     *        The key part of the Amazon Web Services tag's key-value pair.
     */

    public void setAwsTagKey(String awsTagKey) {
        this.awsTagKey = awsTagKey;
    }

    /**
     * <p>
     * The key part of the Amazon Web Services tag's key-value pair.
     * </p>
     * 
     * @return The key part of the Amazon Web Services tag's key-value pair.
     */

    public String getAwsTagKey() {
        return this.awsTagKey;
    }

    /**
     * <p>
     * The key part of the Amazon Web Services tag's key-value pair.
     * </p>
     * 
     * @param awsTagKey
     *        The key part of the Amazon Web Services tag's key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmwareToAwsTagMapping withAwsTagKey(String awsTagKey) {
        setAwsTagKey(awsTagKey);
        return this;
    }

    /**
     * <p>
     * The value part of the Amazon Web Services tag's key-value pair.
     * </p>
     * 
     * @param awsTagValue
     *        The value part of the Amazon Web Services tag's key-value pair.
     */

    public void setAwsTagValue(String awsTagValue) {
        this.awsTagValue = awsTagValue;
    }

    /**
     * <p>
     * The value part of the Amazon Web Services tag's key-value pair.
     * </p>
     * 
     * @return The value part of the Amazon Web Services tag's key-value pair.
     */

    public String getAwsTagValue() {
        return this.awsTagValue;
    }

    /**
     * <p>
     * The value part of the Amazon Web Services tag's key-value pair.
     * </p>
     * 
     * @param awsTagValue
     *        The value part of the Amazon Web Services tag's key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VmwareToAwsTagMapping withAwsTagValue(String awsTagValue) {
        setAwsTagValue(awsTagValue);
        return this;
    }

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

    public VmwareToAwsTagMapping withVmwareCategory(String vmwareCategory) {
        setVmwareCategory(vmwareCategory);
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

    public VmwareToAwsTagMapping withVmwareTagName(String vmwareTagName) {
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
        if (getAwsTagKey() != null)
            sb.append("AwsTagKey: ").append(getAwsTagKey()).append(",");
        if (getAwsTagValue() != null)
            sb.append("AwsTagValue: ").append(getAwsTagValue()).append(",");
        if (getVmwareCategory() != null)
            sb.append("VmwareCategory: ").append(getVmwareCategory()).append(",");
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

        if (obj instanceof VmwareToAwsTagMapping == false)
            return false;
        VmwareToAwsTagMapping other = (VmwareToAwsTagMapping) obj;
        if (other.getAwsTagKey() == null ^ this.getAwsTagKey() == null)
            return false;
        if (other.getAwsTagKey() != null && other.getAwsTagKey().equals(this.getAwsTagKey()) == false)
            return false;
        if (other.getAwsTagValue() == null ^ this.getAwsTagValue() == null)
            return false;
        if (other.getAwsTagValue() != null && other.getAwsTagValue().equals(this.getAwsTagValue()) == false)
            return false;
        if (other.getVmwareCategory() == null ^ this.getVmwareCategory() == null)
            return false;
        if (other.getVmwareCategory() != null && other.getVmwareCategory().equals(this.getVmwareCategory()) == false)
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

        hashCode = prime * hashCode + ((getAwsTagKey() == null) ? 0 : getAwsTagKey().hashCode());
        hashCode = prime * hashCode + ((getAwsTagValue() == null) ? 0 : getAwsTagValue().hashCode());
        hashCode = prime * hashCode + ((getVmwareCategory() == null) ? 0 : getVmwareCategory().hashCode());
        hashCode = prime * hashCode + ((getVmwareTagName() == null) ? 0 : getVmwareTagName().hashCode());
        return hashCode;
    }

    @Override
    public VmwareToAwsTagMapping clone() {
        try {
            return (VmwareToAwsTagMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.VmwareToAwsTagMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
