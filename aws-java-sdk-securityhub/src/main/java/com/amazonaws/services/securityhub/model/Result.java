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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The account details that could not be processed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Result" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Result implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ID of the AWS account that could not be processed.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The reason for why an account could not be processed.
     * </p>
     */
    private String processingResult;

    /**
     * <p>
     * An ID of the AWS account that could not be processed.
     * </p>
     * 
     * @param accountId
     *        An ID of the AWS account that could not be processed.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * An ID of the AWS account that could not be processed.
     * </p>
     * 
     * @return An ID of the AWS account that could not be processed.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * An ID of the AWS account that could not be processed.
     * </p>
     * 
     * @param accountId
     *        An ID of the AWS account that could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The reason for why an account could not be processed.
     * </p>
     * 
     * @param processingResult
     *        The reason for why an account could not be processed.
     */

    public void setProcessingResult(String processingResult) {
        this.processingResult = processingResult;
    }

    /**
     * <p>
     * The reason for why an account could not be processed.
     * </p>
     * 
     * @return The reason for why an account could not be processed.
     */

    public String getProcessingResult() {
        return this.processingResult;
    }

    /**
     * <p>
     * The reason for why an account could not be processed.
     * </p>
     * 
     * @param processingResult
     *        The reason for why an account could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result withProcessingResult(String processingResult) {
        setProcessingResult(processingResult);
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
        if (getProcessingResult() != null)
            sb.append("ProcessingResult: ").append(getProcessingResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Result == false)
            return false;
        Result other = (Result) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getProcessingResult() == null ^ this.getProcessingResult() == null)
            return false;
        if (other.getProcessingResult() != null && other.getProcessingResult().equals(this.getProcessingResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getProcessingResult() == null) ? 0 : getProcessingResult().hashCode());
        return hashCode;
    }

    @Override
    public Result clone() {
        try {
            return (Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
