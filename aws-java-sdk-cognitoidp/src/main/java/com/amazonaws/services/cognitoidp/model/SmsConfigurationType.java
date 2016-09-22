/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * The SMS configuratoin type.
 * </p>
 */
public class SmsConfigurationType implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
     * </p>
     */
    private String snsCallerArn;
    /**
     * <p>
     * The external ID.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
     * </p>
     * 
     * @param snsCallerArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
     */

    public void setSnsCallerArn(String snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
     */

    public String getSnsCallerArn() {
        return this.snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
     * </p>
     * 
     * @param snsCallerArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmsConfigurationType withSnsCallerArn(String snsCallerArn) {
        setSnsCallerArn(snsCallerArn);
        return this;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     * 
     * @param externalId
     *        The external ID.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     * 
     * @return The external ID.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     * 
     * @param externalId
     *        The external ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmsConfigurationType withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnsCallerArn() != null)
            sb.append("SnsCallerArn: " + getSnsCallerArn() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmsConfigurationType == false)
            return false;
        SmsConfigurationType other = (SmsConfigurationType) obj;
        if (other.getSnsCallerArn() == null ^ this.getSnsCallerArn() == null)
            return false;
        if (other.getSnsCallerArn() != null && other.getSnsCallerArn().equals(this.getSnsCallerArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsCallerArn() == null) ? 0 : getSnsCallerArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public SmsConfigurationType clone() {
        try {
            return (SmsConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
