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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the T2 or T3 instance whose credit option for CPU usage was not modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnsuccessfulInstanceCreditSpecificationItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsuccessfulInstanceCreditSpecificationItem implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
     * </p>
     */
    private UnsuccessfulInstanceCreditSpecificationItemError error;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsuccessfulInstanceCreditSpecificationItem withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
     * </p>
     * 
     * @param error
     *        The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
     */

    public void setError(UnsuccessfulInstanceCreditSpecificationItemError error) {
        this.error = error;
    }

    /**
     * <p>
     * The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
     * </p>
     * 
     * @return The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
     */

    public UnsuccessfulInstanceCreditSpecificationItemError getError() {
        return this.error;
    }

    /**
     * <p>
     * The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
     * </p>
     * 
     * @param error
     *        The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsuccessfulInstanceCreditSpecificationItem withError(UnsuccessfulInstanceCreditSpecificationItemError error) {
        setError(error);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsuccessfulInstanceCreditSpecificationItem == false)
            return false;
        UnsuccessfulInstanceCreditSpecificationItem other = (UnsuccessfulInstanceCreditSpecificationItem) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public UnsuccessfulInstanceCreditSpecificationItem clone() {
        try {
            return (UnsuccessfulInstanceCreditSpecificationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
