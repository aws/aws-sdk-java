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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Promotes a data replication replica broker to the primary broker role.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/Promote" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromoteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     */
    private String brokerId;
    /**
     * <p>
     * The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @return The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromoteRequest withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * <p>
     * The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * </p>
     * 
     * @param mode
     *        The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * @see PromoteMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * </p>
     * 
     * @return The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * @see PromoteMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * </p>
     * 
     * @param mode
     *        The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromoteMode
     */

    public PromoteRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * </p>
     * 
     * @param mode
     *        The Promote mode requested. Note: Valid values for the parameter are SWITCHOVER, FAILOVER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromoteMode
     */

    public PromoteRequest withMode(PromoteMode mode) {
        this.mode = mode.toString();
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
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromoteRequest == false)
            return false;
        PromoteRequest other = (PromoteRequest) obj;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public PromoteRequest clone() {
        return (PromoteRequest) super.clone();
    }

}
