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
package com.amazonaws.services.controlcatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of metadata for an objective.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ObjectiveSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectiveSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the objective.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the objective was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The description of the objective.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The domain that the objective belongs to.
     * </p>
     */
    private AssociatedDomainSummary domain;
    /**
     * <p>
     * The time when the objective was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The name of the objective.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the objective.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that identifies the objective.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the objective.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the objective.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the objective.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that identifies the objective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the objective was created.
     * </p>
     * 
     * @param createTime
     *        The time when the objective was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the objective was created.
     * </p>
     * 
     * @return The time when the objective was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the objective was created.
     * </p>
     * 
     * @param createTime
     *        The time when the objective was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The description of the objective.
     * </p>
     * 
     * @param description
     *        The description of the objective.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the objective.
     * </p>
     * 
     * @return The description of the objective.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the objective.
     * </p>
     * 
     * @param description
     *        The description of the objective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The domain that the objective belongs to.
     * </p>
     * 
     * @param domain
     *        The domain that the objective belongs to.
     */

    public void setDomain(AssociatedDomainSummary domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain that the objective belongs to.
     * </p>
     * 
     * @return The domain that the objective belongs to.
     */

    public AssociatedDomainSummary getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain that the objective belongs to.
     * </p>
     * 
     * @param domain
     *        The domain that the objective belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveSummary withDomain(AssociatedDomainSummary domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The time when the objective was most recently updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time when the objective was most recently updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time when the objective was most recently updated.
     * </p>
     * 
     * @return The time when the objective was most recently updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time when the objective was most recently updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time when the objective was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The name of the objective.
     * </p>
     * 
     * @param name
     *        The name of the objective.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the objective.
     * </p>
     * 
     * @return The name of the objective.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the objective.
     * </p>
     * 
     * @param name
     *        The name of the objective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveSummary withName(String name) {
        setName(name);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectiveSummary == false)
            return false;
        ObjectiveSummary other = (ObjectiveSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ObjectiveSummary clone() {
        try {
            return (ObjectiveSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controlcatalog.model.transform.ObjectiveSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
