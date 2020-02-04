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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the source of the data included in the resource data sync.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResourceDataSyncSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of data source for the resource data sync. <code>SourceType</code> is either
     * <code>AwsOrganizations</code> (if an organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can
     * synchronize data from AWS Organizations.
     * </p>
     */
    private ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource;
    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data sync.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourceRegions;
    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
     * </p>
     */
    private Boolean includeFutureRegions;

    /**
     * <p>
     * The type of data source for the resource data sync. <code>SourceType</code> is either
     * <code>AwsOrganizations</code> (if an organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     * 
     * @param sourceType
     *        The type of data source for the resource data sync. <code>SourceType</code> is either
     *        <code>AwsOrganizations</code> (if an organization is present in AWS Organizations) or
     *        <code>singleAccountMultiRegions</code>.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of data source for the resource data sync. <code>SourceType</code> is either
     * <code>AwsOrganizations</code> (if an organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     * 
     * @return The type of data source for the resource data sync. <code>SourceType</code> is either
     *         <code>AwsOrganizations</code> (if an organization is present in AWS Organizations) or
     *         <code>singleAccountMultiRegions</code>.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of data source for the resource data sync. <code>SourceType</code> is either
     * <code>AwsOrganizations</code> (if an organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     * 
     * @param sourceType
     *        The type of data source for the resource data sync. <code>SourceType</code> is either
     *        <code>AwsOrganizations</code> (if an organization is present in AWS Organizations) or
     *        <code>singleAccountMultiRegions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncSource withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can
     * synchronize data from AWS Organizations.
     * </p>
     * 
     * @param awsOrganizationsSource
     *        Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can
     *        synchronize data from AWS Organizations.
     */

    public void setAwsOrganizationsSource(ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource) {
        this.awsOrganizationsSource = awsOrganizationsSource;
    }

    /**
     * <p>
     * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can
     * synchronize data from AWS Organizations.
     * </p>
     * 
     * @return Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can
     *         synchronize data from AWS Organizations.
     */

    public ResourceDataSyncAwsOrganizationsSource getAwsOrganizationsSource() {
        return this.awsOrganizationsSource;
    }

    /**
     * <p>
     * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can
     * synchronize data from AWS Organizations.
     * </p>
     * 
     * @param awsOrganizationsSource
     *        Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can
     *        synchronize data from AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncSource withAwsOrganizationsSource(ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource) {
        setAwsOrganizationsSource(awsOrganizationsSource);
        return this;
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data sync.
     * </p>
     * 
     * @return The <code>SyncSource</code> AWS Regions included in the resource data sync.
     */

    public java.util.List<String> getSourceRegions() {
        if (sourceRegions == null) {
            sourceRegions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourceRegions;
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data sync.
     * </p>
     * 
     * @param sourceRegions
     *        The <code>SyncSource</code> AWS Regions included in the resource data sync.
     */

    public void setSourceRegions(java.util.Collection<String> sourceRegions) {
        if (sourceRegions == null) {
            this.sourceRegions = null;
            return;
        }

        this.sourceRegions = new com.amazonaws.internal.SdkInternalList<String>(sourceRegions);
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data sync.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceRegions(java.util.Collection)} or {@link #withSourceRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceRegions
     *        The <code>SyncSource</code> AWS Regions included in the resource data sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncSource withSourceRegions(String... sourceRegions) {
        if (this.sourceRegions == null) {
            setSourceRegions(new com.amazonaws.internal.SdkInternalList<String>(sourceRegions.length));
        }
        for (String ele : sourceRegions) {
            this.sourceRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data sync.
     * </p>
     * 
     * @param sourceRegions
     *        The <code>SyncSource</code> AWS Regions included in the resource data sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncSource withSourceRegions(java.util.Collection<String> sourceRegions) {
        setSourceRegions(sourceRegions);
        return this;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
     * </p>
     * 
     * @param includeFutureRegions
     *        Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come
     *        online.
     */

    public void setIncludeFutureRegions(Boolean includeFutureRegions) {
        this.includeFutureRegions = includeFutureRegions;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
     * </p>
     * 
     * @return Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come
     *         online.
     */

    public Boolean getIncludeFutureRegions() {
        return this.includeFutureRegions;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
     * </p>
     * 
     * @param includeFutureRegions
     *        Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come
     *        online.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncSource withIncludeFutureRegions(Boolean includeFutureRegions) {
        setIncludeFutureRegions(includeFutureRegions);
        return this;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
     * </p>
     * 
     * @return Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come
     *         online.
     */

    public Boolean isIncludeFutureRegions() {
        return this.includeFutureRegions;
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getAwsOrganizationsSource() != null)
            sb.append("AwsOrganizationsSource: ").append(getAwsOrganizationsSource()).append(",");
        if (getSourceRegions() != null)
            sb.append("SourceRegions: ").append(getSourceRegions()).append(",");
        if (getIncludeFutureRegions() != null)
            sb.append("IncludeFutureRegions: ").append(getIncludeFutureRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncSource == false)
            return false;
        ResourceDataSyncSource other = (ResourceDataSyncSource) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getAwsOrganizationsSource() == null ^ this.getAwsOrganizationsSource() == null)
            return false;
        if (other.getAwsOrganizationsSource() != null && other.getAwsOrganizationsSource().equals(this.getAwsOrganizationsSource()) == false)
            return false;
        if (other.getSourceRegions() == null ^ this.getSourceRegions() == null)
            return false;
        if (other.getSourceRegions() != null && other.getSourceRegions().equals(this.getSourceRegions()) == false)
            return false;
        if (other.getIncludeFutureRegions() == null ^ this.getIncludeFutureRegions() == null)
            return false;
        if (other.getIncludeFutureRegions() != null && other.getIncludeFutureRegions().equals(this.getIncludeFutureRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getAwsOrganizationsSource() == null) ? 0 : getAwsOrganizationsSource().hashCode());
        hashCode = prime * hashCode + ((getSourceRegions() == null) ? 0 : getSourceRegions().hashCode());
        hashCode = prime * hashCode + ((getIncludeFutureRegions() == null) ? 0 : getIncludeFutureRegions().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDataSyncSource clone() {
        try {
            return (ResourceDataSyncSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ResourceDataSyncSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
