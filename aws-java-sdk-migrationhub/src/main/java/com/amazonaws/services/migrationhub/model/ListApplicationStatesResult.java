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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListApplicationStates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationStatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     */
    private java.util.List<ApplicationState> applicationStateList;
    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     * 
     * @return A list of Applications that exist in Application Discovery Service.
     */

    public java.util.List<ApplicationState> getApplicationStateList() {
        return applicationStateList;
    }

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     * 
     * @param applicationStateList
     *        A list of Applications that exist in Application Discovery Service.
     */

    public void setApplicationStateList(java.util.Collection<ApplicationState> applicationStateList) {
        if (applicationStateList == null) {
            this.applicationStateList = null;
            return;
        }

        this.applicationStateList = new java.util.ArrayList<ApplicationState>(applicationStateList);
    }

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationStateList(java.util.Collection)} or {@link #withApplicationStateList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param applicationStateList
     *        A list of Applications that exist in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationStatesResult withApplicationStateList(ApplicationState... applicationStateList) {
        if (this.applicationStateList == null) {
            setApplicationStateList(new java.util.ArrayList<ApplicationState>(applicationStateList.length));
        }
        for (ApplicationState ele : applicationStateList) {
            this.applicationStateList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     * 
     * @param applicationStateList
     *        A list of Applications that exist in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationStatesResult withApplicationStateList(java.util.Collection<ApplicationState> applicationStateList) {
        setApplicationStateList(applicationStateList);
        return this;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @return If a <code>NextToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in <code>NextToken</code>
     *         .
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationStatesResult withNextToken(String nextToken) {
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
        if (getApplicationStateList() != null)
            sb.append("ApplicationStateList: ").append(getApplicationStateList()).append(",");
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

        if (obj instanceof ListApplicationStatesResult == false)
            return false;
        ListApplicationStatesResult other = (ListApplicationStatesResult) obj;
        if (other.getApplicationStateList() == null ^ this.getApplicationStateList() == null)
            return false;
        if (other.getApplicationStateList() != null && other.getApplicationStateList().equals(this.getApplicationStateList()) == false)
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

        hashCode = prime * hashCode + ((getApplicationStateList() == null) ? 0 : getApplicationStateList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationStatesResult clone() {
        try {
            return (ListApplicationStatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
