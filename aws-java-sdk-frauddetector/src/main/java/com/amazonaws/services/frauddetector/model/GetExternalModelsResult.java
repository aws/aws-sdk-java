/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetExternalModels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExternalModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     */
    private java.util.List<ExternalModel> externalModels;
    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     * 
     * @return Gets the Amazon SageMaker models.
     */

    public java.util.List<ExternalModel> getExternalModels() {
        return externalModels;
    }

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     * 
     * @param externalModels
     *        Gets the Amazon SageMaker models.
     */

    public void setExternalModels(java.util.Collection<ExternalModel> externalModels) {
        if (externalModels == null) {
            this.externalModels = null;
            return;
        }

        this.externalModels = new java.util.ArrayList<ExternalModel>(externalModels);
    }

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalModels(java.util.Collection)} or {@link #withExternalModels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param externalModels
     *        Gets the Amazon SageMaker models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExternalModelsResult withExternalModels(ExternalModel... externalModels) {
        if (this.externalModels == null) {
            setExternalModels(new java.util.ArrayList<ExternalModel>(externalModels.length));
        }
        for (ExternalModel ele : externalModels) {
            this.externalModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     * 
     * @param externalModels
     *        Gets the Amazon SageMaker models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExternalModelsResult withExternalModels(java.util.Collection<ExternalModel> externalModels) {
        setExternalModels(externalModels);
        return this;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token to be used in subsequent requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @return The next page token to be used in subsequent requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token to be used in subsequent requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExternalModelsResult withNextToken(String nextToken) {
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
        if (getExternalModels() != null)
            sb.append("ExternalModels: ").append(getExternalModels()).append(",");
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

        if (obj instanceof GetExternalModelsResult == false)
            return false;
        GetExternalModelsResult other = (GetExternalModelsResult) obj;
        if (other.getExternalModels() == null ^ this.getExternalModels() == null)
            return false;
        if (other.getExternalModels() != null && other.getExternalModels().equals(this.getExternalModels()) == false)
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

        hashCode = prime * hashCode + ((getExternalModels() == null) ? 0 : getExternalModels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetExternalModelsResult clone() {
        try {
            return (GetExternalModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
