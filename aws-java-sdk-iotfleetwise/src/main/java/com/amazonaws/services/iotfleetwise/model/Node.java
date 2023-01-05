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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A general abstraction of a signal. A node can be specified as an actuator, attribute, branch, or sensor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/Node" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Node implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a node specified as a branch.
     * </p>
     * <note>
     * <p>
     * A group of signals that are defined in a hierarchical structure.
     * </p>
     * </note>
     */
    private Branch branch;

    private Sensor sensor;
    /**
     * <p>
     * Information about a node specified as an actuator.
     * </p>
     * <note>
     * <p>
     * An actuator is a digital representation of a vehicle device.
     * </p>
     * </note>
     */
    private Actuator actuator;
    /**
     * <p>
     * Information about a node specified as an attribute.
     * </p>
     * <note>
     * <p>
     * An attribute represents static information about a vehicle.
     * </p>
     * </note>
     */
    private Attribute attribute;

    /**
     * <p>
     * Information about a node specified as a branch.
     * </p>
     * <note>
     * <p>
     * A group of signals that are defined in a hierarchical structure.
     * </p>
     * </note>
     * 
     * @param branch
     *        Information about a node specified as a branch.</p> <note>
     *        <p>
     *        A group of signals that are defined in a hierarchical structure.
     *        </p>
     */

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * Information about a node specified as a branch.
     * </p>
     * <note>
     * <p>
     * A group of signals that are defined in a hierarchical structure.
     * </p>
     * </note>
     * 
     * @return Information about a node specified as a branch.</p> <note>
     *         <p>
     *         A group of signals that are defined in a hierarchical structure.
     *         </p>
     */

    public Branch getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * Information about a node specified as a branch.
     * </p>
     * <note>
     * <p>
     * A group of signals that are defined in a hierarchical structure.
     * </p>
     * </note>
     * 
     * @param branch
     *        Information about a node specified as a branch.</p> <note>
     *        <p>
     *        A group of signals that are defined in a hierarchical structure.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withBranch(Branch branch) {
        setBranch(branch);
        return this;
    }

    /**
     * @param sensor
     */

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    /**
     * @return
     */

    public Sensor getSensor() {
        return this.sensor;
    }

    /**
     * @param sensor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withSensor(Sensor sensor) {
        setSensor(sensor);
        return this;
    }

    /**
     * <p>
     * Information about a node specified as an actuator.
     * </p>
     * <note>
     * <p>
     * An actuator is a digital representation of a vehicle device.
     * </p>
     * </note>
     * 
     * @param actuator
     *        Information about a node specified as an actuator.</p> <note>
     *        <p>
     *        An actuator is a digital representation of a vehicle device.
     *        </p>
     */

    public void setActuator(Actuator actuator) {
        this.actuator = actuator;
    }

    /**
     * <p>
     * Information about a node specified as an actuator.
     * </p>
     * <note>
     * <p>
     * An actuator is a digital representation of a vehicle device.
     * </p>
     * </note>
     * 
     * @return Information about a node specified as an actuator.</p> <note>
     *         <p>
     *         An actuator is a digital representation of a vehicle device.
     *         </p>
     */

    public Actuator getActuator() {
        return this.actuator;
    }

    /**
     * <p>
     * Information about a node specified as an actuator.
     * </p>
     * <note>
     * <p>
     * An actuator is a digital representation of a vehicle device.
     * </p>
     * </note>
     * 
     * @param actuator
     *        Information about a node specified as an actuator.</p> <note>
     *        <p>
     *        An actuator is a digital representation of a vehicle device.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withActuator(Actuator actuator) {
        setActuator(actuator);
        return this;
    }

    /**
     * <p>
     * Information about a node specified as an attribute.
     * </p>
     * <note>
     * <p>
     * An attribute represents static information about a vehicle.
     * </p>
     * </note>
     * 
     * @param attribute
     *        Information about a node specified as an attribute.</p> <note>
     *        <p>
     *        An attribute represents static information about a vehicle.
     *        </p>
     */

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * Information about a node specified as an attribute.
     * </p>
     * <note>
     * <p>
     * An attribute represents static information about a vehicle.
     * </p>
     * </note>
     * 
     * @return Information about a node specified as an attribute.</p> <note>
     *         <p>
     *         An attribute represents static information about a vehicle.
     *         </p>
     */

    public Attribute getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * Information about a node specified as an attribute.
     * </p>
     * <note>
     * <p>
     * An attribute represents static information about a vehicle.
     * </p>
     * </note>
     * 
     * @param attribute
     *        Information about a node specified as an attribute.</p> <note>
     *        <p>
     *        An attribute represents static information about a vehicle.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withAttribute(Attribute attribute) {
        setAttribute(attribute);
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
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getSensor() != null)
            sb.append("Sensor: ").append(getSensor()).append(",");
        if (getActuator() != null)
            sb.append("Actuator: ").append(getActuator()).append(",");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Node == false)
            return false;
        Node other = (Node) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getSensor() == null ^ this.getSensor() == null)
            return false;
        if (other.getSensor() != null && other.getSensor().equals(this.getSensor()) == false)
            return false;
        if (other.getActuator() == null ^ this.getActuator() == null)
            return false;
        if (other.getActuator() != null && other.getActuator().equals(this.getActuator()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getSensor() == null) ? 0 : getSensor().hashCode());
        hashCode = prime * hashCode + ((getActuator() == null) ? 0 : getActuator().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public Node clone() {
        try {
            return (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.NodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
