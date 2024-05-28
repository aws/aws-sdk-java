/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ReplacePermissionAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplacePermissionAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to replace.
     * </p>
     */
    private String fromPermissionArn;
    /**
     * <p>
     * Specifies that you want to updated the permissions for only those resource shares that use the specified version
     * of the managed permission.
     * </p>
     */
    private Integer fromPermissionVersion;
    /**
     * <p>
     * Specifies the ARN of the managed permission that you want to associate with resource shares in place of the one
     * specified by <code>fromPerssionArn</code> and <code>fromPermissionVersion</code>.
     * </p>
     * <p>
     * The operation always associates the version that is currently the default for the specified managed permission.
     * </p>
     */
    private String toPermissionArn;
    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to replace.
     * </p>
     * 
     * @param fromPermissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the managed permission that you want to replace.
     */

    public void setFromPermissionArn(String fromPermissionArn) {
        this.fromPermissionArn = fromPermissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to replace.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the managed permission that you want to replace.
     */

    public String getFromPermissionArn() {
        return this.fromPermissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to replace.
     * </p>
     * 
     * @param fromPermissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the managed permission that you want to replace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsRequest withFromPermissionArn(String fromPermissionArn) {
        setFromPermissionArn(fromPermissionArn);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to updated the permissions for only those resource shares that use the specified version
     * of the managed permission.
     * </p>
     * 
     * @param fromPermissionVersion
     *        Specifies that you want to updated the permissions for only those resource shares that use the specified
     *        version of the managed permission.
     */

    public void setFromPermissionVersion(Integer fromPermissionVersion) {
        this.fromPermissionVersion = fromPermissionVersion;
    }

    /**
     * <p>
     * Specifies that you want to updated the permissions for only those resource shares that use the specified version
     * of the managed permission.
     * </p>
     * 
     * @return Specifies that you want to updated the permissions for only those resource shares that use the specified
     *         version of the managed permission.
     */

    public Integer getFromPermissionVersion() {
        return this.fromPermissionVersion;
    }

    /**
     * <p>
     * Specifies that you want to updated the permissions for only those resource shares that use the specified version
     * of the managed permission.
     * </p>
     * 
     * @param fromPermissionVersion
     *        Specifies that you want to updated the permissions for only those resource shares that use the specified
     *        version of the managed permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsRequest withFromPermissionVersion(Integer fromPermissionVersion) {
        setFromPermissionVersion(fromPermissionVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the managed permission that you want to associate with resource shares in place of the one
     * specified by <code>fromPerssionArn</code> and <code>fromPermissionVersion</code>.
     * </p>
     * <p>
     * The operation always associates the version that is currently the default for the specified managed permission.
     * </p>
     * 
     * @param toPermissionArn
     *        Specifies the ARN of the managed permission that you want to associate with resource shares in place of
     *        the one specified by <code>fromPerssionArn</code> and <code>fromPermissionVersion</code>.</p>
     *        <p>
     *        The operation always associates the version that is currently the default for the specified managed
     *        permission.
     */

    public void setToPermissionArn(String toPermissionArn) {
        this.toPermissionArn = toPermissionArn;
    }

    /**
     * <p>
     * Specifies the ARN of the managed permission that you want to associate with resource shares in place of the one
     * specified by <code>fromPerssionArn</code> and <code>fromPermissionVersion</code>.
     * </p>
     * <p>
     * The operation always associates the version that is currently the default for the specified managed permission.
     * </p>
     * 
     * @return Specifies the ARN of the managed permission that you want to associate with resource shares in place of
     *         the one specified by <code>fromPerssionArn</code> and <code>fromPermissionVersion</code>.</p>
     *         <p>
     *         The operation always associates the version that is currently the default for the specified managed
     *         permission.
     */

    public String getToPermissionArn() {
        return this.toPermissionArn;
    }

    /**
     * <p>
     * Specifies the ARN of the managed permission that you want to associate with resource shares in place of the one
     * specified by <code>fromPerssionArn</code> and <code>fromPermissionVersion</code>.
     * </p>
     * <p>
     * The operation always associates the version that is currently the default for the specified managed permission.
     * </p>
     * 
     * @param toPermissionArn
     *        Specifies the ARN of the managed permission that you want to associate with resource shares in place of
     *        the one specified by <code>fromPerssionArn</code> and <code>fromPermissionVersion</code>.</p>
     *        <p>
     *        The operation always associates the version that is currently the default for the specified managed
     *        permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsRequest withToPermissionArn(String toPermissionArn) {
        setToPermissionArn(toPermissionArn);
        return this;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *         This lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getFromPermissionArn() != null)
            sb.append("FromPermissionArn: ").append(getFromPermissionArn()).append(",");
        if (getFromPermissionVersion() != null)
            sb.append("FromPermissionVersion: ").append(getFromPermissionVersion()).append(",");
        if (getToPermissionArn() != null)
            sb.append("ToPermissionArn: ").append(getToPermissionArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplacePermissionAssociationsRequest == false)
            return false;
        ReplacePermissionAssociationsRequest other = (ReplacePermissionAssociationsRequest) obj;
        if (other.getFromPermissionArn() == null ^ this.getFromPermissionArn() == null)
            return false;
        if (other.getFromPermissionArn() != null && other.getFromPermissionArn().equals(this.getFromPermissionArn()) == false)
            return false;
        if (other.getFromPermissionVersion() == null ^ this.getFromPermissionVersion() == null)
            return false;
        if (other.getFromPermissionVersion() != null && other.getFromPermissionVersion().equals(this.getFromPermissionVersion()) == false)
            return false;
        if (other.getToPermissionArn() == null ^ this.getToPermissionArn() == null)
            return false;
        if (other.getToPermissionArn() != null && other.getToPermissionArn().equals(this.getToPermissionArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPermissionArn() == null) ? 0 : getFromPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getFromPermissionVersion() == null) ? 0 : getFromPermissionVersion().hashCode());
        hashCode = prime * hashCode + ((getToPermissionArn() == null) ? 0 : getToPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ReplacePermissionAssociationsRequest clone() {
        return (ReplacePermissionAssociationsRequest) super.clone();
    }

}
