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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic you want to delete.
     * </p>
     */
    private String topicArn;

    /**
     * Default constructor for DeleteTopicRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DeleteTopicRequest() {
    }

    /**
     * Constructs a new DeleteTopicRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn
     *        The ARN of the topic you want to delete.
     */
    public DeleteTopicRequest(String topicArn) {
        setTopicArn(topicArn);
    }

    /**
     * <p>
     * The ARN of the topic you want to delete.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic you want to delete.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to delete.
     * </p>
     * 
     * @return The ARN of the topic you want to delete.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to delete.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTopicRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTopicRequest == false)
            return false;
        DeleteTopicRequest other = (DeleteTopicRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTopicRequest clone() {
        return (DeleteTopicRequest) super.clone();
    }

}
