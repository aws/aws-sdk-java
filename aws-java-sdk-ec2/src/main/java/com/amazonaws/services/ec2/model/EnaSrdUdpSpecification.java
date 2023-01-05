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
 * ENA Express is compatible with both TCP and UDP transport protocols. When it’s enabled, TCP traffic automatically
 * uses it. However, some UDP-based applications are designed to handle network packets that are out of order, without a
 * need for retransmission, such as live video broadcasting or other near-real-time applications. For UDP traffic, you
 * can specify whether to use ENA Express, based on your application environment needs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnaSrdUdpSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnaSrdUdpSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA Express.
     * </p>
     */
    private Boolean enaSrdUdpEnabled;

    /**
     * <p>
     * Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA Express.
     * </p>
     * 
     * @param enaSrdUdpEnabled
     *        Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA
     *        Express.
     */

    public void setEnaSrdUdpEnabled(Boolean enaSrdUdpEnabled) {
        this.enaSrdUdpEnabled = enaSrdUdpEnabled;
    }

    /**
     * <p>
     * Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA Express.
     * </p>
     * 
     * @return Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA
     *         Express.
     */

    public Boolean getEnaSrdUdpEnabled() {
        return this.enaSrdUdpEnabled;
    }

    /**
     * <p>
     * Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA Express.
     * </p>
     * 
     * @param enaSrdUdpEnabled
     *        Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA
     *        Express.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnaSrdUdpSpecification withEnaSrdUdpEnabled(Boolean enaSrdUdpEnabled) {
        setEnaSrdUdpEnabled(enaSrdUdpEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA Express.
     * </p>
     * 
     * @return Indicates whether UDP traffic uses ENA Express. To specify this setting, you must first enable ENA
     *         Express.
     */

    public Boolean isEnaSrdUdpEnabled() {
        return this.enaSrdUdpEnabled;
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
        if (getEnaSrdUdpEnabled() != null)
            sb.append("EnaSrdUdpEnabled: ").append(getEnaSrdUdpEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnaSrdUdpSpecification == false)
            return false;
        EnaSrdUdpSpecification other = (EnaSrdUdpSpecification) obj;
        if (other.getEnaSrdUdpEnabled() == null ^ this.getEnaSrdUdpEnabled() == null)
            return false;
        if (other.getEnaSrdUdpEnabled() != null && other.getEnaSrdUdpEnabled().equals(this.getEnaSrdUdpEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnaSrdUdpEnabled() == null) ? 0 : getEnaSrdUdpEnabled().hashCode());
        return hashCode;
    }

    @Override
    public EnaSrdUdpSpecification clone() {
        try {
            return (EnaSrdUdpSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
