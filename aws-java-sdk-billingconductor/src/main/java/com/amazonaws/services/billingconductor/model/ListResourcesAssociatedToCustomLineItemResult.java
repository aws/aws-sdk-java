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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesAssociatedToCustomLineItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The custom line item ARN for which the resource associations are listed.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource association
     * retrieved.
     * </p>
     */
    private java.util.List<ListResourcesAssociatedToCustomLineItemResponseElement> associatedResources;
    /**
     * <p>
     * The pagination token to be used in subsequent requests to retrieve additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The custom line item ARN for which the resource associations are listed.
     * </p>
     * 
     * @param arn
     *        The custom line item ARN for which the resource associations are listed.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The custom line item ARN for which the resource associations are listed.
     * </p>
     * 
     * @return The custom line item ARN for which the resource associations are listed.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The custom line item ARN for which the resource associations are listed.
     * </p>
     * 
     * @param arn
     *        The custom line item ARN for which the resource associations are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource association
     * retrieved.
     * </p>
     * 
     * @return A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource
     *         association retrieved.
     */

    public java.util.List<ListResourcesAssociatedToCustomLineItemResponseElement> getAssociatedResources() {
        return associatedResources;
    }

    /**
     * <p>
     * A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource association
     * retrieved.
     * </p>
     * 
     * @param associatedResources
     *        A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource
     *        association retrieved.
     */

    public void setAssociatedResources(java.util.Collection<ListResourcesAssociatedToCustomLineItemResponseElement> associatedResources) {
        if (associatedResources == null) {
            this.associatedResources = null;
            return;
        }

        this.associatedResources = new java.util.ArrayList<ListResourcesAssociatedToCustomLineItemResponseElement>(associatedResources);
    }

    /**
     * <p>
     * A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource association
     * retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedResources(java.util.Collection)} or {@link #withAssociatedResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedResources
     *        A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource
     *        association retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemResult withAssociatedResources(ListResourcesAssociatedToCustomLineItemResponseElement... associatedResources) {
        if (this.associatedResources == null) {
            setAssociatedResources(new java.util.ArrayList<ListResourcesAssociatedToCustomLineItemResponseElement>(associatedResources.length));
        }
        for (ListResourcesAssociatedToCustomLineItemResponseElement ele : associatedResources) {
            this.associatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource association
     * retrieved.
     * </p>
     * 
     * @param associatedResources
     *        A list of <code>ListResourcesAssociatedToCustomLineItemResponseElement</code> for each resource
     *        association retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemResult withAssociatedResources(
            java.util.Collection<ListResourcesAssociatedToCustomLineItemResponseElement> associatedResources) {
        setAssociatedResources(associatedResources);
        return this;
    }

    /**
     * <p>
     * The pagination token to be used in subsequent requests to retrieve additional results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to be used in subsequent requests to retrieve additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to be used in subsequent requests to retrieve additional results.
     * </p>
     * 
     * @return The pagination token to be used in subsequent requests to retrieve additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to be used in subsequent requests to retrieve additional results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to be used in subsequent requests to retrieve additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAssociatedResources() != null)
            sb.append("AssociatedResources: ").append(getAssociatedResources()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesAssociatedToCustomLineItemResult == false)
            return false;
        ListResourcesAssociatedToCustomLineItemResult other = (ListResourcesAssociatedToCustomLineItemResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAssociatedResources() == null ^ this.getAssociatedResources() == null)
            return false;
        if (other.getAssociatedResources() != null && other.getAssociatedResources().equals(this.getAssociatedResources()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResources() == null) ? 0 : getAssociatedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesAssociatedToCustomLineItemResult clone() {
        try {
            return (ListResourcesAssociatedToCustomLineItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
