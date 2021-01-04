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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RegistryId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistryId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the registry. Used only for lookup. One of <code>RegistryArn</code> or <code>RegistryName</code> has to
     * be provided.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * Arn of the registry to be updated. One of <code>RegistryArn</code> or <code>RegistryName</code> has to be
     * provided.
     * </p>
     */
    private String registryArn;

    /**
     * <p>
     * Name of the registry. Used only for lookup. One of <code>RegistryArn</code> or <code>RegistryName</code> has to
     * be provided.
     * </p>
     * 
     * @param registryName
     *        Name of the registry. Used only for lookup. One of <code>RegistryArn</code> or <code>RegistryName</code>
     *        has to be provided.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * Name of the registry. Used only for lookup. One of <code>RegistryArn</code> or <code>RegistryName</code> has to
     * be provided.
     * </p>
     * 
     * @return Name of the registry. Used only for lookup. One of <code>RegistryArn</code> or <code>RegistryName</code>
     *         has to be provided.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * Name of the registry. Used only for lookup. One of <code>RegistryArn</code> or <code>RegistryName</code> has to
     * be provided.
     * </p>
     * 
     * @param registryName
     *        Name of the registry. Used only for lookup. One of <code>RegistryArn</code> or <code>RegistryName</code>
     *        has to be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryId withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * <p>
     * Arn of the registry to be updated. One of <code>RegistryArn</code> or <code>RegistryName</code> has to be
     * provided.
     * </p>
     * 
     * @param registryArn
     *        Arn of the registry to be updated. One of <code>RegistryArn</code> or <code>RegistryName</code> has to be
     *        provided.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * Arn of the registry to be updated. One of <code>RegistryArn</code> or <code>RegistryName</code> has to be
     * provided.
     * </p>
     * 
     * @return Arn of the registry to be updated. One of <code>RegistryArn</code> or <code>RegistryName</code> has to be
     *         provided.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * Arn of the registry to be updated. One of <code>RegistryArn</code> or <code>RegistryName</code> has to be
     * provided.
     * </p>
     * 
     * @param registryArn
     *        Arn of the registry to be updated. One of <code>RegistryArn</code> or <code>RegistryName</code> has to be
     *        provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryId withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
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
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistryId == false)
            return false;
        RegistryId other = (RegistryId) obj;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        return hashCode;
    }

    @Override
    public RegistryId clone() {
        try {
            return (RegistryId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RegistryIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
