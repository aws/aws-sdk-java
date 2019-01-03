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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateNetworkProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The name you wish to specify for the new network profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the network profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of network profile you wish to create. Valid values are listed below.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     */
    private Long uplinkBandwidthBits;
    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     */
    private Long downlinkBandwidthBits;
    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     */
    private Long uplinkDelayMs;
    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     */
    private Long downlinkDelayMs;
    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     */
    private Long uplinkJitterMs;
    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     */
    private Long downlinkJitterMs;
    /**
     * <p>
     * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     * </p>
     */
    private Integer uplinkLossPercent;
    /**
     * <p>
     * Proportion of received packets that fail to arrive from 0 to 100 percent.
     * </p>
     */
    private Integer downlinkLossPercent;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The name you wish to specify for the new network profile.
     * </p>
     * 
     * @param name
     *        The name you wish to specify for the new network profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you wish to specify for the new network profile.
     * </p>
     * 
     * @return The name you wish to specify for the new network profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you wish to specify for the new network profile.
     * </p>
     * 
     * @param name
     *        The name you wish to specify for the new network profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the network profile.
     * </p>
     * 
     * @param description
     *        The description of the network profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network profile.
     * </p>
     * 
     * @return The description of the network profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the network profile.
     * </p>
     * 
     * @param description
     *        The description of the network profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of network profile you wish to create. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to create. Valid values are listed below.
     * @see NetworkProfileType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of network profile you wish to create. Valid values are listed below.
     * </p>
     * 
     * @return The type of network profile you wish to create. Valid values are listed below.
     * @see NetworkProfileType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of network profile you wish to create. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to create. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProfileType
     */

    public CreateNetworkProfileRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of network profile you wish to create. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to create. Valid values are listed below.
     * @see NetworkProfileType
     */

    public void setType(NetworkProfileType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of network profile you wish to create. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to create. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProfileType
     */

    public CreateNetworkProfileRequest withType(NetworkProfileType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     * 
     * @param uplinkBandwidthBits
     *        The data throughput rate in bits per second, as an integer from 0 to 104857600.
     */

    public void setUplinkBandwidthBits(Long uplinkBandwidthBits) {
        this.uplinkBandwidthBits = uplinkBandwidthBits;
    }

    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     * 
     * @return The data throughput rate in bits per second, as an integer from 0 to 104857600.
     */

    public Long getUplinkBandwidthBits() {
        return this.uplinkBandwidthBits;
    }

    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     * 
     * @param uplinkBandwidthBits
     *        The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withUplinkBandwidthBits(Long uplinkBandwidthBits) {
        setUplinkBandwidthBits(uplinkBandwidthBits);
        return this;
    }

    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     * 
     * @param downlinkBandwidthBits
     *        The data throughput rate in bits per second, as an integer from 0 to 104857600.
     */

    public void setDownlinkBandwidthBits(Long downlinkBandwidthBits) {
        this.downlinkBandwidthBits = downlinkBandwidthBits;
    }

    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     * 
     * @return The data throughput rate in bits per second, as an integer from 0 to 104857600.
     */

    public Long getDownlinkBandwidthBits() {
        return this.downlinkBandwidthBits;
    }

    /**
     * <p>
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * </p>
     * 
     * @param downlinkBandwidthBits
     *        The data throughput rate in bits per second, as an integer from 0 to 104857600.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withDownlinkBandwidthBits(Long downlinkBandwidthBits) {
        setDownlinkBandwidthBits(downlinkBandwidthBits);
        return this;
    }

    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param uplinkDelayMs
     *        Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     */

    public void setUplinkDelayMs(Long uplinkDelayMs) {
        this.uplinkDelayMs = uplinkDelayMs;
    }

    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @return Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     */

    public Long getUplinkDelayMs() {
        return this.uplinkDelayMs;
    }

    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param uplinkDelayMs
     *        Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withUplinkDelayMs(Long uplinkDelayMs) {
        setUplinkDelayMs(uplinkDelayMs);
        return this;
    }

    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param downlinkDelayMs
     *        Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     */

    public void setDownlinkDelayMs(Long downlinkDelayMs) {
        this.downlinkDelayMs = downlinkDelayMs;
    }

    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @return Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     */

    public Long getDownlinkDelayMs() {
        return this.downlinkDelayMs;
    }

    /**
     * <p>
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param downlinkDelayMs
     *        Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withDownlinkDelayMs(Long downlinkDelayMs) {
        setDownlinkDelayMs(downlinkDelayMs);
        return this;
    }

    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param uplinkJitterMs
     *        Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     */

    public void setUplinkJitterMs(Long uplinkJitterMs) {
        this.uplinkJitterMs = uplinkJitterMs;
    }

    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @return Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     */

    public Long getUplinkJitterMs() {
        return this.uplinkJitterMs;
    }

    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param uplinkJitterMs
     *        Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withUplinkJitterMs(Long uplinkJitterMs) {
        setUplinkJitterMs(uplinkJitterMs);
        return this;
    }

    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param downlinkJitterMs
     *        Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     */

    public void setDownlinkJitterMs(Long downlinkJitterMs) {
        this.downlinkJitterMs = downlinkJitterMs;
    }

    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @return Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     */

    public Long getDownlinkJitterMs() {
        return this.downlinkJitterMs;
    }

    /**
     * <p>
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * </p>
     * 
     * @param downlinkJitterMs
     *        Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withDownlinkJitterMs(Long downlinkJitterMs) {
        setDownlinkJitterMs(downlinkJitterMs);
        return this;
    }

    /**
     * <p>
     * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     * </p>
     * 
     * @param uplinkLossPercent
     *        Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     */

    public void setUplinkLossPercent(Integer uplinkLossPercent) {
        this.uplinkLossPercent = uplinkLossPercent;
    }

    /**
     * <p>
     * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     * </p>
     * 
     * @return Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     */

    public Integer getUplinkLossPercent() {
        return this.uplinkLossPercent;
    }

    /**
     * <p>
     * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     * </p>
     * 
     * @param uplinkLossPercent
     *        Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withUplinkLossPercent(Integer uplinkLossPercent) {
        setUplinkLossPercent(uplinkLossPercent);
        return this;
    }

    /**
     * <p>
     * Proportion of received packets that fail to arrive from 0 to 100 percent.
     * </p>
     * 
     * @param downlinkLossPercent
     *        Proportion of received packets that fail to arrive from 0 to 100 percent.
     */

    public void setDownlinkLossPercent(Integer downlinkLossPercent) {
        this.downlinkLossPercent = downlinkLossPercent;
    }

    /**
     * <p>
     * Proportion of received packets that fail to arrive from 0 to 100 percent.
     * </p>
     * 
     * @return Proportion of received packets that fail to arrive from 0 to 100 percent.
     */

    public Integer getDownlinkLossPercent() {
        return this.downlinkLossPercent;
    }

    /**
     * <p>
     * Proportion of received packets that fail to arrive from 0 to 100 percent.
     * </p>
     * 
     * @param downlinkLossPercent
     *        Proportion of received packets that fail to arrive from 0 to 100 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkProfileRequest withDownlinkLossPercent(Integer downlinkLossPercent) {
        setDownlinkLossPercent(downlinkLossPercent);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUplinkBandwidthBits() != null)
            sb.append("UplinkBandwidthBits: ").append(getUplinkBandwidthBits()).append(",");
        if (getDownlinkBandwidthBits() != null)
            sb.append("DownlinkBandwidthBits: ").append(getDownlinkBandwidthBits()).append(",");
        if (getUplinkDelayMs() != null)
            sb.append("UplinkDelayMs: ").append(getUplinkDelayMs()).append(",");
        if (getDownlinkDelayMs() != null)
            sb.append("DownlinkDelayMs: ").append(getDownlinkDelayMs()).append(",");
        if (getUplinkJitterMs() != null)
            sb.append("UplinkJitterMs: ").append(getUplinkJitterMs()).append(",");
        if (getDownlinkJitterMs() != null)
            sb.append("DownlinkJitterMs: ").append(getDownlinkJitterMs()).append(",");
        if (getUplinkLossPercent() != null)
            sb.append("UplinkLossPercent: ").append(getUplinkLossPercent()).append(",");
        if (getDownlinkLossPercent() != null)
            sb.append("DownlinkLossPercent: ").append(getDownlinkLossPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkProfileRequest == false)
            return false;
        CreateNetworkProfileRequest other = (CreateNetworkProfileRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUplinkBandwidthBits() == null ^ this.getUplinkBandwidthBits() == null)
            return false;
        if (other.getUplinkBandwidthBits() != null && other.getUplinkBandwidthBits().equals(this.getUplinkBandwidthBits()) == false)
            return false;
        if (other.getDownlinkBandwidthBits() == null ^ this.getDownlinkBandwidthBits() == null)
            return false;
        if (other.getDownlinkBandwidthBits() != null && other.getDownlinkBandwidthBits().equals(this.getDownlinkBandwidthBits()) == false)
            return false;
        if (other.getUplinkDelayMs() == null ^ this.getUplinkDelayMs() == null)
            return false;
        if (other.getUplinkDelayMs() != null && other.getUplinkDelayMs().equals(this.getUplinkDelayMs()) == false)
            return false;
        if (other.getDownlinkDelayMs() == null ^ this.getDownlinkDelayMs() == null)
            return false;
        if (other.getDownlinkDelayMs() != null && other.getDownlinkDelayMs().equals(this.getDownlinkDelayMs()) == false)
            return false;
        if (other.getUplinkJitterMs() == null ^ this.getUplinkJitterMs() == null)
            return false;
        if (other.getUplinkJitterMs() != null && other.getUplinkJitterMs().equals(this.getUplinkJitterMs()) == false)
            return false;
        if (other.getDownlinkJitterMs() == null ^ this.getDownlinkJitterMs() == null)
            return false;
        if (other.getDownlinkJitterMs() != null && other.getDownlinkJitterMs().equals(this.getDownlinkJitterMs()) == false)
            return false;
        if (other.getUplinkLossPercent() == null ^ this.getUplinkLossPercent() == null)
            return false;
        if (other.getUplinkLossPercent() != null && other.getUplinkLossPercent().equals(this.getUplinkLossPercent()) == false)
            return false;
        if (other.getDownlinkLossPercent() == null ^ this.getDownlinkLossPercent() == null)
            return false;
        if (other.getDownlinkLossPercent() != null && other.getDownlinkLossPercent().equals(this.getDownlinkLossPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUplinkBandwidthBits() == null) ? 0 : getUplinkBandwidthBits().hashCode());
        hashCode = prime * hashCode + ((getDownlinkBandwidthBits() == null) ? 0 : getDownlinkBandwidthBits().hashCode());
        hashCode = prime * hashCode + ((getUplinkDelayMs() == null) ? 0 : getUplinkDelayMs().hashCode());
        hashCode = prime * hashCode + ((getDownlinkDelayMs() == null) ? 0 : getDownlinkDelayMs().hashCode());
        hashCode = prime * hashCode + ((getUplinkJitterMs() == null) ? 0 : getUplinkJitterMs().hashCode());
        hashCode = prime * hashCode + ((getDownlinkJitterMs() == null) ? 0 : getDownlinkJitterMs().hashCode());
        hashCode = prime * hashCode + ((getUplinkLossPercent() == null) ? 0 : getUplinkLossPercent().hashCode());
        hashCode = prime * hashCode + ((getDownlinkLossPercent() == null) ? 0 : getDownlinkLossPercent().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkProfileRequest clone() {
        return (CreateNetworkProfileRequest) super.clone();
    }

}
