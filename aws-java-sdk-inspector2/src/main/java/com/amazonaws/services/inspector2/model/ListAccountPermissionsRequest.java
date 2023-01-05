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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListAccountPermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The service scan type to check permissions for.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountPermissionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code>
     *         value returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountPermissionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The service scan type to check permissions for.
     * </p>
     * 
     * @param service
     *        The service scan type to check permissions for.
     * @see Service
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The service scan type to check permissions for.
     * </p>
     * 
     * @return The service scan type to check permissions for.
     * @see Service
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The service scan type to check permissions for.
     * </p>
     * 
     * @param service
     *        The service scan type to check permissions for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public ListAccountPermissionsRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The service scan type to check permissions for.
     * </p>
     * 
     * @param service
     *        The service scan type to check permissions for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public ListAccountPermissionsRequest withService(Service service) {
        this.service = service.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountPermissionsRequest == false)
            return false;
        ListAccountPermissionsRequest other = (ListAccountPermissionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountPermissionsRequest clone() {
        return (ListAccountPermissionsRequest) super.clone();
    }

}
