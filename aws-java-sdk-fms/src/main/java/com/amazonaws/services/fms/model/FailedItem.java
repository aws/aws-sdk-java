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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of a resource that failed when trying to update it's association to a resource set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/FailedItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The univeral resource indicator (URI) of the resource that failed.
     * </p>
     */
    private String uRI;
    /**
     * <p>
     * The reason the resource's association could not be updated.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The univeral resource indicator (URI) of the resource that failed.
     * </p>
     * 
     * @param uRI
     *        The univeral resource indicator (URI) of the resource that failed.
     */

    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * The univeral resource indicator (URI) of the resource that failed.
     * </p>
     * 
     * @return The univeral resource indicator (URI) of the resource that failed.
     */

    public String getURI() {
        return this.uRI;
    }

    /**
     * <p>
     * The univeral resource indicator (URI) of the resource that failed.
     * </p>
     * 
     * @param uRI
     *        The univeral resource indicator (URI) of the resource that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedItem withURI(String uRI) {
        setURI(uRI);
        return this;
    }

    /**
     * <p>
     * The reason the resource's association could not be updated.
     * </p>
     * 
     * @param reason
     *        The reason the resource's association could not be updated.
     * @see FailedItemReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason the resource's association could not be updated.
     * </p>
     * 
     * @return The reason the resource's association could not be updated.
     * @see FailedItemReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason the resource's association could not be updated.
     * </p>
     * 
     * @param reason
     *        The reason the resource's association could not be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailedItemReason
     */

    public FailedItem withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason the resource's association could not be updated.
     * </p>
     * 
     * @param reason
     *        The reason the resource's association could not be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailedItemReason
     */

    public FailedItem withReason(FailedItemReason reason) {
        this.reason = reason.toString();
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
        if (getURI() != null)
            sb.append("URI: ").append(getURI()).append(",");
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

        if (obj instanceof FailedItem == false)
            return false;
        FailedItem other = (FailedItem) obj;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
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

        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public FailedItem clone() {
        try {
            return (FailedItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.FailedItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
