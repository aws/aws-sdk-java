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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SIP address for the contact containing the URI and SIP address type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SipAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The type of the SIP address.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     * 
     * @param uri
     *        The URI for the SIP address.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     * 
     * @return The URI for the SIP address.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     * 
     * @param uri
     *        The URI for the SIP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipAddress withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * 
     * @param type
     *        The type of the SIP address.
     * @see SipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * 
     * @return The type of the SIP address.
     * @see SipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * 
     * @param type
     *        The type of the SIP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SipType
     */

    public SipAddress withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * 
     * @param type
     *        The type of the SIP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SipType
     */

    public SipAddress withType(SipType type) {
        this.type = type.toString();
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
        if (getUri() != null)
            sb.append("Uri: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SipAddress == false)
            return false;
        SipAddress other = (SipAddress) obj;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SipAddress clone() {
        try {
            return (SipAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.SipAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
