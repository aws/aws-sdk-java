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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteCapability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCapabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     */
    private String capabilityId;

    /**
     * <p>
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Specifies a system-assigned unique identifier for the capability.
     */

    public void setCapabilityId(String capabilityId) {
        this.capabilityId = capabilityId;
    }

    /**
     * <p>
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @return Specifies a system-assigned unique identifier for the capability.
     */

    public String getCapabilityId() {
        return this.capabilityId;
    }

    /**
     * <p>
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Specifies a system-assigned unique identifier for the capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCapabilityRequest withCapabilityId(String capabilityId) {
        setCapabilityId(capabilityId);
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
        if (getCapabilityId() != null)
            sb.append("CapabilityId: ").append(getCapabilityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCapabilityRequest == false)
            return false;
        DeleteCapabilityRequest other = (DeleteCapabilityRequest) obj;
        if (other.getCapabilityId() == null ^ this.getCapabilityId() == null)
            return false;
        if (other.getCapabilityId() != null && other.getCapabilityId().equals(this.getCapabilityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilityId() == null) ? 0 : getCapabilityId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCapabilityRequest clone() {
        return (DeleteCapabilityRequest) super.clone();
    }

}
