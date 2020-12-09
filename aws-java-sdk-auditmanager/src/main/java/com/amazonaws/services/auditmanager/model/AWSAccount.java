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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The wrapper of AWS account details, such as account ID, email address, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AWSAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAccount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The email address associated with the specified AWS account.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The name of the specified AWS account.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param id
     *        The identifier for the specified AWS account.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @return The identifier for the specified AWS account.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param id
     *        The identifier for the specified AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSAccount withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The email address associated with the specified AWS account.
     * </p>
     * 
     * @param emailAddress
     *        The email address associated with the specified AWS account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address associated with the specified AWS account.
     * </p>
     * 
     * @return The email address associated with the specified AWS account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address associated with the specified AWS account.
     * </p>
     * 
     * @param emailAddress
     *        The email address associated with the specified AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSAccount withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The name of the specified AWS account.
     * </p>
     * 
     * @param name
     *        The name of the specified AWS account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified AWS account.
     * </p>
     * 
     * @return The name of the specified AWS account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified AWS account.
     * </p>
     * 
     * @param name
     *        The name of the specified AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSAccount withName(String name) {
        setName(name);
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AWSAccount == false)
            return false;
        AWSAccount other = (AWSAccount) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AWSAccount clone() {
        try {
            return (AWSAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AWSAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
