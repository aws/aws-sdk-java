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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTargetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The failure code.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The failure message.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The ID of the target group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the target group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     */
    private java.util.List<String> serviceArns;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The target group type.
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

    public GetTargetGroupResult withArn(String arn) {
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

    public GetTargetGroupResult withConfig(TargetGroupConfig config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the target group was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the target group was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the target group was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTargetGroupResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @return The failure code.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTargetGroupResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @param failureMessage
     *        The failure message.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @return The failure message.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @param failureMessage
     *        The failure message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTargetGroupResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
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

    public GetTargetGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the target group was last updated, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the target group was last updated, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the target group was last updated, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTargetGroupResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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

    public GetTargetGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the service.
     */

    public java.util.List<String> getServiceArns() {
        return serviceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * 
     * @param serviceArns
     *        The Amazon Resource Names (ARNs) of the service.
     */

    public void setServiceArns(java.util.Collection<String> serviceArns) {
        if (serviceArns == null) {
            this.serviceArns = null;
            return;
        }

        this.serviceArns = new java.util.ArrayList<String>(serviceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceArns(java.util.Collection)} or {@link #withServiceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceArns
     *        The Amazon Resource Names (ARNs) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTargetGroupResult withServiceArns(String... serviceArns) {
        if (this.serviceArns == null) {
            setServiceArns(new java.util.ArrayList<String>(serviceArns.length));
        }
        for (String ele : serviceArns) {
            this.serviceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * 
     * @param serviceArns
     *        The Amazon Resource Names (ARNs) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTargetGroupResult withServiceArns(java.util.Collection<String> serviceArns) {
        setServiceArns(serviceArns);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see TargetGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see TargetGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public GetTargetGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public GetTargetGroupResult withStatus(TargetGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param type
     *        The target group type.
     * @see TargetGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @return The target group type.
     * @see TargetGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param type
     *        The target group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public GetTargetGroupResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param type
     *        The target group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public GetTargetGroupResult withType(TargetGroupType type) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServiceArns() != null)
            sb.append("ServiceArns: ").append(getServiceArns()).append(",");
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

        if (obj instanceof GetTargetGroupResult == false)
            return false;
        GetTargetGroupResult other = (GetTargetGroupResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServiceArns() == null ^ this.getServiceArns() == null)
            return false;
        if (other.getServiceArns() != null && other.getServiceArns().equals(this.getServiceArns()) == false)
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
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceArns() == null) ? 0 : getServiceArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetTargetGroupResult clone() {
        try {
            return (GetTargetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
