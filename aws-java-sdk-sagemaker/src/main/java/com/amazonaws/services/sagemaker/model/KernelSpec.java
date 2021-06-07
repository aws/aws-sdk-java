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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specification of a Jupyter kernel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/KernelSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KernelSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Jupyter kernel in the image. This value is case sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name of the kernel.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The name of the Jupyter kernel in the image. This value is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the Jupyter kernel in the image. This value is case sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Jupyter kernel in the image. This value is case sensitive.
     * </p>
     * 
     * @return The name of the Jupyter kernel in the image. This value is case sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Jupyter kernel in the image. This value is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the Jupyter kernel in the image. This value is case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelSpec withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name of the kernel.
     * </p>
     * 
     * @param displayName
     *        The display name of the kernel.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the kernel.
     * </p>
     * 
     * @return The display name of the kernel.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the kernel.
     * </p>
     * 
     * @param displayName
     *        The display name of the kernel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelSpec withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KernelSpec == false)
            return false;
        KernelSpec other = (KernelSpec) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public KernelSpec clone() {
        try {
            return (KernelSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.KernelSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
