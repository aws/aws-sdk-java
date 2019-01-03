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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCompilationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account.
     * </p>
     */
    private String compilationJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of
     * this API must have the <code>iam:PassRole</code> permission. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles.</a>
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Provides information about the location of input model artifacts, the name and shape of the expected data inputs,
     * and the framework in which the model was trained.
     * </p>
     */
    private InputConfig inputConfig;
    /**
     * <p>
     * Provides information about the output location for the compiled model and the target device the model runs on.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     */
    private StoppingCondition stoppingCondition;

    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account.
     * </p>
     * 
     * @param compilationJobName
     *        A name for the model compilation job. The name must be unique within the AWS Region and within your AWS
     *        account.
     */

    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account.
     * </p>
     * 
     * @return A name for the model compilation job. The name must be unique within the AWS Region and within your AWS
     *         account.
     */

    public String getCompilationJobName() {
        return this.compilationJobName;
    }

    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account.
     * </p>
     * 
     * @param compilationJobName
     *        A name for the model compilation job. The name must be unique within the AWS Region and within your AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCompilationJobRequest withCompilationJobName(String compilationJobName) {
        setCompilationJobName(compilationJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of
     * this API must have the <code>iam:PassRole</code> permission. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles.</a>
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf. </p>
     *        <p>
     *        During model compilation, Amazon SageMaker needs your permission to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Read input data from an S3 bucket
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Write model artifacts to an S3 bucket
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Write logs to Amazon CloudWatch Logs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Publish metrics to Amazon CloudWatch
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the
     *        caller of this API must have the <code>iam:PassRole</code> permission. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles.</a>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of
     * this API must have the <code>iam:PassRole</code> permission. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles.</a>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your
     *         behalf. </p>
     *         <p>
     *         During model compilation, Amazon SageMaker needs your permission to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Read input data from an S3 bucket
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Write model artifacts to an S3 bucket
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Write logs to Amazon CloudWatch Logs
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Publish metrics to Amazon CloudWatch
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the
     *         caller of this API must have the <code>iam:PassRole</code> permission. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles.</a>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of
     * this API must have the <code>iam:PassRole</code> permission. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles.</a>
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf. </p>
     *        <p>
     *        During model compilation, Amazon SageMaker needs your permission to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Read input data from an S3 bucket
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Write model artifacts to an S3 bucket
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Write logs to Amazon CloudWatch Logs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Publish metrics to Amazon CloudWatch
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the
     *        caller of this API must have the <code>iam:PassRole</code> permission. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCompilationJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Provides information about the location of input model artifacts, the name and shape of the expected data inputs,
     * and the framework in which the model was trained.
     * </p>
     * 
     * @param inputConfig
     *        Provides information about the location of input model artifacts, the name and shape of the expected data
     *        inputs, and the framework in which the model was trained.
     */

    public void setInputConfig(InputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Provides information about the location of input model artifacts, the name and shape of the expected data inputs,
     * and the framework in which the model was trained.
     * </p>
     * 
     * @return Provides information about the location of input model artifacts, the name and shape of the expected data
     *         inputs, and the framework in which the model was trained.
     */

    public InputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Provides information about the location of input model artifacts, the name and shape of the expected data inputs,
     * and the framework in which the model was trained.
     * </p>
     * 
     * @param inputConfig
     *        Provides information about the location of input model artifacts, the name and shape of the expected data
     *        inputs, and the framework in which the model was trained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCompilationJobRequest withInputConfig(InputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * Provides information about the output location for the compiled model and the target device the model runs on.
     * </p>
     * 
     * @param outputConfig
     *        Provides information about the output location for the compiled model and the target device the model runs
     *        on.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Provides information about the output location for the compiled model and the target device the model runs on.
     * </p>
     * 
     * @return Provides information about the output location for the compiled model and the target device the model
     *         runs on.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Provides information about the output location for the compiled model and the target device the model runs on.
     * </p>
     * 
     * @param outputConfig
     *        Provides information about the output location for the compiled model and the target device the model runs
     *        on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCompilationJobRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     * 
     * @param stoppingCondition
     *        The duration allowed for model compilation.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     * 
     * @return The duration allowed for model compilation.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     * 
     * @param stoppingCondition
     *        The duration allowed for model compilation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCompilationJobRequest withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
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
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: ").append(getCompilationJobName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCompilationJobRequest == false)
            return false;
        CreateCompilationJobRequest other = (CreateCompilationJobRequest) obj;
        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public CreateCompilationJobRequest clone() {
        return (CreateCompilationJobRequest) super.clone();
    }

}
