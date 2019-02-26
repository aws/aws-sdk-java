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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of functions and amount of storage in use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AccountUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
     * </p>
     */
    private Long totalCodeSize;
    /**
     * <p>
     * The number of Lambda functions.
     * </p>
     */
    private Long functionCount;

    /**
     * <p>
     * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
     * </p>
     * 
     * @param totalCodeSize
     *        The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
     */

    public void setTotalCodeSize(Long totalCodeSize) {
        this.totalCodeSize = totalCodeSize;
    }

    /**
     * <p>
     * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
     * </p>
     * 
     * @return The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
     */

    public Long getTotalCodeSize() {
        return this.totalCodeSize;
    }

    /**
     * <p>
     * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
     * </p>
     * 
     * @param totalCodeSize
     *        The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountUsage withTotalCodeSize(Long totalCodeSize) {
        setTotalCodeSize(totalCodeSize);
        return this;
    }

    /**
     * <p>
     * The number of Lambda functions.
     * </p>
     * 
     * @param functionCount
     *        The number of Lambda functions.
     */

    public void setFunctionCount(Long functionCount) {
        this.functionCount = functionCount;
    }

    /**
     * <p>
     * The number of Lambda functions.
     * </p>
     * 
     * @return The number of Lambda functions.
     */

    public Long getFunctionCount() {
        return this.functionCount;
    }

    /**
     * <p>
     * The number of Lambda functions.
     * </p>
     * 
     * @param functionCount
     *        The number of Lambda functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountUsage withFunctionCount(Long functionCount) {
        setFunctionCount(functionCount);
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
        if (getTotalCodeSize() != null)
            sb.append("TotalCodeSize: ").append(getTotalCodeSize()).append(",");
        if (getFunctionCount() != null)
            sb.append("FunctionCount: ").append(getFunctionCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountUsage == false)
            return false;
        AccountUsage other = (AccountUsage) obj;
        if (other.getTotalCodeSize() == null ^ this.getTotalCodeSize() == null)
            return false;
        if (other.getTotalCodeSize() != null && other.getTotalCodeSize().equals(this.getTotalCodeSize()) == false)
            return false;
        if (other.getFunctionCount() == null ^ this.getFunctionCount() == null)
            return false;
        if (other.getFunctionCount() != null && other.getFunctionCount().equals(this.getFunctionCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCodeSize() == null) ? 0 : getTotalCodeSize().hashCode());
        hashCode = prime * hashCode + ((getFunctionCount() == null) ? 0 : getFunctionCount().hashCode());
        return hashCode;
    }

    @Override
    public AccountUsage clone() {
        try {
            return (AccountUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.AccountUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
