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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermissionVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePermissionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the permission with the version you want to delete.
     * </p>
     */
    private String permissionArn;
    /**
     * <p>
     * Specifies the version number to delete.
     * </p>
     * <p>
     * You can't delete the default version for a customer managed permission.
     * </p>
     * <p>
     * You can't delete a version if it's the only version of the permission. You must either first create another
     * version, or delete the permission completely.
     * </p>
     * <p>
     * You can't delete a version if it is attached to any resource shares. If the version is the default, you must
     * first use <a>SetDefaultPermissionVersion</a> to set a different version as the default for the customer managed
     * permission, and then use <a>AssociateResourceSharePermission</a> to update your resource shares to use the new
     * default version.
     * </p>
     */
    private Integer permissionVersion;
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
     * Resource Name (ARN)</a> of the permission with the version you want to delete.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the permission with the version you want to delete.
     */

    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the permission with the version you want to delete.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the permission with the version you want to delete.
     */

    public String getPermissionArn() {
        return this.permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the permission with the version you want to delete.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the permission with the version you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePermissionVersionRequest withPermissionArn(String permissionArn) {
        setPermissionArn(permissionArn);
        return this;
    }

    /**
     * <p>
     * Specifies the version number to delete.
     * </p>
     * <p>
     * You can't delete the default version for a customer managed permission.
     * </p>
     * <p>
     * You can't delete a version if it's the only version of the permission. You must either first create another
     * version, or delete the permission completely.
     * </p>
     * <p>
     * You can't delete a version if it is attached to any resource shares. If the version is the default, you must
     * first use <a>SetDefaultPermissionVersion</a> to set a different version as the default for the customer managed
     * permission, and then use <a>AssociateResourceSharePermission</a> to update your resource shares to use the new
     * default version.
     * </p>
     * 
     * @param permissionVersion
     *        Specifies the version number to delete.</p>
     *        <p>
     *        You can't delete the default version for a customer managed permission.
     *        </p>
     *        <p>
     *        You can't delete a version if it's the only version of the permission. You must either first create
     *        another version, or delete the permission completely.
     *        </p>
     *        <p>
     *        You can't delete a version if it is attached to any resource shares. If the version is the default, you
     *        must first use <a>SetDefaultPermissionVersion</a> to set a different version as the default for the
     *        customer managed permission, and then use <a>AssociateResourceSharePermission</a> to update your resource
     *        shares to use the new default version.
     */

    public void setPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
    }

    /**
     * <p>
     * Specifies the version number to delete.
     * </p>
     * <p>
     * You can't delete the default version for a customer managed permission.
     * </p>
     * <p>
     * You can't delete a version if it's the only version of the permission. You must either first create another
     * version, or delete the permission completely.
     * </p>
     * <p>
     * You can't delete a version if it is attached to any resource shares. If the version is the default, you must
     * first use <a>SetDefaultPermissionVersion</a> to set a different version as the default for the customer managed
     * permission, and then use <a>AssociateResourceSharePermission</a> to update your resource shares to use the new
     * default version.
     * </p>
     * 
     * @return Specifies the version number to delete.</p>
     *         <p>
     *         You can't delete the default version for a customer managed permission.
     *         </p>
     *         <p>
     *         You can't delete a version if it's the only version of the permission. You must either first create
     *         another version, or delete the permission completely.
     *         </p>
     *         <p>
     *         You can't delete a version if it is attached to any resource shares. If the version is the default, you
     *         must first use <a>SetDefaultPermissionVersion</a> to set a different version as the default for the
     *         customer managed permission, and then use <a>AssociateResourceSharePermission</a> to update your resource
     *         shares to use the new default version.
     */

    public Integer getPermissionVersion() {
        return this.permissionVersion;
    }

    /**
     * <p>
     * Specifies the version number to delete.
     * </p>
     * <p>
     * You can't delete the default version for a customer managed permission.
     * </p>
     * <p>
     * You can't delete a version if it's the only version of the permission. You must either first create another
     * version, or delete the permission completely.
     * </p>
     * <p>
     * You can't delete a version if it is attached to any resource shares. If the version is the default, you must
     * first use <a>SetDefaultPermissionVersion</a> to set a different version as the default for the customer managed
     * permission, and then use <a>AssociateResourceSharePermission</a> to update your resource shares to use the new
     * default version.
     * </p>
     * 
     * @param permissionVersion
     *        Specifies the version number to delete.</p>
     *        <p>
     *        You can't delete the default version for a customer managed permission.
     *        </p>
     *        <p>
     *        You can't delete a version if it's the only version of the permission. You must either first create
     *        another version, or delete the permission completely.
     *        </p>
     *        <p>
     *        You can't delete a version if it is attached to any resource shares. If the version is the default, you
     *        must first use <a>SetDefaultPermissionVersion</a> to set a different version as the default for the
     *        customer managed permission, and then use <a>AssociateResourceSharePermission</a> to update your resource
     *        shares to use the new default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePermissionVersionRequest withPermissionVersion(Integer permissionVersion) {
        setPermissionVersion(permissionVersion);
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

    public DeletePermissionVersionRequest withClientToken(String clientToken) {
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
        if (getPermissionArn() != null)
            sb.append("PermissionArn: ").append(getPermissionArn()).append(",");
        if (getPermissionVersion() != null)
            sb.append("PermissionVersion: ").append(getPermissionVersion()).append(",");
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

        if (obj instanceof DeletePermissionVersionRequest == false)
            return false;
        DeletePermissionVersionRequest other = (DeletePermissionVersionRequest) obj;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        if (other.getPermissionVersion() == null ^ this.getPermissionVersion() == null)
            return false;
        if (other.getPermissionVersion() != null && other.getPermissionVersion().equals(this.getPermissionVersion()) == false)
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

        hashCode = prime * hashCode + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionVersion() == null) ? 0 : getPermissionVersion().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public DeletePermissionVersionRequest clone() {
        return (DeletePermissionVersionRequest) super.clone();
    }

}
