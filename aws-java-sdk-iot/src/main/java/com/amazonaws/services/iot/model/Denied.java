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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information that denied the authorization.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Denied implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on
     * a resource it is considered an implicit deny.
     * </p>
     */
    private ImplicitDeny implicitDeny;
    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     */
    private ExplicitDeny explicitDeny;

    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on
     * a resource it is considered an implicit deny.
     * </p>
     * 
     * @param implicitDeny
     *        Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an
     *        action on a resource it is considered an implicit deny.
     */

    public void setImplicitDeny(ImplicitDeny implicitDeny) {
        this.implicitDeny = implicitDeny;
    }

    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on
     * a resource it is considered an implicit deny.
     * </p>
     * 
     * @return Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an
     *         action on a resource it is considered an implicit deny.
     */

    public ImplicitDeny getImplicitDeny() {
        return this.implicitDeny;
    }

    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on
     * a resource it is considered an implicit deny.
     * </p>
     * 
     * @param implicitDeny
     *        Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an
     *        action on a resource it is considered an implicit deny.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Denied withImplicitDeny(ImplicitDeny implicitDeny) {
        setImplicitDeny(implicitDeny);
        return this;
    }

    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     * 
     * @param explicitDeny
     *        Information that explicitly denies the authorization.
     */

    public void setExplicitDeny(ExplicitDeny explicitDeny) {
        this.explicitDeny = explicitDeny;
    }

    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     * 
     * @return Information that explicitly denies the authorization.
     */

    public ExplicitDeny getExplicitDeny() {
        return this.explicitDeny;
    }

    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     * 
     * @param explicitDeny
     *        Information that explicitly denies the authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Denied withExplicitDeny(ExplicitDeny explicitDeny) {
        setExplicitDeny(explicitDeny);
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
        if (getImplicitDeny() != null)
            sb.append("ImplicitDeny: ").append(getImplicitDeny()).append(",");
        if (getExplicitDeny() != null)
            sb.append("ExplicitDeny: ").append(getExplicitDeny());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Denied == false)
            return false;
        Denied other = (Denied) obj;
        if (other.getImplicitDeny() == null ^ this.getImplicitDeny() == null)
            return false;
        if (other.getImplicitDeny() != null && other.getImplicitDeny().equals(this.getImplicitDeny()) == false)
            return false;
        if (other.getExplicitDeny() == null ^ this.getExplicitDeny() == null)
            return false;
        if (other.getExplicitDeny() != null && other.getExplicitDeny().equals(this.getExplicitDeny()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImplicitDeny() == null) ? 0 : getImplicitDeny().hashCode());
        hashCode = prime * hashCode + ((getExplicitDeny() == null) ? 0 : getExplicitDeny().hashCode());
        return hashCode;
    }

    @Override
    public Denied clone() {
        try {
            return (Denied) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.DeniedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
