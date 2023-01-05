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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Condensed information about a trust provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessTrustProviderCondensed"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessTrustProviderCondensed implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the trust provider.
     * </p>
     */
    private String verifiedAccessTrustProviderId;
    /**
     * <p>
     * The description of trust provider.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of trust provider (user- or device-based).
     * </p>
     */
    private String trustProviderType;
    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     */
    private String userTrustProviderType;
    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     */
    private String deviceTrustProviderType;

    /**
     * <p>
     * The ID of the trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the trust provider.
     */

    public void setVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        this.verifiedAccessTrustProviderId = verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the trust provider.
     * </p>
     * 
     * @return The ID of the trust provider.
     */

    public String getVerifiedAccessTrustProviderId() {
        return this.verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProviderCondensed withVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        setVerifiedAccessTrustProviderId(verifiedAccessTrustProviderId);
        return this;
    }

    /**
     * <p>
     * The description of trust provider.
     * </p>
     * 
     * @param description
     *        The description of trust provider.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of trust provider.
     * </p>
     * 
     * @return The description of trust provider.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of trust provider.
     * </p>
     * 
     * @param description
     *        The description of trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProviderCondensed withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of trust provider (user- or device-based).
     * </p>
     * 
     * @param trustProviderType
     *        The type of trust provider (user- or device-based).
     * @see TrustProviderType
     */

    public void setTrustProviderType(String trustProviderType) {
        this.trustProviderType = trustProviderType;
    }

    /**
     * <p>
     * The type of trust provider (user- or device-based).
     * </p>
     * 
     * @return The type of trust provider (user- or device-based).
     * @see TrustProviderType
     */

    public String getTrustProviderType() {
        return this.trustProviderType;
    }

    /**
     * <p>
     * The type of trust provider (user- or device-based).
     * </p>
     * 
     * @param trustProviderType
     *        The type of trust provider (user- or device-based).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustProviderType
     */

    public VerifiedAccessTrustProviderCondensed withTrustProviderType(String trustProviderType) {
        setTrustProviderType(trustProviderType);
        return this;
    }

    /**
     * <p>
     * The type of trust provider (user- or device-based).
     * </p>
     * 
     * @param trustProviderType
     *        The type of trust provider (user- or device-based).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustProviderType
     */

    public VerifiedAccessTrustProviderCondensed withTrustProviderType(TrustProviderType trustProviderType) {
        this.trustProviderType = trustProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @param userTrustProviderType
     *        The type of user-based trust provider.
     * @see UserTrustProviderType
     */

    public void setUserTrustProviderType(String userTrustProviderType) {
        this.userTrustProviderType = userTrustProviderType;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @return The type of user-based trust provider.
     * @see UserTrustProviderType
     */

    public String getUserTrustProviderType() {
        return this.userTrustProviderType;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @param userTrustProviderType
     *        The type of user-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserTrustProviderType
     */

    public VerifiedAccessTrustProviderCondensed withUserTrustProviderType(String userTrustProviderType) {
        setUserTrustProviderType(userTrustProviderType);
        return this;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @param userTrustProviderType
     *        The type of user-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserTrustProviderType
     */

    public VerifiedAccessTrustProviderCondensed withUserTrustProviderType(UserTrustProviderType userTrustProviderType) {
        this.userTrustProviderType = userTrustProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @param deviceTrustProviderType
     *        The type of device-based trust provider.
     * @see DeviceTrustProviderType
     */

    public void setDeviceTrustProviderType(String deviceTrustProviderType) {
        this.deviceTrustProviderType = deviceTrustProviderType;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @return The type of device-based trust provider.
     * @see DeviceTrustProviderType
     */

    public String getDeviceTrustProviderType() {
        return this.deviceTrustProviderType;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @param deviceTrustProviderType
     *        The type of device-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceTrustProviderType
     */

    public VerifiedAccessTrustProviderCondensed withDeviceTrustProviderType(String deviceTrustProviderType) {
        setDeviceTrustProviderType(deviceTrustProviderType);
        return this;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @param deviceTrustProviderType
     *        The type of device-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceTrustProviderType
     */

    public VerifiedAccessTrustProviderCondensed withDeviceTrustProviderType(DeviceTrustProviderType deviceTrustProviderType) {
        this.deviceTrustProviderType = deviceTrustProviderType.toString();
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
        if (getVerifiedAccessTrustProviderId() != null)
            sb.append("VerifiedAccessTrustProviderId: ").append(getVerifiedAccessTrustProviderId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTrustProviderType() != null)
            sb.append("TrustProviderType: ").append(getTrustProviderType()).append(",");
        if (getUserTrustProviderType() != null)
            sb.append("UserTrustProviderType: ").append(getUserTrustProviderType()).append(",");
        if (getDeviceTrustProviderType() != null)
            sb.append("DeviceTrustProviderType: ").append(getDeviceTrustProviderType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifiedAccessTrustProviderCondensed == false)
            return false;
        VerifiedAccessTrustProviderCondensed other = (VerifiedAccessTrustProviderCondensed) obj;
        if (other.getVerifiedAccessTrustProviderId() == null ^ this.getVerifiedAccessTrustProviderId() == null)
            return false;
        if (other.getVerifiedAccessTrustProviderId() != null
                && other.getVerifiedAccessTrustProviderId().equals(this.getVerifiedAccessTrustProviderId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTrustProviderType() == null ^ this.getTrustProviderType() == null)
            return false;
        if (other.getTrustProviderType() != null && other.getTrustProviderType().equals(this.getTrustProviderType()) == false)
            return false;
        if (other.getUserTrustProviderType() == null ^ this.getUserTrustProviderType() == null)
            return false;
        if (other.getUserTrustProviderType() != null && other.getUserTrustProviderType().equals(this.getUserTrustProviderType()) == false)
            return false;
        if (other.getDeviceTrustProviderType() == null ^ this.getDeviceTrustProviderType() == null)
            return false;
        if (other.getDeviceTrustProviderType() != null && other.getDeviceTrustProviderType().equals(this.getDeviceTrustProviderType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessTrustProviderId() == null) ? 0 : getVerifiedAccessTrustProviderId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTrustProviderType() == null) ? 0 : getTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getUserTrustProviderType() == null) ? 0 : getUserTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getDeviceTrustProviderType() == null) ? 0 : getDeviceTrustProviderType().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessTrustProviderCondensed clone() {
        try {
            return (VerifiedAccessTrustProviderCondensed) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
