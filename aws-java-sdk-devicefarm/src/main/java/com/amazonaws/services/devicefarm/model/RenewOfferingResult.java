/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a renewal offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/RenewOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenewOfferingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the status of the offering transaction for the renewal.
     * </p>
     */
    private OfferingTransaction offeringTransaction;

    /**
     * <p>
     * Represents the status of the offering transaction for the renewal.
     * </p>
     * 
     * @param offeringTransaction
     *        Represents the status of the offering transaction for the renewal.
     */

    public void setOfferingTransaction(OfferingTransaction offeringTransaction) {
        this.offeringTransaction = offeringTransaction;
    }

    /**
     * <p>
     * Represents the status of the offering transaction for the renewal.
     * </p>
     * 
     * @return Represents the status of the offering transaction for the renewal.
     */

    public OfferingTransaction getOfferingTransaction() {
        return this.offeringTransaction;
    }

    /**
     * <p>
     * Represents the status of the offering transaction for the renewal.
     * </p>
     * 
     * @param offeringTransaction
     *        Represents the status of the offering transaction for the renewal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewOfferingResult withOfferingTransaction(OfferingTransaction offeringTransaction) {
        setOfferingTransaction(offeringTransaction);
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
        if (getOfferingTransaction() != null)
            sb.append("OfferingTransaction: ").append(getOfferingTransaction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenewOfferingResult == false)
            return false;
        RenewOfferingResult other = (RenewOfferingResult) obj;
        if (other.getOfferingTransaction() == null ^ this.getOfferingTransaction() == null)
            return false;
        if (other.getOfferingTransaction() != null && other.getOfferingTransaction().equals(this.getOfferingTransaction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingTransaction() == null) ? 0 : getOfferingTransaction().hashCode());
        return hashCode;
    }

    @Override
    public RenewOfferingResult clone() {
        try {
            return (RenewOfferingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
