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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of environment templates to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to indicate the location of the next environment template in the array of environment templates, after
     * the list of environment templates that was previously requested.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of environment templates to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment templates to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of environment templates to list.
     * </p>
     * 
     * @return The maximum number of environment templates to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of environment templates to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment templates to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment template in the array of environment templates, after
     * the list of environment templates that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next environment template in the array of environment templates,
     *        after the list of environment templates that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment template in the array of environment templates, after
     * the list of environment templates that was previously requested.
     * </p>
     * 
     * @return A token to indicate the location of the next environment template in the array of environment templates,
     *         after the list of environment templates that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment template in the array of environment templates, after
     * the list of environment templates that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next environment template in the array of environment templates,
     *        after the list of environment templates that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentTemplatesRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListEnvironmentTemplatesRequest == false)
            return false;
        ListEnvironmentTemplatesRequest other = (ListEnvironmentTemplatesRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentTemplatesRequest clone() {
        return (ListEnvironmentTemplatesRequest) super.clone();
    }

}
