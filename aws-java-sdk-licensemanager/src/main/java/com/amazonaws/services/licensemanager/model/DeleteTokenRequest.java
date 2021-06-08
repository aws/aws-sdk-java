/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Token ID.
     * </p>
     */
    private String tokenId;

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @param tokenId
     *        Token ID.
     */

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @return Token ID.
     */

    public String getTokenId() {
        return this.tokenId;
    }

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @param tokenId
     *        Token ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTokenRequest withTokenId(String tokenId) {
        setTokenId(tokenId);
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
        if (getTokenId() != null)
            sb.append("TokenId: ").append(getTokenId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTokenRequest == false)
            return false;
        DeleteTokenRequest other = (DeleteTokenRequest) obj;
        if (other.getTokenId() == null ^ this.getTokenId() == null)
            return false;
        if (other.getTokenId() != null && other.getTokenId().equals(this.getTokenId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTokenRequest clone() {
        return (DeleteTokenRequest) super.clone();
    }

}
