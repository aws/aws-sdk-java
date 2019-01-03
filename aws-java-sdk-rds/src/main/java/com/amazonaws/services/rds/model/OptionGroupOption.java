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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Available option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/OptionGroupOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionGroupOption implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the option.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     */
    private String majorEngineVersion;
    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     */
    private String minimumRequiredMinorEngineVersion;
    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     */
    private Boolean portRequired;
    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     */
    private Integer defaultPort;
    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> optionsDependedOn;
    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> optionsConflictsWith;
    /**
     * <p>
     * Persistent options can't be removed from an option group while DB instances are associated with the option group.
     * If you disassociate all DB instances from the option group, your can remove the persistent option from the option
     * group.
     * </p>
     */
    private Boolean persistent;
    /**
     * <p>
     * Permanent options can never be removed from an option group. An option group containing a permanent option can't
     * be removed from a DB instance.
     * </p>
     */
    private Boolean permanent;
    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this
     * option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB
     * instance later.
     * </p>
     */
    private Boolean requiresAutoMinorEngineVersionUpgrade;
    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a VPC.
     * </p>
     */
    private Boolean vpcOnly;
    /**
     * <p>
     * If true, you can change the option to an earlier version of the option. This only applies to options that have
     * different versions available.
     * </p>
     */
    private Boolean supportsOptionVersionDowngrade;
    /**
     * <p>
     * The option settings that are available (and the default value) for each option in an option group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting> optionGroupOptionSettings;
    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionVersion> optionGroupOptionVersions;

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param name
     *        The name of the option.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @return The name of the option.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param name
     *        The name of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @param description
     *        The description of the option.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @return The description of the option.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @param description
     *        The description of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     * 
     * @param engineName
     *        The name of the engine that this option can be applied to.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     * 
     * @return The name of the engine that this option can be applied to.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     * 
     * @param engineName
     *        The name of the engine that this option can be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     * 
     * @param majorEngineVersion
     *        Indicates the major engine version that the option is available for.
     */

    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     * 
     * @return Indicates the major engine version that the option is available for.
     */

    public String getMajorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     * 
     * @param majorEngineVersion
     *        Indicates the major engine version that the option is available for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withMajorEngineVersion(String majorEngineVersion) {
        setMajorEngineVersion(majorEngineVersion);
        return this;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     * 
     * @param minimumRequiredMinorEngineVersion
     *        The minimum required engine version for the option to be applied.
     */

    public void setMinimumRequiredMinorEngineVersion(String minimumRequiredMinorEngineVersion) {
        this.minimumRequiredMinorEngineVersion = minimumRequiredMinorEngineVersion;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     * 
     * @return The minimum required engine version for the option to be applied.
     */

    public String getMinimumRequiredMinorEngineVersion() {
        return this.minimumRequiredMinorEngineVersion;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     * 
     * @param minimumRequiredMinorEngineVersion
     *        The minimum required engine version for the option to be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withMinimumRequiredMinorEngineVersion(String minimumRequiredMinorEngineVersion) {
        setMinimumRequiredMinorEngineVersion(minimumRequiredMinorEngineVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @param portRequired
     *        Specifies whether the option requires a port.
     */

    public void setPortRequired(Boolean portRequired) {
        this.portRequired = portRequired;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @return Specifies whether the option requires a port.
     */

    public Boolean getPortRequired() {
        return this.portRequired;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @param portRequired
     *        Specifies whether the option requires a port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withPortRequired(Boolean portRequired) {
        setPortRequired(portRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @return Specifies whether the option requires a port.
     */

    public Boolean isPortRequired() {
        return this.portRequired;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     * 
     * @param defaultPort
     *        If the option requires a port, specifies the default port for the option.
     */

    public void setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     * 
     * @return If the option requires a port, specifies the default port for the option.
     */

    public Integer getDefaultPort() {
        return this.defaultPort;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     * 
     * @param defaultPort
     *        If the option requires a port, specifies the default port for the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withDefaultPort(Integer defaultPort) {
        setDefaultPort(defaultPort);
        return this;
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     * 
     * @return The options that are prerequisites for this option.
     */

    public java.util.List<String> getOptionsDependedOn() {
        if (optionsDependedOn == null) {
            optionsDependedOn = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return optionsDependedOn;
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     * 
     * @param optionsDependedOn
     *        The options that are prerequisites for this option.
     */

    public void setOptionsDependedOn(java.util.Collection<String> optionsDependedOn) {
        if (optionsDependedOn == null) {
            this.optionsDependedOn = null;
            return;
        }

        this.optionsDependedOn = new com.amazonaws.internal.SdkInternalList<String>(optionsDependedOn);
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionsDependedOn(java.util.Collection)} or {@link #withOptionsDependedOn(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param optionsDependedOn
     *        The options that are prerequisites for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionsDependedOn(String... optionsDependedOn) {
        if (this.optionsDependedOn == null) {
            setOptionsDependedOn(new com.amazonaws.internal.SdkInternalList<String>(optionsDependedOn.length));
        }
        for (String ele : optionsDependedOn) {
            this.optionsDependedOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     * 
     * @param optionsDependedOn
     *        The options that are prerequisites for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionsDependedOn(java.util.Collection<String> optionsDependedOn) {
        setOptionsDependedOn(optionsDependedOn);
        return this;
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     * 
     * @return The options that conflict with this option.
     */

    public java.util.List<String> getOptionsConflictsWith() {
        if (optionsConflictsWith == null) {
            optionsConflictsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return optionsConflictsWith;
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     * 
     * @param optionsConflictsWith
     *        The options that conflict with this option.
     */

    public void setOptionsConflictsWith(java.util.Collection<String> optionsConflictsWith) {
        if (optionsConflictsWith == null) {
            this.optionsConflictsWith = null;
            return;
        }

        this.optionsConflictsWith = new com.amazonaws.internal.SdkInternalList<String>(optionsConflictsWith);
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionsConflictsWith(java.util.Collection)} or {@link #withOptionsConflictsWith(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param optionsConflictsWith
     *        The options that conflict with this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionsConflictsWith(String... optionsConflictsWith) {
        if (this.optionsConflictsWith == null) {
            setOptionsConflictsWith(new com.amazonaws.internal.SdkInternalList<String>(optionsConflictsWith.length));
        }
        for (String ele : optionsConflictsWith) {
            this.optionsConflictsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     * 
     * @param optionsConflictsWith
     *        The options that conflict with this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionsConflictsWith(java.util.Collection<String> optionsConflictsWith) {
        setOptionsConflictsWith(optionsConflictsWith);
        return this;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB instances are associated with the option group.
     * If you disassociate all DB instances from the option group, your can remove the persistent option from the option
     * group.
     * </p>
     * 
     * @param persistent
     *        Persistent options can't be removed from an option group while DB instances are associated with the option
     *        group. If you disassociate all DB instances from the option group, your can remove the persistent option
     *        from the option group.
     */

    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB instances are associated with the option group.
     * If you disassociate all DB instances from the option group, your can remove the persistent option from the option
     * group.
     * </p>
     * 
     * @return Persistent options can't be removed from an option group while DB instances are associated with the
     *         option group. If you disassociate all DB instances from the option group, your can remove the persistent
     *         option from the option group.
     */

    public Boolean getPersistent() {
        return this.persistent;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB instances are associated with the option group.
     * If you disassociate all DB instances from the option group, your can remove the persistent option from the option
     * group.
     * </p>
     * 
     * @param persistent
     *        Persistent options can't be removed from an option group while DB instances are associated with the option
     *        group. If you disassociate all DB instances from the option group, your can remove the persistent option
     *        from the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withPersistent(Boolean persistent) {
        setPersistent(persistent);
        return this;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB instances are associated with the option group.
     * If you disassociate all DB instances from the option group, your can remove the persistent option from the option
     * group.
     * </p>
     * 
     * @return Persistent options can't be removed from an option group while DB instances are associated with the
     *         option group. If you disassociate all DB instances from the option group, your can remove the persistent
     *         option from the option group.
     */

    public Boolean isPersistent() {
        return this.persistent;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option group containing a permanent option can't
     * be removed from a DB instance.
     * </p>
     * 
     * @param permanent
     *        Permanent options can never be removed from an option group. An option group containing a permanent option
     *        can't be removed from a DB instance.
     */

    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option group containing a permanent option can't
     * be removed from a DB instance.
     * </p>
     * 
     * @return Permanent options can never be removed from an option group. An option group containing a permanent
     *         option can't be removed from a DB instance.
     */

    public Boolean getPermanent() {
        return this.permanent;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option group containing a permanent option can't
     * be removed from a DB instance.
     * </p>
     * 
     * @param permanent
     *        Permanent options can never be removed from an option group. An option group containing a permanent option
     *        can't be removed from a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withPermanent(Boolean permanent) {
        setPermanent(permanent);
        return this;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option group containing a permanent option can't
     * be removed from a DB instance.
     * </p>
     * 
     * @return Permanent options can never be removed from an option group. An option group containing a permanent
     *         option can't be removed from a DB instance.
     */

    public Boolean isPermanent() {
        return this.permanent;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this
     * option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB
     * instance later.
     * </p>
     * 
     * @param requiresAutoMinorEngineVersionUpgrade
     *        If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use
     *        this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by
     *        modifying your DB instance later.
     */

    public void setRequiresAutoMinorEngineVersionUpgrade(Boolean requiresAutoMinorEngineVersionUpgrade) {
        this.requiresAutoMinorEngineVersionUpgrade = requiresAutoMinorEngineVersionUpgrade;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this
     * option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB
     * instance later.
     * </p>
     * 
     * @return If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use
     *         this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by
     *         modifying your DB instance later.
     */

    public Boolean getRequiresAutoMinorEngineVersionUpgrade() {
        return this.requiresAutoMinorEngineVersionUpgrade;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this
     * option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB
     * instance later.
     * </p>
     * 
     * @param requiresAutoMinorEngineVersionUpgrade
     *        If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use
     *        this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by
     *        modifying your DB instance later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withRequiresAutoMinorEngineVersionUpgrade(Boolean requiresAutoMinorEngineVersionUpgrade) {
        setRequiresAutoMinorEngineVersionUpgrade(requiresAutoMinorEngineVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this
     * option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB
     * instance later.
     * </p>
     * 
     * @return If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use
     *         this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by
     *         modifying your DB instance later.
     */

    public Boolean isRequiresAutoMinorEngineVersionUpgrade() {
        return this.requiresAutoMinorEngineVersionUpgrade;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a VPC.
     * </p>
     * 
     * @param vpcOnly
     *        If true, you can only use this option with a DB instance that is in a VPC.
     */

    public void setVpcOnly(Boolean vpcOnly) {
        this.vpcOnly = vpcOnly;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a VPC.
     * </p>
     * 
     * @return If true, you can only use this option with a DB instance that is in a VPC.
     */

    public Boolean getVpcOnly() {
        return this.vpcOnly;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a VPC.
     * </p>
     * 
     * @param vpcOnly
     *        If true, you can only use this option with a DB instance that is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withVpcOnly(Boolean vpcOnly) {
        setVpcOnly(vpcOnly);
        return this;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a VPC.
     * </p>
     * 
     * @return If true, you can only use this option with a DB instance that is in a VPC.
     */

    public Boolean isVpcOnly() {
        return this.vpcOnly;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option. This only applies to options that have
     * different versions available.
     * </p>
     * 
     * @param supportsOptionVersionDowngrade
     *        If true, you can change the option to an earlier version of the option. This only applies to options that
     *        have different versions available.
     */

    public void setSupportsOptionVersionDowngrade(Boolean supportsOptionVersionDowngrade) {
        this.supportsOptionVersionDowngrade = supportsOptionVersionDowngrade;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option. This only applies to options that have
     * different versions available.
     * </p>
     * 
     * @return If true, you can change the option to an earlier version of the option. This only applies to options that
     *         have different versions available.
     */

    public Boolean getSupportsOptionVersionDowngrade() {
        return this.supportsOptionVersionDowngrade;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option. This only applies to options that have
     * different versions available.
     * </p>
     * 
     * @param supportsOptionVersionDowngrade
     *        If true, you can change the option to an earlier version of the option. This only applies to options that
     *        have different versions available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withSupportsOptionVersionDowngrade(Boolean supportsOptionVersionDowngrade) {
        setSupportsOptionVersionDowngrade(supportsOptionVersionDowngrade);
        return this;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option. This only applies to options that have
     * different versions available.
     * </p>
     * 
     * @return If true, you can change the option to an earlier version of the option. This only applies to options that
     *         have different versions available.
     */

    public Boolean isSupportsOptionVersionDowngrade() {
        return this.supportsOptionVersionDowngrade;
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each option in an option group.
     * </p>
     * 
     * @return The option settings that are available (and the default value) for each option in an option group.
     */

    public java.util.List<OptionGroupOptionSetting> getOptionGroupOptionSettings() {
        if (optionGroupOptionSettings == null) {
            optionGroupOptionSettings = new com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting>();
        }
        return optionGroupOptionSettings;
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each option in an option group.
     * </p>
     * 
     * @param optionGroupOptionSettings
     *        The option settings that are available (and the default value) for each option in an option group.
     */

    public void setOptionGroupOptionSettings(java.util.Collection<OptionGroupOptionSetting> optionGroupOptionSettings) {
        if (optionGroupOptionSettings == null) {
            this.optionGroupOptionSettings = null;
            return;
        }

        this.optionGroupOptionSettings = new com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting>(optionGroupOptionSettings);
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each option in an option group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionGroupOptionSettings(java.util.Collection)} or
     * {@link #withOptionGroupOptionSettings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param optionGroupOptionSettings
     *        The option settings that are available (and the default value) for each option in an option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionGroupOptionSettings(OptionGroupOptionSetting... optionGroupOptionSettings) {
        if (this.optionGroupOptionSettings == null) {
            setOptionGroupOptionSettings(new com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting>(optionGroupOptionSettings.length));
        }
        for (OptionGroupOptionSetting ele : optionGroupOptionSettings) {
            this.optionGroupOptionSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each option in an option group.
     * </p>
     * 
     * @param optionGroupOptionSettings
     *        The option settings that are available (and the default value) for each option in an option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionGroupOptionSettings(java.util.Collection<OptionGroupOptionSetting> optionGroupOptionSettings) {
        setOptionGroupOptionSettings(optionGroupOptionSettings);
        return this;
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     * 
     * @return The versions that are available for the option.
     */

    public java.util.List<OptionVersion> getOptionGroupOptionVersions() {
        if (optionGroupOptionVersions == null) {
            optionGroupOptionVersions = new com.amazonaws.internal.SdkInternalList<OptionVersion>();
        }
        return optionGroupOptionVersions;
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     * 
     * @param optionGroupOptionVersions
     *        The versions that are available for the option.
     */

    public void setOptionGroupOptionVersions(java.util.Collection<OptionVersion> optionGroupOptionVersions) {
        if (optionGroupOptionVersions == null) {
            this.optionGroupOptionVersions = null;
            return;
        }

        this.optionGroupOptionVersions = new com.amazonaws.internal.SdkInternalList<OptionVersion>(optionGroupOptionVersions);
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionGroupOptionVersions(java.util.Collection)} or
     * {@link #withOptionGroupOptionVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param optionGroupOptionVersions
     *        The versions that are available for the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionGroupOptionVersions(OptionVersion... optionGroupOptionVersions) {
        if (this.optionGroupOptionVersions == null) {
            setOptionGroupOptionVersions(new com.amazonaws.internal.SdkInternalList<OptionVersion>(optionGroupOptionVersions.length));
        }
        for (OptionVersion ele : optionGroupOptionVersions) {
            this.optionGroupOptionVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     * 
     * @param optionGroupOptionVersions
     *        The versions that are available for the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOption withOptionGroupOptionVersions(java.util.Collection<OptionVersion> optionGroupOptionVersions) {
        setOptionGroupOptionVersions(optionGroupOptionVersions);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: ").append(getMajorEngineVersion()).append(",");
        if (getMinimumRequiredMinorEngineVersion() != null)
            sb.append("MinimumRequiredMinorEngineVersion: ").append(getMinimumRequiredMinorEngineVersion()).append(",");
        if (getPortRequired() != null)
            sb.append("PortRequired: ").append(getPortRequired()).append(",");
        if (getDefaultPort() != null)
            sb.append("DefaultPort: ").append(getDefaultPort()).append(",");
        if (getOptionsDependedOn() != null)
            sb.append("OptionsDependedOn: ").append(getOptionsDependedOn()).append(",");
        if (getOptionsConflictsWith() != null)
            sb.append("OptionsConflictsWith: ").append(getOptionsConflictsWith()).append(",");
        if (getPersistent() != null)
            sb.append("Persistent: ").append(getPersistent()).append(",");
        if (getPermanent() != null)
            sb.append("Permanent: ").append(getPermanent()).append(",");
        if (getRequiresAutoMinorEngineVersionUpgrade() != null)
            sb.append("RequiresAutoMinorEngineVersionUpgrade: ").append(getRequiresAutoMinorEngineVersionUpgrade()).append(",");
        if (getVpcOnly() != null)
            sb.append("VpcOnly: ").append(getVpcOnly()).append(",");
        if (getSupportsOptionVersionDowngrade() != null)
            sb.append("SupportsOptionVersionDowngrade: ").append(getSupportsOptionVersionDowngrade()).append(",");
        if (getOptionGroupOptionSettings() != null)
            sb.append("OptionGroupOptionSettings: ").append(getOptionGroupOptionSettings()).append(",");
        if (getOptionGroupOptionVersions() != null)
            sb.append("OptionGroupOptionVersions: ").append(getOptionGroupOptionVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroupOption == false)
            return false;
        OptionGroupOption other = (OptionGroupOption) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        if (other.getMinimumRequiredMinorEngineVersion() == null ^ this.getMinimumRequiredMinorEngineVersion() == null)
            return false;
        if (other.getMinimumRequiredMinorEngineVersion() != null
                && other.getMinimumRequiredMinorEngineVersion().equals(this.getMinimumRequiredMinorEngineVersion()) == false)
            return false;
        if (other.getPortRequired() == null ^ this.getPortRequired() == null)
            return false;
        if (other.getPortRequired() != null && other.getPortRequired().equals(this.getPortRequired()) == false)
            return false;
        if (other.getDefaultPort() == null ^ this.getDefaultPort() == null)
            return false;
        if (other.getDefaultPort() != null && other.getDefaultPort().equals(this.getDefaultPort()) == false)
            return false;
        if (other.getOptionsDependedOn() == null ^ this.getOptionsDependedOn() == null)
            return false;
        if (other.getOptionsDependedOn() != null && other.getOptionsDependedOn().equals(this.getOptionsDependedOn()) == false)
            return false;
        if (other.getOptionsConflictsWith() == null ^ this.getOptionsConflictsWith() == null)
            return false;
        if (other.getOptionsConflictsWith() != null && other.getOptionsConflictsWith().equals(this.getOptionsConflictsWith()) == false)
            return false;
        if (other.getPersistent() == null ^ this.getPersistent() == null)
            return false;
        if (other.getPersistent() != null && other.getPersistent().equals(this.getPersistent()) == false)
            return false;
        if (other.getPermanent() == null ^ this.getPermanent() == null)
            return false;
        if (other.getPermanent() != null && other.getPermanent().equals(this.getPermanent()) == false)
            return false;
        if (other.getRequiresAutoMinorEngineVersionUpgrade() == null ^ this.getRequiresAutoMinorEngineVersionUpgrade() == null)
            return false;
        if (other.getRequiresAutoMinorEngineVersionUpgrade() != null
                && other.getRequiresAutoMinorEngineVersionUpgrade().equals(this.getRequiresAutoMinorEngineVersionUpgrade()) == false)
            return false;
        if (other.getVpcOnly() == null ^ this.getVpcOnly() == null)
            return false;
        if (other.getVpcOnly() != null && other.getVpcOnly().equals(this.getVpcOnly()) == false)
            return false;
        if (other.getSupportsOptionVersionDowngrade() == null ^ this.getSupportsOptionVersionDowngrade() == null)
            return false;
        if (other.getSupportsOptionVersionDowngrade() != null
                && other.getSupportsOptionVersionDowngrade().equals(this.getSupportsOptionVersionDowngrade()) == false)
            return false;
        if (other.getOptionGroupOptionSettings() == null ^ this.getOptionGroupOptionSettings() == null)
            return false;
        if (other.getOptionGroupOptionSettings() != null && other.getOptionGroupOptionSettings().equals(this.getOptionGroupOptionSettings()) == false)
            return false;
        if (other.getOptionGroupOptionVersions() == null ^ this.getOptionGroupOptionVersions() == null)
            return false;
        if (other.getOptionGroupOptionVersions() != null && other.getOptionGroupOptionVersions().equals(this.getOptionGroupOptionVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getMinimumRequiredMinorEngineVersion() == null) ? 0 : getMinimumRequiredMinorEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPortRequired() == null) ? 0 : getPortRequired().hashCode());
        hashCode = prime * hashCode + ((getDefaultPort() == null) ? 0 : getDefaultPort().hashCode());
        hashCode = prime * hashCode + ((getOptionsDependedOn() == null) ? 0 : getOptionsDependedOn().hashCode());
        hashCode = prime * hashCode + ((getOptionsConflictsWith() == null) ? 0 : getOptionsConflictsWith().hashCode());
        hashCode = prime * hashCode + ((getPersistent() == null) ? 0 : getPersistent().hashCode());
        hashCode = prime * hashCode + ((getPermanent() == null) ? 0 : getPermanent().hashCode());
        hashCode = prime * hashCode + ((getRequiresAutoMinorEngineVersionUpgrade() == null) ? 0 : getRequiresAutoMinorEngineVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getVpcOnly() == null) ? 0 : getVpcOnly().hashCode());
        hashCode = prime * hashCode + ((getSupportsOptionVersionDowngrade() == null) ? 0 : getSupportsOptionVersionDowngrade().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupOptionSettings() == null) ? 0 : getOptionGroupOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupOptionVersions() == null) ? 0 : getOptionGroupOptionVersions().hashCode());
        return hashCode;
    }

    @Override
    public OptionGroupOption clone() {
        try {
            return (OptionGroupOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
