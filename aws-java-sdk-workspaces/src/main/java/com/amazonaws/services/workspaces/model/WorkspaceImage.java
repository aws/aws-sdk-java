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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a WorkSpace image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkspaceImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     */
    private OperatingSystem operatingSystem;
    /**
     * <p>
     * The status of the image.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is enabled, this
     * value is set to DEDICATED.
     * </p>
     */
    private String requiredTenancy;
    /**
     * <p>
     * The error code that is returned for the image.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The text of the error message that is returned for the image.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @return The identifier of the image.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceImage withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceImage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the image.
     * </p>
     * 
     * @param description
     *        The description of the image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image.
     * </p>
     * 
     * @return The description of the image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the image.
     * </p>
     * 
     * @param description
     *        The description of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceImage withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the image is running.
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     * 
     * @return The operating system that the image is running.
     */

    public OperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system that the image is running.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the image is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceImage withOperatingSystem(OperatingSystem operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @param state
     *        The status of the image.
     * @see WorkspaceImageState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @return The status of the image.
     * @see WorkspaceImageState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @param state
     *        The status of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageState
     */

    public WorkspaceImage withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * 
     * @param state
     *        The status of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageState
     */

    public WorkspaceImage withState(WorkspaceImageState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is enabled, this
     * value is set to DEDICATED.
     * </p>
     * 
     * @param requiredTenancy
     *        Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is
     *        enabled, this value is set to DEDICATED.
     * @see WorkspaceImageRequiredTenancy
     */

    public void setRequiredTenancy(String requiredTenancy) {
        this.requiredTenancy = requiredTenancy;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is enabled, this
     * value is set to DEDICATED.
     * </p>
     * 
     * @return Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is
     *         enabled, this value is set to DEDICATED.
     * @see WorkspaceImageRequiredTenancy
     */

    public String getRequiredTenancy() {
        return this.requiredTenancy;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is enabled, this
     * value is set to DEDICATED.
     * </p>
     * 
     * @param requiredTenancy
     *        Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is
     *        enabled, this value is set to DEDICATED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageRequiredTenancy
     */

    public WorkspaceImage withRequiredTenancy(String requiredTenancy) {
        setRequiredTenancy(requiredTenancy);
        return this;
    }

    /**
     * <p>
     * Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is enabled, this
     * value is set to DEDICATED.
     * </p>
     * 
     * @param requiredTenancy
     *        Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is
     *        enabled, this value is set to DEDICATED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceImageRequiredTenancy
     */

    public WorkspaceImage withRequiredTenancy(WorkspaceImageRequiredTenancy requiredTenancy) {
        this.requiredTenancy = requiredTenancy.toString();
        return this;
    }

    /**
     * <p>
     * The error code that is returned for the image.
     * </p>
     * 
     * @param errorCode
     *        The error code that is returned for the image.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code that is returned for the image.
     * </p>
     * 
     * @return The error code that is returned for the image.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code that is returned for the image.
     * </p>
     * 
     * @param errorCode
     *        The error code that is returned for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceImage withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The text of the error message that is returned for the image.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message that is returned for the image.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The text of the error message that is returned for the image.
     * </p>
     * 
     * @return The text of the error message that is returned for the image.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The text of the error message that is returned for the image.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message that is returned for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceImage withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRequiredTenancy() != null)
            sb.append("RequiredTenancy: ").append(getRequiredTenancy()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceImage == false)
            return false;
        WorkspaceImage other = (WorkspaceImage) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRequiredTenancy() == null ^ this.getRequiredTenancy() == null)
            return false;
        if (other.getRequiredTenancy() != null && other.getRequiredTenancy().equals(this.getRequiredTenancy()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRequiredTenancy() == null) ? 0 : getRequiredTenancy().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceImage clone() {
        try {
            return (WorkspaceImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkspaceImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
