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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListStatements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStatementsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Session ID of the statements.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The origin of the request to list statements.
     * </p>
     */
    private String requestOrigin;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Session ID of the statements.
     * </p>
     * 
     * @param sessionId
     *        The Session ID of the statements.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The Session ID of the statements.
     * </p>
     * 
     * @return The Session ID of the statements.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The Session ID of the statements.
     * </p>
     * 
     * @param sessionId
     *        The Session ID of the statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The origin of the request to list statements.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request to list statements.
     */

    public void setRequestOrigin(String requestOrigin) {
        this.requestOrigin = requestOrigin;
    }

    /**
     * <p>
     * The origin of the request to list statements.
     * </p>
     * 
     * @return The origin of the request to list statements.
     */

    public String getRequestOrigin() {
        return this.requestOrigin;
    }

    /**
     * <p>
     * The origin of the request to list statements.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request to list statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsRequest withRequestOrigin(String requestOrigin) {
        setRequestOrigin(requestOrigin);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsRequest withNextToken(String nextToken) {
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getRequestOrigin() != null)
            sb.append("RequestOrigin: ").append(getRequestOrigin()).append(",");
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

        if (obj instanceof ListStatementsRequest == false)
            return false;
        ListStatementsRequest other = (ListStatementsRequest) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getRequestOrigin() == null ^ this.getRequestOrigin() == null)
            return false;
        if (other.getRequestOrigin() != null && other.getRequestOrigin().equals(this.getRequestOrigin()) == false)
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

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getRequestOrigin() == null) ? 0 : getRequestOrigin().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStatementsRequest clone() {
        return (ListStatementsRequest) super.clone();
    }

}
