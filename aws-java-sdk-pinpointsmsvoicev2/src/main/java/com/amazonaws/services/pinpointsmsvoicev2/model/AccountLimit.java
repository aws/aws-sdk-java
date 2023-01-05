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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current resource quotas associated with an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AccountLimit" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute to apply the account limit to.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current amount that has been spent, in US dollars.
     * </p>
     */
    private Long used;
    /**
     * <p>
     * The Amazon Web Services set limit for that resource type, in US dollars.
     * </p>
     */
    private Long max;

    /**
     * <p>
     * The name of the attribute to apply the account limit to.
     * </p>
     * 
     * @param name
     *        The name of the attribute to apply the account limit to.
     * @see AccountLimitName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute to apply the account limit to.
     * </p>
     * 
     * @return The name of the attribute to apply the account limit to.
     * @see AccountLimitName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute to apply the account limit to.
     * </p>
     * 
     * @param name
     *        The name of the attribute to apply the account limit to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLimitName
     */

    public AccountLimit withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the attribute to apply the account limit to.
     * </p>
     * 
     * @param name
     *        The name of the attribute to apply the account limit to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLimitName
     */

    public AccountLimit withName(AccountLimitName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The current amount that has been spent, in US dollars.
     * </p>
     * 
     * @param used
     *        The current amount that has been spent, in US dollars.
     */

    public void setUsed(Long used) {
        this.used = used;
    }

    /**
     * <p>
     * The current amount that has been spent, in US dollars.
     * </p>
     * 
     * @return The current amount that has been spent, in US dollars.
     */

    public Long getUsed() {
        return this.used;
    }

    /**
     * <p>
     * The current amount that has been spent, in US dollars.
     * </p>
     * 
     * @param used
     *        The current amount that has been spent, in US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withUsed(Long used) {
        setUsed(used);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services set limit for that resource type, in US dollars.
     * </p>
     * 
     * @param max
     *        The Amazon Web Services set limit for that resource type, in US dollars.
     */

    public void setMax(Long max) {
        this.max = max;
    }

    /**
     * <p>
     * The Amazon Web Services set limit for that resource type, in US dollars.
     * </p>
     * 
     * @return The Amazon Web Services set limit for that resource type, in US dollars.
     */

    public Long getMax() {
        return this.max;
    }

    /**
     * <p>
     * The Amazon Web Services set limit for that resource type, in US dollars.
     * </p>
     * 
     * @param max
     *        The Amazon Web Services set limit for that resource type, in US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withMax(Long max) {
        setMax(max);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUsed() != null)
            sb.append("Used: ").append(getUsed()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLimit == false)
            return false;
        AccountLimit other = (AccountLimit) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUsed() == null ^ this.getUsed() == null)
            return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public AccountLimit clone() {
        try {
            return (AccountLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.AccountLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
