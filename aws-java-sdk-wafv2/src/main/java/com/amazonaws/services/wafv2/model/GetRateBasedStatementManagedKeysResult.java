/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRateBasedStatementManagedKeys"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRateBasedStatementManagedKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The keys that are of Internet Protocol version 4 (IPv4).
     * </p>
     */
    private RateBasedStatementManagedKeysIPSet managedKeysIPV4;
    /**
     * <p>
     * The keys that are of Internet Protocol version 6 (IPv6).
     * </p>
     */
    private RateBasedStatementManagedKeysIPSet managedKeysIPV6;

    /**
     * <p>
     * The keys that are of Internet Protocol version 4 (IPv4).
     * </p>
     * 
     * @param managedKeysIPV4
     *        The keys that are of Internet Protocol version 4 (IPv4).
     */

    public void setManagedKeysIPV4(RateBasedStatementManagedKeysIPSet managedKeysIPV4) {
        this.managedKeysIPV4 = managedKeysIPV4;
    }

    /**
     * <p>
     * The keys that are of Internet Protocol version 4 (IPv4).
     * </p>
     * 
     * @return The keys that are of Internet Protocol version 4 (IPv4).
     */

    public RateBasedStatementManagedKeysIPSet getManagedKeysIPV4() {
        return this.managedKeysIPV4;
    }

    /**
     * <p>
     * The keys that are of Internet Protocol version 4 (IPv4).
     * </p>
     * 
     * @param managedKeysIPV4
     *        The keys that are of Internet Protocol version 4 (IPv4).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedStatementManagedKeysResult withManagedKeysIPV4(RateBasedStatementManagedKeysIPSet managedKeysIPV4) {
        setManagedKeysIPV4(managedKeysIPV4);
        return this;
    }

    /**
     * <p>
     * The keys that are of Internet Protocol version 6 (IPv6).
     * </p>
     * 
     * @param managedKeysIPV6
     *        The keys that are of Internet Protocol version 6 (IPv6).
     */

    public void setManagedKeysIPV6(RateBasedStatementManagedKeysIPSet managedKeysIPV6) {
        this.managedKeysIPV6 = managedKeysIPV6;
    }

    /**
     * <p>
     * The keys that are of Internet Protocol version 6 (IPv6).
     * </p>
     * 
     * @return The keys that are of Internet Protocol version 6 (IPv6).
     */

    public RateBasedStatementManagedKeysIPSet getManagedKeysIPV6() {
        return this.managedKeysIPV6;
    }

    /**
     * <p>
     * The keys that are of Internet Protocol version 6 (IPv6).
     * </p>
     * 
     * @param managedKeysIPV6
     *        The keys that are of Internet Protocol version 6 (IPv6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedStatementManagedKeysResult withManagedKeysIPV6(RateBasedStatementManagedKeysIPSet managedKeysIPV6) {
        setManagedKeysIPV6(managedKeysIPV6);
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
        if (getManagedKeysIPV4() != null)
            sb.append("ManagedKeysIPV4: ").append(getManagedKeysIPV4()).append(",");
        if (getManagedKeysIPV6() != null)
            sb.append("ManagedKeysIPV6: ").append(getManagedKeysIPV6());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRateBasedStatementManagedKeysResult == false)
            return false;
        GetRateBasedStatementManagedKeysResult other = (GetRateBasedStatementManagedKeysResult) obj;
        if (other.getManagedKeysIPV4() == null ^ this.getManagedKeysIPV4() == null)
            return false;
        if (other.getManagedKeysIPV4() != null && other.getManagedKeysIPV4().equals(this.getManagedKeysIPV4()) == false)
            return false;
        if (other.getManagedKeysIPV6() == null ^ this.getManagedKeysIPV6() == null)
            return false;
        if (other.getManagedKeysIPV6() != null && other.getManagedKeysIPV6().equals(this.getManagedKeysIPV6()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedKeysIPV4() == null) ? 0 : getManagedKeysIPV4().hashCode());
        hashCode = prime * hashCode + ((getManagedKeysIPV6() == null) ? 0 : getManagedKeysIPV6().hashCode());
        return hashCode;
    }

    @Override
    public GetRateBasedStatementManagedKeysResult clone() {
        try {
            return (GetRateBasedStatementManagedKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
