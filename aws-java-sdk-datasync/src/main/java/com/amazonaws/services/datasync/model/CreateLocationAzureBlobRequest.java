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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationAzureBlob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationAzureBlobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     */
    private String containerUrl;
    /**
     * <p>
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     * storage using a shared access signature (SAS).
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     * </p>
     */
    private AzureBlobSasConfiguration sasConfiguration;
    /**
     * <p>
     * Specifies the type of blob that you want your objects or files to be when transferring them into Azure Blob
     * Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
     * information on blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     */
    private String blobType;
    /**
     * <p>
     * Specifies the access tier that you want your objects or files transferred into. This only applies when using the
     * location as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     */
    private String accessTier;
    /**
     * <p>
     * Specifies path segments if you want to limit your transfer to a virtual directory in your container (for example,
     * <code>/my/images</code>).
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob Storage
     * container.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for your
     * transfer</a>.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     * 
     * @param containerUrl
     *        Specifies the URL of the Azure Blob Storage container involved in your transfer.
     */

    public void setContainerUrl(String containerUrl) {
        this.containerUrl = containerUrl;
    }

    /**
     * <p>
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     * 
     * @return Specifies the URL of the Azure Blob Storage container involved in your transfer.
     */

    public String getContainerUrl() {
        return this.containerUrl;
    }

    /**
     * <p>
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     * </p>
     * 
     * @param containerUrl
     *        Specifies the URL of the Azure Blob Storage container involved in your transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationAzureBlobRequest withContainerUrl(String containerUrl) {
        setContainerUrl(containerUrl);
        return this;
    }

    /**
     * <p>
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     * storage using a shared access signature (SAS).
     * </p>
     * 
     * @param authenticationType
     *        Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access
     *        blob storage using a shared access signature (SAS).
     * @see AzureBlobAuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     * storage using a shared access signature (SAS).
     * </p>
     * 
     * @return Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access
     *         blob storage using a shared access signature (SAS).
     * @see AzureBlobAuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     * storage using a shared access signature (SAS).
     * </p>
     * 
     * @param authenticationType
     *        Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access
     *        blob storage using a shared access signature (SAS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobAuthenticationType
     */

    public CreateLocationAzureBlobRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access blob
     * storage using a shared access signature (SAS).
     * </p>
     * 
     * @param authenticationType
     *        Specifies the authentication method DataSync uses to access your Azure Blob Storage. DataSync can access
     *        blob storage using a shared access signature (SAS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobAuthenticationType
     */

    public CreateLocationAzureBlobRequest withAuthenticationType(AzureBlobAuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     * </p>
     * 
     * @param sasConfiguration
     *        Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     */

    public void setSasConfiguration(AzureBlobSasConfiguration sasConfiguration) {
        this.sasConfiguration = sasConfiguration;
    }

    /**
     * <p>
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     * </p>
     * 
     * @return Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     */

    public AzureBlobSasConfiguration getSasConfiguration() {
        return this.sasConfiguration;
    }

    /**
     * <p>
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     * </p>
     * 
     * @param sasConfiguration
     *        Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationAzureBlobRequest withSasConfiguration(AzureBlobSasConfiguration sasConfiguration) {
        setSasConfiguration(sasConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the type of blob that you want your objects or files to be when transferring them into Azure Blob
     * Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
     * information on blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @param blobType
     *        Specifies the type of blob that you want your objects or files to be when transferring them into Azure
     *        Blob Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     *        more information on blob types, see the <a href=
     *        "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *        >Azure Blob Storage documentation</a>.
     * @see AzureBlobType
     */

    public void setBlobType(String blobType) {
        this.blobType = blobType;
    }

    /**
     * <p>
     * Specifies the type of blob that you want your objects or files to be when transferring them into Azure Blob
     * Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
     * information on blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @return Specifies the type of blob that you want your objects or files to be when transferring them into Azure
     *         Blob Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     *         more information on blob types, see the <a href=
     *         "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *         >Azure Blob Storage documentation</a>.
     * @see AzureBlobType
     */

    public String getBlobType() {
        return this.blobType;
    }

    /**
     * <p>
     * Specifies the type of blob that you want your objects or files to be when transferring them into Azure Blob
     * Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
     * information on blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @param blobType
     *        Specifies the type of blob that you want your objects or files to be when transferring them into Azure
     *        Blob Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     *        more information on blob types, see the <a href=
     *        "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *        >Azure Blob Storage documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobType
     */

    public CreateLocationAzureBlobRequest withBlobType(String blobType) {
        setBlobType(blobType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of blob that you want your objects or files to be when transferring them into Azure Blob
     * Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
     * information on blob types, see the <a href=
     * "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     * >Azure Blob Storage documentation</a>.
     * </p>
     * 
     * @param blobType
     *        Specifies the type of blob that you want your objects or files to be when transferring them into Azure
     *        Blob Storage. Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     *        more information on blob types, see the <a href=
     *        "https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs"
     *        >Azure Blob Storage documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureBlobType
     */

    public CreateLocationAzureBlobRequest withBlobType(AzureBlobType blobType) {
        this.blobType = blobType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the access tier that you want your objects or files transferred into. This only applies when using the
     * location as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @param accessTier
     *        Specifies the access tier that you want your objects or files transferred into. This only applies when
     *        using the location as a transfer destination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *        >Access tiers</a>.
     * @see AzureAccessTier
     */

    public void setAccessTier(String accessTier) {
        this.accessTier = accessTier;
    }

    /**
     * <p>
     * Specifies the access tier that you want your objects or files transferred into. This only applies when using the
     * location as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @return Specifies the access tier that you want your objects or files transferred into. This only applies when
     *         using the location as a transfer destination. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *         >Access tiers</a>.
     * @see AzureAccessTier
     */

    public String getAccessTier() {
        return this.accessTier;
    }

    /**
     * <p>
     * Specifies the access tier that you want your objects or files transferred into. This only applies when using the
     * location as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @param accessTier
     *        Specifies the access tier that you want your objects or files transferred into. This only applies when
     *        using the location as a transfer destination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *        >Access tiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureAccessTier
     */

    public CreateLocationAzureBlobRequest withAccessTier(String accessTier) {
        setAccessTier(accessTier);
        return this;
    }

    /**
     * <p>
     * Specifies the access tier that you want your objects or files transferred into. This only applies when using the
     * location as a transfer destination. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     * >Access tiers</a>.
     * </p>
     * 
     * @param accessTier
     *        Specifies the access tier that you want your objects or files transferred into. This only applies when
     *        using the location as a transfer destination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers"
     *        >Access tiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AzureAccessTier
     */

    public CreateLocationAzureBlobRequest withAccessTier(AzureAccessTier accessTier) {
        this.accessTier = accessTier.toString();
        return this;
    }

    /**
     * <p>
     * Specifies path segments if you want to limit your transfer to a virtual directory in your container (for example,
     * <code>/my/images</code>).
     * </p>
     * 
     * @param subdirectory
     *        Specifies path segments if you want to limit your transfer to a virtual directory in your container (for
     *        example, <code>/my/images</code>).
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies path segments if you want to limit your transfer to a virtual directory in your container (for example,
     * <code>/my/images</code>).
     * </p>
     * 
     * @return Specifies path segments if you want to limit your transfer to a virtual directory in your container (for
     *         example, <code>/my/images</code>).
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies path segments if you want to limit your transfer to a virtual directory in your container (for example,
     * <code>/my/images</code>).
     * </p>
     * 
     * @param subdirectory
     *        Specifies path segments if you want to limit your transfer to a virtual directory in your container (for
     *        example, <code>/my/images</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationAzureBlobRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob Storage
     * container.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for your
     * transfer</a>.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob
     *         Storage container.</p>
     *         <p>
     *         You can specify more than one agent. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents
     *         for your transfer</a>.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob Storage
     * container.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for your
     * transfer</a>.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob
     *        Storage container.</p>
     *        <p>
     *        You can specify more than one agent. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents
     *        for your transfer</a>.
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
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob Storage
     * container.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for your
     * transfer</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob
     *        Storage container.</p>
     *        <p>
     *        You can specify more than one agent. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents
     *        for your transfer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationAzureBlobRequest withAgentArns(String... agentArns) {
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
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob Storage
     * container.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for your
     * transfer</a>.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure Blob
     *        Storage container.</p>
     *        <p>
     *        You can specify more than one agent. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents
     *        for your transfer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationAzureBlobRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * 
     * @return Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *         recommend creating at least a name tag for your transfer location.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your transfer location.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your transfer location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationAzureBlobRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your transfer location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationAzureBlobRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getContainerUrl() != null)
            sb.append("ContainerUrl: ").append(getContainerUrl()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getSasConfiguration() != null)
            sb.append("SasConfiguration: ").append(getSasConfiguration()).append(",");
        if (getBlobType() != null)
            sb.append("BlobType: ").append(getBlobType()).append(",");
        if (getAccessTier() != null)
            sb.append("AccessTier: ").append(getAccessTier()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationAzureBlobRequest == false)
            return false;
        CreateLocationAzureBlobRequest other = (CreateLocationAzureBlobRequest) obj;
        if (other.getContainerUrl() == null ^ this.getContainerUrl() == null)
            return false;
        if (other.getContainerUrl() != null && other.getContainerUrl().equals(this.getContainerUrl()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getSasConfiguration() == null ^ this.getSasConfiguration() == null)
            return false;
        if (other.getSasConfiguration() != null && other.getSasConfiguration().equals(this.getSasConfiguration()) == false)
            return false;
        if (other.getBlobType() == null ^ this.getBlobType() == null)
            return false;
        if (other.getBlobType() != null && other.getBlobType().equals(this.getBlobType()) == false)
            return false;
        if (other.getAccessTier() == null ^ this.getAccessTier() == null)
            return false;
        if (other.getAccessTier() != null && other.getAccessTier().equals(this.getAccessTier()) == false)
            return false;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerUrl() == null) ? 0 : getContainerUrl().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getSasConfiguration() == null) ? 0 : getSasConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBlobType() == null) ? 0 : getBlobType().hashCode());
        hashCode = prime * hashCode + ((getAccessTier() == null) ? 0 : getAccessTier().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationAzureBlobRequest clone() {
        return (CreateLocationAzureBlobRequest) super.clone();
    }

}
