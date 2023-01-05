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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartSpeakerEnrollmentJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSpeakerEnrollmentJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-batch-enrollment.html">Batch enrollment using
     * audio data from prior calls</a> for the permissions needed in this role.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job and in which the speakers are enrolled.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The enrollment config that contains details such as the action to take when a speaker is already enrolled in
     * Voice ID or when a speaker is identified as a fraudster.
     * </p>
     */
    private EnrollmentConfig enrollmentConfig;
    /**
     * <p>
     * The input data config containing the S3 location for the input manifest file that contains the list of speaker
     * enrollment requests.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * A name for your speaker enrollment job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS key ID to encrypt the file.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK
     *        populates this field.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     * 
     * @return The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK
     *         populates this field.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for starting a new speaker enrollment Job. If not provided, Amazon Web Services SDK
     *        populates this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerEnrollmentJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-batch-enrollment.html">Batch enrollment using
     * audio data from prior calls</a> for the permissions needed in this role.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *        read the input manifest file and write the job output file. Refer to <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-batch-enrollment.html">Batch
     *        enrollment using audio data from prior calls</a> for the permissions needed in this role.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-batch-enrollment.html">Batch enrollment using
     * audio data from prior calls</a> for the permissions needed in this role.
     * </p>
     * 
     * @return The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *         read the input manifest file and write the job output file. Refer to <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-batch-enrollment.html">Batch
     *         enrollment using audio data from prior calls</a> for the permissions needed in this role.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-batch-enrollment.html">Batch enrollment using
     * audio data from prior calls</a> for the permissions needed in this role.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *        read the input manifest file and write the job output file. Refer to <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-batch-enrollment.html">Batch
     *        enrollment using audio data from prior calls</a> for the permissions needed in this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerEnrollmentJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job and in which the speakers are enrolled.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the speaker enrollment job and in which the speakers are
     *        enrolled.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job and in which the speakers are enrolled.
     * </p>
     * 
     * @return The identifier of the domain that contains the speaker enrollment job and in which the speakers are
     *         enrolled.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job and in which the speakers are enrolled.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the speaker enrollment job and in which the speakers are
     *        enrolled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerEnrollmentJobRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The enrollment config that contains details such as the action to take when a speaker is already enrolled in
     * Voice ID or when a speaker is identified as a fraudster.
     * </p>
     * 
     * @param enrollmentConfig
     *        The enrollment config that contains details such as the action to take when a speaker is already enrolled
     *        in Voice ID or when a speaker is identified as a fraudster.
     */

    public void setEnrollmentConfig(EnrollmentConfig enrollmentConfig) {
        this.enrollmentConfig = enrollmentConfig;
    }

    /**
     * <p>
     * The enrollment config that contains details such as the action to take when a speaker is already enrolled in
     * Voice ID or when a speaker is identified as a fraudster.
     * </p>
     * 
     * @return The enrollment config that contains details such as the action to take when a speaker is already enrolled
     *         in Voice ID or when a speaker is identified as a fraudster.
     */

    public EnrollmentConfig getEnrollmentConfig() {
        return this.enrollmentConfig;
    }

    /**
     * <p>
     * The enrollment config that contains details such as the action to take when a speaker is already enrolled in
     * Voice ID or when a speaker is identified as a fraudster.
     * </p>
     * 
     * @param enrollmentConfig
     *        The enrollment config that contains details such as the action to take when a speaker is already enrolled
     *        in Voice ID or when a speaker is identified as a fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerEnrollmentJobRequest withEnrollmentConfig(EnrollmentConfig enrollmentConfig) {
        setEnrollmentConfig(enrollmentConfig);
        return this;
    }

    /**
     * <p>
     * The input data config containing the S3 location for the input manifest file that contains the list of speaker
     * enrollment requests.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data config containing the S3 location for the input manifest file that contains the list of
     *        speaker enrollment requests.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data config containing the S3 location for the input manifest file that contains the list of speaker
     * enrollment requests.
     * </p>
     * 
     * @return The input data config containing the S3 location for the input manifest file that contains the list of
     *         speaker enrollment requests.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data config containing the S3 location for the input manifest file that contains the list of speaker
     * enrollment requests.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data config containing the S3 location for the input manifest file that contains the list of
     *        speaker enrollment requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerEnrollmentJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * A name for your speaker enrollment job.
     * </p>
     * 
     * @param jobName
     *        A name for your speaker enrollment job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * A name for your speaker enrollment job.
     * </p>
     * 
     * @return A name for your speaker enrollment job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * A name for your speaker enrollment job.
     * </p>
     * 
     * @param jobName
     *        A name for your speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerEnrollmentJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS key ID to encrypt the file.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data config containing the S3 location where Voice ID writes the job output file; you must also
     *        include a KMS key ID to encrypt the file.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS key ID to encrypt the file.
     * </p>
     * 
     * @return The output data config containing the S3 location where Voice ID writes the job output file; you must
     *         also include a KMS key ID to encrypt the file.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS key ID to encrypt the file.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data config containing the S3 location where Voice ID writes the job output file; you must also
     *        include a KMS key ID to encrypt the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerEnrollmentJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnrollmentConfig() != null)
            sb.append("EnrollmentConfig: ").append(getEnrollmentConfig()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSpeakerEnrollmentJobRequest == false)
            return false;
        StartSpeakerEnrollmentJobRequest other = (StartSpeakerEnrollmentJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnrollmentConfig() == null ^ this.getEnrollmentConfig() == null)
            return false;
        if (other.getEnrollmentConfig() != null && other.getEnrollmentConfig().equals(this.getEnrollmentConfig()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnrollmentConfig() == null) ? 0 : getEnrollmentConfig().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartSpeakerEnrollmentJobRequest clone() {
        return (StartSpeakerEnrollmentJobRequest) super.clone();
    }

}
