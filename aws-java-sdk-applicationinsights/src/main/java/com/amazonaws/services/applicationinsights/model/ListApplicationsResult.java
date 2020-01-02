/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListApplications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of applications.
     * </p>
     */
    private java.util.List<ApplicationInfo> applicationInfoList;
    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of applications.
     * </p>
     * 
     * @return The list of applications.
     */

    public java.util.List<ApplicationInfo> getApplicationInfoList() {
        return applicationInfoList;
    }

    /**
     * <p>
     * The list of applications.
     * </p>
     * 
     * @param applicationInfoList
     *        The list of applications.
     */

    public void setApplicationInfoList(java.util.Collection<ApplicationInfo> applicationInfoList) {
        if (applicationInfoList == null) {
            this.applicationInfoList = null;
            return;
        }

        this.applicationInfoList = new java.util.ArrayList<ApplicationInfo>(applicationInfoList);
    }

    /**
     * <p>
     * The list of applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationInfoList(java.util.Collection)} or {@link #withApplicationInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param applicationInfoList
     *        The list of applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplicationInfoList(ApplicationInfo... applicationInfoList) {
        if (this.applicationInfoList == null) {
            setApplicationInfoList(new java.util.ArrayList<ApplicationInfo>(applicationInfoList.length));
        }
        for (ApplicationInfo ele : applicationInfoList) {
            this.applicationInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of applications.
     * </p>
     * 
     * @param applicationInfoList
     *        The list of applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplicationInfoList(java.util.Collection<ApplicationInfo> applicationInfoList) {
        setApplicationInfoList(applicationInfoList);
        return this;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
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
        if (getApplicationInfoList() != null)
            sb.append("ApplicationInfoList: ").append(getApplicationInfoList()).append(",");
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
        if (other.getApplicationInfoList() == null ^ this.getApplicationInfoList() == null)
            return false;
        if (other.getApplicationInfoList() != null && other.getApplicationInfoList().equals(this.getApplicationInfoList()) == false)
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

        hashCode = prime * hashCode + ((getApplicationInfoList() == null) ? 0 : getApplicationInfoList().hashCode());
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
