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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreateResourceShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an
     * OU or organization from AWS Organizations.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     */
    private Boolean allowExternalPrincipals;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param name
     *        The name of the resource share.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @return The name of the resource share.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param name
     *        The name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARN) of the resources to associate with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an
     * OU or organization from AWS Organizations.
     * </p>
     * 
     * @return The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN
     *         of an OU or organization from AWS Organizations.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an
     * OU or organization from AWS Organizations.
     * </p>
     * 
     * @param principals
     *        The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN
     *        of an OU or organization from AWS Organizations.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an
     * OU or organization from AWS Organizations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN
     *        of an OU or organization from AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an
     * OU or organization from AWS Organizations.
     * </p>
     * 
     * @param principals
     *        The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN
     *        of an OU or organization from AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Indicates whether principals outside your organization can be associated with a resource share.
     */

    public void setAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @return Indicates whether principals outside your organization can be associated with a resource share.
     */

    public Boolean getAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Indicates whether principals outside your organization can be associated with a resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        setAllowExternalPrincipals(allowExternalPrincipals);
        return this;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @return Indicates whether principals outside your organization can be associated with a resource share.
     */

    public Boolean isAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withClientToken(String clientToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateResourceShareRequest == false)
            return false;
        CreateResourceShareRequest other = (CreateResourceShareRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAllowExternalPrincipals() == null) ? 0 : getAllowExternalPrincipals().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceShareRequest clone() {
        return (CreateResourceShareRequest) super.clone();
    }

}
