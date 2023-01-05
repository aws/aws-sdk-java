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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure for Dataset owner info.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DatasetOwnerInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetOwnerInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Dataset owner.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Phone number for the Dataset owner.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * Email address for the Dataset owner.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The name of the Dataset owner.
     * </p>
     * 
     * @param name
     *        The name of the Dataset owner.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Dataset owner.
     * </p>
     * 
     * @return The name of the Dataset owner.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Dataset owner.
     * </p>
     * 
     * @param name
     *        The name of the Dataset owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetOwnerInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Phone number for the Dataset owner.
     * </p>
     * 
     * @param phoneNumber
     *        Phone number for the Dataset owner.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * Phone number for the Dataset owner.
     * </p>
     * 
     * @return Phone number for the Dataset owner.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * Phone number for the Dataset owner.
     * </p>
     * 
     * @param phoneNumber
     *        Phone number for the Dataset owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetOwnerInfo withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * Email address for the Dataset owner.
     * </p>
     * 
     * @param email
     *        Email address for the Dataset owner.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Email address for the Dataset owner.
     * </p>
     * 
     * @return Email address for the Dataset owner.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Email address for the Dataset owner.
     * </p>
     * 
     * @param email
     *        Email address for the Dataset owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetOwnerInfo withEmail(String email) {
        setEmail(email);
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
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetOwnerInfo == false)
            return false;
        DatasetOwnerInfo other = (DatasetOwnerInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public DatasetOwnerInfo clone() {
        try {
            return (DatasetOwnerInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.DatasetOwnerInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
