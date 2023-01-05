/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The timestamp when this application was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The version of the application that is deployed.
     * </p>
     */
    private DeployedVersionSummary deployedVersion;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the target platform for the application.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy the application.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     */
    private java.util.Date lastStartTime;
    /**
     * <p>
     * The latest version of the application.
     * </p>
     */
    private ApplicationVersionSummary latestVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     * account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you deploy an
     * application.
     * </p>
     */
    private java.util.List<String> listenerArns;
    /**
     * <p>
     * The port associated with the network load balancer listener created in your Amazon Web Services account.
     * </p>
     */
    private java.util.List<Integer> listenerPorts;
    /**
     * <p>
     * The public DNS name of the load balancer created in your Amazon Web Services account.
     * </p>
     */
    private String loadBalancerDnsName;
    /**
     * <p>
     * The list of log summaries. Each log summary includes the log type as well as the log group identifier. These are
     * CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to CloudWatch under the
     * customer's account.
     * </p>
     */
    private java.util.List<LogGroupSummary> logGroups;
    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the reported status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * A list of tags associated with the application.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load balancer.
     * </p>
     */
    private java.util.List<String> targetGroupArns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @return The identifier of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The timestamp when this application was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when this application was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when this application was created.
     * </p>
     * 
     * @return The timestamp when this application was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when this application was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when this application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The version of the application that is deployed.
     * </p>
     * 
     * @param deployedVersion
     *        The version of the application that is deployed.
     */

    public void setDeployedVersion(DeployedVersionSummary deployedVersion) {
        this.deployedVersion = deployedVersion;
    }

    /**
     * <p>
     * The version of the application that is deployed.
     * </p>
     * 
     * @return The version of the application that is deployed.
     */

    public DeployedVersionSummary getDeployedVersion() {
        return this.deployedVersion;
    }

    /**
     * <p>
     * The version of the application that is deployed.
     * </p>
     * 
     * @param deployedVersion
     *        The version of the application that is deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withDeployedVersion(DeployedVersionSummary deployedVersion) {
        setDeployedVersion(deployedVersion);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the target platform for the application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for the application.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The type of the target platform for the application.
     * </p>
     * 
     * @return The type of the target platform for the application.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The type of the target platform for the application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public GetApplicationResult withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The type of the target platform for the application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public GetApplicationResult withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy the application.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the runtime environment where you want to deploy the application.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy the application.
     * </p>
     * 
     * @return The identifier of the runtime environment where you want to deploy the application.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy the application.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the runtime environment where you want to deploy the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of a customer managed key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @return The identifier of a customer managed key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of a customer managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     * 
     * @param lastStartTime
     *        The timestamp when you last started the application. Null until the application runs for the first time.
     */

    public void setLastStartTime(java.util.Date lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     * 
     * @return The timestamp when you last started the application. Null until the application runs for the first time.
     */

    public java.util.Date getLastStartTime() {
        return this.lastStartTime;
    }

    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     * 
     * @param lastStartTime
     *        The timestamp when you last started the application. Null until the application runs for the first time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLastStartTime(java.util.Date lastStartTime) {
        setLastStartTime(lastStartTime);
        return this;
    }

    /**
     * <p>
     * The latest version of the application.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the application.
     */

    public void setLatestVersion(ApplicationVersionSummary latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the application.
     * </p>
     * 
     * @return The latest version of the application.
     */

    public ApplicationVersionSummary getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the application.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLatestVersion(ApplicationVersionSummary latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     * account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you deploy an
     * application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     *         account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you
     *         deploy an application.
     */

    public java.util.List<String> getListenerArns() {
        return listenerArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     * account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you deploy an
     * application.
     * </p>
     * 
     * @param listenerArns
     *        The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     *        account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you
     *        deploy an application.
     */

    public void setListenerArns(java.util.Collection<String> listenerArns) {
        if (listenerArns == null) {
            this.listenerArns = null;
            return;
        }

        this.listenerArns = new java.util.ArrayList<String>(listenerArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     * account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you deploy an
     * application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListenerArns(java.util.Collection)} or {@link #withListenerArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listenerArns
     *        The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     *        account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you
     *        deploy an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withListenerArns(String... listenerArns) {
        if (this.listenerArns == null) {
            setListenerArns(new java.util.ArrayList<String>(listenerArns.length));
        }
        for (String ele : listenerArns) {
            this.listenerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     * account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you deploy an
     * application.
     * </p>
     * 
     * @param listenerArns
     *        The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services
     *        account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you
     *        deploy an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withListenerArns(java.util.Collection<String> listenerArns) {
        setListenerArns(listenerArns);
        return this;
    }

    /**
     * <p>
     * The port associated with the network load balancer listener created in your Amazon Web Services account.
     * </p>
     * 
     * @return The port associated with the network load balancer listener created in your Amazon Web Services account.
     */

    public java.util.List<Integer> getListenerPorts() {
        return listenerPorts;
    }

    /**
     * <p>
     * The port associated with the network load balancer listener created in your Amazon Web Services account.
     * </p>
     * 
     * @param listenerPorts
     *        The port associated with the network load balancer listener created in your Amazon Web Services account.
     */

    public void setListenerPorts(java.util.Collection<Integer> listenerPorts) {
        if (listenerPorts == null) {
            this.listenerPorts = null;
            return;
        }

        this.listenerPorts = new java.util.ArrayList<Integer>(listenerPorts);
    }

    /**
     * <p>
     * The port associated with the network load balancer listener created in your Amazon Web Services account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListenerPorts(java.util.Collection)} or {@link #withListenerPorts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param listenerPorts
     *        The port associated with the network load balancer listener created in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withListenerPorts(Integer... listenerPorts) {
        if (this.listenerPorts == null) {
            setListenerPorts(new java.util.ArrayList<Integer>(listenerPorts.length));
        }
        for (Integer ele : listenerPorts) {
            this.listenerPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The port associated with the network load balancer listener created in your Amazon Web Services account.
     * </p>
     * 
     * @param listenerPorts
     *        The port associated with the network load balancer listener created in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withListenerPorts(java.util.Collection<Integer> listenerPorts) {
        setListenerPorts(listenerPorts);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the load balancer created in your Amazon Web Services account.
     * </p>
     * 
     * @param loadBalancerDnsName
     *        The public DNS name of the load balancer created in your Amazon Web Services account.
     */

    public void setLoadBalancerDnsName(String loadBalancerDnsName) {
        this.loadBalancerDnsName = loadBalancerDnsName;
    }

    /**
     * <p>
     * The public DNS name of the load balancer created in your Amazon Web Services account.
     * </p>
     * 
     * @return The public DNS name of the load balancer created in your Amazon Web Services account.
     */

    public String getLoadBalancerDnsName() {
        return this.loadBalancerDnsName;
    }

    /**
     * <p>
     * The public DNS name of the load balancer created in your Amazon Web Services account.
     * </p>
     * 
     * @param loadBalancerDnsName
     *        The public DNS name of the load balancer created in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLoadBalancerDnsName(String loadBalancerDnsName) {
        setLoadBalancerDnsName(loadBalancerDnsName);
        return this;
    }

    /**
     * <p>
     * The list of log summaries. Each log summary includes the log type as well as the log group identifier. These are
     * CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to CloudWatch under the
     * customer's account.
     * </p>
     * 
     * @return The list of log summaries. Each log summary includes the log type as well as the log group identifier.
     *         These are CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to
     *         CloudWatch under the customer's account.
     */

    public java.util.List<LogGroupSummary> getLogGroups() {
        return logGroups;
    }

    /**
     * <p>
     * The list of log summaries. Each log summary includes the log type as well as the log group identifier. These are
     * CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to CloudWatch under the
     * customer's account.
     * </p>
     * 
     * @param logGroups
     *        The list of log summaries. Each log summary includes the log type as well as the log group identifier.
     *        These are CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to
     *        CloudWatch under the customer's account.
     */

    public void setLogGroups(java.util.Collection<LogGroupSummary> logGroups) {
        if (logGroups == null) {
            this.logGroups = null;
            return;
        }

        this.logGroups = new java.util.ArrayList<LogGroupSummary>(logGroups);
    }

    /**
     * <p>
     * The list of log summaries. Each log summary includes the log type as well as the log group identifier. These are
     * CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to CloudWatch under the
     * customer's account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroups(java.util.Collection)} or {@link #withLogGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logGroups
     *        The list of log summaries. Each log summary includes the log type as well as the log group identifier.
     *        These are CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to
     *        CloudWatch under the customer's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLogGroups(LogGroupSummary... logGroups) {
        if (this.logGroups == null) {
            setLogGroups(new java.util.ArrayList<LogGroupSummary>(logGroups.length));
        }
        for (LogGroupSummary ele : logGroups) {
            this.logGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log summaries. Each log summary includes the log type as well as the log group identifier. These are
     * CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to CloudWatch under the
     * customer's account.
     * </p>
     * 
     * @param logGroups
     *        The list of log summaries. Each log summary includes the log type as well as the log group identifier.
     *        These are CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to
     *        CloudWatch under the customer's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLogGroups(java.util.Collection<LogGroupSummary> logGroups) {
        setLogGroups(logGroups);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param name
     *        The unique identifier of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @return The unique identifier of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param name
     *        The unique identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @see ApplicationLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @return The status of the application.
     * @see ApplicationLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationLifecycle
     */

    public GetApplicationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationLifecycle
     */

    public GetApplicationResult withStatus(ApplicationLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @return The reason for the reported status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the application.
     * </p>
     * 
     * @return A list of tags associated with the application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the application.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags associated with the application.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetApplicationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load balancer.
     * </p>
     * 
     * @return Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load
     *         balancer.
     */

    public java.util.List<String> getTargetGroupArns() {
        return targetGroupArns;
    }

    /**
     * <p>
     * Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load balancer.
     * </p>
     * 
     * @param targetGroupArns
     *        Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load
     *        balancer.
     */

    public void setTargetGroupArns(java.util.Collection<String> targetGroupArns) {
        if (targetGroupArns == null) {
            this.targetGroupArns = null;
            return;
        }

        this.targetGroupArns = new java.util.ArrayList<String>(targetGroupArns);
    }

    /**
     * <p>
     * Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupArns(java.util.Collection)} or {@link #withTargetGroupArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetGroupArns
     *        Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load
     *        balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withTargetGroupArns(String... targetGroupArns) {
        if (this.targetGroupArns == null) {
            setTargetGroupArns(new java.util.ArrayList<String>(targetGroupArns.length));
        }
        for (String ele : targetGroupArns) {
            this.targetGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load balancer.
     * </p>
     * 
     * @param targetGroupArns
     *        Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load
     *        balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withTargetGroupArns(java.util.Collection<String> targetGroupArns) {
        setTargetGroupArns(targetGroupArns);
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeployedVersion() != null)
            sb.append("DeployedVersion: ").append(getDeployedVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLastStartTime() != null)
            sb.append("LastStartTime: ").append(getLastStartTime()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getListenerArns() != null)
            sb.append("ListenerArns: ").append(getListenerArns()).append(",");
        if (getListenerPorts() != null)
            sb.append("ListenerPorts: ").append(getListenerPorts()).append(",");
        if (getLoadBalancerDnsName() != null)
            sb.append("LoadBalancerDnsName: ").append(getLoadBalancerDnsName()).append(",");
        if (getLogGroups() != null)
            sb.append("LogGroups: ").append(getLogGroups()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargetGroupArns() != null)
            sb.append("TargetGroupArns: ").append(getTargetGroupArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationResult == false)
            return false;
        GetApplicationResult other = (GetApplicationResult) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeployedVersion() == null ^ this.getDeployedVersion() == null)
            return false;
        if (other.getDeployedVersion() != null && other.getDeployedVersion().equals(this.getDeployedVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLastStartTime() == null ^ this.getLastStartTime() == null)
            return false;
        if (other.getLastStartTime() != null && other.getLastStartTime().equals(this.getLastStartTime()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getListenerArns() == null ^ this.getListenerArns() == null)
            return false;
        if (other.getListenerArns() != null && other.getListenerArns().equals(this.getListenerArns()) == false)
            return false;
        if (other.getListenerPorts() == null ^ this.getListenerPorts() == null)
            return false;
        if (other.getListenerPorts() != null && other.getListenerPorts().equals(this.getListenerPorts()) == false)
            return false;
        if (other.getLoadBalancerDnsName() == null ^ this.getLoadBalancerDnsName() == null)
            return false;
        if (other.getLoadBalancerDnsName() != null && other.getLoadBalancerDnsName().equals(this.getLoadBalancerDnsName()) == false)
            return false;
        if (other.getLogGroups() == null ^ this.getLogGroups() == null)
            return false;
        if (other.getLogGroups() != null && other.getLogGroups().equals(this.getLogGroups()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetGroupArns() == null ^ this.getTargetGroupArns() == null)
            return false;
        if (other.getTargetGroupArns() != null && other.getTargetGroupArns().equals(this.getTargetGroupArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeployedVersion() == null) ? 0 : getDeployedVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLastStartTime() == null) ? 0 : getLastStartTime().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getListenerArns() == null) ? 0 : getListenerArns().hashCode());
        hashCode = prime * hashCode + ((getListenerPorts() == null) ? 0 : getListenerPorts().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerDnsName() == null) ? 0 : getLoadBalancerDnsName().hashCode());
        hashCode = prime * hashCode + ((getLogGroups() == null) ? 0 : getLogGroups().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupArns() == null) ? 0 : getTargetGroupArns().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationResult clone() {
        try {
            return (GetApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
