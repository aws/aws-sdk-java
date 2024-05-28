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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies information needed to stream using the SRT protocol.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/Srt" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Srt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint to be used when streaming with IVS using the SRT protocol.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Auto-generated passphrase to enable encryption. This field is applicable only if the end user has <i>not</i>
     * enabled the <code>insecureIngest</code> option for the channel.
     * </p>
     */
    private String passphrase;

    /**
     * <p>
     * The endpoint to be used when streaming with IVS using the SRT protocol.
     * </p>
     * 
     * @param endpoint
     *        The endpoint to be used when streaming with IVS using the SRT protocol.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint to be used when streaming with IVS using the SRT protocol.
     * </p>
     * 
     * @return The endpoint to be used when streaming with IVS using the SRT protocol.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint to be used when streaming with IVS using the SRT protocol.
     * </p>
     * 
     * @param endpoint
     *        The endpoint to be used when streaming with IVS using the SRT protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Srt withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Auto-generated passphrase to enable encryption. This field is applicable only if the end user has <i>not</i>
     * enabled the <code>insecureIngest</code> option for the channel.
     * </p>
     * 
     * @param passphrase
     *        Auto-generated passphrase to enable encryption. This field is applicable only if the end user has
     *        <i>not</i> enabled the <code>insecureIngest</code> option for the channel.
     */

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    /**
     * <p>
     * Auto-generated passphrase to enable encryption. This field is applicable only if the end user has <i>not</i>
     * enabled the <code>insecureIngest</code> option for the channel.
     * </p>
     * 
     * @return Auto-generated passphrase to enable encryption. This field is applicable only if the end user has
     *         <i>not</i> enabled the <code>insecureIngest</code> option for the channel.
     */

    public String getPassphrase() {
        return this.passphrase;
    }

    /**
     * <p>
     * Auto-generated passphrase to enable encryption. This field is applicable only if the end user has <i>not</i>
     * enabled the <code>insecureIngest</code> option for the channel.
     * </p>
     * 
     * @param passphrase
     *        Auto-generated passphrase to enable encryption. This field is applicable only if the end user has
     *        <i>not</i> enabled the <code>insecureIngest</code> option for the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Srt withPassphrase(String passphrase) {
        setPassphrase(passphrase);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getPassphrase() != null)
            sb.append("Passphrase: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Srt == false)
            return false;
        Srt other = (Srt) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getPassphrase() == null ^ this.getPassphrase() == null)
            return false;
        if (other.getPassphrase() != null && other.getPassphrase().equals(this.getPassphrase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getPassphrase() == null) ? 0 : getPassphrase().hashCode());
        return hashCode;
    }

    @Override
    public Srt clone() {
        try {
            return (Srt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.SrtMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
