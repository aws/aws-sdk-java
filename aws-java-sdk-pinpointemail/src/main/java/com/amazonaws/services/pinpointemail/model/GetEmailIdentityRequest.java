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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to return details about an email identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetEmailIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEmailIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email identity that you want to retrieve details for.
     * </p>
     */
    private String emailIdentity;

    /**
     * <p>
     * The email identity that you want to retrieve details for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to retrieve details for.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to retrieve details for.
     * </p>
     * 
     * @return The email identity that you want to retrieve details for.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to retrieve details for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to retrieve details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEmailIdentityRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEmailIdentityRequest == false)
            return false;
        GetEmailIdentityRequest other = (GetEmailIdentityRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        return hashCode;
    }

    @Override
    public GetEmailIdentityRequest clone() {
        return (GetEmailIdentityRequest) super.clone();
    }

}
