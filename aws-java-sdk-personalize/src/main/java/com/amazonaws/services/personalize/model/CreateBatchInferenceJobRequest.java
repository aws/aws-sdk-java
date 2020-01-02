/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchInferenceJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBatchInferenceJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the batch inference job to create.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference
     * recommendations.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     */
    private Integer numResults;
    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in
     * JSON format.
     * </p>
     */
    private BatchInferenceJobInput jobInput;
    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     */
    private BatchInferenceJobOutput jobOutput;
    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input
     * and out Amazon S3 buckets respectively.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the batch inference job to create.
     * </p>
     * 
     * @param jobName
     *        The name of the batch inference job to create.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the batch inference job to create.
     * </p>
     * 
     * @return The name of the batch inference job to create.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the batch inference job to create.
     * </p>
     * 
     * @param jobName
     *        The name of the batch inference job to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchInferenceJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference
     * recommendations.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference
     *        recommendations.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference
     * recommendations.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference
     *         recommendations.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference
     * recommendations.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference
     *        recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchInferenceJobRequest withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     * 
     * @param numResults
     *        The number of recommendations to retreive.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     * 
     * @return The number of recommendations to retreive.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     * 
     * @param numResults
     *        The number of recommendations to retreive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchInferenceJobRequest withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in
     * JSON format.
     * </p>
     * 
     * @param jobInput
     *        The Amazon S3 path that leads to the input file to base your recommendations on. The input material must
     *        be in JSON format.
     */

    public void setJobInput(BatchInferenceJobInput jobInput) {
        this.jobInput = jobInput;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in
     * JSON format.
     * </p>
     * 
     * @return The Amazon S3 path that leads to the input file to base your recommendations on. The input material must
     *         be in JSON format.
     */

    public BatchInferenceJobInput getJobInput() {
        return this.jobInput;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in
     * JSON format.
     * </p>
     * 
     * @param jobInput
     *        The Amazon S3 path that leads to the input file to base your recommendations on. The input material must
     *        be in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchInferenceJobRequest withJobInput(BatchInferenceJobInput jobInput) {
        setJobInput(jobInput);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     * 
     * @param jobOutput
     *        The path to the Amazon S3 bucket where the job's output will be stored.
     */

    public void setJobOutput(BatchInferenceJobOutput jobOutput) {
        this.jobOutput = jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     * 
     * @return The path to the Amazon S3 bucket where the job's output will be stored.
     */

    public BatchInferenceJobOutput getJobOutput() {
        return this.jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     * 
     * @param jobOutput
     *        The path to the Amazon S3 bucket where the job's output will be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchInferenceJobRequest withJobOutput(BatchInferenceJobOutput jobOutput) {
        setJobOutput(jobOutput);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input
     * and out Amazon S3 buckets respectively.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your
     *        input and out Amazon S3 buckets respectively.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input
     * and out Amazon S3 buckets respectively.
     * </p>
     * 
     * @return The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your
     *         input and out Amazon S3 buckets respectively.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input
     * and out Amazon S3 buckets respectively.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your
     *        input and out Amazon S3 buckets respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchInferenceJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getJobInput() != null)
            sb.append("JobInput: ").append(getJobInput()).append(",");
        if (getJobOutput() != null)
            sb.append("JobOutput: ").append(getJobOutput()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBatchInferenceJobRequest == false)
            return false;
        CreateBatchInferenceJobRequest other = (CreateBatchInferenceJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getJobInput() == null ^ this.getJobInput() == null)
            return false;
        if (other.getJobInput() != null && other.getJobInput().equals(this.getJobInput()) == false)
            return false;
        if (other.getJobOutput() == null ^ this.getJobOutput() == null)
            return false;
        if (other.getJobOutput() != null && other.getJobOutput().equals(this.getJobOutput()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getJobInput() == null) ? 0 : getJobInput().hashCode());
        hashCode = prime * hashCode + ((getJobOutput() == null) ? 0 : getJobOutput().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateBatchInferenceJobRequest clone() {
        return (CreateBatchInferenceJobRequest) super.clone();
    }

}
