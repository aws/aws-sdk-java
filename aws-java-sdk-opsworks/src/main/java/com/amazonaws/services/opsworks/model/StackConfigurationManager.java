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
 * Describes the configuration manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StackConfigurationManager" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackConfigurationManager implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name. This parameter must be set to "Chef".
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
     * stacks. The default value for Linux stacks is 11.4.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name. This parameter must be set to "Chef".
     * </p>
     * 
     * @param name
     *        The name. This parameter must be set to "Chef".
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name. This parameter must be set to "Chef".
     * </p>
     * 
     * @return The name. This parameter must be set to "Chef".
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name. This parameter must be set to "Chef".
     * </p>
     * 
     * @param name
     *        The name. This parameter must be set to "Chef".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackConfigurationManager withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
     * stacks. The default value for Linux stacks is 11.4.
     * </p>
     * 
     * @param version
     *        The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for
     *        Windows stacks. The default value for Linux stacks is 11.4.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
     * stacks. The default value for Linux stacks is 11.4.
     * </p>
     * 
     * @return The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for
     *         Windows stacks. The default value for Linux stacks is 11.4.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
     * stacks. The default value for Linux stacks is 11.4.
     * </p>
     * 
     * @param version
     *        The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for
     *        Windows stacks. The default value for Linux stacks is 11.4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackConfigurationManager withVersion(String version) {
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

        if (obj instanceof StackConfigurationManager == false)
            return false;
        StackConfigurationManager other = (StackConfigurationManager) obj;
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
    public StackConfigurationManager clone() {
        try {
            return (StackConfigurationManager) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.StackConfigurationManagerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
