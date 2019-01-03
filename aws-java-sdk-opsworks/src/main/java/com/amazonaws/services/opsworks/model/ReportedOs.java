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
 * A registered instance's reported operating system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ReportedOs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportedOs implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operating system family.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The operating system name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The operating system version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The operating system family.
     * </p>
     * 
     * @param family
     *        The operating system family.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The operating system family.
     * </p>
     * 
     * @return The operating system family.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The operating system family.
     * </p>
     * 
     * @param family
     *        The operating system family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportedOs withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The operating system name.
     * </p>
     * 
     * @param name
     *        The operating system name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The operating system name.
     * </p>
     * 
     * @return The operating system name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The operating system name.
     * </p>
     * 
     * @param name
     *        The operating system name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportedOs withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The operating system version.
     * </p>
     * 
     * @param version
     *        The operating system version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The operating system version.
     * </p>
     * 
     * @return The operating system version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The operating system version.
     * </p>
     * 
     * @param version
     *        The operating system version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportedOs withVersion(String version) {
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
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

        if (obj instanceof ReportedOs == false)
            return false;
        ReportedOs other = (ReportedOs) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ReportedOs clone() {
        try {
            return (ReportedOs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.ReportedOsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
