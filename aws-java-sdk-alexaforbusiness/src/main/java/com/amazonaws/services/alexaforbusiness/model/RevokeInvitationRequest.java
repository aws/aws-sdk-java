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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RevokeInvitation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the user for whom to revoke an enrollment invitation. Required.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The ARN of the enrollment invitation to revoke. Required.
     * </p>
     */
    private String enrollmentId;

    /**
     * <p>
     * The ARN of the user for whom to revoke an enrollment invitation. Required.
     * </p>
     * 
     * @param userArn
     *        The ARN of the user for whom to revoke an enrollment invitation. Required.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The ARN of the user for whom to revoke an enrollment invitation. Required.
     * </p>
     * 
     * @return The ARN of the user for whom to revoke an enrollment invitation. Required.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The ARN of the user for whom to revoke an enrollment invitation. Required.
     * </p>
     * 
     * @param userArn
     *        The ARN of the user for whom to revoke an enrollment invitation. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeInvitationRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the enrollment invitation to revoke. Required.
     * </p>
     * 
     * @param enrollmentId
     *        The ARN of the enrollment invitation to revoke. Required.
     */

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * <p>
     * The ARN of the enrollment invitation to revoke. Required.
     * </p>
     * 
     * @return The ARN of the enrollment invitation to revoke. Required.
     */

    public String getEnrollmentId() {
        return this.enrollmentId;
    }

    /**
     * <p>
     * The ARN of the enrollment invitation to revoke. Required.
     * </p>
     * 
     * @param enrollmentId
     *        The ARN of the enrollment invitation to revoke. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeInvitationRequest withEnrollmentId(String enrollmentId) {
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

        if (obj instanceof RevokeInvitationRequest == false)
            return false;
        RevokeInvitationRequest other = (RevokeInvitationRequest) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
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
        hashCode = prime * hashCode + ((getEnrollmentId() == null) ? 0 : getEnrollmentId().hashCode());
        return hashCode;
    }

    @Override
    public RevokeInvitationRequest clone() {
        return (RevokeInvitationRequest) super.clone();
    }

}
