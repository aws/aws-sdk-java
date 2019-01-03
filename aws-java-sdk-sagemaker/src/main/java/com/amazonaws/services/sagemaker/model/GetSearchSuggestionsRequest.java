/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSearchSuggestionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     */
    private SuggestionQuery suggestionQuery;

    /**
     * <p>
     * The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @param resource
     *        The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     *        <code>TrainingJob</code>.
     * @see ResourceType
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @return The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     *         <code>TrainingJob</code>.
     * @see ResourceType
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @param resource
     *        The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     *        <code>TrainingJob</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetSearchSuggestionsRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @param resource
     *        The name of the Amazon SageMaker resource to Search for. The only valid <code>Resource</code> value is
     *        <code>TrainingJob</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetSearchSuggestionsRequest withResource(ResourceType resource) {
        this.resource = resource.toString();
        return this;
    }

    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     * 
     * @param suggestionQuery
     *        Limits the property names that are included in the response.
     */

    public void setSuggestionQuery(SuggestionQuery suggestionQuery) {
        this.suggestionQuery = suggestionQuery;
    }

    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     * 
     * @return Limits the property names that are included in the response.
     */

    public SuggestionQuery getSuggestionQuery() {
        return this.suggestionQuery;
    }

    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     * 
     * @param suggestionQuery
     *        Limits the property names that are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSearchSuggestionsRequest withSuggestionQuery(SuggestionQuery suggestionQuery) {
        setSuggestionQuery(suggestionQuery);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getSuggestionQuery() != null)
            sb.append("SuggestionQuery: ").append(getSuggestionQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSearchSuggestionsRequest == false)
            return false;
        GetSearchSuggestionsRequest other = (GetSearchSuggestionsRequest) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getSuggestionQuery() == null ^ this.getSuggestionQuery() == null)
            return false;
        if (other.getSuggestionQuery() != null && other.getSuggestionQuery().equals(this.getSuggestionQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getSuggestionQuery() == null) ? 0 : getSuggestionQuery().hashCode());
        return hashCode;
    }

    @Override
    public GetSearchSuggestionsRequest clone() {
        return (GetSearchSuggestionsRequest) super.clone();
    }

}
