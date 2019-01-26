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
 * <p>
 * Represents a request to the update device pool operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDevicePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available
     * and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on how many devices
     * meet these constraints, your device pool might contain fewer devices than the value for this parameter.
     * </p>
     * <p>
     * By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     * </p>
     * <p>
     * If you use this parameter in your request, you cannot use the <code>clearMaxDevices</code> parameter in the same
     * request.
     * </p>
     */
    private Integer maxDevices;
    /**
     * <p>
     * Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter to
     * <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not limit the
     * number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that
     * meet the criteria that are specified for the <code>rules</code> parameter.
     * </p>
     * <p>
     * If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the same
     * request.
     * </p>
     */
    private Boolean clearMaxDevices;

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
     * <p>
     * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available
     * and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on how many devices
     * meet these constraints, your device pool might contain fewer devices than the value for this parameter.
     * </p>
     * <p>
     * By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     * </p>
     * <p>
     * If you use this parameter in your request, you cannot use the <code>clearMaxDevices</code> parameter in the same
     * request.
     * </p>
     * 
     * @param maxDevices
     *        The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are
     *        available and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on
     *        how many devices meet these constraints, your device pool might contain fewer devices than the value for
     *        this parameter.</p>
     *        <p>
     *        By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     *        </p>
     *        <p>
     *        If you use this parameter in your request, you cannot use the <code>clearMaxDevices</code> parameter in
     *        the same request.
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
     * <p>
     * If you use this parameter in your request, you cannot use the <code>clearMaxDevices</code> parameter in the same
     * request.
     * </p>
     * 
     * @return The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are
     *         available and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on
     *         how many devices meet these constraints, your device pool might contain fewer devices than the value for
     *         this parameter.</p>
     *         <p>
     *         By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     *         </p>
     *         <p>
     *         If you use this parameter in your request, you cannot use the <code>clearMaxDevices</code> parameter in
     *         the same request.
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
     * <p>
     * If you use this parameter in your request, you cannot use the <code>clearMaxDevices</code> parameter in the same
     * request.
     * </p>
     * 
     * @param maxDevices
     *        The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are
     *        available and that meet the criteria that you assign for the <code>rules</code> parameter. Depending on
     *        how many devices meet these constraints, your device pool might contain fewer devices than the value for
     *        this parameter.</p>
     *        <p>
     *        By specifying the maximum number of devices, you can control the costs that you incur by running tests.
     *        </p>
     *        <p>
     *        If you use this parameter in your request, you cannot use the <code>clearMaxDevices</code> parameter in
     *        the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevicePoolRequest withMaxDevices(Integer maxDevices) {
        setMaxDevices(maxDevices);
        return this;
    }

    /**
     * <p>
     * Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter to
     * <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not limit the
     * number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that
     * meet the criteria that are specified for the <code>rules</code> parameter.
     * </p>
     * <p>
     * If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the same
     * request.
     * </p>
     * 
     * @param clearMaxDevices
     *        Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter
     *        to <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not limit
     *        the number of devices that it adds to your device pool. In this case, Device Farm adds all available
     *        devices that meet the criteria that are specified for the <code>rules</code> parameter.</p>
     *        <p>
     *        If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the
     *        same request.
     */

    public void setClearMaxDevices(Boolean clearMaxDevices) {
        this.clearMaxDevices = clearMaxDevices;
    }

    /**
     * <p>
     * Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter to
     * <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not limit the
     * number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that
     * meet the criteria that are specified for the <code>rules</code> parameter.
     * </p>
     * <p>
     * If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the same
     * request.
     * </p>
     * 
     * @return Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter
     *         to <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not
     *         limit the number of devices that it adds to your device pool. In this case, Device Farm adds all
     *         available devices that meet the criteria that are specified for the <code>rules</code> parameter.</p>
     *         <p>
     *         If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the
     *         same request.
     */

    public Boolean getClearMaxDevices() {
        return this.clearMaxDevices;
    }

    /**
     * <p>
     * Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter to
     * <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not limit the
     * number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that
     * meet the criteria that are specified for the <code>rules</code> parameter.
     * </p>
     * <p>
     * If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the same
     * request.
     * </p>
     * 
     * @param clearMaxDevices
     *        Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter
     *        to <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not limit
     *        the number of devices that it adds to your device pool. In this case, Device Farm adds all available
     *        devices that meet the criteria that are specified for the <code>rules</code> parameter.</p>
     *        <p>
     *        If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the
     *        same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevicePoolRequest withClearMaxDevices(Boolean clearMaxDevices) {
        setClearMaxDevices(clearMaxDevices);
        return this;
    }

    /**
     * <p>
     * Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter to
     * <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not limit the
     * number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that
     * meet the criteria that are specified for the <code>rules</code> parameter.
     * </p>
     * <p>
     * If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the same
     * request.
     * </p>
     * 
     * @return Sets whether the <code>maxDevices</code> parameter applies to your device pool. If you set this parameter
     *         to <code>true</code>, the <code>maxDevices</code> parameter does not apply, and Device Farm does not
     *         limit the number of devices that it adds to your device pool. In this case, Device Farm adds all
     *         available devices that meet the criteria that are specified for the <code>rules</code> parameter.</p>
     *         <p>
     *         If you use this parameter in your request, you cannot use the <code>maxDevices</code> parameter in the
     *         same request.
     */

    public Boolean isClearMaxDevices() {
        return this.clearMaxDevices;
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getMaxDevices() != null)
            sb.append("MaxDevices: ").append(getMaxDevices()).append(",");
        if (getClearMaxDevices() != null)
            sb.append("ClearMaxDevices: ").append(getClearMaxDevices());
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
        if (other.getMaxDevices() == null ^ this.getMaxDevices() == null)
            return false;
        if (other.getMaxDevices() != null && other.getMaxDevices().equals(this.getMaxDevices()) == false)
            return false;
        if (other.getClearMaxDevices() == null ^ this.getClearMaxDevices() == null)
            return false;
        if (other.getClearMaxDevices() != null && other.getClearMaxDevices().equals(this.getClearMaxDevices()) == false)
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
        hashCode = prime * hashCode + ((getMaxDevices() == null) ? 0 : getMaxDevices().hashCode());
        hashCode = prime * hashCode + ((getClearMaxDevices() == null) ? 0 : getClearMaxDevices().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDevicePoolRequest clone() {
        return (UpdateDevicePoolRequest) super.clone();
    }

}
