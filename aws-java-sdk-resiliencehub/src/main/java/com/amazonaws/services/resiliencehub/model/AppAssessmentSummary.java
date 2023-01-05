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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an application assessment summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AppAssessmentSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAssessmentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private String appVersion;
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
     * The name of the assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     */
    private String assessmentStatus;
    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * The cost for the application.
     * </p>
     */
    private Cost cost;
    /**
     * <p>
     * The end time for the action.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     */
    private String invoker;
    /**
     * <p>
     * The message from the assessment run.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     */
    private Double resiliencyScore;
    /**
     * <p>
     * The starting time for the action.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
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

    public AppAssessmentSummary withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @return The name of the assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        The current status of the assessment for the resiliency policy.
     * @see AssessmentStatus
     */

    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @return The current status of the assessment for the resiliency policy.
     * @see AssessmentStatus
     */

    public String getAssessmentStatus() {
        return this.assessmentStatus;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        The current status of the assessment for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AppAssessmentSummary withAssessmentStatus(String assessmentStatus) {
        setAssessmentStatus(assessmentStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        The current status of the assessment for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AppAssessmentSummary withAssessmentStatus(AssessmentStatus assessmentStatus) {
        this.assessmentStatus = assessmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @return The current status of compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppAssessmentSummary withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppAssessmentSummary withComplianceStatus(ComplianceStatus complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     */

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @return The cost for the application.
     */

    public Cost getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withCost(Cost cost) {
        setCost(cost);
        return this;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @param endTime
     *        The end time for the action.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @return The end time for the action.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @param endTime
     *        The end time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        The entity that invoked the assessment.
     * @see AssessmentInvoker
     */

    public void setInvoker(String invoker) {
        this.invoker = invoker;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @return The entity that invoked the assessment.
     * @see AssessmentInvoker
     */

    public String getInvoker() {
        return this.invoker;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        The entity that invoked the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public AppAssessmentSummary withInvoker(String invoker) {
        setInvoker(invoker);
        return this;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        The entity that invoked the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public AppAssessmentSummary withInvoker(AssessmentInvoker invoker) {
        this.invoker = invoker.toString();
        return this;
    }

    /**
     * <p>
     * The message from the assessment run.
     * </p>
     * 
     * @param message
     *        The message from the assessment run.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message from the assessment run.
     * </p>
     * 
     * @return The message from the assessment run.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message from the assessment run.
     * </p>
     * 
     * @param message
     *        The message from the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        The current resiliency score for the application.
     */

    public void setResiliencyScore(Double resiliencyScore) {
        this.resiliencyScore = resiliencyScore;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @return The current resiliency score for the application.
     */

    public Double getResiliencyScore() {
        return this.resiliencyScore;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        The current resiliency score for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withResiliencyScore(Double resiliencyScore) {
        setResiliencyScore(resiliencyScore);
        return this;
    }

    /**
     * <p>
     * The starting time for the action.
     * </p>
     * 
     * @param startTime
     *        The starting time for the action.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The starting time for the action.
     * </p>
     * 
     * @return The starting time for the action.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The starting time for the action.
     * </p>
     * 
     * @param startTime
     *        The starting time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: ").append(getAssessmentArn()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getAssessmentStatus() != null)
            sb.append("AssessmentStatus: ").append(getAssessmentStatus()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getCost() != null)
            sb.append("Cost: ").append(getCost()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInvoker() != null)
            sb.append("Invoker: ").append(getInvoker()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResiliencyScore() != null)
            sb.append("ResiliencyScore: ").append(getResiliencyScore()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppAssessmentSummary == false)
            return false;
        AppAssessmentSummary other = (AppAssessmentSummary) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getAssessmentName() == null ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getAssessmentStatus() == null ^ this.getAssessmentStatus() == null)
            return false;
        if (other.getAssessmentStatus() != null && other.getAssessmentStatus().equals(this.getAssessmentStatus()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInvoker() == null ^ this.getInvoker() == null)
            return false;
        if (other.getInvoker() != null && other.getInvoker().equals(this.getInvoker()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResiliencyScore() == null ^ this.getResiliencyScore() == null)
            return false;
        if (other.getResiliencyScore() != null && other.getResiliencyScore().equals(this.getResiliencyScore()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentStatus() == null) ? 0 : getAssessmentStatus().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInvoker() == null) ? 0 : getInvoker().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResiliencyScore() == null) ? 0 : getResiliencyScore().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public AppAssessmentSummary clone() {
        try {
            return (AppAssessmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppAssessmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
