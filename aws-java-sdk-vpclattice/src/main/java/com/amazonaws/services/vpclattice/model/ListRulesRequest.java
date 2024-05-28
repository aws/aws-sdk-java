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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerIdentifier;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceIdentifier;

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerIdentifier(String listenerIdentifier) {
        this.listenerIdentifier = listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerIdentifier() {
        return this.listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withListenerIdentifier(String listenerIdentifier) {
        setListenerIdentifier(listenerIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     * 
     * @return A pagination token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withServiceIdentifier(String serviceIdentifier) {
        setServiceIdentifier(serviceIdentifier);
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
        if (getListenerIdentifier() != null)
            sb.append("ListenerIdentifier: ").append(getListenerIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceIdentifier() != null)
            sb.append("ServiceIdentifier: ").append(getServiceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRulesRequest == false)
            return false;
        ListRulesRequest other = (ListRulesRequest) obj;
        if (other.getListenerIdentifier() == null ^ this.getListenerIdentifier() == null)
            return false;
        if (other.getListenerIdentifier() != null && other.getListenerIdentifier().equals(this.getListenerIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceIdentifier() == null ^ this.getServiceIdentifier() == null)
            return false;
        if (other.getServiceIdentifier() != null && other.getServiceIdentifier().equals(this.getServiceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerIdentifier() == null) ? 0 : getListenerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceIdentifier() == null) ? 0 : getServiceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListRulesRequest clone() {
        return (ListRulesRequest) super.clone();
    }

}
