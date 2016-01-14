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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class CustomOriginConfig implements Serializable, Cloneable {

    private Integer hTTPPort;

    private Integer hTTPSPort;

    private String originProtocolPolicy;

    private OriginSslProtocols originSslProtocols;

    /**
     * @param hTTPPort
     */
    public void setHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
    }

    /**
     * @return
     */
    public Integer getHTTPPort() {
        return this.hTTPPort;
    }

    /**
     * @param hTTPPort
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withHTTPPort(Integer hTTPPort) {
        setHTTPPort(hTTPPort);
        return this;
    }

    /**
     * @param hTTPSPort
     */
    public void setHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
    }

    /**
     * @return
     */
    public Integer getHTTPSPort() {
        return this.hTTPSPort;
    }

    /**
     * @param hTTPSPort
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withHTTPSPort(Integer hTTPSPort) {
        setHTTPSPort(hTTPSPort);
        return this;
    }

    /**
     * @param originProtocolPolicy
     * @see OriginProtocolPolicy
     */
    public void setOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
    }

    /**
     * @return
     * @see OriginProtocolPolicy
     */
    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    /**
     * @param originProtocolPolicy
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OriginProtocolPolicy
     */
    public CustomOriginConfig withOriginProtocolPolicy(
            String originProtocolPolicy) {
        setOriginProtocolPolicy(originProtocolPolicy);
        return this;
    }

    /**
     * @param originProtocolPolicy
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OriginProtocolPolicy
     */
    public void setOriginProtocolPolicy(
            OriginProtocolPolicy originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy.toString();
    }

    /**
     * @param originProtocolPolicy
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OriginProtocolPolicy
     */
    public CustomOriginConfig withOriginProtocolPolicy(
            OriginProtocolPolicy originProtocolPolicy) {
        setOriginProtocolPolicy(originProtocolPolicy);
        return this;
    }

    /**
     * @param originSslProtocols
     */
    public void setOriginSslProtocols(OriginSslProtocols originSslProtocols) {
        this.originSslProtocols = originSslProtocols;
    }

    /**
     * @return
     */
    public OriginSslProtocols getOriginSslProtocols() {
        return this.originSslProtocols;
    }

    /**
     * @param originSslProtocols
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CustomOriginConfig withOriginSslProtocols(
            OriginSslProtocols originSslProtocols) {
        setOriginSslProtocols(originSslProtocols);
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
        if (getHTTPPort() != null)
            sb.append("HTTPPort: " + getHTTPPort() + ",");
        if (getHTTPSPort() != null)
            sb.append("HTTPSPort: " + getHTTPSPort() + ",");
        if (getOriginProtocolPolicy() != null)
            sb.append("OriginProtocolPolicy: " + getOriginProtocolPolicy()
                    + ",");
        if (getOriginSslProtocols() != null)
            sb.append("OriginSslProtocols: " + getOriginSslProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomOriginConfig == false)
            return false;
        CustomOriginConfig other = (CustomOriginConfig) obj;
        if (other.getHTTPPort() == null ^ this.getHTTPPort() == null)
            return false;
        if (other.getHTTPPort() != null
                && other.getHTTPPort().equals(this.getHTTPPort()) == false)
            return false;
        if (other.getHTTPSPort() == null ^ this.getHTTPSPort() == null)
            return false;
        if (other.getHTTPSPort() != null
                && other.getHTTPSPort().equals(this.getHTTPSPort()) == false)
            return false;
        if (other.getOriginProtocolPolicy() == null
                ^ this.getOriginProtocolPolicy() == null)
            return false;
        if (other.getOriginProtocolPolicy() != null
                && other.getOriginProtocolPolicy().equals(
                        this.getOriginProtocolPolicy()) == false)
            return false;
        if (other.getOriginSslProtocols() == null
                ^ this.getOriginSslProtocols() == null)
            return false;
        if (other.getOriginSslProtocols() != null
                && other.getOriginSslProtocols().equals(
                        this.getOriginSslProtocols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHTTPPort() == null) ? 0 : getHTTPPort().hashCode());
        hashCode = prime * hashCode
                + ((getHTTPSPort() == null) ? 0 : getHTTPSPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getOriginProtocolPolicy() == null) ? 0
                        : getOriginProtocolPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getOriginSslProtocols() == null) ? 0
                        : getOriginSslProtocols().hashCode());
        return hashCode;
    }

    @Override
    public CustomOriginConfig clone() {
        try {
            return (CustomOriginConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}