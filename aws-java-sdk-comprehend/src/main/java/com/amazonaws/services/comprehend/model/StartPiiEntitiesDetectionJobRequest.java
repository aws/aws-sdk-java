/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartPiiEntitiesDetectionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartPiiEntitiesDetectionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection jobs.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII entities are
     * redacted.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to <code>ONLY_REDACTION</code>. In that
     * case, you must provide a <code>RedactionConfig</code> definition that includes the <code>PiiEntityTypes</code>
     * parameter.
     * </p>
     */
    private RedactionConfig redactionConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The identifier of the job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The language of the input documents.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input properties for a PII entities detection job.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     * 
     * @return The input properties for a PII entities detection job.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input properties for a PII entities detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPiiEntitiesDetectionJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection jobs.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides conﬁguration parameters for the output of PII entity detection jobs.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection jobs.
     * </p>
     * 
     * @return Provides conﬁguration parameters for the output of PII entity detection jobs.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Provides conﬁguration parameters for the output of PII entity detection jobs.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides conﬁguration parameters for the output of PII entity detection jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPiiEntitiesDetectionJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII entities are
     * redacted.
     * </p>
     * 
     * @param mode
     *        Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII
     *        entities are redacted.
     * @see PiiEntitiesDetectionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII entities are
     * redacted.
     * </p>
     * 
     * @return Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII
     *         entities are redacted.
     * @see PiiEntitiesDetectionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII entities are
     * redacted.
     * </p>
     * 
     * @param mode
     *        Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII
     *        entities are redacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntitiesDetectionMode
     */

    public StartPiiEntitiesDetectionJobRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII entities are
     * redacted.
     * </p>
     * 
     * @param mode
     *        Specifies whether the output provides the locations (offsets) of PII entities or a file in which PII
     *        entities are redacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntitiesDetectionMode
     */

    public StartPiiEntitiesDetectionJobRequest withMode(PiiEntitiesDetectionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to <code>ONLY_REDACTION</code>. In that
     * case, you must provide a <code>RedactionConfig</code> definition that includes the <code>PiiEntityTypes</code>
     * parameter.
     * </p>
     * 
     * @param redactionConfig
     *        Provides configuration parameters for PII entity redaction.</p>
     *        <p>
     *        This parameter is required if you set the <code>Mode</code> parameter to <code>ONLY_REDACTION</code>. In
     *        that case, you must provide a <code>RedactionConfig</code> definition that includes the
     *        <code>PiiEntityTypes</code> parameter.
     */

    public void setRedactionConfig(RedactionConfig redactionConfig) {
        this.redactionConfig = redactionConfig;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to <code>ONLY_REDACTION</code>. In that
     * case, you must provide a <code>RedactionConfig</code> definition that includes the <code>PiiEntityTypes</code>
     * parameter.
     * </p>
     * 
     * @return Provides configuration parameters for PII entity redaction.</p>
     *         <p>
     *         This parameter is required if you set the <code>Mode</code> parameter to <code>ONLY_REDACTION</code>. In
     *         that case, you must provide a <code>RedactionConfig</code> definition that includes the
     *         <code>PiiEntityTypes</code> parameter.
     */

    public RedactionConfig getRedactionConfig() {
        return this.redactionConfig;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to <code>ONLY_REDACTION</code>. In that
     * case, you must provide a <code>RedactionConfig</code> definition that includes the <code>PiiEntityTypes</code>
     * parameter.
     * </p>
     * 
     * @param redactionConfig
     *        Provides configuration parameters for PII entity redaction.</p>
     *        <p>
     *        This parameter is required if you set the <code>Mode</code> parameter to <code>ONLY_REDACTION</code>. In
     *        that case, you must provide a <code>RedactionConfig</code> definition that includes the
     *        <code>PiiEntityTypes</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPiiEntitiesDetectionJobRequest withRedactionConfig(RedactionConfig redactionConfig) {
        setRedactionConfig(redactionConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon
     *         Comprehend read access to your input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPiiEntitiesDetectionJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * 
     * @param jobName
     *        The identifier of the job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * 
     * @return The identifier of the job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The identifier of the job.
     * </p>
     * 
     * @param jobName
     *        The identifier of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPiiEntitiesDetectionJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @return The language of the input documents.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartPiiEntitiesDetectionJobRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartPiiEntitiesDetectionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the request. If you don't set the client request token, Amazon Comprehend
     *        generates one.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @return A unique identifier for the request. If you don't set the client request token, Amazon Comprehend
     *         generates one.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the request. If you don't set the client request token, Amazon Comprehend
     *        generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPiiEntitiesDetectionJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getRedactionConfig() != null)
            sb.append("RedactionConfig: ").append(getRedactionConfig()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartPiiEntitiesDetectionJobRequest == false)
            return false;
        StartPiiEntitiesDetectionJobRequest other = (StartPiiEntitiesDetectionJobRequest) obj;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getRedactionConfig() == null ^ this.getRedactionConfig() == null)
            return false;
        if (other.getRedactionConfig() != null && other.getRedactionConfig().equals(this.getRedactionConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getRedactionConfig() == null) ? 0 : getRedactionConfig().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartPiiEntitiesDetectionJobRequest clone() {
        return (StartPiiEntitiesDetectionJobRequest) super.clone();
    }

}
