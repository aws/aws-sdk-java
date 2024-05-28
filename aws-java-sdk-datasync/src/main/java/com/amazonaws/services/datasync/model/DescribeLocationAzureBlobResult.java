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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationAzureBlob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationAzureBlobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of your Azure Blob Storage transfer location.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob storage using
     * a shared access signature (SAS).
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information on
     * blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     */
    private String blobType;
    /**
     * <p>
     * The access tier that you want your objects or files transferred into. This only applies when using the location
     * as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     */
    private String accessTier;
    /**
     * <p>
     * The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * The time that your Azure Blob Storage transfer location was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ARN of your Azure Blob Storage transfer location.
     * </p>
     * 
     * @param locationArn
     *        The ARN of your Azure Blob Storage transfer location.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The ARN of your Azure Blob Storage transfer location.
     * </p>
     * 
     * @return The ARN of your Azure Blob Storage transfer location.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The ARN of your Azure Blob Storage transfer location.
     * </p>
     * 
     * @param locationArn
     *        The ARN of your Azure Blob Storage transfer location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationAzureBlobResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     * 
     * @param locationUri
     *        The URL of the Azure Blob Storage container involved in your transfer.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     * 
     * @return The URL of the Azure Blob Storage container involved in your transfer.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     * 
     * @param locationUri
     *        The URL of the Azure Blob Storage container involved in your transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationAzureBlobResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob storage using
     * a shared access signature (SAS).
     * </p>
     * 
     * @param authenticationType
     *        The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     *        storage using a shared access signature (SAS).
     * @see AzureBlobAuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob storage using
     * a shared access signature (SAS).
     * </p>
     * 
     * @return The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     *         storage using a shared access signature (SAS).
     * @see AzureBlobAuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob storage using
     * a shared access signature (SAS).
     * </p>
     * 
     * @param authenticationType
     *        The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     *        storage using a shared access signature (SAS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobAuthenticationType
     */

    public DescribeLocationAzureBlobResult withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob storage using
     * a shared access signature (SAS).
     * </p>
     * 
     * @param authenticationType
     *        The authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     *        storage using a shared access signature (SAS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobAuthenticationType
     */

    public DescribeLocationAzureBlobResult withAuthenticationType(AzureBlobAuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information on
     * blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @param blobType
     *        The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     *        Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information
     *        on blob types, see the <a href=
     *        "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *        >Azure Blob Storage documentation</a>.
     * @see AzureBlobType
     */

    public void setBlobType(String blobType) {
        this.blobType = blobType;
    }

    /**
     * <p>
     * The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information on
     * blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @return The type of blob that you want your objects or files to be when transferring them into Azure Blob
     *         Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
     *         information on blob types, see the <a href=
     *         "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *         >Azure Blob Storage documentation</a>.
     * @see AzureBlobType
     */

    public String getBlobType() {
        return this.blobType;
    }

    /**
     * <p>
     * The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information on
     * blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @param blobType
     *        The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     *        Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information
     *        on blob types, see the <a href=
     *        "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *        >Azure Blob Storage documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobType
     */

    public DescribeLocationAzureBlobResult withBlobType(String blobType) {
        setBlobType(blobType);
        return this;
    }

    /**
     * <p>
     * The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information on
     * blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @param blobType
     *        The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage.
     *        Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more information
     *        on blob types, see the <a href=
     *        "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *        >Azure Blob Storage documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobType
     */

    public DescribeLocationAzureBlobResult withBlobType(AzureBlobType blobType) {
        this.blobType = blobType.toString();
        return this;
    }

    /**
     * <p>
     * The access tier that you want your objects or files transferred into. This only applies when using the location
     * as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @param accessTier
     *        The access tier that you want your objects or files transferred into. This only applies when using the
     *        location as a transfer destination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *        >Access tiers</a>.
     * @see AzureAccessTier
     */

    public void setAccessTier(String accessTier) {
        this.accessTier = accessTier;
    }

    /**
     * <p>
     * The access tier that you want your objects or files transferred into. This only applies when using the location
     * as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @return The access tier that you want your objects or files transferred into. This only applies when using the
     *         location as a transfer destination. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *         >Access tiers</a>.
     * @see AzureAccessTier
     */

    public String getAccessTier() {
        return this.accessTier;
    }

    /**
     * <p>
     * The access tier that you want your objects or files transferred into. This only applies when using the location
     * as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @param accessTier
     *        The access tier that you want your objects or files transferred into. This only applies when using the
     *        location as a transfer destination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *        >Access tiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureAccessTier
     */

    public DescribeLocationAzureBlobResult withAccessTier(String accessTier) {
        setAccessTier(accessTier);
        return this;
    }

    /**
     * <p>
     * The access tier that you want your objects or files transferred into. This only applies when using the location
     * as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @param accessTier
     *        The access tier that you want your objects or files transferred into. This only applies when using the
     *        location as a transfer destination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *        >Access tiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureAccessTier
     */

    public DescribeLocationAzureBlobResult withAccessTier(AzureAccessTier accessTier) {
        this.accessTier = accessTier.toString();
        return this;
    }

    /**
     * <p>
     * The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     * </p>
     * 
     * @return The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     * </p>
     * 
     * @param agentArns
     *        The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationAzureBlobResult withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     * </p>
     * 
     * @param agentArns
     *        The ARNs of the DataSync agents that can connect with your Azure Blob Storage container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationAzureBlobResult withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * The time that your Azure Blob Storage transfer location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that your Azure Blob Storage transfer location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that your Azure Blob Storage transfer location was created.
     * </p>
     * 
     * @return The time that your Azure Blob Storage transfer location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that your Azure Blob Storage transfer location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that your Azure Blob Storage transfer location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationAzureBlobResult withCreationTime(java.util.Date creationTime) {
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getBlobType() != null)
            sb.append("BlobType: ").append(getBlobType()).append(",");
        if (getAccessTier() != null)
            sb.append("AccessTier: ").append(getAccessTier()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
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

        if (obj instanceof DescribeLocationAzureBlobResult == false)
            return false;
        DescribeLocationAzureBlobResult other = (DescribeLocationAzureBlobResult) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getBlobType() == null ^ this.getBlobType() == null)
            return false;
        if (other.getBlobType() != null && other.getBlobType().equals(this.getBlobType()) == false)
            return false;
        if (other.getAccessTier() == null ^ this.getAccessTier() == null)
            return false;
        if (other.getAccessTier() != null && other.getAccessTier().equals(this.getAccessTier()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
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

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getBlobType() == null) ? 0 : getBlobType().hashCode());
        hashCode = prime * hashCode + ((getAccessTier() == null) ? 0 : getAccessTier().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationAzureBlobResult clone() {
        try {
            return (DescribeLocationAzureBlobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
