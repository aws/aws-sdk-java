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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an app block.
 * </p>
 * <p>
 * App blocks are an Amazon AppStream 2.0 resource that stores the details about the virtual hard disk in an S3 bucket.
 * It also stores the setup script with details about how to mount the virtual hard disk. The virtual hard disk includes
 * the application binaries and other files necessary to launch your applications. Multiple applications can be assigned
 * to a single app block.
 * </p>
 * <p>
 * This is only supported for Elastic fleets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AppBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the app block.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the app block.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description of the app block.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the app block.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     */
    private S3Location sourceS3Location;
    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>CUSTOM</code>.
     * </p>
     */
    private ScriptDetails setupScriptDetails;
    /**
     * <p>
     * The created time of the app block.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The post setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>APPSTREAM2</code>.
     * </p>
     */
    private ScriptDetails postSetupScriptDetails;
    /**
     * <p>
     * The packaging type of the app block.
     * </p>
     */
    private String packagingType;
    /**
     * <p>
     * The state of the app block.
     * </p>
     * <p>
     * An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application package
     * (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for an app block,
     * it becomes <code>ACTIVE</code>.
     * </p>
     * <p>
     * Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The errors of the app block.
     * </p>
     */
    private java.util.List<ErrorDetails> appBlockErrors;

    /**
     * <p>
     * The name of the app block.
     * </p>
     * 
     * @param name
     *        The name of the app block.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app block.
     * </p>
     * 
     * @return The name of the app block.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app block.
     * </p>
     * 
     * @param name
     *        The name of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @param arn
     *        The ARN of the app block.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @return The ARN of the app block.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @param arn
     *        The ARN of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description of the app block.
     * </p>
     * 
     * @param description
     *        The description of the app block.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the app block.
     * </p>
     * 
     * @return The description of the app block.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the app block.
     * </p>
     * 
     * @param description
     *        The description of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the app block.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the app block.
     * </p>
     * 
     * @return The display name of the app block.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the app block.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     * 
     * @param sourceS3Location
     *        The source S3 location of the app block.
     */

    public void setSourceS3Location(S3Location sourceS3Location) {
        this.sourceS3Location = sourceS3Location;
    }

    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     * 
     * @return The source S3 location of the app block.
     */

    public S3Location getSourceS3Location() {
        return this.sourceS3Location;
    }

    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     * 
     * @param sourceS3Location
     *        The source S3 location of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withSourceS3Location(S3Location sourceS3Location) {
        setSourceS3Location(sourceS3Location);
        return this;
    }

    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>CUSTOM</code>.
     * </p>
     * 
     * @param setupScriptDetails
     *        The setup script details of the app block.</p>
     *        <p>
     *        This only applies to app blocks with PackagingType <code>CUSTOM</code>.
     */

    public void setSetupScriptDetails(ScriptDetails setupScriptDetails) {
        this.setupScriptDetails = setupScriptDetails;
    }

    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>CUSTOM</code>.
     * </p>
     * 
     * @return The setup script details of the app block.</p>
     *         <p>
     *         This only applies to app blocks with PackagingType <code>CUSTOM</code>.
     */

    public ScriptDetails getSetupScriptDetails() {
        return this.setupScriptDetails;
    }

    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>CUSTOM</code>.
     * </p>
     * 
     * @param setupScriptDetails
     *        The setup script details of the app block.</p>
     *        <p>
     *        This only applies to app blocks with PackagingType <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withSetupScriptDetails(ScriptDetails setupScriptDetails) {
        setSetupScriptDetails(setupScriptDetails);
        return this;
    }

    /**
     * <p>
     * The created time of the app block.
     * </p>
     * 
     * @param createdTime
     *        The created time of the app block.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The created time of the app block.
     * </p>
     * 
     * @return The created time of the app block.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The created time of the app block.
     * </p>
     * 
     * @param createdTime
     *        The created time of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The post setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>APPSTREAM2</code>.
     * </p>
     * 
     * @param postSetupScriptDetails
     *        The post setup script details of the app block.</p>
     *        <p>
     *        This only applies to app blocks with PackagingType <code>APPSTREAM2</code>.
     */

    public void setPostSetupScriptDetails(ScriptDetails postSetupScriptDetails) {
        this.postSetupScriptDetails = postSetupScriptDetails;
    }

    /**
     * <p>
     * The post setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>APPSTREAM2</code>.
     * </p>
     * 
     * @return The post setup script details of the app block.</p>
     *         <p>
     *         This only applies to app blocks with PackagingType <code>APPSTREAM2</code>.
     */

    public ScriptDetails getPostSetupScriptDetails() {
        return this.postSetupScriptDetails;
    }

    /**
     * <p>
     * The post setup script details of the app block.
     * </p>
     * <p>
     * This only applies to app blocks with PackagingType <code>APPSTREAM2</code>.
     * </p>
     * 
     * @param postSetupScriptDetails
     *        The post setup script details of the app block.</p>
     *        <p>
     *        This only applies to app blocks with PackagingType <code>APPSTREAM2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withPostSetupScriptDetails(ScriptDetails postSetupScriptDetails) {
        setPostSetupScriptDetails(postSetupScriptDetails);
        return this;
    }

    /**
     * <p>
     * The packaging type of the app block.
     * </p>
     * 
     * @param packagingType
     *        The packaging type of the app block.
     * @see PackagingType
     */

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    /**
     * <p>
     * The packaging type of the app block.
     * </p>
     * 
     * @return The packaging type of the app block.
     * @see PackagingType
     */

    public String getPackagingType() {
        return this.packagingType;
    }

    /**
     * <p>
     * The packaging type of the app block.
     * </p>
     * 
     * @param packagingType
     *        The packaging type of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackagingType
     */

    public AppBlock withPackagingType(String packagingType) {
        setPackagingType(packagingType);
        return this;
    }

    /**
     * <p>
     * The packaging type of the app block.
     * </p>
     * 
     * @param packagingType
     *        The packaging type of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackagingType
     */

    public AppBlock withPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the app block.
     * </p>
     * <p>
     * An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application package
     * (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for an app block,
     * it becomes <code>ACTIVE</code>.
     * </p>
     * <p>
     * Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * </p>
     * 
     * @param state
     *        The state of the app block.</p>
     *        <p>
     *        An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application
     *        package (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for
     *        an app block, it becomes <code>ACTIVE</code>.
     *        </p>
     *        <p>
     *        Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * @see AppBlockState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the app block.
     * </p>
     * <p>
     * An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application package
     * (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for an app block,
     * it becomes <code>ACTIVE</code>.
     * </p>
     * <p>
     * Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * </p>
     * 
     * @return The state of the app block.</p>
     *         <p>
     *         An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application
     *         package (VHD) is assigned to it. After an application package (VHD) is created by an app block builder
     *         for an app block, it becomes <code>ACTIVE</code>.
     *         </p>
     *         <p>
     *         Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * @see AppBlockState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the app block.
     * </p>
     * <p>
     * An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application package
     * (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for an app block,
     * it becomes <code>ACTIVE</code>.
     * </p>
     * <p>
     * Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * </p>
     * 
     * @param state
     *        The state of the app block.</p>
     *        <p>
     *        An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application
     *        package (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for
     *        an app block, it becomes <code>ACTIVE</code>.
     *        </p>
     *        <p>
     *        Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockState
     */

    public AppBlock withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the app block.
     * </p>
     * <p>
     * An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application package
     * (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for an app block,
     * it becomes <code>ACTIVE</code>.
     * </p>
     * <p>
     * Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * </p>
     * 
     * @param state
     *        The state of the app block.</p>
     *        <p>
     *        An app block with AppStream 2.0 packaging will be in the <code>INACTIVE</code> state if no application
     *        package (VHD) is assigned to it. After an application package (VHD) is created by an app block builder for
     *        an app block, it becomes <code>ACTIVE</code>.
     *        </p>
     *        <p>
     *        Custom app blocks are always in the <code>ACTIVE</code> state and no action is required to use them.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockState
     */

    public AppBlock withState(AppBlockState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The errors of the app block.
     * </p>
     * 
     * @return The errors of the app block.
     */

    public java.util.List<ErrorDetails> getAppBlockErrors() {
        return appBlockErrors;
    }

    /**
     * <p>
     * The errors of the app block.
     * </p>
     * 
     * @param appBlockErrors
     *        The errors of the app block.
     */

    public void setAppBlockErrors(java.util.Collection<ErrorDetails> appBlockErrors) {
        if (appBlockErrors == null) {
            this.appBlockErrors = null;
            return;
        }

        this.appBlockErrors = new java.util.ArrayList<ErrorDetails>(appBlockErrors);
    }

    /**
     * <p>
     * The errors of the app block.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppBlockErrors(java.util.Collection)} or {@link #withAppBlockErrors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param appBlockErrors
     *        The errors of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withAppBlockErrors(ErrorDetails... appBlockErrors) {
        if (this.appBlockErrors == null) {
            setAppBlockErrors(new java.util.ArrayList<ErrorDetails>(appBlockErrors.length));
        }
        for (ErrorDetails ele : appBlockErrors) {
            this.appBlockErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors of the app block.
     * </p>
     * 
     * @param appBlockErrors
     *        The errors of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlock withAppBlockErrors(java.util.Collection<ErrorDetails> appBlockErrors) {
        setAppBlockErrors(appBlockErrors);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getSourceS3Location() != null)
            sb.append("SourceS3Location: ").append(getSourceS3Location()).append(",");
        if (getSetupScriptDetails() != null)
            sb.append("SetupScriptDetails: ").append(getSetupScriptDetails()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getPostSetupScriptDetails() != null)
            sb.append("PostSetupScriptDetails: ").append(getPostSetupScriptDetails()).append(",");
        if (getPackagingType() != null)
            sb.append("PackagingType: ").append(getPackagingType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAppBlockErrors() != null)
            sb.append("AppBlockErrors: ").append(getAppBlockErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppBlock == false)
            return false;
        AppBlock other = (AppBlock) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getSourceS3Location() == null ^ this.getSourceS3Location() == null)
            return false;
        if (other.getSourceS3Location() != null && other.getSourceS3Location().equals(this.getSourceS3Location()) == false)
            return false;
        if (other.getSetupScriptDetails() == null ^ this.getSetupScriptDetails() == null)
            return false;
        if (other.getSetupScriptDetails() != null && other.getSetupScriptDetails().equals(this.getSetupScriptDetails()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getPostSetupScriptDetails() == null ^ this.getPostSetupScriptDetails() == null)
            return false;
        if (other.getPostSetupScriptDetails() != null && other.getPostSetupScriptDetails().equals(this.getPostSetupScriptDetails()) == false)
            return false;
        if (other.getPackagingType() == null ^ this.getPackagingType() == null)
            return false;
        if (other.getPackagingType() != null && other.getPackagingType().equals(this.getPackagingType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAppBlockErrors() == null ^ this.getAppBlockErrors() == null)
            return false;
        if (other.getAppBlockErrors() != null && other.getAppBlockErrors().equals(this.getAppBlockErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Location() == null) ? 0 : getSourceS3Location().hashCode());
        hashCode = prime * hashCode + ((getSetupScriptDetails() == null) ? 0 : getSetupScriptDetails().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getPostSetupScriptDetails() == null) ? 0 : getPostSetupScriptDetails().hashCode());
        hashCode = prime * hashCode + ((getPackagingType() == null) ? 0 : getPackagingType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAppBlockErrors() == null) ? 0 : getAppBlockErrors().hashCode());
        return hashCode;
    }

    @Override
    public AppBlock clone() {
        try {
            return (AppBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.AppBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
