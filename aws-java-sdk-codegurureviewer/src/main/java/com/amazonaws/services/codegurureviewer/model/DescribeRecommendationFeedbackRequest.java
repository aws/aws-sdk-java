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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRecommendationFeedback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecommendationFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user
     * making the request.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     */
    private String userId;

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

    public DescribeRecommendationFeedbackRequest withCodeReviewArn(String codeReviewArn) {
        setCodeReviewArn(codeReviewArn);
        return this;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID that can be used to track the provided recommendations and then to collect the
     *        feedback.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     * 
     * @return The recommendation ID that can be used to track the provided recommendations and then to collect the
     *         feedback.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
     * </p>
     * 
     * @param recommendationId
     *        The recommendation ID that can be used to track the provided recommendations and then to collect the
     *        feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationFeedbackRequest withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user
     * making the request.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param userId
     *        Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the
     *        user making the request. </p>
     *        <p>
     *        The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *        Resource Name (ARN). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *        > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user
     * making the request.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @return Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the
     *         user making the request. </p>
     *         <p>
     *         The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *         Resource Name (ARN). For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *         > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user
     * making the request.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param userId
     *        Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the
     *        user making the request. </p>
     *        <p>
     *        The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *        Resource Name (ARN). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *        > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationFeedbackRequest withUserId(String userId) {
        setUserId(userId);
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
            sb.append("CodeReviewArn: ").append(getCodeReviewArn()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecommendationFeedbackRequest == false)
            return false;
        DescribeRecommendationFeedbackRequest other = (DescribeRecommendationFeedbackRequest) obj;
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null)
            return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecommendationFeedbackRequest clone() {
        return (DescribeRecommendationFeedbackRequest) super.clone();
    }

}
