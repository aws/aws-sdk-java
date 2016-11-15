/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The response from the server for a registration request.
 * </p>
 */
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("UserConfirmed: " + getUserConfirmed() + ",");
        if (getCodeDeliveryDetails() != null)
            sb.append("CodeDeliveryDetails: " + getCodeDeliveryDetails());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserConfirmed() == null) ? 0 : getUserConfirmed().hashCode());
        hashCode = prime * hashCode + ((getCodeDeliveryDetails() == null) ? 0 : getCodeDeliveryDetails().hashCode());
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
