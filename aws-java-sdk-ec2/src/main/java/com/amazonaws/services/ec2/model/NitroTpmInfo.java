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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the supported NitroTPM versions for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NitroTpmInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NitroTpmInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the supported NitroTPM versions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedVersions;

    /**
     * <p>
     * Indicates the supported NitroTPM versions.
     * </p>
     * 
     * @return Indicates the supported NitroTPM versions.
     */

    public java.util.List<String> getSupportedVersions() {
        if (supportedVersions == null) {
            supportedVersions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedVersions;
    }

    /**
     * <p>
     * Indicates the supported NitroTPM versions.
     * </p>
     * 
     * @param supportedVersions
     *        Indicates the supported NitroTPM versions.
     */

    public void setSupportedVersions(java.util.Collection<String> supportedVersions) {
        if (supportedVersions == null) {
            this.supportedVersions = null;
            return;
        }

        this.supportedVersions = new com.amazonaws.internal.SdkInternalList<String>(supportedVersions);
    }

    /**
     * <p>
     * Indicates the supported NitroTPM versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedVersions(java.util.Collection)} or {@link #withSupportedVersions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedVersions
     *        Indicates the supported NitroTPM versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NitroTpmInfo withSupportedVersions(String... supportedVersions) {
        if (this.supportedVersions == null) {
            setSupportedVersions(new com.amazonaws.internal.SdkInternalList<String>(supportedVersions.length));
        }
        for (String ele : supportedVersions) {
            this.supportedVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the supported NitroTPM versions.
     * </p>
     * 
     * @param supportedVersions
     *        Indicates the supported NitroTPM versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NitroTpmInfo withSupportedVersions(java.util.Collection<String> supportedVersions) {
        setSupportedVersions(supportedVersions);
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
        if (getSupportedVersions() != null)
            sb.append("SupportedVersions: ").append(getSupportedVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NitroTpmInfo == false)
            return false;
        NitroTpmInfo other = (NitroTpmInfo) obj;
        if (other.getSupportedVersions() == null ^ this.getSupportedVersions() == null)
            return false;
        if (other.getSupportedVersions() != null && other.getSupportedVersions().equals(this.getSupportedVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportedVersions() == null) ? 0 : getSupportedVersions().hashCode());
        return hashCode;
    }

    @Override
    public NitroTpmInfo clone() {
        try {
            return (NitroTpmInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
