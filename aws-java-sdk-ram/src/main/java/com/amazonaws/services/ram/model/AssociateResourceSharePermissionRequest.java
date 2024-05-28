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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceSharePermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResourceSharePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share to which you want to add or replace permissions.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the RAM permission to associate with the resource share. To find the ARN for a
     * permission, use either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     */
    private String permissionArn;
    /**
     * <p>
     * Specifies whether the specified permission should replace the existing permission associated with the resource
     * share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add the permission to
     * a resource share that currently doesn't have a permission. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * A resource share can have only one permission per resource type. If a resource share already has a permission for
     * the specified resource type and you don't set <code>replace</code> to <code>true</code> then the operation
     * returns an error. This helps prevent accidental overwriting of a permission.
     * </p>
     * </note>
     */
    private Boolean replace;
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
     * Specifies the version of the RAM permission to associate with the resource share. You can specify <i>only</i> the
     * version that is currently set as the default version for the permission. If you also set the <code>replace</code>
     * pararameter to <code>true</code>, then this operation updates an outdated version of the permission to the
     * current default version.
     * </p>
     * <note>
     * <p>
     * You don't need to specify this parameter because the default behavior is to use the version that is currently set
     * as the default version for the permission. This parameter is supported for backwards compatibility.
     * </p>
     * </note>
     */
    private Integer permissionVersion;

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share to which you want to add or replace permissions.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the resource share to which you want to add or replace permissions.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share to which you want to add or replace permissions.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the resource share to which you want to add or replace permissions.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share to which you want to add or replace permissions.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the resource share to which you want to add or replace permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceSharePermissionRequest withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the RAM permission to associate with the resource share. To find the ARN for a
     * permission, use either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the RAM permission to associate with the resource share. To find the ARN for a
     *        permission, use either the <a>ListPermissions</a> operation or go to the <a
     *        href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM
     *        console and then choose the name of the permission. The ARN is displayed on the detail page.
     */

    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the RAM permission to associate with the resource share. To find the ARN for a
     * permission, use either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the RAM permission to associate with the resource share. To find the ARN for a
     *         permission, use either the <a>ListPermissions</a> operation or go to the <a
     *         href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM
     *         console and then choose the name of the permission. The ARN is displayed on the detail page.
     */

    public String getPermissionArn() {
        return this.permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the RAM permission to associate with the resource share. To find the ARN for a
     * permission, use either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the RAM permission to associate with the resource share. To find the ARN for a
     *        permission, use either the <a>ListPermissions</a> operation or go to the <a
     *        href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM
     *        console and then choose the name of the permission. The ARN is displayed on the detail page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceSharePermissionRequest withPermissionArn(String permissionArn) {
        setPermissionArn(permissionArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether the specified permission should replace the existing permission associated with the resource
     * share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add the permission to
     * a resource share that currently doesn't have a permission. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * A resource share can have only one permission per resource type. If a resource share already has a permission for
     * the specified resource type and you don't set <code>replace</code> to <code>true</code> then the operation
     * returns an error. This helps prevent accidental overwriting of a permission.
     * </p>
     * </note>
     * 
     * @param replace
     *        Specifies whether the specified permission should replace the existing permission associated with the
     *        resource share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add
     *        the permission to a resource share that currently doesn't have a permission. The default value is
     *        <code>false</code>.</p> <note>
     *        <p>
     *        A resource share can have only one permission per resource type. If a resource share already has a
     *        permission for the specified resource type and you don't set <code>replace</code> to <code>true</code>
     *        then the operation returns an error. This helps prevent accidental overwriting of a permission.
     *        </p>
     */

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * Specifies whether the specified permission should replace the existing permission associated with the resource
     * share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add the permission to
     * a resource share that currently doesn't have a permission. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * A resource share can have only one permission per resource type. If a resource share already has a permission for
     * the specified resource type and you don't set <code>replace</code> to <code>true</code> then the operation
     * returns an error. This helps prevent accidental overwriting of a permission.
     * </p>
     * </note>
     * 
     * @return Specifies whether the specified permission should replace the existing permission associated with the
     *         resource share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add
     *         the permission to a resource share that currently doesn't have a permission. The default value is
     *         <code>false</code>.</p> <note>
     *         <p>
     *         A resource share can have only one permission per resource type. If a resource share already has a
     *         permission for the specified resource type and you don't set <code>replace</code> to <code>true</code>
     *         then the operation returns an error. This helps prevent accidental overwriting of a permission.
     *         </p>
     */

    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * <p>
     * Specifies whether the specified permission should replace the existing permission associated with the resource
     * share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add the permission to
     * a resource share that currently doesn't have a permission. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * A resource share can have only one permission per resource type. If a resource share already has a permission for
     * the specified resource type and you don't set <code>replace</code> to <code>true</code> then the operation
     * returns an error. This helps prevent accidental overwriting of a permission.
     * </p>
     * </note>
     * 
     * @param replace
     *        Specifies whether the specified permission should replace the existing permission associated with the
     *        resource share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add
     *        the permission to a resource share that currently doesn't have a permission. The default value is
     *        <code>false</code>.</p> <note>
     *        <p>
     *        A resource share can have only one permission per resource type. If a resource share already has a
     *        permission for the specified resource type and you don't set <code>replace</code> to <code>true</code>
     *        then the operation returns an error. This helps prevent accidental overwriting of a permission.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceSharePermissionRequest withReplace(Boolean replace) {
        setReplace(replace);
        return this;
    }

    /**
     * <p>
     * Specifies whether the specified permission should replace the existing permission associated with the resource
     * share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add the permission to
     * a resource share that currently doesn't have a permission. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * A resource share can have only one permission per resource type. If a resource share already has a permission for
     * the specified resource type and you don't set <code>replace</code> to <code>true</code> then the operation
     * returns an error. This helps prevent accidental overwriting of a permission.
     * </p>
     * </note>
     * 
     * @return Specifies whether the specified permission should replace the existing permission associated with the
     *         resource share. Use <code>true</code> to replace the current permissions. Use <code>false</code> to add
     *         the permission to a resource share that currently doesn't have a permission. The default value is
     *         <code>false</code>.</p> <note>
     *         <p>
     *         A resource share can have only one permission per resource type. If a resource share already has a
     *         permission for the specified resource type and you don't set <code>replace</code> to <code>true</code>
     *         then the operation returns an error. This helps prevent accidental overwriting of a permission.
     *         </p>
     */

    public Boolean isReplace() {
        return this.replace;
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

    public AssociateResourceSharePermissionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the version of the RAM permission to associate with the resource share. You can specify <i>only</i> the
     * version that is currently set as the default version for the permission. If you also set the <code>replace</code>
     * pararameter to <code>true</code>, then this operation updates an outdated version of the permission to the
     * current default version.
     * </p>
     * <note>
     * <p>
     * You don't need to specify this parameter because the default behavior is to use the version that is currently set
     * as the default version for the permission. This parameter is supported for backwards compatibility.
     * </p>
     * </note>
     * 
     * @param permissionVersion
     *        Specifies the version of the RAM permission to associate with the resource share. You can specify
     *        <i>only</i> the version that is currently set as the default version for the permission. If you also set
     *        the <code>replace</code> pararameter to <code>true</code>, then this operation updates an outdated version
     *        of the permission to the current default version.</p> <note>
     *        <p>
     *        You don't need to specify this parameter because the default behavior is to use the version that is
     *        currently set as the default version for the permission. This parameter is supported for backwards
     *        compatibility.
     *        </p>
     */

    public void setPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
    }

    /**
     * <p>
     * Specifies the version of the RAM permission to associate with the resource share. You can specify <i>only</i> the
     * version that is currently set as the default version for the permission. If you also set the <code>replace</code>
     * pararameter to <code>true</code>, then this operation updates an outdated version of the permission to the
     * current default version.
     * </p>
     * <note>
     * <p>
     * You don't need to specify this parameter because the default behavior is to use the version that is currently set
     * as the default version for the permission. This parameter is supported for backwards compatibility.
     * </p>
     * </note>
     * 
     * @return Specifies the version of the RAM permission to associate with the resource share. You can specify
     *         <i>only</i> the version that is currently set as the default version for the permission. If you also set
     *         the <code>replace</code> pararameter to <code>true</code>, then this operation updates an outdated
     *         version of the permission to the current default version.</p> <note>
     *         <p>
     *         You don't need to specify this parameter because the default behavior is to use the version that is
     *         currently set as the default version for the permission. This parameter is supported for backwards
     *         compatibility.
     *         </p>
     */

    public Integer getPermissionVersion() {
        return this.permissionVersion;
    }

    /**
     * <p>
     * Specifies the version of the RAM permission to associate with the resource share. You can specify <i>only</i> the
     * version that is currently set as the default version for the permission. If you also set the <code>replace</code>
     * pararameter to <code>true</code>, then this operation updates an outdated version of the permission to the
     * current default version.
     * </p>
     * <note>
     * <p>
     * You don't need to specify this parameter because the default behavior is to use the version that is currently set
     * as the default version for the permission. This parameter is supported for backwards compatibility.
     * </p>
     * </note>
     * 
     * @param permissionVersion
     *        Specifies the version of the RAM permission to associate with the resource share. You can specify
     *        <i>only</i> the version that is currently set as the default version for the permission. If you also set
     *        the <code>replace</code> pararameter to <code>true</code>, then this operation updates an outdated version
     *        of the permission to the current default version.</p> <note>
     *        <p>
     *        You don't need to specify this parameter because the default behavior is to use the version that is
     *        currently set as the default version for the permission. This parameter is supported for backwards
     *        compatibility.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceSharePermissionRequest withPermissionVersion(Integer permissionVersion) {
        setPermissionVersion(permissionVersion);
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
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getPermissionArn() != null)
            sb.append("PermissionArn: ").append(getPermissionArn()).append(",");
        if (getReplace() != null)
            sb.append("Replace: ").append(getReplace()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getPermissionVersion() != null)
            sb.append("PermissionVersion: ").append(getPermissionVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResourceSharePermissionRequest == false)
            return false;
        AssociateResourceSharePermissionRequest other = (AssociateResourceSharePermissionRequest) obj;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPermissionVersion() == null ^ this.getPermissionVersion() == null)
            return false;
        if (other.getPermissionVersion() != null && other.getPermissionVersion().equals(this.getPermissionVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPermissionVersion() == null) ? 0 : getPermissionVersion().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResourceSharePermissionRequest clone() {
        return (AssociateResourceSharePermissionRequest) super.clone();
    }

}
