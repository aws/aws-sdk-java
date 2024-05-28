/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Windows user details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/WindowsUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WindowsUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The password ARN for the Windows user.
     * </p>
     */
    private String passwordArn;
    /**
     * <p>
     * The user.
     * </p>
     */
    private String user;

    /**
     * <p>
     * The password ARN for the Windows user.
     * </p>
     * 
     * @param passwordArn
     *        The password ARN for the Windows user.
     */

    public void setPasswordArn(String passwordArn) {
        this.passwordArn = passwordArn;
    }

    /**
     * <p>
     * The password ARN for the Windows user.
     * </p>
     * 
     * @return The password ARN for the Windows user.
     */

    public String getPasswordArn() {
        return this.passwordArn;
    }

    /**
     * <p>
     * The password ARN for the Windows user.
     * </p>
     * 
     * @param passwordArn
     *        The password ARN for the Windows user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsUser withPasswordArn(String passwordArn) {
        setPasswordArn(passwordArn);
        return this;
    }

    /**
     * <p>
     * The user.
     * </p>
     * 
     * @param user
     *        The user.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user.
     * </p>
     * 
     * @return The user.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user.
     * </p>
     * 
     * @param user
     *        The user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsUser withUser(String user) {
        setUser(user);
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
        if (getPasswordArn() != null)
            sb.append("PasswordArn: ").append(getPasswordArn()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WindowsUser == false)
            return false;
        WindowsUser other = (WindowsUser) obj;
        if (other.getPasswordArn() == null ^ this.getPasswordArn() == null)
            return false;
        if (other.getPasswordArn() != null && other.getPasswordArn().equals(this.getPasswordArn()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPasswordArn() == null) ? 0 : getPasswordArn().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public WindowsUser clone() {
        try {
            return (WindowsUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.WindowsUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
