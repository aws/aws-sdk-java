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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more filters that searches for the specified resource or resources in a search. All resource objects that
     * satisfy the expression's condition are included in the search results. Specify the Framework, FrameworkVersion,
     * Domain or Task to filter supported. Filter names and values are case-sensitive.
     * </p>
     */
    private ModelMetadataSearchExpression searchExpression;
    /**
     * <p>
     * If the response to a previous <code>ListModelMetadataResponse</code> request was truncated, the response includes
     * a NextToken. To retrieve the next set of model metadata, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of models to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters that searches for the specified resource or resources in a search. All resource objects that
     * satisfy the expression's condition are included in the search results. Specify the Framework, FrameworkVersion,
     * Domain or Task to filter supported. Filter names and values are case-sensitive.
     * </p>
     * 
     * @param searchExpression
     *        One or more filters that searches for the specified resource or resources in a search. All resource
     *        objects that satisfy the expression's condition are included in the search results. Specify the Framework,
     *        FrameworkVersion, Domain or Task to filter supported. Filter names and values are case-sensitive.
     */

    public void setSearchExpression(ModelMetadataSearchExpression searchExpression) {
        this.searchExpression = searchExpression;
    }

    /**
     * <p>
     * One or more filters that searches for the specified resource or resources in a search. All resource objects that
     * satisfy the expression's condition are included in the search results. Specify the Framework, FrameworkVersion,
     * Domain or Task to filter supported. Filter names and values are case-sensitive.
     * </p>
     * 
     * @return One or more filters that searches for the specified resource or resources in a search. All resource
     *         objects that satisfy the expression's condition are included in the search results. Specify the
     *         Framework, FrameworkVersion, Domain or Task to filter supported. Filter names and values are
     *         case-sensitive.
     */

    public ModelMetadataSearchExpression getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * <p>
     * One or more filters that searches for the specified resource or resources in a search. All resource objects that
     * satisfy the expression's condition are included in the search results. Specify the Framework, FrameworkVersion,
     * Domain or Task to filter supported. Filter names and values are case-sensitive.
     * </p>
     * 
     * @param searchExpression
     *        One or more filters that searches for the specified resource or resources in a search. All resource
     *        objects that satisfy the expression's condition are included in the search results. Specify the Framework,
     *        FrameworkVersion, Domain or Task to filter supported. Filter names and values are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelMetadataRequest withSearchExpression(ModelMetadataSearchExpression searchExpression) {
        setSearchExpression(searchExpression);
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelMetadataResponse</code> request was truncated, the response includes
     * a NextToken. To retrieve the next set of model metadata, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelMetadataResponse</code> request was truncated, the response
     *        includes a NextToken. To retrieve the next set of model metadata, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelMetadataResponse</code> request was truncated, the response includes
     * a NextToken. To retrieve the next set of model metadata, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListModelMetadataResponse</code> request was truncated, the response
     *         includes a NextToken. To retrieve the next set of model metadata, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelMetadataResponse</code> request was truncated, the response includes
     * a NextToken. To retrieve the next set of model metadata, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelMetadataResponse</code> request was truncated, the response
     *        includes a NextToken. To retrieve the next set of model metadata, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelMetadataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of models to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of models to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of models to return in the response.
     * </p>
     * 
     * @return The maximum number of models to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of models to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of models to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelMetadataRequest withMaxResults(Integer maxResults) {
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
        if (getSearchExpression() != null)
            sb.append("SearchExpression: ").append(getSearchExpression()).append(",");
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

        if (obj instanceof ListModelMetadataRequest == false)
            return false;
        ListModelMetadataRequest other = (ListModelMetadataRequest) obj;
        if (other.getSearchExpression() == null ^ this.getSearchExpression() == null)
            return false;
        if (other.getSearchExpression() != null && other.getSearchExpression().equals(this.getSearchExpression()) == false)
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

        hashCode = prime * hashCode + ((getSearchExpression() == null) ? 0 : getSearchExpression().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListModelMetadataRequest clone() {
        return (ListModelMetadataRequest) super.clone();
    }

}
