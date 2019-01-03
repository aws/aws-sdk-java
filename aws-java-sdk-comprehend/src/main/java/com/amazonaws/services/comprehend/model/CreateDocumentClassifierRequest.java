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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateDocumentClassifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDocumentClassifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the document classifier.
     * </p>
     */
    private String documentClassifierName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     */
    private DocumentClassifierInputDataConfig inputDataConfig;
    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * The name of the document classifier.
     * </p>
     * 
     * @param documentClassifierName
     *        The name of the document classifier.
     */

    public void setDocumentClassifierName(String documentClassifierName) {
        this.documentClassifierName = documentClassifierName;
    }

    /**
     * <p>
     * The name of the document classifier.
     * </p>
     * 
     * @return The name of the document classifier.
     */

    public String getDocumentClassifierName() {
        return this.documentClassifierName;
    }

    /**
     * <p>
     * The name of the document classifier.
     * </p>
     * 
     * @param documentClassifierName
     *        The name of the document classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentClassifierRequest withDocumentClassifierName(String documentClassifierName) {
        setDocumentClassifierName(documentClassifierName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon
     *         Comprehend read access to your input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentClassifierRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and location of the input data for the job.
     */

    public void setInputDataConfig(DocumentClassifierInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     * 
     * @return Specifies the format and location of the input data for the job.
     */

    public DocumentClassifierInputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data for the job.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and location of the input data for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentClassifierRequest withInputDataConfig(DocumentClassifierInputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
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

    public CreateDocumentClassifierRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *        be in the same language.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @return The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *         be in the same language.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *        be in the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateDocumentClassifierRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *        be in the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateDocumentClassifierRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getDocumentClassifierName() != null)
            sb.append("DocumentClassifierName: ").append(getDocumentClassifierName()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentClassifierRequest == false)
            return false;
        CreateDocumentClassifierRequest other = (CreateDocumentClassifierRequest) obj;
        if (other.getDocumentClassifierName() == null ^ this.getDocumentClassifierName() == null)
            return false;
        if (other.getDocumentClassifierName() != null && other.getDocumentClassifierName().equals(this.getDocumentClassifierName()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentClassifierName() == null) ? 0 : getDocumentClassifierName().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public CreateDocumentClassifierRequest clone() {
        return (CreateDocumentClassifierRequest) super.clone();
    }

}
