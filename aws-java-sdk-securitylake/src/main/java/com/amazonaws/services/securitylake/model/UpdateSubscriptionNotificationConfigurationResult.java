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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriptionNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionNotificationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Returns the ARN of the queue.
     * </p>
     */
    private String queueArn;

    /**
     * <p>
     * Returns the ARN of the queue.
     * </p>
     * 
     * @param queueArn
     *        Returns the ARN of the queue.
     */

    public void setQueueArn(String queueArn) {
        this.queueArn = queueArn;
    }

    /**
     * <p>
     * Returns the ARN of the queue.
     * </p>
     * 
     * @return Returns the ARN of the queue.
     */

    public String getQueueArn() {
        return this.queueArn;
    }

    /**
     * <p>
     * Returns the ARN of the queue.
     * </p>
     * 
     * @param queueArn
     *        Returns the ARN of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionNotificationConfigurationResult withQueueArn(String queueArn) {
        setQueueArn(queueArn);
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
        if (getQueueArn() != null)
            sb.append("QueueArn: ").append(getQueueArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionNotificationConfigurationResult == false)
            return false;
        UpdateSubscriptionNotificationConfigurationResult other = (UpdateSubscriptionNotificationConfigurationResult) obj;
        if (other.getQueueArn() == null ^ this.getQueueArn() == null)
            return false;
        if (other.getQueueArn() != null && other.getQueueArn().equals(this.getQueueArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueArn() == null) ? 0 : getQueueArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionNotificationConfigurationResult clone() {
        try {
            return (UpdateSubscriptionNotificationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
