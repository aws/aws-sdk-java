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
 * Information about the Amazon Inspector free trial for an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/FreeTrialAccountInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeTrialAccountInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account associated with the Amazon Inspector free trial information.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Contains information about the Amazon Inspector free trial for an account.
     * </p>
     */
    private java.util.List<FreeTrialInfo> freeTrialInfo;

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

    public FreeTrialAccountInfo withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Contains information about the Amazon Inspector free trial for an account.
     * </p>
     * 
     * @return Contains information about the Amazon Inspector free trial for an account.
     */

    public java.util.List<FreeTrialInfo> getFreeTrialInfo() {
        return freeTrialInfo;
    }

    /**
     * <p>
     * Contains information about the Amazon Inspector free trial for an account.
     * </p>
     * 
     * @param freeTrialInfo
     *        Contains information about the Amazon Inspector free trial for an account.
     */

    public void setFreeTrialInfo(java.util.Collection<FreeTrialInfo> freeTrialInfo) {
        if (freeTrialInfo == null) {
            this.freeTrialInfo = null;
            return;
        }

        this.freeTrialInfo = new java.util.ArrayList<FreeTrialInfo>(freeTrialInfo);
    }

    /**
     * <p>
     * Contains information about the Amazon Inspector free trial for an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFreeTrialInfo(java.util.Collection)} or {@link #withFreeTrialInfo(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param freeTrialInfo
     *        Contains information about the Amazon Inspector free trial for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTrialAccountInfo withFreeTrialInfo(FreeTrialInfo... freeTrialInfo) {
        if (this.freeTrialInfo == null) {
            setFreeTrialInfo(new java.util.ArrayList<FreeTrialInfo>(freeTrialInfo.length));
        }
        for (FreeTrialInfo ele : freeTrialInfo) {
            this.freeTrialInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the Amazon Inspector free trial for an account.
     * </p>
     * 
     * @param freeTrialInfo
     *        Contains information about the Amazon Inspector free trial for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTrialAccountInfo withFreeTrialInfo(java.util.Collection<FreeTrialInfo> freeTrialInfo) {
        setFreeTrialInfo(freeTrialInfo);
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
        if (getFreeTrialInfo() != null)
            sb.append("FreeTrialInfo: ").append(getFreeTrialInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeTrialAccountInfo == false)
            return false;
        FreeTrialAccountInfo other = (FreeTrialAccountInfo) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getFreeTrialInfo() == null ^ this.getFreeTrialInfo() == null)
            return false;
        if (other.getFreeTrialInfo() != null && other.getFreeTrialInfo().equals(this.getFreeTrialInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getFreeTrialInfo() == null) ? 0 : getFreeTrialInfo().hashCode());
        return hashCode;
    }

    @Override
    public FreeTrialAccountInfo clone() {
        try {
            return (FreeTrialAccountInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FreeTrialAccountInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
