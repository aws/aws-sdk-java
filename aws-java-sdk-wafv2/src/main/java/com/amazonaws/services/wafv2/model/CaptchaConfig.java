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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies how WAF should handle <code>CAPTCHA</code> evaluations. This is available at the web ACL level and in each
 * rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CaptchaConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptchaConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines how long a <code>CAPTCHA</code> timestamp in the token remains valid after the client successfully
     * solves a <code>CAPTCHA</code> puzzle.
     * </p>
     */
    private ImmunityTimeProperty immunityTimeProperty;

    /**
     * <p>
     * Determines how long a <code>CAPTCHA</code> timestamp in the token remains valid after the client successfully
     * solves a <code>CAPTCHA</code> puzzle.
     * </p>
     * 
     * @param immunityTimeProperty
     *        Determines how long a <code>CAPTCHA</code> timestamp in the token remains valid after the client
     *        successfully solves a <code>CAPTCHA</code> puzzle.
     */

    public void setImmunityTimeProperty(ImmunityTimeProperty immunityTimeProperty) {
        this.immunityTimeProperty = immunityTimeProperty;
    }

    /**
     * <p>
     * Determines how long a <code>CAPTCHA</code> timestamp in the token remains valid after the client successfully
     * solves a <code>CAPTCHA</code> puzzle.
     * </p>
     * 
     * @return Determines how long a <code>CAPTCHA</code> timestamp in the token remains valid after the client
     *         successfully solves a <code>CAPTCHA</code> puzzle.
     */

    public ImmunityTimeProperty getImmunityTimeProperty() {
        return this.immunityTimeProperty;
    }

    /**
     * <p>
     * Determines how long a <code>CAPTCHA</code> timestamp in the token remains valid after the client successfully
     * solves a <code>CAPTCHA</code> puzzle.
     * </p>
     * 
     * @param immunityTimeProperty
     *        Determines how long a <code>CAPTCHA</code> timestamp in the token remains valid after the client
     *        successfully solves a <code>CAPTCHA</code> puzzle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptchaConfig withImmunityTimeProperty(ImmunityTimeProperty immunityTimeProperty) {
        setImmunityTimeProperty(immunityTimeProperty);
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
        if (getImmunityTimeProperty() != null)
            sb.append("ImmunityTimeProperty: ").append(getImmunityTimeProperty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptchaConfig == false)
            return false;
        CaptchaConfig other = (CaptchaConfig) obj;
        if (other.getImmunityTimeProperty() == null ^ this.getImmunityTimeProperty() == null)
            return false;
        if (other.getImmunityTimeProperty() != null && other.getImmunityTimeProperty().equals(this.getImmunityTimeProperty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImmunityTimeProperty() == null) ? 0 : getImmunityTimeProperty().hashCode());
        return hashCode;
    }

    @Override
    public CaptchaConfig clone() {
        try {
            return (CaptchaConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.CaptchaConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
