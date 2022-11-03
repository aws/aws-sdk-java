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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteCrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     */
    private String crlId;

    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     * 
     * @param crlId
     *        The unique identifier of the certificate revocation list (CRL).
     */

    public void setCrlId(String crlId) {
        this.crlId = crlId;
    }

    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     * 
     * @return The unique identifier of the certificate revocation list (CRL).
     */

    public String getCrlId() {
        return this.crlId;
    }

    /**
     * <p>
     * The unique identifier of the certificate revocation list (CRL).
     * </p>
     * 
     * @param crlId
     *        The unique identifier of the certificate revocation list (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCrlRequest withCrlId(String crlId) {
        setCrlId(crlId);
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
        if (getCrlId() != null)
            sb.append("CrlId: ").append(getCrlId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCrlRequest == false)
            return false;
        DeleteCrlRequest other = (DeleteCrlRequest) obj;
        if (other.getCrlId() == null ^ this.getCrlId() == null)
            return false;
        if (other.getCrlId() != null && other.getCrlId().equals(this.getCrlId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrlId() == null) ? 0 : getCrlId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCrlRequest clone() {
        return (DeleteCrlRequest) super.clone();
    }

}
