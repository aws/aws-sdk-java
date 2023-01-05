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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAgreement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgreementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as in any
     * other API calls that require that you specify the agreement ID.
     * </p>
     */
    private String agreementId;

    /**
     * <p>
     * The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as in any
     * other API calls that require that you specify the agreement ID.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as in
     *        any other API calls that require that you specify the agreement ID.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as in any
     * other API calls that require that you specify the agreement ID.
     * </p>
     * 
     * @return The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as
     *         in any other API calls that require that you specify the agreement ID.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as in any
     * other API calls that require that you specify the agreement ID.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as in
     *        any other API calls that require that you specify the agreement ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgreementResult withAgreementId(String agreementId) {
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

        if (obj instanceof CreateAgreementResult == false)
            return false;
        CreateAgreementResult other = (CreateAgreementResult) obj;
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
    public CreateAgreementResult clone() {
        try {
            return (CreateAgreementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
