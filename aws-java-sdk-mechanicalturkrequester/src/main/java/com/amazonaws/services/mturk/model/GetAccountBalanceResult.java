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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetAccountBalance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountBalanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String availableBalance;

    private String onHoldBalance;

    /**
     * @param availableBalance
     */

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * @return
     */

    public String getAvailableBalance() {
        return this.availableBalance;
    }

    /**
     * @param availableBalance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountBalanceResult withAvailableBalance(String availableBalance) {
        setAvailableBalance(availableBalance);
        return this;
    }

    /**
     * @param onHoldBalance
     */

    public void setOnHoldBalance(String onHoldBalance) {
        this.onHoldBalance = onHoldBalance;
    }

    /**
     * @return
     */

    public String getOnHoldBalance() {
        return this.onHoldBalance;
    }

    /**
     * @param onHoldBalance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountBalanceResult withOnHoldBalance(String onHoldBalance) {
        setOnHoldBalance(onHoldBalance);
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
        if (getAvailableBalance() != null)
            sb.append("AvailableBalance: ").append(getAvailableBalance()).append(",");
        if (getOnHoldBalance() != null)
            sb.append("OnHoldBalance: ").append(getOnHoldBalance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountBalanceResult == false)
            return false;
        GetAccountBalanceResult other = (GetAccountBalanceResult) obj;
        if (other.getAvailableBalance() == null ^ this.getAvailableBalance() == null)
            return false;
        if (other.getAvailableBalance() != null && other.getAvailableBalance().equals(this.getAvailableBalance()) == false)
            return false;
        if (other.getOnHoldBalance() == null ^ this.getOnHoldBalance() == null)
            return false;
        if (other.getOnHoldBalance() != null && other.getOnHoldBalance().equals(this.getOnHoldBalance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailableBalance() == null) ? 0 : getAvailableBalance().hashCode());
        hashCode = prime * hashCode + ((getOnHoldBalance() == null) ? 0 : getOnHoldBalance().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountBalanceResult clone() {
        try {
            return (GetAccountBalanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
