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
 * A request to move a dedicated IP address to a dedicated IP pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpInPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDedicatedIpInPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP
     * address that's associated with your Amazon Pinpoint account.
     * </p>
     */
    private String ip;
    /**
     * <p>
     * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that
     * already exists.
     * </p>
     */
    private String destinationPoolName;

    /**
     * <p>
     * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP
     * address that's associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param ip
     *        The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated
     *        IP address that's associated with your Amazon Pinpoint account.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP
     * address that's associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @return The IP address that you want to move to the dedicated IP pool. The value you specify has to be a
     *         dedicated IP address that's associated with your Amazon Pinpoint account.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP
     * address that's associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param ip
     *        The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated
     *        IP address that's associated with your Amazon Pinpoint account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDedicatedIpInPoolRequest withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that
     * already exists.
     * </p>
     * 
     * @param destinationPoolName
     *        The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool
     *        that already exists.
     */

    public void setDestinationPoolName(String destinationPoolName) {
        this.destinationPoolName = destinationPoolName;
    }

    /**
     * <p>
     * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that
     * already exists.
     * </p>
     * 
     * @return The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool
     *         that already exists.
     */

    public String getDestinationPoolName() {
        return this.destinationPoolName;
    }

    /**
     * <p>
     * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that
     * already exists.
     * </p>
     * 
     * @param destinationPoolName
     *        The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool
     *        that already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDedicatedIpInPoolRequest withDestinationPoolName(String destinationPoolName) {
        setDestinationPoolName(destinationPoolName);
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
        if (getDestinationPoolName() != null)
            sb.append("DestinationPoolName: ").append(getDestinationPoolName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDedicatedIpInPoolRequest == false)
            return false;
        PutDedicatedIpInPoolRequest other = (PutDedicatedIpInPoolRequest) obj;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getDestinationPoolName() == null ^ this.getDestinationPoolName() == null)
            return false;
        if (other.getDestinationPoolName() != null && other.getDestinationPoolName().equals(this.getDestinationPoolName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getDestinationPoolName() == null) ? 0 : getDestinationPoolName().hashCode());
        return hashCode;
    }

    @Override
    public PutDedicatedIpInPoolRequest clone() {
        return (PutDedicatedIpInPoolRequest) super.clone();
    }

}
