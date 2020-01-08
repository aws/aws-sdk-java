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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/StartTextTranslationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTextTranslationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the batch translation job to be performed.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the translation job.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon Translate
     * read access to your input data. For more nformation, see <a>identity-and-access-management</a>.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The language code of the input language. For a list of language codes, see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during batch translation jobs.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language code of the output language.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;
    /**
     * <p>
     * The name of the terminology to use in the batch translation job. For a list of available terminologies, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     */
    private java.util.List<String> terminologyNames;
    /**
     * <p>
     * The client token of the EC2 instance calling the request. This token is auto-generated when using the Amazon
     * Translate SDK. Otherwise, use the <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> EC2
     * operation to retreive an instance's client token. For more information, see <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html#client-tokens">Client
     * Tokens</a> in the EC2 User Guide.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the batch translation job to be performed.
     * </p>
     * 
     * @param jobName
     *        The name of the batch translation job to be performed.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the batch translation job to be performed.
     * </p>
     * 
     * @return The name of the batch translation job to be performed.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the batch translation job to be performed.
     * </p>
     * 
     * @param jobName
     *        The name of the batch translation job to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the translation job.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and S3 location of the input documents for the translation job.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the translation job.
     * </p>
     * 
     * @return Specifies the format and S3 location of the input documents for the translation job.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the translation job.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and S3 location of the input documents for the translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the S3 folder to which your job output will be saved.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     * 
     * @return Specifies the S3 folder to which your job output will be saved.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the S3 folder to which your job output will be saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon Translate
     * read access to your input data. For more nformation, see <a>identity-and-access-management</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon
     *        Translate read access to your input data. For more nformation, see <a>identity-and-access-management</a>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon Translate
     * read access to your input data. For more nformation, see <a>identity-and-access-management</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon
     *         Translate read access to your input data. For more nformation, see <a>identity-and-access-management</a>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon Translate
     * read access to your input data. For more nformation, see <a>identity-and-access-management</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon
     *        Translate read access to your input data. For more nformation, see <a>identity-and-access-management</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The language code of the input language. For a list of language codes, see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during batch translation jobs.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code of the input language. For a list of language codes, see <a>what-is-languages</a>.</p>
     *        <p>
     *        Amazon Translate does not automatically detect a source language during batch translation jobs.
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the input language. For a list of language codes, see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during batch translation jobs.
     * </p>
     * 
     * @return The language code of the input language. For a list of language codes, see <a>what-is-languages</a>.</p>
     *         <p>
     *         Amazon Translate does not automatically detect a source language during batch translation jobs.
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the input language. For a list of language codes, see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during batch translation jobs.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code of the input language. For a list of language codes, see <a>what-is-languages</a>.</p>
     *        <p>
     *        Amazon Translate does not automatically detect a source language during batch translation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the output language.
     * </p>
     * 
     * @return The language code of the output language.
     */

    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language code of the output language.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language code of the output language.
     */

    public void setTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        if (targetLanguageCodes == null) {
            this.targetLanguageCodes = null;
            return;
        }

        this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes);
    }

    /**
     * <p>
     * The language code of the output language.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLanguageCodes(java.util.Collection)} or {@link #withTargetLanguageCodes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language code of the output language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withTargetLanguageCodes(String... targetLanguageCodes) {
        if (this.targetLanguageCodes == null) {
            setTargetLanguageCodes(new java.util.ArrayList<String>(targetLanguageCodes.length));
        }
        for (String ele : targetLanguageCodes) {
            this.targetLanguageCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The language code of the output language.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language code of the output language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * The name of the terminology to use in the batch translation job. For a list of available terminologies, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * 
     * @return The name of the terminology to use in the batch translation job. For a list of available terminologies,
     *         use the <a>ListTerminologies</a> operation.
     */

    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * The name of the terminology to use in the batch translation job. For a list of available terminologies, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * 
     * @param terminologyNames
     *        The name of the terminology to use in the batch translation job. For a list of available terminologies,
     *        use the <a>ListTerminologies</a> operation.
     */

    public void setTerminologyNames(java.util.Collection<String> terminologyNames) {
        if (terminologyNames == null) {
            this.terminologyNames = null;
            return;
        }

        this.terminologyNames = new java.util.ArrayList<String>(terminologyNames);
    }

    /**
     * <p>
     * The name of the terminology to use in the batch translation job. For a list of available terminologies, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminologyNames(java.util.Collection)} or {@link #withTerminologyNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param terminologyNames
     *        The name of the terminology to use in the batch translation job. For a list of available terminologies,
     *        use the <a>ListTerminologies</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withTerminologyNames(String... terminologyNames) {
        if (this.terminologyNames == null) {
            setTerminologyNames(new java.util.ArrayList<String>(terminologyNames.length));
        }
        for (String ele : terminologyNames) {
            this.terminologyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the terminology to use in the batch translation job. For a list of available terminologies, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * 
     * @param terminologyNames
     *        The name of the terminology to use in the batch translation job. For a list of available terminologies,
     *        use the <a>ListTerminologies</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withTerminologyNames(java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * The client token of the EC2 instance calling the request. This token is auto-generated when using the Amazon
     * Translate SDK. Otherwise, use the <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> EC2
     * operation to retreive an instance's client token. For more information, see <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html#client-tokens">Client
     * Tokens</a> in the EC2 User Guide.
     * </p>
     * 
     * @param clientToken
     *        The client token of the EC2 instance calling the request. This token is auto-generated when using the
     *        Amazon Translate SDK. Otherwise, use the <a
     *        href="docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> EC2
     *        operation to retreive an instance's client token. For more information, see <a
     *        href="docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html#client-tokens">Client
     *        Tokens</a> in the EC2 User Guide.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the EC2 instance calling the request. This token is auto-generated when using the Amazon
     * Translate SDK. Otherwise, use the <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> EC2
     * operation to retreive an instance's client token. For more information, see <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html#client-tokens">Client
     * Tokens</a> in the EC2 User Guide.
     * </p>
     * 
     * @return The client token of the EC2 instance calling the request. This token is auto-generated when using the
     *         Amazon Translate SDK. Otherwise, use the <a
     *         href="docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a>
     *         EC2 operation to retreive an instance's client token. For more information, see <a
     *         href="docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html#client-tokens">Client
     *         Tokens</a> in the EC2 User Guide.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the EC2 instance calling the request. This token is auto-generated when using the Amazon
     * Translate SDK. Otherwise, use the <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> EC2
     * operation to retreive an instance's client token. For more information, see <a
     * href="docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html#client-tokens">Client
     * Tokens</a> in the EC2 User Guide.
     * </p>
     * 
     * @param clientToken
     *        The client token of the EC2 instance calling the request. This token is auto-generated when using the
     *        Amazon Translate SDK. Otherwise, use the <a
     *        href="docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> EC2
     *        operation to retreive an instance's client token. For more information, see <a
     *        href="docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html#client-tokens">Client
     *        Tokens</a> in the EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextTranslationJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: ").append(getTargetLanguageCodes()).append(",");
        if (getTerminologyNames() != null)
            sb.append("TerminologyNames: ").append(getTerminologyNames()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTextTranslationJobRequest == false)
            return false;
        StartTextTranslationJobRequest other = (StartTextTranslationJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCodes() == null ^ this.getTargetLanguageCodes() == null)
            return false;
        if (other.getTargetLanguageCodes() != null && other.getTargetLanguageCodes().equals(this.getTargetLanguageCodes()) == false)
            return false;
        if (other.getTerminologyNames() == null ^ this.getTerminologyNames() == null)
            return false;
        if (other.getTerminologyNames() != null && other.getTerminologyNames().equals(this.getTerminologyNames()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode + ((getTerminologyNames() == null) ? 0 : getTerminologyNames().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartTextTranslationJobRequest clone() {
        return (StartTextTranslationJobRequest) super.clone();
    }

}
