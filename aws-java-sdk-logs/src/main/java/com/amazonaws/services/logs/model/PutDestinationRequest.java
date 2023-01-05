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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the destination.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis <code>PutRecord</code>
     * operation on the destination stream.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * A name for the destination.
     * </p>
     * 
     * @param destinationName
     *        A name for the destination.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * A name for the destination.
     * </p>
     * 
     * @return A name for the destination.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * A name for the destination.
     * </p>
     * 
     * @param destinationName
     *        A name for the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDestinationRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
     * </p>
     * 
     * @param targetArn
     *        The ARN of an Amazon Kinesis stream to which to deliver matching log events.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
     * </p>
     * 
     * @return The ARN of an Amazon Kinesis stream to which to deliver matching log events.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
     * </p>
     * 
     * @param targetArn
     *        The ARN of an Amazon Kinesis stream to which to deliver matching log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDestinationRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis <code>PutRecord</code>
     * operation on the destination stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis
     *        <code>PutRecord</code> operation on the destination stream.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis <code>PutRecord</code>
     * operation on the destination stream.
     * </p>
     * 
     * @return The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis
     *         <code>PutRecord</code> operation on the destination stream.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis <code>PutRecord</code>
     * operation on the destination stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis
     *        <code>PutRecord</code> operation on the destination stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDestinationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @return An optional list of key-value pairs to associate with the resource.</p>
     *         <p>
     *         For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a>
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDestinationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PutDestinationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutDestinationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
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

    public PutDestinationRequest clearTagsEntries() {
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
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof PutDestinationRequest == false)
            return false;
        PutDestinationRequest other = (PutDestinationRequest) obj;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutDestinationRequest clone() {
        return (PutDestinationRequest) super.clone();
    }

}
