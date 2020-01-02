/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An item in a list of <code>Config</code> objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ConfigListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of a <code>Config</code>.
     * </p>
     */
    private String configArn;
    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     */
    private String configId;
    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     */
    private String configType;
    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * ARN of a <code>Config</code>.
     * </p>
     * 
     * @param configArn
     *        ARN of a <code>Config</code>.
     */

    public void setConfigArn(String configArn) {
        this.configArn = configArn;
    }

    /**
     * <p>
     * ARN of a <code>Config</code>.
     * </p>
     * 
     * @return ARN of a <code>Config</code>.
     */

    public String getConfigArn() {
        return this.configArn;
    }

    /**
     * <p>
     * ARN of a <code>Config</code>.
     * </p>
     * 
     * @param configArn
     *        ARN of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigListItem withConfigArn(String configArn) {
        setConfigArn(configArn);
        return this;
    }

    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     * 
     * @param configId
     *        UUID of a <code>Config</code>.
     */

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     * 
     * @return UUID of a <code>Config</code>.
     */

    public String getConfigId() {
        return this.configId;
    }

    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     * 
     * @param configId
     *        UUID of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigListItem withConfigId(String configId) {
        setConfigId(configId);
        return this;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @param configType
     *        Type of a <code>Config</code>.
     * @see ConfigCapabilityType
     */

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @return Type of a <code>Config</code>.
     * @see ConfigCapabilityType
     */

    public String getConfigType() {
        return this.configType;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @param configType
     *        Type of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigCapabilityType
     */

    public ConfigListItem withConfigType(String configType) {
        setConfigType(configType);
        return this;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @param configType
     *        Type of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigCapabilityType
     */

    public ConfigListItem withConfigType(ConfigCapabilityType configType) {
        this.configType = configType.toString();
        return this;
    }

    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     * 
     * @param name
     *        Name of a <code>Config</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     * 
     * @return Name of a <code>Config</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     * 
     * @param name
     *        Name of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigListItem withName(String name) {
        setName(name);
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
        if (getConfigArn() != null)
            sb.append("ConfigArn: ").append(getConfigArn()).append(",");
        if (getConfigId() != null)
            sb.append("ConfigId: ").append(getConfigId()).append(",");
        if (getConfigType() != null)
            sb.append("ConfigType: ").append(getConfigType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigListItem == false)
            return false;
        ConfigListItem other = (ConfigListItem) obj;
        if (other.getConfigArn() == null ^ this.getConfigArn() == null)
            return false;
        if (other.getConfigArn() != null && other.getConfigArn().equals(this.getConfigArn()) == false)
            return false;
        if (other.getConfigId() == null ^ this.getConfigId() == null)
            return false;
        if (other.getConfigId() != null && other.getConfigId().equals(this.getConfigId()) == false)
            return false;
        if (other.getConfigType() == null ^ this.getConfigType() == null)
            return false;
        if (other.getConfigType() != null && other.getConfigType().equals(this.getConfigType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigArn() == null) ? 0 : getConfigArn().hashCode());
        hashCode = prime * hashCode + ((getConfigId() == null) ? 0 : getConfigId().hashCode());
        hashCode = prime * hashCode + ((getConfigType() == null) ? 0 : getConfigType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ConfigListItem clone() {
        try {
            return (ConfigListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.ConfigListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
