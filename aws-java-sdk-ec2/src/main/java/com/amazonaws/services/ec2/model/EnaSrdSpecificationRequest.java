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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Launch instances with ENA Express settings configured from your launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnaSrdSpecificationRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnaSrdSpecificationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether ENA Express is enabled for the network interface when you launch an instance from your launch
     * template.
     * </p>
     */
    private Boolean enaSrdEnabled;
    /**
     * <p>
     * Contains ENA Express settings for UDP network traffic in your launch template.
     * </p>
     */
    private EnaSrdUdpSpecificationRequest enaSrdUdpSpecification;

    /**
     * <p>
     * Specifies whether ENA Express is enabled for the network interface when you launch an instance from your launch
     * template.
     * </p>
     * 
     * @param enaSrdEnabled
     *        Specifies whether ENA Express is enabled for the network interface when you launch an instance from your
     *        launch template.
     */

    public void setEnaSrdEnabled(Boolean enaSrdEnabled) {
        this.enaSrdEnabled = enaSrdEnabled;
    }

    /**
     * <p>
     * Specifies whether ENA Express is enabled for the network interface when you launch an instance from your launch
     * template.
     * </p>
     * 
     * @return Specifies whether ENA Express is enabled for the network interface when you launch an instance from your
     *         launch template.
     */

    public Boolean getEnaSrdEnabled() {
        return this.enaSrdEnabled;
    }

    /**
     * <p>
     * Specifies whether ENA Express is enabled for the network interface when you launch an instance from your launch
     * template.
     * </p>
     * 
     * @param enaSrdEnabled
     *        Specifies whether ENA Express is enabled for the network interface when you launch an instance from your
     *        launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnaSrdSpecificationRequest withEnaSrdEnabled(Boolean enaSrdEnabled) {
        setEnaSrdEnabled(enaSrdEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether ENA Express is enabled for the network interface when you launch an instance from your launch
     * template.
     * </p>
     * 
     * @return Specifies whether ENA Express is enabled for the network interface when you launch an instance from your
     *         launch template.
     */

    public Boolean isEnaSrdEnabled() {
        return this.enaSrdEnabled;
    }

    /**
     * <p>
     * Contains ENA Express settings for UDP network traffic in your launch template.
     * </p>
     * 
     * @param enaSrdUdpSpecification
     *        Contains ENA Express settings for UDP network traffic in your launch template.
     */

    public void setEnaSrdUdpSpecification(EnaSrdUdpSpecificationRequest enaSrdUdpSpecification) {
        this.enaSrdUdpSpecification = enaSrdUdpSpecification;
    }

    /**
     * <p>
     * Contains ENA Express settings for UDP network traffic in your launch template.
     * </p>
     * 
     * @return Contains ENA Express settings for UDP network traffic in your launch template.
     */

    public EnaSrdUdpSpecificationRequest getEnaSrdUdpSpecification() {
        return this.enaSrdUdpSpecification;
    }

    /**
     * <p>
     * Contains ENA Express settings for UDP network traffic in your launch template.
     * </p>
     * 
     * @param enaSrdUdpSpecification
     *        Contains ENA Express settings for UDP network traffic in your launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnaSrdSpecificationRequest withEnaSrdUdpSpecification(EnaSrdUdpSpecificationRequest enaSrdUdpSpecification) {
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

        if (obj instanceof EnaSrdSpecificationRequest == false)
            return false;
        EnaSrdSpecificationRequest other = (EnaSrdSpecificationRequest) obj;
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
    public EnaSrdSpecificationRequest clone() {
        try {
            return (EnaSrdSpecificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
