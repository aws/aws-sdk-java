/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListRotations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRotationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter to include rotations in list results based on their common prefix. For example, entering prod returns a
     * list of all rotation names that begin with <code>prod</code>, such as <code>production</code> and
     * <code>prod-1</code>.
     * </p>
     */
    private String rotationNamePrefix;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A filter to include rotations in list results based on their common prefix. For example, entering prod returns a
     * list of all rotation names that begin with <code>prod</code>, such as <code>production</code> and
     * <code>prod-1</code>.
     * </p>
     * 
     * @param rotationNamePrefix
     *        A filter to include rotations in list results based on their common prefix. For example, entering prod
     *        returns a list of all rotation names that begin with <code>prod</code>, such as <code>production</code>
     *        and <code>prod-1</code>.
     */

    public void setRotationNamePrefix(String rotationNamePrefix) {
        this.rotationNamePrefix = rotationNamePrefix;
    }

    /**
     * <p>
     * A filter to include rotations in list results based on their common prefix. For example, entering prod returns a
     * list of all rotation names that begin with <code>prod</code>, such as <code>production</code> and
     * <code>prod-1</code>.
     * </p>
     * 
     * @return A filter to include rotations in list results based on their common prefix. For example, entering prod
     *         returns a list of all rotation names that begin with <code>prod</code>, such as <code>production</code>
     *         and <code>prod-1</code>.
     */

    public String getRotationNamePrefix() {
        return this.rotationNamePrefix;
    }

    /**
     * <p>
     * A filter to include rotations in list results based on their common prefix. For example, entering prod returns a
     * list of all rotation names that begin with <code>prod</code>, such as <code>production</code> and
     * <code>prod-1</code>.
     * </p>
     * 
     * @param rotationNamePrefix
     *        A filter to include rotations in list results based on their common prefix. For example, entering prod
     *        returns a list of all rotation names that begin with <code>prod</code>, such as <code>production</code>
     *        and <code>prod-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationsRequest withRotationNamePrefix(String rotationNamePrefix) {
        setRotationNamePrefix(rotationNamePrefix);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationsRequest withMaxResults(Integer maxResults) {
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
        if (getRotationNamePrefix() != null)
            sb.append("RotationNamePrefix: ").append(getRotationNamePrefix()).append(",");
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

        if (obj instanceof ListRotationsRequest == false)
            return false;
        ListRotationsRequest other = (ListRotationsRequest) obj;
        if (other.getRotationNamePrefix() == null ^ this.getRotationNamePrefix() == null)
            return false;
        if (other.getRotationNamePrefix() != null && other.getRotationNamePrefix().equals(this.getRotationNamePrefix()) == false)
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

        hashCode = prime * hashCode + ((getRotationNamePrefix() == null) ? 0 : getRotationNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRotationsRequest clone() {
        return (ListRotationsRequest) super.clone();
    }

}
