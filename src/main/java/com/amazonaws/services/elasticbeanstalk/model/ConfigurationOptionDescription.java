/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the possible values for a configuration option.
 * </p>
 */
public class ConfigurationOptionDescription {

    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String namespace;

    /**
     * The name of the configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
    private java.util.List<String> valueOptions;

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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return A unique namespace identifying the option's associated AWS resource.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration option.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
     * If specified, values for the configuration option are selected from
     * this list.
     *
     * @return If specified, values for the configuration option are selected from
     *         this list.
     */
    public java.util.List<String> getValueOptions() {
        if (valueOptions == null) {
            valueOptions = new java.util.ArrayList<String>();
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
        java.util.List<String> valueOptionsCopy = new java.util.ArrayList<String>();
        if (valueOptions != null) {
            valueOptionsCopy.addAll(valueOptions);
        }
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
        java.util.List<String> valueOptionsCopy = new java.util.ArrayList<String>();
        if (valueOptions != null) {
            valueOptionsCopy.addAll(valueOptions);
        }
        this.valueOptions = valueOptionsCopy;

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
        sb.append("Namespace: " + namespace + ", ");
        sb.append("Name: " + name + ", ");
        sb.append("DefaultValue: " + defaultValue + ", ");
        sb.append("ChangeSeverity: " + changeSeverity + ", ");
        sb.append("UserDefined: " + userDefined + ", ");
        sb.append("ValueType: " + valueType + ", ");
        sb.append("ValueOptions: " + valueOptions + ", ");
        sb.append("MinValue: " + minValue + ", ");
        sb.append("MaxValue: " + maxValue + ", ");
        sb.append("MaxLength: " + maxLength + ", ");
        sb.append("Regex: " + regex + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    