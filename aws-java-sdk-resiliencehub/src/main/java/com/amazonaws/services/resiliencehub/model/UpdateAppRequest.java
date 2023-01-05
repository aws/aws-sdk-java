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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     */
    private String assessmentSchedule;
    /**
     * <p>
     * Specifies if the resiliency policy ARN should be cleared.
     * </p>
     */
    private Boolean clearResiliencyPolicyArn;
    /**
     * <p>
     * The optional description for an app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String policyArn;

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

    public UpdateAppRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @see AppAssessmentScheduleType
     */

    public void setAssessmentSchedule(String assessmentSchedule) {
        this.assessmentSchedule = assessmentSchedule;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @return Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @see AppAssessmentScheduleType
     */

    public String getAssessmentSchedule() {
        return this.assessmentSchedule;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAssessmentScheduleType
     */

    public UpdateAppRequest withAssessmentSchedule(String assessmentSchedule) {
        setAssessmentSchedule(assessmentSchedule);
        return this;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAssessmentScheduleType
     */

    public UpdateAppRequest withAssessmentSchedule(AppAssessmentScheduleType assessmentSchedule) {
        this.assessmentSchedule = assessmentSchedule.toString();
        return this;
    }

    /**
     * <p>
     * Specifies if the resiliency policy ARN should be cleared.
     * </p>
     * 
     * @param clearResiliencyPolicyArn
     *        Specifies if the resiliency policy ARN should be cleared.
     */

    public void setClearResiliencyPolicyArn(Boolean clearResiliencyPolicyArn) {
        this.clearResiliencyPolicyArn = clearResiliencyPolicyArn;
    }

    /**
     * <p>
     * Specifies if the resiliency policy ARN should be cleared.
     * </p>
     * 
     * @return Specifies if the resiliency policy ARN should be cleared.
     */

    public Boolean getClearResiliencyPolicyArn() {
        return this.clearResiliencyPolicyArn;
    }

    /**
     * <p>
     * Specifies if the resiliency policy ARN should be cleared.
     * </p>
     * 
     * @param clearResiliencyPolicyArn
     *        Specifies if the resiliency policy ARN should be cleared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withClearResiliencyPolicyArn(Boolean clearResiliencyPolicyArn) {
        setClearResiliencyPolicyArn(clearResiliencyPolicyArn);
        return this;
    }

    /**
     * <p>
     * Specifies if the resiliency policy ARN should be cleared.
     * </p>
     * 
     * @return Specifies if the resiliency policy ARN should be cleared.
     */

    public Boolean isClearResiliencyPolicyArn() {
        return this.clearResiliencyPolicyArn;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @return The optional description for an app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *         <code>policy-id</code>. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
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
        if (getAssessmentSchedule() != null)
            sb.append("AssessmentSchedule: ").append(getAssessmentSchedule()).append(",");
        if (getClearResiliencyPolicyArn() != null)
            sb.append("ClearResiliencyPolicyArn: ").append(getClearResiliencyPolicyArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppRequest == false)
            return false;
        UpdateAppRequest other = (UpdateAppRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAssessmentSchedule() == null ^ this.getAssessmentSchedule() == null)
            return false;
        if (other.getAssessmentSchedule() != null && other.getAssessmentSchedule().equals(this.getAssessmentSchedule()) == false)
            return false;
        if (other.getClearResiliencyPolicyArn() == null ^ this.getClearResiliencyPolicyArn() == null)
            return false;
        if (other.getClearResiliencyPolicyArn() != null && other.getClearResiliencyPolicyArn().equals(this.getClearResiliencyPolicyArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentSchedule() == null) ? 0 : getAssessmentSchedule().hashCode());
        hashCode = prime * hashCode + ((getClearResiliencyPolicyArn() == null) ? 0 : getClearResiliencyPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppRequest clone() {
        return (UpdateAppRequest) super.clone();
    }

}
