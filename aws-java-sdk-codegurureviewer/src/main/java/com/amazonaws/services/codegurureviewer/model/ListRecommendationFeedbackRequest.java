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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendationFeedback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     */
    private Integer maxResults;
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
     * An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback for a
     * code review from that user.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     */
    private java.util.List<String> userIds;
    /**
     * <p>
     * Used to query the recommendation feedback for a given recommendation.
     * </p>
     */
    private java.util.List<String> recommendationIds;

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a
     *        unique pagination token for each page. Make the call again using the returned token to retrieve the next
     *        page. Keep all other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a
     *         unique pagination token for each page. Make the call again using the returned token to retrieve the next
     *         page. Keep all other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a
     *        unique pagination token for each page. Make the call again using the returned token to retrieve the next
     *        page. Keep all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. The default is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @return The maximum number of results that are returned per call. The default is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
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

    public ListRecommendationFeedbackRequest withCodeReviewArn(String codeReviewArn) {
        setCodeReviewArn(codeReviewArn);
        return this;
    }

    /**
     * <p>
     * An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback for a
     * code review from that user.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @return An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback
     *         for a code review from that user. </p>
     *         <p>
     *         The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *         Resource Name (ARN). For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *         > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback for a
     * code review from that user.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param userIds
     *        An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback
     *        for a code review from that user. </p>
     *        <p>
     *        The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *        Resource Name (ARN). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *        > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback for a
     * code review from that user.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback
     *        for a code review from that user. </p>
     *        <p>
     *        The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *        Resource Name (ARN). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *        > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackRequest withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new java.util.ArrayList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback for a
     * code review from that user.
     * </p>
     * <p>
     * The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name
     * (ARN). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     * > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param userIds
     *        An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback
     *        for a code review from that user. </p>
     *        <p>
     *        The <code>UserId</code> is an IAM principal that can be specified as an AWS account ID or an Amazon
     *        Resource Name (ARN). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#Principal_specifying"
     *        > Specifying a Principal</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * Used to query the recommendation feedback for a given recommendation.
     * </p>
     * 
     * @return Used to query the recommendation feedback for a given recommendation.
     */

    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * Used to query the recommendation feedback for a given recommendation.
     * </p>
     * 
     * @param recommendationIds
     *        Used to query the recommendation feedback for a given recommendation.
     */

    public void setRecommendationIds(java.util.Collection<String> recommendationIds) {
        if (recommendationIds == null) {
            this.recommendationIds = null;
            return;
        }

        this.recommendationIds = new java.util.ArrayList<String>(recommendationIds);
    }

    /**
     * <p>
     * Used to query the recommendation feedback for a given recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationIds(java.util.Collection)} or {@link #withRecommendationIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendationIds
     *        Used to query the recommendation feedback for a given recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackRequest withRecommendationIds(String... recommendationIds) {
        if (this.recommendationIds == null) {
            setRecommendationIds(new java.util.ArrayList<String>(recommendationIds.length));
        }
        for (String ele : recommendationIds) {
            this.recommendationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Used to query the recommendation feedback for a given recommendation.
     * </p>
     * 
     * @param recommendationIds
     *        Used to query the recommendation feedback for a given recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationFeedbackRequest withRecommendationIds(java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getCodeReviewArn() != null)
            sb.append("CodeReviewArn: ").append(getCodeReviewArn()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: ").append(getRecommendationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationFeedbackRequest == false)
            return false;
        ListRecommendationFeedbackRequest other = (ListRecommendationFeedbackRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null)
            return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationFeedbackRequest clone() {
        return (ListRecommendationFeedbackRequest) super.clone();
    }

}
