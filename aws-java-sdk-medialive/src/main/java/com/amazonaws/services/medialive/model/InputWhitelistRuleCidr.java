/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An IPv4 CIDR to whitelist.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputWhitelistRuleCidr" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputWhitelistRuleCidr implements Serializable, Cloneable, StructuredPojo {

    /** The IPv4 CIDR to whitelist. */
    private String cidr;

    /**
     * The IPv4 CIDR to whitelist.
     * 
     * @param cidr
     *        The IPv4 CIDR to whitelist.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * The IPv4 CIDR to whitelist.
     * 
     * @return The IPv4 CIDR to whitelist.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * The IPv4 CIDR to whitelist.
     * 
     * @param cidr
     *        The IPv4 CIDR to whitelist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputWhitelistRuleCidr withCidr(String cidr) {
        setCidr(cidr);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputWhitelistRuleCidr == false)
            return false;
        InputWhitelistRuleCidr other = (InputWhitelistRuleCidr) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public InputWhitelistRuleCidr clone() {
        try {
            return (InputWhitelistRuleCidr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputWhitelistRuleCidrMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
