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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLanguageModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create your custom language model has been
     * updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the
     * updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't successful, you can use this
     * <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     * </p>
     */
    private LanguageModel languageModel;

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create your custom language model has been
     * updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the
     * updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't successful, you can use this
     * <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     * </p>
     * 
     * @param languageModel
     *        Provides information about the specified custom language model.</p>
     *        <p>
     *        This parameter also shows if the base language model you used to create your custom language model has
     *        been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model
     *        using the updated base model.
     *        </p>
     *        <p>
     *        If you tried to create a new custom language model and the request wasn't successful, you can use this
     *        <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     */

    public void setLanguageModel(LanguageModel languageModel) {
        this.languageModel = languageModel;
    }

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create your custom language model has been
     * updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the
     * updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't successful, you can use this
     * <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     * </p>
     * 
     * @return Provides information about the specified custom language model.</p>
     *         <p>
     *         This parameter also shows if the base language model you used to create your custom language model has
     *         been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model
     *         using the updated base model.
     *         </p>
     *         <p>
     *         If you tried to create a new custom language model and the request wasn't successful, you can use this
     *         <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     */

    public LanguageModel getLanguageModel() {
        return this.languageModel;
    }

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create your custom language model has been
     * updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the
     * updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't successful, you can use this
     * <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     * </p>
     * 
     * @param languageModel
     *        Provides information about the specified custom language model.</p>
     *        <p>
     *        This parameter also shows if the base language model you used to create your custom language model has
     *        been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model
     *        using the updated base model.
     *        </p>
     *        <p>
     *        If you tried to create a new custom language model and the request wasn't successful, you can use this
     *        <code>DescribeLanguageModel</code> to help identify the reason for this failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLanguageModelResult withLanguageModel(LanguageModel languageModel) {
        setLanguageModel(languageModel);
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
        if (getLanguageModel() != null)
            sb.append("LanguageModel: ").append(getLanguageModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLanguageModelResult == false)
            return false;
        DescribeLanguageModelResult other = (DescribeLanguageModelResult) obj;
        if (other.getLanguageModel() == null ^ this.getLanguageModel() == null)
            return false;
        if (other.getLanguageModel() != null && other.getLanguageModel().equals(this.getLanguageModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageModel() == null) ? 0 : getLanguageModel().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLanguageModelResult clone() {
        try {
            return (DescribeLanguageModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
