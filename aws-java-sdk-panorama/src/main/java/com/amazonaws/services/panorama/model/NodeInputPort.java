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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A node input port.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NodeInputPort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeInputPort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input port's default value.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The input port's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The input port's max connections.
     * </p>
     */
    private Integer maxConnections;
    /**
     * <p>
     * The input port's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The input port's type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The input port's default value.
     * </p>
     * 
     * @param defaultValue
     *        The input port's default value.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The input port's default value.
     * </p>
     * 
     * @return The input port's default value.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The input port's default value.
     * </p>
     * 
     * @param defaultValue
     *        The input port's default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInputPort withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The input port's description.
     * </p>
     * 
     * @param description
     *        The input port's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The input port's description.
     * </p>
     * 
     * @return The input port's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The input port's description.
     * </p>
     * 
     * @param description
     *        The input port's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInputPort withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The input port's max connections.
     * </p>
     * 
     * @param maxConnections
     *        The input port's max connections.
     */

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * <p>
     * The input port's max connections.
     * </p>
     * 
     * @return The input port's max connections.
     */

    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * <p>
     * The input port's max connections.
     * </p>
     * 
     * @param maxConnections
     *        The input port's max connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInputPort withMaxConnections(Integer maxConnections) {
        setMaxConnections(maxConnections);
        return this;
    }

    /**
     * <p>
     * The input port's name.
     * </p>
     * 
     * @param name
     *        The input port's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The input port's name.
     * </p>
     * 
     * @return The input port's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The input port's name.
     * </p>
     * 
     * @param name
     *        The input port's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInputPort withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The input port's type.
     * </p>
     * 
     * @param type
     *        The input port's type.
     * @see PortType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The input port's type.
     * </p>
     * 
     * @return The input port's type.
     * @see PortType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The input port's type.
     * </p>
     * 
     * @param type
     *        The input port's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortType
     */

    public NodeInputPort withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The input port's type.
     * </p>
     * 
     * @param type
     *        The input port's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortType
     */

    public NodeInputPort withType(PortType type) {
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMaxConnections() != null)
            sb.append("MaxConnections: ").append(getMaxConnections()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof NodeInputPort == false)
            return false;
        NodeInputPort other = (NodeInputPort) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaxConnections() == null ^ this.getMaxConnections() == null)
            return false;
        if (other.getMaxConnections() != null && other.getMaxConnections().equals(this.getMaxConnections()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMaxConnections() == null) ? 0 : getMaxConnections().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NodeInputPort clone() {
        try {
            return (NodeInputPort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NodeInputPortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
