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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAgreement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgreementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     */
    private String agreementId;

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @param agreementId
     *        A unique identifier for the agreement. This identifier is returned when you create an agreement.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @return A unique identifier for the agreement. This identifier is returned when you create an agreement.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @param agreementId
     *        A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgreementResult withAgreementId(String agreementId) {
        setAgreementId(agreementId);
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
        if (getAgreementId() != null)
            sb.append("AgreementId: ").append(getAgreementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgreementResult == false)
            return false;
        UpdateAgreementResult other = (UpdateAgreementResult) obj;
        if (other.getAgreementId() == null ^ this.getAgreementId() == null)
            return false;
        if (other.getAgreementId() != null && other.getAgreementId().equals(this.getAgreementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgreementResult clone() {
        try {
            return (UpdateAgreementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
