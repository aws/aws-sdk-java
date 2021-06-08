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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorlds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorldsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information for worlds.
     * </p>
     */
    private java.util.List<WorldSummary> worldSummaries;
    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorlds</code> again and assign that token to the request object's <code>nextToken</code> parameter. If
     * there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information for worlds.
     * </p>
     * 
     * @return Summary information for worlds.
     */

    public java.util.List<WorldSummary> getWorldSummaries() {
        return worldSummaries;
    }

    /**
     * <p>
     * Summary information for worlds.
     * </p>
     * 
     * @param worldSummaries
     *        Summary information for worlds.
     */

    public void setWorldSummaries(java.util.Collection<WorldSummary> worldSummaries) {
        if (worldSummaries == null) {
            this.worldSummaries = null;
            return;
        }

        this.worldSummaries = new java.util.ArrayList<WorldSummary>(worldSummaries);
    }

    /**
     * <p>
     * Summary information for worlds.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorldSummaries(java.util.Collection)} or {@link #withWorldSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param worldSummaries
     *        Summary information for worlds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldsResult withWorldSummaries(WorldSummary... worldSummaries) {
        if (this.worldSummaries == null) {
            setWorldSummaries(new java.util.ArrayList<WorldSummary>(worldSummaries.length));
        }
        for (WorldSummary ele : worldSummaries) {
            this.worldSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for worlds.
     * </p>
     * 
     * @param worldSummaries
     *        Summary information for worlds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldsResult withWorldSummaries(java.util.Collection<WorldSummary> worldSummaries) {
        setWorldSummaries(worldSummaries);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorlds</code> again and assign that token to the request object's <code>nextToken</code> parameter. If
     * there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorlds</code> again and assign that token to the request object's <code>nextToken</code>
     *        parameter. If there are no remaining results, the previous response object's NextToken parameter is set to
     *        null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorlds</code> again and assign that token to the request object's <code>nextToken</code> parameter. If
     * there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @return If the previous paginated request did not return all of the remaining results, the response object's
     *         <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *         <code>ListWorlds</code> again and assign that token to the request object's <code>nextToken</code>
     *         parameter. If there are no remaining results, the previous response object's NextToken parameter is set
     *         to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorlds</code> again and assign that token to the request object's <code>nextToken</code> parameter. If
     * there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorlds</code> again and assign that token to the request object's <code>nextToken</code>
     *        parameter. If there are no remaining results, the previous response object's NextToken parameter is set to
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldsResult withNextToken(String nextToken) {
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
        if (getWorldSummaries() != null)
            sb.append("WorldSummaries: ").append(getWorldSummaries()).append(",");
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

        if (obj instanceof ListWorldsResult == false)
            return false;
        ListWorldsResult other = (ListWorldsResult) obj;
        if (other.getWorldSummaries() == null ^ this.getWorldSummaries() == null)
            return false;
        if (other.getWorldSummaries() != null && other.getWorldSummaries().equals(this.getWorldSummaries()) == false)
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

        hashCode = prime * hashCode + ((getWorldSummaries() == null) ? 0 : getWorldSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorldsResult clone() {
        try {
            return (ListWorldsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
