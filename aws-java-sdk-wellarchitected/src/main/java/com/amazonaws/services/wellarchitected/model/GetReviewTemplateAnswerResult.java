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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateAnswer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReviewTemplateAnswerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The review template ARN.
     * </p>
     */
    private String templateArn;

    private String lensAlias;
    /**
     * <p>
     * An answer of the question.
     * </p>
     */
    private ReviewTemplateAnswer answer;

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @return The review template ARN.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReviewTemplateAnswerResult withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReviewTemplateAnswerResult withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * An answer of the question.
     * </p>
     * 
     * @param answer
     *        An answer of the question.
     */

    public void setAnswer(ReviewTemplateAnswer answer) {
        this.answer = answer;
    }

    /**
     * <p>
     * An answer of the question.
     * </p>
     * 
     * @return An answer of the question.
     */

    public ReviewTemplateAnswer getAnswer() {
        return this.answer;
    }

    /**
     * <p>
     * An answer of the question.
     * </p>
     * 
     * @param answer
     *        An answer of the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReviewTemplateAnswerResult withAnswer(ReviewTemplateAnswer answer) {
        setAnswer(answer);
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getAnswer() != null)
            sb.append("Answer: ").append(getAnswer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReviewTemplateAnswerResult == false)
            return false;
        GetReviewTemplateAnswerResult other = (GetReviewTemplateAnswerResult) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getAnswer() == null ^ this.getAnswer() == null)
            return false;
        if (other.getAnswer() != null && other.getAnswer().equals(this.getAnswer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        return hashCode;
    }

    @Override
    public GetReviewTemplateAnswerResult clone() {
        try {
            return (GetReviewTemplateAnswerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
