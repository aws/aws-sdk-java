/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the IP address where the scanned port is located.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ActionLocalIpDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionLocalIpDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String ipAddressV4;

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ipAddressV4
     *        The IP address.
     */

    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getIpAddressV4() {
        return this.ipAddressV4;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ipAddressV4
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionLocalIpDetails withIpAddressV4(String ipAddressV4) {
        setIpAddressV4(ipAddressV4);
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
        if (getIpAddressV4() != null)
            sb.append("IpAddressV4: ").append(getIpAddressV4());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionLocalIpDetails == false)
            return false;
        ActionLocalIpDetails other = (ActionLocalIpDetails) obj;
        if (other.getIpAddressV4() == null ^ this.getIpAddressV4() == null)
            return false;
        if (other.getIpAddressV4() != null && other.getIpAddressV4().equals(this.getIpAddressV4()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddressV4() == null) ? 0 : getIpAddressV4().hashCode());
        return hashCode;
    }

    @Override
    public ActionLocalIpDetails clone() {
        try {
            return (ActionLocalIpDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ActionLocalIpDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
