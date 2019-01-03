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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to associate a configuration set with a dedicated IP pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeliveryOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     */
    private String sendingPoolName;

    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     * 
     * @param sendingPoolName
     *        The name of the dedicated IP pool that you want to associate with the configuration set.
     */

    public void setSendingPoolName(String sendingPoolName) {
        this.sendingPoolName = sendingPoolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     * 
     * @return The name of the dedicated IP pool that you want to associate with the configuration set.
     */

    public String getSendingPoolName() {
        return this.sendingPoolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool that you want to associate with the configuration set.
     * </p>
     * 
     * @param sendingPoolName
     *        The name of the dedicated IP pool that you want to associate with the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryOptions withSendingPoolName(String sendingPoolName) {
        setSendingPoolName(sendingPoolName);
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
        if (getSendingPoolName() != null)
            sb.append("SendingPoolName: ").append(getSendingPoolName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryOptions == false)
            return false;
        DeliveryOptions other = (DeliveryOptions) obj;
        if (other.getSendingPoolName() == null ^ this.getSendingPoolName() == null)
            return false;
        if (other.getSendingPoolName() != null && other.getSendingPoolName().equals(this.getSendingPoolName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSendingPoolName() == null) ? 0 : getSendingPoolName().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryOptions clone() {
        try {
            return (DeliveryOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DeliveryOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
