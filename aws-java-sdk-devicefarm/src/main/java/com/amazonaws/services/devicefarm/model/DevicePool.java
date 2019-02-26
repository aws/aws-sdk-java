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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a collection of device types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DevicePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevicePool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device pool's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The device pool's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The device pool's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The device pool's type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool developer.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the device pool's rules.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available
     * and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on how many devices
     * meet these constraints, your device pool might contain fewer devices than the value for this parameter.
     * </p>
     * <p>
     * By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     * </p>
     */
    private Integer maxDevices;

    /**
     * <p>
     * The device pool's ARN.
     * </p>
     * 
     * @param arn
     *        The device pool's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The device pool's ARN.
     * </p>
     * 
     * @return The device pool's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The device pool's ARN.
     * </p>
     * 
     * @param arn
     *        The device pool's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePool withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The device pool's name.
     * </p>
     * 
     * @param name
     *        The device pool's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The device pool's name.
     * </p>
     * 
     * @return The device pool's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The device pool's name.
     * </p>
     * 
     * @param name
     *        The device pool's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePool withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The device pool's description.
     * </p>
     * 
     * @param description
     *        The device pool's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The device pool's description.
     * </p>
     * 
     * @return The device pool's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The device pool's description.
     * </p>
     * 
     * @param description
     *        The device pool's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePool withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The device pool's type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pool's type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device pool developer.
     *        </p>
     *        </li>
     * @see DevicePoolType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The device pool's type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The device pool's type.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CURATED: A device pool that is created and managed by AWS Device Farm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRIVATE: A device pool that is created and managed by the device pool developer.
     *         </p>
     *         </li>
     * @see DevicePoolType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The device pool's type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pool's type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device pool developer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePoolType
     */

    public DevicePool withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The device pool's type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pool's type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device pool developer.
     *        </p>
     *        </li>
     * @see DevicePoolType
     */

    public void setType(DevicePoolType type) {
        withType(type);
    }

    /**
     * <p>
     * The device pool's type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pool's type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device pool developer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePoolType
     */

    public DevicePool withType(DevicePoolType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the device pool's rules.
     * </p>
     * 
     * @return Information about the device pool's rules.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Information about the device pool's rules.
     * </p>
     * 
     * @param rules
     *        Information about the device pool's rules.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * Information about the device pool's rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Information about the device pool's rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePool withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the device pool's rules.
     * </p>
     * 
     * @param rules
     *        Information about the device pool's rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePool withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available
     * and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on how many devices
     * meet these constraints, your device pool might contain fewer devices than the value for this parameter.
     * </p>
     * <p>
     * By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     * </p>
     * 
     * @param maxDevices
     *        The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are
     *        available and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on
     *        how many devices meet these constraints, your device pool might contain fewer devices than the value for
     *        this parameter.</p>
     *        <p>
     *        By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     */

    public void setMaxDevices(Integer maxDevices) {
        this.maxDevices = maxDevices;
    }

    /**
     * <p>
     * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available
     * and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on how many devices
     * meet these constraints, your device pool might contain fewer devices than the value for this parameter.
     * </p>
     * <p>
     * By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     * </p>
     * 
     * @return The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are
     *         available and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on
     *         how many devices meet these constraints, your device pool might contain fewer devices than the value for
     *         this parameter.</p>
     *         <p>
     *         By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     */

    public Integer getMaxDevices() {
        return this.maxDevices;
    }

    /**
     * <p>
     * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available
     * and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on how many devices
     * meet these constraints, your device pool might contain fewer devices than the value for this parameter.
     * </p>
     * <p>
     * By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     * </p>
     * 
     * @param maxDevices
     *        The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are
     *        available and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on
     *        how many devices meet these constraints, your device pool might contain fewer devices than the value for
     *        this parameter.</p>
     *        <p>
     *        By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePool withMaxDevices(Integer maxDevices) {
        setMaxDevices(maxDevices);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getMaxDevices() != null)
            sb.append("MaxDevices: ").append(getMaxDevices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevicePool == false)
            return false;
        DevicePool other = (DevicePool) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getMaxDevices() == null ^ this.getMaxDevices() == null)
            return false;
        if (other.getMaxDevices() != null && other.getMaxDevices().equals(this.getMaxDevices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getMaxDevices() == null) ? 0 : getMaxDevices().hashCode());
        return hashCode;
    }

    @Override
    public DevicePool clone() {
        try {
            return (DevicePool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DevicePoolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
