/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object containing expiration events options associated with an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExpiryEventsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpiryEventsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the number of days prior to certificate expiration when ACM starts generating <code>EventBridge</code>
     * events. ACM sends one event per day per certificate until the certificate expires. By default, accounts receive
     * events starting 45 days before certificate expiration.
     * </p>
     */
    private Integer daysBeforeExpiry;

    /**
     * <p>
     * Specifies the number of days prior to certificate expiration when ACM starts generating <code>EventBridge</code>
     * events. ACM sends one event per day per certificate until the certificate expires. By default, accounts receive
     * events starting 45 days before certificate expiration.
     * </p>
     * 
     * @param daysBeforeExpiry
     *        Specifies the number of days prior to certificate expiration when ACM starts generating
     *        <code>EventBridge</code> events. ACM sends one event per day per certificate until the certificate
     *        expires. By default, accounts receive events starting 45 days before certificate expiration.
     */

    public void setDaysBeforeExpiry(Integer daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }

    /**
     * <p>
     * Specifies the number of days prior to certificate expiration when ACM starts generating <code>EventBridge</code>
     * events. ACM sends one event per day per certificate until the certificate expires. By default, accounts receive
     * events starting 45 days before certificate expiration.
     * </p>
     * 
     * @return Specifies the number of days prior to certificate expiration when ACM starts generating
     *         <code>EventBridge</code> events. ACM sends one event per day per certificate until the certificate
     *         expires. By default, accounts receive events starting 45 days before certificate expiration.
     */

    public Integer getDaysBeforeExpiry() {
        return this.daysBeforeExpiry;
    }

    /**
     * <p>
     * Specifies the number of days prior to certificate expiration when ACM starts generating <code>EventBridge</code>
     * events. ACM sends one event per day per certificate until the certificate expires. By default, accounts receive
     * events starting 45 days before certificate expiration.
     * </p>
     * 
     * @param daysBeforeExpiry
     *        Specifies the number of days prior to certificate expiration when ACM starts generating
     *        <code>EventBridge</code> events. ACM sends one event per day per certificate until the certificate
     *        expires. By default, accounts receive events starting 45 days before certificate expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpiryEventsConfiguration withDaysBeforeExpiry(Integer daysBeforeExpiry) {
        setDaysBeforeExpiry(daysBeforeExpiry);
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
        if (getDaysBeforeExpiry() != null)
            sb.append("DaysBeforeExpiry: ").append(getDaysBeforeExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpiryEventsConfiguration == false)
            return false;
        ExpiryEventsConfiguration other = (ExpiryEventsConfiguration) obj;
        if (other.getDaysBeforeExpiry() == null ^ this.getDaysBeforeExpiry() == null)
            return false;
        if (other.getDaysBeforeExpiry() != null && other.getDaysBeforeExpiry().equals(this.getDaysBeforeExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDaysBeforeExpiry() == null) ? 0 : getDaysBeforeExpiry().hashCode());
        return hashCode;
    }

    @Override
    public ExpiryEventsConfiguration clone() {
        try {
            return (ExpiryEventsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.ExpiryEventsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
