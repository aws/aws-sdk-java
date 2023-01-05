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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for the metadata for the ClarifyCheck step. For more information, see the topic on <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/build-and-manage-steps.html#step-type-clarify-check"
 * >ClarifyCheck step</a> in the <i>Amazon SageMaker Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClarifyCheckStepMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyCheckStepMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the Clarify Check step
     * </p>
     */
    private String checkType;
    /**
     * <p>
     * The Amazon S3 URI of baseline constraints file to be used for the drift check.
     * </p>
     */
    private String baselineUsedForDriftCheckConstraints;
    /**
     * <p>
     * The Amazon S3 URI of the newly calculated baseline constraints file.
     * </p>
     */
    private String calculatedBaselineConstraints;
    /**
     * <p>
     * The model package group name.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * The Amazon S3 URI of the violation report if violations are detected.
     * </p>
     */
    private String violationReport;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the check processing job that was run by this step's execution.
     * </p>
     */
    private String checkJobArn;
    /**
     * <p>
     * This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set to
     * <code>False</code>, the previous baseline of the configured check type must be available.
     * </p>
     */
    private Boolean skipCheck;
    /**
     * <p>
     * This flag indicates if a newly calculated baseline can be accessed through step properties
     * <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>. If it is
     * set to <code>False</code>, the previous baseline of the configured check type must also be available. These can
     * be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     * </p>
     */
    private Boolean registerNewBaseline;

    /**
     * <p>
     * The type of the Clarify Check step
     * </p>
     * 
     * @param checkType
     *        The type of the Clarify Check step
     */

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    /**
     * <p>
     * The type of the Clarify Check step
     * </p>
     * 
     * @return The type of the Clarify Check step
     */

    public String getCheckType() {
        return this.checkType;
    }

    /**
     * <p>
     * The type of the Clarify Check step
     * </p>
     * 
     * @param checkType
     *        The type of the Clarify Check step
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withCheckType(String checkType) {
        setCheckType(checkType);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI of baseline constraints file to be used for the drift check.
     * </p>
     * 
     * @param baselineUsedForDriftCheckConstraints
     *        The Amazon S3 URI of baseline constraints file to be used for the drift check.
     */

    public void setBaselineUsedForDriftCheckConstraints(String baselineUsedForDriftCheckConstraints) {
        this.baselineUsedForDriftCheckConstraints = baselineUsedForDriftCheckConstraints;
    }

    /**
     * <p>
     * The Amazon S3 URI of baseline constraints file to be used for the drift check.
     * </p>
     * 
     * @return The Amazon S3 URI of baseline constraints file to be used for the drift check.
     */

    public String getBaselineUsedForDriftCheckConstraints() {
        return this.baselineUsedForDriftCheckConstraints;
    }

    /**
     * <p>
     * The Amazon S3 URI of baseline constraints file to be used for the drift check.
     * </p>
     * 
     * @param baselineUsedForDriftCheckConstraints
     *        The Amazon S3 URI of baseline constraints file to be used for the drift check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withBaselineUsedForDriftCheckConstraints(String baselineUsedForDriftCheckConstraints) {
        setBaselineUsedForDriftCheckConstraints(baselineUsedForDriftCheckConstraints);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI of the newly calculated baseline constraints file.
     * </p>
     * 
     * @param calculatedBaselineConstraints
     *        The Amazon S3 URI of the newly calculated baseline constraints file.
     */

    public void setCalculatedBaselineConstraints(String calculatedBaselineConstraints) {
        this.calculatedBaselineConstraints = calculatedBaselineConstraints;
    }

    /**
     * <p>
     * The Amazon S3 URI of the newly calculated baseline constraints file.
     * </p>
     * 
     * @return The Amazon S3 URI of the newly calculated baseline constraints file.
     */

    public String getCalculatedBaselineConstraints() {
        return this.calculatedBaselineConstraints;
    }

    /**
     * <p>
     * The Amazon S3 URI of the newly calculated baseline constraints file.
     * </p>
     * 
     * @param calculatedBaselineConstraints
     *        The Amazon S3 URI of the newly calculated baseline constraints file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withCalculatedBaselineConstraints(String calculatedBaselineConstraints) {
        setCalculatedBaselineConstraints(calculatedBaselineConstraints);
        return this;
    }

    /**
     * <p>
     * The model package group name.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The model package group name.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The model package group name.
     * </p>
     * 
     * @return The model package group name.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The model package group name.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The model package group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI of the violation report if violations are detected.
     * </p>
     * 
     * @param violationReport
     *        The Amazon S3 URI of the violation report if violations are detected.
     */

    public void setViolationReport(String violationReport) {
        this.violationReport = violationReport;
    }

    /**
     * <p>
     * The Amazon S3 URI of the violation report if violations are detected.
     * </p>
     * 
     * @return The Amazon S3 URI of the violation report if violations are detected.
     */

    public String getViolationReport() {
        return this.violationReport;
    }

    /**
     * <p>
     * The Amazon S3 URI of the violation report if violations are detected.
     * </p>
     * 
     * @param violationReport
     *        The Amazon S3 URI of the violation report if violations are detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withViolationReport(String violationReport) {
        setViolationReport(violationReport);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the check processing job that was run by this step's execution.
     * </p>
     * 
     * @param checkJobArn
     *        The Amazon Resource Name (ARN) of the check processing job that was run by this step's execution.
     */

    public void setCheckJobArn(String checkJobArn) {
        this.checkJobArn = checkJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the check processing job that was run by this step's execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the check processing job that was run by this step's execution.
     */

    public String getCheckJobArn() {
        return this.checkJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the check processing job that was run by this step's execution.
     * </p>
     * 
     * @param checkJobArn
     *        The Amazon Resource Name (ARN) of the check processing job that was run by this step's execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withCheckJobArn(String checkJobArn) {
        setCheckJobArn(checkJobArn);
        return this;
    }

    /**
     * <p>
     * This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set to
     * <code>False</code>, the previous baseline of the configured check type must be available.
     * </p>
     * 
     * @param skipCheck
     *        This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set
     *        to <code>False</code>, the previous baseline of the configured check type must be available.
     */

    public void setSkipCheck(Boolean skipCheck) {
        this.skipCheck = skipCheck;
    }

    /**
     * <p>
     * This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set to
     * <code>False</code>, the previous baseline of the configured check type must be available.
     * </p>
     * 
     * @return This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set
     *         to <code>False</code>, the previous baseline of the configured check type must be available.
     */

    public Boolean getSkipCheck() {
        return this.skipCheck;
    }

    /**
     * <p>
     * This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set to
     * <code>False</code>, the previous baseline of the configured check type must be available.
     * </p>
     * 
     * @param skipCheck
     *        This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set
     *        to <code>False</code>, the previous baseline of the configured check type must be available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withSkipCheck(Boolean skipCheck) {
        setSkipCheck(skipCheck);
        return this;
    }

    /**
     * <p>
     * This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set to
     * <code>False</code>, the previous baseline of the configured check type must be available.
     * </p>
     * 
     * @return This flag indicates if the drift check against the previous baseline will be skipped or not. If it is set
     *         to <code>False</code>, the previous baseline of the configured check type must be available.
     */

    public Boolean isSkipCheck() {
        return this.skipCheck;
    }

    /**
     * <p>
     * This flag indicates if a newly calculated baseline can be accessed through step properties
     * <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>. If it is
     * set to <code>False</code>, the previous baseline of the configured check type must also be available. These can
     * be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     * </p>
     * 
     * @param registerNewBaseline
     *        This flag indicates if a newly calculated baseline can be accessed through step properties
     *        <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>. If
     *        it is set to <code>False</code>, the previous baseline of the configured check type must also be
     *        available. These can be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     */

    public void setRegisterNewBaseline(Boolean registerNewBaseline) {
        this.registerNewBaseline = registerNewBaseline;
    }

    /**
     * <p>
     * This flag indicates if a newly calculated baseline can be accessed through step properties
     * <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>. If it is
     * set to <code>False</code>, the previous baseline of the configured check type must also be available. These can
     * be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     * </p>
     * 
     * @return This flag indicates if a newly calculated baseline can be accessed through step properties
     *         <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>.
     *         If it is set to <code>False</code>, the previous baseline of the configured check type must also be
     *         available. These can be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     */

    public Boolean getRegisterNewBaseline() {
        return this.registerNewBaseline;
    }

    /**
     * <p>
     * This flag indicates if a newly calculated baseline can be accessed through step properties
     * <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>. If it is
     * set to <code>False</code>, the previous baseline of the configured check type must also be available. These can
     * be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     * </p>
     * 
     * @param registerNewBaseline
     *        This flag indicates if a newly calculated baseline can be accessed through step properties
     *        <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>. If
     *        it is set to <code>False</code>, the previous baseline of the configured check type must also be
     *        available. These can be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyCheckStepMetadata withRegisterNewBaseline(Boolean registerNewBaseline) {
        setRegisterNewBaseline(registerNewBaseline);
        return this;
    }

    /**
     * <p>
     * This flag indicates if a newly calculated baseline can be accessed through step properties
     * <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>. If it is
     * set to <code>False</code>, the previous baseline of the configured check type must also be available. These can
     * be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     * </p>
     * 
     * @return This flag indicates if a newly calculated baseline can be accessed through step properties
     *         <code>BaselineUsedForDriftCheckConstraints</code> and <code>BaselineUsedForDriftCheckStatistics</code>.
     *         If it is set to <code>False</code>, the previous baseline of the configured check type must also be
     *         available. These can be accessed through the <code>BaselineUsedForDriftCheckConstraints</code> property.
     */

    public Boolean isRegisterNewBaseline() {
        return this.registerNewBaseline;
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
        if (getCheckType() != null)
            sb.append("CheckType: ").append(getCheckType()).append(",");
        if (getBaselineUsedForDriftCheckConstraints() != null)
            sb.append("BaselineUsedForDriftCheckConstraints: ").append(getBaselineUsedForDriftCheckConstraints()).append(",");
        if (getCalculatedBaselineConstraints() != null)
            sb.append("CalculatedBaselineConstraints: ").append(getCalculatedBaselineConstraints()).append(",");
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getViolationReport() != null)
            sb.append("ViolationReport: ").append(getViolationReport()).append(",");
        if (getCheckJobArn() != null)
            sb.append("CheckJobArn: ").append(getCheckJobArn()).append(",");
        if (getSkipCheck() != null)
            sb.append("SkipCheck: ").append(getSkipCheck()).append(",");
        if (getRegisterNewBaseline() != null)
            sb.append("RegisterNewBaseline: ").append(getRegisterNewBaseline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClarifyCheckStepMetadata == false)
            return false;
        ClarifyCheckStepMetadata other = (ClarifyCheckStepMetadata) obj;
        if (other.getCheckType() == null ^ this.getCheckType() == null)
            return false;
        if (other.getCheckType() != null && other.getCheckType().equals(this.getCheckType()) == false)
            return false;
        if (other.getBaselineUsedForDriftCheckConstraints() == null ^ this.getBaselineUsedForDriftCheckConstraints() == null)
            return false;
        if (other.getBaselineUsedForDriftCheckConstraints() != null
                && other.getBaselineUsedForDriftCheckConstraints().equals(this.getBaselineUsedForDriftCheckConstraints()) == false)
            return false;
        if (other.getCalculatedBaselineConstraints() == null ^ this.getCalculatedBaselineConstraints() == null)
            return false;
        if (other.getCalculatedBaselineConstraints() != null
                && other.getCalculatedBaselineConstraints().equals(this.getCalculatedBaselineConstraints()) == false)
            return false;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getViolationReport() == null ^ this.getViolationReport() == null)
            return false;
        if (other.getViolationReport() != null && other.getViolationReport().equals(this.getViolationReport()) == false)
            return false;
        if (other.getCheckJobArn() == null ^ this.getCheckJobArn() == null)
            return false;
        if (other.getCheckJobArn() != null && other.getCheckJobArn().equals(this.getCheckJobArn()) == false)
            return false;
        if (other.getSkipCheck() == null ^ this.getSkipCheck() == null)
            return false;
        if (other.getSkipCheck() != null && other.getSkipCheck().equals(this.getSkipCheck()) == false)
            return false;
        if (other.getRegisterNewBaseline() == null ^ this.getRegisterNewBaseline() == null)
            return false;
        if (other.getRegisterNewBaseline() != null && other.getRegisterNewBaseline().equals(this.getRegisterNewBaseline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckType() == null) ? 0 : getCheckType().hashCode());
        hashCode = prime * hashCode + ((getBaselineUsedForDriftCheckConstraints() == null) ? 0 : getBaselineUsedForDriftCheckConstraints().hashCode());
        hashCode = prime * hashCode + ((getCalculatedBaselineConstraints() == null) ? 0 : getCalculatedBaselineConstraints().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getViolationReport() == null) ? 0 : getViolationReport().hashCode());
        hashCode = prime * hashCode + ((getCheckJobArn() == null) ? 0 : getCheckJobArn().hashCode());
        hashCode = prime * hashCode + ((getSkipCheck() == null) ? 0 : getSkipCheck().hashCode());
        hashCode = prime * hashCode + ((getRegisterNewBaseline() == null) ? 0 : getRegisterNewBaseline().hashCode());
        return hashCode;
    }

    @Override
    public ClarifyCheckStepMetadata clone() {
        try {
            return (ClarifyCheckStepMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClarifyCheckStepMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
