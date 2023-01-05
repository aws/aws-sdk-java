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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The icon S3 location of the application.
     * </p>
     */
    private S3Location iconS3Location;
    /**
     * <p>
     * The launch path of the application.
     * </p>
     */
    private String launchPath;
    /**
     * <p>
     * The working directory of the application.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     */
    private String launchParameters;
    /**
     * <p>
     * The ARN of the app block.
     * </p>
     */
    private String appBlockArn;
    /**
     * <p>
     * The attributes to delete for an application.
     * </p>
     */
    private java.util.List<String> attributesToDelete;

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     * 
     * @param name
     *        The name of the application. This name is visible to users when display name is not specified.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     * 
     * @return The name of the application. This name is visible to users when display name is not specified.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application. This name is visible to users when display name is not specified.
     * </p>
     * 
     * @param name
     *        The name of the application. This name is visible to users when display name is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     * 
     * @param displayName
     *        The display name of the application. This name is visible to users in the application catalog.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     * 
     * @return The display name of the application. This name is visible to users in the application catalog.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the application. This name is visible to users in the application catalog.
     * </p>
     * 
     * @param displayName
     *        The display name of the application. This name is visible to users in the application catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The icon S3 location of the application.
     * </p>
     * 
     * @param iconS3Location
     *        The icon S3 location of the application.
     */

    public void setIconS3Location(S3Location iconS3Location) {
        this.iconS3Location = iconS3Location;
    }

    /**
     * <p>
     * The icon S3 location of the application.
     * </p>
     * 
     * @return The icon S3 location of the application.
     */

    public S3Location getIconS3Location() {
        return this.iconS3Location;
    }

    /**
     * <p>
     * The icon S3 location of the application.
     * </p>
     * 
     * @param iconS3Location
     *        The icon S3 location of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withIconS3Location(S3Location iconS3Location) {
        setIconS3Location(iconS3Location);
        return this;
    }

    /**
     * <p>
     * The launch path of the application.
     * </p>
     * 
     * @param launchPath
     *        The launch path of the application.
     */

    public void setLaunchPath(String launchPath) {
        this.launchPath = launchPath;
    }

    /**
     * <p>
     * The launch path of the application.
     * </p>
     * 
     * @return The launch path of the application.
     */

    public String getLaunchPath() {
        return this.launchPath;
    }

    /**
     * <p>
     * The launch path of the application.
     * </p>
     * 
     * @param launchPath
     *        The launch path of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withLaunchPath(String launchPath) {
        setLaunchPath(launchPath);
        return this;
    }

    /**
     * <p>
     * The working directory of the application.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory of the application.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The working directory of the application.
     * </p>
     * 
     * @return The working directory of the application.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The working directory of the application.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     * 
     * @param launchParameters
     *        The launch parameters of the application.
     */

    public void setLaunchParameters(String launchParameters) {
        this.launchParameters = launchParameters;
    }

    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     * 
     * @return The launch parameters of the application.
     */

    public String getLaunchParameters() {
        return this.launchParameters;
    }

    /**
     * <p>
     * The launch parameters of the application.
     * </p>
     * 
     * @param launchParameters
     *        The launch parameters of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withLaunchParameters(String launchParameters) {
        setLaunchParameters(launchParameters);
        return this;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @param appBlockArn
     *        The ARN of the app block.
     */

    public void setAppBlockArn(String appBlockArn) {
        this.appBlockArn = appBlockArn;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @return The ARN of the app block.
     */

    public String getAppBlockArn() {
        return this.appBlockArn;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @param appBlockArn
     *        The ARN of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withAppBlockArn(String appBlockArn) {
        setAppBlockArn(appBlockArn);
        return this;
    }

    /**
     * <p>
     * The attributes to delete for an application.
     * </p>
     * 
     * @return The attributes to delete for an application.
     * @see ApplicationAttribute
     */

    public java.util.List<String> getAttributesToDelete() {
        return attributesToDelete;
    }

    /**
     * <p>
     * The attributes to delete for an application.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete for an application.
     * @see ApplicationAttribute
     */

    public void setAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        if (attributesToDelete == null) {
            this.attributesToDelete = null;
            return;
        }

        this.attributesToDelete = new java.util.ArrayList<String>(attributesToDelete);
    }

    /**
     * <p>
     * The attributes to delete for an application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToDelete(java.util.Collection)} or {@link #withAttributesToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationAttribute
     */

    public UpdateApplicationRequest withAttributesToDelete(String... attributesToDelete) {
        if (this.attributesToDelete == null) {
            setAttributesToDelete(new java.util.ArrayList<String>(attributesToDelete.length));
        }
        for (String ele : attributesToDelete) {
            this.attributesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to delete for an application.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationAttribute
     */

    public UpdateApplicationRequest withAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        setAttributesToDelete(attributesToDelete);
        return this;
    }

    /**
     * <p>
     * The attributes to delete for an application.
     * </p>
     * 
     * @param attributesToDelete
     *        The attributes to delete for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationAttribute
     */

    public UpdateApplicationRequest withAttributesToDelete(ApplicationAttribute... attributesToDelete) {
        java.util.ArrayList<String> attributesToDeleteCopy = new java.util.ArrayList<String>(attributesToDelete.length);
        for (ApplicationAttribute value : attributesToDelete) {
            attributesToDeleteCopy.add(value.toString());
        }
        if (getAttributesToDelete() == null) {
            setAttributesToDelete(attributesToDeleteCopy);
        } else {
            getAttributesToDelete().addAll(attributesToDeleteCopy);
        }
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIconS3Location() != null)
            sb.append("IconS3Location: ").append(getIconS3Location()).append(",");
        if (getLaunchPath() != null)
            sb.append("LaunchPath: ").append(getLaunchPath()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getLaunchParameters() != null)
            sb.append("LaunchParameters: ").append(getLaunchParameters()).append(",");
        if (getAppBlockArn() != null)
            sb.append("AppBlockArn: ").append(getAppBlockArn()).append(",");
        if (getAttributesToDelete() != null)
            sb.append("AttributesToDelete: ").append(getAttributesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIconS3Location() == null ^ this.getIconS3Location() == null)
            return false;
        if (other.getIconS3Location() != null && other.getIconS3Location().equals(this.getIconS3Location()) == false)
            return false;
        if (other.getLaunchPath() == null ^ this.getLaunchPath() == null)
            return false;
        if (other.getLaunchPath() != null && other.getLaunchPath().equals(this.getLaunchPath()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getLaunchParameters() == null ^ this.getLaunchParameters() == null)
            return false;
        if (other.getLaunchParameters() != null && other.getLaunchParameters().equals(this.getLaunchParameters()) == false)
            return false;
        if (other.getAppBlockArn() == null ^ this.getAppBlockArn() == null)
            return false;
        if (other.getAppBlockArn() != null && other.getAppBlockArn().equals(this.getAppBlockArn()) == false)
            return false;
        if (other.getAttributesToDelete() == null ^ this.getAttributesToDelete() == null)
            return false;
        if (other.getAttributesToDelete() != null && other.getAttributesToDelete().equals(this.getAttributesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIconS3Location() == null) ? 0 : getIconS3Location().hashCode());
        hashCode = prime * hashCode + ((getLaunchPath() == null) ? 0 : getLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getLaunchParameters() == null) ? 0 : getLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getAppBlockArn() == null) ? 0 : getAppBlockArn().hashCode());
        hashCode = prime * hashCode + ((getAttributesToDelete() == null) ? 0 : getAttributesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
