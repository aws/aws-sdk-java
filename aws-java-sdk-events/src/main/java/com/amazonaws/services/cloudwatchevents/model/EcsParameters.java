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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The custom parameters to be used when the target is an Amazon ECS task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/EcsParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     */
    private Integer taskCount;
    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     */
    private String group;

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition to use if the event target is an Amazon ECS task.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     * 
     * @return The ARN of the task definition to use if the event target is an Amazon ECS task.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition to use if the event target is an Amazon ECS task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     * 
     * @param taskCount
     *        The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     */

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     * 
     * @return The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     */

    public Integer getTaskCount() {
        return this.taskCount;
    }

    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     * 
     * @param taskCount
     *        The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTaskCount(Integer taskCount) {
        setTaskCount(taskCount);
        return this;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        Specifies the launch type on which your task is running. The launch type that you specify here must match
     *        one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *        only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *        ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the launch type on which your task is running. The launch type that you specify here must match
     *         one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *         only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *         ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        Specifies the launch type on which your task is running. The launch type that you specify here must match
     *        one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *        only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *        ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public EcsParameters withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        Specifies the launch type on which your task is running. The launch type that you specify here must match
     *        one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *        only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *        ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public EcsParameters withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     * 
     * @param networkConfiguration
     *        Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the
     *        VPC subnets and security groups associated with the task, and whether a public IP address is to be used.
     *        This structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the
     *        <code>awsvpc</code> mode is required for Fargate tasks.</p>
     *        <p>
     *        If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the
     *        <code>awsvpc</code> network mode, the task fails.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     * 
     * @return Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies
     *         the VPC subnets and security groups associated with the task, and whether a public IP address is to be
     *         used. This structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the
     *         <code>awsvpc</code> mode is required for Fargate tasks.</p>
     *         <p>
     *         If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the
     *         <code>awsvpc</code> network mode, the task fails.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     * 
     * @param networkConfiguration
     *        Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the
     *        VPC subnets and security groups associated with the task, and whether a public IP address is to be used.
     *        This structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the
     *        <code>awsvpc</code> mode is required for Fargate tasks.</p>
     *        <p>
     *        If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the
     *        <code>awsvpc</code> network mode, the task fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        Specifies the platform version for the task. Specify only the numeric portion of the platform version,
     *        such as <code>1.1.0</code>.</p>
     *        <p>
     *        This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about
     *        valid platform versions, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the platform version for the task. Specify only the numeric portion of the platform version,
     *         such as <code>1.1.0</code>.</p>
     *         <p>
     *         This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information
     *         about valid platform versions, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        Specifies the platform version for the task. Specify only the numeric portion of the platform version,
     *        such as <code>1.1.0</code>.</p>
     *        <p>
     *        This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about
     *        valid platform versions, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     * 
     * @param group
     *        Specifies an ECS task group for the task. The maximum length is 255 characters.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     * 
     * @return Specifies an ECS task group for the task. The maximum length is 255 characters.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     * 
     * @param group
     *        Specifies an ECS task group for the task. The maximum length is 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withGroup(String group) {
        setGroup(group);
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
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: ").append(getTaskDefinitionArn()).append(",");
        if (getTaskCount() != null)
            sb.append("TaskCount: ").append(getTaskCount()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsParameters == false)
            return false;
        EcsParameters other = (EcsParameters) obj;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getTaskCount() == null ^ this.getTaskCount() == null)
            return false;
        if (other.getTaskCount() != null && other.getTaskCount().equals(this.getTaskCount()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getTaskCount() == null) ? 0 : getTaskCount().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public EcsParameters clone() {
        try {
            return (EcsParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.EcsParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
