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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a target and its relative weight. Traffic is distributed across targets according to their
 * relative weight. For example, a weighted target with a relative weight of 50 receives five times as much traffic as
 * one with a relative weight of 10.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/WeightedTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeightedTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     */
    private String virtualNode;
    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     */
    private Integer weight;

    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     * 
     * @param virtualNode
     *        The virtual node to associate with the weighted target.
     */

    public void setVirtualNode(String virtualNode) {
        this.virtualNode = virtualNode;
    }

    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     * 
     * @return The virtual node to associate with the weighted target.
     */

    public String getVirtualNode() {
        return this.virtualNode;
    }

    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     * 
     * @param virtualNode
     *        The virtual node to associate with the weighted target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeightedTarget withVirtualNode(String virtualNode) {
        setVirtualNode(virtualNode);
        return this;
    }

    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     * 
     * @param weight
     *        The relative weight of the weighted target.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     * 
     * @return The relative weight of the weighted target.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     * 
     * @param weight
     *        The relative weight of the weighted target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeightedTarget withWeight(Integer weight) {
        setWeight(weight);
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
        if (getVirtualNode() != null)
            sb.append("VirtualNode: ").append(getVirtualNode()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeightedTarget == false)
            return false;
        WeightedTarget other = (WeightedTarget) obj;
        if (other.getVirtualNode() == null ^ this.getVirtualNode() == null)
            return false;
        if (other.getVirtualNode() != null && other.getVirtualNode().equals(this.getVirtualNode()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualNode() == null) ? 0 : getVirtualNode().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public WeightedTarget clone() {
        try {
            return (WeightedTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.WeightedTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
