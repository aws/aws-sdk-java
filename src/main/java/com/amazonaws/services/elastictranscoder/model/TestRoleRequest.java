/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#testRole(TestRoleRequest) TestRole operation}.
 * <p>
 * The TestRole operation tests the IAM role used to create the pipeline.
 * </p>
 * <p>
 * The <code>TestRole</code> action lets you determine whether the IAM role you are using has sufficient permissions to let Elastic Transcoder perform
 * tasks associated with the transcoding process. The action attempts to assume the specified IAM role, checks read access to the input and output
 * buckets, and tries to send a test notification to Amazon SNS topics that you specify.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#testRole(TestRoleRequest)
 */
public class TestRoleRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to test.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     */
    private String role;

    /**
     * The Amazon S3 bucket that contains media files to be transcoded. The
     * action attempts to read from this bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String inputBucket;

    /**
     * The Amazon S3 bucket that Elastic Transcoder will write transcoded
     * media files to. The action attempts to read from this bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String outputBucket;

    /**
     * The ARNs of one or more Amazon Simple Notification Service (Amazon
     * SNS) topics that you want the action to send a test notification to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> topics;

    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to test.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @return The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to test.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to test.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to test.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to test.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     *         Transcoder to test.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The Amazon S3 bucket that contains media files to be transcoded. The
     * action attempts to read from this bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return The Amazon S3 bucket that contains media files to be transcoded. The
     *         action attempts to read from this bucket.
     */
    public String getInputBucket() {
        return inputBucket;
    }
    
    /**
     * The Amazon S3 bucket that contains media files to be transcoded. The
     * action attempts to read from this bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket The Amazon S3 bucket that contains media files to be transcoded. The
     *         action attempts to read from this bucket.
     */
    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }
    
    /**
     * The Amazon S3 bucket that contains media files to be transcoded. The
     * action attempts to read from this bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket The Amazon S3 bucket that contains media files to be transcoded. The
     *         action attempts to read from this bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleRequest withInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
        return this;
    }

    /**
     * The Amazon S3 bucket that Elastic Transcoder will write transcoded
     * media files to. The action attempts to read from this bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return The Amazon S3 bucket that Elastic Transcoder will write transcoded
     *         media files to. The action attempts to read from this bucket.
     */
    public String getOutputBucket() {
        return outputBucket;
    }
    
    /**
     * The Amazon S3 bucket that Elastic Transcoder will write transcoded
     * media files to. The action attempts to read from this bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param outputBucket The Amazon S3 bucket that Elastic Transcoder will write transcoded
     *         media files to. The action attempts to read from this bucket.
     */
    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }
    
    /**
     * The Amazon S3 bucket that Elastic Transcoder will write transcoded
     * media files to. The action attempts to read from this bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param outputBucket The Amazon S3 bucket that Elastic Transcoder will write transcoded
     *         media files to. The action attempts to read from this bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleRequest withOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }

    /**
     * The ARNs of one or more Amazon Simple Notification Service (Amazon
     * SNS) topics that you want the action to send a test notification to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return The ARNs of one or more Amazon Simple Notification Service (Amazon
     *         SNS) topics that you want the action to send a test notification to.
     */
    public java.util.List<String> getTopics() {
        if (topics == null) {
              topics = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              topics.setAutoConstruct(true);
        }
        return topics;
    }
    
    /**
     * The ARNs of one or more Amazon Simple Notification Service (Amazon
     * SNS) topics that you want the action to send a test notification to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param topics The ARNs of one or more Amazon Simple Notification Service (Amazon
     *         SNS) topics that you want the action to send a test notification to.
     */
    public void setTopics(java.util.Collection<String> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> topicsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(topics.size());
        topicsCopy.addAll(topics);
        this.topics = topicsCopy;
    }
    
    /**
     * The ARNs of one or more Amazon Simple Notification Service (Amazon
     * SNS) topics that you want the action to send a test notification to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param topics The ARNs of one or more Amazon Simple Notification Service (Amazon
     *         SNS) topics that you want the action to send a test notification to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleRequest withTopics(String... topics) {
        if (getTopics() == null) setTopics(new java.util.ArrayList<String>(topics.length));
        for (String value : topics) {
            getTopics().add(value);
        }
        return this;
    }
    
    /**
     * The ARNs of one or more Amazon Simple Notification Service (Amazon
     * SNS) topics that you want the action to send a test notification to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param topics The ARNs of one or more Amazon Simple Notification Service (Amazon
     *         SNS) topics that you want the action to send a test notification to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleRequest withTopics(java.util.Collection<String> topics) {
        if (topics == null) {
            this.topics = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> topicsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(topics.size());
            topicsCopy.addAll(topics);
            this.topics = topicsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getInputBucket() != null) sb.append("InputBucket: " + getInputBucket() + ",");
        if (getOutputBucket() != null) sb.append("OutputBucket: " + getOutputBucket() + ",");
        if (getTopics() != null) sb.append("Topics: " + getTopics() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TestRoleRequest == false) return false;
        TestRoleRequest other = (TestRoleRequest)obj;
        
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getInputBucket() == null ^ this.getInputBucket() == null) return false;
        if (other.getInputBucket() != null && other.getInputBucket().equals(this.getInputBucket()) == false) return false; 
        if (other.getOutputBucket() == null ^ this.getOutputBucket() == null) return false;
        if (other.getOutputBucket() != null && other.getOutputBucket().equals(this.getOutputBucket()) == false) return false; 
        if (other.getTopics() == null ^ this.getTopics() == null) return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false) return false; 
        return true;
    }
    
}
    