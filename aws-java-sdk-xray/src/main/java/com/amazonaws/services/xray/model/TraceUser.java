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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a user recorded in segment documents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/TraceUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TraceUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user's name.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Services that the user's request hit.
     * </p>
     */
    private java.util.List<ServiceId> serviceIds;

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @param userName
     *        The user's name.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @return The user's name.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @param userName
     *        The user's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceUser withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Services that the user's request hit.
     * </p>
     * 
     * @return Services that the user's request hit.
     */

    public java.util.List<ServiceId> getServiceIds() {
        return serviceIds;
    }

    /**
     * <p>
     * Services that the user's request hit.
     * </p>
     * 
     * @param serviceIds
     *        Services that the user's request hit.
     */

    public void setServiceIds(java.util.Collection<ServiceId> serviceIds) {
        if (serviceIds == null) {
            this.serviceIds = null;
            return;
        }

        this.serviceIds = new java.util.ArrayList<ServiceId>(serviceIds);
    }

    /**
     * <p>
     * Services that the user's request hit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceIds(java.util.Collection)} or {@link #withServiceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceIds
     *        Services that the user's request hit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceUser withServiceIds(ServiceId... serviceIds) {
        if (this.serviceIds == null) {
            setServiceIds(new java.util.ArrayList<ServiceId>(serviceIds.length));
        }
        for (ServiceId ele : serviceIds) {
            this.serviceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Services that the user's request hit.
     * </p>
     * 
     * @param serviceIds
     *        Services that the user's request hit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceUser withServiceIds(java.util.Collection<ServiceId> serviceIds) {
        setServiceIds(serviceIds);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getServiceIds() != null)
            sb.append("ServiceIds: ").append(getServiceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TraceUser == false)
            return false;
        TraceUser other = (TraceUser) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getServiceIds() == null ^ this.getServiceIds() == null)
            return false;
        if (other.getServiceIds() != null && other.getServiceIds().equals(this.getServiceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getServiceIds() == null) ? 0 : getServiceIds().hashCode());
        return hashCode;
    }

    @Override
    public TraceUser clone() {
        try {
            return (TraceUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.TraceUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
