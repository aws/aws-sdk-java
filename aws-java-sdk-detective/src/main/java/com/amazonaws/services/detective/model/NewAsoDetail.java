/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details new Autonomous System Organizations (ASOs) used either at the resource or account level.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/NewAsoDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewAsoDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the new Autonomous System Organization (ASO).
     * </p>
     */
    private String aso;
    /**
     * <p>
     * Checks if the Autonomous System Organization (ASO) is new for the entire account.
     * </p>
     */
    private Boolean isNewForEntireAccount;

    /**
     * <p>
     * Details about the new Autonomous System Organization (ASO).
     * </p>
     * 
     * @param aso
     *        Details about the new Autonomous System Organization (ASO).
     */

    public void setAso(String aso) {
        this.aso = aso;
    }

    /**
     * <p>
     * Details about the new Autonomous System Organization (ASO).
     * </p>
     * 
     * @return Details about the new Autonomous System Organization (ASO).
     */

    public String getAso() {
        return this.aso;
    }

    /**
     * <p>
     * Details about the new Autonomous System Organization (ASO).
     * </p>
     * 
     * @param aso
     *        Details about the new Autonomous System Organization (ASO).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAsoDetail withAso(String aso) {
        setAso(aso);
        return this;
    }

    /**
     * <p>
     * Checks if the Autonomous System Organization (ASO) is new for the entire account.
     * </p>
     * 
     * @param isNewForEntireAccount
     *        Checks if the Autonomous System Organization (ASO) is new for the entire account.
     */

    public void setIsNewForEntireAccount(Boolean isNewForEntireAccount) {
        this.isNewForEntireAccount = isNewForEntireAccount;
    }

    /**
     * <p>
     * Checks if the Autonomous System Organization (ASO) is new for the entire account.
     * </p>
     * 
     * @return Checks if the Autonomous System Organization (ASO) is new for the entire account.
     */

    public Boolean getIsNewForEntireAccount() {
        return this.isNewForEntireAccount;
    }

    /**
     * <p>
     * Checks if the Autonomous System Organization (ASO) is new for the entire account.
     * </p>
     * 
     * @param isNewForEntireAccount
     *        Checks if the Autonomous System Organization (ASO) is new for the entire account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewAsoDetail withIsNewForEntireAccount(Boolean isNewForEntireAccount) {
        setIsNewForEntireAccount(isNewForEntireAccount);
        return this;
    }

    /**
     * <p>
     * Checks if the Autonomous System Organization (ASO) is new for the entire account.
     * </p>
     * 
     * @return Checks if the Autonomous System Organization (ASO) is new for the entire account.
     */

    public Boolean isNewForEntireAccount() {
        return this.isNewForEntireAccount;
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
        if (getAso() != null)
            sb.append("Aso: ").append(getAso()).append(",");
        if (getIsNewForEntireAccount() != null)
            sb.append("IsNewForEntireAccount: ").append(getIsNewForEntireAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewAsoDetail == false)
            return false;
        NewAsoDetail other = (NewAsoDetail) obj;
        if (other.getAso() == null ^ this.getAso() == null)
            return false;
        if (other.getAso() != null && other.getAso().equals(this.getAso()) == false)
            return false;
        if (other.getIsNewForEntireAccount() == null ^ this.getIsNewForEntireAccount() == null)
            return false;
        if (other.getIsNewForEntireAccount() != null && other.getIsNewForEntireAccount().equals(this.getIsNewForEntireAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAso() == null) ? 0 : getAso().hashCode());
        hashCode = prime * hashCode + ((getIsNewForEntireAccount() == null) ? 0 : getIsNewForEntireAccount().hashCode());
        return hashCode;
    }

    @Override
    public NewAsoDetail clone() {
        try {
            return (NewAsoDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.NewAsoDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
