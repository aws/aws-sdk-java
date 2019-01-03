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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the CreateKeysAndCertificate operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeysAndCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     */
    private Boolean setAsActive;

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @param setAsActive
     *        Specifies whether the certificate is active.
     */

    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @return Specifies whether the certificate is active.
     */

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @param setAsActive
     *        Specifies whether the certificate is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeysAndCertificateRequest withSetAsActive(Boolean setAsActive) {
        setSetAsActive(setAsActive);
        return this;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @return Specifies whether the certificate is active.
     */

    public Boolean isSetAsActive() {
        return this.setAsActive;
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
        if (getSetAsActive() != null)
            sb.append("SetAsActive: ").append(getSetAsActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeysAndCertificateRequest == false)
            return false;
        CreateKeysAndCertificateRequest other = (CreateKeysAndCertificateRequest) obj;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeysAndCertificateRequest clone() {
        return (CreateKeysAndCertificateRequest) super.clone();
    }

}
