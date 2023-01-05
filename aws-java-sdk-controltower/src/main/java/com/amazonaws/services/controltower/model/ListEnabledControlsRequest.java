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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnabledControlsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * How many results to return per API call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     */
    private String targetIdentifier;

    /**
     * <p>
     * How many results to return per API call.
     * </p>
     * 
     * @param maxResults
     *        How many results to return per API call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * How many results to return per API call.
     * </p>
     * 
     * @return How many results to return per API call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * How many results to return per API call.
     * </p>
     * 
     * @param maxResults
     *        How many results to return per API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledControlsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to continue the list from a previous API call with the same parameters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     * 
     * @return The token to continue the list from a previous API call with the same parameters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to continue the list from a previous API call with the same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to continue the list from a previous API call with the same parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledControlsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit.
     */

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     * 
     * @return The ARN of the organizational unit.
     */

    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledControlsRequest withTargetIdentifier(String targetIdentifier) {
        setTargetIdentifier(targetIdentifier);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTargetIdentifier() != null)
            sb.append("TargetIdentifier: ").append(getTargetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnabledControlsRequest == false)
            return false;
        ListEnabledControlsRequest other = (ListEnabledControlsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTargetIdentifier() == null ^ this.getTargetIdentifier() == null)
            return false;
        if (other.getTargetIdentifier() != null && other.getTargetIdentifier().equals(this.getTargetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifier() == null) ? 0 : getTargetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListEnabledControlsRequest clone() {
        return (ListEnabledControlsRequest) super.clone();
    }

}
