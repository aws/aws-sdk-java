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
 * A node output port.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NodeOutputPort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeOutputPort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The output port's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The output port's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The output port's type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The output port's description.
     * </p>
     * 
     * @param description
     *        The output port's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The output port's description.
     * </p>
     * 
     * @return The output port's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The output port's description.
     * </p>
     * 
     * @param description
     *        The output port's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeOutputPort withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The output port's name.
     * </p>
     * 
     * @param name
     *        The output port's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The output port's name.
     * </p>
     * 
     * @return The output port's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The output port's name.
     * </p>
     * 
     * @param name
     *        The output port's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeOutputPort withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The output port's type.
     * </p>
     * 
     * @param type
     *        The output port's type.
     * @see PortType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The output port's type.
     * </p>
     * 
     * @return The output port's type.
     * @see PortType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The output port's type.
     * </p>
     * 
     * @param type
     *        The output port's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortType
     */

    public NodeOutputPort withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The output port's type.
     * </p>
     * 
     * @param type
     *        The output port's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortType
     */

    public NodeOutputPort withType(PortType type) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof NodeOutputPort == false)
            return false;
        NodeOutputPort other = (NodeOutputPort) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NodeOutputPort clone() {
        try {
            return (NodeOutputPort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NodeOutputPortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
