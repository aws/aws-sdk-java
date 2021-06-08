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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of <code>OfflineStore</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OfflineStoreStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfflineStoreStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An <code>OfflineStore</code> status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The justification for why the OfflineStoreStatus is Blocked (if applicable).
     * </p>
     */
    private String blockedReason;

    /**
     * <p>
     * An <code>OfflineStore</code> status.
     * </p>
     * 
     * @param status
     *        An <code>OfflineStore</code> status.
     * @see OfflineStoreStatusValue
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An <code>OfflineStore</code> status.
     * </p>
     * 
     * @return An <code>OfflineStore</code> status.
     * @see OfflineStoreStatusValue
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An <code>OfflineStore</code> status.
     * </p>
     * 
     * @param status
     *        An <code>OfflineStore</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfflineStoreStatusValue
     */

    public OfflineStoreStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An <code>OfflineStore</code> status.
     * </p>
     * 
     * @param status
     *        An <code>OfflineStore</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfflineStoreStatusValue
     */

    public OfflineStoreStatus withStatus(OfflineStoreStatusValue status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The justification for why the OfflineStoreStatus is Blocked (if applicable).
     * </p>
     * 
     * @param blockedReason
     *        The justification for why the OfflineStoreStatus is Blocked (if applicable).
     */

    public void setBlockedReason(String blockedReason) {
        this.blockedReason = blockedReason;
    }

    /**
     * <p>
     * The justification for why the OfflineStoreStatus is Blocked (if applicable).
     * </p>
     * 
     * @return The justification for why the OfflineStoreStatus is Blocked (if applicable).
     */

    public String getBlockedReason() {
        return this.blockedReason;
    }

    /**
     * <p>
     * The justification for why the OfflineStoreStatus is Blocked (if applicable).
     * </p>
     * 
     * @param blockedReason
     *        The justification for why the OfflineStoreStatus is Blocked (if applicable).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfflineStoreStatus withBlockedReason(String blockedReason) {
        setBlockedReason(blockedReason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getBlockedReason() != null)
            sb.append("BlockedReason: ").append(getBlockedReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfflineStoreStatus == false)
            return false;
        OfflineStoreStatus other = (OfflineStoreStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getBlockedReason() == null ^ this.getBlockedReason() == null)
            return false;
        if (other.getBlockedReason() != null && other.getBlockedReason().equals(this.getBlockedReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getBlockedReason() == null) ? 0 : getBlockedReason().hashCode());
        return hashCode;
    }

    @Override
    public OfflineStoreStatus clone() {
        try {
            return (OfflineStoreStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OfflineStoreStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
