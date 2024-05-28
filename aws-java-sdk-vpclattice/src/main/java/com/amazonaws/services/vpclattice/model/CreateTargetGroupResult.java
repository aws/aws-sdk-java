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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTargetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The target group configuration.
     * </p>
     */
    private TargetGroupConfig config;
    /**
     * <p>
     * The ID of the target group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the target group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry it
     * while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of target group.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the target group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The target group configuration.
     * </p>
     * 
     * @param config
     *        The target group configuration.
     */

    public void setConfig(TargetGroupConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * The target group configuration.
     * </p>
     * 
     * @return The target group configuration.
     */

    public TargetGroupConfig getConfig() {
        return this.config;
    }

    /**
     * <p>
     * The target group configuration.
     * </p>
     * 
     * @param config
     *        The target group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupResult withConfig(TargetGroupConfig config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @param id
     *        The ID of the target group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @return The ID of the target group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @param id
     *        The ID of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param name
     *        The name of the target group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @return The name of the target group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param name
     *        The name of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry it
     * while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * </p>
     * 
     * @param status
     *        The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry
     *        it while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * @see TargetGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry it
     * while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * </p>
     * 
     * @return The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you
     *         retry it while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * @see TargetGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry it
     * while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * </p>
     * 
     * @param status
     *        The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry
     *        it while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public CreateTargetGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry it
     * while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * </p>
     * 
     * @param status
     *        The status. You can retry the operation if the status is <code>CREATE_FAILED</code>. However, if you retry
     *        it while the status is <code>CREATE_IN_PROGRESS</code>, there is no change in the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public CreateTargetGroupResult withStatus(TargetGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @param type
     *        The type of target group.
     * @see TargetGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @return The type of target group.
     * @see TargetGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @param type
     *        The type of target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public CreateTargetGroupResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @param type
     *        The type of target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public CreateTargetGroupResult withType(TargetGroupType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTargetGroupResult == false)
            return false;
        CreateTargetGroupResult other = (CreateTargetGroupResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateTargetGroupResult clone() {
        try {
            return (CreateTargetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
