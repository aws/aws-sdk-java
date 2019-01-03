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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to
 * resume the warm-up process for an existing IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpWarmupAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDedicatedIpWarmupAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The dedicated IP address that you want to update the warm-up attributes for.
     * </p>
     */
    private String ip;
    /**
     * <p>
     * The warm-up percentage that you want to associate with the dedicated IP address.
     * </p>
     */
    private Integer warmupPercentage;

    /**
     * <p>
     * The dedicated IP address that you want to update the warm-up attributes for.
     * </p>
     * 
     * @param ip
     *        The dedicated IP address that you want to update the warm-up attributes for.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * The dedicated IP address that you want to update the warm-up attributes for.
     * </p>
     * 
     * @return The dedicated IP address that you want to update the warm-up attributes for.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * The dedicated IP address that you want to update the warm-up attributes for.
     * </p>
     * 
     * @param ip
     *        The dedicated IP address that you want to update the warm-up attributes for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDedicatedIpWarmupAttributesRequest withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * The warm-up percentage that you want to associate with the dedicated IP address.
     * </p>
     * 
     * @param warmupPercentage
     *        The warm-up percentage that you want to associate with the dedicated IP address.
     */

    public void setWarmupPercentage(Integer warmupPercentage) {
        this.warmupPercentage = warmupPercentage;
    }

    /**
     * <p>
     * The warm-up percentage that you want to associate with the dedicated IP address.
     * </p>
     * 
     * @return The warm-up percentage that you want to associate with the dedicated IP address.
     */

    public Integer getWarmupPercentage() {
        return this.warmupPercentage;
    }

    /**
     * <p>
     * The warm-up percentage that you want to associate with the dedicated IP address.
     * </p>
     * 
     * @param warmupPercentage
     *        The warm-up percentage that you want to associate with the dedicated IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDedicatedIpWarmupAttributesRequest withWarmupPercentage(Integer warmupPercentage) {
        setWarmupPercentage(warmupPercentage);
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
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getWarmupPercentage() != null)
            sb.append("WarmupPercentage: ").append(getWarmupPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDedicatedIpWarmupAttributesRequest == false)
            return false;
        PutDedicatedIpWarmupAttributesRequest other = (PutDedicatedIpWarmupAttributesRequest) obj;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getWarmupPercentage() == null ^ this.getWarmupPercentage() == null)
            return false;
        if (other.getWarmupPercentage() != null && other.getWarmupPercentage().equals(this.getWarmupPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getWarmupPercentage() == null) ? 0 : getWarmupPercentage().hashCode());
        return hashCode;
    }

    @Override
    public PutDedicatedIpWarmupAttributesRequest clone() {
        return (PutDedicatedIpWarmupAttributesRequest) super.clone();
    }

}
