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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreatePublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublicKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The request to add a public key to CloudFront.
     * </p>
     */
    private PublicKeyConfig publicKeyConfig;

    /**
     * <p>
     * The request to add a public key to CloudFront.
     * </p>
     * 
     * @param publicKeyConfig
     *        The request to add a public key to CloudFront.
     */

    public void setPublicKeyConfig(PublicKeyConfig publicKeyConfig) {
        this.publicKeyConfig = publicKeyConfig;
    }

    /**
     * <p>
     * The request to add a public key to CloudFront.
     * </p>
     * 
     * @return The request to add a public key to CloudFront.
     */

    public PublicKeyConfig getPublicKeyConfig() {
        return this.publicKeyConfig;
    }

    /**
     * <p>
     * The request to add a public key to CloudFront.
     * </p>
     * 
     * @param publicKeyConfig
     *        The request to add a public key to CloudFront.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicKeyRequest withPublicKeyConfig(PublicKeyConfig publicKeyConfig) {
        setPublicKeyConfig(publicKeyConfig);
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
        if (getPublicKeyConfig() != null)
            sb.append("PublicKeyConfig: ").append(getPublicKeyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicKeyRequest == false)
            return false;
        CreatePublicKeyRequest other = (CreatePublicKeyRequest) obj;
        if (other.getPublicKeyConfig() == null ^ this.getPublicKeyConfig() == null)
            return false;
        if (other.getPublicKeyConfig() != null && other.getPublicKeyConfig().equals(this.getPublicKeyConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicKeyConfig() == null) ? 0 : getPublicKeyConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreatePublicKeyRequest clone() {
        return (CreatePublicKeyRequest) super.clone();
    }

}
