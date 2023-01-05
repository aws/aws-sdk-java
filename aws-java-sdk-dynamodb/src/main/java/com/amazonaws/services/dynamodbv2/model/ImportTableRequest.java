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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ImportTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code> idempotent, meaning that
     * multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The S3 bucket that provides the source for the import.
     * </p>
     */
    private S3BucketSource s3BucketSource;
    /**
     * <p>
     * The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     * <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     */
    private String inputFormat;
    /**
     * <p>
     * Additional properties that specify how the input is formatted,
     * </p>
     */
    private InputFormatOptions inputFormatOptions;
    /**
     * <p>
     * Type of compression to be used on the input coming from the imported table.
     * </p>
     */
    private String inputCompressionType;
    /**
     * <p>
     * Parameters for the table to import the data into.
     * </p>
     */
    private TableCreationParameters tableCreationParameters;

    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code> idempotent, meaning that
     * multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @param clientToken
     *        Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code> idempotent, meaning
     *        that multiple identical calls have the same effect as one single call.</p>
     *        <p>
     *        A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any
     *        request with the same client token is treated as a new request. Do not resubmit the same request with the
     *        same client token for more than 8 hours, or the result might not be idempotent.
     *        </p>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 8-hour
     *        idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code> idempotent, meaning that
     * multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @return Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code> idempotent, meaning
     *         that multiple identical calls have the same effect as one single call.</p>
     *         <p>
     *         A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any
     *         request with the same client token is treated as a new request. Do not resubmit the same request with the
     *         same client token for more than 8 hours, or the result might not be idempotent.
     *         </p>
     *         <p>
     *         If you submit a request with the same client token but a change in other parameters within the 8-hour
     *         idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code> idempotent, meaning that
     * multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @param clientToken
     *        Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code> idempotent, meaning
     *        that multiple identical calls have the same effect as one single call.</p>
     *        <p>
     *        A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any
     *        request with the same client token is treated as a new request. Do not resubmit the same request with the
     *        same client token for more than 8 hours, or the result might not be idempotent.
     *        </p>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 8-hour
     *        idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that provides the source for the import.
     * </p>
     * 
     * @param s3BucketSource
     *        The S3 bucket that provides the source for the import.
     */

    public void setS3BucketSource(S3BucketSource s3BucketSource) {
        this.s3BucketSource = s3BucketSource;
    }

    /**
     * <p>
     * The S3 bucket that provides the source for the import.
     * </p>
     * 
     * @return The S3 bucket that provides the source for the import.
     */

    public S3BucketSource getS3BucketSource() {
        return this.s3BucketSource;
    }

    /**
     * <p>
     * The S3 bucket that provides the source for the import.
     * </p>
     * 
     * @param s3BucketSource
     *        The S3 bucket that provides the source for the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableRequest withS3BucketSource(S3BucketSource s3BucketSource) {
        setS3BucketSource(s3BucketSource);
        return this;
    }

    /**
     * <p>
     * The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     * <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     *        <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @see InputFormat
     */

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    /**
     * <p>
     * The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     * <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @return The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     *         <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @see InputFormat
     */

    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * <p>
     * The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     * <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     *        <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public ImportTableRequest withInputFormat(String inputFormat) {
        setInputFormat(inputFormat);
        return this;
    }

    /**
     * <p>
     * The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     * <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data. Valid values for <code>ImportFormat</code> are <code>CSV</code>,
     *        <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public ImportTableRequest withInputFormat(InputFormat inputFormat) {
        this.inputFormat = inputFormat.toString();
        return this;
    }

    /**
     * <p>
     * Additional properties that specify how the input is formatted,
     * </p>
     * 
     * @param inputFormatOptions
     *        Additional properties that specify how the input is formatted,
     */

    public void setInputFormatOptions(InputFormatOptions inputFormatOptions) {
        this.inputFormatOptions = inputFormatOptions;
    }

    /**
     * <p>
     * Additional properties that specify how the input is formatted,
     * </p>
     * 
     * @return Additional properties that specify how the input is formatted,
     */

    public InputFormatOptions getInputFormatOptions() {
        return this.inputFormatOptions;
    }

    /**
     * <p>
     * Additional properties that specify how the input is formatted,
     * </p>
     * 
     * @param inputFormatOptions
     *        Additional properties that specify how the input is formatted,
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableRequest withInputFormatOptions(InputFormatOptions inputFormatOptions) {
        setInputFormatOptions(inputFormatOptions);
        return this;
    }

    /**
     * <p>
     * Type of compression to be used on the input coming from the imported table.
     * </p>
     * 
     * @param inputCompressionType
     *        Type of compression to be used on the input coming from the imported table.
     * @see InputCompressionType
     */

    public void setInputCompressionType(String inputCompressionType) {
        this.inputCompressionType = inputCompressionType;
    }

    /**
     * <p>
     * Type of compression to be used on the input coming from the imported table.
     * </p>
     * 
     * @return Type of compression to be used on the input coming from the imported table.
     * @see InputCompressionType
     */

    public String getInputCompressionType() {
        return this.inputCompressionType;
    }

    /**
     * <p>
     * Type of compression to be used on the input coming from the imported table.
     * </p>
     * 
     * @param inputCompressionType
     *        Type of compression to be used on the input coming from the imported table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputCompressionType
     */

    public ImportTableRequest withInputCompressionType(String inputCompressionType) {
        setInputCompressionType(inputCompressionType);
        return this;
    }

    /**
     * <p>
     * Type of compression to be used on the input coming from the imported table.
     * </p>
     * 
     * @param inputCompressionType
     *        Type of compression to be used on the input coming from the imported table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputCompressionType
     */

    public ImportTableRequest withInputCompressionType(InputCompressionType inputCompressionType) {
        this.inputCompressionType = inputCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * Parameters for the table to import the data into.
     * </p>
     * 
     * @param tableCreationParameters
     *        Parameters for the table to import the data into.
     */

    public void setTableCreationParameters(TableCreationParameters tableCreationParameters) {
        this.tableCreationParameters = tableCreationParameters;
    }

    /**
     * <p>
     * Parameters for the table to import the data into.
     * </p>
     * 
     * @return Parameters for the table to import the data into.
     */

    public TableCreationParameters getTableCreationParameters() {
        return this.tableCreationParameters;
    }

    /**
     * <p>
     * Parameters for the table to import the data into.
     * </p>
     * 
     * @param tableCreationParameters
     *        Parameters for the table to import the data into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableRequest withTableCreationParameters(TableCreationParameters tableCreationParameters) {
        setTableCreationParameters(tableCreationParameters);
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
        if (getS3BucketSource() != null)
            sb.append("S3BucketSource: ").append(getS3BucketSource()).append(",");
        if (getInputFormat() != null)
            sb.append("InputFormat: ").append(getInputFormat()).append(",");
        if (getInputFormatOptions() != null)
            sb.append("InputFormatOptions: ").append(getInputFormatOptions()).append(",");
        if (getInputCompressionType() != null)
            sb.append("InputCompressionType: ").append(getInputCompressionType()).append(",");
        if (getTableCreationParameters() != null)
            sb.append("TableCreationParameters: ").append(getTableCreationParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTableRequest == false)
            return false;
        ImportTableRequest other = (ImportTableRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getS3BucketSource() == null ^ this.getS3BucketSource() == null)
            return false;
        if (other.getS3BucketSource() != null && other.getS3BucketSource().equals(this.getS3BucketSource()) == false)
            return false;
        if (other.getInputFormat() == null ^ this.getInputFormat() == null)
            return false;
        if (other.getInputFormat() != null && other.getInputFormat().equals(this.getInputFormat()) == false)
            return false;
        if (other.getInputFormatOptions() == null ^ this.getInputFormatOptions() == null)
            return false;
        if (other.getInputFormatOptions() != null && other.getInputFormatOptions().equals(this.getInputFormatOptions()) == false)
            return false;
        if (other.getInputCompressionType() == null ^ this.getInputCompressionType() == null)
            return false;
        if (other.getInputCompressionType() != null && other.getInputCompressionType().equals(this.getInputCompressionType()) == false)
            return false;
        if (other.getTableCreationParameters() == null ^ this.getTableCreationParameters() == null)
            return false;
        if (other.getTableCreationParameters() != null && other.getTableCreationParameters().equals(this.getTableCreationParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getS3BucketSource() == null) ? 0 : getS3BucketSource().hashCode());
        hashCode = prime * hashCode + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        hashCode = prime * hashCode + ((getInputFormatOptions() == null) ? 0 : getInputFormatOptions().hashCode());
        hashCode = prime * hashCode + ((getInputCompressionType() == null) ? 0 : getInputCompressionType().hashCode());
        hashCode = prime * hashCode + ((getTableCreationParameters() == null) ? 0 : getTableCreationParameters().hashCode());
        return hashCode;
    }

    @Override
    public ImportTableRequest clone() {
        return (ImportTableRequest) super.clone();
    }

}
