/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * 
 */
public class GatewayInfo implements Serializable, Cloneable {

    private String gatewayARN;

    private String gatewayType;

    private String gatewayOperationalState;

    private String gatewayName;

    /**
     * @param gatewayARN
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */
    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * @param gatewayType
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * @return
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @param gatewayType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * @param gatewayOperationalState
     */
    public void setGatewayOperationalState(String gatewayOperationalState) {
        this.gatewayOperationalState = gatewayOperationalState;
    }

    /**
     * @return
     */
    public String getGatewayOperationalState() {
        return this.gatewayOperationalState;
    }

    /**
     * @param gatewayOperationalState
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayOperationalState(
            String gatewayOperationalState) {
        setGatewayOperationalState(gatewayOperationalState);
        return this;
    }

    /**
     * @param gatewayName
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * @return
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * @param gatewayName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GatewayInfo withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getGatewayType() != null)
            sb.append("GatewayType: " + getGatewayType() + ",");
        if (getGatewayOperationalState() != null)
            sb.append("GatewayOperationalState: "
                    + getGatewayOperationalState() + ",");
        if (getGatewayName() != null)
            sb.append("GatewayName: " + getGatewayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayInfo == false)
            return false;
        GatewayInfo other = (GatewayInfo) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null
                && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getGatewayOperationalState() == null
                ^ this.getGatewayOperationalState() == null)
            return false;
        if (other.getGatewayOperationalState() != null
                && other.getGatewayOperationalState().equals(
                        this.getGatewayOperationalState()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null
                && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayOperationalState() == null) ? 0
                        : getGatewayOperationalState().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        return hashCode;
    }

    @Override
    public GatewayInfo clone() {
        try {
            return (GatewayInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}