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

/**
 * <p>
 * Represents a condition for a device pool.
 * </p>
 */
public class Rule implements Serializable, Cloneable {

    /**
     * <p>
     * The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * </ul>
     */
    private String attribute;
    /**
     * <p>
     * The rule's operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EQUALS: The equals operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREATER_THAN: The greater-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN: The in operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * LESS_THAN: The less-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_IN: The not-in operator.
     * </p>
     * </li>
     * </ul>
     */
    private String operator;
    /**
     * <p>
     * The rule's value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * </ul>
     * 
     * @param attribute
     *        The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     * @see DeviceAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ARN: The ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FORM_FACTOR: The form factor (for example, phone or tablet).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MANUFACTURER: The manufacturer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM: The platform (for example, Android or iOS).
     *         </p>
     *         </li>
     * @see DeviceAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * </ul>
     * 
     * @param attribute
     *        The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAttribute
     */

    public Rule withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * </ul>
     * 
     * @param attribute
     *        The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     * @see DeviceAttribute
     */

    public void setAttribute(DeviceAttribute attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The form factor (for example, phone or tablet).
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The manufacturer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The platform (for example, Android or iOS).
     * </p>
     * </li>
     * </ul>
     * 
     * @param attribute
     *        The rule's stringified attribute. For example, specify the value as <code>"\"abc\""</code>.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The form factor (for example, phone or tablet).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The manufacturer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The platform (for example, Android or iOS).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAttribute
     */

    public Rule withAttribute(DeviceAttribute attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The rule's operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EQUALS: The equals operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREATER_THAN: The greater-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN: The in operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * LESS_THAN: The less-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_IN: The not-in operator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The rule's operator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        EQUALS: The equals operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREATER_THAN: The greater-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN: The in operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LESS_THAN: The less-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_IN: The not-in operator.
     *        </p>
     *        </li>
     * @see RuleOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The rule's operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EQUALS: The equals operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREATER_THAN: The greater-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN: The in operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * LESS_THAN: The less-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_IN: The not-in operator.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The rule's operator.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         EQUALS: The equals operator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GREATER_THAN: The greater-than operator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN: The in operator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LESS_THAN: The less-than operator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NOT_IN: The not-in operator.
     *         </p>
     *         </li>
     * @see RuleOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The rule's operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EQUALS: The equals operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREATER_THAN: The greater-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN: The in operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * LESS_THAN: The less-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_IN: The not-in operator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The rule's operator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        EQUALS: The equals operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREATER_THAN: The greater-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN: The in operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LESS_THAN: The less-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_IN: The not-in operator.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOperator
     */

    public Rule withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The rule's operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EQUALS: The equals operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREATER_THAN: The greater-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN: The in operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * LESS_THAN: The less-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_IN: The not-in operator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The rule's operator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        EQUALS: The equals operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREATER_THAN: The greater-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN: The in operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LESS_THAN: The less-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_IN: The not-in operator.
     *        </p>
     *        </li>
     * @see RuleOperator
     */

    public void setOperator(RuleOperator operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * The rule's operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EQUALS: The equals operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREATER_THAN: The greater-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN: The in operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * LESS_THAN: The less-than operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_IN: The not-in operator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The rule's operator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        EQUALS: The equals operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREATER_THAN: The greater-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN: The in operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LESS_THAN: The less-than operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_IN: The not-in operator.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOperator
     */

    public Rule withOperator(RuleOperator operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The rule's value.
     * </p>
     * 
     * @param value
     *        The rule's value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The rule's value.
     * </p>
     * 
     * @return The rule's value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The rule's value.
     * </p>
     * 
     * @param value
     *        The rule's value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withValue(String value) {
        setValue(value);
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
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getOperator() != null)
            sb.append("Operator: " + getOperator() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
