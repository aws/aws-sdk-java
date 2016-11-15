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
 * Respresents the response from the server regarding the request to reset a password.
 * </p>
 */
public class ForgotPasswordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to reset a password.
     * </p>
     */
    private CodeDeliveryDetailsType codeDeliveryDetails;

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to reset a password.
     * </p>
     * 
     * @param codeDeliveryDetails
     *        The code delivery details returned by the server in response to the request to reset a password.
     */

    public void setCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        this.codeDeliveryDetails = codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to reset a password.
     * </p>
     * 
     * @return The code delivery details returned by the server in response to the request to reset a password.
     */

    public CodeDeliveryDetailsType getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to reset a password.
     * </p>
     * 
     * @param codeDeliveryDetails
     *        The code delivery details returned by the server in response to the request to reset a password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForgotPasswordResult withCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
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

        if (obj instanceof ForgotPasswordResult == false)
            return false;
        ForgotPasswordResult other = (ForgotPasswordResult) obj;
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

        hashCode = prime * hashCode + ((getCodeDeliveryDetails() == null) ? 0 : getCodeDeliveryDetails().hashCode());
        return hashCode;
    }

    @Override
    public ForgotPasswordResult clone() {
        try {
            return (ForgotPasswordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
