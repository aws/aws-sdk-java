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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetDNSSEC" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDNSSECResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string repesenting the status of DNSSEC.
     * </p>
     */
    private DNSSECStatus status;
    /**
     * <p>
     * The key-signing keys (KSKs) in your account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KeySigningKey> keySigningKeys;

    /**
     * <p>
     * A string repesenting the status of DNSSEC.
     * </p>
     * 
     * @param status
     *        A string repesenting the status of DNSSEC.
     */

    public void setStatus(DNSSECStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * A string repesenting the status of DNSSEC.
     * </p>
     * 
     * @return A string repesenting the status of DNSSEC.
     */

    public DNSSECStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A string repesenting the status of DNSSEC.
     * </p>
     * 
     * @param status
     *        A string repesenting the status of DNSSEC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDNSSECResult withStatus(DNSSECStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The key-signing keys (KSKs) in your account.
     * </p>
     * 
     * @return The key-signing keys (KSKs) in your account.
     */

    public java.util.List<KeySigningKey> getKeySigningKeys() {
        if (keySigningKeys == null) {
            keySigningKeys = new com.amazonaws.internal.SdkInternalList<KeySigningKey>();
        }
        return keySigningKeys;
    }

    /**
     * <p>
     * The key-signing keys (KSKs) in your account.
     * </p>
     * 
     * @param keySigningKeys
     *        The key-signing keys (KSKs) in your account.
     */

    public void setKeySigningKeys(java.util.Collection<KeySigningKey> keySigningKeys) {
        if (keySigningKeys == null) {
            this.keySigningKeys = null;
            return;
        }

        this.keySigningKeys = new com.amazonaws.internal.SdkInternalList<KeySigningKey>(keySigningKeys);
    }

    /**
     * <p>
     * The key-signing keys (KSKs) in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySigningKeys(java.util.Collection)} or {@link #withKeySigningKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param keySigningKeys
     *        The key-signing keys (KSKs) in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDNSSECResult withKeySigningKeys(KeySigningKey... keySigningKeys) {
        if (this.keySigningKeys == null) {
            setKeySigningKeys(new com.amazonaws.internal.SdkInternalList<KeySigningKey>(keySigningKeys.length));
        }
        for (KeySigningKey ele : keySigningKeys) {
            this.keySigningKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-signing keys (KSKs) in your account.
     * </p>
     * 
     * @param keySigningKeys
     *        The key-signing keys (KSKs) in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDNSSECResult withKeySigningKeys(java.util.Collection<KeySigningKey> keySigningKeys) {
        setKeySigningKeys(keySigningKeys);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getKeySigningKeys() != null)
            sb.append("KeySigningKeys: ").append(getKeySigningKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDNSSECResult == false)
            return false;
        GetDNSSECResult other = (GetDNSSECResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKeySigningKeys() == null ^ this.getKeySigningKeys() == null)
            return false;
        if (other.getKeySigningKeys() != null && other.getKeySigningKeys().equals(this.getKeySigningKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKeySigningKeys() == null) ? 0 : getKeySigningKeys().hashCode());
        return hashCode;
    }

    @Override
    public GetDNSSECResult clone() {
        try {
            return (GetDNSSECResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
