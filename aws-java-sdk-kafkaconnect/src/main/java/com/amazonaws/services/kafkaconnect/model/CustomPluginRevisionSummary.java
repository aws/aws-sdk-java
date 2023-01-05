/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the revision of a custom plugin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CustomPluginRevisionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomPluginRevisionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of the plugin file.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the custom plugin.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Details about the custom plugin file.
     * </p>
     */
    private CustomPluginFileDescription fileDescription;
    /**
     * <p>
     * Information about the location of the custom plugin.
     * </p>
     */
    private CustomPluginLocationDescription location;
    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     */
    private Long revision;

    /**
     * <p>
     * The format of the plugin file.
     * </p>
     * 
     * @param contentType
     *        The format of the plugin file.
     * @see CustomPluginContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The format of the plugin file.
     * </p>
     * 
     * @return The format of the plugin file.
     * @see CustomPluginContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The format of the plugin file.
     * </p>
     * 
     * @param contentType
     *        The format of the plugin file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginContentType
     */

    public CustomPluginRevisionSummary withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The format of the plugin file.
     * </p>
     * 
     * @param contentType
     *        The format of the plugin file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginContentType
     */

    public CustomPluginRevisionSummary withContentType(CustomPluginContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the custom plugin was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     * 
     * @return The time that the custom plugin was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the custom plugin was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginRevisionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the custom plugin.
     * </p>
     * 
     * @param description
     *        The description of the custom plugin.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the custom plugin.
     * </p>
     * 
     * @return The description of the custom plugin.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the custom plugin.
     * </p>
     * 
     * @param description
     *        The description of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginRevisionSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Details about the custom plugin file.
     * </p>
     * 
     * @param fileDescription
     *        Details about the custom plugin file.
     */

    public void setFileDescription(CustomPluginFileDescription fileDescription) {
        this.fileDescription = fileDescription;
    }

    /**
     * <p>
     * Details about the custom plugin file.
     * </p>
     * 
     * @return Details about the custom plugin file.
     */

    public CustomPluginFileDescription getFileDescription() {
        return this.fileDescription;
    }

    /**
     * <p>
     * Details about the custom plugin file.
     * </p>
     * 
     * @param fileDescription
     *        Details about the custom plugin file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginRevisionSummary withFileDescription(CustomPluginFileDescription fileDescription) {
        setFileDescription(fileDescription);
        return this;
    }

    /**
     * <p>
     * Information about the location of the custom plugin.
     * </p>
     * 
     * @param location
     *        Information about the location of the custom plugin.
     */

    public void setLocation(CustomPluginLocationDescription location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the custom plugin.
     * </p>
     * 
     * @return Information about the location of the custom plugin.
     */

    public CustomPluginLocationDescription getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of the custom plugin.
     * </p>
     * 
     * @param location
     *        Information about the location of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginRevisionSummary withLocation(CustomPluginLocationDescription location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     * 
     * @param revision
     *        The revision of the custom plugin.
     */

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     * 
     * @return The revision of the custom plugin.
     */

    public Long getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the custom plugin.
     * </p>
     * 
     * @param revision
     *        The revision of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginRevisionSummary withRevision(Long revision) {
        setRevision(revision);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFileDescription() != null)
            sb.append("FileDescription: ").append(getFileDescription()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomPluginRevisionSummary == false)
            return false;
        CustomPluginRevisionSummary other = (CustomPluginRevisionSummary) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFileDescription() == null ^ this.getFileDescription() == null)
            return false;
        if (other.getFileDescription() != null && other.getFileDescription().equals(this.getFileDescription()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFileDescription() == null) ? 0 : getFileDescription().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public CustomPluginRevisionSummary clone() {
        try {
            return (CustomPluginRevisionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.CustomPluginRevisionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
