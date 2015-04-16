/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#setQueueAttributes(SetQueueAttributesRequest) SetQueueAttributes operation}.
 * <p>
 * Sets the value of one or more queue attributes. When you change a
 * queue's attributes, the change can take up to 60 seconds for most of
 * the attributes to propagate throughout the SQS system. Changes made to
 * the <code>MessageRetentionPeriod</code> attribute can take up to 15
 * minutes.
 * </p>
 * <p>
 * <b>NOTE:</b>Going forward, new attributes might be added. If you are
 * writing code that calls this action, we recommend that you structure
 * your code so that it can handle new attributes gracefully.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#setQueueAttributes(SetQueueAttributesRequest)
 */
public class SetQueueAttributesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The URL of the Amazon SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A map of attributes to set. <p>The following lists the names,
     * descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses: <p> <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery
     * of all messages in the queue will be delayed. An integer from 0 to 900
     * (15 minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1
     * minute) to 1209600 (14 days). The default for this attribute is 345600
     * (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     * AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     * of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * ReceiveMessage call will wait for a message to arrive. An integer from
     * 0 to 20 (seconds). The default for this attribute is 0. </li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see
     * Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     * Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     */
    private java.util.Map<String,String> attributes;

    /**
     * Default constructor for a new SetQueueAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SetQueueAttributesRequest() {}
    
    /**
     * Constructs a new SetQueueAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     * @param attributes A map of attributes to set. <p>The following lists
     * the names, descriptions, and values of the special request parameters
     * the <code>SetQueueAttributes</code> action uses: <p> <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery
     * of all messages in the queue will be delayed. An integer from 0 to 900
     * (15 minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1
     * minute) to 1209600 (14 days). The default for this attribute is 345600
     * (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     * AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     * of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * ReceiveMessage call will wait for a message to arrive. An integer from
     * 0 to 20 (seconds). The default for this attribute is 0. </li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see
     * Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     * Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     */
    public SetQueueAttributesRequest(String queueUrl, java.util.Map<String,String> attributes) {
        setQueueUrl(queueUrl);
        setAttributes(attributes);
    }

    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @return The URL of the Amazon SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetQueueAttributesRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * A map of attributes to set. <p>The following lists the names,
     * descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses: <p> <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery
     * of all messages in the queue will be delayed. An integer from 0 to 900
     * (15 minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1
     * minute) to 1209600 (14 days). The default for this attribute is 345600
     * (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     * AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     * of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * ReceiveMessage call will wait for a message to arrive. An integer from
     * 0 to 20 (seconds). The default for this attribute is 0. </li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see
     * Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     * Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     *
     * @return A map of attributes to set. <p>The following lists the names,
     *         descriptions, and values of the special request parameters the
     *         <code>SetQueueAttributes</code> action uses: <p> <ul>
     *         <li><code>DelaySeconds</code> - The time in seconds that the delivery
     *         of all messages in the queue will be delayed. An integer from 0 to 900
     *         (15 minutes). The default for this attribute is 0 (zero).</li>
     *         <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     *         message can contain before Amazon SQS rejects it. An integer from 1024
     *         bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     *         attribute is 262144 (256 KiB).</li>
     *         <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     *         SQS retains a message. Integer representing seconds, from 60 (1
     *         minute) to 1209600 (14 days). The default for this attribute is 345600
     *         (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     *         AWS policy. For more information about policy structure, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     *         of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     *         <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     *         ReceiveMessage call will wait for a message to arrive. An integer from
     *         0 to 20 (seconds). The default for this attribute is 0. </li>
     *         <li><code>VisibilityTimeout</code> - The visibility timeout for the
     *         queue. An integer from 0 to 43200 (12 hours). The default for this
     *         attribute is 30. For more information about visibility timeout, see
     *         Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     *         <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     *         functionality of the source queue. For more information about
     *         RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     *         Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * A map of attributes to set. <p>The following lists the names,
     * descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses: <p> <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery
     * of all messages in the queue will be delayed. An integer from 0 to 900
     * (15 minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1
     * minute) to 1209600 (14 days). The default for this attribute is 345600
     * (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     * AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     * of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * ReceiveMessage call will wait for a message to arrive. An integer from
     * 0 to 20 (seconds). The default for this attribute is 0. </li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see
     * Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     * Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     *
     * @param attributes A map of attributes to set. <p>The following lists the names,
     *         descriptions, and values of the special request parameters the
     *         <code>SetQueueAttributes</code> action uses: <p> <ul>
     *         <li><code>DelaySeconds</code> - The time in seconds that the delivery
     *         of all messages in the queue will be delayed. An integer from 0 to 900
     *         (15 minutes). The default for this attribute is 0 (zero).</li>
     *         <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     *         message can contain before Amazon SQS rejects it. An integer from 1024
     *         bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     *         attribute is 262144 (256 KiB).</li>
     *         <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     *         SQS retains a message. Integer representing seconds, from 60 (1
     *         minute) to 1209600 (14 days). The default for this attribute is 345600
     *         (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     *         AWS policy. For more information about policy structure, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     *         of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     *         <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     *         ReceiveMessage call will wait for a message to arrive. An integer from
     *         0 to 20 (seconds). The default for this attribute is 0. </li>
     *         <li><code>VisibilityTimeout</code> - The visibility timeout for the
     *         queue. An integer from 0 to 43200 (12 hours). The default for this
     *         attribute is 30. For more information about visibility timeout, see
     *         Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     *         <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     *         functionality of the source queue. For more information about
     *         RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     *         Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * A map of attributes to set. <p>The following lists the names,
     * descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses: <p> <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery
     * of all messages in the queue will be delayed. An integer from 0 to 900
     * (15 minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1
     * minute) to 1209600 (14 days). The default for this attribute is 345600
     * (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     * AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     * of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * ReceiveMessage call will wait for a message to arrive. An integer from
     * 0 to 20 (seconds). The default for this attribute is 0. </li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see
     * Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     * Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A map of attributes to set. <p>The following lists the names,
     *         descriptions, and values of the special request parameters the
     *         <code>SetQueueAttributes</code> action uses: <p> <ul>
     *         <li><code>DelaySeconds</code> - The time in seconds that the delivery
     *         of all messages in the queue will be delayed. An integer from 0 to 900
     *         (15 minutes). The default for this attribute is 0 (zero).</li>
     *         <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     *         message can contain before Amazon SQS rejects it. An integer from 1024
     *         bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     *         attribute is 262144 (256 KiB).</li>
     *         <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     *         SQS retains a message. Integer representing seconds, from 60 (1
     *         minute) to 1209600 (14 days). The default for this attribute is 345600
     *         (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     *         AWS policy. For more information about policy structure, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     *         of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     *         <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     *         ReceiveMessage call will wait for a message to arrive. An integer from
     *         0 to 20 (seconds). The default for this attribute is 0. </li>
     *         <li><code>VisibilityTimeout</code> - The visibility timeout for the
     *         queue. An integer from 0 to 43200 (12 hours). The default for this
     *         attribute is 30. For more information about visibility timeout, see
     *         Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     *         <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     *         functionality of the source queue. For more information about
     *         RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     *         Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetQueueAttributesRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * A map of attributes to set. <p>The following lists the names,
     * descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses: <p> <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery
     * of all messages in the queue will be delayed. An integer from 0 to 900
     * (15 minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1
     * minute) to 1209600 (14 days). The default for this attribute is 345600
     * (4 days).</li> <li><code>Policy</code> - The queue's policy. A valid
     * AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     * of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * ReceiveMessage call will wait for a message to arrive. An integer from
     * 0 to 20 (seconds). The default for this attribute is 0. </li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see
     * Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>RedrivePolicy</code> - The parameters for dead letter queue
     * functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter
     * Queues in the <i>Amazon SQS Developer Guide</i>.</li> </ul>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
  public SetQueueAttributesRequest addAttributesEntry(String key, String value) {
    if (null == this.attributes) {
      this.attributes = new java.util.HashMap<String,String>();
    }
    if (this.attributes.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.attributes.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Attributes.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public SetQueueAttributesRequest clearAttributesEntries() {
    this.attributes = null;
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetQueueAttributesRequest == false) return false;
        SetQueueAttributesRequest other = (SetQueueAttributesRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
    @Override
    public SetQueueAttributesRequest clone() {
        
            return (SetQueueAttributesRequest) super.clone();
    }

}
    