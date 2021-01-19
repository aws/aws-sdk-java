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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     */
    private java.util.List<AppInstanceSummary> appInstances;
    /**
     * <p>
     * The token passed by previous API requests until the maximum number of <code>AppInstance</code>s is reached.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     * 
     * @return The information for each <code>AppInstance</code>.
     */

    public java.util.List<AppInstanceSummary> getAppInstances() {
        return appInstances;
    }

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstances
     *        The information for each <code>AppInstance</code>.
     */

    public void setAppInstances(java.util.Collection<AppInstanceSummary> appInstances) {
        if (appInstances == null) {
            this.appInstances = null;
            return;
        }

        this.appInstances = new java.util.ArrayList<AppInstanceSummary>(appInstances);
    }

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInstances(java.util.Collection)} or {@link #withAppInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param appInstances
     *        The information for each <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstancesResult withAppInstances(AppInstanceSummary... appInstances) {
        if (this.appInstances == null) {
            setAppInstances(new java.util.ArrayList<AppInstanceSummary>(appInstances.length));
        }
        for (AppInstanceSummary ele : appInstances) {
            this.appInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstances
     *        The information for each <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstancesResult withAppInstances(java.util.Collection<AppInstanceSummary> appInstances) {
        setAppInstances(appInstances);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API requests until the maximum number of <code>AppInstance</code>s is reached.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API requests until the maximum number of <code>AppInstance</code>s is
     *        reached.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API requests until the maximum number of <code>AppInstance</code>s is reached.
     * </p>
     * 
     * @return The token passed by previous API requests until the maximum number of <code>AppInstance</code>s is
     *         reached.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API requests until the maximum number of <code>AppInstance</code>s is reached.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API requests until the maximum number of <code>AppInstance</code>s is
     *        reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstancesResult withNextToken(String nextToken) {
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
        if (getAppInstances() != null)
            sb.append("AppInstances: ").append(getAppInstances()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppInstancesResult == false)
            return false;
        ListAppInstancesResult other = (ListAppInstancesResult) obj;
        if (other.getAppInstances() == null ^ this.getAppInstances() == null)
            return false;
        if (other.getAppInstances() != null && other.getAppInstances().equals(this.getAppInstances()) == false)
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

        hashCode = prime * hashCode + ((getAppInstances() == null) ? 0 : getAppInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInstancesResult clone() {
        try {
            return (ListAppInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
