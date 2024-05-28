/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueueEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The queue environment ID.
     * </p>
     */
    private String queueEnvironmentId;

    /**
     * <p>
     * The queue environment ID.
     * </p>
     * 
     * @param queueEnvironmentId
     *        The queue environment ID.
     */

    public void setQueueEnvironmentId(String queueEnvironmentId) {
        this.queueEnvironmentId = queueEnvironmentId;
    }

    /**
     * <p>
     * The queue environment ID.
     * </p>
     * 
     * @return The queue environment ID.
     */

    public String getQueueEnvironmentId() {
        return this.queueEnvironmentId;
    }

    /**
     * <p>
     * The queue environment ID.
     * </p>
     * 
     * @param queueEnvironmentId
     *        The queue environment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueEnvironmentResult withQueueEnvironmentId(String queueEnvironmentId) {
        setQueueEnvironmentId(queueEnvironmentId);
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
        if (getQueueEnvironmentId() != null)
            sb.append("QueueEnvironmentId: ").append(getQueueEnvironmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueEnvironmentResult == false)
            return false;
        CreateQueueEnvironmentResult other = (CreateQueueEnvironmentResult) obj;
        if (other.getQueueEnvironmentId() == null ^ this.getQueueEnvironmentId() == null)
            return false;
        if (other.getQueueEnvironmentId() != null && other.getQueueEnvironmentId().equals(this.getQueueEnvironmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueEnvironmentId() == null) ? 0 : getQueueEnvironmentId().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueueEnvironmentResult clone() {
        try {
            return (CreateQueueEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
