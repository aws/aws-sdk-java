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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A dial request for a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DialRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DialRequest implements Serializable, Cloneable, StructuredPojo {

    private java.util.Map<String, String> attributes;

    private String clientToken;

    private java.util.Date expirationTime;

    private String phoneNumber;

    /**
     * @return
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * @param attributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see DialRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DialRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * @param expirationTime
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * @return
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @param expirationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialRequest withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * @param phoneNumber
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @param phoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DialRequest == false)
            return false;
        DialRequest other = (DialRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public DialRequest clone() {
        try {
            return (DialRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.DialRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
