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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule that controls access to mobile devices for an Amazon WorkMail group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/MobileDeviceAccessRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MobileDeviceAccessRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID assigned to a mobile access rule.
     * </p>
     */
    private String mobileDeviceAccessRuleId;
    /**
     * <p>
     * The name of a mobile access rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of a mobile access rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     */
    private String effect;
    /**
     * <p>
     * Device types that a rule will match.
     * </p>
     */
    private java.util.List<String> deviceTypes;
    /**
     * <p>
     * Device types that a rule <b>will not</b> match. All other device types will match.
     * </p>
     */
    private java.util.List<String> notDeviceTypes;
    /**
     * <p>
     * Device models that a rule will match.
     * </p>
     */
    private java.util.List<String> deviceModels;
    /**
     * <p>
     * Device models that a rule <b>will not</b> match. All other device models will match.
     * </p>
     */
    private java.util.List<String> notDeviceModels;
    /**
     * <p>
     * Device operating systems that a rule will match.
     * </p>
     */
    private java.util.List<String> deviceOperatingSystems;
    /**
     * <p>
     * Device operating systems that a rule <b>will not</b> match. All other device types will match.
     * </p>
     */
    private java.util.List<String> notDeviceOperatingSystems;
    /**
     * <p>
     * Device user agents that a rule will match.
     * </p>
     */
    private java.util.List<String> deviceUserAgents;
    /**
     * <p>
     * Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     * </p>
     */
    private java.util.List<String> notDeviceUserAgents;
    /**
     * <p>
     * The date and time at which an access rule was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date and time at which an access rule was modified.
     * </p>
     */
    private java.util.Date dateModified;

    /**
     * <p>
     * The ID assigned to a mobile access rule.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        The ID assigned to a mobile access rule.
     */

    public void setMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
        this.mobileDeviceAccessRuleId = mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * The ID assigned to a mobile access rule.
     * </p>
     * 
     * @return The ID assigned to a mobile access rule.
     */

    public String getMobileDeviceAccessRuleId() {
        return this.mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * The ID assigned to a mobile access rule.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        The ID assigned to a mobile access rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
        setMobileDeviceAccessRuleId(mobileDeviceAccessRuleId);
        return this;
    }

    /**
     * <p>
     * The name of a mobile access rule.
     * </p>
     * 
     * @param name
     *        The name of a mobile access rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a mobile access rule.
     * </p>
     * 
     * @return The name of a mobile access rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a mobile access rule.
     * </p>
     * 
     * @param name
     *        The name of a mobile access rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of a mobile access rule.
     * </p>
     * 
     * @param description
     *        The description of a mobile access rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a mobile access rule.
     * </p>
     * 
     * @return The description of a mobile access rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a mobile access rule.
     * </p>
     * 
     * @param description
     *        The description of a mobile access rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * @see MobileDeviceAccessRuleEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @return The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * @see MobileDeviceAccessRuleEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MobileDeviceAccessRuleEffect
     */

    public MobileDeviceAccessRule withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the rule when it matches. Allowed values are <code>ALLOW</code> or <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MobileDeviceAccessRuleEffect
     */

    public MobileDeviceAccessRule withEffect(MobileDeviceAccessRuleEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * Device types that a rule will match.
     * </p>
     * 
     * @return Device types that a rule will match.
     */

    public java.util.List<String> getDeviceTypes() {
        return deviceTypes;
    }

    /**
     * <p>
     * Device types that a rule will match.
     * </p>
     * 
     * @param deviceTypes
     *        Device types that a rule will match.
     */

    public void setDeviceTypes(java.util.Collection<String> deviceTypes) {
        if (deviceTypes == null) {
            this.deviceTypes = null;
            return;
        }

        this.deviceTypes = new java.util.ArrayList<String>(deviceTypes);
    }

    /**
     * <p>
     * Device types that a rule will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceTypes(java.util.Collection)} or {@link #withDeviceTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceTypes
     *        Device types that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceTypes(String... deviceTypes) {
        if (this.deviceTypes == null) {
            setDeviceTypes(new java.util.ArrayList<String>(deviceTypes.length));
        }
        for (String ele : deviceTypes) {
            this.deviceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device types that a rule will match.
     * </p>
     * 
     * @param deviceTypes
     *        Device types that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceTypes(java.util.Collection<String> deviceTypes) {
        setDeviceTypes(deviceTypes);
        return this;
    }

    /**
     * <p>
     * Device types that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * 
     * @return Device types that a rule <b>will not</b> match. All other device types will match.
     */

    public java.util.List<String> getNotDeviceTypes() {
        return notDeviceTypes;
    }

    /**
     * <p>
     * Device types that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * 
     * @param notDeviceTypes
     *        Device types that a rule <b>will not</b> match. All other device types will match.
     */

    public void setNotDeviceTypes(java.util.Collection<String> notDeviceTypes) {
        if (notDeviceTypes == null) {
            this.notDeviceTypes = null;
            return;
        }

        this.notDeviceTypes = new java.util.ArrayList<String>(notDeviceTypes);
    }

    /**
     * <p>
     * Device types that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotDeviceTypes(java.util.Collection)} or {@link #withNotDeviceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notDeviceTypes
     *        Device types that a rule <b>will not</b> match. All other device types will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceTypes(String... notDeviceTypes) {
        if (this.notDeviceTypes == null) {
            setNotDeviceTypes(new java.util.ArrayList<String>(notDeviceTypes.length));
        }
        for (String ele : notDeviceTypes) {
            this.notDeviceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device types that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * 
     * @param notDeviceTypes
     *        Device types that a rule <b>will not</b> match. All other device types will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceTypes(java.util.Collection<String> notDeviceTypes) {
        setNotDeviceTypes(notDeviceTypes);
        return this;
    }

    /**
     * <p>
     * Device models that a rule will match.
     * </p>
     * 
     * @return Device models that a rule will match.
     */

    public java.util.List<String> getDeviceModels() {
        return deviceModels;
    }

    /**
     * <p>
     * Device models that a rule will match.
     * </p>
     * 
     * @param deviceModels
     *        Device models that a rule will match.
     */

    public void setDeviceModels(java.util.Collection<String> deviceModels) {
        if (deviceModels == null) {
            this.deviceModels = null;
            return;
        }

        this.deviceModels = new java.util.ArrayList<String>(deviceModels);
    }

    /**
     * <p>
     * Device models that a rule will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceModels(java.util.Collection)} or {@link #withDeviceModels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceModels
     *        Device models that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceModels(String... deviceModels) {
        if (this.deviceModels == null) {
            setDeviceModels(new java.util.ArrayList<String>(deviceModels.length));
        }
        for (String ele : deviceModels) {
            this.deviceModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device models that a rule will match.
     * </p>
     * 
     * @param deviceModels
     *        Device models that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceModels(java.util.Collection<String> deviceModels) {
        setDeviceModels(deviceModels);
        return this;
    }

    /**
     * <p>
     * Device models that a rule <b>will not</b> match. All other device models will match.
     * </p>
     * 
     * @return Device models that a rule <b>will not</b> match. All other device models will match.
     */

    public java.util.List<String> getNotDeviceModels() {
        return notDeviceModels;
    }

    /**
     * <p>
     * Device models that a rule <b>will not</b> match. All other device models will match.
     * </p>
     * 
     * @param notDeviceModels
     *        Device models that a rule <b>will not</b> match. All other device models will match.
     */

    public void setNotDeviceModels(java.util.Collection<String> notDeviceModels) {
        if (notDeviceModels == null) {
            this.notDeviceModels = null;
            return;
        }

        this.notDeviceModels = new java.util.ArrayList<String>(notDeviceModels);
    }

    /**
     * <p>
     * Device models that a rule <b>will not</b> match. All other device models will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotDeviceModels(java.util.Collection)} or {@link #withNotDeviceModels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notDeviceModels
     *        Device models that a rule <b>will not</b> match. All other device models will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceModels(String... notDeviceModels) {
        if (this.notDeviceModels == null) {
            setNotDeviceModels(new java.util.ArrayList<String>(notDeviceModels.length));
        }
        for (String ele : notDeviceModels) {
            this.notDeviceModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device models that a rule <b>will not</b> match. All other device models will match.
     * </p>
     * 
     * @param notDeviceModels
     *        Device models that a rule <b>will not</b> match. All other device models will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceModels(java.util.Collection<String> notDeviceModels) {
        setNotDeviceModels(notDeviceModels);
        return this;
    }

    /**
     * <p>
     * Device operating systems that a rule will match.
     * </p>
     * 
     * @return Device operating systems that a rule will match.
     */

    public java.util.List<String> getDeviceOperatingSystems() {
        return deviceOperatingSystems;
    }

    /**
     * <p>
     * Device operating systems that a rule will match.
     * </p>
     * 
     * @param deviceOperatingSystems
     *        Device operating systems that a rule will match.
     */

    public void setDeviceOperatingSystems(java.util.Collection<String> deviceOperatingSystems) {
        if (deviceOperatingSystems == null) {
            this.deviceOperatingSystems = null;
            return;
        }

        this.deviceOperatingSystems = new java.util.ArrayList<String>(deviceOperatingSystems);
    }

    /**
     * <p>
     * Device operating systems that a rule will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceOperatingSystems(java.util.Collection)} or
     * {@link #withDeviceOperatingSystems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deviceOperatingSystems
     *        Device operating systems that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceOperatingSystems(String... deviceOperatingSystems) {
        if (this.deviceOperatingSystems == null) {
            setDeviceOperatingSystems(new java.util.ArrayList<String>(deviceOperatingSystems.length));
        }
        for (String ele : deviceOperatingSystems) {
            this.deviceOperatingSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device operating systems that a rule will match.
     * </p>
     * 
     * @param deviceOperatingSystems
     *        Device operating systems that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceOperatingSystems(java.util.Collection<String> deviceOperatingSystems) {
        setDeviceOperatingSystems(deviceOperatingSystems);
        return this;
    }

    /**
     * <p>
     * Device operating systems that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * 
     * @return Device operating systems that a rule <b>will not</b> match. All other device types will match.
     */

    public java.util.List<String> getNotDeviceOperatingSystems() {
        return notDeviceOperatingSystems;
    }

    /**
     * <p>
     * Device operating systems that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * 
     * @param notDeviceOperatingSystems
     *        Device operating systems that a rule <b>will not</b> match. All other device types will match.
     */

    public void setNotDeviceOperatingSystems(java.util.Collection<String> notDeviceOperatingSystems) {
        if (notDeviceOperatingSystems == null) {
            this.notDeviceOperatingSystems = null;
            return;
        }

        this.notDeviceOperatingSystems = new java.util.ArrayList<String>(notDeviceOperatingSystems);
    }

    /**
     * <p>
     * Device operating systems that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotDeviceOperatingSystems(java.util.Collection)} or
     * {@link #withNotDeviceOperatingSystems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notDeviceOperatingSystems
     *        Device operating systems that a rule <b>will not</b> match. All other device types will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceOperatingSystems(String... notDeviceOperatingSystems) {
        if (this.notDeviceOperatingSystems == null) {
            setNotDeviceOperatingSystems(new java.util.ArrayList<String>(notDeviceOperatingSystems.length));
        }
        for (String ele : notDeviceOperatingSystems) {
            this.notDeviceOperatingSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device operating systems that a rule <b>will not</b> match. All other device types will match.
     * </p>
     * 
     * @param notDeviceOperatingSystems
     *        Device operating systems that a rule <b>will not</b> match. All other device types will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceOperatingSystems(java.util.Collection<String> notDeviceOperatingSystems) {
        setNotDeviceOperatingSystems(notDeviceOperatingSystems);
        return this;
    }

    /**
     * <p>
     * Device user agents that a rule will match.
     * </p>
     * 
     * @return Device user agents that a rule will match.
     */

    public java.util.List<String> getDeviceUserAgents() {
        return deviceUserAgents;
    }

    /**
     * <p>
     * Device user agents that a rule will match.
     * </p>
     * 
     * @param deviceUserAgents
     *        Device user agents that a rule will match.
     */

    public void setDeviceUserAgents(java.util.Collection<String> deviceUserAgents) {
        if (deviceUserAgents == null) {
            this.deviceUserAgents = null;
            return;
        }

        this.deviceUserAgents = new java.util.ArrayList<String>(deviceUserAgents);
    }

    /**
     * <p>
     * Device user agents that a rule will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceUserAgents(java.util.Collection)} or {@link #withDeviceUserAgents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deviceUserAgents
     *        Device user agents that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceUserAgents(String... deviceUserAgents) {
        if (this.deviceUserAgents == null) {
            setDeviceUserAgents(new java.util.ArrayList<String>(deviceUserAgents.length));
        }
        for (String ele : deviceUserAgents) {
            this.deviceUserAgents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device user agents that a rule will match.
     * </p>
     * 
     * @param deviceUserAgents
     *        Device user agents that a rule will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDeviceUserAgents(java.util.Collection<String> deviceUserAgents) {
        setDeviceUserAgents(deviceUserAgents);
        return this;
    }

    /**
     * <p>
     * Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     * </p>
     * 
     * @return Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     */

    public java.util.List<String> getNotDeviceUserAgents() {
        return notDeviceUserAgents;
    }

    /**
     * <p>
     * Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     * </p>
     * 
     * @param notDeviceUserAgents
     *        Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     */

    public void setNotDeviceUserAgents(java.util.Collection<String> notDeviceUserAgents) {
        if (notDeviceUserAgents == null) {
            this.notDeviceUserAgents = null;
            return;
        }

        this.notDeviceUserAgents = new java.util.ArrayList<String>(notDeviceUserAgents);
    }

    /**
     * <p>
     * Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotDeviceUserAgents(java.util.Collection)} or {@link #withNotDeviceUserAgents(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param notDeviceUserAgents
     *        Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceUserAgents(String... notDeviceUserAgents) {
        if (this.notDeviceUserAgents == null) {
            setNotDeviceUserAgents(new java.util.ArrayList<String>(notDeviceUserAgents.length));
        }
        for (String ele : notDeviceUserAgents) {
            this.notDeviceUserAgents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     * </p>
     * 
     * @param notDeviceUserAgents
     *        Device user agents that a rule <b>will not</b> match. All other device user agents will match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withNotDeviceUserAgents(java.util.Collection<String> notDeviceUserAgents) {
        setNotDeviceUserAgents(notDeviceUserAgents);
        return this;
    }

    /**
     * <p>
     * The date and time at which an access rule was created.
     * </p>
     * 
     * @param dateCreated
     *        The date and time at which an access rule was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date and time at which an access rule was created.
     * </p>
     * 
     * @return The date and time at which an access rule was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date and time at which an access rule was created.
     * </p>
     * 
     * @param dateCreated
     *        The date and time at which an access rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date and time at which an access rule was modified.
     * </p>
     * 
     * @param dateModified
     *        The date and time at which an access rule was modified.
     */

    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * <p>
     * The date and time at which an access rule was modified.
     * </p>
     * 
     * @return The date and time at which an access rule was modified.
     */

    public java.util.Date getDateModified() {
        return this.dateModified;
    }

    /**
     * <p>
     * The date and time at which an access rule was modified.
     * </p>
     * 
     * @param dateModified
     *        The date and time at which an access rule was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessRule withDateModified(java.util.Date dateModified) {
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
        if (getMobileDeviceAccessRuleId() != null)
            sb.append("MobileDeviceAccessRuleId: ").append(getMobileDeviceAccessRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getDeviceTypes() != null)
            sb.append("DeviceTypes: ").append(getDeviceTypes()).append(",");
        if (getNotDeviceTypes() != null)
            sb.append("NotDeviceTypes: ").append(getNotDeviceTypes()).append(",");
        if (getDeviceModels() != null)
            sb.append("DeviceModels: ").append(getDeviceModels()).append(",");
        if (getNotDeviceModels() != null)
            sb.append("NotDeviceModels: ").append(getNotDeviceModels()).append(",");
        if (getDeviceOperatingSystems() != null)
            sb.append("DeviceOperatingSystems: ").append(getDeviceOperatingSystems()).append(",");
        if (getNotDeviceOperatingSystems() != null)
            sb.append("NotDeviceOperatingSystems: ").append(getNotDeviceOperatingSystems()).append(",");
        if (getDeviceUserAgents() != null)
            sb.append("DeviceUserAgents: ").append(getDeviceUserAgents()).append(",");
        if (getNotDeviceUserAgents() != null)
            sb.append("NotDeviceUserAgents: ").append(getNotDeviceUserAgents()).append(",");
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

        if (obj instanceof MobileDeviceAccessRule == false)
            return false;
        MobileDeviceAccessRule other = (MobileDeviceAccessRule) obj;
        if (other.getMobileDeviceAccessRuleId() == null ^ this.getMobileDeviceAccessRuleId() == null)
            return false;
        if (other.getMobileDeviceAccessRuleId() != null && other.getMobileDeviceAccessRuleId().equals(this.getMobileDeviceAccessRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getDeviceTypes() == null ^ this.getDeviceTypes() == null)
            return false;
        if (other.getDeviceTypes() != null && other.getDeviceTypes().equals(this.getDeviceTypes()) == false)
            return false;
        if (other.getNotDeviceTypes() == null ^ this.getNotDeviceTypes() == null)
            return false;
        if (other.getNotDeviceTypes() != null && other.getNotDeviceTypes().equals(this.getNotDeviceTypes()) == false)
            return false;
        if (other.getDeviceModels() == null ^ this.getDeviceModels() == null)
            return false;
        if (other.getDeviceModels() != null && other.getDeviceModels().equals(this.getDeviceModels()) == false)
            return false;
        if (other.getNotDeviceModels() == null ^ this.getNotDeviceModels() == null)
            return false;
        if (other.getNotDeviceModels() != null && other.getNotDeviceModels().equals(this.getNotDeviceModels()) == false)
            return false;
        if (other.getDeviceOperatingSystems() == null ^ this.getDeviceOperatingSystems() == null)
            return false;
        if (other.getDeviceOperatingSystems() != null && other.getDeviceOperatingSystems().equals(this.getDeviceOperatingSystems()) == false)
            return false;
        if (other.getNotDeviceOperatingSystems() == null ^ this.getNotDeviceOperatingSystems() == null)
            return false;
        if (other.getNotDeviceOperatingSystems() != null && other.getNotDeviceOperatingSystems().equals(this.getNotDeviceOperatingSystems()) == false)
            return false;
        if (other.getDeviceUserAgents() == null ^ this.getDeviceUserAgents() == null)
            return false;
        if (other.getDeviceUserAgents() != null && other.getDeviceUserAgents().equals(this.getDeviceUserAgents()) == false)
            return false;
        if (other.getNotDeviceUserAgents() == null ^ this.getNotDeviceUserAgents() == null)
            return false;
        if (other.getNotDeviceUserAgents() != null && other.getNotDeviceUserAgents().equals(this.getNotDeviceUserAgents()) == false)
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

        hashCode = prime * hashCode + ((getMobileDeviceAccessRuleId() == null) ? 0 : getMobileDeviceAccessRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypes() == null) ? 0 : getDeviceTypes().hashCode());
        hashCode = prime * hashCode + ((getNotDeviceTypes() == null) ? 0 : getNotDeviceTypes().hashCode());
        hashCode = prime * hashCode + ((getDeviceModels() == null) ? 0 : getDeviceModels().hashCode());
        hashCode = prime * hashCode + ((getNotDeviceModels() == null) ? 0 : getNotDeviceModels().hashCode());
        hashCode = prime * hashCode + ((getDeviceOperatingSystems() == null) ? 0 : getDeviceOperatingSystems().hashCode());
        hashCode = prime * hashCode + ((getNotDeviceOperatingSystems() == null) ? 0 : getNotDeviceOperatingSystems().hashCode());
        hashCode = prime * hashCode + ((getDeviceUserAgents() == null) ? 0 : getDeviceUserAgents().hashCode());
        hashCode = prime * hashCode + ((getNotDeviceUserAgents() == null) ? 0 : getNotDeviceUserAgents().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateModified() == null) ? 0 : getDateModified().hashCode());
        return hashCode;
    }

    @Override
    public MobileDeviceAccessRule clone() {
        try {
            return (MobileDeviceAccessRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.MobileDeviceAccessRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
