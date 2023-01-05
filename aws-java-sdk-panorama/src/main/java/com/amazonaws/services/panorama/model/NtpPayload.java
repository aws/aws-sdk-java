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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Network time protocol (NTP) server settings. Use this option to connect to local NTP servers instead of
 * <code>pool.ntp.org</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NtpPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NtpPayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * NTP servers to use, in order of preference.
     * </p>
     */
    private java.util.List<String> ntpServers;

    /**
     * <p>
     * NTP servers to use, in order of preference.
     * </p>
     * 
     * @return NTP servers to use, in order of preference.
     */

    public java.util.List<String> getNtpServers() {
        return ntpServers;
    }

    /**
     * <p>
     * NTP servers to use, in order of preference.
     * </p>
     * 
     * @param ntpServers
     *        NTP servers to use, in order of preference.
     */

    public void setNtpServers(java.util.Collection<String> ntpServers) {
        if (ntpServers == null) {
            this.ntpServers = null;
            return;
        }

        this.ntpServers = new java.util.ArrayList<String>(ntpServers);
    }

    /**
     * <p>
     * NTP servers to use, in order of preference.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNtpServers(java.util.Collection)} or {@link #withNtpServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ntpServers
     *        NTP servers to use, in order of preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NtpPayload withNtpServers(String... ntpServers) {
        if (this.ntpServers == null) {
            setNtpServers(new java.util.ArrayList<String>(ntpServers.length));
        }
        for (String ele : ntpServers) {
            this.ntpServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * NTP servers to use, in order of preference.
     * </p>
     * 
     * @param ntpServers
     *        NTP servers to use, in order of preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NtpPayload withNtpServers(java.util.Collection<String> ntpServers) {
        setNtpServers(ntpServers);
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
        if (getNtpServers() != null)
            sb.append("NtpServers: ").append(getNtpServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NtpPayload == false)
            return false;
        NtpPayload other = (NtpPayload) obj;
        if (other.getNtpServers() == null ^ this.getNtpServers() == null)
            return false;
        if (other.getNtpServers() != null && other.getNtpServers().equals(this.getNtpServers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNtpServers() == null) ? 0 : getNtpServers().hashCode());
        return hashCode;
    }

    @Override
    public NtpPayload clone() {
        try {
            return (NtpPayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NtpPayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
