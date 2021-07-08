/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAppsLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsListsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     * </p>
     */
    private Boolean defaultLists;
    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. For all but the first request, you provide the
     * token returned by the prior request in the request parameters, to retrieve the next batch of objects.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * <p>
     * If you don't specify this, Firewall Manager returns all available objects.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     * </p>
     * 
     * @param defaultLists
     *        Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     */

    public void setDefaultLists(Boolean defaultLists) {
        this.defaultLists = defaultLists;
    }

    /**
     * <p>
     * Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     * </p>
     * 
     * @return Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     */

    public Boolean getDefaultLists() {
        return this.defaultLists;
    }

    /**
     * <p>
     * Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     * </p>
     * 
     * @param defaultLists
     *        Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsListsRequest withDefaultLists(Boolean defaultLists) {
        setDefaultLists(defaultLists);
        return this;
    }

    /**
     * <p>
     * Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     * </p>
     * 
     * @return Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
     */

    public Boolean isDefaultLists() {
        return this.defaultLists;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. For all but the first request, you provide the
     * token returned by the prior request in the request parameters, to retrieve the next batch of objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *        the maximum, Firewall Manager returns this token in the response. For all but the first request, you
     *        provide the token returned by the prior request in the request parameters, to retrieve the next batch of
     *        objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. For all but the first request, you provide the
     * token returned by the prior request in the request parameters, to retrieve the next batch of objects.
     * </p>
     * 
     * @return If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *         the maximum, Firewall Manager returns this token in the response. For all but the first request, you
     *         provide the token returned by the prior request in the request parameters, to retrieve the next batch of
     *         objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. For all but the first request, you provide the
     * token returned by the prior request in the request parameters, to retrieve the next batch of objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *        the maximum, Firewall Manager returns this token in the response. For all but the first request, you
     *        provide the token returned by the prior request in the request parameters, to retrieve the next batch of
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsListsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * <p>
     * If you don't specify this, Firewall Manager returns all available objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Firewall Manager to return for this request. If more objects
     *        are available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use
     *        in a subsequent call to get the next batch of objects.</p>
     *        <p>
     *        If you don't specify this, Firewall Manager returns all available objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * <p>
     * If you don't specify this, Firewall Manager returns all available objects.
     * </p>
     * 
     * @return The maximum number of objects that you want Firewall Manager to return for this request. If more objects
     *         are available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use
     *         in a subsequent call to get the next batch of objects.</p>
     *         <p>
     *         If you don't specify this, Firewall Manager returns all available objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * <p>
     * If you don't specify this, Firewall Manager returns all available objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Firewall Manager to return for this request. If more objects
     *        are available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use
     *        in a subsequent call to get the next batch of objects.</p>
     *        <p>
     *        If you don't specify this, Firewall Manager returns all available objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsListsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getDefaultLists() != null)
            sb.append("DefaultLists: ").append(getDefaultLists()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppsListsRequest == false)
            return false;
        ListAppsListsRequest other = (ListAppsListsRequest) obj;
        if (other.getDefaultLists() == null ^ this.getDefaultLists() == null)
            return false;
        if (other.getDefaultLists() != null && other.getDefaultLists().equals(this.getDefaultLists()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultLists() == null) ? 0 : getDefaultLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAppsListsRequest clone() {
        return (ListAppsListsRequest) super.clone();
    }

}
