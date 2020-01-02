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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A count of noncompliant resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/Summary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Summary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     */
    private String lastUpdated;
    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call
     * the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     */
    private String targetIdType;
    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The AWS resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     */
    private Long nonCompliantResources;

    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     * 
     * @param lastUpdated
     *        The timestamp that shows when this summary was generated in this Region.
     */

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     * 
     * @return The timestamp that shows when this summary was generated in this Region.
     */

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     * 
     * @param lastUpdated
     *        The timestamp that shows when this summary was generated in this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withLastUpdated(String lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call
     * the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API.
     * </p>
     * 
     * @param targetId
     *        The account identifier or the root identifier of the organization. If you don't know the root ID, you can
     *        call the AWS Organizations <a
     *        href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call
     * the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API.
     * </p>
     * 
     * @return The account identifier or the root identifier of the organization. If you don't know the root ID, you can
     *         call the AWS Organizations <a
     *         href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call
     * the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API.
     * </p>
     * 
     * @param targetId
     *        The account identifier or the root identifier of the organization. If you don't know the root ID, you can
     *        call the AWS Organizations <a
     *        href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * 
     * @param targetIdType
     *        Whether the target is an account, an OU, or the organization root.
     * @see TargetIdType
     */

    public void setTargetIdType(String targetIdType) {
        this.targetIdType = targetIdType;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * 
     * @return Whether the target is an account, an OU, or the organization root.
     * @see TargetIdType
     */

    public String getTargetIdType() {
        return this.targetIdType;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * 
     * @param targetIdType
     *        Whether the target is an account, an OU, or the organization root.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetIdType
     */

    public Summary withTargetIdType(String targetIdType) {
        setTargetIdType(targetIdType);
        return this;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * 
     * @param targetIdType
     *        Whether the target is an account, an OU, or the organization root.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetIdType
     */

    public Summary withTargetIdType(TargetIdType targetIdType) {
        this.targetIdType = targetIdType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     * 
     * @param region
     *        The AWS Region that the summary applies to.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     * 
     * @return The AWS Region that the summary applies to.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     * 
     * @param region
     *        The AWS Region that the summary applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The AWS resource type.
     * </p>
     * 
     * @param resourceType
     *        The AWS resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The AWS resource type.
     * </p>
     * 
     * @return The AWS resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The AWS resource type.
     * </p>
     * 
     * @param resourceType
     *        The AWS resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     * 
     * @param nonCompliantResources
     *        The count of noncompliant resources.
     */

    public void setNonCompliantResources(Long nonCompliantResources) {
        this.nonCompliantResources = nonCompliantResources;
    }

    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     * 
     * @return The count of noncompliant resources.
     */

    public Long getNonCompliantResources() {
        return this.nonCompliantResources;
    }

    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     * 
     * @param nonCompliantResources
     *        The count of noncompliant resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summary withNonCompliantResources(Long nonCompliantResources) {
        setNonCompliantResources(nonCompliantResources);
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
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetIdType() != null)
            sb.append("TargetIdType: ").append(getTargetIdType()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getNonCompliantResources() != null)
            sb.append("NonCompliantResources: ").append(getNonCompliantResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Summary == false)
            return false;
        Summary other = (Summary) obj;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetIdType() == null ^ this.getTargetIdType() == null)
            return false;
        if (other.getTargetIdType() != null && other.getTargetIdType().equals(this.getTargetIdType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getNonCompliantResources() == null ^ this.getNonCompliantResources() == null)
            return false;
        if (other.getNonCompliantResources() != null && other.getNonCompliantResources().equals(this.getNonCompliantResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetIdType() == null) ? 0 : getTargetIdType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantResources() == null) ? 0 : getNonCompliantResources().hashCode());
        return hashCode;
    }

    @Override
    public Summary clone() {
        try {
            return (Summary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroupstaggingapi.model.transform.SummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
