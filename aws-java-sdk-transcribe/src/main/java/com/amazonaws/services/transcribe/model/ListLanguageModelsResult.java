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
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides information about the custom language models that match the criteria specified in your request.
     * </p>
     */
    private java.util.List<LanguageModel> models;

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @return If <code>NextToken</code> is present in your response, it indicates that not all results are displayed.
     *         To view the next set of results, copy the string associated with the <code>NextToken</code> parameter in
     *         your results output, then run your request again including <code>NextToken</code> with the value of the
     *         copied string. Repeat as needed to view all your results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguageModelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides information about the custom language models that match the criteria specified in your request.
     * </p>
     * 
     * @return Provides information about the custom language models that match the criteria specified in your request.
     */

    public java.util.List<LanguageModel> getModels() {
        return models;
    }

    /**
     * <p>
     * Provides information about the custom language models that match the criteria specified in your request.
     * </p>
     * 
     * @param models
     *        Provides information about the custom language models that match the criteria specified in your request.
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
     * Provides information about the custom language models that match the criteria specified in your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        Provides information about the custom language models that match the criteria specified in your request.
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
     * Provides information about the custom language models that match the criteria specified in your request.
     * </p>
     * 
     * @param models
     *        Provides information about the custom language models that match the criteria specified in your request.
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
