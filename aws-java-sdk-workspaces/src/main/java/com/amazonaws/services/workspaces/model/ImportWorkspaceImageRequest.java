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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportWorkspaceImage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportWorkspaceImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the EC2 image.
     * </p>
     */
    private String ec2ImageId;
    /**
     * <p>
     * The ingestion process to be used when importing the image.
     * </p>
     */
    private String ingestionProcess;
    /**
     * <p>
     * The name of the WorkSpace image.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The description of the WorkSpace image.
     * </p>
     */
    private String imageDescription;
    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier of the EC2 image.
     * </p>
     * 
     * @param ec2ImageId
     *        The identifier of the EC2 image.
     */

    public void setEc2ImageId(String ec2ImageId) {
        this.ec2ImageId = ec2ImageId;
    }

    /**
     * <p>
     * The identifier of the EC2 image.
     * </p>
     * 
     * @return The identifier of the EC2 image.
     */

    public String getEc2ImageId() {
        return this.ec2ImageId;
    }

    /**
     * <p>
     * The identifier of the EC2 image.
     * </p>
     * 
     * @param ec2ImageId
     *        The identifier of the EC2 image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportWorkspaceImageRequest withEc2ImageId(String ec2ImageId) {
        setEc2ImageId(ec2ImageId);
        return this;
    }

    /**
     * <p>
     * The ingestion process to be used when importing the image.
     * </p>
     * 
     * @param ingestionProcess
     *        The ingestion process to be used when importing the image.
     * @see WorkspaceImageIngestionProcess
     */

    public void setIngestionProcess(String ingestionProcess) {
        this.ingestionProcess = ingestionProcess;
    }

    /**
     * <p>
     * The ingestion process to be used when importing the image.
     * </p>
     * 
     * @return The ingestion process to be used when importing the image.
     * @see WorkspaceImageIngestionProcess
     */

    public String getIngestionProcess() {
        return this.ingestionProcess;
    }

    /**
     * <p>
     * The ingestion process to be used when importing the image.
     * </p>
     * 
     * @param ingestionProcess
     *        The ingestion process to be used when importing the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageIngestionProcess
     */

    public ImportWorkspaceImageRequest withIngestionProcess(String ingestionProcess) {
        setIngestionProcess(ingestionProcess);
        return this;
    }

    /**
     * <p>
     * The ingestion process to be used when importing the image.
     * </p>
     * 
     * @param ingestionProcess
     *        The ingestion process to be used when importing the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageIngestionProcess
     */

    public ImportWorkspaceImageRequest withIngestionProcess(WorkspaceImageIngestionProcess ingestionProcess) {
        this.ingestionProcess = ingestionProcess.toString();
        return this;
    }

    /**
     * <p>
     * The name of the WorkSpace image.
     * </p>
     * 
     * @param imageName
     *        The name of the WorkSpace image.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the WorkSpace image.
     * </p>
     * 
     * @return The name of the WorkSpace image.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the WorkSpace image.
     * </p>
     * 
     * @param imageName
     *        The name of the WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportWorkspaceImageRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The description of the WorkSpace image.
     * </p>
     * 
     * @param imageDescription
     *        The description of the WorkSpace image.
     */

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    /**
     * <p>
     * The description of the WorkSpace image.
     * </p>
     * 
     * @return The description of the WorkSpace image.
     */

    public String getImageDescription() {
        return this.imageDescription;
    }

    /**
     * <p>
     * The description of the WorkSpace image.
     * </p>
     * 
     * @param imageDescription
     *        The description of the WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportWorkspaceImageRequest withImageDescription(String imageDescription) {
        setImageDescription(imageDescription);
        return this;
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * 
     * @return The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * 
     * @param tags
     *        The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportWorkspaceImageRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * 
     * @param tags
     *        The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportWorkspaceImageRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getEc2ImageId() != null)
            sb.append("Ec2ImageId: ").append(getEc2ImageId()).append(",");
        if (getIngestionProcess() != null)
            sb.append("IngestionProcess: ").append(getIngestionProcess()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getImageDescription() != null)
            sb.append("ImageDescription: ").append(getImageDescription()).append(",");
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

        if (obj instanceof ImportWorkspaceImageRequest == false)
            return false;
        ImportWorkspaceImageRequest other = (ImportWorkspaceImageRequest) obj;
        if (other.getEc2ImageId() == null ^ this.getEc2ImageId() == null)
            return false;
        if (other.getEc2ImageId() != null && other.getEc2ImageId().equals(this.getEc2ImageId()) == false)
            return false;
        if (other.getIngestionProcess() == null ^ this.getIngestionProcess() == null)
            return false;
        if (other.getIngestionProcess() != null && other.getIngestionProcess().equals(this.getIngestionProcess()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getImageDescription() == null ^ this.getImageDescription() == null)
            return false;
        if (other.getImageDescription() != null && other.getImageDescription().equals(this.getImageDescription()) == false)
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

        hashCode = prime * hashCode + ((getEc2ImageId() == null) ? 0 : getEc2ImageId().hashCode());
        hashCode = prime * hashCode + ((getIngestionProcess() == null) ? 0 : getIngestionProcess().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getImageDescription() == null) ? 0 : getImageDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportWorkspaceImageRequest clone() {
        return (ImportWorkspaceImageRequest) super.clone();
    }

}
