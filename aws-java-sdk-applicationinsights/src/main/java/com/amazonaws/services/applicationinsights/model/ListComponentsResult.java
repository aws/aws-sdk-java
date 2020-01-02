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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListComponents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of application components.
     * </p>
     */
    private java.util.List<ApplicationComponent> applicationComponentList;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of application components.
     * </p>
     * 
     * @return The list of application components.
     */

    public java.util.List<ApplicationComponent> getApplicationComponentList() {
        return applicationComponentList;
    }

    /**
     * <p>
     * The list of application components.
     * </p>
     * 
     * @param applicationComponentList
     *        The list of application components.
     */

    public void setApplicationComponentList(java.util.Collection<ApplicationComponent> applicationComponentList) {
        if (applicationComponentList == null) {
            this.applicationComponentList = null;
            return;
        }

        this.applicationComponentList = new java.util.ArrayList<ApplicationComponent>(applicationComponentList);
    }

    /**
     * <p>
     * The list of application components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationComponentList(java.util.Collection)} or
     * {@link #withApplicationComponentList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationComponentList
     *        The list of application components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withApplicationComponentList(ApplicationComponent... applicationComponentList) {
        if (this.applicationComponentList == null) {
            setApplicationComponentList(new java.util.ArrayList<ApplicationComponent>(applicationComponentList.length));
        }
        for (ApplicationComponent ele : applicationComponentList) {
            this.applicationComponentList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of application components.
     * </p>
     * 
     * @param applicationComponentList
     *        The list of application components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withApplicationComponentList(java.util.Collection<ApplicationComponent> applicationComponentList) {
        setApplicationComponentList(applicationComponentList);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withNextToken(String nextToken) {
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
        if (getApplicationComponentList() != null)
            sb.append("ApplicationComponentList: ").append(getApplicationComponentList()).append(",");
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

        if (obj instanceof ListComponentsResult == false)
            return false;
        ListComponentsResult other = (ListComponentsResult) obj;
        if (other.getApplicationComponentList() == null ^ this.getApplicationComponentList() == null)
            return false;
        if (other.getApplicationComponentList() != null && other.getApplicationComponentList().equals(this.getApplicationComponentList()) == false)
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

        hashCode = prime * hashCode + ((getApplicationComponentList() == null) ? 0 : getApplicationComponentList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentsResult clone() {
        try {
            return (ListComponentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
