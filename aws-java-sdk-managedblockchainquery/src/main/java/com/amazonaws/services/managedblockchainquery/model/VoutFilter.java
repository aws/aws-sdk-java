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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This container specifies filtering attributes related to <code>BITCOIN_VOUT</code> event types
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/VoutFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoutFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if the transaction output is spent or unspent.
     * </p>
     */
    private Boolean voutSpent;

    /**
     * <p>
     * Specifies if the transaction output is spent or unspent.
     * </p>
     * 
     * @param voutSpent
     *        Specifies if the transaction output is spent or unspent.
     */

    public void setVoutSpent(Boolean voutSpent) {
        this.voutSpent = voutSpent;
    }

    /**
     * <p>
     * Specifies if the transaction output is spent or unspent.
     * </p>
     * 
     * @return Specifies if the transaction output is spent or unspent.
     */

    public Boolean getVoutSpent() {
        return this.voutSpent;
    }

    /**
     * <p>
     * Specifies if the transaction output is spent or unspent.
     * </p>
     * 
     * @param voutSpent
     *        Specifies if the transaction output is spent or unspent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoutFilter withVoutSpent(Boolean voutSpent) {
        setVoutSpent(voutSpent);
        return this;
    }

    /**
     * <p>
     * Specifies if the transaction output is spent or unspent.
     * </p>
     * 
     * @return Specifies if the transaction output is spent or unspent.
     */

    public Boolean isVoutSpent() {
        return this.voutSpent;
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
        if (getVoutSpent() != null)
            sb.append("VoutSpent: ").append(getVoutSpent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoutFilter == false)
            return false;
        VoutFilter other = (VoutFilter) obj;
        if (other.getVoutSpent() == null ^ this.getVoutSpent() == null)
            return false;
        if (other.getVoutSpent() != null && other.getVoutSpent().equals(this.getVoutSpent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoutSpent() == null) ? 0 : getVoutSpent().hashCode());
        return hashCode;
    }

    @Override
    public VoutFilter clone() {
        try {
            return (VoutFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.VoutFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
