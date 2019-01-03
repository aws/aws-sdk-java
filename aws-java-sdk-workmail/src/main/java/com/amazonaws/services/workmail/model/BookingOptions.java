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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * At least one delegate must be associated to the resource to disable automatic replies from the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/BookingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BookingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the
     * resource.
     * </p>
     */
    private Boolean autoAcceptRequests;
    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     */
    private Boolean autoDeclineRecurringRequests;
    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     */
    private Boolean autoDeclineConflictingRequests;

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the
     * resource.
     * </p>
     * 
     * @param autoAcceptRequests
     *        The resource's ability to automatically reply to requests. If disabled, delegates must be associated to
     *        the resource.
     */

    public void setAutoAcceptRequests(Boolean autoAcceptRequests) {
        this.autoAcceptRequests = autoAcceptRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the
     * resource.
     * </p>
     * 
     * @return The resource's ability to automatically reply to requests. If disabled, delegates must be associated to
     *         the resource.
     */

    public Boolean getAutoAcceptRequests() {
        return this.autoAcceptRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the
     * resource.
     * </p>
     * 
     * @param autoAcceptRequests
     *        The resource's ability to automatically reply to requests. If disabled, delegates must be associated to
     *        the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BookingOptions withAutoAcceptRequests(Boolean autoAcceptRequests) {
        setAutoAcceptRequests(autoAcceptRequests);
        return this;
    }

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the
     * resource.
     * </p>
     * 
     * @return The resource's ability to automatically reply to requests. If disabled, delegates must be associated to
     *         the resource.
     */

    public Boolean isAutoAcceptRequests() {
        return this.autoAcceptRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     * 
     * @param autoDeclineRecurringRequests
     *        The resource's ability to automatically decline any recurring requests.
     */

    public void setAutoDeclineRecurringRequests(Boolean autoDeclineRecurringRequests) {
        this.autoDeclineRecurringRequests = autoDeclineRecurringRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     * 
     * @return The resource's ability to automatically decline any recurring requests.
     */

    public Boolean getAutoDeclineRecurringRequests() {
        return this.autoDeclineRecurringRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     * 
     * @param autoDeclineRecurringRequests
     *        The resource's ability to automatically decline any recurring requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BookingOptions withAutoDeclineRecurringRequests(Boolean autoDeclineRecurringRequests) {
        setAutoDeclineRecurringRequests(autoDeclineRecurringRequests);
        return this;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     * 
     * @return The resource's ability to automatically decline any recurring requests.
     */

    public Boolean isAutoDeclineRecurringRequests() {
        return this.autoDeclineRecurringRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     * 
     * @param autoDeclineConflictingRequests
     *        The resource's ability to automatically decline any conflicting requests.
     */

    public void setAutoDeclineConflictingRequests(Boolean autoDeclineConflictingRequests) {
        this.autoDeclineConflictingRequests = autoDeclineConflictingRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     * 
     * @return The resource's ability to automatically decline any conflicting requests.
     */

    public Boolean getAutoDeclineConflictingRequests() {
        return this.autoDeclineConflictingRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     * 
     * @param autoDeclineConflictingRequests
     *        The resource's ability to automatically decline any conflicting requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BookingOptions withAutoDeclineConflictingRequests(Boolean autoDeclineConflictingRequests) {
        setAutoDeclineConflictingRequests(autoDeclineConflictingRequests);
        return this;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     * 
     * @return The resource's ability to automatically decline any conflicting requests.
     */

    public Boolean isAutoDeclineConflictingRequests() {
        return this.autoDeclineConflictingRequests;
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
        if (getAutoAcceptRequests() != null)
            sb.append("AutoAcceptRequests: ").append(getAutoAcceptRequests()).append(",");
        if (getAutoDeclineRecurringRequests() != null)
            sb.append("AutoDeclineRecurringRequests: ").append(getAutoDeclineRecurringRequests()).append(",");
        if (getAutoDeclineConflictingRequests() != null)
            sb.append("AutoDeclineConflictingRequests: ").append(getAutoDeclineConflictingRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BookingOptions == false)
            return false;
        BookingOptions other = (BookingOptions) obj;
        if (other.getAutoAcceptRequests() == null ^ this.getAutoAcceptRequests() == null)
            return false;
        if (other.getAutoAcceptRequests() != null && other.getAutoAcceptRequests().equals(this.getAutoAcceptRequests()) == false)
            return false;
        if (other.getAutoDeclineRecurringRequests() == null ^ this.getAutoDeclineRecurringRequests() == null)
            return false;
        if (other.getAutoDeclineRecurringRequests() != null && other.getAutoDeclineRecurringRequests().equals(this.getAutoDeclineRecurringRequests()) == false)
            return false;
        if (other.getAutoDeclineConflictingRequests() == null ^ this.getAutoDeclineConflictingRequests() == null)
            return false;
        if (other.getAutoDeclineConflictingRequests() != null
                && other.getAutoDeclineConflictingRequests().equals(this.getAutoDeclineConflictingRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoAcceptRequests() == null) ? 0 : getAutoAcceptRequests().hashCode());
        hashCode = prime * hashCode + ((getAutoDeclineRecurringRequests() == null) ? 0 : getAutoDeclineRecurringRequests().hashCode());
        hashCode = prime * hashCode + ((getAutoDeclineConflictingRequests() == null) ? 0 : getAutoDeclineConflictingRequests().hashCode());
        return hashCode;
    }

    @Override
    public BookingOptions clone() {
        try {
            return (BookingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.BookingOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
