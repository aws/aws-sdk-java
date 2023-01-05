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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name and status of a customer agreement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CustomerAgreement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerAgreement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the agreement.
     * </p>
     */
    private String agreementName;
    /**
     * <p>
     * The status of the customer agreement. This will be either <code>signed</code> or <code>unsigned</code>
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the agreement.
     * </p>
     * 
     * @param agreementName
     *        The name of the agreement.
     */

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    /**
     * <p>
     * The name of the agreement.
     * </p>
     * 
     * @return The name of the agreement.
     */

    public String getAgreementName() {
        return this.agreementName;
    }

    /**
     * <p>
     * The name of the agreement.
     * </p>
     * 
     * @param agreementName
     *        The name of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgreement withAgreementName(String agreementName) {
        setAgreementName(agreementName);
        return this;
    }

    /**
     * <p>
     * The status of the customer agreement. This will be either <code>signed</code> or <code>unsigned</code>
     * </p>
     * 
     * @param status
     *        The status of the customer agreement. This will be either <code>signed</code> or <code>unsigned</code>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the customer agreement. This will be either <code>signed</code> or <code>unsigned</code>
     * </p>
     * 
     * @return The status of the customer agreement. This will be either <code>signed</code> or <code>unsigned</code>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the customer agreement. This will be either <code>signed</code> or <code>unsigned</code>
     * </p>
     * 
     * @param status
     *        The status of the customer agreement. This will be either <code>signed</code> or <code>unsigned</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgreement withStatus(String status) {
        setStatus(status);
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
        if (getAgreementName() != null)
            sb.append("AgreementName: ").append(getAgreementName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerAgreement == false)
            return false;
        CustomerAgreement other = (CustomerAgreement) obj;
        if (other.getAgreementName() == null ^ this.getAgreementName() == null)
            return false;
        if (other.getAgreementName() != null && other.getAgreementName().equals(this.getAgreementName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgreementName() == null) ? 0 : getAgreementName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CustomerAgreement clone() {
        try {
            return (CustomerAgreement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.CustomerAgreementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
