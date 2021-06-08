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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DescribeLanguageModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLanguageModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom language model you requested more information about.
     * </p>
     */
    private LanguageModel languageModel;

    /**
     * <p>
     * The name of the custom language model you requested more information about.
     * </p>
     * 
     * @param languageModel
     *        The name of the custom language model you requested more information about.
     */

    public void setLanguageModel(LanguageModel languageModel) {
        this.languageModel = languageModel;
    }

    /**
     * <p>
     * The name of the custom language model you requested more information about.
     * </p>
     * 
     * @return The name of the custom language model you requested more information about.
     */

    public LanguageModel getLanguageModel() {
        return this.languageModel;
    }

    /**
     * <p>
     * The name of the custom language model you requested more information about.
     * </p>
     * 
     * @param languageModel
     *        The name of the custom language model you requested more information about.
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
