/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an account-related request that hasn't been processed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UnprocessedAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedAccount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID for the account that the request applies to.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The source of the issue or delay in processing the request.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The reason why the request hasn't been processed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The Amazon Web Services account ID for the account that the request applies to.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the account that the request applies to.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account that the request applies to.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the account that the request applies to.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account that the request applies to.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the account that the request applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAccount withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The source of the issue or delay in processing the request.
     * </p>
     * 
     * @param errorCode
     *        The source of the issue or delay in processing the request.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The source of the issue or delay in processing the request.
     * </p>
     * 
     * @return The source of the issue or delay in processing the request.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The source of the issue or delay in processing the request.
     * </p>
     * 
     * @param errorCode
     *        The source of the issue or delay in processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public UnprocessedAccount withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The source of the issue or delay in processing the request.
     * </p>
     * 
     * @param errorCode
     *        The source of the issue or delay in processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public UnprocessedAccount withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the request hasn't been processed.
     * </p>
     * 
     * @param errorMessage
     *        The reason why the request hasn't been processed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The reason why the request hasn't been processed.
     * </p>
     * 
     * @return The reason why the request hasn't been processed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The reason why the request hasn't been processed.
     * </p>
     * 
     * @param errorMessage
     *        The reason why the request hasn't been processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAccount withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedAccount == false)
            return false;
        UnprocessedAccount other = (UnprocessedAccount) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedAccount clone() {
        try {
            return (UnprocessedAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UnprocessedAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
