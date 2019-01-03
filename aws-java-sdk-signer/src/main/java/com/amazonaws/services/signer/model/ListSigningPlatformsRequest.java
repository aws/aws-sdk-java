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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningPlatforms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSigningPlatformsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The category type of a signing platform.
     * </p>
     */
    private String category;
    /**
     * <p>
     * Any partner entities connected to a signing platform.
     * </p>
     */
    private String partner;
    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The maximum number of results to be returned by this operation.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The category type of a signing platform.
     * </p>
     * 
     * @param category
     *        The category type of a signing platform.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category type of a signing platform.
     * </p>
     * 
     * @return The category type of a signing platform.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category type of a signing platform.
     * </p>
     * 
     * @param category
     *        The category type of a signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * Any partner entities connected to a signing platform.
     * </p>
     * 
     * @param partner
     *        Any partner entities connected to a signing platform.
     */

    public void setPartner(String partner) {
        this.partner = partner;
    }

    /**
     * <p>
     * Any partner entities connected to a signing platform.
     * </p>
     * 
     * @return Any partner entities connected to a signing platform.
     */

    public String getPartner() {
        return this.partner;
    }

    /**
     * <p>
     * Any partner entities connected to a signing platform.
     * </p>
     * 
     * @param partner
     *        Any partner entities connected to a signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsRequest withPartner(String partner) {
        setPartner(partner);
        return this;
    }

    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     * 
     * @param target
     *        The validation template that is used by the target signing platform.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     * 
     * @return The validation template that is used by the target signing platform.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     * 
     * @param target
     *        The validation template that is used by the target signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsRequest withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned by this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned by this operation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned by this operation.
     * </p>
     * 
     * @return The maximum number of results to be returned by this operation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned by this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned by this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return. After you receive a response with
     *        truncated results, use this parameter in a subsequent request. Set it to the value of
     *        <code>nextToken</code> from the response that you just received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @return Value for specifying the next set of paginated results to return. After you receive a response with
     *         truncated results, use this parameter in a subsequent request. Set it to the value of
     *         <code>nextToken</code> from the response that you just received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return. After you receive a response with
     *        truncated results, use this parameter in a subsequent request. Set it to the value of
     *        <code>nextToken</code> from the response that you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsRequest withNextToken(String nextToken) {
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getPartner() != null)
            sb.append("Partner: ").append(getPartner()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListSigningPlatformsRequest == false)
            return false;
        ListSigningPlatformsRequest other = (ListSigningPlatformsRequest) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getPartner() == null ^ this.getPartner() == null)
            return false;
        if (other.getPartner() != null && other.getPartner().equals(this.getPartner()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getPartner() == null) ? 0 : getPartner().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSigningPlatformsRequest clone() {
        return (ListSigningPlatformsRequest) super.clone();
    }

}
