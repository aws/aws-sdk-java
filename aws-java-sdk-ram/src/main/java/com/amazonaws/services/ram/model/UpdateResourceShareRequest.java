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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UpdateResourceShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to modify.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * If specified, the new name that you want to attach to the resource share.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * </p>
     */
    private Boolean allowExternalPrincipals;
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
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to modify.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the resource share that you want to modify.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to modify.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resoure Name (ARN)</a> of the resource share that you want to modify.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to modify.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the resource share that you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceShareRequest withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * If specified, the new name that you want to attach to the resource share.
     * </p>
     * 
     * @param name
     *        If specified, the new name that you want to attach to the resource share.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If specified, the new name that you want to attach to the resource share.
     * </p>
     * 
     * @return If specified, the new name that you want to attach to the resource share.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * If specified, the new name that you want to attach to the resource share.
     * </p>
     * 
     * @param name
     *        If specified, the new name that you want to attach to the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceShareRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Specifies whether principals outside your organization in Organizations can be associated with a resource
     *        share.
     */

    public void setAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * </p>
     * 
     * @return Specifies whether principals outside your organization in Organizations can be associated with a resource
     *         share.
     */

    public Boolean getAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Specifies whether principals outside your organization in Organizations can be associated with a resource
     *        share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceShareRequest withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        setAllowExternalPrincipals(allowExternalPrincipals);
        return this;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * </p>
     * 
     * @return Specifies whether principals outside your organization in Organizations can be associated with a resource
     *         share.
     */

    public Boolean isAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
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

    public UpdateResourceShareRequest withClientToken(String clientToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAllowExternalPrincipals() != null)
            sb.append("AllowExternalPrincipals: ").append(getAllowExternalPrincipals()).append(",");
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

        if (obj instanceof UpdateResourceShareRequest == false)
            return false;
        UpdateResourceShareRequest other = (UpdateResourceShareRequest) obj;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAllowExternalPrincipals() == null ^ this.getAllowExternalPrincipals() == null)
            return false;
        if (other.getAllowExternalPrincipals() != null && other.getAllowExternalPrincipals().equals(this.getAllowExternalPrincipals()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAllowExternalPrincipals() == null) ? 0 : getAllowExternalPrincipals().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceShareRequest clone() {
        return (UpdateResourceShareRequest) super.clone();
    }

}
