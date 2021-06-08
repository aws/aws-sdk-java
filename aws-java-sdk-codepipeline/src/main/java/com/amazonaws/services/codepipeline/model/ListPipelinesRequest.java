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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>ListPipelines</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of
     * pipelines in the list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make another
     * call with the returned nextToken value. The minimum value you can specify is 1. The maximum accepted value is
     * 1000.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of
     * pipelines in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous list pipelines call. It can be used to return the next
     *        set of pipelines in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of
     * pipelines in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous list pipelines call. It can be used to return the next
     *         set of pipelines in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of
     * pipelines in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous list pipelines call. It can be used to return the next
     *        set of pipelines in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make another
     * call with the returned nextToken value. The minimum value you can specify is 1. The maximum accepted value is
     * 1000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make
     *        another call with the returned nextToken value. The minimum value you can specify is 1. The maximum
     *        accepted value is 1000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make another
     * call with the returned nextToken value. The minimum value you can specify is 1. The maximum accepted value is
     * 1000.
     * </p>
     * 
     * @return The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make
     *         another call with the returned nextToken value. The minimum value you can specify is 1. The maximum
     *         accepted value is 1000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make another
     * call with the returned nextToken value. The minimum value you can specify is 1. The maximum accepted value is
     * 1000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make
     *        another call with the returned nextToken value. The minimum value you can specify is 1. The maximum
     *        accepted value is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListPipelinesRequest == false)
            return false;
        ListPipelinesRequest other = (ListPipelinesRequest) obj;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelinesRequest clone() {
        return (ListPipelinesRequest) super.clone();
    }

}
