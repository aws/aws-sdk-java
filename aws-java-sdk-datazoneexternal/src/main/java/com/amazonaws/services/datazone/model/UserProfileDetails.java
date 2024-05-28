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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the user profile in Amazon DataZone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UserProfileDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserProfileDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM details included in the user profile details.
     * </p>
     */
    private IamUserProfileDetails iam;
    /**
     * <p>
     * The single sign-on details included in the user profile details.
     * </p>
     */
    private SsoUserProfileDetails sso;

    /**
     * <p>
     * The IAM details included in the user profile details.
     * </p>
     * 
     * @param iam
     *        The IAM details included in the user profile details.
     */

    public void setIam(IamUserProfileDetails iam) {
        this.iam = iam;
    }

    /**
     * <p>
     * The IAM details included in the user profile details.
     * </p>
     * 
     * @return The IAM details included in the user profile details.
     */

    public IamUserProfileDetails getIam() {
        return this.iam;
    }

    /**
     * <p>
     * The IAM details included in the user profile details.
     * </p>
     * 
     * @param iam
     *        The IAM details included in the user profile details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserProfileDetails withIam(IamUserProfileDetails iam) {
        setIam(iam);
        return this;
    }

    /**
     * <p>
     * The single sign-on details included in the user profile details.
     * </p>
     * 
     * @param sso
     *        The single sign-on details included in the user profile details.
     */

    public void setSso(SsoUserProfileDetails sso) {
        this.sso = sso;
    }

    /**
     * <p>
     * The single sign-on details included in the user profile details.
     * </p>
     * 
     * @return The single sign-on details included in the user profile details.
     */

    public SsoUserProfileDetails getSso() {
        return this.sso;
    }

    /**
     * <p>
     * The single sign-on details included in the user profile details.
     * </p>
     * 
     * @param sso
     *        The single sign-on details included in the user profile details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserProfileDetails withSso(SsoUserProfileDetails sso) {
        setSso(sso);
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
        if (getIam() != null)
            sb.append("Iam: ").append(getIam()).append(",");
        if (getSso() != null)
            sb.append("Sso: ").append(getSso());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserProfileDetails == false)
            return false;
        UserProfileDetails other = (UserProfileDetails) obj;
        if (other.getIam() == null ^ this.getIam() == null)
            return false;
        if (other.getIam() != null && other.getIam().equals(this.getIam()) == false)
            return false;
        if (other.getSso() == null ^ this.getSso() == null)
            return false;
        if (other.getSso() != null && other.getSso().equals(this.getSso()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIam() == null) ? 0 : getIam().hashCode());
        hashCode = prime * hashCode + ((getSso() == null) ? 0 : getSso().hashCode());
        return hashCode;
    }

    @Override
    public UserProfileDetails clone() {
        try {
            return (UserProfileDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.UserProfileDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
