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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListPublicKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPublicKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for this account.
     * </p>
     */
    private PublicKeyList publicKeyList;

    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param publicKeyList
     *        Returns a list of all public keys that have been added to CloudFront for this account.
     */

    public void setPublicKeyList(PublicKeyList publicKeyList) {
        this.publicKeyList = publicKeyList;
    }

    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @return Returns a list of all public keys that have been added to CloudFront for this account.
     */

    public PublicKeyList getPublicKeyList() {
        return this.publicKeyList;
    }

    /**
     * <p>
     * Returns a list of all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param publicKeyList
     *        Returns a list of all public keys that have been added to CloudFront for this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPublicKeysResult withPublicKeyList(PublicKeyList publicKeyList) {
        setPublicKeyList(publicKeyList);
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
        if (getPublicKeyList() != null)
            sb.append("PublicKeyList: ").append(getPublicKeyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPublicKeysResult == false)
            return false;
        ListPublicKeysResult other = (ListPublicKeysResult) obj;
        if (other.getPublicKeyList() == null ^ this.getPublicKeyList() == null)
            return false;
        if (other.getPublicKeyList() != null && other.getPublicKeyList().equals(this.getPublicKeyList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicKeyList() == null) ? 0 : getPublicKeyList().hashCode());
        return hashCode;
    }

    @Override
    public ListPublicKeysResult clone() {
        try {
            return (ListPublicKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
