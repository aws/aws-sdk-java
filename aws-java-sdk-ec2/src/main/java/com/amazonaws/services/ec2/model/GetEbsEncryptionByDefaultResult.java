/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class GetEbsEncryptionByDefaultResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     */
    private Boolean ebsEncryptionByDefault;

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     * 
     * @param ebsEncryptionByDefault
     *        Indicates whether encryption by default is enabled.
     */

    public void setEbsEncryptionByDefault(Boolean ebsEncryptionByDefault) {
        this.ebsEncryptionByDefault = ebsEncryptionByDefault;
    }

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     * 
     * @return Indicates whether encryption by default is enabled.
     */

    public Boolean getEbsEncryptionByDefault() {
        return this.ebsEncryptionByDefault;
    }

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     * 
     * @param ebsEncryptionByDefault
     *        Indicates whether encryption by default is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEbsEncryptionByDefaultResult withEbsEncryptionByDefault(Boolean ebsEncryptionByDefault) {
        setEbsEncryptionByDefault(ebsEncryptionByDefault);
        return this;
    }

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     * 
     * @return Indicates whether encryption by default is enabled.
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

        if (obj instanceof GetEbsEncryptionByDefaultResult == false)
            return false;
        GetEbsEncryptionByDefaultResult other = (GetEbsEncryptionByDefaultResult) obj;
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
    public GetEbsEncryptionByDefaultResult clone() {
        try {
            return (GetEbsEncryptionByDefaultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
