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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a resource relationship.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Relationship" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Relationship implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String from;
    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String to;

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param from
     *        The ARN of the resource.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param from
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param to
     *        The ARN of the resource.
     */

    public void setTo(String to) {
        this.to = to;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getTo() {
        return this.to;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param to
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withTo(String to) {
        setTo(to);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Relationship == false)
            return false;
        Relationship other = (Relationship) obj;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        return hashCode;
    }

    @Override
    public Relationship clone() {
        try {
            return (Relationship) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.RelationshipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
