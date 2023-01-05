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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a scene.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/SceneSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SceneSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the scene.
     * </p>
     */
    private String sceneId;
    /**
     * <p>
     * The relative path that specifies the location of the content definition file.
     * </p>
     */
    private String contentLocation;
    /**
     * <p>
     * The ARN of the scene.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The scene description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the scene.
     * </p>
     * 
     * @param sceneId
     *        The ID of the scene.
     */

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    /**
     * <p>
     * The ID of the scene.
     * </p>
     * 
     * @return The ID of the scene.
     */

    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * <p>
     * The ID of the scene.
     * </p>
     * 
     * @param sceneId
     *        The ID of the scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SceneSummary withSceneId(String sceneId) {
        setSceneId(sceneId);
        return this;
    }

    /**
     * <p>
     * The relative path that specifies the location of the content definition file.
     * </p>
     * 
     * @param contentLocation
     *        The relative path that specifies the location of the content definition file.
     */

    public void setContentLocation(String contentLocation) {
        this.contentLocation = contentLocation;
    }

    /**
     * <p>
     * The relative path that specifies the location of the content definition file.
     * </p>
     * 
     * @return The relative path that specifies the location of the content definition file.
     */

    public String getContentLocation() {
        return this.contentLocation;
    }

    /**
     * <p>
     * The relative path that specifies the location of the content definition file.
     * </p>
     * 
     * @param contentLocation
     *        The relative path that specifies the location of the content definition file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SceneSummary withContentLocation(String contentLocation) {
        setContentLocation(contentLocation);
        return this;
    }

    /**
     * <p>
     * The ARN of the scene.
     * </p>
     * 
     * @param arn
     *        The ARN of the scene.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the scene.
     * </p>
     * 
     * @return The ARN of the scene.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the scene.
     * </p>
     * 
     * @param arn
     *        The ARN of the scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SceneSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the scene was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     * 
     * @return The date and time when the scene was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the scene was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SceneSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the scene was last updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @return The date and time when the scene was last updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the scene was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SceneSummary withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p>
     * The scene description.
     * </p>
     * 
     * @param description
     *        The scene description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The scene description.
     * </p>
     * 
     * @return The scene description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The scene description.
     * </p>
     * 
     * @param description
     *        The scene description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SceneSummary withDescription(String description) {
        setDescription(description);
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
        if (getSceneId() != null)
            sb.append("SceneId: ").append(getSceneId()).append(",");
        if (getContentLocation() != null)
            sb.append("ContentLocation: ").append(getContentLocation()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SceneSummary == false)
            return false;
        SceneSummary other = (SceneSummary) obj;
        if (other.getSceneId() == null ^ this.getSceneId() == null)
            return false;
        if (other.getSceneId() != null && other.getSceneId().equals(this.getSceneId()) == false)
            return false;
        if (other.getContentLocation() == null ^ this.getContentLocation() == null)
            return false;
        if (other.getContentLocation() != null && other.getContentLocation().equals(this.getContentLocation()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSceneId() == null) ? 0 : getSceneId().hashCode());
        hashCode = prime * hashCode + ((getContentLocation() == null) ? 0 : getContentLocation().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public SceneSummary clone() {
        try {
            return (SceneSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.SceneSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
