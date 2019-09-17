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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>TestRoleRequest</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
     * </p>
     */
    private String inputBucket;
    /**
     * <p>
     * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from
     * this bucket.
     * </p>
     */
    private String outputBucket;
    /**
     * <p>
     * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a
     * test notification to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> topics;

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
     * </p>
     * 
     * @param role
     *        The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
     * </p>
     * 
     * @return The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
     * </p>
     * 
     * @param role
     *        The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
     * </p>
     * 
     * @param inputBucket
     *        The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this
     *        bucket.
     */

    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this
     *         bucket.
     */

    public String getInputBucket() {
        return this.inputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
     * </p>
     * 
     * @param inputBucket
     *        The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleRequest withInputBucket(String inputBucket) {
        setInputBucket(inputBucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from
     * this bucket.
     * </p>
     * 
     * @param outputBucket
     *        The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read
     *        from this bucket.
     */

    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from
     * this bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to
     *         read from this bucket.
     */

    public String getOutputBucket() {
        return this.outputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from
     * this bucket.
     * </p>
     * 
     * @param outputBucket
     *        The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read
     *        from this bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleRequest withOutputBucket(String outputBucket) {
        setOutputBucket(outputBucket);
        return this;
    }

    /**
     * <p>
     * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a
     * test notification to.
     * </p>
     * 
     * @return The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action
     *         to send a test notification to.
     */

    public java.util.List<String> getTopics() {
        if (topics == null) {
            topics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return topics;
    }

    /**
     * <p>
     * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a
     * test notification to.
     * </p>
     * 
     * @param topics
     *        The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to
     *        send a test notification to.
     */

    public void setTopics(java.util.Collection<String> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new com.amazonaws.internal.SdkInternalList<String>(topics);
    }

    /**
     * <p>
     * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a
     * test notification to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopics(java.util.Collection)} or {@link #withTopics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param topics
     *        The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to
     *        send a test notification to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleRequest withTopics(String... topics) {
        if (this.topics == null) {
            setTopics(new com.amazonaws.internal.SdkInternalList<String>(topics.length));
        }
        for (String ele : topics) {
            this.topics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a
     * test notification to.
     * </p>
     * 
     * @param topics
     *        The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to
     *        send a test notification to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleRequest withTopics(java.util.Collection<String> topics) {
        setTopics(topics);
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getInputBucket() != null)
            sb.append("InputBucket: ").append(getInputBucket()).append(",");
        if (getOutputBucket() != null)
            sb.append("OutputBucket: ").append(getOutputBucket()).append(",");
        if (getTopics() != null)
            sb.append("Topics: ").append(getTopics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRoleRequest == false)
            return false;
        TestRoleRequest other = (TestRoleRequest) obj;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getInputBucket() == null ^ this.getInputBucket() == null)
            return false;
        if (other.getInputBucket() != null && other.getInputBucket().equals(this.getInputBucket()) == false)
            return false;
        if (other.getOutputBucket() == null ^ this.getOutputBucket() == null)
            return false;
        if (other.getOutputBucket() != null && other.getOutputBucket().equals(this.getOutputBucket()) == false)
            return false;
        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getInputBucket() == null) ? 0 : getInputBucket().hashCode());
        hashCode = prime * hashCode + ((getOutputBucket() == null) ? 0 : getOutputBucket().hashCode());
        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        return hashCode;
    }

    @Override
    public TestRoleRequest clone() {
        return (TestRoleRequest) super.clone();
    }

}
