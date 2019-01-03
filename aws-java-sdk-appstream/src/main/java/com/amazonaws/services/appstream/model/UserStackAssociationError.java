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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the error that is returned when a user can’t be associated with or disassociated from a stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UserStackAssociationError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserStackAssociationError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the user and associated stack.
     * </p>
     */
    private UserStackAssociation userStackAssociation;
    /**
     * <p>
     * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message for the error that is returned when a user can’t be associated with or disassociated from a
     * stack.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Information about the user and associated stack.
     * </p>
     * 
     * @param userStackAssociation
     *        Information about the user and associated stack.
     */

    public void setUserStackAssociation(UserStackAssociation userStackAssociation) {
        this.userStackAssociation = userStackAssociation;
    }

    /**
     * <p>
     * Information about the user and associated stack.
     * </p>
     * 
     * @return Information about the user and associated stack.
     */

    public UserStackAssociation getUserStackAssociation() {
        return this.userStackAssociation;
    }

    /**
     * <p>
     * Information about the user and associated stack.
     * </p>
     * 
     * @param userStackAssociation
     *        Information about the user and associated stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStackAssociationError withUserStackAssociation(UserStackAssociation userStackAssociation) {
        setUserStackAssociation(userStackAssociation);
        return this;
    }

    /**
     * <p>
     * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
     * </p>
     * 
     * @param errorCode
     *        The error code for the error that is returned when a user can’t be associated with or disassociated from a
     *        stack.
     * @see UserStackAssociationErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
     * </p>
     * 
     * @return The error code for the error that is returned when a user can’t be associated with or disassociated from
     *         a stack.
     * @see UserStackAssociationErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
     * </p>
     * 
     * @param errorCode
     *        The error code for the error that is returned when a user can’t be associated with or disassociated from a
     *        stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStackAssociationErrorCode
     */

    public UserStackAssociationError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
     * </p>
     * 
     * @param errorCode
     *        The error code for the error that is returned when a user can’t be associated with or disassociated from a
     *        stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStackAssociationErrorCode
     */

    public UserStackAssociationError withErrorCode(UserStackAssociationErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The error message for the error that is returned when a user can’t be associated with or disassociated from a
     * stack.
     * </p>
     * 
     * @param errorMessage
     *        The error message for the error that is returned when a user can’t be associated with or disassociated
     *        from a stack.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message for the error that is returned when a user can’t be associated with or disassociated from a
     * stack.
     * </p>
     * 
     * @return The error message for the error that is returned when a user can’t be associated with or disassociated
     *         from a stack.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message for the error that is returned when a user can’t be associated with or disassociated from a
     * stack.
     * </p>
     * 
     * @param errorMessage
     *        The error message for the error that is returned when a user can’t be associated with or disassociated
     *        from a stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStackAssociationError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getUserStackAssociation() != null)
            sb.append("UserStackAssociation: ").append(getUserStackAssociation()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserStackAssociationError == false)
            return false;
        UserStackAssociationError other = (UserStackAssociationError) obj;
        if (other.getUserStackAssociation() == null ^ this.getUserStackAssociation() == null)
            return false;
        if (other.getUserStackAssociation() != null && other.getUserStackAssociation().equals(this.getUserStackAssociation()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserStackAssociation() == null) ? 0 : getUserStackAssociation().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public UserStackAssociationError clone() {
        try {
            return (UserStackAssociationError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.UserStackAssociationErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
