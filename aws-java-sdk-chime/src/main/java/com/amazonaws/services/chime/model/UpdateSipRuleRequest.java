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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateSipRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSipRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     */
    private String sipRuleId;
    /**
     * <p>
     * The new name for the specified SIP rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new value specified to indicate whether the rule is disabled.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The new value of the list of target applications.
     * </p>
     */
    private java.util.List<SipRuleTargetApplication> targetApplications;

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @param sipRuleId
     *        The SIP rule ID.
     */

    public void setSipRuleId(String sipRuleId) {
        this.sipRuleId = sipRuleId;
    }

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @return The SIP rule ID.
     */

    public String getSipRuleId() {
        return this.sipRuleId;
    }

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @param sipRuleId
     *        The SIP rule ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipRuleRequest withSipRuleId(String sipRuleId) {
        setSipRuleId(sipRuleId);
        return this;
    }

    /**
     * <p>
     * The new name for the specified SIP rule.
     * </p>
     * 
     * @param name
     *        The new name for the specified SIP rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name for the specified SIP rule.
     * </p>
     * 
     * @return The new name for the specified SIP rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name for the specified SIP rule.
     * </p>
     * 
     * @param name
     *        The new name for the specified SIP rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new value specified to indicate whether the rule is disabled.
     * </p>
     * 
     * @param disabled
     *        The new value specified to indicate whether the rule is disabled.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * The new value specified to indicate whether the rule is disabled.
     * </p>
     * 
     * @return The new value specified to indicate whether the rule is disabled.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The new value specified to indicate whether the rule is disabled.
     * </p>
     * 
     * @param disabled
     *        The new value specified to indicate whether the rule is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipRuleRequest withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * The new value specified to indicate whether the rule is disabled.
     * </p>
     * 
     * @return The new value specified to indicate whether the rule is disabled.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The new value of the list of target applications.
     * </p>
     * 
     * @return The new value of the list of target applications.
     */

    public java.util.List<SipRuleTargetApplication> getTargetApplications() {
        return targetApplications;
    }

    /**
     * <p>
     * The new value of the list of target applications.
     * </p>
     * 
     * @param targetApplications
     *        The new value of the list of target applications.
     */

    public void setTargetApplications(java.util.Collection<SipRuleTargetApplication> targetApplications) {
        if (targetApplications == null) {
            this.targetApplications = null;
            return;
        }

        this.targetApplications = new java.util.ArrayList<SipRuleTargetApplication>(targetApplications);
    }

    /**
     * <p>
     * The new value of the list of target applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetApplications(java.util.Collection)} or {@link #withTargetApplications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param targetApplications
     *        The new value of the list of target applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipRuleRequest withTargetApplications(SipRuleTargetApplication... targetApplications) {
        if (this.targetApplications == null) {
            setTargetApplications(new java.util.ArrayList<SipRuleTargetApplication>(targetApplications.length));
        }
        for (SipRuleTargetApplication ele : targetApplications) {
            this.targetApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The new value of the list of target applications.
     * </p>
     * 
     * @param targetApplications
     *        The new value of the list of target applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipRuleRequest withTargetApplications(java.util.Collection<SipRuleTargetApplication> targetApplications) {
        setTargetApplications(targetApplications);
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
        if (getSipRuleId() != null)
            sb.append("SipRuleId: ").append(getSipRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getTargetApplications() != null)
            sb.append("TargetApplications: ").append(getTargetApplications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSipRuleRequest == false)
            return false;
        UpdateSipRuleRequest other = (UpdateSipRuleRequest) obj;
        if (other.getSipRuleId() == null ^ this.getSipRuleId() == null)
            return false;
        if (other.getSipRuleId() != null && other.getSipRuleId().equals(this.getSipRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getTargetApplications() == null ^ this.getTargetApplications() == null)
            return false;
        if (other.getTargetApplications() != null && other.getTargetApplications().equals(this.getTargetApplications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipRuleId() == null) ? 0 : getSipRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getTargetApplications() == null) ? 0 : getTargetApplications().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSipRuleRequest clone() {
        return (UpdateSipRuleRequest) super.clone();
    }

}
