/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateCrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
     * </p>
     */
    private CrlDetail crl;

    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
     * </p>
     * 
     * @param crl
     *        The state of the certificate revocation list (CRL) after a read or write operation.
     */

    public void setCrl(CrlDetail crl) {
        this.crl = crl;
    }

    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
     * </p>
     * 
     * @return The state of the certificate revocation list (CRL) after a read or write operation.
     */

    public CrlDetail getCrl() {
        return this.crl;
    }

    /**
     * <p>
     * The state of the certificate revocation list (CRL) after a read or write operation.
     * </p>
     * 
     * @param crl
     *        The state of the certificate revocation list (CRL) after a read or write operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCrlResult withCrl(CrlDetail crl) {
        setCrl(crl);
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
        if (getCrl() != null)
            sb.append("Crl: ").append(getCrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCrlResult == false)
            return false;
        UpdateCrlResult other = (UpdateCrlResult) obj;
        if (other.getCrl() == null ^ this.getCrl() == null)
            return false;
        if (other.getCrl() != null && other.getCrl().equals(this.getCrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrl() == null) ? 0 : getCrl().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCrlResult clone() {
        try {
            return (UpdateCrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
