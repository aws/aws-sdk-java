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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authorization method used to send messages.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpAuthorization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     */
    private SigV4Authorization sigv4;

    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param sigv4
     *        Use Sig V4 authorization. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *        Process</a>.
     */

    public void setSigv4(SigV4Authorization sigv4) {
        this.sigv4 = sigv4;
    }

    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @return Use Sig V4 authorization. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *         Process</a>.
     */

    public SigV4Authorization getSigv4() {
        return this.sigv4;
    }

    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param sigv4
     *        Use Sig V4 authorization. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *        Process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpAuthorization withSigv4(SigV4Authorization sigv4) {
        setSigv4(sigv4);
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
        if (getSigv4() != null)
            sb.append("Sigv4: ").append(getSigv4());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpAuthorization == false)
            return false;
        HttpAuthorization other = (HttpAuthorization) obj;
        if (other.getSigv4() == null ^ this.getSigv4() == null)
            return false;
        if (other.getSigv4() != null && other.getSigv4().equals(this.getSigv4()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigv4() == null) ? 0 : getSigv4().hashCode());
        return hashCode;
    }

    @Override
    public HttpAuthorization clone() {
        try {
            return (HttpAuthorization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.HttpAuthorizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
