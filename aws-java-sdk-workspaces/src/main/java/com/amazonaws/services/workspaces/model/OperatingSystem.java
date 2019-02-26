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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The operating system that the image is running.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/OperatingSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperatingSystem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operating system.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @param type
     *        The operating system.
     * @see OperatingSystemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @return The operating system.
     * @see OperatingSystemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @param type
     *        The operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemType
     */

    public OperatingSystem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @param type
     *        The operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemType
     */

    public OperatingSystem withType(OperatingSystemType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperatingSystem == false)
            return false;
        OperatingSystem other = (OperatingSystem) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public OperatingSystem clone() {
        try {
            return (OperatingSystem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.OperatingSystemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
