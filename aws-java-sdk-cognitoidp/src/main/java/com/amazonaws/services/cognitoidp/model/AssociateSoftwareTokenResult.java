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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AssociateSoftwareToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateSoftwareTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
     * </p>
     */
    private String secretCode;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     */
    private String session;

    /**
     * <p>
     * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
     * </p>
     * 
     * @param secretCode
     *        A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
     */

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    /**
     * <p>
     * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
     * </p>
     * 
     * @return A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
     */

    public String getSecretCode() {
        return this.secretCode;
    }

    /**
     * <p>
     * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
     * </p>
     * 
     * @param secretCode
     *        A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSoftwareTokenResult withSecretCode(String secretCode) {
        setSecretCode(secretCode);
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. This allows
     *        authentication of the user as part of the MFA setup process.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service. This allows
     *         authentication of the user as part of the MFA setup process.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. This allows
     *        authentication of the user as part of the MFA setup process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSoftwareTokenResult withSession(String session) {
        setSession(session);
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
        if (getSecretCode() != null)
            sb.append("SecretCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSoftwareTokenResult == false)
            return false;
        AssociateSoftwareTokenResult other = (AssociateSoftwareTokenResult) obj;
        if (other.getSecretCode() == null ^ this.getSecretCode() == null)
            return false;
        if (other.getSecretCode() != null && other.getSecretCode().equals(this.getSecretCode()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretCode() == null) ? 0 : getSecretCode().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        return hashCode;
    }

    @Override
    public AssociateSoftwareTokenResult clone() {
        try {
            return (AssociateSoftwareTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
