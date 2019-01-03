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
 * The response from the server when the Amazon Cognito Your User Pools service makes the request to resend a
 * confirmation code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ResendConfirmationCode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResendConfirmationCodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to resend the confirmation code.
     * </p>
     */
    private CodeDeliveryDetailsType codeDeliveryDetails;

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to resend the confirmation code.
     * </p>
     * 
     * @param codeDeliveryDetails
     *        The code delivery details returned by the server in response to the request to resend the confirmation
     *        code.
     */

    public void setCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        this.codeDeliveryDetails = codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to resend the confirmation code.
     * </p>
     * 
     * @return The code delivery details returned by the server in response to the request to resend the confirmation
     *         code.
     */

    public CodeDeliveryDetailsType getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    /**
     * <p>
     * The code delivery details returned by the server in response to the request to resend the confirmation code.
     * </p>
     * 
     * @param codeDeliveryDetails
     *        The code delivery details returned by the server in response to the request to resend the confirmation
     *        code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResendConfirmationCodeResult withCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetails) {
        setCodeDeliveryDetails(codeDeliveryDetails);
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
        if (getCodeDeliveryDetails() != null)
            sb.append("CodeDeliveryDetails: ").append(getCodeDeliveryDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResendConfirmationCodeResult == false)
            return false;
        ResendConfirmationCodeResult other = (ResendConfirmationCodeResult) obj;
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
    public ResendConfirmationCodeResult clone() {
        try {
            return (ResendConfirmationCodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
