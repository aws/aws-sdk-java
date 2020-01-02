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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTestGridSessionArtifacts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestGridSessionArtifactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of a <a>TestGridSession</a>.
     * </p>
     */
    private String sessionArn;
    /**
     * <p>
     * Limit results to a specified type of artifact.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The maximum number of results to be returned by a request.
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
     * The ARN of a <a>TestGridSession</a>.
     * </p>
     * 
     * @param sessionArn
     *        The ARN of a <a>TestGridSession</a>.
     */

    public void setSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
    }

    /**
     * <p>
     * The ARN of a <a>TestGridSession</a>.
     * </p>
     * 
     * @return The ARN of a <a>TestGridSession</a>.
     */

    public String getSessionArn() {
        return this.sessionArn;
    }

    /**
     * <p>
     * The ARN of a <a>TestGridSession</a>.
     * </p>
     * 
     * @param sessionArn
     *        The ARN of a <a>TestGridSession</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionArtifactsRequest withSessionArn(String sessionArn) {
        setSessionArn(sessionArn);
        return this;
    }

    /**
     * <p>
     * Limit results to a specified type of artifact.
     * </p>
     * 
     * @param type
     *        Limit results to a specified type of artifact.
     * @see TestGridSessionArtifactCategory
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Limit results to a specified type of artifact.
     * </p>
     * 
     * @return Limit results to a specified type of artifact.
     * @see TestGridSessionArtifactCategory
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Limit results to a specified type of artifact.
     * </p>
     * 
     * @param type
     *        Limit results to a specified type of artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionArtifactCategory
     */

    public ListTestGridSessionArtifactsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Limit results to a specified type of artifact.
     * </p>
     * 
     * @param type
     *        Limit results to a specified type of artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionArtifactCategory
     */

    public ListTestGridSessionArtifactsRequest withType(TestGridSessionArtifactCategory type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned by a request.
     * </p>
     * 
     * @param maxResult
     *        The maximum number of results to be returned by a request.
     */

    public void setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
    }

    /**
     * <p>
     * The maximum number of results to be returned by a request.
     * </p>
     * 
     * @return The maximum number of results to be returned by a request.
     */

    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * <p>
     * The maximum number of results to be returned by a request.
     * </p>
     * 
     * @param maxResult
     *        The maximum number of results to be returned by a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionArtifactsRequest withMaxResult(Integer maxResult) {
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

    public ListTestGridSessionArtifactsRequest withNextToken(String nextToken) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof ListTestGridSessionArtifactsRequest == false)
            return false;
        ListTestGridSessionArtifactsRequest other = (ListTestGridSessionArtifactsRequest) obj;
        if (other.getSessionArn() == null ^ this.getSessionArn() == null)
            return false;
        if (other.getSessionArn() != null && other.getSessionArn().equals(this.getSessionArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMaxResult() == null) ? 0 : getMaxResult().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestGridSessionArtifactsRequest clone() {
        return (ListTestGridSessionArtifactsRequest) super.clone();
    }

}
