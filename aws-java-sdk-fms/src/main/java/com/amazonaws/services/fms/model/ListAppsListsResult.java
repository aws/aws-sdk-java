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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAppsLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>AppsListDataSummary</code> objects.
     * </p>
     */
    private java.util.List<AppsListDataSummary> appsLists;
    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>AppsListDataSummary</code> objects.
     * </p>
     * 
     * @return An array of <code>AppsListDataSummary</code> objects.
     */

    public java.util.List<AppsListDataSummary> getAppsLists() {
        return appsLists;
    }

    /**
     * <p>
     * An array of <code>AppsListDataSummary</code> objects.
     * </p>
     * 
     * @param appsLists
     *        An array of <code>AppsListDataSummary</code> objects.
     */

    public void setAppsLists(java.util.Collection<AppsListDataSummary> appsLists) {
        if (appsLists == null) {
            this.appsLists = null;
            return;
        }

        this.appsLists = new java.util.ArrayList<AppsListDataSummary>(appsLists);
    }

    /**
     * <p>
     * An array of <code>AppsListDataSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppsLists(java.util.Collection)} or {@link #withAppsLists(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param appsLists
     *        An array of <code>AppsListDataSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsListsResult withAppsLists(AppsListDataSummary... appsLists) {
        if (this.appsLists == null) {
            setAppsLists(new java.util.ArrayList<AppsListDataSummary>(appsLists.length));
        }
        for (AppsListDataSummary ele : appsLists) {
            this.appsLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>AppsListDataSummary</code> objects.
     * </p>
     * 
     * @param appsLists
     *        An array of <code>AppsListDataSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsListsResult withAppsLists(java.util.Collection<AppsListDataSummary> appsLists) {
        setAppsLists(appsLists);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *        the maximum, Firewall Manager returns this token in the response. You can use this token in subsequent
     *        requests to retrieve the next batch of objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     * 
     * @return If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *         the maximum, Firewall Manager returns this token in the response. You can use this token in subsequent
     *         requests to retrieve the next batch of objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *        the maximum, Firewall Manager returns this token in the response. You can use this token in subsequent
     *        requests to retrieve the next batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsListsResult withNextToken(String nextToken) {
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
        if (getAppsLists() != null)
            sb.append("AppsLists: ").append(getAppsLists()).append(",");
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

        if (obj instanceof ListAppsListsResult == false)
            return false;
        ListAppsListsResult other = (ListAppsListsResult) obj;
        if (other.getAppsLists() == null ^ this.getAppsLists() == null)
            return false;
        if (other.getAppsLists() != null && other.getAppsLists().equals(this.getAppsLists()) == false)
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

        hashCode = prime * hashCode + ((getAppsLists() == null) ? 0 : getAppsLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppsListsResult clone() {
        try {
            return (ListAppsListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
