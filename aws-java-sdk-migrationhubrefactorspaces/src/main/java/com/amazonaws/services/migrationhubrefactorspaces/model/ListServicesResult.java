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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListServices"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of <code>ServiceSummary</code> objects.
     * </p>
     */
    private java.util.List<ServiceSummary> serviceSummaryList;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of <code>ServiceSummary</code> objects.
     * </p>
     * 
     * @return The list of <code>ServiceSummary</code> objects.
     */

    public java.util.List<ServiceSummary> getServiceSummaryList() {
        return serviceSummaryList;
    }

    /**
     * <p>
     * The list of <code>ServiceSummary</code> objects.
     * </p>
     * 
     * @param serviceSummaryList
     *        The list of <code>ServiceSummary</code> objects.
     */

    public void setServiceSummaryList(java.util.Collection<ServiceSummary> serviceSummaryList) {
        if (serviceSummaryList == null) {
            this.serviceSummaryList = null;
            return;
        }

        this.serviceSummaryList = new java.util.ArrayList<ServiceSummary>(serviceSummaryList);
    }

    /**
     * <p>
     * The list of <code>ServiceSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceSummaryList(java.util.Collection)} or {@link #withServiceSummaryList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serviceSummaryList
     *        The list of <code>ServiceSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServiceSummaryList(ServiceSummary... serviceSummaryList) {
        if (this.serviceSummaryList == null) {
            setServiceSummaryList(new java.util.ArrayList<ServiceSummary>(serviceSummaryList.length));
        }
        for (ServiceSummary ele : serviceSummaryList) {
            this.serviceSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>ServiceSummary</code> objects.
     * </p>
     * 
     * @param serviceSummaryList
     *        The list of <code>ServiceSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServiceSummaryList(java.util.Collection<ServiceSummary> serviceSummaryList) {
        setServiceSummaryList(serviceSummaryList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceSummaryList() != null)
            sb.append("ServiceSummaryList: ").append(getServiceSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicesResult == false)
            return false;
        ListServicesResult other = (ListServicesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceSummaryList() == null ^ this.getServiceSummaryList() == null)
            return false;
        if (other.getServiceSummaryList() != null && other.getServiceSummaryList().equals(this.getServiceSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceSummaryList() == null) ? 0 : getServiceSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesResult clone() {
        try {
            return (ListServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
