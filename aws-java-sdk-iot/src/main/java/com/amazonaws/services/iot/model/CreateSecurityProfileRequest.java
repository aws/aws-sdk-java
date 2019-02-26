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
public class CreateSecurityProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you are giving to the security profile.
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
     * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are
     * generated when a device (thing) violates a behavior.
     * </p>
     */
    private java.util.Map<String, AlertTarget> alertTargets;
    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's <code>behaviors</code> but it is also retained for any metric specified here.
     * </p>
     */
    private java.util.List<String> additionalMetricsToRetain;
    /**
     * <p>
     * Metadata which can be used to manage the security profile.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name you are giving to the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name you are giving to the security profile.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name you are giving to the security profile.
     * </p>
     * 
     * @return The name you are giving to the security profile.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name you are giving to the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name you are giving to the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
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

    public CreateSecurityProfileRequest withSecurityProfileDescription(String securityProfileDescription) {
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

    public CreateSecurityProfileRequest withBehaviors(Behavior... behaviors) {
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

    public CreateSecurityProfileRequest withBehaviors(java.util.Collection<Behavior> behaviors) {
        setBehaviors(behaviors);
        return this;
    }

    /**
     * <p>
     * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are
     * generated when a device (thing) violates a behavior.
     * </p>
     * 
     * @return Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are
     *         generated when a device (thing) violates a behavior.
     */

    public java.util.Map<String, AlertTarget> getAlertTargets() {
        return alertTargets;
    }

    /**
     * <p>
     * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are
     * generated when a device (thing) violates a behavior.
     * </p>
     * 
     * @param alertTargets
     *        Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are
     *        generated when a device (thing) violates a behavior.
     */

    public void setAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        this.alertTargets = alertTargets;
    }

    /**
     * <p>
     * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are
     * generated when a device (thing) violates a behavior.
     * </p>
     * 
     * @param alertTargets
     *        Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are
     *        generated when a device (thing) violates a behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        setAlertTargets(alertTargets);
        return this;
    }

    public CreateSecurityProfileRequest addAlertTargetsEntry(String key, AlertTarget value) {
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

    public CreateSecurityProfileRequest clearAlertTargetsEntries() {
        this.alertTargets = null;
        return this;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's <code>behaviors</code> but it is also retained for any metric specified here.
     * </p>
     * 
     * @return A list of metrics whose data is retained (stored). By default, data is retained for any metric used in
     *         the profile's <code>behaviors</code> but it is also retained for any metric specified here.
     */

    public java.util.List<String> getAdditionalMetricsToRetain() {
        return additionalMetricsToRetain;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's <code>behaviors</code> but it is also retained for any metric specified here.
     * </p>
     * 
     * @param additionalMetricsToRetain
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        profile's <code>behaviors</code> but it is also retained for any metric specified here.
     */

    public void setAdditionalMetricsToRetain(java.util.Collection<String> additionalMetricsToRetain) {
        if (additionalMetricsToRetain == null) {
            this.additionalMetricsToRetain = null;
            return;
        }

        this.additionalMetricsToRetain = new java.util.ArrayList<String>(additionalMetricsToRetain);
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's <code>behaviors</code> but it is also retained for any metric specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalMetricsToRetain(java.util.Collection)} or
     * {@link #withAdditionalMetricsToRetain(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalMetricsToRetain
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        profile's <code>behaviors</code> but it is also retained for any metric specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withAdditionalMetricsToRetain(String... additionalMetricsToRetain) {
        if (this.additionalMetricsToRetain == null) {
            setAdditionalMetricsToRetain(new java.util.ArrayList<String>(additionalMetricsToRetain.length));
        }
        for (String ele : additionalMetricsToRetain) {
            this.additionalMetricsToRetain.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     * profile's <code>behaviors</code> but it is also retained for any metric specified here.
     * </p>
     * 
     * @param additionalMetricsToRetain
     *        A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the
     *        profile's <code>behaviors</code> but it is also retained for any metric specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withAdditionalMetricsToRetain(java.util.Collection<String> additionalMetricsToRetain) {
        setAdditionalMetricsToRetain(additionalMetricsToRetain);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the security profile.
     * </p>
     * 
     * @return Metadata which can be used to manage the security profile.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the security profile.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the security profile.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the security profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the security profile.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAdditionalMetricsToRetain() != null)
            sb.append("AdditionalMetricsToRetain: ").append(getAdditionalMetricsToRetain()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityProfileRequest == false)
            return false;
        CreateSecurityProfileRequest other = (CreateSecurityProfileRequest) obj;
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
        if (other.getAdditionalMetricsToRetain() == null ^ this.getAdditionalMetricsToRetain() == null)
            return false;
        if (other.getAdditionalMetricsToRetain() != null && other.getAdditionalMetricsToRetain().equals(this.getAdditionalMetricsToRetain()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getAdditionalMetricsToRetain() == null) ? 0 : getAdditionalMetricsToRetain().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityProfileRequest clone() {
        return (CreateSecurityProfileRequest) super.clone();
    }

}
