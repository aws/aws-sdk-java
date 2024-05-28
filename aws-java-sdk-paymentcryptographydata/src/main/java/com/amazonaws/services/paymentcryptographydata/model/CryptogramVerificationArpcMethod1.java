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
package com.amazonaws.services.paymentcryptographydata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters that are required for ARPC response generation using method1 after ARQC verification is successful.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/CryptogramVerificationArpcMethod1"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CryptogramVerificationArpcMethod1 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The auth code used to calculate APRC after ARQC verification is successful. This is the same auth code used for
     * ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     */
    private String authResponseCode;

    /**
     * <p>
     * The auth code used to calculate APRC after ARQC verification is successful. This is the same auth code used for
     * ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param authResponseCode
     *        The auth code used to calculate APRC after ARQC verification is successful. This is the same auth code
     *        used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     */

    public void setAuthResponseCode(String authResponseCode) {
        this.authResponseCode = authResponseCode;
    }

    /**
     * <p>
     * The auth code used to calculate APRC after ARQC verification is successful. This is the same auth code used for
     * ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The auth code used to calculate APRC after ARQC verification is successful. This is the same auth code
     *         used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     */

    public String getAuthResponseCode() {
        return this.authResponseCode;
    }

    /**
     * <p>
     * The auth code used to calculate APRC after ARQC verification is successful. This is the same auth code used for
     * ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param authResponseCode
     *        The auth code used to calculate APRC after ARQC verification is successful. This is the same auth code
     *        used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CryptogramVerificationArpcMethod1 withAuthResponseCode(String authResponseCode) {
        setAuthResponseCode(authResponseCode);
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
        if (getAuthResponseCode() != null)
            sb.append("AuthResponseCode: ").append(getAuthResponseCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CryptogramVerificationArpcMethod1 == false)
            return false;
        CryptogramVerificationArpcMethod1 other = (CryptogramVerificationArpcMethod1) obj;
        if (other.getAuthResponseCode() == null ^ this.getAuthResponseCode() == null)
            return false;
        if (other.getAuthResponseCode() != null && other.getAuthResponseCode().equals(this.getAuthResponseCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthResponseCode() == null) ? 0 : getAuthResponseCode().hashCode());
        return hashCode;
    }

    @Override
    public CryptogramVerificationArpcMethod1 clone() {
        try {
            return (CryptogramVerificationArpcMethod1) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.CryptogramVerificationArpcMethod1Marshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
