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
 * Parameters to derive session key value using a MAC EMV algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/SessionKeyDerivationValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionKeyDerivationValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cryptogram provided by the terminal during transaction processing.
     * </p>
     */
    private String applicationCryptogram;
    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     */
    private String applicationTransactionCounter;

    /**
     * <p>
     * The cryptogram provided by the terminal during transaction processing.
     * </p>
     * 
     * @param applicationCryptogram
     *        The cryptogram provided by the terminal during transaction processing.
     */

    public void setApplicationCryptogram(String applicationCryptogram) {
        this.applicationCryptogram = applicationCryptogram;
    }

    /**
     * <p>
     * The cryptogram provided by the terminal during transaction processing.
     * </p>
     * 
     * @return The cryptogram provided by the terminal during transaction processing.
     */

    public String getApplicationCryptogram() {
        return this.applicationCryptogram;
    }

    /**
     * <p>
     * The cryptogram provided by the terminal during transaction processing.
     * </p>
     * 
     * @param applicationCryptogram
     *        The cryptogram provided by the terminal during transaction processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyDerivationValue withApplicationCryptogram(String applicationCryptogram) {
        setApplicationCryptogram(applicationCryptogram);
        return this;
    }

    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     * 
     * @param applicationTransactionCounter
     *        The transaction counter that is provided by the terminal during transaction processing.
     */

    public void setApplicationTransactionCounter(String applicationTransactionCounter) {
        this.applicationTransactionCounter = applicationTransactionCounter;
    }

    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     * 
     * @return The transaction counter that is provided by the terminal during transaction processing.
     */

    public String getApplicationTransactionCounter() {
        return this.applicationTransactionCounter;
    }

    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     * 
     * @param applicationTransactionCounter
     *        The transaction counter that is provided by the terminal during transaction processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyDerivationValue withApplicationTransactionCounter(String applicationTransactionCounter) {
        setApplicationTransactionCounter(applicationTransactionCounter);
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
        if (getApplicationCryptogram() != null)
            sb.append("ApplicationCryptogram: ").append(getApplicationCryptogram()).append(",");
        if (getApplicationTransactionCounter() != null)
            sb.append("ApplicationTransactionCounter: ").append(getApplicationTransactionCounter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionKeyDerivationValue == false)
            return false;
        SessionKeyDerivationValue other = (SessionKeyDerivationValue) obj;
        if (other.getApplicationCryptogram() == null ^ this.getApplicationCryptogram() == null)
            return false;
        if (other.getApplicationCryptogram() != null && other.getApplicationCryptogram().equals(this.getApplicationCryptogram()) == false)
            return false;
        if (other.getApplicationTransactionCounter() == null ^ this.getApplicationTransactionCounter() == null)
            return false;
        if (other.getApplicationTransactionCounter() != null
                && other.getApplicationTransactionCounter().equals(this.getApplicationTransactionCounter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationCryptogram() == null) ? 0 : getApplicationCryptogram().hashCode());
        hashCode = prime * hashCode + ((getApplicationTransactionCounter() == null) ? 0 : getApplicationTransactionCounter().hashCode());
        return hashCode;
    }

    @Override
    public SessionKeyDerivationValue clone() {
        try {
            return (SessionKeyDerivationValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.SessionKeyDerivationValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
