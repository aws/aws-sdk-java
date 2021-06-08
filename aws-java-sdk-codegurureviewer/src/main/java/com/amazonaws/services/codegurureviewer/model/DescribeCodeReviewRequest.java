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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeCodeReview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCodeReviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     */
    private String codeReviewArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     */

    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *         <code>CodeReview</code> </a> object.
     */

    public String getCodeReviewArn() {
        return this.codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCodeReviewRequest withCodeReviewArn(String codeReviewArn) {
        setCodeReviewArn(codeReviewArn);
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
        if (getCodeReviewArn() != null)
            sb.append("CodeReviewArn: ").append(getCodeReviewArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCodeReviewRequest == false)
            return false;
        DescribeCodeReviewRequest other = (DescribeCodeReviewRequest) obj;
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null)
            return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCodeReviewRequest clone() {
        return (DescribeCodeReviewRequest) super.clone();
    }

}
