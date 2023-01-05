/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceSharePermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateResourceSharePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share from which you want to disassociate a permission.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the permission to disassociate from the resource share. Changes to permissions take effect
     * immediately.
     * </p>
     */
    private String permissionArn;
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
     */
    private String clientToken;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share from which you want to disassociate a permission.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource share from which you want to disassociate a permission.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share from which you want to disassociate a permission.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of the resource share from which you want to disassociate a permission.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share from which you want to disassociate a permission.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource share from which you want to disassociate a permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceSharePermissionRequest withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the permission to disassociate from the resource share. Changes to permissions take effect
     * immediately.
     * </p>
     * 
     * @param permissionArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the permission to disassociate from the resource share. Changes to permissions take
     *        effect immediately.
     */

    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the permission to disassociate from the resource share. Changes to permissions take effect
     * immediately.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of the permission to disassociate from the resource share. Changes to permissions take
     *         effect immediately.
     */

    public String getPermissionArn() {
        return this.permissionArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the permission to disassociate from the resource share. Changes to permissions take effect
     * immediately.
     * </p>
     * 
     * @param permissionArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the permission to disassociate from the resource share. Changes to permissions take
     *        effect immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceSharePermissionRequest withPermissionArn(String permissionArn) {
        setPermissionArn(permissionArn);
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
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
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
     * 
     * @return Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *         This lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
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
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceSharePermissionRequest withClientToken(String clientToken) {
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
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getPermissionArn() != null)
            sb.append("PermissionArn: ").append(getPermissionArn()).append(",");
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

        if (obj instanceof DisassociateResourceSharePermissionRequest == false)
            return false;
        DisassociateResourceSharePermissionRequest other = (DisassociateResourceSharePermissionRequest) obj;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null && other.getPermissionArn().equals(this.getPermissionArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateResourceSharePermissionRequest clone() {
        return (DisassociateResourceSharePermissionRequest) super.clone();
    }

}
