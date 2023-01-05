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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an error received while accessing free trail data for an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/FreeTrialInfoError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeTrialInfoError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account associated with the Amazon Inspector free trial information.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The error code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The error message returned.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The account associated with the Amazon Inspector free trial information.
     * </p>
     * 
     * @param accountId
     *        The account associated with the Amazon Inspector free trial information.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account associated with the Amazon Inspector free trial information.
     * </p>
     * 
     * @return The account associated with the Amazon Inspector free trial information.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account associated with the Amazon Inspector free trial information.
     * </p>
     * 
     * @param accountId
     *        The account associated with the Amazon Inspector free trial information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTrialInfoError withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @see FreeTrialInfoErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     * @see FreeTrialInfoErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialInfoErrorCode
     */

    public FreeTrialInfoError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialInfoErrorCode
     */

    public FreeTrialInfoError withCode(FreeTrialInfoErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The error message returned.
     * </p>
     * 
     * @param message
     *        The error message returned.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message returned.
     * </p>
     * 
     * @return The error message returned.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message returned.
     * </p>
     * 
     * @param message
     *        The error message returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTrialInfoError withMessage(String message) {
        setMessage(message);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeTrialInfoError == false)
            return false;
        FreeTrialInfoError other = (FreeTrialInfoError) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public FreeTrialInfoError clone() {
        try {
            return (FreeTrialInfoError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FreeTrialInfoErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
