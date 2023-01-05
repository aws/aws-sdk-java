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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/RegisterAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * </p>
     */
    private String registerAccountStatus;

    private TimestreamResources timestreamResources;
    /**
     * <p>
     * The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     */
    private IamResources iamResources;
    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * </p>
     * 
     * @param registerAccountStatus
     *        The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * @see RegistrationStatus
     */

    public void setRegisterAccountStatus(String registerAccountStatus) {
        this.registerAccountStatus = registerAccountStatus;
    }

    /**
     * <p>
     * The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * </p>
     * 
     * @return The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * @see RegistrationStatus
     */

    public String getRegisterAccountStatus() {
        return this.registerAccountStatus;
    }

    /**
     * <p>
     * The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * </p>
     * 
     * @param registerAccountStatus
     *        The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public RegisterAccountResult withRegisterAccountStatus(String registerAccountStatus) {
        setRegisterAccountStatus(registerAccountStatus);
        return this;
    }

    /**
     * <p>
     * The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * </p>
     * 
     * @param registerAccountStatus
     *        The status of registering your Amazon Web Services account, IAM role, and Timestream resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public RegisterAccountResult withRegisterAccountStatus(RegistrationStatus registerAccountStatus) {
        this.registerAccountStatus = registerAccountStatus.toString();
        return this;
    }

    /**
     * @param timestreamResources
     */

    public void setTimestreamResources(TimestreamResources timestreamResources) {
        this.timestreamResources = timestreamResources;
    }

    /**
     * @return
     */

    public TimestreamResources getTimestreamResources() {
        return this.timestreamResources;
    }

    /**
     * @param timestreamResources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAccountResult withTimestreamResources(TimestreamResources timestreamResources) {
        setTimestreamResources(timestreamResources);
        return this;
    }

    /**
     * <p>
     * The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     * 
     * @param iamResources
     *        The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon
     *        Timestream.
     */

    public void setIamResources(IamResources iamResources) {
        this.iamResources = iamResources;
    }

    /**
     * <p>
     * The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     * 
     * @return The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon
     *         Timestream.
     */

    public IamResources getIamResources() {
        return this.iamResources;
    }

    /**
     * <p>
     * The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     * 
     * @param iamResources
     *        The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon
     *        Timestream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAccountResult withIamResources(IamResources iamResources) {
        setIamResources(iamResources);
        return this;
    }

    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAccountResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *         time).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAccountResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getRegisterAccountStatus() != null)
            sb.append("RegisterAccountStatus: ").append(getRegisterAccountStatus()).append(",");
        if (getTimestreamResources() != null)
            sb.append("TimestreamResources: ").append(getTimestreamResources()).append(",");
        if (getIamResources() != null)
            sb.append("IamResources: ").append(getIamResources()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterAccountResult == false)
            return false;
        RegisterAccountResult other = (RegisterAccountResult) obj;
        if (other.getRegisterAccountStatus() == null ^ this.getRegisterAccountStatus() == null)
            return false;
        if (other.getRegisterAccountStatus() != null && other.getRegisterAccountStatus().equals(this.getRegisterAccountStatus()) == false)
            return false;
        if (other.getTimestreamResources() == null ^ this.getTimestreamResources() == null)
            return false;
        if (other.getTimestreamResources() != null && other.getTimestreamResources().equals(this.getTimestreamResources()) == false)
            return false;
        if (other.getIamResources() == null ^ this.getIamResources() == null)
            return false;
        if (other.getIamResources() != null && other.getIamResources().equals(this.getIamResources()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegisterAccountStatus() == null) ? 0 : getRegisterAccountStatus().hashCode());
        hashCode = prime * hashCode + ((getTimestreamResources() == null) ? 0 : getTimestreamResources().hashCode());
        hashCode = prime * hashCode + ((getIamResources() == null) ? 0 : getIamResources().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public RegisterAccountResult clone() {
        try {
            return (RegisterAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
