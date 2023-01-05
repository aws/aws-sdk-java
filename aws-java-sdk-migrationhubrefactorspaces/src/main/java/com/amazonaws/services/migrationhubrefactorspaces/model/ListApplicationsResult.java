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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListApplications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <code>ApplicationSummary</code> objects.
     * </p>
     */
    private java.util.List<ApplicationSummary> applicationSummaryList;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of <code>ApplicationSummary</code> objects.
     * </p>
     * 
     * @return The list of <code>ApplicationSummary</code> objects.
     */

    public java.util.List<ApplicationSummary> getApplicationSummaryList() {
        return applicationSummaryList;
    }

    /**
     * <p>
     * The list of <code>ApplicationSummary</code> objects.
     * </p>
     * 
     * @param applicationSummaryList
     *        The list of <code>ApplicationSummary</code> objects.
     */

    public void setApplicationSummaryList(java.util.Collection<ApplicationSummary> applicationSummaryList) {
        if (applicationSummaryList == null) {
            this.applicationSummaryList = null;
            return;
        }

        this.applicationSummaryList = new java.util.ArrayList<ApplicationSummary>(applicationSummaryList);
    }

    /**
     * <p>
     * The list of <code>ApplicationSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationSummaryList(java.util.Collection)} or
     * {@link #withApplicationSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationSummaryList
     *        The list of <code>ApplicationSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplicationSummaryList(ApplicationSummary... applicationSummaryList) {
        if (this.applicationSummaryList == null) {
            setApplicationSummaryList(new java.util.ArrayList<ApplicationSummary>(applicationSummaryList.length));
        }
        for (ApplicationSummary ele : applicationSummaryList) {
            this.applicationSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>ApplicationSummary</code> objects.
     * </p>
     * 
     * @param applicationSummaryList
     *        The list of <code>ApplicationSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplicationSummaryList(java.util.Collection<ApplicationSummary> applicationSummaryList) {
        setApplicationSummaryList(applicationSummaryList);
        return this;
    }

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

    public ListApplicationsResult withNextToken(String nextToken) {
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
        if (getApplicationSummaryList() != null)
            sb.append("ApplicationSummaryList: ").append(getApplicationSummaryList()).append(",");
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

        if (obj instanceof ListApplicationsResult == false)
            return false;
        ListApplicationsResult other = (ListApplicationsResult) obj;
        if (other.getApplicationSummaryList() == null ^ this.getApplicationSummaryList() == null)
            return false;
        if (other.getApplicationSummaryList() != null && other.getApplicationSummaryList().equals(this.getApplicationSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getApplicationSummaryList() == null) ? 0 : getApplicationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsResult clone() {
        try {
            return (ListApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
