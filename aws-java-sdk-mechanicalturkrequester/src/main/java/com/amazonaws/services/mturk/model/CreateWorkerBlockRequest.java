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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateWorkerBlock" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkerBlockRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Worker to block.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your
     * Workers. The Worker does not see this message.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The ID of the Worker to block.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker to block.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker to block.
     * </p>
     * 
     * @return The ID of the Worker to block.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker to block.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker to block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerBlockRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your
     * Workers. The Worker does not see this message.
     * </p>
     * 
     * @param reason
     *        A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your
     *        Workers. The Worker does not see this message.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your
     * Workers. The Worker does not see this message.
     * </p>
     * 
     * @return A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your
     *         Workers. The Worker does not see this message.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your
     * Workers. The Worker does not see this message.
     * </p>
     * 
     * @param reason
     *        A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your
     *        Workers. The Worker does not see this message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerBlockRequest withReason(String reason) {
        setReason(reason);
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
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkerBlockRequest == false)
            return false;
        CreateWorkerBlockRequest other = (CreateWorkerBlockRequest) obj;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkerBlockRequest clone() {
        return (CreateWorkerBlockRequest) super.clone();
    }

}
