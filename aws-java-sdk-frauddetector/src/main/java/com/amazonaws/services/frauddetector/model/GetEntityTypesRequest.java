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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEntityTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntityTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @return The name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityTypesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        The next token for the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     * 
     * @return The next token for the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        The next token for the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return for the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @return The maximum number of objects to return for the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityTypesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEntityTypesRequest == false)
            return false;
        GetEntityTypesRequest other = (GetEntityTypesRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetEntityTypesRequest clone() {
        return (GetEntityTypesRequest) super.clone();
    }

}
