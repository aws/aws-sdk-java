/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * You cannot perform a specified action if an assessment run is currently in
 * progress.
 * </p>
 */
public class AssessmentRunInProgressException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ARN(s) of the assessment run(s) that are currently in progress.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentRunArns")
    private java.util.List<String> assessmentRunArns;
    /**
     * <p>
     * Boolean value indicating whether the assessment runs ARN list is
     * truncated.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentRunArnsTruncated")
    private Boolean assessmentRunArnsTruncated;
    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    private Boolean canRetry;

    /**
     * Constructs a new AssessmentRunInProgressException with the specified
     * error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AssessmentRunInProgressException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ARN(s) of the assessment run(s) that are currently in progress.
     * </p>
     * 
     * @return The ARN(s) of the assessment run(s) that are currently in
     *         progress.
     */

    public java.util.List<String> getAssessmentRunArns() {
        return assessmentRunArns;
    }

    /**
     * <p>
     * The ARN(s) of the assessment run(s) that are currently in progress.
     * </p>
     * 
     * @param assessmentRunArns
     *        The ARN(s) of the assessment run(s) that are currently in
     *        progress.
     */

    public void setAssessmentRunArns(
            java.util.Collection<String> assessmentRunArns) {
        if (assessmentRunArns == null) {
            this.assessmentRunArns = null;
            return;
        }

        this.assessmentRunArns = new java.util.ArrayList<String>(
                assessmentRunArns);
    }

    /**
     * <p>
     * The ARN(s) of the assessment run(s) that are currently in progress.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAssessmentRunArns(java.util.Collection)} or
     * {@link #withAssessmentRunArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assessmentRunArns
     *        The ARN(s) of the assessment run(s) that are currently in
     *        progress.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunInProgressException withAssessmentRunArns(
            String... assessmentRunArns) {
        if (this.assessmentRunArns == null) {
            setAssessmentRunArns(new java.util.ArrayList<String>(
                    assessmentRunArns.length));
        }
        for (String ele : assessmentRunArns) {
            this.assessmentRunArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN(s) of the assessment run(s) that are currently in progress.
     * </p>
     * 
     * @param assessmentRunArns
     *        The ARN(s) of the assessment run(s) that are currently in
     *        progress.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunInProgressException withAssessmentRunArns(
            java.util.Collection<String> assessmentRunArns) {
        setAssessmentRunArns(assessmentRunArns);
        return this;
    }

    /**
     * <p>
     * Boolean value indicating whether the assessment runs ARN list is
     * truncated.
     * </p>
     * 
     * @param assessmentRunArnsTruncated
     *        Boolean value indicating whether the assessment runs ARN list is
     *        truncated.
     */

    public void setAssessmentRunArnsTruncated(Boolean assessmentRunArnsTruncated) {
        this.assessmentRunArnsTruncated = assessmentRunArnsTruncated;
    }

    /**
     * <p>
     * Boolean value indicating whether the assessment runs ARN list is
     * truncated.
     * </p>
     * 
     * @return Boolean value indicating whether the assessment runs ARN list is
     *         truncated.
     */

    public Boolean getAssessmentRunArnsTruncated() {
        return this.assessmentRunArnsTruncated;
    }

    /**
     * <p>
     * Boolean value indicating whether the assessment runs ARN list is
     * truncated.
     * </p>
     * 
     * @param assessmentRunArnsTruncated
     *        Boolean value indicating whether the assessment runs ARN list is
     *        truncated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunInProgressException withAssessmentRunArnsTruncated(
            Boolean assessmentRunArnsTruncated) {
        setAssessmentRunArnsTruncated(assessmentRunArnsTruncated);
        return this;
    }

    /**
     * <p>
     * Boolean value indicating whether the assessment runs ARN list is
     * truncated.
     * </p>
     * 
     * @return Boolean value indicating whether the assessment runs ARN list is
     *         truncated.
     */

    public Boolean isAssessmentRunArnsTruncated() {
        return this.assessmentRunArnsTruncated;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     */

    public void setCanRetry(Boolean canRetry) {
        this.canRetry = canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    public Boolean getCanRetry() {
        return this.canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunInProgressException withCanRetry(Boolean canRetry) {
        setCanRetry(canRetry);
        return this;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    public Boolean isCanRetry() {
        return this.canRetry;
    }

}