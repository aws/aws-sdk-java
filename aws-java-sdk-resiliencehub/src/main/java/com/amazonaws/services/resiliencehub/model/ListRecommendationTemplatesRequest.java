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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListRecommendationTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name for one of the listed recommendation templates.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     */
    private String recommendationTemplateArn;
    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     */
    private Boolean reverseOrder;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private java.util.List<String> status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *         information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesRequest withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @return The maximum number of results to include in the response. If more results exist than the specified
     *         <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *         retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name for one of the listed recommendation templates.
     * </p>
     * 
     * @param name
     *        The name for one of the listed recommendation templates.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for one of the listed recommendation templates.
     * </p>
     * 
     * @return The name for one of the listed recommendation templates.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for one of the listed recommendation templates.
     * </p>
     * 
     * @param name
     *        The name for one of the listed recommendation templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @return Null, or the token from a previous call to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     * 
     * @param recommendationTemplateArn
     *        The Amazon Resource Name (ARN) for a recommendation template.
     */

    public void setRecommendationTemplateArn(String recommendationTemplateArn) {
        this.recommendationTemplateArn = recommendationTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a recommendation template.
     */

    public String getRecommendationTemplateArn() {
        return this.recommendationTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     * 
     * @param recommendationTemplateArn
     *        The Amazon Resource Name (ARN) for a recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesRequest withRecommendationTemplateArn(String recommendationTemplateArn) {
        setRecommendationTemplateArn(recommendationTemplateArn);
        return this;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @param reverseOrder
     *        The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *        reverseOrder to <code>true</code>.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @return The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *         reverseOrder to <code>true</code>.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @param reverseOrder
     *        The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *        reverseOrder to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @return The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *         reverseOrder to <code>true</code>.
     */

    public Boolean isReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see RecommendationTemplateStatus
     */

    public java.util.List<String> getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see RecommendationTemplateStatus
     */

    public void setStatus(java.util.Collection<String> status) {
        if (status == null) {
            this.status = null;
            return;
        }

        this.status = new java.util.ArrayList<String>(status);
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatus(java.util.Collection)} or {@link #withStatus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTemplateStatus
     */

    public ListRecommendationTemplatesRequest withStatus(String... status) {
        if (this.status == null) {
            setStatus(new java.util.ArrayList<String>(status.length));
        }
        for (String ele : status) {
            this.status.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTemplateStatus
     */

    public ListRecommendationTemplatesRequest withStatus(java.util.Collection<String> status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTemplateStatus
     */

    public ListRecommendationTemplatesRequest withStatus(RecommendationTemplateStatus... status) {
        java.util.ArrayList<String> statusCopy = new java.util.ArrayList<String>(status.length);
        for (RecommendationTemplateStatus value : status) {
            statusCopy.add(value.toString());
        }
        if (getStatus() == null) {
            setStatus(statusCopy);
        } else {
            getStatus().addAll(statusCopy);
        }
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
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: ").append(getAssessmentArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecommendationTemplateArn() != null)
            sb.append("RecommendationTemplateArn: ").append(getRecommendationTemplateArn()).append(",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: ").append(getReverseOrder()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationTemplatesRequest == false)
            return false;
        ListRecommendationTemplatesRequest other = (ListRecommendationTemplatesRequest) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecommendationTemplateArn() == null ^ this.getRecommendationTemplateArn() == null)
            return false;
        if (other.getRecommendationTemplateArn() != null && other.getRecommendationTemplateArn().equals(this.getRecommendationTemplateArn()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null && other.getReverseOrder().equals(this.getReverseOrder()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendationTemplateArn() == null) ? 0 : getRecommendationTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getReverseOrder() == null) ? 0 : getReverseOrder().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationTemplatesRequest clone() {
        return (ListRecommendationTemplatesRequest) super.clone();
    }

}
