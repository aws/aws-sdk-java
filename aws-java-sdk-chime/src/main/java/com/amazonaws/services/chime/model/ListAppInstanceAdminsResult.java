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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstanceAdmins" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInstanceAdminsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The information for each administrator.
     * </p>
     */
    private java.util.List<AppInstanceAdminSummary> appInstanceAdmins;
    /**
     * <p>
     * The token returned from previous API requests until the number of administrators is reached.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstance</code>.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceAdminsResult withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The information for each administrator.
     * </p>
     * 
     * @return The information for each administrator.
     */

    public java.util.List<AppInstanceAdminSummary> getAppInstanceAdmins() {
        return appInstanceAdmins;
    }

    /**
     * <p>
     * The information for each administrator.
     * </p>
     * 
     * @param appInstanceAdmins
     *        The information for each administrator.
     */

    public void setAppInstanceAdmins(java.util.Collection<AppInstanceAdminSummary> appInstanceAdmins) {
        if (appInstanceAdmins == null) {
            this.appInstanceAdmins = null;
            return;
        }

        this.appInstanceAdmins = new java.util.ArrayList<AppInstanceAdminSummary>(appInstanceAdmins);
    }

    /**
     * <p>
     * The information for each administrator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInstanceAdmins(java.util.Collection)} or {@link #withAppInstanceAdmins(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param appInstanceAdmins
     *        The information for each administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceAdminsResult withAppInstanceAdmins(AppInstanceAdminSummary... appInstanceAdmins) {
        if (this.appInstanceAdmins == null) {
            setAppInstanceAdmins(new java.util.ArrayList<AppInstanceAdminSummary>(appInstanceAdmins.length));
        }
        for (AppInstanceAdminSummary ele : appInstanceAdmins) {
            this.appInstanceAdmins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information for each administrator.
     * </p>
     * 
     * @param appInstanceAdmins
     *        The information for each administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceAdminsResult withAppInstanceAdmins(java.util.Collection<AppInstanceAdminSummary> appInstanceAdmins) {
        setAppInstanceAdmins(appInstanceAdmins);
        return this;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of administrators is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of administrators is reached.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of administrators is reached.
     * </p>
     * 
     * @return The token returned from previous API requests until the number of administrators is reached.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of administrators is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of administrators is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceAdminsResult withNextToken(String nextToken) {
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getAppInstanceAdmins() != null)
            sb.append("AppInstanceAdmins: ").append(getAppInstanceAdmins()).append(",");
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

        if (obj instanceof ListAppInstanceAdminsResult == false)
            return false;
        ListAppInstanceAdminsResult other = (ListAppInstanceAdminsResult) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceAdmins() == null ^ this.getAppInstanceAdmins() == null)
            return false;
        if (other.getAppInstanceAdmins() != null && other.getAppInstanceAdmins().equals(this.getAppInstanceAdmins()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceAdmins() == null) ? 0 : getAppInstanceAdmins().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInstanceAdminsResult clone() {
        try {
            return (ListAppInstanceAdminsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
