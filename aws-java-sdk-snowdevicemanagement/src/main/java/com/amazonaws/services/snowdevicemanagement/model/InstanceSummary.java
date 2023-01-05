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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/InstanceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure containing details about the instance.
     * </p>
     */
    private Instance instance;
    /**
     * <p>
     * When the instance summary was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * A structure containing details about the instance.
     * </p>
     * 
     * @param instance
     *        A structure containing details about the instance.
     */

    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    /**
     * <p>
     * A structure containing details about the instance.
     * </p>
     * 
     * @return A structure containing details about the instance.
     */

    public Instance getInstance() {
        return this.instance;
    }

    /**
     * <p>
     * A structure containing details about the instance.
     * </p>
     * 
     * @param instance
     *        A structure containing details about the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withInstance(Instance instance) {
        setInstance(instance);
        return this;
    }

    /**
     * <p>
     * When the instance summary was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the instance summary was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * When the instance summary was last updated.
     * </p>
     * 
     * @return When the instance summary was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * When the instance summary was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the instance summary was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getInstance() != null)
            sb.append("Instance: ").append(getInstance()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSummary == false)
            return false;
        InstanceSummary other = (InstanceSummary) obj;
        if (other.getInstance() == null ^ this.getInstance() == null)
            return false;
        if (other.getInstance() != null && other.getInstance().equals(this.getInstance()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstance() == null) ? 0 : getInstance().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSummary clone() {
        try {
            return (InstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.InstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
