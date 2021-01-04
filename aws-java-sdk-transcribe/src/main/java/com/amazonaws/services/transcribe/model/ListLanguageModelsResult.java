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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLanguageModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults parameter.
     * If there are more language models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the operation to return the next page of
     * language models.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     */
    private java.util.List<LanguageModel> models;

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults parameter.
     * If there are more language models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the operation to return the next page of
     * language models.
     * </p>
     * 
     * @param nextToken
     *        The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults
     *        parameter. If there are more language models in the list than the page size, Amazon Transcribe returns the
     *        <code>NextPage</code> token. Include the token in the next request to the operation to return the next
     *        page of language models.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults parameter.
     * If there are more language models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the operation to return the next page of
     * language models.
     * </p>
     * 
     * @return The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults
     *         parameter. If there are more language models in the list than the page size, Amazon Transcribe returns
     *         the <code>NextPage</code> token. Include the token in the next request to the operation to return the
     *         next page of language models.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults parameter.
     * If there are more language models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the operation to return the next page of
     * language models.
     * </p>
     * 
     * @param nextToken
     *        The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults
     *        parameter. If there are more language models in the list than the page size, Amazon Transcribe returns the
     *        <code>NextPage</code> token. Include the token in the next request to the operation to return the next
     *        page of language models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguageModelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     * 
     * @return A list of objects containing information about custom language models.
     */

    public java.util.List<LanguageModel> getModels() {
        return models;
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     * 
     * @param models
     *        A list of objects containing information about custom language models.
     */

    public void setModels(java.util.Collection<LanguageModel> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<LanguageModel>(models);
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        A list of objects containing information about custom language models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguageModelsResult withModels(LanguageModel... models) {
        if (this.models == null) {
            setModels(new java.util.ArrayList<LanguageModel>(models.length));
        }
        for (LanguageModel ele : models) {
            this.models.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     * 
     * @param models
     *        A list of objects containing information about custom language models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguageModelsResult withModels(java.util.Collection<LanguageModel> models) {
        setModels(models);
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
        if (getModels() != null)
            sb.append("Models: ").append(getModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLanguageModelsResult == false)
            return false;
        ListLanguageModelsResult other = (ListLanguageModelsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        return hashCode;
    }

    @Override
    public ListLanguageModelsResult clone() {
        try {
            return (ListLanguageModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
