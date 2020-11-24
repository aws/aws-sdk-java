/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for an Amazon EMR Studio, including ID, Name, VPC, and Description. The details do not include subnets, IAM
 * roles, security groups, or tags associated with the Studio.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/StudioSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The name of the Amazon EMR Studio.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The time when the Amazon EMR Studio was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @return The ID of the Amazon EMR Studio.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioSummary withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon EMR Studio.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EMR Studio.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon EMR Studio.
     * </p>
     * 
     * @return The name of the Amazon EMR Studio.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon EMR Studio.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
     * </p>
     * 
     * @return The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioSummary withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     * 
     * @param description
     *        The detailed description of the EMR Studio.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     * 
     * @return The detailed description of the EMR Studio.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     * 
     * @param description
     *        The detailed description of the EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     * 
     * @param url
     *        The unique access URL of the Amazon EMR Studio.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     * 
     * @return The unique access URL of the Amazon EMR Studio.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     * 
     * @param url
     *        The unique access URL of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioSummary withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The time when the Amazon EMR Studio was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Amazon EMR Studio was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the Amazon EMR Studio was created.
     * </p>
     * 
     * @return The time when the Amazon EMR Studio was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the Amazon EMR Studio was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Amazon EMR Studio was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StudioSummary == false)
            return false;
        StudioSummary other = (StudioSummary) obj;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public StudioSummary clone() {
        try {
            return (StudioSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.StudioSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
