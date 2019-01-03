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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information related to a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UserData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a user.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The first name of a user.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of a user.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The email of a user.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     */
    private String enrollmentStatus;
    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     */
    private String enrollmentId;

    /**
     * <p>
     * The ARN of a user.
     * </p>
     * 
     * @param userArn
     *        The ARN of a user.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The ARN of a user.
     * </p>
     * 
     * @return The ARN of a user.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The ARN of a user.
     * </p>
     * 
     * @param userArn
     *        The ARN of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The first name of a user.
     * </p>
     * 
     * @param firstName
     *        The first name of a user.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of a user.
     * </p>
     * 
     * @return The first name of a user.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of a user.
     * </p>
     * 
     * @param firstName
     *        The first name of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of a user.
     * </p>
     * 
     * @param lastName
     *        The last name of a user.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of a user.
     * </p>
     * 
     * @return The last name of a user.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of a user.
     * </p>
     * 
     * @param lastName
     *        The last name of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The email of a user.
     * </p>
     * 
     * @param email
     *        The email of a user.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of a user.
     * </p>
     * 
     * @return The email of a user.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of a user.
     * </p>
     * 
     * @param email
     *        The email of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * 
     * @param enrollmentStatus
     *        The enrollment status of a user.
     * @see EnrollmentStatus
     */

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * 
     * @return The enrollment status of a user.
     * @see EnrollmentStatus
     */

    public String getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * 
     * @param enrollmentStatus
     *        The enrollment status of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnrollmentStatus
     */

    public UserData withEnrollmentStatus(String enrollmentStatus) {
        setEnrollmentStatus(enrollmentStatus);
        return this;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * 
     * @param enrollmentStatus
     *        The enrollment status of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnrollmentStatus
     */

    public UserData withEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     * 
     * @param enrollmentId
     *        The enrollment ARN of a user.
     */

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     * 
     * @return The enrollment ARN of a user.
     */

    public String getEnrollmentId() {
        return this.enrollmentId;
    }

    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     * 
     * @param enrollmentId
     *        The enrollment ARN of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withEnrollmentId(String enrollmentId) {
        setEnrollmentId(enrollmentId);
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getEnrollmentStatus() != null)
            sb.append("EnrollmentStatus: ").append(getEnrollmentStatus()).append(",");
        if (getEnrollmentId() != null)
            sb.append("EnrollmentId: ").append(getEnrollmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserData == false)
            return false;
        UserData other = (UserData) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getEnrollmentStatus() == null ^ this.getEnrollmentStatus() == null)
            return false;
        if (other.getEnrollmentStatus() != null && other.getEnrollmentStatus().equals(this.getEnrollmentStatus()) == false)
            return false;
        if (other.getEnrollmentId() == null ^ this.getEnrollmentId() == null)
            return false;
        if (other.getEnrollmentId() != null && other.getEnrollmentId().equals(this.getEnrollmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getEnrollmentStatus() == null) ? 0 : getEnrollmentStatus().hashCode());
        hashCode = prime * hashCode + ((getEnrollmentId() == null) ? 0 : getEnrollmentId().hashCode());
        return hashCode;
    }

    @Override
    public UserData clone() {
        try {
            return (UserData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.UserDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
