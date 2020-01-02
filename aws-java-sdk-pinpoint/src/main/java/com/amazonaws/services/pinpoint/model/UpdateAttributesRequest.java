/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Specifies one or more attributes to remove from all the endpoints that are associated with an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAttributesRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAttributesRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of the attributes to remove from all the endpoints that are associated with the application. The array
     * can specify the complete, exact name of each attribute to remove or it can specify a glob pattern that an
     * attribute name must match in order for the attribute to be removed.
     * </p>
     */
    private java.util.List<String> blacklist;

    /**
     * <p>
     * An array of the attributes to remove from all the endpoints that are associated with the application. The array
     * can specify the complete, exact name of each attribute to remove or it can specify a glob pattern that an
     * attribute name must match in order for the attribute to be removed.
     * </p>
     * 
     * @return An array of the attributes to remove from all the endpoints that are associated with the application. The
     *         array can specify the complete, exact name of each attribute to remove or it can specify a glob pattern
     *         that an attribute name must match in order for the attribute to be removed.
     */

    public java.util.List<String> getBlacklist() {
        return blacklist;
    }

    /**
     * <p>
     * An array of the attributes to remove from all the endpoints that are associated with the application. The array
     * can specify the complete, exact name of each attribute to remove or it can specify a glob pattern that an
     * attribute name must match in order for the attribute to be removed.
     * </p>
     * 
     * @param blacklist
     *        An array of the attributes to remove from all the endpoints that are associated with the application. The
     *        array can specify the complete, exact name of each attribute to remove or it can specify a glob pattern
     *        that an attribute name must match in order for the attribute to be removed.
     */

    public void setBlacklist(java.util.Collection<String> blacklist) {
        if (blacklist == null) {
            this.blacklist = null;
            return;
        }

        this.blacklist = new java.util.ArrayList<String>(blacklist);
    }

    /**
     * <p>
     * An array of the attributes to remove from all the endpoints that are associated with the application. The array
     * can specify the complete, exact name of each attribute to remove or it can specify a glob pattern that an
     * attribute name must match in order for the attribute to be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlacklist(java.util.Collection)} or {@link #withBlacklist(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blacklist
     *        An array of the attributes to remove from all the endpoints that are associated with the application. The
     *        array can specify the complete, exact name of each attribute to remove or it can specify a glob pattern
     *        that an attribute name must match in order for the attribute to be removed.
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
     * <p>
     * An array of the attributes to remove from all the endpoints that are associated with the application. The array
     * can specify the complete, exact name of each attribute to remove or it can specify a glob pattern that an
     * attribute name must match in order for the attribute to be removed.
     * </p>
     * 
     * @param blacklist
     *        An array of the attributes to remove from all the endpoints that are associated with the application. The
     *        array can specify the complete, exact name of each attribute to remove or it can specify a glob pattern
     *        that an attribute name must match in order for the attribute to be removed.
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
