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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPartnerAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPartnerAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     */
    private SidewalkAccountInfoWithFingerprint sidewalk;
    /**
     * <p>
     * Whether the partner account is linked to the AWS account.
     * </p>
     */
    private Boolean accountLinked;

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.
     */

    public void setSidewalk(SidewalkAccountInfoWithFingerprint sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @return The Sidewalk account credentials.
     */

    public SidewalkAccountInfoWithFingerprint getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartnerAccountResult withSidewalk(SidewalkAccountInfoWithFingerprint sidewalk) {
        setSidewalk(sidewalk);
        return this;
    }

    /**
     * <p>
     * Whether the partner account is linked to the AWS account.
     * </p>
     * 
     * @param accountLinked
     *        Whether the partner account is linked to the AWS account.
     */

    public void setAccountLinked(Boolean accountLinked) {
        this.accountLinked = accountLinked;
    }

    /**
     * <p>
     * Whether the partner account is linked to the AWS account.
     * </p>
     * 
     * @return Whether the partner account is linked to the AWS account.
     */

    public Boolean getAccountLinked() {
        return this.accountLinked;
    }

    /**
     * <p>
     * Whether the partner account is linked to the AWS account.
     * </p>
     * 
     * @param accountLinked
     *        Whether the partner account is linked to the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartnerAccountResult withAccountLinked(Boolean accountLinked) {
        setAccountLinked(accountLinked);
        return this;
    }

    /**
     * <p>
     * Whether the partner account is linked to the AWS account.
     * </p>
     * 
     * @return Whether the partner account is linked to the AWS account.
     */

    public Boolean isAccountLinked() {
        return this.accountLinked;
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
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk()).append(",");
        if (getAccountLinked() != null)
            sb.append("AccountLinked: ").append(getAccountLinked());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPartnerAccountResult == false)
            return false;
        GetPartnerAccountResult other = (GetPartnerAccountResult) obj;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        if (other.getAccountLinked() == null ^ this.getAccountLinked() == null)
            return false;
        if (other.getAccountLinked() != null && other.getAccountLinked().equals(this.getAccountLinked()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        hashCode = prime * hashCode + ((getAccountLinked() == null) ? 0 : getAccountLinked().hashCode());
        return hashCode;
    }

    @Override
    public GetPartnerAccountResult clone() {
        try {
            return (GetPartnerAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
