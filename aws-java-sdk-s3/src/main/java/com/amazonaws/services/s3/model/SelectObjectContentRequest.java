/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Request to filter the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement.
 * In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object.
 * Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression.
 * You must also specify the data serialization format for the response.
 *
 * For more information, go to
 * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectSELECTContent.html">S3Select API Documentation</a>.
 */
public class SelectObjectContentRequest extends AmazonWebServiceRequest implements SSECustomerKeyProvider, Serializable, Cloneable {
    private String bucketName;
    private String key;
    private SSECustomerKey sseCustomerKey;
    private String expression;
    private String expressionType;
    private RequestProgress requestProgress;
    private InputSerialization inputSerialization;
    private OutputSerialization outputSerialization;

    /**
     * The S3 Bucket.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The S3 Bucket.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The S3 Bucket.
     */
    public SelectObjectContentRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * The Object Key.
     */
    public String getKey() {
        return key;
    }

    /**
     * The Object Key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The Object Key.
     */
    public SelectObjectContentRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * The expression that is used to query the object.
     */
    public String getExpression() {
        return expression;
    }

    /**
     * The expression that is used to query the object.
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * The expression that is used to query the object.
     */
    public SelectObjectContentRequest withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * The type of the provided expression (e.g., SQL).
     */
    public String getExpressionType() {
        return expressionType;
    }

    /**
     * The type of the provided expression (e.g., SQL).
     */
    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * The type of the provided expression (e.g., SQL).
     */
    public SelectObjectContentRequest withExpressionType(String expressionType) {
        setExpressionType(expressionType);
        return this;
    }

    /**
     * The type of the provided expression (e.g., SQL).
     */
    public void setExpressionType(ExpressionType expressionType) {
        setExpressionType(expressionType == null ? null : expressionType.toString());
    }

    /**
     * The type of the provided expression (e.g., SQL).
     */
    public SelectObjectContentRequest withExpressionType(ExpressionType expressionType) {
        setExpressionType(expressionType);
        return this;
    }

    /**
     * Describes optional, periodic {@link SelectObjectContentEvent.ProgressEvent}s that can be returned.
     */
    public RequestProgress getRequestProgress() {
        return requestProgress;
    }

    /**
     * Describes optional, periodic {@link SelectObjectContentEvent.ProgressEvent}s that can be returned.
     */
    public void setRequestProgress(RequestProgress requestProgress) {
        this.requestProgress = requestProgress;
    }

    /**
     * Describes optional, periodic {@link SelectObjectContentEvent.ProgressEvent}s that can be returned.
     */
    public SelectObjectContentRequest withRequestProgress(RequestProgress requestProgress) {
        setRequestProgress(requestProgress);
        return this;
    }

    /**
     * Describes the format of the data in the object that is being queried.
     */
    public InputSerialization getInputSerialization() {
        return inputSerialization;
    }

    /**
     * Describes the format of the data in the object that is being queried.
     */
    public void setInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
    }

    /**
     * Describes the format of the data in the object that is being queried.
     */
    public SelectObjectContentRequest withInputSerialization(InputSerialization inputSerialization) {
        setInputSerialization(inputSerialization);
        return this;
    }

    /**
     * Describes the format of the data that you want Amazon S3 to return in response.
     */
    public OutputSerialization getOutputSerialization() {
        return outputSerialization;
    }

    /**
     * Describes the format of the data that you want Amazon S3 to return in response.
     */
    public void setOutputSerialization(OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
    }

    /**
     * Describes the format of the data that you want Amazon S3 to return in response.
     */
    public SelectObjectContentRequest withOutputSerialization(OutputSerialization outputSerialization) {
        setOutputSerialization(outputSerialization);
        return this;
    }

    @Override
    public SSECustomerKey getSSECustomerKey() {
        return sseCustomerKey;
    }

    public void setSSECustomerKey(SSECustomerKey sseCustomerKey) {
        this.sseCustomerKey = sseCustomerKey;
    }

    public SelectObjectContentRequest withSSECustomerKey(SSECustomerKey sseCustomerKey) {
        setSSECustomerKey(sseCustomerKey);
        return this;
    }
}
