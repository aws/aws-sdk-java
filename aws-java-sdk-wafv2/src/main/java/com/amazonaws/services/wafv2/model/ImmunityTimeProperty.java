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
 * Used for CAPTCHA and challenge token settings. Determines how long a <code>CAPTCHA</code> or challenge timestamp
 * remains valid after WAF updates it for a successful <code>CAPTCHA</code> or challenge response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ImmunityTimeProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImmunityTimeProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time, in seconds, that a <code>CAPTCHA</code> or challenge timestamp is considered valid by WAF.
     * The default setting is 300.
     * </p>
     * <p>
     * For the Challenge action, the minimum setting is 300.
     * </p>
     */
    private Long immunityTime;

    /**
     * <p>
     * The amount of time, in seconds, that a <code>CAPTCHA</code> or challenge timestamp is considered valid by WAF.
     * The default setting is 300.
     * </p>
     * <p>
     * For the Challenge action, the minimum setting is 300.
     * </p>
     * 
     * @param immunityTime
     *        The amount of time, in seconds, that a <code>CAPTCHA</code> or challenge timestamp is considered valid by
     *        WAF. The default setting is 300. </p>
     *        <p>
     *        For the Challenge action, the minimum setting is 300.
     */

    public void setImmunityTime(Long immunityTime) {
        this.immunityTime = immunityTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, that a <code>CAPTCHA</code> or challenge timestamp is considered valid by WAF.
     * The default setting is 300.
     * </p>
     * <p>
     * For the Challenge action, the minimum setting is 300.
     * </p>
     * 
     * @return The amount of time, in seconds, that a <code>CAPTCHA</code> or challenge timestamp is considered valid by
     *         WAF. The default setting is 300. </p>
     *         <p>
     *         For the Challenge action, the minimum setting is 300.
     */

    public Long getImmunityTime() {
        return this.immunityTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, that a <code>CAPTCHA</code> or challenge timestamp is considered valid by WAF.
     * The default setting is 300.
     * </p>
     * <p>
     * For the Challenge action, the minimum setting is 300.
     * </p>
     * 
     * @param immunityTime
     *        The amount of time, in seconds, that a <code>CAPTCHA</code> or challenge timestamp is considered valid by
     *        WAF. The default setting is 300. </p>
     *        <p>
     *        For the Challenge action, the minimum setting is 300.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImmunityTimeProperty withImmunityTime(Long immunityTime) {
        setImmunityTime(immunityTime);
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
        if (getImmunityTime() != null)
            sb.append("ImmunityTime: ").append(getImmunityTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImmunityTimeProperty == false)
            return false;
        ImmunityTimeProperty other = (ImmunityTimeProperty) obj;
        if (other.getImmunityTime() == null ^ this.getImmunityTime() == null)
            return false;
        if (other.getImmunityTime() != null && other.getImmunityTime().equals(this.getImmunityTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImmunityTime() == null) ? 0 : getImmunityTime().hashCode());
        return hashCode;
    }

    @Override
    public ImmunityTimeProperty clone() {
        try {
            return (ImmunityTimeProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ImmunityTimePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
