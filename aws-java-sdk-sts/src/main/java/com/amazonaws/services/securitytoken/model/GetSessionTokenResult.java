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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>GetSessionToken</a> request, including temporary AWS credentials that can be
 * used to make AWS requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetSessionToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     */
    private Credentials credentials;

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     * 
     * @param credentials
     *        The temporary security credentials, which include an access key ID, a secret access key, and a security
     *        (or session) token.</p>
     *        <p>
     *        <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that
     *        you make no assumptions about the maximum size. As of this writing, the typical size is less than 4096
     *        bytes, but that can vary. Also, future updates to AWS might require larger sizes.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     * 
     * @return The temporary security credentials, which include an access key ID, a secret access key, and a security
     *         (or session) token.</p>
     *         <p>
     *         <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that
     *         you make no assumptions about the maximum size. As of this writing, the typical size is less than 4096
     *         bytes, but that can vary. Also, future updates to AWS might require larger sizes.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     * 
     * @param credentials
     *        The temporary security credentials, which include an access key ID, a secret access key, and a security
     *        (or session) token.</p>
     *        <p>
     *        <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that
     *        you make no assumptions about the maximum size. As of this writing, the typical size is less than 4096
     *        bytes, but that can vary. Also, future updates to AWS might require larger sizes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionTokenResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
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
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionTokenResult == false)
            return false;
        GetSessionTokenResult other = (GetSessionTokenResult) obj;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionTokenResult clone() {
        try {
            return (GetSessionTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
