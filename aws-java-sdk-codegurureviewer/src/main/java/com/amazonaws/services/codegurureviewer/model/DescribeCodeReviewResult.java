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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeCodeReview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCodeReviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the code review.
     * </p>
     */
    private CodeReview codeReview;

    /**
     * <p>
     * Information about the code review.
     * </p>
     * 
     * @param codeReview
     *        Information about the code review.
     */

    public void setCodeReview(CodeReview codeReview) {
        this.codeReview = codeReview;
    }

    /**
     * <p>
     * Information about the code review.
     * </p>
     * 
     * @return Information about the code review.
     */

    public CodeReview getCodeReview() {
        return this.codeReview;
    }

    /**
     * <p>
     * Information about the code review.
     * </p>
     * 
     * @param codeReview
     *        Information about the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeReviewResult withCodeReview(CodeReview codeReview) {
        setCodeReview(codeReview);
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
        if (getCodeReview() != null)
            sb.append("CodeReview: ").append(getCodeReview());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCodeReviewResult == false)
            return false;
        DescribeCodeReviewResult other = (DescribeCodeReviewResult) obj;
        if (other.getCodeReview() == null ^ this.getCodeReview() == null)
            return false;
        if (other.getCodeReview() != null && other.getCodeReview().equals(this.getCodeReview()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeReview() == null) ? 0 : getCodeReview().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCodeReviewResult clone() {
        try {
            return (DescribeCodeReviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
