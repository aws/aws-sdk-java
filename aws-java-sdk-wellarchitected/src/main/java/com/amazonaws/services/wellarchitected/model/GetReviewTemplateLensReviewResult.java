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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateLensReview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReviewTemplateLensReviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The review template ARN.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * A lens review of a question.
     * </p>
     */
    private ReviewTemplateLensReview lensReview;

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

    public GetReviewTemplateLensReviewResult withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * A lens review of a question.
     * </p>
     * 
     * @param lensReview
     *        A lens review of a question.
     */

    public void setLensReview(ReviewTemplateLensReview lensReview) {
        this.lensReview = lensReview;
    }

    /**
     * <p>
     * A lens review of a question.
     * </p>
     * 
     * @return A lens review of a question.
     */

    public ReviewTemplateLensReview getLensReview() {
        return this.lensReview;
    }

    /**
     * <p>
     * A lens review of a question.
     * </p>
     * 
     * @param lensReview
     *        A lens review of a question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReviewTemplateLensReviewResult withLensReview(ReviewTemplateLensReview lensReview) {
        setLensReview(lensReview);
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
        if (getLensReview() != null)
            sb.append("LensReview: ").append(getLensReview());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReviewTemplateLensReviewResult == false)
            return false;
        GetReviewTemplateLensReviewResult other = (GetReviewTemplateLensReviewResult) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getLensReview() == null ^ this.getLensReview() == null)
            return false;
        if (other.getLensReview() != null && other.getLensReview().equals(this.getLensReview()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getLensReview() == null) ? 0 : getLensReview().hashCode());
        return hashCode;
    }

    @Override
    public GetReviewTemplateLensReviewResult clone() {
        try {
            return (GetReviewTemplateLensReviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
