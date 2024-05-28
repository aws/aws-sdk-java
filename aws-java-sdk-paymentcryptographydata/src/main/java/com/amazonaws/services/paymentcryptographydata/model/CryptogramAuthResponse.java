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
 * Parameters that are required for Authorization Response Cryptogram (ARPC) generation after Authorization Request
 * Cryptogram (ARQC) verification is successful.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/CryptogramAuthResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CryptogramAuthResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters that are required for ARPC response generation using method1 after ARQC verification is successful.
     * </p>
     */
    private CryptogramVerificationArpcMethod1 arpcMethod1;
    /**
     * <p>
     * Parameters that are required for ARPC response generation using method2 after ARQC verification is successful.
     * </p>
     */
    private CryptogramVerificationArpcMethod2 arpcMethod2;

    /**
     * <p>
     * Parameters that are required for ARPC response generation using method1 after ARQC verification is successful.
     * </p>
     * 
     * @param arpcMethod1
     *        Parameters that are required for ARPC response generation using method1 after ARQC verification is
     *        successful.
     */

    public void setArpcMethod1(CryptogramVerificationArpcMethod1 arpcMethod1) {
        this.arpcMethod1 = arpcMethod1;
    }

    /**
     * <p>
     * Parameters that are required for ARPC response generation using method1 after ARQC verification is successful.
     * </p>
     * 
     * @return Parameters that are required for ARPC response generation using method1 after ARQC verification is
     *         successful.
     */

    public CryptogramVerificationArpcMethod1 getArpcMethod1() {
        return this.arpcMethod1;
    }

    /**
     * <p>
     * Parameters that are required for ARPC response generation using method1 after ARQC verification is successful.
     * </p>
     * 
     * @param arpcMethod1
     *        Parameters that are required for ARPC response generation using method1 after ARQC verification is
     *        successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CryptogramAuthResponse withArpcMethod1(CryptogramVerificationArpcMethod1 arpcMethod1) {
        setArpcMethod1(arpcMethod1);
        return this;
    }

    /**
     * <p>
     * Parameters that are required for ARPC response generation using method2 after ARQC verification is successful.
     * </p>
     * 
     * @param arpcMethod2
     *        Parameters that are required for ARPC response generation using method2 after ARQC verification is
     *        successful.
     */

    public void setArpcMethod2(CryptogramVerificationArpcMethod2 arpcMethod2) {
        this.arpcMethod2 = arpcMethod2;
    }

    /**
     * <p>
     * Parameters that are required for ARPC response generation using method2 after ARQC verification is successful.
     * </p>
     * 
     * @return Parameters that are required for ARPC response generation using method2 after ARQC verification is
     *         successful.
     */

    public CryptogramVerificationArpcMethod2 getArpcMethod2() {
        return this.arpcMethod2;
    }

    /**
     * <p>
     * Parameters that are required for ARPC response generation using method2 after ARQC verification is successful.
     * </p>
     * 
     * @param arpcMethod2
     *        Parameters that are required for ARPC response generation using method2 after ARQC verification is
     *        successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CryptogramAuthResponse withArpcMethod2(CryptogramVerificationArpcMethod2 arpcMethod2) {
        setArpcMethod2(arpcMethod2);
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
        if (getArpcMethod1() != null)
            sb.append("ArpcMethod1: ").append(getArpcMethod1()).append(",");
        if (getArpcMethod2() != null)
            sb.append("ArpcMethod2: ").append(getArpcMethod2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CryptogramAuthResponse == false)
            return false;
        CryptogramAuthResponse other = (CryptogramAuthResponse) obj;
        if (other.getArpcMethod1() == null ^ this.getArpcMethod1() == null)
            return false;
        if (other.getArpcMethod1() != null && other.getArpcMethod1().equals(this.getArpcMethod1()) == false)
            return false;
        if (other.getArpcMethod2() == null ^ this.getArpcMethod2() == null)
            return false;
        if (other.getArpcMethod2() != null && other.getArpcMethod2().equals(this.getArpcMethod2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArpcMethod1() == null) ? 0 : getArpcMethod1().hashCode());
        hashCode = prime * hashCode + ((getArpcMethod2() == null) ? 0 : getArpcMethod2().hashCode());
        return hashCode;
    }

    @Override
    public CryptogramAuthResponse clone() {
        try {
            return (CryptogramAuthResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.CryptogramAuthResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
