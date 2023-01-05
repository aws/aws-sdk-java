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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container object for the session details that are associated with a workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ServiceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Server ID (<code>ServerId</code>), Session ID (<code>SessionId</code>) and user (<code>UserName</code>) make
     * up the <code>UserDetails</code>.
     * </p>
     */
    private UserDetails userDetails;

    /**
     * <p>
     * The Server ID (<code>ServerId</code>), Session ID (<code>SessionId</code>) and user (<code>UserName</code>) make
     * up the <code>UserDetails</code>.
     * </p>
     * 
     * @param userDetails
     *        The Server ID (<code>ServerId</code>), Session ID (<code>SessionId</code>) and user (<code>UserName</code>
     *        ) make up the <code>UserDetails</code>.
     */

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    /**
     * <p>
     * The Server ID (<code>ServerId</code>), Session ID (<code>SessionId</code>) and user (<code>UserName</code>) make
     * up the <code>UserDetails</code>.
     * </p>
     * 
     * @return The Server ID (<code>ServerId</code>), Session ID (<code>SessionId</code>) and user (
     *         <code>UserName</code>) make up the <code>UserDetails</code>.
     */

    public UserDetails getUserDetails() {
        return this.userDetails;
    }

    /**
     * <p>
     * The Server ID (<code>ServerId</code>), Session ID (<code>SessionId</code>) and user (<code>UserName</code>) make
     * up the <code>UserDetails</code>.
     * </p>
     * 
     * @param userDetails
     *        The Server ID (<code>ServerId</code>), Session ID (<code>SessionId</code>) and user (<code>UserName</code>
     *        ) make up the <code>UserDetails</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceMetadata withUserDetails(UserDetails userDetails) {
        setUserDetails(userDetails);
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
        if (getUserDetails() != null)
            sb.append("UserDetails: ").append(getUserDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceMetadata == false)
            return false;
        ServiceMetadata other = (ServiceMetadata) obj;
        if (other.getUserDetails() == null ^ this.getUserDetails() == null)
            return false;
        if (other.getUserDetails() != null && other.getUserDetails().equals(this.getUserDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserDetails() == null) ? 0 : getUserDetails().hashCode());
        return hashCode;
    }

    @Override
    public ServiceMetadata clone() {
        try {
            return (ServiceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ServiceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
