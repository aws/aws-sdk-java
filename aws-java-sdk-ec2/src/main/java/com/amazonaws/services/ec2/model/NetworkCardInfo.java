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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the network card support of the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkCardInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkCardInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The index of the network card.
     * </p>
     */
    private Integer networkCardIndex;
    /**
     * <p>
     * The network performance of the network card.
     * </p>
     */
    private String networkPerformance;
    /**
     * <p>
     * The maximum number of network interfaces for the network card.
     * </p>
     */
    private Integer maximumNetworkInterfaces;

    /**
     * <p>
     * The index of the network card.
     * </p>
     * 
     * @param networkCardIndex
     *        The index of the network card.
     */

    public void setNetworkCardIndex(Integer networkCardIndex) {
        this.networkCardIndex = networkCardIndex;
    }

    /**
     * <p>
     * The index of the network card.
     * </p>
     * 
     * @return The index of the network card.
     */

    public Integer getNetworkCardIndex() {
        return this.networkCardIndex;
    }

    /**
     * <p>
     * The index of the network card.
     * </p>
     * 
     * @param networkCardIndex
     *        The index of the network card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkCardInfo withNetworkCardIndex(Integer networkCardIndex) {
        setNetworkCardIndex(networkCardIndex);
        return this;
    }

    /**
     * <p>
     * The network performance of the network card.
     * </p>
     * 
     * @param networkPerformance
     *        The network performance of the network card.
     */

    public void setNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
    }

    /**
     * <p>
     * The network performance of the network card.
     * </p>
     * 
     * @return The network performance of the network card.
     */

    public String getNetworkPerformance() {
        return this.networkPerformance;
    }

    /**
     * <p>
     * The network performance of the network card.
     * </p>
     * 
     * @param networkPerformance
     *        The network performance of the network card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkCardInfo withNetworkPerformance(String networkPerformance) {
        setNetworkPerformance(networkPerformance);
        return this;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the network card.
     * </p>
     * 
     * @param maximumNetworkInterfaces
     *        The maximum number of network interfaces for the network card.
     */

    public void setMaximumNetworkInterfaces(Integer maximumNetworkInterfaces) {
        this.maximumNetworkInterfaces = maximumNetworkInterfaces;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the network card.
     * </p>
     * 
     * @return The maximum number of network interfaces for the network card.
     */

    public Integer getMaximumNetworkInterfaces() {
        return this.maximumNetworkInterfaces;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the network card.
     * </p>
     * 
     * @param maximumNetworkInterfaces
     *        The maximum number of network interfaces for the network card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkCardInfo withMaximumNetworkInterfaces(Integer maximumNetworkInterfaces) {
        setMaximumNetworkInterfaces(maximumNetworkInterfaces);
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
        if (getNetworkCardIndex() != null)
            sb.append("NetworkCardIndex: ").append(getNetworkCardIndex()).append(",");
        if (getNetworkPerformance() != null)
            sb.append("NetworkPerformance: ").append(getNetworkPerformance()).append(",");
        if (getMaximumNetworkInterfaces() != null)
            sb.append("MaximumNetworkInterfaces: ").append(getMaximumNetworkInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkCardInfo == false)
            return false;
        NetworkCardInfo other = (NetworkCardInfo) obj;
        if (other.getNetworkCardIndex() == null ^ this.getNetworkCardIndex() == null)
            return false;
        if (other.getNetworkCardIndex() != null && other.getNetworkCardIndex().equals(this.getNetworkCardIndex()) == false)
            return false;
        if (other.getNetworkPerformance() == null ^ this.getNetworkPerformance() == null)
            return false;
        if (other.getNetworkPerformance() != null && other.getNetworkPerformance().equals(this.getNetworkPerformance()) == false)
            return false;
        if (other.getMaximumNetworkInterfaces() == null ^ this.getMaximumNetworkInterfaces() == null)
            return false;
        if (other.getMaximumNetworkInterfaces() != null && other.getMaximumNetworkInterfaces().equals(this.getMaximumNetworkInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkCardIndex() == null) ? 0 : getNetworkCardIndex().hashCode());
        hashCode = prime * hashCode + ((getNetworkPerformance() == null) ? 0 : getNetworkPerformance().hashCode());
        hashCode = prime * hashCode + ((getMaximumNetworkInterfaces() == null) ? 0 : getMaximumNetworkInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public NetworkCardInfo clone() {
        try {
            return (NetworkCardInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
