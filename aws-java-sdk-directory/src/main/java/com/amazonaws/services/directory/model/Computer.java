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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a computer account in a directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/Computer" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Computer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the computer.
     * </p>
     */
    private String computerId;
    /**
     * <p>
     * The computer name.
     * </p>
     */
    private String computerName;
    /**
     * <p>
     * An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> computerAttributes;

    /**
     * <p>
     * The identifier of the computer.
     * </p>
     * 
     * @param computerId
     *        The identifier of the computer.
     */

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    /**
     * <p>
     * The identifier of the computer.
     * </p>
     * 
     * @return The identifier of the computer.
     */

    public String getComputerId() {
        return this.computerId;
    }

    /**
     * <p>
     * The identifier of the computer.
     * </p>
     * 
     * @param computerId
     *        The identifier of the computer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computer withComputerId(String computerId) {
        setComputerId(computerId);
        return this;
    }

    /**
     * <p>
     * The computer name.
     * </p>
     * 
     * @param computerName
     *        The computer name.
     */

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    /**
     * <p>
     * The computer name.
     * </p>
     * 
     * @return The computer name.
     */

    public String getComputerName() {
        return this.computerName;
    }

    /**
     * <p>
     * The computer name.
     * </p>
     * 
     * @param computerName
     *        The computer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computer withComputerName(String computerName) {
        setComputerName(computerName);
        return this;
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     * </p>
     * 
     * @return An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     */

    public java.util.List<Attribute> getComputerAttributes() {
        if (computerAttributes == null) {
            computerAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return computerAttributes;
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     * </p>
     * 
     * @param computerAttributes
     *        An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     */

    public void setComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        if (computerAttributes == null) {
            this.computerAttributes = null;
            return;
        }

        this.computerAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>(computerAttributes);
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputerAttributes(java.util.Collection)} or {@link #withComputerAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param computerAttributes
     *        An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computer withComputerAttributes(Attribute... computerAttributes) {
        if (this.computerAttributes == null) {
            setComputerAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(computerAttributes.length));
        }
        for (Attribute ele : computerAttributes) {
            this.computerAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     * </p>
     * 
     * @param computerAttributes
     *        An array of <a>Attribute</a> objects containing the LDAP attributes that belong to the computer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Computer withComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        setComputerAttributes(computerAttributes);
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
        if (getComputerId() != null)
            sb.append("ComputerId: ").append(getComputerId()).append(",");
        if (getComputerName() != null)
            sb.append("ComputerName: ").append(getComputerName()).append(",");
        if (getComputerAttributes() != null)
            sb.append("ComputerAttributes: ").append(getComputerAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Computer == false)
            return false;
        Computer other = (Computer) obj;
        if (other.getComputerId() == null ^ this.getComputerId() == null)
            return false;
        if (other.getComputerId() != null && other.getComputerId().equals(this.getComputerId()) == false)
            return false;
        if (other.getComputerName() == null ^ this.getComputerName() == null)
            return false;
        if (other.getComputerName() != null && other.getComputerName().equals(this.getComputerName()) == false)
            return false;
        if (other.getComputerAttributes() == null ^ this.getComputerAttributes() == null)
            return false;
        if (other.getComputerAttributes() != null && other.getComputerAttributes().equals(this.getComputerAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputerId() == null) ? 0 : getComputerId().hashCode());
        hashCode = prime * hashCode + ((getComputerName() == null) ? 0 : getComputerName().hashCode());
        hashCode = prime * hashCode + ((getComputerAttributes() == null) ? 0 : getComputerAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.ComputerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
