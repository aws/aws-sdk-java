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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateEntityRecognizer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEntityRecognizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters. Alphanumeric
     * characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the account/region.
     * </p>
     */
    private String recognizerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket containing the input data must be located in
     * the same region as the entity recognizer being created.
     * </p>
     */
    private EntityRecognizerInputDataConfig inputDataConfig;
    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters. Alphanumeric
     * characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the account/region.
     * </p>
     * 
     * @param recognizerName
     *        The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters.
     *        Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the
     *        account/region.
     */

    public void setRecognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
    }

    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters. Alphanumeric
     * characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the account/region.
     * </p>
     * 
     * @return The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters.
     *         Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the
     *         account/region.
     */

    public String getRecognizerName() {
        return this.recognizerName;
    }

    /**
     * <p>
     * The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters. Alphanumeric
     * characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the account/region.
     * </p>
     * 
     * @param recognizerName
     *        The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters.
     *        Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the
     *        account/region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityRecognizerRequest withRecognizerName(String recognizerName) {
        setRecognizerName(recognizerName);
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

    public CreateEntityRecognizerRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket containing the input data must be located in
     * the same region as the entity recognizer being created.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and location of the input data. The S3 bucket containing the input data must be
     *        located in the same region as the entity recognizer being created.
     */

    public void setInputDataConfig(EntityRecognizerInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket containing the input data must be located in
     * the same region as the entity recognizer being created.
     * </p>
     * 
     * @return Specifies the format and location of the input data. The S3 bucket containing the input data must be
     *         located in the same region as the entity recognizer being created.
     */

    public EntityRecognizerInputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and location of the input data. The S3 bucket containing the input data must be located in
     * the same region as the entity recognizer being created.
     * </p>
     * 
     * @param inputDataConfig
     *        Specifies the format and location of the input data. The S3 bucket containing the input data must be
     *        located in the same region as the entity recognizer being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityRecognizerRequest withInputDataConfig(EntityRecognizerInputDataConfig inputDataConfig) {
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

    public CreateEntityRecognizerRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. All documents must be in the same language. Only English ("en") is
     *        currently supported.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @return The language of the input documents. All documents must be in the same language. Only English ("en") is
     *         currently supported.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. All documents must be in the same language. Only English ("en") is
     *        currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateEntityRecognizerRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same language. Only English ("en") is currently
     * supported.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. All documents must be in the same language. Only English ("en") is
     *        currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateEntityRecognizerRequest withLanguageCode(LanguageCode languageCode) {
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
        if (getRecognizerName() != null)
            sb.append("RecognizerName: ").append(getRecognizerName()).append(",");
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

        if (obj instanceof CreateEntityRecognizerRequest == false)
            return false;
        CreateEntityRecognizerRequest other = (CreateEntityRecognizerRequest) obj;
        if (other.getRecognizerName() == null ^ this.getRecognizerName() == null)
            return false;
        if (other.getRecognizerName() != null && other.getRecognizerName().equals(this.getRecognizerName()) == false)
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

        hashCode = prime * hashCode + ((getRecognizerName() == null) ? 0 : getRecognizerName().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public CreateEntityRecognizerRequest clone() {
        return (CreateEntityRecognizerRequest) super.clone();
    }

}
