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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options for filtering API keys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ApiKeyFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiKeyFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     */
    private String keyStatus;

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * 
     * @param keyStatus
     *        Filter on <code>Active</code> or <code>Expired</code> API keys.
     * @see Status
     */

    public void setKeyStatus(String keyStatus) {
        this.keyStatus = keyStatus;
    }

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * 
     * @return Filter on <code>Active</code> or <code>Expired</code> API keys.
     * @see Status
     */

    public String getKeyStatus() {
        return this.keyStatus;
    }

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * 
     * @param keyStatus
     *        Filter on <code>Active</code> or <code>Expired</code> API keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ApiKeyFilter withKeyStatus(String keyStatus) {
        setKeyStatus(keyStatus);
        return this;
    }

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * 
     * @param keyStatus
     *        Filter on <code>Active</code> or <code>Expired</code> API keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ApiKeyFilter withKeyStatus(Status keyStatus) {
        this.keyStatus = keyStatus.toString();
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
        if (getKeyStatus() != null)
            sb.append("KeyStatus: ").append(getKeyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiKeyFilter == false)
            return false;
        ApiKeyFilter other = (ApiKeyFilter) obj;
        if (other.getKeyStatus() == null ^ this.getKeyStatus() == null)
            return false;
        if (other.getKeyStatus() != null && other.getKeyStatus().equals(this.getKeyStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyStatus() == null) ? 0 : getKeyStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApiKeyFilter clone() {
        try {
            return (ApiKeyFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.ApiKeyFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
