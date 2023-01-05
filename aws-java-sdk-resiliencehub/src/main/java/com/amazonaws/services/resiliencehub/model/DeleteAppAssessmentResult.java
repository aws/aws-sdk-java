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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppAssessment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The current status of the assessment for the resiliency policy.
     * </p>
     */
    private String assessmentStatus;

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

    public DeleteAppAssessmentResult withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
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

    public DeleteAppAssessmentResult withAssessmentStatus(String assessmentStatus) {
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

    public DeleteAppAssessmentResult withAssessmentStatus(AssessmentStatus assessmentStatus) {
        this.assessmentStatus = assessmentStatus.toString();
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
        if (getAssessmentStatus() != null)
            sb.append("AssessmentStatus: ").append(getAssessmentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppAssessmentResult == false)
            return false;
        DeleteAppAssessmentResult other = (DeleteAppAssessmentResult) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getAssessmentStatus() == null ^ this.getAssessmentStatus() == null)
            return false;
        if (other.getAssessmentStatus() != null && other.getAssessmentStatus().equals(this.getAssessmentStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentStatus() == null) ? 0 : getAssessmentStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppAssessmentResult clone() {
        try {
            return (DeleteAppAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
