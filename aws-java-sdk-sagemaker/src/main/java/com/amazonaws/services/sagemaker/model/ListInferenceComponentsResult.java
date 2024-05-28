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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListInferenceComponents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of inference components and their properties that matches any of the filters you specified in the request.
     * </p>
     */
    private java.util.List<InferenceComponentSummary> inferenceComponents;
    /**
     * <p>
     * The token to use in a subsequent request to get the next set of results following a truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of inference components and their properties that matches any of the filters you specified in the request.
     * </p>
     * 
     * @return A list of inference components and their properties that matches any of the filters you specified in the
     *         request.
     */

    public java.util.List<InferenceComponentSummary> getInferenceComponents() {
        return inferenceComponents;
    }

    /**
     * <p>
     * A list of inference components and their properties that matches any of the filters you specified in the request.
     * </p>
     * 
     * @param inferenceComponents
     *        A list of inference components and their properties that matches any of the filters you specified in the
     *        request.
     */

    public void setInferenceComponents(java.util.Collection<InferenceComponentSummary> inferenceComponents) {
        if (inferenceComponents == null) {
            this.inferenceComponents = null;
            return;
        }

        this.inferenceComponents = new java.util.ArrayList<InferenceComponentSummary>(inferenceComponents);
    }

    /**
     * <p>
     * A list of inference components and their properties that matches any of the filters you specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceComponents(java.util.Collection)} or {@link #withInferenceComponents(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inferenceComponents
     *        A list of inference components and their properties that matches any of the filters you specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceComponentsResult withInferenceComponents(InferenceComponentSummary... inferenceComponents) {
        if (this.inferenceComponents == null) {
            setInferenceComponents(new java.util.ArrayList<InferenceComponentSummary>(inferenceComponents.length));
        }
        for (InferenceComponentSummary ele : inferenceComponents) {
            this.inferenceComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of inference components and their properties that matches any of the filters you specified in the request.
     * </p>
     * 
     * @param inferenceComponents
     *        A list of inference components and their properties that matches any of the filters you specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceComponentsResult withInferenceComponents(java.util.Collection<InferenceComponentSummary> inferenceComponents) {
        setInferenceComponents(inferenceComponents);
        return this;
    }

    /**
     * <p>
     * The token to use in a subsequent request to get the next set of results following a truncated response.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent request to get the next set of results following a truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent request to get the next set of results following a truncated response.
     * </p>
     * 
     * @return The token to use in a subsequent request to get the next set of results following a truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent request to get the next set of results following a truncated response.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent request to get the next set of results following a truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceComponentsResult withNextToken(String nextToken) {
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
        if (getInferenceComponents() != null)
            sb.append("InferenceComponents: ").append(getInferenceComponents()).append(",");
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

        if (obj instanceof ListInferenceComponentsResult == false)
            return false;
        ListInferenceComponentsResult other = (ListInferenceComponentsResult) obj;
        if (other.getInferenceComponents() == null ^ this.getInferenceComponents() == null)
            return false;
        if (other.getInferenceComponents() != null && other.getInferenceComponents().equals(this.getInferenceComponents()) == false)
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

        hashCode = prime * hashCode + ((getInferenceComponents() == null) ? 0 : getInferenceComponents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceComponentsResult clone() {
        try {
            return (ListInferenceComponentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
