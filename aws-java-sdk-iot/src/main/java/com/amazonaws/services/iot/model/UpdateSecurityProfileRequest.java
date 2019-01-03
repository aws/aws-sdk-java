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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * A description of the security profile.
     * </p>
     */
    private String securityProfileDescription;
    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     */
    private java.util.List<Behavior> behaviors;
    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     */
    private java.util.Map<String, AlertTarget> alertTargets;
    /**
     * <p>
     * The expected version of the security profile. A new version is generated whenever the security profile is
     * updated. If you specify a value that is different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile you want to update.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * 
     * @return The name of the security profile you want to update.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * 
     * @param securityProfileDescription
     *        A description of the security profile.
     */

    public void setSecurityProfileDescription(String securityProfileDescription) {
        this.securityProfileDescription = securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * 
     * @return A description of the security profile.
     */

    public String getSecurityProfileDescription() {
        return this.securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * 
     * @param securityProfileDescription
     *        A description of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withSecurityProfileDescription(String securityProfileDescription) {
        setSecurityProfileDescription(securityProfileDescription);
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @return Specifies the behaviors that, when violated by a device (thing), cause an alert.
     */

    public java.util.List<Behavior> getBehaviors() {
        return behaviors;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     */

    public void setBehaviors(java.util.Collection<Behavior> behaviors) {
        if (behaviors == null) {
            this.behaviors = null;
            return;
        }

        this.behaviors = new java.util.ArrayList<Behavior>(behaviors);
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBehaviors(java.util.Collection)} or {@link #withBehaviors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withBehaviors(Behavior... behaviors) {
        if (this.behaviors == null) {
            setBehaviors(new java.util.ArrayList<Behavior>(behaviors.length));
        }
        for (Behavior ele : behaviors) {
            this.behaviors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withBehaviors(java.util.Collection<Behavior> behaviors) {
        setBehaviors(behaviors);
        return this;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * 
     * @return Where the alerts are sent. (Alerts are always sent to the console.)
     */

    public java.util.Map<String, AlertTarget> getAlertTargets() {
        return alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * 
     * @param alertTargets
     *        Where the alerts are sent. (Alerts are always sent to the console.)
     */

    public void setAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        this.alertTargets = alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * 
     * @param alertTargets
     *        Where the alerts are sent. (Alerts are always sent to the console.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        setAlertTargets(alertTargets);
        return this;
    }

    public UpdateSecurityProfileRequest addAlertTargetsEntry(String key, AlertTarget value) {
        if (null == this.alertTargets) {
            this.alertTargets = new java.util.HashMap<String, AlertTarget>();
        }
        if (this.alertTargets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.alertTargets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AlertTargets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest clearAlertTargetsEntries() {
        this.alertTargets = null;
        return this;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated whenever the security profile is
     * updated. If you specify a value that is different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the security profile. A new version is generated whenever the security profile is
     *        updated. If you specify a value that is different than the actual version, a
     *        <code>VersionConflictException</code> is thrown.
     */

    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated whenever the security profile is
     * updated. If you specify a value that is different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     * 
     * @return The expected version of the security profile. A new version is generated whenever the security profile is
     *         updated. If you specify a value that is different than the actual version, a
     *         <code>VersionConflictException</code> is thrown.
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated whenever the security profile is
     * updated. If you specify a value that is different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the security profile. A new version is generated whenever the security profile is
     *        updated. If you specify a value that is different than the actual version, a
     *        <code>VersionConflictException</code> is thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
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
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getSecurityProfileDescription() != null)
            sb.append("SecurityProfileDescription: ").append(getSecurityProfileDescription()).append(",");
        if (getBehaviors() != null)
            sb.append("Behaviors: ").append(getBehaviors()).append(",");
        if (getAlertTargets() != null)
            sb.append("AlertTargets: ").append(getAlertTargets()).append(",");
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityProfileRequest == false)
            return false;
        UpdateSecurityProfileRequest other = (UpdateSecurityProfileRequest) obj;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileDescription() == null ^ this.getSecurityProfileDescription() == null)
            return false;
        if (other.getSecurityProfileDescription() != null && other.getSecurityProfileDescription().equals(this.getSecurityProfileDescription()) == false)
            return false;
        if (other.getBehaviors() == null ^ this.getBehaviors() == null)
            return false;
        if (other.getBehaviors() != null && other.getBehaviors().equals(this.getBehaviors()) == false)
            return false;
        if (other.getAlertTargets() == null ^ this.getAlertTargets() == null)
            return false;
        if (other.getAlertTargets() != null && other.getAlertTargets().equals(this.getAlertTargets()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileDescription() == null) ? 0 : getSecurityProfileDescription().hashCode());
        hashCode = prime * hashCode + ((getBehaviors() == null) ? 0 : getBehaviors().hashCode());
        hashCode = prime * hashCode + ((getAlertTargets() == null) ? 0 : getAlertTargets().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityProfileRequest clone() {
        return (UpdateSecurityProfileRequest) super.clone();
    }

}
