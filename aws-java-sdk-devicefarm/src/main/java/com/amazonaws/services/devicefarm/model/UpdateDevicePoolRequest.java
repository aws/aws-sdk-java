/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to the update device pool operation.
 * </p>
 */
public class UpdateDevicePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resourc Name (ARN) of the Device Farm device pool you wish to update.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A string representing the name of the device pool you wish to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the device pool you wish to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you choose
     * to update rules for your request, the update will replace the existing rules.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The Amazon Resourc Name (ARN) of the Device Farm device pool you wish to update.
     * </p>
     * 
     * @param arn
     *        The Amazon Resourc Name (ARN) of the Device Farm device pool you wish to update.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resourc Name (ARN) of the Device Farm device pool you wish to update.
     * </p>
     * 
     * @return The Amazon Resourc Name (ARN) of the Device Farm device pool you wish to update.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resourc Name (ARN) of the Device Farm device pool you wish to update.
     * </p>
     * 
     * @param arn
     *        The Amazon Resourc Name (ARN) of the Device Farm device pool you wish to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevicePoolRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A string representing the name of the device pool you wish to update.
     * </p>
     * 
     * @param name
     *        A string representing the name of the device pool you wish to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A string representing the name of the device pool you wish to update.
     * </p>
     * 
     * @return A string representing the name of the device pool you wish to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A string representing the name of the device pool you wish to update.
     * </p>
     * 
     * @param name
     *        A string representing the name of the device pool you wish to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevicePoolRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the device pool you wish to update.
     * </p>
     * 
     * @param description
     *        A description of the device pool you wish to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the device pool you wish to update.
     * </p>
     * 
     * @return A description of the device pool you wish to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the device pool you wish to update.
     * </p>
     * 
     * @param description
     *        A description of the device pool you wish to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevicePoolRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you choose
     * to update rules for your request, the update will replace the existing rules.
     * </p>
     * 
     * @return Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you
     *         choose to update rules for your request, the update will replace the existing rules.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you choose
     * to update rules for your request, the update will replace the existing rules.
     * </p>
     * 
     * @param rules
     *        Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you
     *        choose to update rules for your request, the update will replace the existing rules.
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
     * Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you choose
     * to update rules for your request, the update will replace the existing rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you
     *        choose to update rules for your request, the update will replace the existing rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevicePoolRequest withRules(Rule... rules) {
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
     * Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you choose
     * to update rules for your request, the update will replace the existing rules.
     * </p>
     * 
     * @param rules
     *        Represents the rules you wish to modify for the device pool. Updating rules is optional; however, if you
     *        choose to update rules for your request, the update will replace the existing rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevicePoolRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDevicePoolRequest == false)
            return false;
        UpdateDevicePoolRequest other = (UpdateDevicePoolRequest) obj;
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
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
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
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDevicePoolRequest clone() {
        return (UpdateDevicePoolRequest) super.clone();
    }
}
