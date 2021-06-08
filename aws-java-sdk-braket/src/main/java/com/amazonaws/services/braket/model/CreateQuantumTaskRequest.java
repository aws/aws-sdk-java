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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateQuantumTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQuantumTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action associated with the task.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The client token associated with the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN of the device to run the task on.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The parameters for the device to run the task on.
     * </p>
     */
    private String deviceParameters;
    /**
     * <p>
     * The S3 bucket to store task result files in.
     * </p>
     */
    private String outputS3Bucket;
    /**
     * <p>
     * The key prefix for the location in the S3 bucket to store task results in.
     * </p>
     */
    private String outputS3KeyPrefix;
    /**
     * <p>
     * The number of shots to use for the task.
     * </p>
     */
    private Long shots;
    /**
     * <p>
     * Tags to be added to the quantum task you're creating.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The action associated with the task.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param action
     *        The action associated with the task.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action associated with the task.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The action associated with the task.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action associated with the task.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param action
     *        The action associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @return The client token associated with the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the device to run the task on.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device to run the task on.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device to run the task on.
     * </p>
     * 
     * @return The ARN of the device to run the task on.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of the device to run the task on.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device to run the task on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The parameters for the device to run the task on.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param deviceParameters
     *        The parameters for the device to run the task on.
     */

    public void setDeviceParameters(String deviceParameters) {
        this.deviceParameters = deviceParameters;
    }

    /**
     * <p>
     * The parameters for the device to run the task on.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The parameters for the device to run the task on.
     */

    public String getDeviceParameters() {
        return this.deviceParameters;
    }

    /**
     * <p>
     * The parameters for the device to run the task on.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param deviceParameters
     *        The parameters for the device to run the task on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withDeviceParameters(String deviceParameters) {
        setDeviceParameters(deviceParameters);
        return this;
    }

    /**
     * <p>
     * The S3 bucket to store task result files in.
     * </p>
     * 
     * @param outputS3Bucket
     *        The S3 bucket to store task result files in.
     */

    public void setOutputS3Bucket(String outputS3Bucket) {
        this.outputS3Bucket = outputS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket to store task result files in.
     * </p>
     * 
     * @return The S3 bucket to store task result files in.
     */

    public String getOutputS3Bucket() {
        return this.outputS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket to store task result files in.
     * </p>
     * 
     * @param outputS3Bucket
     *        The S3 bucket to store task result files in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withOutputS3Bucket(String outputS3Bucket) {
        setOutputS3Bucket(outputS3Bucket);
        return this;
    }

    /**
     * <p>
     * The key prefix for the location in the S3 bucket to store task results in.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The key prefix for the location in the S3 bucket to store task results in.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The key prefix for the location in the S3 bucket to store task results in.
     * </p>
     * 
     * @return The key prefix for the location in the S3 bucket to store task results in.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The key prefix for the location in the S3 bucket to store task results in.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The key prefix for the location in the S3 bucket to store task results in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The number of shots to use for the task.
     * </p>
     * 
     * @param shots
     *        The number of shots to use for the task.
     */

    public void setShots(Long shots) {
        this.shots = shots;
    }

    /**
     * <p>
     * The number of shots to use for the task.
     * </p>
     * 
     * @return The number of shots to use for the task.
     */

    public Long getShots() {
        return this.shots;
    }

    /**
     * <p>
     * The number of shots to use for the task.
     * </p>
     * 
     * @param shots
     *        The number of shots to use for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withShots(Long shots) {
        setShots(shots);
        return this;
    }

    /**
     * <p>
     * Tags to be added to the quantum task you're creating.
     * </p>
     * 
     * @return Tags to be added to the quantum task you're creating.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be added to the quantum task you're creating.
     * </p>
     * 
     * @param tags
     *        Tags to be added to the quantum task you're creating.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags to be added to the quantum task you're creating.
     * </p>
     * 
     * @param tags
     *        Tags to be added to the quantum task you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateQuantumTaskRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQuantumTaskRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceParameters() != null)
            sb.append("DeviceParameters: ").append(getDeviceParameters()).append(",");
        if (getOutputS3Bucket() != null)
            sb.append("OutputS3Bucket: ").append(getOutputS3Bucket()).append(",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: ").append(getOutputS3KeyPrefix()).append(",");
        if (getShots() != null)
            sb.append("Shots: ").append(getShots()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQuantumTaskRequest == false)
            return false;
        CreateQuantumTaskRequest other = (CreateQuantumTaskRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceParameters() == null ^ this.getDeviceParameters() == null)
            return false;
        if (other.getDeviceParameters() != null && other.getDeviceParameters().equals(this.getDeviceParameters()) == false)
            return false;
        if (other.getOutputS3Bucket() == null ^ this.getOutputS3Bucket() == null)
            return false;
        if (other.getOutputS3Bucket() != null && other.getOutputS3Bucket().equals(this.getOutputS3Bucket()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getShots() == null ^ this.getShots() == null)
            return false;
        if (other.getShots() != null && other.getShots().equals(this.getShots()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceParameters() == null) ? 0 : getDeviceParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Bucket() == null) ? 0 : getOutputS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getShots() == null) ? 0 : getShots().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateQuantumTaskRequest clone() {
        return (CreateQuantumTaskRequest) super.clone();
    }

}
