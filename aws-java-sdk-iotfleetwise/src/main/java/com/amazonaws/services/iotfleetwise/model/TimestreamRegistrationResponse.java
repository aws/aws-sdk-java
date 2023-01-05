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
 * Information about the registered Amazon Timestream resources or errors, if any.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/TimestreamRegistrationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestreamRegistrationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     */
    private String timestreamDatabaseName;
    /**
     * <p>
     * The name of the Timestream database table.
     * </p>
     */
    private String timestreamTableName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Timestream database.
     * </p>
     */
    private String timestreamDatabaseArn;
    /**
     * <p>
     * The ARN of the Timestream database table.
     * </p>
     */
    private String timestreamTableArn;
    /**
     * <p>
     * The status of registering your Amazon Timestream resources. The status can be one of
     * <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
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
     * The name of the Timestream database.
     * </p>
     * 
     * @param timestreamDatabaseName
     *        The name of the Timestream database.
     */

    public void setTimestreamDatabaseName(String timestreamDatabaseName) {
        this.timestreamDatabaseName = timestreamDatabaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @return The name of the Timestream database.
     */

    public String getTimestreamDatabaseName() {
        return this.timestreamDatabaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param timestreamDatabaseName
     *        The name of the Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamRegistrationResponse withTimestreamDatabaseName(String timestreamDatabaseName) {
        setTimestreamDatabaseName(timestreamDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the Timestream database table.
     * </p>
     * 
     * @param timestreamTableName
     *        The name of the Timestream database table.
     */

    public void setTimestreamTableName(String timestreamTableName) {
        this.timestreamTableName = timestreamTableName;
    }

    /**
     * <p>
     * The name of the Timestream database table.
     * </p>
     * 
     * @return The name of the Timestream database table.
     */

    public String getTimestreamTableName() {
        return this.timestreamTableName;
    }

    /**
     * <p>
     * The name of the Timestream database table.
     * </p>
     * 
     * @param timestreamTableName
     *        The name of the Timestream database table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamRegistrationResponse withTimestreamTableName(String timestreamTableName) {
        setTimestreamTableName(timestreamTableName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Timestream database.
     * </p>
     * 
     * @param timestreamDatabaseArn
     *        The Amazon Resource Name (ARN) of the Timestream database.
     */

    public void setTimestreamDatabaseArn(String timestreamDatabaseArn) {
        this.timestreamDatabaseArn = timestreamDatabaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Timestream database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Timestream database.
     */

    public String getTimestreamDatabaseArn() {
        return this.timestreamDatabaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Timestream database.
     * </p>
     * 
     * @param timestreamDatabaseArn
     *        The Amazon Resource Name (ARN) of the Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamRegistrationResponse withTimestreamDatabaseArn(String timestreamDatabaseArn) {
        setTimestreamDatabaseArn(timestreamDatabaseArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Timestream database table.
     * </p>
     * 
     * @param timestreamTableArn
     *        The ARN of the Timestream database table.
     */

    public void setTimestreamTableArn(String timestreamTableArn) {
        this.timestreamTableArn = timestreamTableArn;
    }

    /**
     * <p>
     * The ARN of the Timestream database table.
     * </p>
     * 
     * @return The ARN of the Timestream database table.
     */

    public String getTimestreamTableArn() {
        return this.timestreamTableArn;
    }

    /**
     * <p>
     * The ARN of the Timestream database table.
     * </p>
     * 
     * @param timestreamTableArn
     *        The ARN of the Timestream database table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamRegistrationResponse withTimestreamTableArn(String timestreamTableArn) {
        setTimestreamTableArn(timestreamTableArn);
        return this;
    }

    /**
     * <p>
     * The status of registering your Amazon Timestream resources. The status can be one of
     * <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @param registrationStatus
     *        The status of registering your Amazon Timestream resources. The status can be one of
     *        <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @see RegistrationStatus
     */

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * <p>
     * The status of registering your Amazon Timestream resources. The status can be one of
     * <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @return The status of registering your Amazon Timestream resources. The status can be one of
     *         <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @see RegistrationStatus
     */

    public String getRegistrationStatus() {
        return this.registrationStatus;
    }

    /**
     * <p>
     * The status of registering your Amazon Timestream resources. The status can be one of
     * <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @param registrationStatus
     *        The status of registering your Amazon Timestream resources. The status can be one of
     *        <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public TimestreamRegistrationResponse withRegistrationStatus(String registrationStatus) {
        setRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * <p>
     * The status of registering your Amazon Timestream resources. The status can be one of
     * <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * </p>
     * 
     * @param registrationStatus
     *        The status of registering your Amazon Timestream resources. The status can be one of
     *        <code>REGISTRATION_SUCCESS</code>, <code>REGISTRATION_PENDING</code>, <code>REGISTRATION_FAILURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public TimestreamRegistrationResponse withRegistrationStatus(RegistrationStatus registrationStatus) {
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

    public TimestreamRegistrationResponse withErrorMessage(String errorMessage) {
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
        if (getTimestreamDatabaseName() != null)
            sb.append("TimestreamDatabaseName: ").append(getTimestreamDatabaseName()).append(",");
        if (getTimestreamTableName() != null)
            sb.append("TimestreamTableName: ").append(getTimestreamTableName()).append(",");
        if (getTimestreamDatabaseArn() != null)
            sb.append("TimestreamDatabaseArn: ").append(getTimestreamDatabaseArn()).append(",");
        if (getTimestreamTableArn() != null)
            sb.append("TimestreamTableArn: ").append(getTimestreamTableArn()).append(",");
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

        if (obj instanceof TimestreamRegistrationResponse == false)
            return false;
        TimestreamRegistrationResponse other = (TimestreamRegistrationResponse) obj;
        if (other.getTimestreamDatabaseName() == null ^ this.getTimestreamDatabaseName() == null)
            return false;
        if (other.getTimestreamDatabaseName() != null && other.getTimestreamDatabaseName().equals(this.getTimestreamDatabaseName()) == false)
            return false;
        if (other.getTimestreamTableName() == null ^ this.getTimestreamTableName() == null)
            return false;
        if (other.getTimestreamTableName() != null && other.getTimestreamTableName().equals(this.getTimestreamTableName()) == false)
            return false;
        if (other.getTimestreamDatabaseArn() == null ^ this.getTimestreamDatabaseArn() == null)
            return false;
        if (other.getTimestreamDatabaseArn() != null && other.getTimestreamDatabaseArn().equals(this.getTimestreamDatabaseArn()) == false)
            return false;
        if (other.getTimestreamTableArn() == null ^ this.getTimestreamTableArn() == null)
            return false;
        if (other.getTimestreamTableArn() != null && other.getTimestreamTableArn().equals(this.getTimestreamTableArn()) == false)
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

        hashCode = prime * hashCode + ((getTimestreamDatabaseName() == null) ? 0 : getTimestreamDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTimestreamTableName() == null) ? 0 : getTimestreamTableName().hashCode());
        hashCode = prime * hashCode + ((getTimestreamDatabaseArn() == null) ? 0 : getTimestreamDatabaseArn().hashCode());
        hashCode = prime * hashCode + ((getTimestreamTableArn() == null) ? 0 : getTimestreamTableArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public TimestreamRegistrationResponse clone() {
        try {
            return (TimestreamRegistrationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.TimestreamRegistrationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
