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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that contain the information about the resource shares.
     * </p>
     */
    private java.util.List<ResourceShare> resourceShares;
    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that contain the information about the resource shares.
     * </p>
     * 
     * @return An array of objects that contain the information about the resource shares.
     */

    public java.util.List<ResourceShare> getResourceShares() {
        return resourceShares;
    }

    /**
     * <p>
     * An array of objects that contain the information about the resource shares.
     * </p>
     * 
     * @param resourceShares
     *        An array of objects that contain the information about the resource shares.
     */

    public void setResourceShares(java.util.Collection<ResourceShare> resourceShares) {
        if (resourceShares == null) {
            this.resourceShares = null;
            return;
        }

        this.resourceShares = new java.util.ArrayList<ResourceShare>(resourceShares);
    }

    /**
     * <p>
     * An array of objects that contain the information about the resource shares.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShares(java.util.Collection)} or {@link #withResourceShares(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceShares
     *        An array of objects that contain the information about the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesResult withResourceShares(ResourceShare... resourceShares) {
        if (this.resourceShares == null) {
            setResourceShares(new java.util.ArrayList<ResourceShare>(resourceShares.length));
        }
        for (ResourceShare ele : resourceShares) {
            this.resourceShares.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contain the information about the resource shares.
     * </p>
     * 
     * @param resourceShares
     *        An array of objects that contain the information about the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesResult withResourceShares(java.util.Collection<ResourceShare> resourceShares) {
        setResourceShares(resourceShares);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @return If present, this value indicates that more output is available than is included in the current response.
     *         Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *         get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesResult withNextToken(String nextToken) {
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
        if (getResourceShares() != null)
            sb.append("ResourceShares: ").append(getResourceShares()).append(",");
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

        if (obj instanceof GetResourceSharesResult == false)
            return false;
        GetResourceSharesResult other = (GetResourceSharesResult) obj;
        if (other.getResourceShares() == null ^ this.getResourceShares() == null)
            return false;
        if (other.getResourceShares() != null && other.getResourceShares().equals(this.getResourceShares()) == false)
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

        hashCode = prime * hashCode + ((getResourceShares() == null) ? 0 : getResourceShares().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceSharesResult clone() {
        try {
            return (GetResourceSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
