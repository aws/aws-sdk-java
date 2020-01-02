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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTestGridSessionActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestGridSessionActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the session to retrieve.
     * </p>
     */
    private String sessionArn;
    /**
     * <p>
     * The maximum number of sessions to return per response.
     * </p>
     */
    private Integer maxResult;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the session to retrieve.
     * </p>
     * 
     * @param sessionArn
     *        The ARN of the session to retrieve.
     */

    public void setSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
    }

    /**
     * <p>
     * The ARN of the session to retrieve.
     * </p>
     * 
     * @return The ARN of the session to retrieve.
     */

    public String getSessionArn() {
        return this.sessionArn;
    }

    /**
     * <p>
     * The ARN of the session to retrieve.
     * </p>
     * 
     * @param sessionArn
     *        The ARN of the session to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionActionsRequest withSessionArn(String sessionArn) {
        setSessionArn(sessionArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of sessions to return per response.
     * </p>
     * 
     * @param maxResult
     *        The maximum number of sessions to return per response.
     */

    public void setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
    }

    /**
     * <p>
     * The maximum number of sessions to return per response.
     * </p>
     * 
     * @return The maximum number of sessions to return per response.
     */

    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * <p>
     * The maximum number of sessions to return per response.
     * </p>
     * 
     * @param maxResult
     *        The maximum number of sessions to return per response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionActionsRequest withMaxResult(Integer maxResult) {
        setMaxResult(maxResult);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionActionsRequest withNextToken(String nextToken) {
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
        if (getSessionArn() != null)
            sb.append("SessionArn: ").append(getSessionArn()).append(",");
        if (getMaxResult() != null)
            sb.append("MaxResult: ").append(getMaxResult()).append(",");
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

        if (obj instanceof ListTestGridSessionActionsRequest == false)
            return false;
        ListTestGridSessionActionsRequest other = (ListTestGridSessionActionsRequest) obj;
        if (other.getSessionArn() == null ^ this.getSessionArn() == null)
            return false;
        if (other.getSessionArn() != null && other.getSessionArn().equals(this.getSessionArn()) == false)
            return false;
        if (other.getMaxResult() == null ^ this.getMaxResult() == null)
            return false;
        if (other.getMaxResult() != null && other.getMaxResult().equals(this.getMaxResult()) == false)
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

        hashCode = prime * hashCode + ((getSessionArn() == null) ? 0 : getSessionArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResult() == null) ? 0 : getMaxResult().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestGridSessionActionsRequest clone() {
        return (ListTestGridSessionActionsRequest) super.clone();
    }

}
