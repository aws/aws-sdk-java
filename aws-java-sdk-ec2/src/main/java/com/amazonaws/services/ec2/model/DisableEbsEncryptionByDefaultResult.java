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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableEbsEncryptionByDefaultResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Account-level encryption status after performing the action.
     * </p>
     */
    private Boolean ebsEncryptionByDefault;

    /**
     * <p>
     * Account-level encryption status after performing the action.
     * </p>
     * 
     * @param ebsEncryptionByDefault
     *        Account-level encryption status after performing the action.
     */

    public void setEbsEncryptionByDefault(Boolean ebsEncryptionByDefault) {
        this.ebsEncryptionByDefault = ebsEncryptionByDefault;
    }

    /**
     * <p>
     * Account-level encryption status after performing the action.
     * </p>
     * 
     * @return Account-level encryption status after performing the action.
     */

    public Boolean getEbsEncryptionByDefault() {
        return this.ebsEncryptionByDefault;
    }

    /**
     * <p>
     * Account-level encryption status after performing the action.
     * </p>
     * 
     * @param ebsEncryptionByDefault
     *        Account-level encryption status after performing the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableEbsEncryptionByDefaultResult withEbsEncryptionByDefault(Boolean ebsEncryptionByDefault) {
        setEbsEncryptionByDefault(ebsEncryptionByDefault);
        return this;
    }

    /**
     * <p>
     * Account-level encryption status after performing the action.
     * </p>
     * 
     * @return Account-level encryption status after performing the action.
     */

    public Boolean isEbsEncryptionByDefault() {
        return this.ebsEncryptionByDefault;
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
        if (getEbsEncryptionByDefault() != null)
            sb.append("EbsEncryptionByDefault: ").append(getEbsEncryptionByDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableEbsEncryptionByDefaultResult == false)
            return false;
        DisableEbsEncryptionByDefaultResult other = (DisableEbsEncryptionByDefaultResult) obj;
        if (other.getEbsEncryptionByDefault() == null ^ this.getEbsEncryptionByDefault() == null)
            return false;
        if (other.getEbsEncryptionByDefault() != null && other.getEbsEncryptionByDefault().equals(this.getEbsEncryptionByDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsEncryptionByDefault() == null) ? 0 : getEbsEncryptionByDefault().hashCode());
        return hashCode;
    }

    @Override
    public DisableEbsEncryptionByDefaultResult clone() {
        try {
            return (DisableEbsEncryptionByDefaultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
