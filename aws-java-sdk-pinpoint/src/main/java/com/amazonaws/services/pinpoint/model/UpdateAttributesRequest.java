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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Update attributes request
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAttributesRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAttributesRequest implements Serializable, Cloneable, StructuredPojo {

    /** The GLOB wildcard for removing the attributes in the application */
    private java.util.List<String> blacklist;

    /**
     * The GLOB wildcard for removing the attributes in the application
     * 
     * @return The GLOB wildcard for removing the attributes in the application
     */

    public java.util.List<String> getBlacklist() {
        return blacklist;
    }

    /**
     * The GLOB wildcard for removing the attributes in the application
     * 
     * @param blacklist
     *        The GLOB wildcard for removing the attributes in the application
     */

    public void setBlacklist(java.util.Collection<String> blacklist) {
        if (blacklist == null) {
            this.blacklist = null;
            return;
        }

        this.blacklist = new java.util.ArrayList<String>(blacklist);
    }

    /**
     * The GLOB wildcard for removing the attributes in the application
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlacklist(java.util.Collection)} or {@link #withBlacklist(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blacklist
     *        The GLOB wildcard for removing the attributes in the application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttributesRequest withBlacklist(String... blacklist) {
        if (this.blacklist == null) {
            setBlacklist(new java.util.ArrayList<String>(blacklist.length));
        }
        for (String ele : blacklist) {
            this.blacklist.add(ele);
        }
        return this;
    }

    /**
     * The GLOB wildcard for removing the attributes in the application
     * 
     * @param blacklist
     *        The GLOB wildcard for removing the attributes in the application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttributesRequest withBlacklist(java.util.Collection<String> blacklist) {
        setBlacklist(blacklist);
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
        if (getBlacklist() != null)
            sb.append("Blacklist: ").append(getBlacklist());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAttributesRequest == false)
            return false;
        UpdateAttributesRequest other = (UpdateAttributesRequest) obj;
        if (other.getBlacklist() == null ^ this.getBlacklist() == null)
            return false;
        if (other.getBlacklist() != null && other.getBlacklist().equals(this.getBlacklist()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlacklist() == null) ? 0 : getBlacklist().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAttributesRequest clone() {
        try {
            return (UpdateAttributesRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.UpdateAttributesRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
