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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object containing the unprocessed account and a result string explaining why it was unprocessed.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnprocessedAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedAccount implements Serializable, Cloneable, StructuredPojo {

    /** AWS Account ID. */
    private String accountId;
    /** A reason why the account hasn't been processed. */
    private String result;

    /**
     * AWS Account ID.
     * 
     * @param accountId
     *        AWS Account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * AWS Account ID.
     * 
     * @return AWS Account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * AWS Account ID.
     * 
     * @param accountId
     *        AWS Account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAccount withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * A reason why the account hasn't been processed.
     * 
     * @param result
     *        A reason why the account hasn't been processed.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * A reason why the account hasn't been processed.
     * 
     * @return A reason why the account hasn't been processed.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * A reason why the account hasn't been processed.
     * 
     * @param result
     *        A reason why the account hasn't been processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAccount withResult(String result) {
        setResult(result);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
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
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.UnprocessedAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
