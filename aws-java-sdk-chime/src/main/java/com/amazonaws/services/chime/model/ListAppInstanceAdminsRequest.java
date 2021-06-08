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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstanceAdmins" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInstanceAdminsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The maximum number of administrators that you want to return.
     * </p>
     */
    private Integer maxResults;
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

    public ListAppInstanceAdminsRequest withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of administrators that you want to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of administrators that you want to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of administrators that you want to return.
     * </p>
     * 
     * @return The maximum number of administrators that you want to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of administrators that you want to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of administrators that you want to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceAdminsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListAppInstanceAdminsRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListAppInstanceAdminsRequest == false)
            return false;
        ListAppInstanceAdminsRequest other = (ListAppInstanceAdminsRequest) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInstanceAdminsRequest clone() {
        return (ListAppInstanceAdminsRequest) super.clone();
    }

}
