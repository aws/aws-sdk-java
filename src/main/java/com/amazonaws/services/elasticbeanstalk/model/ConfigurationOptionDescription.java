/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the possible values for a configuration option.
 * </p>
 */
public class ConfigurationOptionDescription implements Serializable {

    /**
     * A unique namespace identifying the option's associated AWS resource.
     */
    private String namespace;

    /**
     * The name of the configuration option.
     */
    private String name;

    /**
     * The default value for this configuration option.
     */
    private String defaultValue;

    /**
     * An indication of which action is required if the value for this
     * configuration option changes: <enumValues> <value
     * name="NoInterruption"> <p> NoInterruption - There is no interruption
     * to the environment or application availability. </value> <value
     * name="RestartEnvironment"> <p> RestartEnvironment - The environment is
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </value> <value
     * name="RestartApplicationServer"> <p> RestartApplicationServer - The
     * environment is available the entire time. However, a short application
     * outage occurs when the application servers on the running Amazon EC2
     * instances are restarted. </value> </enumValues> <ul> <li>
     * <code>NoInterruption</code> : There is no interruption to the
     * environment or application availability. </li> <li>
     * <code>RestartEnvironment</code> : The environment is entirely
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </li> <li>
     * <code>RestartApplicationServer</code> : The environment is available
     * the entire time. However, a short application outage occurs when the
     * application servers on the running Amazon EC2 instances are restarted.
     * </li> </ul>
     */
    private String changeSeverity;

    /**
     * An indication of whether the user defined this configuration option:
     * <enumValues> <value name="true"> <p> <code>true</code> : This
     * configuration option was defined by the user. It is a valid choice for
     * specifying this as an Option to Remove when updating configuration
     * settings. </value> <value name="false"> <p> <code>false</code> : This
     * configuration was not defined by the user. </value> </enumValues> <ul>
     * <li> <p> <code>true</code> : This configuration option was defined by
     * the user. It is a valid choice for specifying if this as an
     * <code>Option to Remove</code> when updating configuration settings.
     * </li> <li> <code>false</code> : This configuration was not defined by
     * the user. </li> </ul> <p> Constraint: You can remove only
     * <code>UserDefined</code> options from a configuration. <p> Valid
     * Values: <code>true</code> | <code>false</code>
     */
    private Boolean userDefined;

    /**
     * An indication of which type of values this option has and whether it
     * is allowable to select one or more than one of the possible values:
     * <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     * for this option are a single selection from the possible values, or a
     * unformatted string or numeric value governed by the MIN/MAX/Regex
     * constraints: </value> <value name="List"> <p> <code>List</code> :
     * Values for this option are multiple selections of the possible values.
     * </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     * this option are either <code>true</code> or <code>false</code> .
     * </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     * this option are a single selection from the possible values, or an
     * unformatted string, or numeric value governed by the
     * <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     * Values for this option are multiple selections from the possible
     * values. </li> <li> <code>Boolean</code> : Values for this option are
     * either <code>true</code> or <code>false</code> . </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scalar, List
     */
    private String valueType;

    /**
     * If specified, values for the configuration option are selected from
     * this list.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> valueOptions;

    /**
     * If specified, the configuration option must be a numeric value greater
     * than this value.
     */
    private Integer minValue;

    /**
     * If specified, the configuration option must be a numeric value less
     * than this value.
     */
    private Integer maxValue;

    /**
     * If specified, the configuration option must be a string value no
     * longer than this value.
     */
    private Integer maxLength;

    /**
     * If specified, the configuration option must be a string value that
     * satisfies this regular expression.
     */
    private OptionRestrictionRegex regex;

    /**
     * Default constructor for a new ConfigurationOptionDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ConfigurationOptionDescription() {}
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     *
     * @return A unique namespace identifying the option's associated AWS resource.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     *
     * @param namespace A unique namespace identifying the option's associated AWS resource.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param namespace A unique namespace identifying the option's associated AWS resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The name of the configuration option.
     *
     * @return The name of the configuration option.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the configuration option.
     *
     * @param name The name of the configuration option.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The default value for this configuration option.
     *
     * @return The default value for this configuration option.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value for this configuration option.
     *
     * @param defaultValue The default value for this configuration option.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value for this configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue The default value for this configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * An indication of which action is required if the value for this
     * configuration option changes: <enumValues> <value
     * name="NoInterruption"> <p> NoInterruption - There is no interruption
     * to the environment or application availability. </value> <value
     * name="RestartEnvironment"> <p> RestartEnvironment - The environment is
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </value> <value
     * name="RestartApplicationServer"> <p> RestartApplicationServer - The
     * environment is available the entire time. However, a short application
     * outage occurs when the application servers on the running Amazon EC2
     * instances are restarted. </value> </enumValues> <ul> <li>
     * <code>NoInterruption</code> : There is no interruption to the
     * environment or application availability. </li> <li>
     * <code>RestartEnvironment</code> : The environment is entirely
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </li> <li>
     * <code>RestartApplicationServer</code> : The environment is available
     * the entire time. However, a short application outage occurs when the
     * application servers on the running Amazon EC2 instances are restarted.
     * </li> </ul>
     *
     * @return An indication of which action is required if the value for this
     *         configuration option changes: <enumValues> <value
     *         name="NoInterruption"> <p> NoInterruption - There is no interruption
     *         to the environment or application availability. </value> <value
     *         name="RestartEnvironment"> <p> RestartEnvironment - The environment is
     *         restarted, all AWS resources are deleted and recreated, and the
     *         environment is unavailable during the process. </value> <value
     *         name="RestartApplicationServer"> <p> RestartApplicationServer - The
     *         environment is available the entire time. However, a short application
     *         outage occurs when the application servers on the running Amazon EC2
     *         instances are restarted. </value> </enumValues> <ul> <li>
     *         <code>NoInterruption</code> : There is no interruption to the
     *         environment or application availability. </li> <li>
     *         <code>RestartEnvironment</code> : The environment is entirely
     *         restarted, all AWS resources are deleted and recreated, and the
     *         environment is unavailable during the process. </li> <li>
     *         <code>RestartApplicationServer</code> : The environment is available
     *         the entire time. However, a short application outage occurs when the
     *         application servers on the running Amazon EC2 instances are restarted.
     *         </li> </ul>
     */
    public String getChangeSeverity() {
        return changeSeverity;
    }
    
    /**
     * An indication of which action is required if the value for this
     * configuration option changes: <enumValues> <value
     * name="NoInterruption"> <p> NoInterruption - There is no interruption
     * to the environment or application availability. </value> <value
     * name="RestartEnvironment"> <p> RestartEnvironment - The environment is
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </value> <value
     * name="RestartApplicationServer"> <p> RestartApplicationServer - The
     * environment is available the entire time. However, a short application
     * outage occurs when the application servers on the running Amazon EC2
     * instances are restarted. </value> </enumValues> <ul> <li>
     * <code>NoInterruption</code> : There is no interruption to the
     * environment or application availability. </li> <li>
     * <code>RestartEnvironment</code> : The environment is entirely
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </li> <li>
     * <code>RestartApplicationServer</code> : The environment is available
     * the entire time. However, a short application outage occurs when the
     * application servers on the running Amazon EC2 instances are restarted.
     * </li> </ul>
     *
     * @param changeSeverity An indication of which action is required if the value for this
     *         configuration option changes: <enumValues> <value
     *         name="NoInterruption"> <p> NoInterruption - There is no interruption
     *         to the environment or application availability. </value> <value
     *         name="RestartEnvironment"> <p> RestartEnvironment - The environment is
     *         restarted, all AWS resources are deleted and recreated, and the
     *         environment is unavailable during the process. </value> <value
     *         name="RestartApplicationServer"> <p> RestartApplicationServer - The
     *         environment is available the entire time. However, a short application
     *         outage occurs when the application servers on the running Amazon EC2
     *         instances are restarted. </value> </enumValues> <ul> <li>
     *         <code>NoInterruption</code> : There is no interruption to the
     *         environment or application availability. </li> <li>
     *         <code>RestartEnvironment</code> : The environment is entirely
     *         restarted, all AWS resources are deleted and recreated, and the
     *         environment is unavailable during the process. </li> <li>
     *         <code>RestartApplicationServer</code> : The environment is available
     *         the entire time. However, a short application outage occurs when the
     *         application servers on the running Amazon EC2 instances are restarted.
     *         </li> </ul>
     */
    public void setChangeSeverity(String changeSeverity) {
        this.changeSeverity = changeSeverity;
    }
    
    /**
     * An indication of which action is required if the value for this
     * configuration option changes: <enumValues> <value
     * name="NoInterruption"> <p> NoInterruption - There is no interruption
     * to the environment or application availability. </value> <value
     * name="RestartEnvironment"> <p> RestartEnvironment - The environment is
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </value> <value
     * name="RestartApplicationServer"> <p> RestartApplicationServer - The
     * environment is available the entire time. However, a short application
     * outage occurs when the application servers on the running Amazon EC2
     * instances are restarted. </value> </enumValues> <ul> <li>
     * <code>NoInterruption</code> : There is no interruption to the
     * environment or application availability. </li> <li>
     * <code>RestartEnvironment</code> : The environment is entirely
     * restarted, all AWS resources are deleted and recreated, and the
     * environment is unavailable during the process. </li> <li>
     * <code>RestartApplicationServer</code> : The environment is available
     * the entire time. However, a short application outage occurs when the
     * application servers on the running Amazon EC2 instances are restarted.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeSeverity An indication of which action is required if the value for this
     *         configuration option changes: <enumValues> <value
     *         name="NoInterruption"> <p> NoInterruption - There is no interruption
     *         to the environment or application availability. </value> <value
     *         name="RestartEnvironment"> <p> RestartEnvironment - The environment is
     *         restarted, all AWS resources are deleted and recreated, and the
     *         environment is unavailable during the process. </value> <value
     *         name="RestartApplicationServer"> <p> RestartApplicationServer - The
     *         environment is available the entire time. However, a short application
     *         outage occurs when the application servers on the running Amazon EC2
     *         instances are restarted. </value> </enumValues> <ul> <li>
     *         <code>NoInterruption</code> : There is no interruption to the
     *         environment or application availability. </li> <li>
     *         <code>RestartEnvironment</code> : The environment is entirely
     *         restarted, all AWS resources are deleted and recreated, and the
     *         environment is unavailable during the process. </li> <li>
     *         <code>RestartApplicationServer</code> : The environment is available
     *         the entire time. However, a short application outage occurs when the
     *         application servers on the running Amazon EC2 instances are restarted.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withChangeSeverity(String changeSeverity) {
        this.changeSeverity = changeSeverity;
        return this;
    }

    /**
     * An indication of whether the user defined this configuration option:
     * <enumValues> <value name="true"> <p> <code>true</code> : This
     * configuration option was defined by the user. It is a valid choice for
     * specifying this as an Option to Remove when updating configuration
     * settings. </value> <value name="false"> <p> <code>false</code> : This
     * configuration was not defined by the user. </value> </enumValues> <ul>
     * <li> <p> <code>true</code> : This configuration option was defined by
     * the user. It is a valid choice for specifying if this as an
     * <code>Option to Remove</code> when updating configuration settings.
     * </li> <li> <code>false</code> : This configuration was not defined by
     * the user. </li> </ul> <p> Constraint: You can remove only
     * <code>UserDefined</code> options from a configuration. <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return An indication of whether the user defined this configuration option:
     *         <enumValues> <value name="true"> <p> <code>true</code> : This
     *         configuration option was defined by the user. It is a valid choice for
     *         specifying this as an Option to Remove when updating configuration
     *         settings. </value> <value name="false"> <p> <code>false</code> : This
     *         configuration was not defined by the user. </value> </enumValues> <ul>
     *         <li> <p> <code>true</code> : This configuration option was defined by
     *         the user. It is a valid choice for specifying if this as an
     *         <code>Option to Remove</code> when updating configuration settings.
     *         </li> <li> <code>false</code> : This configuration was not defined by
     *         the user. </li> </ul> <p> Constraint: You can remove only
     *         <code>UserDefined</code> options from a configuration. <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean isUserDefined() {
        return userDefined;
    }
    
    /**
     * An indication of whether the user defined this configuration option:
     * <enumValues> <value name="true"> <p> <code>true</code> : This
     * configuration option was defined by the user. It is a valid choice for
     * specifying this as an Option to Remove when updating configuration
     * settings. </value> <value name="false"> <p> <code>false</code> : This
     * configuration was not defined by the user. </value> </enumValues> <ul>
     * <li> <p> <code>true</code> : This configuration option was defined by
     * the user. It is a valid choice for specifying if this as an
     * <code>Option to Remove</code> when updating configuration settings.
     * </li> <li> <code>false</code> : This configuration was not defined by
     * the user. </li> </ul> <p> Constraint: You can remove only
     * <code>UserDefined</code> options from a configuration. <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @param userDefined An indication of whether the user defined this configuration option:
     *         <enumValues> <value name="true"> <p> <code>true</code> : This
     *         configuration option was defined by the user. It is a valid choice for
     *         specifying this as an Option to Remove when updating configuration
     *         settings. </value> <value name="false"> <p> <code>false</code> : This
     *         configuration was not defined by the user. </value> </enumValues> <ul>
     *         <li> <p> <code>true</code> : This configuration option was defined by
     *         the user. It is a valid choice for specifying if this as an
     *         <code>Option to Remove</code> when updating configuration settings.
     *         </li> <li> <code>false</code> : This configuration was not defined by
     *         the user. </li> </ul> <p> Constraint: You can remove only
     *         <code>UserDefined</code> options from a configuration. <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }
    
    /**
     * An indication of whether the user defined this configuration option:
     * <enumValues> <value name="true"> <p> <code>true</code> : This
     * configuration option was defined by the user. It is a valid choice for
     * specifying this as an Option to Remove when updating configuration
     * settings. </value> <value name="false"> <p> <code>false</code> : This
     * configuration was not defined by the user. </value> </enumValues> <ul>
     * <li> <p> <code>true</code> : This configuration option was defined by
     * the user. It is a valid choice for specifying if this as an
     * <code>Option to Remove</code> when updating configuration settings.
     * </li> <li> <code>false</code> : This configuration was not defined by
     * the user. </li> </ul> <p> Constraint: You can remove only
     * <code>UserDefined</code> options from a configuration. <p> Valid
     * Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userDefined An indication of whether the user defined this configuration option:
     *         <enumValues> <value name="true"> <p> <code>true</code> : This
     *         configuration option was defined by the user. It is a valid choice for
     *         specifying this as an Option to Remove when updating configuration
     *         settings. </value> <value name="false"> <p> <code>false</code> : This
     *         configuration was not defined by the user. </value> </enumValues> <ul>
     *         <li> <p> <code>true</code> : This configuration option was defined by
     *         the user. It is a valid choice for specifying if this as an
     *         <code>Option to Remove</code> when updating configuration settings.
     *         </li> <li> <code>false</code> : This configuration was not defined by
     *         the user. </li> </ul> <p> Constraint: You can remove only
     *         <code>UserDefined</code> options from a configuration. <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
        return this;
    }

    /**
     * An indication of whether the user defined this configuration option:
     * <enumValues> <value name="true"> <p> <code>true</code> : This
     * configuration option was defined by the user. It is a valid choice for
     * specifying this as an Option to Remove when updating configuration
     * settings. </value> <value name="false"> <p> <code>false</code> : This
     * configuration was not defined by the user. </value> </enumValues> <ul>
     * <li> <p> <code>true</code> : This configuration option was defined by
     * the user. It is a valid choice for specifying if this as an
     * <code>Option to Remove</code> when updating configuration settings.
     * </li> <li> <code>false</code> : This configuration was not defined by
     * the user. </li> </ul> <p> Constraint: You can remove only
     * <code>UserDefined</code> options from a configuration. <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return An indication of whether the user defined this configuration option:
     *         <enumValues> <value name="true"> <p> <code>true</code> : This
     *         configuration option was defined by the user. It is a valid choice for
     *         specifying this as an Option to Remove when updating configuration
     *         settings. </value> <value name="false"> <p> <code>false</code> : This
     *         configuration was not defined by the user. </value> </enumValues> <ul>
     *         <li> <p> <code>true</code> : This configuration option was defined by
     *         the user. It is a valid choice for specifying if this as an
     *         <code>Option to Remove</code> when updating configuration settings.
     *         </li> <li> <code>false</code> : This configuration was not defined by
     *         the user. </li> </ul> <p> Constraint: You can remove only
     *         <code>UserDefined</code> options from a configuration. <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean getUserDefined() {
        return userDefined;
    }

    /**
     * An indication of which type of values this option has and whether it
     * is allowable to select one or more than one of the possible values:
     * <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     * for this option are a single selection from the possible values, or a
     * unformatted string or numeric value governed by the MIN/MAX/Regex
     * constraints: </value> <value name="List"> <p> <code>List</code> :
     * Values for this option are multiple selections of the possible values.
     * </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     * this option are either <code>true</code> or <code>false</code> .
     * </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     * this option are a single selection from the possible values, or an
     * unformatted string, or numeric value governed by the
     * <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     * Values for this option are multiple selections from the possible
     * values. </li> <li> <code>Boolean</code> : Values for this option are
     * either <code>true</code> or <code>false</code> . </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scalar, List
     *
     * @return An indication of which type of values this option has and whether it
     *         is allowable to select one or more than one of the possible values:
     *         <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     *         for this option are a single selection from the possible values, or a
     *         unformatted string or numeric value governed by the MIN/MAX/Regex
     *         constraints: </value> <value name="List"> <p> <code>List</code> :
     *         Values for this option are multiple selections of the possible values.
     *         </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     *         this option are either <code>true</code> or <code>false</code> .
     *         </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     *         this option are a single selection from the possible values, or an
     *         unformatted string, or numeric value governed by the
     *         <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     *         Values for this option are multiple selections from the possible
     *         values. </li> <li> <code>Boolean</code> : Values for this option are
     *         either <code>true</code> or <code>false</code> . </li> </ul>
     *
     * @see ConfigurationOptionValueType
     */
    public String getValueType() {
        return valueType;
    }
    
    /**
     * An indication of which type of values this option has and whether it
     * is allowable to select one or more than one of the possible values:
     * <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     * for this option are a single selection from the possible values, or a
     * unformatted string or numeric value governed by the MIN/MAX/Regex
     * constraints: </value> <value name="List"> <p> <code>List</code> :
     * Values for this option are multiple selections of the possible values.
     * </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     * this option are either <code>true</code> or <code>false</code> .
     * </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     * this option are a single selection from the possible values, or an
     * unformatted string, or numeric value governed by the
     * <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     * Values for this option are multiple selections from the possible
     * values. </li> <li> <code>Boolean</code> : Values for this option are
     * either <code>true</code> or <code>false</code> . </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scalar, List
     *
     * @param valueType An indication of which type of values this option has and whether it
     *         is allowable to select one or more than one of the possible values:
     *         <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     *         for this option are a single selection from the possible values, or a
     *         unformatted string or numeric value governed by the MIN/MAX/Regex
     *         constraints: </value> <value name="List"> <p> <code>List</code> :
     *         Values for this option are multiple selections of the possible values.
     *         </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     *         this option are either <code>true</code> or <code>false</code> .
     *         </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     *         this option are a single selection from the possible values, or an
     *         unformatted string, or numeric value governed by the
     *         <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     *         Values for this option are multiple selections from the possible
     *         values. </li> <li> <code>Boolean</code> : Values for this option are
     *         either <code>true</code> or <code>false</code> . </li> </ul>
     *
     * @see ConfigurationOptionValueType
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
    
    /**
     * An indication of which type of values this option has and whether it
     * is allowable to select one or more than one of the possible values:
     * <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     * for this option are a single selection from the possible values, or a
     * unformatted string or numeric value governed by the MIN/MAX/Regex
     * constraints: </value> <value name="List"> <p> <code>List</code> :
     * Values for this option are multiple selections of the possible values.
     * </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     * this option are either <code>true</code> or <code>false</code> .
     * </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     * this option are a single selection from the possible values, or an
     * unformatted string, or numeric value governed by the
     * <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     * Values for this option are multiple selections from the possible
     * values. </li> <li> <code>Boolean</code> : Values for this option are
     * either <code>true</code> or <code>false</code> . </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scalar, List
     *
     * @param valueType An indication of which type of values this option has and whether it
     *         is allowable to select one or more than one of the possible values:
     *         <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     *         for this option are a single selection from the possible values, or a
     *         unformatted string or numeric value governed by the MIN/MAX/Regex
     *         constraints: </value> <value name="List"> <p> <code>List</code> :
     *         Values for this option are multiple selections of the possible values.
     *         </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     *         this option are either <code>true</code> or <code>false</code> .
     *         </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     *         this option are a single selection from the possible values, or an
     *         unformatted string, or numeric value governed by the
     *         <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     *         Values for this option are multiple selections from the possible
     *         values. </li> <li> <code>Boolean</code> : Values for this option are
     *         either <code>true</code> or <code>false</code> . </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConfigurationOptionValueType
     */
    public ConfigurationOptionDescription withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * An indication of which type of values this option has and whether it
     * is allowable to select one or more than one of the possible values:
     * <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     * for this option are a single selection from the possible values, or a
     * unformatted string or numeric value governed by the MIN/MAX/Regex
     * constraints: </value> <value name="List"> <p> <code>List</code> :
     * Values for this option are multiple selections of the possible values.
     * </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     * this option are either <code>true</code> or <code>false</code> .
     * </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     * this option are a single selection from the possible values, or an
     * unformatted string, or numeric value governed by the
     * <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     * Values for this option are multiple selections from the possible
     * values. </li> <li> <code>Boolean</code> : Values for this option are
     * either <code>true</code> or <code>false</code> . </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scalar, List
     *
     * @param valueType An indication of which type of values this option has and whether it
     *         is allowable to select one or more than one of the possible values:
     *         <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     *         for this option are a single selection from the possible values, or a
     *         unformatted string or numeric value governed by the MIN/MAX/Regex
     *         constraints: </value> <value name="List"> <p> <code>List</code> :
     *         Values for this option are multiple selections of the possible values.
     *         </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     *         this option are either <code>true</code> or <code>false</code> .
     *         </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     *         this option are a single selection from the possible values, or an
     *         unformatted string, or numeric value governed by the
     *         <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     *         Values for this option are multiple selections from the possible
     *         values. </li> <li> <code>Boolean</code> : Values for this option are
     *         either <code>true</code> or <code>false</code> . </li> </ul>
     *
     * @see ConfigurationOptionValueType
     */
    public void setValueType(ConfigurationOptionValueType valueType) {
        this.valueType = valueType.toString();
    }
    
    /**
     * An indication of which type of values this option has and whether it
     * is allowable to select one or more than one of the possible values:
     * <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     * for this option are a single selection from the possible values, or a
     * unformatted string or numeric value governed by the MIN/MAX/Regex
     * constraints: </value> <value name="List"> <p> <code>List</code> :
     * Values for this option are multiple selections of the possible values.
     * </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     * this option are either <code>true</code> or <code>false</code> .
     * </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     * this option are a single selection from the possible values, or an
     * unformatted string, or numeric value governed by the
     * <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     * Values for this option are multiple selections from the possible
     * values. </li> <li> <code>Boolean</code> : Values for this option are
     * either <code>true</code> or <code>false</code> . </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scalar, List
     *
     * @param valueType An indication of which type of values this option has and whether it
     *         is allowable to select one or more than one of the possible values:
     *         <enumValues> <value name="Scalar"> <p> <code>Scalar</code> : Values
     *         for this option are a single selection from the possible values, or a
     *         unformatted string or numeric value governed by the MIN/MAX/Regex
     *         constraints: </value> <value name="List"> <p> <code>List</code> :
     *         Values for this option are multiple selections of the possible values.
     *         </value> <value name="Boolean"> <p> <code>Boolean</code> : Values for
     *         this option are either <code>true</code> or <code>false</code> .
     *         </value> </enumValues> <p> <ul> <li> <code>Scalar</code> : Values for
     *         this option are a single selection from the possible values, or an
     *         unformatted string, or numeric value governed by the
     *         <code>MIN/MAX/Regex</code> constraints. </li> <li> <code>List</code> :
     *         Values for this option are multiple selections from the possible
     *         values. </li> <li> <code>Boolean</code> : Values for this option are
     *         either <code>true</code> or <code>false</code> . </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConfigurationOptionValueType
     */
    public ConfigurationOptionDescription withValueType(ConfigurationOptionValueType valueType) {
        this.valueType = valueType.toString();
        return this;
    }

    /**
     * If specified, values for the configuration option are selected from
     * this list.
     *
     * @return If specified, values for the configuration option are selected from
     *         this list.
     */
    public java.util.List<String> getValueOptions() {
        if (valueOptions == null) {
              valueOptions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              valueOptions.setAutoConstruct(true);
        }
        return valueOptions;
    }
    
    /**
     * If specified, values for the configuration option are selected from
     * this list.
     *
     * @param valueOptions If specified, values for the configuration option are selected from
     *         this list.
     */
    public void setValueOptions(java.util.Collection<String> valueOptions) {
        if (valueOptions == null) {
            this.valueOptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> valueOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(valueOptions.size());
        valueOptionsCopy.addAll(valueOptions);
        this.valueOptions = valueOptionsCopy;
    }
    
    /**
     * If specified, values for the configuration option are selected from
     * this list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param valueOptions If specified, values for the configuration option are selected from
     *         this list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withValueOptions(String... valueOptions) {
        if (getValueOptions() == null) setValueOptions(new java.util.ArrayList<String>(valueOptions.length));
        for (String value : valueOptions) {
            getValueOptions().add(value);
        }
        return this;
    }
    
    /**
     * If specified, values for the configuration option are selected from
     * this list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param valueOptions If specified, values for the configuration option are selected from
     *         this list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withValueOptions(java.util.Collection<String> valueOptions) {
        if (valueOptions == null) {
            this.valueOptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> valueOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(valueOptions.size());
            valueOptionsCopy.addAll(valueOptions);
            this.valueOptions = valueOptionsCopy;
        }

        return this;
    }

    /**
     * If specified, the configuration option must be a numeric value greater
     * than this value.
     *
     * @return If specified, the configuration option must be a numeric value greater
     *         than this value.
     */
    public Integer getMinValue() {
        return minValue;
    }
    
    /**
     * If specified, the configuration option must be a numeric value greater
     * than this value.
     *
     * @param minValue If specified, the configuration option must be a numeric value greater
     *         than this value.
     */
    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }
    
    /**
     * If specified, the configuration option must be a numeric value greater
     * than this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minValue If specified, the configuration option must be a numeric value greater
     *         than this value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * If specified, the configuration option must be a numeric value less
     * than this value.
     *
     * @return If specified, the configuration option must be a numeric value less
     *         than this value.
     */
    public Integer getMaxValue() {
        return maxValue;
    }
    
    /**
     * If specified, the configuration option must be a numeric value less
     * than this value.
     *
     * @param maxValue If specified, the configuration option must be a numeric value less
     *         than this value.
     */
    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }
    
    /**
     * If specified, the configuration option must be a numeric value less
     * than this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxValue If specified, the configuration option must be a numeric value less
     *         than this value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * If specified, the configuration option must be a string value no
     * longer than this value.
     *
     * @return If specified, the configuration option must be a string value no
     *         longer than this value.
     */
    public Integer getMaxLength() {
        return maxLength;
    }
    
    /**
     * If specified, the configuration option must be a string value no
     * longer than this value.
     *
     * @param maxLength If specified, the configuration option must be a string value no
     *         longer than this value.
     */
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }
    
    /**
     * If specified, the configuration option must be a string value no
     * longer than this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxLength If specified, the configuration option must be a string value no
     *         longer than this value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * If specified, the configuration option must be a string value that
     * satisfies this regular expression.
     *
     * @return If specified, the configuration option must be a string value that
     *         satisfies this regular expression.
     */
    public OptionRestrictionRegex getRegex() {
        return regex;
    }
    
    /**
     * If specified, the configuration option must be a string value that
     * satisfies this regular expression.
     *
     * @param regex If specified, the configuration option must be a string value that
     *         satisfies this regular expression.
     */
    public void setRegex(OptionRestrictionRegex regex) {
        this.regex = regex;
    }
    
    /**
     * If specified, the configuration option must be a string value that
     * satisfies this regular expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regex If specified, the configuration option must be a string value that
     *         satisfies this regular expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionDescription withRegex(OptionRestrictionRegex regex) {
        this.regex = regex;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getChangeSeverity() != null) sb.append("ChangeSeverity: " + getChangeSeverity() + ",");
        if (isUserDefined() != null) sb.append("UserDefined: " + isUserDefined() + ",");
        if (getValueType() != null) sb.append("ValueType: " + getValueType() + ",");
        if (getValueOptions() != null) sb.append("ValueOptions: " + getValueOptions() + ",");
        if (getMinValue() != null) sb.append("MinValue: " + getMinValue() + ",");
        if (getMaxValue() != null) sb.append("MaxValue: " + getMaxValue() + ",");
        if (getMaxLength() != null) sb.append("MaxLength: " + getMaxLength() + ",");
        if (getRegex() != null) sb.append("Regex: " + getRegex() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getChangeSeverity() == null) ? 0 : getChangeSeverity().hashCode()); 
        hashCode = prime * hashCode + ((isUserDefined() == null) ? 0 : isUserDefined().hashCode()); 
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode()); 
        hashCode = prime * hashCode + ((getValueOptions() == null) ? 0 : getValueOptions().hashCode()); 
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode()); 
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode()); 
        hashCode = prime * hashCode + ((getMaxLength() == null) ? 0 : getMaxLength().hashCode()); 
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigurationOptionDescription == false) return false;
        ConfigurationOptionDescription other = (ConfigurationOptionDescription)obj;
        
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getChangeSeverity() == null ^ this.getChangeSeverity() == null) return false;
        if (other.getChangeSeverity() != null && other.getChangeSeverity().equals(this.getChangeSeverity()) == false) return false; 
        if (other.isUserDefined() == null ^ this.isUserDefined() == null) return false;
        if (other.isUserDefined() != null && other.isUserDefined().equals(this.isUserDefined()) == false) return false; 
        if (other.getValueType() == null ^ this.getValueType() == null) return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false) return false; 
        if (other.getValueOptions() == null ^ this.getValueOptions() == null) return false;
        if (other.getValueOptions() != null && other.getValueOptions().equals(this.getValueOptions()) == false) return false; 
        if (other.getMinValue() == null ^ this.getMinValue() == null) return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false) return false; 
        if (other.getMaxValue() == null ^ this.getMaxValue() == null) return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false) return false; 
        if (other.getMaxLength() == null ^ this.getMaxLength() == null) return false;
        if (other.getMaxLength() != null && other.getMaxLength().equals(this.getMaxLength()) == false) return false; 
        if (other.getRegex() == null ^ this.getRegex() == null) return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false) return false; 
        return true;
    }
    
}
    