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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTestGridProjects" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestGridProjectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Return no more than this number of results.
     * </p>
     */
    private Integer maxResult;
    /**
     * <p>
     * From a response, used to continue a paginated listing.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Return no more than this number of results.
     * </p>
     * 
     * @param maxResult
     *        Return no more than this number of results.
     */

    public void setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
    }

    /**
     * <p>
     * Return no more than this number of results.
     * </p>
     * 
     * @return Return no more than this number of results.
     */

    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * <p>
     * Return no more than this number of results.
     * </p>
     * 
     * @param maxResult
     *        Return no more than this number of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridProjectsRequest withMaxResult(Integer maxResult) {
        setMaxResult(maxResult);
        return this;
    }

    /**
     * <p>
     * From a response, used to continue a paginated listing.
     * </p>
     * 
     * @param nextToken
     *        From a response, used to continue a paginated listing.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * From a response, used to continue a paginated listing.
     * </p>
     * 
     * @return From a response, used to continue a paginated listing.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * From a response, used to continue a paginated listing.
     * </p>
     * 
     * @param nextToken
     *        From a response, used to continue a paginated listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridProjectsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListTestGridProjectsRequest == false)
            return false;
        ListTestGridProjectsRequest other = (ListTestGridProjectsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResult() == null) ? 0 : getMaxResult().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestGridProjectsRequest clone() {
        return (ListTestGridProjectsRequest) super.clone();
    }

}
