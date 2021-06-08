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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a network path component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/NetworkPathComponent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkPathComponent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a component in the network path.
     * </p>
     */
    private String componentId;
    /**
     * <p>
     * The type of component.
     * </p>
     */
    private String componentType;
    /**
     * <p>
     * Information about the component that comes after the current component in the network path.
     * </p>
     */
    private NetworkHeader egress;
    /**
     * <p>
     * Information about the component that comes before the current node in the network path.
     * </p>
     */
    private NetworkHeader ingress;

    /**
     * <p>
     * The identifier of a component in the network path.
     * </p>
     * 
     * @param componentId
     *        The identifier of a component in the network path.
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p>
     * The identifier of a component in the network path.
     * </p>
     * 
     * @return The identifier of a component in the network path.
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p>
     * The identifier of a component in the network path.
     * </p>
     * 
     * @param componentId
     *        The identifier of a component in the network path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponent withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p>
     * The type of component.
     * </p>
     * 
     * @param componentType
     *        The type of component.
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p>
     * The type of component.
     * </p>
     * 
     * @return The type of component.
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p>
     * The type of component.
     * </p>
     * 
     * @param componentType
     *        The type of component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponent withComponentType(String componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p>
     * Information about the component that comes after the current component in the network path.
     * </p>
     * 
     * @param egress
     *        Information about the component that comes after the current component in the network path.
     */

    public void setEgress(NetworkHeader egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Information about the component that comes after the current component in the network path.
     * </p>
     * 
     * @return Information about the component that comes after the current component in the network path.
     */

    public NetworkHeader getEgress() {
        return this.egress;
    }

    /**
     * <p>
     * Information about the component that comes after the current component in the network path.
     * </p>
     * 
     * @param egress
     *        Information about the component that comes after the current component in the network path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponent withEgress(NetworkHeader egress) {
        setEgress(egress);
        return this;
    }

    /**
     * <p>
     * Information about the component that comes before the current node in the network path.
     * </p>
     * 
     * @param ingress
     *        Information about the component that comes before the current node in the network path.
     */

    public void setIngress(NetworkHeader ingress) {
        this.ingress = ingress;
    }

    /**
     * <p>
     * Information about the component that comes before the current node in the network path.
     * </p>
     * 
     * @return Information about the component that comes before the current node in the network path.
     */

    public NetworkHeader getIngress() {
        return this.ingress;
    }

    /**
     * <p>
     * Information about the component that comes before the current node in the network path.
     * </p>
     * 
     * @param ingress
     *        Information about the component that comes before the current node in the network path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponent withIngress(NetworkHeader ingress) {
        setIngress(ingress);
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
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getEgress() != null)
            sb.append("Egress: ").append(getEgress()).append(",");
        if (getIngress() != null)
            sb.append("Ingress: ").append(getIngress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkPathComponent == false)
            return false;
        NetworkPathComponent other = (NetworkPathComponent) obj;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getEgress() == null ^ this.getEgress() == null)
            return false;
        if (other.getEgress() != null && other.getEgress().equals(this.getEgress()) == false)
            return false;
        if (other.getIngress() == null ^ this.getIngress() == null)
            return false;
        if (other.getIngress() != null && other.getIngress().equals(this.getIngress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        hashCode = prime * hashCode + ((getIngress() == null) ? 0 : getIngress().hashCode());
        return hashCode;
    }

    @Override
    public NetworkPathComponent clone() {
        try {
            return (NetworkPathComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.NetworkPathComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
