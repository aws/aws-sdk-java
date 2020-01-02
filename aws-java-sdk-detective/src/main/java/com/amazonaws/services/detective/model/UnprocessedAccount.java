/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Detective is currently in preview.
 * </p>
 * <p>
 * A member account that was included in a request but for which the request could not be processed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UnprocessedAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedAccount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account identifier of the member account that was not processed.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The reason that the member account request could not be processed.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The AWS account identifier of the member account that was not processed.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier of the member account that was not processed.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account identifier of the member account that was not processed.
     * </p>
     * 
     * @return The AWS account identifier of the member account that was not processed.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account identifier of the member account that was not processed.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier of the member account that was not processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAccount withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The reason that the member account request could not be processed.
     * </p>
     * 
     * @param reason
     *        The reason that the member account request could not be processed.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason that the member account request could not be processed.
     * </p>
     * 
     * @return The reason that the member account request could not be processed.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason that the member account request could not be processed.
     * </p>
     * 
     * @param reason
     *        The reason that the member account request could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAccount withReason(String reason) {
        setReason(reason);
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
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
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
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
        com.amazonaws.services.detective.model.transform.UnprocessedAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
