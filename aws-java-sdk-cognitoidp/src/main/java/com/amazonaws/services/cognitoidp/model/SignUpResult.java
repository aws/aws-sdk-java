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
 * <p>
 * The response from the server for a registration request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SignUp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignUpResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A response from the server indicating that a user registration has been confirmed.
     * </p>
     */
    private Boolean userConfirmed;
    /**
     * <p>
     * The code delivery details returned by the server response to the user registration request.
     * </p>
     */
    private CodeDeliveryDetailsType codeDeliveryDetails;
    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as <code>username</code>.
     * </p>
     */
    private String userSub;

    /**
     * <p>
     * A response from the server indicating that a user registration has been confirmed.
     * </p>
     * 
     * @param userConfirmed
     *        A response from the server indicating that a user registration has been confirmed.
     */

    public void setUserConfirmed(Boolean userConfirmed) {
        this.userConfirmed = userConfirmed;
    }

    /**
     * <p>
     * A response from the server indicating that a user registration has been confirmed.
     * </p>
     * 
     * @return A response from the server indicating that a user registration has been confirmed.
     */

    public Boolean getUserConfirmed() {
        return this.userConfirmed;
    }

    /**
     * <p>
     * A response from the server indicating that a user registration has been confirmed.
     * </p>
     * 
     * @param userConfirmed
     *        A response from the server indicating that a user registration has been confirmed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignUpResult withUserConfirmed(Boolean userConfirmed) {
        setUserConfirmed(userConfirmed);
        return this;
    }

    /**
     * <p>
     * A response from the server indicating that a user registration has been confirmed.
     * </p>
     * 
     * @return A response from the server indicating that a user registration has been confirmed.
     */

    public Boolean isUserConfirmed() {
        return this.userConfirmed;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to the user registration request.
     * </p>
     * 
     * @param codeDeliveryDetails
     *        The code delivery details returned by the server response to the user registration request.
     */

    public void setCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        this.codeDeliveryDetails = codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to the user registration request.
     * </p>
     * 
     * @return The code delivery details returned by the server response to the user registration request.
     */

    public CodeDeliveryDetailsType getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server response to the user registration request.
     * </p>
     * 
     * @param codeDeliveryDetails
     *        The code delivery details returned by the server response to the user registration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignUpResult withCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        setCodeDeliveryDetails(codeDeliveryDetails);
        return this;
    }

    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as <code>username</code>.
     * </p>
     * 
     * @param userSub
     *        The UUID of the authenticated user. This is not the same as <code>username</code>.
     */

    public void setUserSub(String userSub) {
        this.userSub = userSub;
    }

    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as <code>username</code>.
     * </p>
     * 
     * @return The UUID of the authenticated user. This is not the same as <code>username</code>.
     */

    public String getUserSub() {
        return this.userSub;
    }

    /**
     * <p>
     * The UUID of the authenticated user. This is not the same as <code>username</code>.
     * </p>
     * 
     * @param userSub
     *        The UUID of the authenticated user. This is not the same as <code>username</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignUpResult withUserSub(String userSub) {
        setUserSub(userSub);
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
        if (getUserConfirmed() != null)
            sb.append("UserConfirmed: ").append(getUserConfirmed()).append(",");
        if (getCodeDeliveryDetails() != null)
            sb.append("CodeDeliveryDetails: ").append(getCodeDeliveryDetails()).append(",");
        if (getUserSub() != null)
            sb.append("UserSub: ").append(getUserSub());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignUpResult == false)
            return false;
        SignUpResult other = (SignUpResult) obj;
        if (other.getUserConfirmed() == null ^ this.getUserConfirmed() == null)
            return false;
        if (other.getUserConfirmed() != null && other.getUserConfirmed().equals(this.getUserConfirmed()) == false)
            return false;
        if (other.getCodeDeliveryDetails() == null ^ this.getCodeDeliveryDetails() == null)
            return false;
        if (other.getCodeDeliveryDetails() != null && other.getCodeDeliveryDetails().equals(this.getCodeDeliveryDetails()) == false)
            return false;
        if (other.getUserSub() == null ^ this.getUserSub() == null)
            return false;
        if (other.getUserSub() != null && other.getUserSub().equals(this.getUserSub()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserConfirmed() == null) ? 0 : getUserConfirmed().hashCode());
        hashCode = prime * hashCode + ((getCodeDeliveryDetails() == null) ? 0 : getCodeDeliveryDetails().hashCode());
        hashCode = prime * hashCode + ((getUserSub() == null) ? 0 : getUserSub().hashCode());
        return hashCode;
    }

    @Override
    public SignUpResult clone() {
        try {
            return (SignUpResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
