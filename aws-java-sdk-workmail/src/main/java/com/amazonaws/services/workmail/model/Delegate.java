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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name of the attribute, which is one of the values defined in the UserAttribute enumeration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/Delegate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delegate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the user or group associated as the resource's delegate.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier for the user or group associated as the resource's delegate.
     * </p>
     * 
     * @param id
     *        The identifier for the user or group associated as the resource's delegate.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the user or group associated as the resource's delegate.
     * </p>
     * 
     * @return The identifier for the user or group associated as the resource's delegate.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the user or group associated as the resource's delegate.
     * </p>
     * 
     * @param id
     *        The identifier for the user or group associated as the resource's delegate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegate withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * 
     * @param type
     *        The type of the delegate: user or group.
     * @see MemberType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * 
     * @return The type of the delegate: user or group.
     * @see MemberType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * 
     * @param type
     *        The type of the delegate: user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public Delegate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * 
     * @param type
     *        The type of the delegate: user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public Delegate withType(MemberType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Delegate == false)
            return false;
        Delegate other = (Delegate) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Delegate clone() {
        try {
            return (Delegate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.DelegateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
