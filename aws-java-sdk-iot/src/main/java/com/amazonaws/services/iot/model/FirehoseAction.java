/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * 
 */
public class FirehoseAction implements Serializable, Cloneable {

    private String roleArn;

    private String deliveryStreamName;

    /**
     * @param roleArn
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * @return
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @param roleArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FirehoseAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param deliveryStreamName
     */
    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * @return
     */
    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * @param deliveryStreamName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FirehoseAction withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: " + getDeliveryStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirehoseAction == false)
            return false;
        FirehoseAction other = (FirehoseAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null
                && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDeliveryStreamName() == null
                ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null
                && other.getDeliveryStreamName().equals(
                        this.getDeliveryStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeliveryStreamName() == null) ? 0
                        : getDeliveryStreamName().hashCode());
        return hashCode;
    }

    @Override
    public FirehoseAction clone() {
        try {
            return (FirehoseAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}