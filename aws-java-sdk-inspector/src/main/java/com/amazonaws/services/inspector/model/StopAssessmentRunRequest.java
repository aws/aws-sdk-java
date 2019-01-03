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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/StopAssessmentRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopAssessmentRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the assessment run that you want to stop.
     * </p>
     */
    private String assessmentRunArn;
    /**
     * <p>
     * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default
     * value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation
     * process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
     * </p>
     */
    private String stopAction;

    /**
     * <p>
     * The ARN of the assessment run that you want to stop.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run that you want to stop.
     */

    public void setAssessmentRunArn(String assessmentRunArn) {
        this.assessmentRunArn = assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that you want to stop.
     * </p>
     * 
     * @return The ARN of the assessment run that you want to stop.
     */

    public String getAssessmentRunArn() {
        return this.assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that you want to stop.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run that you want to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopAssessmentRunRequest withAssessmentRunArn(String assessmentRunArn) {
        setAssessmentRunArn(assessmentRunArn);
        return this;
    }

    /**
     * <p>
     * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default
     * value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation
     * process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
     * </p>
     * 
     * @param stopAction
     *        An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the
     *        default value), stops the AWS agent from collecting data and begins the results evaluation and the
     *        findings generation process. SKIP_EVALUATION cancels the assessment run immediately, after which no
     *        findings are generated.
     * @see StopAction
     */

    public void setStopAction(String stopAction) {
        this.stopAction = stopAction;
    }

    /**
     * <p>
     * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default
     * value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation
     * process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
     * </p>
     * 
     * @return An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the
     *         default value), stops the AWS agent from collecting data and begins the results evaluation and the
     *         findings generation process. SKIP_EVALUATION cancels the assessment run immediately, after which no
     *         findings are generated.
     * @see StopAction
     */

    public String getStopAction() {
        return this.stopAction;
    }

    /**
     * <p>
     * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default
     * value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation
     * process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
     * </p>
     * 
     * @param stopAction
     *        An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the
     *        default value), stops the AWS agent from collecting data and begins the results evaluation and the
     *        findings generation process. SKIP_EVALUATION cancels the assessment run immediately, after which no
     *        findings are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopAction
     */

    public StopAssessmentRunRequest withStopAction(String stopAction) {
        setStopAction(stopAction);
        return this;
    }

    /**
     * <p>
     * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default
     * value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation
     * process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
     * </p>
     * 
     * @param stopAction
     *        An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the
     *        default value), stops the AWS agent from collecting data and begins the results evaluation and the
     *        findings generation process. SKIP_EVALUATION cancels the assessment run immediately, after which no
     *        findings are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopAction
     */

    public StopAssessmentRunRequest withStopAction(StopAction stopAction) {
        this.stopAction = stopAction.toString();
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
        if (getAssessmentRunArn() != null)
            sb.append("AssessmentRunArn: ").append(getAssessmentRunArn()).append(",");
        if (getStopAction() != null)
            sb.append("StopAction: ").append(getStopAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopAssessmentRunRequest == false)
            return false;
        StopAssessmentRunRequest other = (StopAssessmentRunRequest) obj;
        if (other.getAssessmentRunArn() == null ^ this.getAssessmentRunArn() == null)
            return false;
        if (other.getAssessmentRunArn() != null && other.getAssessmentRunArn().equals(this.getAssessmentRunArn()) == false)
            return false;
        if (other.getStopAction() == null ^ this.getStopAction() == null)
            return false;
        if (other.getStopAction() != null && other.getStopAction().equals(this.getStopAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentRunArn() == null) ? 0 : getAssessmentRunArn().hashCode());
        hashCode = prime * hashCode + ((getStopAction() == null) ? 0 : getStopAction().hashCode());
        return hashCode;
    }

    @Override
    public StopAssessmentRunRequest clone() {
        return (StopAssessmentRunRequest) super.clone();
    }

}
