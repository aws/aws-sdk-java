/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule that controls access to an Amazon WorkMail organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AccessControlRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rule name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The rule effect.
     * </p>
     */
    private String effect;
    /**
     * <p>
     * The rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     */
    private java.util.List<String> ipRanges;
    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     */
    private java.util.List<String> notIpRanges;
    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     */
    private java.util.List<String> notActions;
    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     */
    private java.util.List<String> userIds;
    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     */
    private java.util.List<String> notUserIds;
    /**
     * <p>
     * The date that the rule was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date that the rule was modified.
     * </p>
     */
    private java.util.Date dateModified;

    /**
     * <p>
     * The rule name.
     * </p>
     * 
     * @param name
     *        The rule name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The rule name.
     * </p>
     * 
     * @return The rule name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The rule name.
     * </p>
     * 
     * @param name
     *        The rule name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * 
     * @param effect
     *        The rule effect.
     * @see AccessControlRuleEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * 
     * @return The rule effect.
     * @see AccessControlRuleEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * 
     * @param effect
     *        The rule effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessControlRuleEffect
     */

    public AccessControlRule withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * 
     * @param effect
     *        The rule effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessControlRuleEffect
     */

    public AccessControlRule withEffect(AccessControlRuleEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @param description
     *        The rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @return The rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @param description
     *        The rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     * 
     * @return IPv4 CIDR ranges to include in the rule.
     */

    public java.util.List<String> getIpRanges() {
        return ipRanges;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     * 
     * @param ipRanges
     *        IPv4 CIDR ranges to include in the rule.
     */

    public void setIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }

        this.ipRanges = new java.util.ArrayList<String>(ipRanges);
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRanges(java.util.Collection)} or {@link #withIpRanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ipRanges
     *        IPv4 CIDR ranges to include in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withIpRanges(String... ipRanges) {
        if (this.ipRanges == null) {
            setIpRanges(new java.util.ArrayList<String>(ipRanges.length));
        }
        for (String ele : ipRanges) {
            this.ipRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to include in the rule.
     * </p>
     * 
     * @param ipRanges
     *        IPv4 CIDR ranges to include in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withIpRanges(java.util.Collection<String> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     * 
     * @return IPv4 CIDR ranges to exclude from the rule.
     */

    public java.util.List<String> getNotIpRanges() {
        return notIpRanges;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     * 
     * @param notIpRanges
     *        IPv4 CIDR ranges to exclude from the rule.
     */

    public void setNotIpRanges(java.util.Collection<String> notIpRanges) {
        if (notIpRanges == null) {
            this.notIpRanges = null;
            return;
        }

        this.notIpRanges = new java.util.ArrayList<String>(notIpRanges);
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotIpRanges(java.util.Collection)} or {@link #withNotIpRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notIpRanges
     *        IPv4 CIDR ranges to exclude from the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withNotIpRanges(String... notIpRanges) {
        if (this.notIpRanges == null) {
            setNotIpRanges(new java.util.ArrayList<String>(notIpRanges.length));
        }
        for (String ele : notIpRanges) {
            this.notIpRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IPv4 CIDR ranges to exclude from the rule.
     * </p>
     * 
     * @param notIpRanges
     *        IPv4 CIDR ranges to exclude from the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withNotIpRanges(java.util.Collection<String> notIpRanges) {
        setNotIpRanges(notIpRanges);
        return this;
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * 
     * @return Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     *         <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *         <code>WindowsOutlook</code>, and <code>WebMail</code>.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * 
     * @param actions
     *        Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     *        <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *        <code>WindowsOutlook</code>, and <code>WebMail</code>.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     *        <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *        <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * 
     * @param actions
     *        Access protocol actions to include in the rule. Valid values include <code>ActiveSync</code>,
     *        <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *        <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * 
     * @return Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     *         <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *         <code>WindowsOutlook</code>, and <code>WebMail</code>.
     */

    public java.util.List<String> getNotActions() {
        return notActions;
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * 
     * @param notActions
     *        Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     *        <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *        <code>WindowsOutlook</code>, and <code>WebMail</code>.
     */

    public void setNotActions(java.util.Collection<String> notActions) {
        if (notActions == null) {
            this.notActions = null;
            return;
        }

        this.notActions = new java.util.ArrayList<String>(notActions);
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotActions(java.util.Collection)} or {@link #withNotActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notActions
     *        Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     *        <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *        <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withNotActions(String... notActions) {
        if (this.notActions == null) {
            setNotActions(new java.util.ArrayList<String>(notActions.length));
        }
        for (String ele : notActions) {
            this.notActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>,
     * and <code>WebMail</code>.
     * </p>
     * 
     * @param notActions
     *        Access protocol actions to exclude from the rule. Valid values include <code>ActiveSync</code>,
     *        <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *        <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withNotActions(java.util.Collection<String> notActions) {
        setNotActions(notActions);
        return this;
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     * 
     * @return User IDs to include in the rule.
     */

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     * 
     * @param userIds
     *        User IDs to include in the rule.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        User IDs to include in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new java.util.ArrayList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * User IDs to include in the rule.
     * </p>
     * 
     * @param userIds
     *        User IDs to include in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     * 
     * @return User IDs to exclude from the rule.
     */

    public java.util.List<String> getNotUserIds() {
        return notUserIds;
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     * 
     * @param notUserIds
     *        User IDs to exclude from the rule.
     */

    public void setNotUserIds(java.util.Collection<String> notUserIds) {
        if (notUserIds == null) {
            this.notUserIds = null;
            return;
        }

        this.notUserIds = new java.util.ArrayList<String>(notUserIds);
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotUserIds(java.util.Collection)} or {@link #withNotUserIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notUserIds
     *        User IDs to exclude from the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withNotUserIds(String... notUserIds) {
        if (this.notUserIds == null) {
            setNotUserIds(new java.util.ArrayList<String>(notUserIds.length));
        }
        for (String ele : notUserIds) {
            this.notUserIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * User IDs to exclude from the rule.
     * </p>
     * 
     * @param notUserIds
     *        User IDs to exclude from the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withNotUserIds(java.util.Collection<String> notUserIds) {
        setNotUserIds(notUserIds);
        return this;
    }

    /**
     * <p>
     * The date that the rule was created.
     * </p>
     * 
     * @param dateCreated
     *        The date that the rule was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date that the rule was created.
     * </p>
     * 
     * @return The date that the rule was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date that the rule was created.
     * </p>
     * 
     * @param dateCreated
     *        The date that the rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date that the rule was modified.
     * </p>
     * 
     * @param dateModified
     *        The date that the rule was modified.
     */

    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * <p>
     * The date that the rule was modified.
     * </p>
     * 
     * @return The date that the rule was modified.
     */

    public java.util.Date getDateModified() {
        return this.dateModified;
    }

    /**
     * <p>
     * The date that the rule was modified.
     * </p>
     * 
     * @param dateModified
     *        The date that the rule was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlRule withDateModified(java.util.Date dateModified) {
        setDateModified(dateModified);
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
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIpRanges() != null)
            sb.append("IpRanges: ").append(getIpRanges()).append(",");
        if (getNotIpRanges() != null)
            sb.append("NotIpRanges: ").append(getNotIpRanges()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getNotActions() != null)
            sb.append("NotActions: ").append(getNotActions()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getNotUserIds() != null)
            sb.append("NotUserIds: ").append(getNotUserIds()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateModified() != null)
            sb.append("DateModified: ").append(getDateModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlRule == false)
            return false;
        AccessControlRule other = (AccessControlRule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIpRanges() == null ^ this.getIpRanges() == null)
            return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false)
            return false;
        if (other.getNotIpRanges() == null ^ this.getNotIpRanges() == null)
            return false;
        if (other.getNotIpRanges() != null && other.getNotIpRanges().equals(this.getNotIpRanges()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getNotActions() == null ^ this.getNotActions() == null)
            return false;
        if (other.getNotActions() != null && other.getNotActions().equals(this.getNotActions()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getNotUserIds() == null ^ this.getNotUserIds() == null)
            return false;
        if (other.getNotUserIds() != null && other.getNotUserIds().equals(this.getNotUserIds()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateModified() == null ^ this.getDateModified() == null)
            return false;
        if (other.getDateModified() != null && other.getDateModified().equals(this.getDateModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode());
        hashCode = prime * hashCode + ((getNotIpRanges() == null) ? 0 : getNotIpRanges().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getNotActions() == null) ? 0 : getNotActions().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getNotUserIds() == null) ? 0 : getNotUserIds().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateModified() == null) ? 0 : getDateModified().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlRule clone() {
        try {
            return (AccessControlRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.AccessControlRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
