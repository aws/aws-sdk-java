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
 * Identifying information for a Device Defender security profile.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityProfileIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name you have given to the security profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name you have given to the security profile.
     * </p>
     * 
     * @param name
     *        The name you have given to the security profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you have given to the security profile.
     * </p>
     * 
     * @return The name you have given to the security profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you have given to the security profile.
     * </p>
     * 
     * @param name
     *        The name you have given to the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileIdentifier withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * 
     * @param arn
     *        The ARN of the security profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * 
     * @return The ARN of the security profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * 
     * @param arn
     *        The ARN of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileIdentifier withArn(String arn) {
        setArn(arn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityProfileIdentifier == false)
            return false;
        SecurityProfileIdentifier other = (SecurityProfileIdentifier) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public SecurityProfileIdentifier clone() {
        try {
            return (SecurityProfileIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.SecurityProfileIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
