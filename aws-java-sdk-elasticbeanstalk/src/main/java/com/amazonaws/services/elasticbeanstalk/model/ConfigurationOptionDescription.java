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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the possible values for a configuration option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ConfigurationOptionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationOptionDescription implements Serializable, Cloneable {

    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the configuration option.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The default value for this configuration option.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * An indication of which action is required if the value for this configuration option changes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NoInterruption</code> : There is no interruption to the environment or application availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartEnvironment</code> : The environment is entirely restarted, all AWS resources are deleted and
     * recreated, and the environment is unavailable during the process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartApplicationServer</code> : The environment is available the entire time. However, a short
     * application outage occurs when the application servers on the running Amazon EC2 instances are restarted.
     * </p>
     * </li>
     * </ul>
     */
    private String changeSeverity;
    /**
     * <p>
     * An indication of whether the user defined this configuration option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : This configuration option was defined by the user. It is a valid choice for specifying if
     * this as an <code>Option to Remove</code> when updating configuration settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : This configuration was not defined by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean userDefined;
    /**
     * <p>
     * An indication of which type of values this option has and whether it is allowable to select one or more than one
     * of the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code> : Values for this option are a single selection from the possible values, or an unformatted
     * string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code> : Values for this option are multiple selections from the possible values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String valueType;
    /**
     * <p>
     * If specified, values for the configuration option are selected from this list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> valueOptions;
    /**
     * <p>
     * If specified, the configuration option must be a numeric value greater than this value.
     * </p>
     */
    private Integer minValue;
    /**
     * <p>
     * If specified, the configuration option must be a numeric value less than this value.
     * </p>
     */
    private Integer maxValue;
    /**
     * <p>
     * If specified, the configuration option must be a string value no longer than this value.
     * </p>
     */
    private Integer maxLength;
    /**
     * <p>
     * If specified, the configuration option must be a string value that satisfies this regular expression.
     * </p>
     */
    private OptionRestrictionRegex regex;

    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     * 
     * @param namespace
     *        A unique namespace identifying the option's associated AWS resource.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     * 
     * @return A unique namespace identifying the option's associated AWS resource.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     * 
     * @param namespace
     *        A unique namespace identifying the option's associated AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     * 
     * @param name
     *        The name of the configuration option.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     * 
     * @return The name of the configuration option.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     * 
     * @param name
     *        The name of the configuration option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The default value for this configuration option.
     * </p>
     * 
     * @param defaultValue
     *        The default value for this configuration option.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for this configuration option.
     * </p>
     * 
     * @return The default value for this configuration option.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for this configuration option.
     * </p>
     * 
     * @param defaultValue
     *        The default value for this configuration option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * An indication of which action is required if the value for this configuration option changes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NoInterruption</code> : There is no interruption to the environment or application availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartEnvironment</code> : The environment is entirely restarted, all AWS resources are deleted and
     * recreated, and the environment is unavailable during the process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartApplicationServer</code> : The environment is available the entire time. However, a short
     * application outage occurs when the application servers on the running Amazon EC2 instances are restarted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeSeverity
     *        An indication of which action is required if the value for this configuration option changes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NoInterruption</code> : There is no interruption to the environment or application availability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RestartEnvironment</code> : The environment is entirely restarted, all AWS resources are deleted and
     *        recreated, and the environment is unavailable during the process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RestartApplicationServer</code> : The environment is available the entire time. However, a short
     *        application outage occurs when the application servers on the running Amazon EC2 instances are restarted.
     *        </p>
     *        </li>
     */

    public void setChangeSeverity(String changeSeverity) {
        this.changeSeverity = changeSeverity;
    }

    /**
     * <p>
     * An indication of which action is required if the value for this configuration option changes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NoInterruption</code> : There is no interruption to the environment or application availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartEnvironment</code> : The environment is entirely restarted, all AWS resources are deleted and
     * recreated, and the environment is unavailable during the process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartApplicationServer</code> : The environment is available the entire time. However, a short
     * application outage occurs when the application servers on the running Amazon EC2 instances are restarted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An indication of which action is required if the value for this configuration option changes:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NoInterruption</code> : There is no interruption to the environment or application availability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RestartEnvironment</code> : The environment is entirely restarted, all AWS resources are deleted
     *         and recreated, and the environment is unavailable during the process.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RestartApplicationServer</code> : The environment is available the entire time. However, a short
     *         application outage occurs when the application servers on the running Amazon EC2 instances are restarted.
     *         </p>
     *         </li>
     */

    public String getChangeSeverity() {
        return this.changeSeverity;
    }

    /**
     * <p>
     * An indication of which action is required if the value for this configuration option changes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NoInterruption</code> : There is no interruption to the environment or application availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartEnvironment</code> : The environment is entirely restarted, all AWS resources are deleted and
     * recreated, and the environment is unavailable during the process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RestartApplicationServer</code> : The environment is available the entire time. However, a short
     * application outage occurs when the application servers on the running Amazon EC2 instances are restarted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeSeverity
     *        An indication of which action is required if the value for this configuration option changes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NoInterruption</code> : There is no interruption to the environment or application availability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RestartEnvironment</code> : The environment is entirely restarted, all AWS resources are deleted and
     *        recreated, and the environment is unavailable during the process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RestartApplicationServer</code> : The environment is available the entire time. However, a short
     *        application outage occurs when the application servers on the running Amazon EC2 instances are restarted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withChangeSeverity(String changeSeverity) {
        setChangeSeverity(changeSeverity);
        return this;
    }

    /**
     * <p>
     * An indication of whether the user defined this configuration option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : This configuration option was defined by the user. It is a valid choice for specifying if
     * this as an <code>Option to Remove</code> when updating configuration settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : This configuration was not defined by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param userDefined
     *        An indication of whether the user defined this configuration option:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> : This configuration option was defined by the user. It is a valid choice for specifying
     *        if this as an <code>Option to Remove</code> when updating configuration settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> : This configuration was not defined by the user.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }

    /**
     * <p>
     * An indication of whether the user defined this configuration option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : This configuration option was defined by the user. It is a valid choice for specifying if
     * this as an <code>Option to Remove</code> when updating configuration settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : This configuration was not defined by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return An indication of whether the user defined this configuration option:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> : This configuration option was defined by the user. It is a valid choice for
     *         specifying if this as an <code>Option to Remove</code> when updating configuration settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> : This configuration was not defined by the user.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getUserDefined() {
        return this.userDefined;
    }

    /**
     * <p>
     * An indication of whether the user defined this configuration option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : This configuration option was defined by the user. It is a valid choice for specifying if
     * this as an <code>Option to Remove</code> when updating configuration settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : This configuration was not defined by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param userDefined
     *        An indication of whether the user defined this configuration option:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> : This configuration option was defined by the user. It is a valid choice for specifying
     *        if this as an <code>Option to Remove</code> when updating configuration settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> : This configuration was not defined by the user.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withUserDefined(Boolean userDefined) {
        setUserDefined(userDefined);
        return this;
    }

    /**
     * <p>
     * An indication of whether the user defined this configuration option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : This configuration option was defined by the user. It is a valid choice for specifying if
     * this as an <code>Option to Remove</code> when updating configuration settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : This configuration was not defined by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return An indication of whether the user defined this configuration option:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> : This configuration option was defined by the user. It is a valid choice for
     *         specifying if this as an <code>Option to Remove</code> when updating configuration settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> : This configuration was not defined by the user.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraint: You can remove only <code>UserDefined</code> options from a configuration.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isUserDefined() {
        return this.userDefined;
    }

    /**
     * <p>
     * An indication of which type of values this option has and whether it is allowable to select one or more than one
     * of the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code> : Values for this option are a single selection from the possible values, or an unformatted
     * string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code> : Values for this option are multiple selections from the possible values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueType
     *        An indication of which type of values this option has and whether it is allowable to select one or more
     *        than one of the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Scalar</code> : Values for this option are a single selection from the possible values, or an
     *        unformatted string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>List</code> : Values for this option are multiple selections from the possible values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     *        </p>
     *        </li>
     * @see ConfigurationOptionValueType
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * An indication of which type of values this option has and whether it is allowable to select one or more than one
     * of the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code> : Values for this option are a single selection from the possible values, or an unformatted
     * string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code> : Values for this option are multiple selections from the possible values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An indication of which type of values this option has and whether it is allowable to select one or more
     *         than one of the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Scalar</code> : Values for this option are a single selection from the possible values, or an
     *         unformatted string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>List</code> : Values for this option are multiple selections from the possible values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     *         </p>
     *         </li>
     * @see ConfigurationOptionValueType
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * An indication of which type of values this option has and whether it is allowable to select one or more than one
     * of the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code> : Values for this option are a single selection from the possible values, or an unformatted
     * string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code> : Values for this option are multiple selections from the possible values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueType
     *        An indication of which type of values this option has and whether it is allowable to select one or more
     *        than one of the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Scalar</code> : Values for this option are a single selection from the possible values, or an
     *        unformatted string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>List</code> : Values for this option are multiple selections from the possible values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationOptionValueType
     */

    public ConfigurationOptionDescription withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * An indication of which type of values this option has and whether it is allowable to select one or more than one
     * of the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code> : Values for this option are a single selection from the possible values, or an unformatted
     * string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code> : Values for this option are multiple selections from the possible values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueType
     *        An indication of which type of values this option has and whether it is allowable to select one or more
     *        than one of the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Scalar</code> : Values for this option are a single selection from the possible values, or an
     *        unformatted string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>List</code> : Values for this option are multiple selections from the possible values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     *        </p>
     *        </li>
     * @see ConfigurationOptionValueType
     */

    public void setValueType(ConfigurationOptionValueType valueType) {
        withValueType(valueType);
    }

    /**
     * <p>
     * An indication of which type of values this option has and whether it is allowable to select one or more than one
     * of the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code> : Values for this option are a single selection from the possible values, or an unformatted
     * string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code> : Values for this option are multiple selections from the possible values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueType
     *        An indication of which type of values this option has and whether it is allowable to select one or more
     *        than one of the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Scalar</code> : Values for this option are a single selection from the possible values, or an
     *        unformatted string, or numeric value governed by the <code>MIN/MAX/Regex</code> constraints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>List</code> : Values for this option are multiple selections from the possible values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Boolean</code> : Values for this option are either <code>true</code> or <code>false</code> .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Json</code> : Values for this option are a JSON representation of a <code>ConfigDocument</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationOptionValueType
     */

    public ConfigurationOptionDescription withValueType(ConfigurationOptionValueType valueType) {
        this.valueType = valueType.toString();
        return this;
    }

    /**
     * <p>
     * If specified, values for the configuration option are selected from this list.
     * </p>
     * 
     * @return If specified, values for the configuration option are selected from this list.
     */

    public java.util.List<String> getValueOptions() {
        if (valueOptions == null) {
            valueOptions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return valueOptions;
    }

    /**
     * <p>
     * If specified, values for the configuration option are selected from this list.
     * </p>
     * 
     * @param valueOptions
     *        If specified, values for the configuration option are selected from this list.
     */

    public void setValueOptions(java.util.Collection<String> valueOptions) {
        if (valueOptions == null) {
            this.valueOptions = null;
            return;
        }

        this.valueOptions = new com.amazonaws.internal.SdkInternalList<String>(valueOptions);
    }

    /**
     * <p>
     * If specified, values for the configuration option are selected from this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValueOptions(java.util.Collection)} or {@link #withValueOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param valueOptions
     *        If specified, values for the configuration option are selected from this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withValueOptions(String... valueOptions) {
        if (this.valueOptions == null) {
            setValueOptions(new com.amazonaws.internal.SdkInternalList<String>(valueOptions.length));
        }
        for (String ele : valueOptions) {
            this.valueOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If specified, values for the configuration option are selected from this list.
     * </p>
     * 
     * @param valueOptions
     *        If specified, values for the configuration option are selected from this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withValueOptions(java.util.Collection<String> valueOptions) {
        setValueOptions(valueOptions);
        return this;
    }

    /**
     * <p>
     * If specified, the configuration option must be a numeric value greater than this value.
     * </p>
     * 
     * @param minValue
     *        If specified, the configuration option must be a numeric value greater than this value.
     */

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * If specified, the configuration option must be a numeric value greater than this value.
     * </p>
     * 
     * @return If specified, the configuration option must be a numeric value greater than this value.
     */

    public Integer getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * If specified, the configuration option must be a numeric value greater than this value.
     * </p>
     * 
     * @param minValue
     *        If specified, the configuration option must be a numeric value greater than this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withMinValue(Integer minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * If specified, the configuration option must be a numeric value less than this value.
     * </p>
     * 
     * @param maxValue
     *        If specified, the configuration option must be a numeric value less than this value.
     */

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * If specified, the configuration option must be a numeric value less than this value.
     * </p>
     * 
     * @return If specified, the configuration option must be a numeric value less than this value.
     */

    public Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * If specified, the configuration option must be a numeric value less than this value.
     * </p>
     * 
     * @param maxValue
     *        If specified, the configuration option must be a numeric value less than this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withMaxValue(Integer maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * <p>
     * If specified, the configuration option must be a string value no longer than this value.
     * </p>
     * 
     * @param maxLength
     *        If specified, the configuration option must be a string value no longer than this value.
     */

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * <p>
     * If specified, the configuration option must be a string value no longer than this value.
     * </p>
     * 
     * @return If specified, the configuration option must be a string value no longer than this value.
     */

    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * <p>
     * If specified, the configuration option must be a string value no longer than this value.
     * </p>
     * 
     * @param maxLength
     *        If specified, the configuration option must be a string value no longer than this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withMaxLength(Integer maxLength) {
        setMaxLength(maxLength);
        return this;
    }

    /**
     * <p>
     * If specified, the configuration option must be a string value that satisfies this regular expression.
     * </p>
     * 
     * @param regex
     *        If specified, the configuration option must be a string value that satisfies this regular expression.
     */

    public void setRegex(OptionRestrictionRegex regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * If specified, the configuration option must be a string value that satisfies this regular expression.
     * </p>
     * 
     * @return If specified, the configuration option must be a string value that satisfies this regular expression.
     */

    public OptionRestrictionRegex getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * If specified, the configuration option must be a string value that satisfies this regular expression.
     * </p>
     * 
     * @param regex
     *        If specified, the configuration option must be a string value that satisfies this regular expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionDescription withRegex(OptionRestrictionRegex regex) {
        setRegex(regex);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getChangeSeverity() != null)
            sb.append("ChangeSeverity: ").append(getChangeSeverity()).append(",");
        if (getUserDefined() != null)
            sb.append("UserDefined: ").append(getUserDefined()).append(",");
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType()).append(",");
        if (getValueOptions() != null)
            sb.append("ValueOptions: ").append(getValueOptions()).append(",");
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue()).append(",");
        if (getMaxLength() != null)
            sb.append("MaxLength: ").append(getMaxLength()).append(",");
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationOptionDescription == false)
            return false;
        ConfigurationOptionDescription other = (ConfigurationOptionDescription) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getChangeSeverity() == null ^ this.getChangeSeverity() == null)
            return false;
        if (other.getChangeSeverity() != null && other.getChangeSeverity().equals(this.getChangeSeverity()) == false)
            return false;
        if (other.getUserDefined() == null ^ this.getUserDefined() == null)
            return false;
        if (other.getUserDefined() != null && other.getUserDefined().equals(this.getUserDefined()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
            return false;
        if (other.getValueOptions() == null ^ this.getValueOptions() == null)
            return false;
        if (other.getValueOptions() != null && other.getValueOptions().equals(this.getValueOptions()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getMaxLength() == null ^ this.getMaxLength() == null)
            return false;
        if (other.getMaxLength() != null && other.getMaxLength().equals(this.getMaxLength()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getChangeSeverity() == null) ? 0 : getChangeSeverity().hashCode());
        hashCode = prime * hashCode + ((getUserDefined() == null) ? 0 : getUserDefined().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        hashCode = prime * hashCode + ((getValueOptions() == null) ? 0 : getValueOptions().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getMaxLength() == null) ? 0 : getMaxLength().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationOptionDescription clone() {
        try {
            return (ConfigurationOptionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
