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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CustomDNSServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDNSServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DNS server.
     * </p>
     */
    private String customDNSServerName;
    /**
     * <p>
     * The IP address of the DNS server.
     * </p>
     */
    private String customDNSServerIP;

    /**
     * <p>
     * The name of the DNS server.
     * </p>
     * 
     * @param customDNSServerName
     *        The name of the DNS server.
     */

    public void setCustomDNSServerName(String customDNSServerName) {
        this.customDNSServerName = customDNSServerName;
    }

    /**
     * <p>
     * The name of the DNS server.
     * </p>
     * 
     * @return The name of the DNS server.
     */

    public String getCustomDNSServerName() {
        return this.customDNSServerName;
    }

    /**
     * <p>
     * The name of the DNS server.
     * </p>
     * 
     * @param customDNSServerName
     *        The name of the DNS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDNSServer withCustomDNSServerName(String customDNSServerName) {
        setCustomDNSServerName(customDNSServerName);
        return this;
    }

    /**
     * <p>
     * The IP address of the DNS server.
     * </p>
     * 
     * @param customDNSServerIP
     *        The IP address of the DNS server.
     */

    public void setCustomDNSServerIP(String customDNSServerIP) {
        this.customDNSServerIP = customDNSServerIP;
    }

    /**
     * <p>
     * The IP address of the DNS server.
     * </p>
     * 
     * @return The IP address of the DNS server.
     */

    public String getCustomDNSServerIP() {
        return this.customDNSServerIP;
    }

    /**
     * <p>
     * The IP address of the DNS server.
     * </p>
     * 
     * @param customDNSServerIP
     *        The IP address of the DNS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDNSServer withCustomDNSServerIP(String customDNSServerIP) {
        setCustomDNSServerIP(customDNSServerIP);
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
        if (getCustomDNSServerName() != null)
            sb.append("CustomDNSServerName: ").append(getCustomDNSServerName()).append(",");
        if (getCustomDNSServerIP() != null)
            sb.append("CustomDNSServerIP: ").append(getCustomDNSServerIP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDNSServer == false)
            return false;
        CustomDNSServer other = (CustomDNSServer) obj;
        if (other.getCustomDNSServerName() == null ^ this.getCustomDNSServerName() == null)
            return false;
        if (other.getCustomDNSServerName() != null && other.getCustomDNSServerName().equals(this.getCustomDNSServerName()) == false)
            return false;
        if (other.getCustomDNSServerIP() == null ^ this.getCustomDNSServerIP() == null)
            return false;
        if (other.getCustomDNSServerIP() != null && other.getCustomDNSServerIP().equals(this.getCustomDNSServerIP()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDNSServerName() == null) ? 0 : getCustomDNSServerName().hashCode());
        hashCode = prime * hashCode + ((getCustomDNSServerIP() == null) ? 0 : getCustomDNSServerIP().hashCode());
        return hashCode;
    }

    @Override
    public CustomDNSServer clone() {
        try {
            return (CustomDNSServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.CustomDNSServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
