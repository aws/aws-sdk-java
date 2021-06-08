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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithThing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateWirelessDeviceWithThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the thing to associate with the wireless device.
     * </p>
     */
    private String thingArn;

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @return The ID of the resource to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWirelessDeviceWithThingRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the thing to associate with the wireless device.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing to associate with the wireless device.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to associate with the wireless device.
     * </p>
     * 
     * @return The ARN of the thing to associate with the wireless device.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to associate with the wireless device.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing to associate with the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWirelessDeviceWithThingRequest withThingArn(String thingArn) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof AssociateWirelessDeviceWithThingRequest == false)
            return false;
        AssociateWirelessDeviceWithThingRequest other = (AssociateWirelessDeviceWithThingRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateWirelessDeviceWithThingRequest clone() {
        return (AssociateWirelessDeviceWithThingRequest) super.clone();
    }

}
