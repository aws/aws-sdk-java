/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines ranges of ports that server processes can connect to.
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerDefinition$PortConfiguration</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerPortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerPortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies one or more ranges of ports on a container. These ranges must not overlap.
     * </p>
     */
    private java.util.List<ContainerPortRange> containerPortRanges;

    /**
     * <p>
     * Specifies one or more ranges of ports on a container. These ranges must not overlap.
     * </p>
     * 
     * @return Specifies one or more ranges of ports on a container. These ranges must not overlap.
     */

    public java.util.List<ContainerPortRange> getContainerPortRanges() {
        return containerPortRanges;
    }

    /**
     * <p>
     * Specifies one or more ranges of ports on a container. These ranges must not overlap.
     * </p>
     * 
     * @param containerPortRanges
     *        Specifies one or more ranges of ports on a container. These ranges must not overlap.
     */

    public void setContainerPortRanges(java.util.Collection<ContainerPortRange> containerPortRanges) {
        if (containerPortRanges == null) {
            this.containerPortRanges = null;
            return;
        }

        this.containerPortRanges = new java.util.ArrayList<ContainerPortRange>(containerPortRanges);
    }

    /**
     * <p>
     * Specifies one or more ranges of ports on a container. These ranges must not overlap.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerPortRanges(java.util.Collection)} or {@link #withContainerPortRanges(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerPortRanges
     *        Specifies one or more ranges of ports on a container. These ranges must not overlap.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerPortConfiguration withContainerPortRanges(ContainerPortRange... containerPortRanges) {
        if (this.containerPortRanges == null) {
            setContainerPortRanges(new java.util.ArrayList<ContainerPortRange>(containerPortRanges.length));
        }
        for (ContainerPortRange ele : containerPortRanges) {
            this.containerPortRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more ranges of ports on a container. These ranges must not overlap.
     * </p>
     * 
     * @param containerPortRanges
     *        Specifies one or more ranges of ports on a container. These ranges must not overlap.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerPortConfiguration withContainerPortRanges(java.util.Collection<ContainerPortRange> containerPortRanges) {
        setContainerPortRanges(containerPortRanges);
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
        if (getContainerPortRanges() != null)
            sb.append("ContainerPortRanges: ").append(getContainerPortRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerPortConfiguration == false)
            return false;
        ContainerPortConfiguration other = (ContainerPortConfiguration) obj;
        if (other.getContainerPortRanges() == null ^ this.getContainerPortRanges() == null)
            return false;
        if (other.getContainerPortRanges() != null && other.getContainerPortRanges().equals(this.getContainerPortRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerPortRanges() == null) ? 0 : getContainerPortRanges().hashCode());
        return hashCode;
    }

    @Override
    public ContainerPortConfiguration clone() {
        try {
            return (ContainerPortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerPortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
