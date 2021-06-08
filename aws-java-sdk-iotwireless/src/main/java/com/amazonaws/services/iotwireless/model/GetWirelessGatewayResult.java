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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description of the resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the wireless gateway.
     * </p>
     */
    private LoRaWANGateway loRaWAN;
    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the thing associated with the wireless gateway. The value is empty if a thing isn't associated with
     * the gateway.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The ARN of the thing associated with the wireless gateway.
     * </p>
     */
    private String thingArn;

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param id
     *        The ID of the wireless gateway.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @return The ID of the wireless gateway.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param id
     *        The ID of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @return The description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the wireless gateway.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless gateway.
     */

    public void setLoRaWAN(LoRaWANGateway loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless gateway.
     * </p>
     * 
     * @return Information about the wireless gateway.
     */

    public LoRaWANGateway getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless gateway.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayResult withLoRaWAN(LoRaWANGateway loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the thing associated with the wireless gateway. The value is empty if a thing isn't associated with
     * the gateway.
     * </p>
     * 
     * @param thingName
     *        The name of the thing associated with the wireless gateway. The value is empty if a thing isn't associated
     *        with the gateway.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing associated with the wireless gateway. The value is empty if a thing isn't associated with
     * the gateway.
     * </p>
     * 
     * @return The name of the thing associated with the wireless gateway. The value is empty if a thing isn't
     *         associated with the gateway.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing associated with the wireless gateway. The value is empty if a thing isn't associated with
     * the gateway.
     * </p>
     * 
     * @param thingName
     *        The name of the thing associated with the wireless gateway. The value is empty if a thing isn't associated
     *        with the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayResult withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The ARN of the thing associated with the wireless gateway.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing associated with the wireless gateway.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing associated with the wireless gateway.
     * </p>
     * 
     * @return The ARN of the thing associated with the wireless gateway.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the thing associated with the wireless gateway.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing associated with the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayResult withThingArn(String thingArn) {
        setThingArn(thingArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessGatewayResult == false)
            return false;
        GetWirelessGatewayResult other = (GetWirelessGatewayResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessGatewayResult clone() {
        try {
            return (GetWirelessGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
