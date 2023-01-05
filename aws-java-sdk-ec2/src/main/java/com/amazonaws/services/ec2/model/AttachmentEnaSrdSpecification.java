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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the ENA Express configuration for the network interface that's attached to the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachmentEnaSrdSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentEnaSrdSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     * </p>
     */
    private Boolean enaSrdEnabled;
    /**
     * <p>
     * ENA Express configuration for UDP network traffic.
     * </p>
     */
    private AttachmentEnaSrdUdpSpecification enaSrdUdpSpecification;

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     * </p>
     * 
     * @param enaSrdEnabled
     *        Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     */

    public void setEnaSrdEnabled(Boolean enaSrdEnabled) {
        this.enaSrdEnabled = enaSrdEnabled;
    }

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     * </p>
     * 
     * @return Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     */

    public Boolean getEnaSrdEnabled() {
        return this.enaSrdEnabled;
    }

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     * </p>
     * 
     * @param enaSrdEnabled
     *        Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentEnaSrdSpecification withEnaSrdEnabled(Boolean enaSrdEnabled) {
        setEnaSrdEnabled(enaSrdEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     * </p>
     * 
     * @return Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
     */

    public Boolean isEnaSrdEnabled() {
        return this.enaSrdEnabled;
    }

    /**
     * <p>
     * ENA Express configuration for UDP network traffic.
     * </p>
     * 
     * @param enaSrdUdpSpecification
     *        ENA Express configuration for UDP network traffic.
     */

    public void setEnaSrdUdpSpecification(AttachmentEnaSrdUdpSpecification enaSrdUdpSpecification) {
        this.enaSrdUdpSpecification = enaSrdUdpSpecification;
    }

    /**
     * <p>
     * ENA Express configuration for UDP network traffic.
     * </p>
     * 
     * @return ENA Express configuration for UDP network traffic.
     */

    public AttachmentEnaSrdUdpSpecification getEnaSrdUdpSpecification() {
        return this.enaSrdUdpSpecification;
    }

    /**
     * <p>
     * ENA Express configuration for UDP network traffic.
     * </p>
     * 
     * @param enaSrdUdpSpecification
     *        ENA Express configuration for UDP network traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentEnaSrdSpecification withEnaSrdUdpSpecification(AttachmentEnaSrdUdpSpecification enaSrdUdpSpecification) {
        setEnaSrdUdpSpecification(enaSrdUdpSpecification);
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
        if (getEnaSrdEnabled() != null)
            sb.append("EnaSrdEnabled: ").append(getEnaSrdEnabled()).append(",");
        if (getEnaSrdUdpSpecification() != null)
            sb.append("EnaSrdUdpSpecification: ").append(getEnaSrdUdpSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentEnaSrdSpecification == false)
            return false;
        AttachmentEnaSrdSpecification other = (AttachmentEnaSrdSpecification) obj;
        if (other.getEnaSrdEnabled() == null ^ this.getEnaSrdEnabled() == null)
            return false;
        if (other.getEnaSrdEnabled() != null && other.getEnaSrdEnabled().equals(this.getEnaSrdEnabled()) == false)
            return false;
        if (other.getEnaSrdUdpSpecification() == null ^ this.getEnaSrdUdpSpecification() == null)
            return false;
        if (other.getEnaSrdUdpSpecification() != null && other.getEnaSrdUdpSpecification().equals(this.getEnaSrdUdpSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnaSrdEnabled() == null) ? 0 : getEnaSrdEnabled().hashCode());
        hashCode = prime * hashCode + ((getEnaSrdUdpSpecification() == null) ? 0 : getEnaSrdUdpSpecification().hashCode());
        return hashCode;
    }

    @Override
    public AttachmentEnaSrdSpecification clone() {
        try {
            return (AttachmentEnaSrdSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
