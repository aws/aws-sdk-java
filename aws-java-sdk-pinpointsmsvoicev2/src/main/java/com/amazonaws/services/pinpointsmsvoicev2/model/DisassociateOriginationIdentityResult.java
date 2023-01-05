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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateOriginationIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateOriginationIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool.
     * </p>
     */
    private String poolArn;
    /**
     * <p>
     * The PoolId of the pool no longer associated with the origination identity.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The PhoneNumberArn or SenderIdArn of the origination identity.
     * </p>
     */
    private String originationIdentityArn;
    /**
     * <p>
     * The PhoneNumberId or SenderId of the origination identity.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     */
    private String isoCountryCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) of the pool.
     */

    public void setPoolArn(String poolArn) {
        this.poolArn = poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pool.
     */

    public String getPoolArn() {
        return this.poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pool.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) of the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateOriginationIdentityResult withPoolArn(String poolArn) {
        setPoolArn(poolArn);
        return this;
    }

    /**
     * <p>
     * The PoolId of the pool no longer associated with the origination identity.
     * </p>
     * 
     * @param poolId
     *        The PoolId of the pool no longer associated with the origination identity.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The PoolId of the pool no longer associated with the origination identity.
     * </p>
     * 
     * @return The PoolId of the pool no longer associated with the origination identity.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The PoolId of the pool no longer associated with the origination identity.
     * </p>
     * 
     * @param poolId
     *        The PoolId of the pool no longer associated with the origination identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateOriginationIdentityResult withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The PhoneNumberArn or SenderIdArn of the origination identity.
     * </p>
     * 
     * @param originationIdentityArn
     *        The PhoneNumberArn or SenderIdArn of the origination identity.
     */

    public void setOriginationIdentityArn(String originationIdentityArn) {
        this.originationIdentityArn = originationIdentityArn;
    }

    /**
     * <p>
     * The PhoneNumberArn or SenderIdArn of the origination identity.
     * </p>
     * 
     * @return The PhoneNumberArn or SenderIdArn of the origination identity.
     */

    public String getOriginationIdentityArn() {
        return this.originationIdentityArn;
    }

    /**
     * <p>
     * The PhoneNumberArn or SenderIdArn of the origination identity.
     * </p>
     * 
     * @param originationIdentityArn
     *        The PhoneNumberArn or SenderIdArn of the origination identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateOriginationIdentityResult withOriginationIdentityArn(String originationIdentityArn) {
        setOriginationIdentityArn(originationIdentityArn);
        return this;
    }

    /**
     * <p>
     * The PhoneNumberId or SenderId of the origination identity.
     * </p>
     * 
     * @param originationIdentity
     *        The PhoneNumberId or SenderId of the origination identity.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The PhoneNumberId or SenderId of the origination identity.
     * </p>
     * 
     * @return The PhoneNumberId or SenderId of the origination identity.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The PhoneNumberId or SenderId of the origination identity.
     * </p>
     * 
     * @param originationIdentity
     *        The PhoneNumberId or SenderId of the origination identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateOriginationIdentityResult withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateOriginationIdentityResult withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
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
        if (getPoolArn() != null)
            sb.append("PoolArn: ").append(getPoolArn()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getOriginationIdentityArn() != null)
            sb.append("OriginationIdentityArn: ").append(getOriginationIdentityArn()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateOriginationIdentityResult == false)
            return false;
        DisassociateOriginationIdentityResult other = (DisassociateOriginationIdentityResult) obj;
        if (other.getPoolArn() == null ^ this.getPoolArn() == null)
            return false;
        if (other.getPoolArn() != null && other.getPoolArn().equals(this.getPoolArn()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getOriginationIdentityArn() == null ^ this.getOriginationIdentityArn() == null)
            return false;
        if (other.getOriginationIdentityArn() != null && other.getOriginationIdentityArn().equals(this.getOriginationIdentityArn()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolArn() == null) ? 0 : getPoolArn().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentityArn() == null) ? 0 : getOriginationIdentityArn().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateOriginationIdentityResult clone() {
        try {
            return (DisassociateOriginationIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
