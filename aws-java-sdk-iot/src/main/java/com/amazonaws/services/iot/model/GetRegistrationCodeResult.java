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

/**
 * <p>
 * The output from the GetRegistrationCode operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegistrationCodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The CA certificate registration code.
     * </p>
     */
    private String registrationCode;

    /**
     * <p>
     * The CA certificate registration code.
     * </p>
     * 
     * @param registrationCode
     *        The CA certificate registration code.
     */

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    /**
     * <p>
     * The CA certificate registration code.
     * </p>
     * 
     * @return The CA certificate registration code.
     */

    public String getRegistrationCode() {
        return this.registrationCode;
    }

    /**
     * <p>
     * The CA certificate registration code.
     * </p>
     * 
     * @param registrationCode
     *        The CA certificate registration code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegistrationCodeResult withRegistrationCode(String registrationCode) {
        setRegistrationCode(registrationCode);
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
        if (getRegistrationCode() != null)
            sb.append("RegistrationCode: ").append(getRegistrationCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegistrationCodeResult == false)
            return false;
        GetRegistrationCodeResult other = (GetRegistrationCodeResult) obj;
        if (other.getRegistrationCode() == null ^ this.getRegistrationCode() == null)
            return false;
        if (other.getRegistrationCode() != null && other.getRegistrationCode().equals(this.getRegistrationCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationCode() == null) ? 0 : getRegistrationCode().hashCode());
        return hashCode;
    }

    @Override
    public GetRegistrationCodeResult clone() {
        try {
            return (GetRegistrationCodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
