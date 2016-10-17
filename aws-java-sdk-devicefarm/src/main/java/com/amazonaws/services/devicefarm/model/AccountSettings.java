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
 * A container for account-level settings within AWS Device Farm.
 * </p>
 */
public class AccountSettings implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account number specified in the <code>AccountSettings</code> container.
     * </p>
     */
    private String awsAccountNumber;
    /**
     * <p>
     * Returns the unmetered devices you have purchased or want to purchase.
     * </p>
     */
    private java.util.Map<String, Integer> unmeteredDevices;
    /**
     * <p>
     * Returns the unmetered remote access devices you have purchased or want to purchase.
     * </p>
     */
    private java.util.Map<String, Integer> unmeteredRemoteAccessDevices;

    /**
     * <p>
     * The AWS account number specified in the <code>AccountSettings</code> container.
     * </p>
     * 
     * @param awsAccountNumber
     *        The AWS account number specified in the <code>AccountSettings</code> container.
     */

    public void setAwsAccountNumber(String awsAccountNumber) {
        this.awsAccountNumber = awsAccountNumber;
    }

    /**
     * <p>
     * The AWS account number specified in the <code>AccountSettings</code> container.
     * </p>
     * 
     * @return The AWS account number specified in the <code>AccountSettings</code> container.
     */

    public String getAwsAccountNumber() {
        return this.awsAccountNumber;
    }

    /**
     * <p>
     * The AWS account number specified in the <code>AccountSettings</code> container.
     * </p>
     * 
     * @param awsAccountNumber
     *        The AWS account number specified in the <code>AccountSettings</code> container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withAwsAccountNumber(String awsAccountNumber) {
        setAwsAccountNumber(awsAccountNumber);
        return this;
    }

    /**
     * <p>
     * Returns the unmetered devices you have purchased or want to purchase.
     * </p>
     * 
     * @return Returns the unmetered devices you have purchased or want to purchase.
     */

    public java.util.Map<String, Integer> getUnmeteredDevices() {
        return unmeteredDevices;
    }

    /**
     * <p>
     * Returns the unmetered devices you have purchased or want to purchase.
     * </p>
     * 
     * @param unmeteredDevices
     *        Returns the unmetered devices you have purchased or want to purchase.
     */

    public void setUnmeteredDevices(java.util.Map<String, Integer> unmeteredDevices) {
        this.unmeteredDevices = unmeteredDevices;
    }

    /**
     * <p>
     * Returns the unmetered devices you have purchased or want to purchase.
     * </p>
     * 
     * @param unmeteredDevices
     *        Returns the unmetered devices you have purchased or want to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withUnmeteredDevices(java.util.Map<String, Integer> unmeteredDevices) {
        setUnmeteredDevices(unmeteredDevices);
        return this;
    }

    public AccountSettings addUnmeteredDevicesEntry(String key, Integer value) {
        if (null == this.unmeteredDevices) {
            this.unmeteredDevices = new java.util.HashMap<String, Integer>();
        }
        if (this.unmeteredDevices.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.unmeteredDevices.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UnmeteredDevices.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings clearUnmeteredDevicesEntries() {
        this.unmeteredDevices = null;
        return this;
    }

    /**
     * <p>
     * Returns the unmetered remote access devices you have purchased or want to purchase.
     * </p>
     * 
     * @return Returns the unmetered remote access devices you have purchased or want to purchase.
     */

    public java.util.Map<String, Integer> getUnmeteredRemoteAccessDevices() {
        return unmeteredRemoteAccessDevices;
    }

    /**
     * <p>
     * Returns the unmetered remote access devices you have purchased or want to purchase.
     * </p>
     * 
     * @param unmeteredRemoteAccessDevices
     *        Returns the unmetered remote access devices you have purchased or want to purchase.
     */

    public void setUnmeteredRemoteAccessDevices(java.util.Map<String, Integer> unmeteredRemoteAccessDevices) {
        this.unmeteredRemoteAccessDevices = unmeteredRemoteAccessDevices;
    }

    /**
     * <p>
     * Returns the unmetered remote access devices you have purchased or want to purchase.
     * </p>
     * 
     * @param unmeteredRemoteAccessDevices
     *        Returns the unmetered remote access devices you have purchased or want to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withUnmeteredRemoteAccessDevices(java.util.Map<String, Integer> unmeteredRemoteAccessDevices) {
        setUnmeteredRemoteAccessDevices(unmeteredRemoteAccessDevices);
        return this;
    }

    public AccountSettings addUnmeteredRemoteAccessDevicesEntry(String key, Integer value) {
        if (null == this.unmeteredRemoteAccessDevices) {
            this.unmeteredRemoteAccessDevices = new java.util.HashMap<String, Integer>();
        }
        if (this.unmeteredRemoteAccessDevices.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.unmeteredRemoteAccessDevices.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UnmeteredRemoteAccessDevices.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings clearUnmeteredRemoteAccessDevicesEntries() {
        this.unmeteredRemoteAccessDevices = null;
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
        if (getAwsAccountNumber() != null)
            sb.append("AwsAccountNumber: " + getAwsAccountNumber() + ",");
        if (getUnmeteredDevices() != null)
            sb.append("UnmeteredDevices: " + getUnmeteredDevices() + ",");
        if (getUnmeteredRemoteAccessDevices() != null)
            sb.append("UnmeteredRemoteAccessDevices: " + getUnmeteredRemoteAccessDevices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountSettings == false)
            return false;
        AccountSettings other = (AccountSettings) obj;
        if (other.getAwsAccountNumber() == null ^ this.getAwsAccountNumber() == null)
            return false;
        if (other.getAwsAccountNumber() != null && other.getAwsAccountNumber().equals(this.getAwsAccountNumber()) == false)
            return false;
        if (other.getUnmeteredDevices() == null ^ this.getUnmeteredDevices() == null)
            return false;
        if (other.getUnmeteredDevices() != null && other.getUnmeteredDevices().equals(this.getUnmeteredDevices()) == false)
            return false;
        if (other.getUnmeteredRemoteAccessDevices() == null ^ this.getUnmeteredRemoteAccessDevices() == null)
            return false;
        if (other.getUnmeteredRemoteAccessDevices() != null && other.getUnmeteredRemoteAccessDevices().equals(this.getUnmeteredRemoteAccessDevices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountNumber() == null) ? 0 : getAwsAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getUnmeteredDevices() == null) ? 0 : getUnmeteredDevices().hashCode());
        hashCode = prime * hashCode + ((getUnmeteredRemoteAccessDevices() == null) ? 0 : getUnmeteredRemoteAccessDevices().hashCode());
        return hashCode;
    }

    @Override
    public AccountSettings clone() {
        try {
            return (AccountSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
