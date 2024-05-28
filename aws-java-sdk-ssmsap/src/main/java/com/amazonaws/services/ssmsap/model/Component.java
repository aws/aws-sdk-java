/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SAP component of your application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Component" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Component implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the component.
     * </p>
     */
    private String componentId;
    /**
     * <p>
     * The SAP System Identifier of the application component.
     * </p>
     */
    private String sid;
    /**
     * <p>
     * The SAP system number of the application component.
     * </p>
     */
    private String systemNumber;
    /**
     * <p>
     * The parent component of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the parent component consists of the entire setup, including the child components.
     * </p>
     */
    private String parentComponent;
    /**
     * <p>
     * The child components of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the child component consists of the primary and secondar instances.
     * </p>
     */
    private java.util.List<String> childComponents;
    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The type of the component.
     * </p>
     */
    private String componentType;
    /**
     * <p>
     * The status of the component.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVATED - this status has been deprecated.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTING - the component is in the process of being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - the component is not running.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING - the component is in the process of being stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - the component is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     * href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html"> <code>GetComponent</code>
     * </a> to review the status of each child component.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered information.
     * Verify your SAP application.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The hostname of the component.
     * </p>
     */
    private String sapHostname;
    /**
     * <p>
     * The SAP feature of the component.
     * </p>
     */
    private String sapFeature;
    /**
     * <p>
     * The kernel version of the component.
     * </p>
     */
    private String sapKernelVersion;
    /**
     * <p>
     * The SAP HANA version of the component.
     * </p>
     */
    private String hdbVersion;
    /**
     * <p>
     * Details of the SAP HANA system replication for the component.
     * </p>
     */
    private Resilience resilience;
    /**
     * <p>
     * The associated host of the component.
     * </p>
     */
    private AssociatedHost associatedHost;
    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     */
    private java.util.List<String> databases;
    /**
     * <p>
     * The hosts of the component.
     * </p>
     */
    @Deprecated
    private java.util.List<Host> hosts;
    /**
     * <p>
     * The primary host of the component.
     * </p>
     */
    @Deprecated
    private String primaryHost;
    /**
     * <p>
     * The connection specifications for the database of the component.
     * </p>
     */
    private DatabaseConnection databaseConnection;
    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @param componentId
     *        The ID of the component.
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @return The ID of the component.
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @param componentId
     *        The ID of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p>
     * The SAP System Identifier of the application component.
     * </p>
     * 
     * @param sid
     *        The SAP System Identifier of the application component.
     */

    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * <p>
     * The SAP System Identifier of the application component.
     * </p>
     * 
     * @return The SAP System Identifier of the application component.
     */

    public String getSid() {
        return this.sid;
    }

    /**
     * <p>
     * The SAP System Identifier of the application component.
     * </p>
     * 
     * @param sid
     *        The SAP System Identifier of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withSid(String sid) {
        setSid(sid);
        return this;
    }

    /**
     * <p>
     * The SAP system number of the application component.
     * </p>
     * 
     * @param systemNumber
     *        The SAP system number of the application component.
     */

    public void setSystemNumber(String systemNumber) {
        this.systemNumber = systemNumber;
    }

    /**
     * <p>
     * The SAP system number of the application component.
     * </p>
     * 
     * @return The SAP system number of the application component.
     */

    public String getSystemNumber() {
        return this.systemNumber;
    }

    /**
     * <p>
     * The SAP system number of the application component.
     * </p>
     * 
     * @param systemNumber
     *        The SAP system number of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withSystemNumber(String systemNumber) {
        setSystemNumber(systemNumber);
        return this;
    }

    /**
     * <p>
     * The parent component of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the parent component consists of the entire setup, including the child components.
     * </p>
     * 
     * @param parentComponent
     *        The parent component of a highly available environment. For example, in a highly available SAP on AWS
     *        workload, the parent component consists of the entire setup, including the child components.
     */

    public void setParentComponent(String parentComponent) {
        this.parentComponent = parentComponent;
    }

    /**
     * <p>
     * The parent component of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the parent component consists of the entire setup, including the child components.
     * </p>
     * 
     * @return The parent component of a highly available environment. For example, in a highly available SAP on AWS
     *         workload, the parent component consists of the entire setup, including the child components.
     */

    public String getParentComponent() {
        return this.parentComponent;
    }

    /**
     * <p>
     * The parent component of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the parent component consists of the entire setup, including the child components.
     * </p>
     * 
     * @param parentComponent
     *        The parent component of a highly available environment. For example, in a highly available SAP on AWS
     *        workload, the parent component consists of the entire setup, including the child components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withParentComponent(String parentComponent) {
        setParentComponent(parentComponent);
        return this;
    }

    /**
     * <p>
     * The child components of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the child component consists of the primary and secondar instances.
     * </p>
     * 
     * @return The child components of a highly available environment. For example, in a highly available SAP on AWS
     *         workload, the child component consists of the primary and secondar instances.
     */

    public java.util.List<String> getChildComponents() {
        return childComponents;
    }

    /**
     * <p>
     * The child components of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the child component consists of the primary and secondar instances.
     * </p>
     * 
     * @param childComponents
     *        The child components of a highly available environment. For example, in a highly available SAP on AWS
     *        workload, the child component consists of the primary and secondar instances.
     */

    public void setChildComponents(java.util.Collection<String> childComponents) {
        if (childComponents == null) {
            this.childComponents = null;
            return;
        }

        this.childComponents = new java.util.ArrayList<String>(childComponents);
    }

    /**
     * <p>
     * The child components of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the child component consists of the primary and secondar instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildComponents(java.util.Collection)} or {@link #withChildComponents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param childComponents
     *        The child components of a highly available environment. For example, in a highly available SAP on AWS
     *        workload, the child component consists of the primary and secondar instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withChildComponents(String... childComponents) {
        if (this.childComponents == null) {
            setChildComponents(new java.util.ArrayList<String>(childComponents.length));
        }
        for (String ele : childComponents) {
            this.childComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The child components of a highly available environment. For example, in a highly available SAP on AWS workload,
     * the child component consists of the primary and secondar instances.
     * </p>
     * 
     * @param childComponents
     *        The child components of a highly available environment. For example, in a highly available SAP on AWS
     *        workload, the child component consists of the primary and secondar instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withChildComponents(java.util.Collection<String> childComponents) {
        setChildComponents(childComponents);
        return this;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @param componentType
     *        The type of the component.
     * @see ComponentType
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @return The type of the component.
     * @see ComponentType
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @param componentType
     *        The type of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public Component withComponentType(String componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @param componentType
     *        The type of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public Component withComponentType(ComponentType componentType) {
        this.componentType = componentType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVATED - this status has been deprecated.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTING - the component is in the process of being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - the component is not running.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING - the component is in the process of being stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - the component is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     * href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html"> <code>GetComponent</code>
     * </a> to review the status of each child component.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered information.
     * Verify your SAP application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the component.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACTIVATED - this status has been deprecated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STARTING - the component is in the process of being started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED - the component is not running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING - the component is in the process of being stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - the component is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     *        href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html">
     *        <code>GetComponent</code> </a> to review the status of each child component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered
     *        information. Verify your SAP application.
     *        </p>
     *        </li>
     * @see ComponentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVATED - this status has been deprecated.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTING - the component is in the process of being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - the component is not running.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING - the component is in the process of being stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - the component is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     * href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html"> <code>GetComponent</code>
     * </a> to review the status of each child component.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered information.
     * Verify your SAP application.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the component.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACTIVATED - this status has been deprecated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STARTING - the component is in the process of being started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOPPED - the component is not running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOPPING - the component is in the process of being stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING - the component is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     *         href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html">
     *         <code>GetComponent</code> </a> to review the status of each child component.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered
     *         information. Verify your SAP application.
     *         </p>
     *         </li>
     * @see ComponentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVATED - this status has been deprecated.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTING - the component is in the process of being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - the component is not running.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING - the component is in the process of being stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - the component is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     * href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html"> <code>GetComponent</code>
     * </a> to review the status of each child component.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered information.
     * Verify your SAP application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the component.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACTIVATED - this status has been deprecated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STARTING - the component is in the process of being started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED - the component is not running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING - the component is in the process of being stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - the component is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     *        href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html">
     *        <code>GetComponent</code> </a> to review the status of each child component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered
     *        information. Verify your SAP application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentStatus
     */

    public Component withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVATED - this status has been deprecated.
     * </p>
     * </li>
     * <li>
     * <p>
     * STARTING - the component is in the process of being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - the component is not running.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING - the component is in the process of being stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - the component is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     * href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html"> <code>GetComponent</code>
     * </a> to review the status of each child component.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered information.
     * Verify your SAP application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the component.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACTIVATED - this status has been deprecated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STARTING - the component is in the process of being started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED - the component is not running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING - the component is in the process of being stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - the component is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING_WITH_ERROR - one or more child component(s) of the parent component is not running. Call <a
     *        href="https://docs.aws.amazon.com/ssmsap/latest/APIReference/API_GetComponent.html">
     *        <code>GetComponent</code> </a> to review the status of each child component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNDEFINED - AWS Systems Manager for SAP cannot provide the component status based on the discovered
     *        information. Verify your SAP application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentStatus
     */

    public Component withStatus(ComponentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The hostname of the component.
     * </p>
     * 
     * @param sapHostname
     *        The hostname of the component.
     */

    public void setSapHostname(String sapHostname) {
        this.sapHostname = sapHostname;
    }

    /**
     * <p>
     * The hostname of the component.
     * </p>
     * 
     * @return The hostname of the component.
     */

    public String getSapHostname() {
        return this.sapHostname;
    }

    /**
     * <p>
     * The hostname of the component.
     * </p>
     * 
     * @param sapHostname
     *        The hostname of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withSapHostname(String sapHostname) {
        setSapHostname(sapHostname);
        return this;
    }

    /**
     * <p>
     * The SAP feature of the component.
     * </p>
     * 
     * @param sapFeature
     *        The SAP feature of the component.
     */

    public void setSapFeature(String sapFeature) {
        this.sapFeature = sapFeature;
    }

    /**
     * <p>
     * The SAP feature of the component.
     * </p>
     * 
     * @return The SAP feature of the component.
     */

    public String getSapFeature() {
        return this.sapFeature;
    }

    /**
     * <p>
     * The SAP feature of the component.
     * </p>
     * 
     * @param sapFeature
     *        The SAP feature of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withSapFeature(String sapFeature) {
        setSapFeature(sapFeature);
        return this;
    }

    /**
     * <p>
     * The kernel version of the component.
     * </p>
     * 
     * @param sapKernelVersion
     *        The kernel version of the component.
     */

    public void setSapKernelVersion(String sapKernelVersion) {
        this.sapKernelVersion = sapKernelVersion;
    }

    /**
     * <p>
     * The kernel version of the component.
     * </p>
     * 
     * @return The kernel version of the component.
     */

    public String getSapKernelVersion() {
        return this.sapKernelVersion;
    }

    /**
     * <p>
     * The kernel version of the component.
     * </p>
     * 
     * @param sapKernelVersion
     *        The kernel version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withSapKernelVersion(String sapKernelVersion) {
        setSapKernelVersion(sapKernelVersion);
        return this;
    }

    /**
     * <p>
     * The SAP HANA version of the component.
     * </p>
     * 
     * @param hdbVersion
     *        The SAP HANA version of the component.
     */

    public void setHdbVersion(String hdbVersion) {
        this.hdbVersion = hdbVersion;
    }

    /**
     * <p>
     * The SAP HANA version of the component.
     * </p>
     * 
     * @return The SAP HANA version of the component.
     */

    public String getHdbVersion() {
        return this.hdbVersion;
    }

    /**
     * <p>
     * The SAP HANA version of the component.
     * </p>
     * 
     * @param hdbVersion
     *        The SAP HANA version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withHdbVersion(String hdbVersion) {
        setHdbVersion(hdbVersion);
        return this;
    }

    /**
     * <p>
     * Details of the SAP HANA system replication for the component.
     * </p>
     * 
     * @param resilience
     *        Details of the SAP HANA system replication for the component.
     */

    public void setResilience(Resilience resilience) {
        this.resilience = resilience;
    }

    /**
     * <p>
     * Details of the SAP HANA system replication for the component.
     * </p>
     * 
     * @return Details of the SAP HANA system replication for the component.
     */

    public Resilience getResilience() {
        return this.resilience;
    }

    /**
     * <p>
     * Details of the SAP HANA system replication for the component.
     * </p>
     * 
     * @param resilience
     *        Details of the SAP HANA system replication for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withResilience(Resilience resilience) {
        setResilience(resilience);
        return this;
    }

    /**
     * <p>
     * The associated host of the component.
     * </p>
     * 
     * @param associatedHost
     *        The associated host of the component.
     */

    public void setAssociatedHost(AssociatedHost associatedHost) {
        this.associatedHost = associatedHost;
    }

    /**
     * <p>
     * The associated host of the component.
     * </p>
     * 
     * @return The associated host of the component.
     */

    public AssociatedHost getAssociatedHost() {
        return this.associatedHost;
    }

    /**
     * <p>
     * The associated host of the component.
     * </p>
     * 
     * @param associatedHost
     *        The associated host of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withAssociatedHost(AssociatedHost associatedHost) {
        setAssociatedHost(associatedHost);
        return this;
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * 
     * @return The SAP HANA databases of the component.
     */

    public java.util.List<String> getDatabases() {
        return databases;
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * 
     * @param databases
     *        The SAP HANA databases of the component.
     */

    public void setDatabases(java.util.Collection<String> databases) {
        if (databases == null) {
            this.databases = null;
            return;
        }

        this.databases = new java.util.ArrayList<String>(databases);
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabases(java.util.Collection)} or {@link #withDatabases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databases
     *        The SAP HANA databases of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDatabases(String... databases) {
        if (this.databases == null) {
            setDatabases(new java.util.ArrayList<String>(databases.length));
        }
        for (String ele : databases) {
            this.databases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * 
     * @param databases
     *        The SAP HANA databases of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDatabases(java.util.Collection<String> databases) {
        setDatabases(databases);
        return this;
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * 
     * @return The hosts of the component.
     */
    @Deprecated
    public java.util.List<Host> getHosts() {
        return hosts;
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * 
     * @param hosts
     *        The hosts of the component.
     */
    @Deprecated
    public void setHosts(java.util.Collection<Host> hosts) {
        if (hosts == null) {
            this.hosts = null;
            return;
        }

        this.hosts = new java.util.ArrayList<Host>(hosts);
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHosts(java.util.Collection)} or {@link #withHosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hosts
     *        The hosts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Component withHosts(Host... hosts) {
        if (this.hosts == null) {
            setHosts(new java.util.ArrayList<Host>(hosts.length));
        }
        for (Host ele : hosts) {
            this.hosts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * 
     * @param hosts
     *        The hosts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Component withHosts(java.util.Collection<Host> hosts) {
        setHosts(hosts);
        return this;
    }

    /**
     * <p>
     * The primary host of the component.
     * </p>
     * 
     * @param primaryHost
     *        The primary host of the component.
     */
    @Deprecated
    public void setPrimaryHost(String primaryHost) {
        this.primaryHost = primaryHost;
    }

    /**
     * <p>
     * The primary host of the component.
     * </p>
     * 
     * @return The primary host of the component.
     */
    @Deprecated
    public String getPrimaryHost() {
        return this.primaryHost;
    }

    /**
     * <p>
     * The primary host of the component.
     * </p>
     * 
     * @param primaryHost
     *        The primary host of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Component withPrimaryHost(String primaryHost) {
        setPrimaryHost(primaryHost);
        return this;
    }

    /**
     * <p>
     * The connection specifications for the database of the component.
     * </p>
     * 
     * @param databaseConnection
     *        The connection specifications for the database of the component.
     */

    public void setDatabaseConnection(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    /**
     * <p>
     * The connection specifications for the database of the component.
     * </p>
     * 
     * @return The connection specifications for the database of the component.
     */

    public DatabaseConnection getDatabaseConnection() {
        return this.databaseConnection;
    }

    /**
     * <p>
     * The connection specifications for the database of the component.
     * </p>
     * 
     * @param databaseConnection
     *        The connection specifications for the database of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDatabaseConnection(DatabaseConnection databaseConnection) {
        setDatabaseConnection(databaseConnection);
        return this;
    }

    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the component was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     * 
     * @return The time at which the component was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the component was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the component.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withArn(String arn) {
        setArn(arn);
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
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getSid() != null)
            sb.append("Sid: ").append(getSid()).append(",");
        if (getSystemNumber() != null)
            sb.append("SystemNumber: ").append(getSystemNumber()).append(",");
        if (getParentComponent() != null)
            sb.append("ParentComponent: ").append(getParentComponent()).append(",");
        if (getChildComponents() != null)
            sb.append("ChildComponents: ").append(getChildComponents()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSapHostname() != null)
            sb.append("SapHostname: ").append(getSapHostname()).append(",");
        if (getSapFeature() != null)
            sb.append("SapFeature: ").append(getSapFeature()).append(",");
        if (getSapKernelVersion() != null)
            sb.append("SapKernelVersion: ").append(getSapKernelVersion()).append(",");
        if (getHdbVersion() != null)
            sb.append("HdbVersion: ").append(getHdbVersion()).append(",");
        if (getResilience() != null)
            sb.append("Resilience: ").append(getResilience()).append(",");
        if (getAssociatedHost() != null)
            sb.append("AssociatedHost: ").append(getAssociatedHost()).append(",");
        if (getDatabases() != null)
            sb.append("Databases: ").append(getDatabases()).append(",");
        if (getHosts() != null)
            sb.append("Hosts: ").append(getHosts()).append(",");
        if (getPrimaryHost() != null)
            sb.append("PrimaryHost: ").append(getPrimaryHost()).append(",");
        if (getDatabaseConnection() != null)
            sb.append("DatabaseConnection: ").append(getDatabaseConnection()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Component == false)
            return false;
        Component other = (Component) obj;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getSid() == null ^ this.getSid() == null)
            return false;
        if (other.getSid() != null && other.getSid().equals(this.getSid()) == false)
            return false;
        if (other.getSystemNumber() == null ^ this.getSystemNumber() == null)
            return false;
        if (other.getSystemNumber() != null && other.getSystemNumber().equals(this.getSystemNumber()) == false)
            return false;
        if (other.getParentComponent() == null ^ this.getParentComponent() == null)
            return false;
        if (other.getParentComponent() != null && other.getParentComponent().equals(this.getParentComponent()) == false)
            return false;
        if (other.getChildComponents() == null ^ this.getChildComponents() == null)
            return false;
        if (other.getChildComponents() != null && other.getChildComponents().equals(this.getChildComponents()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSapHostname() == null ^ this.getSapHostname() == null)
            return false;
        if (other.getSapHostname() != null && other.getSapHostname().equals(this.getSapHostname()) == false)
            return false;
        if (other.getSapFeature() == null ^ this.getSapFeature() == null)
            return false;
        if (other.getSapFeature() != null && other.getSapFeature().equals(this.getSapFeature()) == false)
            return false;
        if (other.getSapKernelVersion() == null ^ this.getSapKernelVersion() == null)
            return false;
        if (other.getSapKernelVersion() != null && other.getSapKernelVersion().equals(this.getSapKernelVersion()) == false)
            return false;
        if (other.getHdbVersion() == null ^ this.getHdbVersion() == null)
            return false;
        if (other.getHdbVersion() != null && other.getHdbVersion().equals(this.getHdbVersion()) == false)
            return false;
        if (other.getResilience() == null ^ this.getResilience() == null)
            return false;
        if (other.getResilience() != null && other.getResilience().equals(this.getResilience()) == false)
            return false;
        if (other.getAssociatedHost() == null ^ this.getAssociatedHost() == null)
            return false;
        if (other.getAssociatedHost() != null && other.getAssociatedHost().equals(this.getAssociatedHost()) == false)
            return false;
        if (other.getDatabases() == null ^ this.getDatabases() == null)
            return false;
        if (other.getDatabases() != null && other.getDatabases().equals(this.getDatabases()) == false)
            return false;
        if (other.getHosts() == null ^ this.getHosts() == null)
            return false;
        if (other.getHosts() != null && other.getHosts().equals(this.getHosts()) == false)
            return false;
        if (other.getPrimaryHost() == null ^ this.getPrimaryHost() == null)
            return false;
        if (other.getPrimaryHost() != null && other.getPrimaryHost().equals(this.getPrimaryHost()) == false)
            return false;
        if (other.getDatabaseConnection() == null ^ this.getDatabaseConnection() == null)
            return false;
        if (other.getDatabaseConnection() != null && other.getDatabaseConnection().equals(this.getDatabaseConnection()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getSid() == null) ? 0 : getSid().hashCode());
        hashCode = prime * hashCode + ((getSystemNumber() == null) ? 0 : getSystemNumber().hashCode());
        hashCode = prime * hashCode + ((getParentComponent() == null) ? 0 : getParentComponent().hashCode());
        hashCode = prime * hashCode + ((getChildComponents() == null) ? 0 : getChildComponents().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSapHostname() == null) ? 0 : getSapHostname().hashCode());
        hashCode = prime * hashCode + ((getSapFeature() == null) ? 0 : getSapFeature().hashCode());
        hashCode = prime * hashCode + ((getSapKernelVersion() == null) ? 0 : getSapKernelVersion().hashCode());
        hashCode = prime * hashCode + ((getHdbVersion() == null) ? 0 : getHdbVersion().hashCode());
        hashCode = prime * hashCode + ((getResilience() == null) ? 0 : getResilience().hashCode());
        hashCode = prime * hashCode + ((getAssociatedHost() == null) ? 0 : getAssociatedHost().hashCode());
        hashCode = prime * hashCode + ((getDatabases() == null) ? 0 : getDatabases().hashCode());
        hashCode = prime * hashCode + ((getHosts() == null) ? 0 : getHosts().hashCode());
        hashCode = prime * hashCode + ((getPrimaryHost() == null) ? 0 : getPrimaryHost().hashCode());
        hashCode = prime * hashCode + ((getDatabaseConnection() == null) ? 0 : getDatabaseConnection().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public Component clone() {
        try {
            return (Component) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.ComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
