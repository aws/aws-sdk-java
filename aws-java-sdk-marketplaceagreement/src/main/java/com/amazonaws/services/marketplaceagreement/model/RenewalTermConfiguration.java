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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional parameters specified by the acceptor while accepting the term.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/RenewalTermConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenewalTermConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be set to
     * <code>True</code> or <code>False</code>.
     * </p>
     */
    private Boolean enableAutoRenew;

    /**
     * <p>
     * Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be set to
     * <code>True</code> or <code>False</code>.
     * </p>
     * 
     * @param enableAutoRenew
     *        Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be
     *        set to <code>True</code> or <code>False</code>.
     */

    public void setEnableAutoRenew(Boolean enableAutoRenew) {
        this.enableAutoRenew = enableAutoRenew;
    }

    /**
     * <p>
     * Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be set to
     * <code>True</code> or <code>False</code>.
     * </p>
     * 
     * @return Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be
     *         set to <code>True</code> or <code>False</code>.
     */

    public Boolean getEnableAutoRenew() {
        return this.enableAutoRenew;
    }

    /**
     * <p>
     * Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be set to
     * <code>True</code> or <code>False</code>.
     * </p>
     * 
     * @param enableAutoRenew
     *        Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be
     *        set to <code>True</code> or <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewalTermConfiguration withEnableAutoRenew(Boolean enableAutoRenew) {
        setEnableAutoRenew(enableAutoRenew);
        return this;
    }

    /**
     * <p>
     * Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be set to
     * <code>True</code> or <code>False</code>.
     * </p>
     * 
     * @return Defines whether the acceptor has chosen to auto-renew the agreement at the end of its lifecycle. Can be
     *         set to <code>True</code> or <code>False</code>.
     */

    public Boolean isEnableAutoRenew() {
        return this.enableAutoRenew;
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
        if (getEnableAutoRenew() != null)
            sb.append("EnableAutoRenew: ").append(getEnableAutoRenew());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenewalTermConfiguration == false)
            return false;
        RenewalTermConfiguration other = (RenewalTermConfiguration) obj;
        if (other.getEnableAutoRenew() == null ^ this.getEnableAutoRenew() == null)
            return false;
        if (other.getEnableAutoRenew() != null && other.getEnableAutoRenew().equals(this.getEnableAutoRenew()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableAutoRenew() == null) ? 0 : getEnableAutoRenew().hashCode());
        return hashCode;
    }

    @Override
    public RenewalTermConfiguration clone() {
        try {
            return (RenewalTermConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.RenewalTermConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
