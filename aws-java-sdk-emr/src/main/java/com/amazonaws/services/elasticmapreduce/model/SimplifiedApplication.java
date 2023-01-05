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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The returned release label application names or versions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SimplifiedApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimplifiedApplication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The returned release label application name. For example, <code>hadoop</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The returned release label application version. For example, <code>3.2.1</code>.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The returned release label application name. For example, <code>hadoop</code>.
     * </p>
     * 
     * @param name
     *        The returned release label application name. For example, <code>hadoop</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The returned release label application name. For example, <code>hadoop</code>.
     * </p>
     * 
     * @return The returned release label application name. For example, <code>hadoop</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The returned release label application name. For example, <code>hadoop</code>.
     * </p>
     * 
     * @param name
     *        The returned release label application name. For example, <code>hadoop</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimplifiedApplication withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The returned release label application version. For example, <code>3.2.1</code>.
     * </p>
     * 
     * @param version
     *        The returned release label application version. For example, <code>3.2.1</code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The returned release label application version. For example, <code>3.2.1</code>.
     * </p>
     * 
     * @return The returned release label application version. For example, <code>3.2.1</code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The returned release label application version. For example, <code>3.2.1</code>.
     * </p>
     * 
     * @param version
     *        The returned release label application version. For example, <code>3.2.1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimplifiedApplication withVersion(String version) {
        setVersion(version);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimplifiedApplication == false)
            return false;
        SimplifiedApplication other = (SimplifiedApplication) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public SimplifiedApplication clone() {
        try {
            return (SimplifiedApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.SimplifiedApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
