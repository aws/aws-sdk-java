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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartFraudsterRegistrationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFraudsterRegistrationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the Job output file. Refer to the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-fraudster-watchlist.html">Create and edit a
     * fraudster watchlist</a> documentation for the permissions needed in this role.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The identifier of the domain containing the fraudster registration job and in which the fraudsters are
     * registered.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of fraudster
     * registration requests.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The name of the new fraudster registration job.
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
     * The registration config containing details such as the action to take when a duplicate fraudster is detected, and
     * the similarity threshold to use for detecting a duplicate fraudster.
     * </p>
     */
    private RegistrationConfig registrationConfig;

    /**
     * <p>
     * The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services
     *        SDK populates this field.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     * 
     * @return The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services
     *         SDK populates this field.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services SDK
     * populates this field.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for starting a new fraudster registration job. If not provided, Amazon Web Services
     *        SDK populates this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFraudsterRegistrationJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the Job output file. Refer to the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-fraudster-watchlist.html">Create and edit a
     * fraudster watchlist</a> documentation for the permissions needed in this role.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *        read the input manifest file and write the Job output file. Refer to the <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-fraudster-watchlist.html">Create and
     *        edit a fraudster watchlist</a> documentation for the permissions needed in this role.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the Job output file. Refer to the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-fraudster-watchlist.html">Create and edit a
     * fraudster watchlist</a> documentation for the permissions needed in this role.
     * </p>
     * 
     * @return The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *         read the input manifest file and write the Job output file. Refer to the <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-fraudster-watchlist.html">Create and
     *         edit a fraudster watchlist</a> documentation for the permissions needed in this role.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the Job output file. Refer to the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-fraudster-watchlist.html">Create and edit a
     * fraudster watchlist</a> documentation for the permissions needed in this role.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *        read the input manifest file and write the Job output file. Refer to the <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/voiceid-fraudster-watchlist.html">Create and
     *        edit a fraudster watchlist</a> documentation for the permissions needed in this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFraudsterRegistrationJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain containing the fraudster registration job and in which the fraudsters are
     * registered.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the fraudster registration job and in which the fraudsters are
     *        registered.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the fraudster registration job and in which the fraudsters are
     * registered.
     * </p>
     * 
     * @return The identifier of the domain containing the fraudster registration job and in which the fraudsters are
     *         registered.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the fraudster registration job and in which the fraudsters are
     * registered.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the fraudster registration job and in which the fraudsters are
     *        registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFraudsterRegistrationJobRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of fraudster
     * registration requests.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data config containing an S3 URI for the input manifest file that contains the list of fraudster
     *        registration requests.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of fraudster
     * registration requests.
     * </p>
     * 
     * @return The input data config containing an S3 URI for the input manifest file that contains the list of
     *         fraudster registration requests.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of fraudster
     * registration requests.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data config containing an S3 URI for the input manifest file that contains the list of fraudster
     *        registration requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFraudsterRegistrationJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The name of the new fraudster registration job.
     * </p>
     * 
     * @param jobName
     *        The name of the new fraudster registration job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the new fraudster registration job.
     * </p>
     * 
     * @return The name of the new fraudster registration job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the new fraudster registration job.
     * </p>
     * 
     * @param jobName
     *        The name of the new fraudster registration job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFraudsterRegistrationJobRequest withJobName(String jobName) {
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

    public StartFraudsterRegistrationJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The registration config containing details such as the action to take when a duplicate fraudster is detected, and
     * the similarity threshold to use for detecting a duplicate fraudster.
     * </p>
     * 
     * @param registrationConfig
     *        The registration config containing details such as the action to take when a duplicate fraudster is
     *        detected, and the similarity threshold to use for detecting a duplicate fraudster.
     */

    public void setRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
    }

    /**
     * <p>
     * The registration config containing details such as the action to take when a duplicate fraudster is detected, and
     * the similarity threshold to use for detecting a duplicate fraudster.
     * </p>
     * 
     * @return The registration config containing details such as the action to take when a duplicate fraudster is
     *         detected, and the similarity threshold to use for detecting a duplicate fraudster.
     */

    public RegistrationConfig getRegistrationConfig() {
        return this.registrationConfig;
    }

    /**
     * <p>
     * The registration config containing details such as the action to take when a duplicate fraudster is detected, and
     * the similarity threshold to use for detecting a duplicate fraudster.
     * </p>
     * 
     * @param registrationConfig
     *        The registration config containing details such as the action to take when a duplicate fraudster is
     *        detected, and the similarity threshold to use for detecting a duplicate fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFraudsterRegistrationJobRequest withRegistrationConfig(RegistrationConfig registrationConfig) {
        setRegistrationConfig(registrationConfig);
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getRegistrationConfig() != null)
            sb.append("RegistrationConfig: ").append(getRegistrationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFraudsterRegistrationJobRequest == false)
            return false;
        StartFraudsterRegistrationJobRequest other = (StartFraudsterRegistrationJobRequest) obj;
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
        if (other.getRegistrationConfig() == null ^ this.getRegistrationConfig() == null)
            return false;
        if (other.getRegistrationConfig() != null && other.getRegistrationConfig().equals(this.getRegistrationConfig()) == false)
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
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getRegistrationConfig() == null) ? 0 : getRegistrationConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartFraudsterRegistrationJobRequest clone() {
        return (StartFraudsterRegistrationJobRequest) super.clone();
    }

}
