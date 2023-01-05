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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about registering an Identity and Access Management (IAM) resource so Amazon Web Services IoT FleetWise
 * edge agent software can transfer your vehicle data to Amazon Timestream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/IamRegistrationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IamRegistrationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to register.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     * <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     */
    private String registrationStatus;
    /**
     * <p>
     * A message associated with a registration error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to register.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to register.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to register.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to register.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to register.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamRegistrationResponse withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     * <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @param registrationStatus
     *        The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     *        <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @see RegistrationStatus
     */

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * <p>
     * The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     * <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @return The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     *         <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @see RegistrationStatus
     */

    public String getRegistrationStatus() {
        return this.registrationStatus;
    }

    /**
     * <p>
     * The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     * <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @param registrationStatus
     *        The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     *        <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public IamRegistrationResponse withRegistrationStatus(String registrationStatus) {
        setRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * <p>
     * The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     * <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @param registrationStatus
     *        The status of registering your IAM resource. The status can be one of <code>REGISTRATION_SUCCESS</code>,
     *        <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public IamRegistrationResponse withRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message associated with a registration error.
     * </p>
     * 
     * @param errorMessage
     *        A message associated with a registration error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message associated with a registration error.
     * </p>
     * 
     * @return A message associated with a registration error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message associated with a registration error.
     * </p>
     * 
     * @param errorMessage
     *        A message associated with a registration error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamRegistrationResponse withErrorMessage(String errorMessage) {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRegistrationStatus() != null)
            sb.append("RegistrationStatus: ").append(getRegistrationStatus()).append(",");
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

        if (obj instanceof IamRegistrationResponse == false)
            return false;
        IamRegistrationResponse other = (IamRegistrationResponse) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRegistrationStatus() == null ^ this.getRegistrationStatus() == null)
            return false;
        if (other.getRegistrationStatus() != null && other.getRegistrationStatus().equals(this.getRegistrationStatus()) == false)
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

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public IamRegistrationResponse clone() {
        try {
            return (IamRegistrationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.IamRegistrationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
