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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * KMS uses the authentication credential to sign requests that it sends to the external key store proxy (XKS proxy) on
 * your behalf. You establish these credentials on your external key store proxy and report them to KMS.
 * </p>
 * <p>
 * The <code>XksProxyAuthenticationCredential</code> includes two required elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/XksProxyAuthenticationCredentialType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksProxyAuthenticationCredentialType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
     * </p>
     */
    private String rawSecretAccessKey;

    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     * 
     * @param accessKeyId
     *        A unique identifier for the raw secret access key.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     * 
     * @return A unique identifier for the raw secret access key.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * A unique identifier for the raw secret access key.
     * </p>
     * 
     * @param accessKeyId
     *        A unique identifier for the raw secret access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XksProxyAuthenticationCredentialType withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
     * </p>
     * 
     * @param rawSecretAccessKey
     *        A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
     */

    public void setRawSecretAccessKey(String rawSecretAccessKey) {
        this.rawSecretAccessKey = rawSecretAccessKey;
    }

    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
     * </p>
     * 
     * @return A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
     */

    public String getRawSecretAccessKey() {
        return this.rawSecretAccessKey;
    }

    /**
     * <p>
     * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
     * </p>
     * 
     * @param rawSecretAccessKey
     *        A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XksProxyAuthenticationCredentialType withRawSecretAccessKey(String rawSecretAccessKey) {
        setRawSecretAccessKey(rawSecretAccessKey);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append("***Sensitive Data Redacted***").append(",");
        if (getRawSecretAccessKey() != null)
            sb.append("RawSecretAccessKey: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XksProxyAuthenticationCredentialType == false)
            return false;
        XksProxyAuthenticationCredentialType other = (XksProxyAuthenticationCredentialType) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getRawSecretAccessKey() == null ^ this.getRawSecretAccessKey() == null)
            return false;
        if (other.getRawSecretAccessKey() != null && other.getRawSecretAccessKey().equals(this.getRawSecretAccessKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getRawSecretAccessKey() == null) ? 0 : getRawSecretAccessKey().hashCode());
        return hashCode;
    }

    @Override
    public XksProxyAuthenticationCredentialType clone() {
        try {
            return (XksProxyAuthenticationCredentialType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.XksProxyAuthenticationCredentialTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
