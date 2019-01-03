/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetExclusionsPreview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExclusionsPreviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the assessment template for which the exclusions preview was requested.
     * </p>
     */
    private String assessmentTemplateArn;
    /**
     * <p>
     * The unique identifier associated of the exclusions preview.
     * </p>
     */
    private String previewToken;
    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 100. The maximum value is 500.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * The ARN that specifies the assessment template for which the exclusions preview was requested.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The ARN that specifies the assessment template for which the exclusions preview was requested.
     */

    public void setAssessmentTemplateArn(String assessmentTemplateArn) {
        this.assessmentTemplateArn = assessmentTemplateArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment template for which the exclusions preview was requested.
     * </p>
     * 
     * @return The ARN that specifies the assessment template for which the exclusions preview was requested.
     */

    public String getAssessmentTemplateArn() {
        return this.assessmentTemplateArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment template for which the exclusions preview was requested.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The ARN that specifies the assessment template for which the exclusions preview was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExclusionsPreviewRequest withAssessmentTemplateArn(String assessmentTemplateArn) {
        setAssessmentTemplateArn(assessmentTemplateArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier associated of the exclusions preview.
     * </p>
     * 
     * @param previewToken
     *        The unique identifier associated of the exclusions preview.
     */

    public void setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
    }

    /**
     * <p>
     * The unique identifier associated of the exclusions preview.
     * </p>
     * 
     * @return The unique identifier associated of the exclusions preview.
     */

    public String getPreviewToken() {
        return this.previewToken;
    }

    /**
     * <p>
     * The unique identifier associated of the exclusions preview.
     * </p>
     * 
     * @param previewToken
     *        The unique identifier associated of the exclusions preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExclusionsPreviewRequest withPreviewToken(String previewToken) {
        setPreviewToken(previewToken);
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the
     *        request with the value of nextToken from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     * 
     * @return You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *         call to the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the
     *         request with the value of nextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to
     * the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value of this parameter to null on your first
     *        call to the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the
     *        request with the value of nextToken from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExclusionsPreviewRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 100. The maximum value is 500.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items you want in the response. The default
     *        value is 100. The maximum value is 500.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 100. The maximum value is 500.
     * </p>
     * 
     * @return You can use this parameter to indicate the maximum number of items you want in the response. The default
     *         value is 100. The maximum value is 500.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you want in the response. The default value is
     * 100. The maximum value is 500.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items you want in the response. The default
     *        value is 100. The maximum value is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExclusionsPreviewRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @return The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public GetExclusionsPreviewRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public GetExclusionsPreviewRequest withLocale(Locale locale) {
        this.locale = locale.toString();
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
        if (getAssessmentTemplateArn() != null)
            sb.append("AssessmentTemplateArn: ").append(getAssessmentTemplateArn()).append(",");
        if (getPreviewToken() != null)
            sb.append("PreviewToken: ").append(getPreviewToken()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExclusionsPreviewRequest == false)
            return false;
        GetExclusionsPreviewRequest other = (GetExclusionsPreviewRequest) obj;
        if (other.getAssessmentTemplateArn() == null ^ this.getAssessmentTemplateArn() == null)
            return false;
        if (other.getAssessmentTemplateArn() != null && other.getAssessmentTemplateArn().equals(this.getAssessmentTemplateArn()) == false)
            return false;
        if (other.getPreviewToken() == null ^ this.getPreviewToken() == null)
            return false;
        if (other.getPreviewToken() != null && other.getPreviewToken().equals(this.getPreviewToken()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTemplateArn() == null) ? 0 : getAssessmentTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getPreviewToken() == null) ? 0 : getPreviewToken().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public GetExclusionsPreviewRequest clone() {
        return (GetExclusionsPreviewRequest) super.clone();
    }

}
