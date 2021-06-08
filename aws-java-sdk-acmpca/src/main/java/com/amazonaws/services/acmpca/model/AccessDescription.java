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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides access information used by the <code>authorityInfoAccess</code> and <code>subjectInfoAccess</code>
 * extensions described in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/AccessDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type and format of <code>AccessDescription</code> information.
     * </p>
     */
    private AccessMethod accessMethod;
    /**
     * <p>
     * The location of <code>AccessDescription</code> information.
     * </p>
     */
    private GeneralName accessLocation;

    /**
     * <p>
     * The type and format of <code>AccessDescription</code> information.
     * </p>
     * 
     * @param accessMethod
     *        The type and format of <code>AccessDescription</code> information.
     */

    public void setAccessMethod(AccessMethod accessMethod) {
        this.accessMethod = accessMethod;
    }

    /**
     * <p>
     * The type and format of <code>AccessDescription</code> information.
     * </p>
     * 
     * @return The type and format of <code>AccessDescription</code> information.
     */

    public AccessMethod getAccessMethod() {
        return this.accessMethod;
    }

    /**
     * <p>
     * The type and format of <code>AccessDescription</code> information.
     * </p>
     * 
     * @param accessMethod
     *        The type and format of <code>AccessDescription</code> information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDescription withAccessMethod(AccessMethod accessMethod) {
        setAccessMethod(accessMethod);
        return this;
    }

    /**
     * <p>
     * The location of <code>AccessDescription</code> information.
     * </p>
     * 
     * @param accessLocation
     *        The location of <code>AccessDescription</code> information.
     */

    public void setAccessLocation(GeneralName accessLocation) {
        this.accessLocation = accessLocation;
    }

    /**
     * <p>
     * The location of <code>AccessDescription</code> information.
     * </p>
     * 
     * @return The location of <code>AccessDescription</code> information.
     */

    public GeneralName getAccessLocation() {
        return this.accessLocation;
    }

    /**
     * <p>
     * The location of <code>AccessDescription</code> information.
     * </p>
     * 
     * @param accessLocation
     *        The location of <code>AccessDescription</code> information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDescription withAccessLocation(GeneralName accessLocation) {
        setAccessLocation(accessLocation);
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
        if (getAccessMethod() != null)
            sb.append("AccessMethod: ").append(getAccessMethod()).append(",");
        if (getAccessLocation() != null)
            sb.append("AccessLocation: ").append(getAccessLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessDescription == false)
            return false;
        AccessDescription other = (AccessDescription) obj;
        if (other.getAccessMethod() == null ^ this.getAccessMethod() == null)
            return false;
        if (other.getAccessMethod() != null && other.getAccessMethod().equals(this.getAccessMethod()) == false)
            return false;
        if (other.getAccessLocation() == null ^ this.getAccessLocation() == null)
            return false;
        if (other.getAccessLocation() != null && other.getAccessLocation().equals(this.getAccessLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessMethod() == null) ? 0 : getAccessMethod().hashCode());
        hashCode = prime * hashCode + ((getAccessLocation() == null) ? 0 : getAccessLocation().hashCode());
        return hashCode;
    }

    @Override
    public AccessDescription clone() {
        try {
            return (AccessDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.AccessDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
