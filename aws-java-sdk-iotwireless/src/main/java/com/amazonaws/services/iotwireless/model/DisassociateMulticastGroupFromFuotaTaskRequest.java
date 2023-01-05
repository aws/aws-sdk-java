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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateMulticastGroupFromFuotaTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateMulticastGroupFromFuotaTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String id;

    private String multicastGroupId;

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMulticastGroupFromFuotaTaskRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param multicastGroupId
     */

    public void setMulticastGroupId(String multicastGroupId) {
        this.multicastGroupId = multicastGroupId;
    }

    /**
     * @return
     */

    public String getMulticastGroupId() {
        return this.multicastGroupId;
    }

    /**
     * @param multicastGroupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMulticastGroupFromFuotaTaskRequest withMulticastGroupId(String multicastGroupId) {
        setMulticastGroupId(multicastGroupId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMulticastGroupId() != null)
            sb.append("MulticastGroupId: ").append(getMulticastGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateMulticastGroupFromFuotaTaskRequest == false)
            return false;
        DisassociateMulticastGroupFromFuotaTaskRequest other = (DisassociateMulticastGroupFromFuotaTaskRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMulticastGroupId() == null ^ this.getMulticastGroupId() == null)
            return false;
        if (other.getMulticastGroupId() != null && other.getMulticastGroupId().equals(this.getMulticastGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMulticastGroupId() == null) ? 0 : getMulticastGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateMulticastGroupFromFuotaTaskRequest clone() {
        return (DisassociateMulticastGroupFromFuotaTaskRequest) super.clone();
    }

}
