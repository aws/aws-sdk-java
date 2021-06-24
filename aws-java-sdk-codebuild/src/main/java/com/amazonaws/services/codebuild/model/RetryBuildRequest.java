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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/RetryBuild" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryBuildRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the identifier of the build to restart.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>RetryBuild</code> request.
     * The token is included in the <code>RetryBuild</code> request and is valid for five minutes. If you repeat the
     * <code>RetryBuild</code> request with the same token, but change a parameter, CodeBuild returns a parameter
     * mismatch error.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * Specifies the identifier of the build to restart.
     * </p>
     * 
     * @param id
     *        Specifies the identifier of the build to restart.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Specifies the identifier of the build to restart.
     * </p>
     * 
     * @return Specifies the identifier of the build to restart.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Specifies the identifier of the build to restart.
     * </p>
     * 
     * @param id
     *        Specifies the identifier of the build to restart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryBuildRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>RetryBuild</code> request.
     * The token is included in the <code>RetryBuild</code> request and is valid for five minutes. If you repeat the
     * <code>RetryBuild</code> request with the same token, but change a parameter, CodeBuild returns a parameter
     * mismatch error.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case sensitive identifier you provide to ensure the idempotency of the <code>RetryBuild</code>
     *        request. The token is included in the <code>RetryBuild</code> request and is valid for five minutes. If
     *        you repeat the <code>RetryBuild</code> request with the same token, but change a parameter, CodeBuild
     *        returns a parameter mismatch error.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>RetryBuild</code> request.
     * The token is included in the <code>RetryBuild</code> request and is valid for five minutes. If you repeat the
     * <code>RetryBuild</code> request with the same token, but change a parameter, CodeBuild returns a parameter
     * mismatch error.
     * </p>
     * 
     * @return A unique, case sensitive identifier you provide to ensure the idempotency of the <code>RetryBuild</code>
     *         request. The token is included in the <code>RetryBuild</code> request and is valid for five minutes. If
     *         you repeat the <code>RetryBuild</code> request with the same token, but change a parameter, CodeBuild
     *         returns a parameter mismatch error.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>RetryBuild</code> request.
     * The token is included in the <code>RetryBuild</code> request and is valid for five minutes. If you repeat the
     * <code>RetryBuild</code> request with the same token, but change a parameter, CodeBuild returns a parameter
     * mismatch error.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case sensitive identifier you provide to ensure the idempotency of the <code>RetryBuild</code>
     *        request. The token is included in the <code>RetryBuild</code> request and is valid for five minutes. If
     *        you repeat the <code>RetryBuild</code> request with the same token, but change a parameter, CodeBuild
     *        returns a parameter mismatch error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryBuildRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryBuildRequest == false)
            return false;
        RetryBuildRequest other = (RetryBuildRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public RetryBuildRequest clone() {
        return (RetryBuildRequest) super.clone();
    }

}
