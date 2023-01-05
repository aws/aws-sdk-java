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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the AWS IoT Greengrass component created in a model packaging job. For more
 * information, see <a>StartModelPackagingJob</a>.
 * </p>
 * <note>
 * <p>
 * You can't specify a component with the same <code>ComponentName</code> and <code>Componentversion</code> as an
 * existing component with the same component name and component version.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/GreengrassConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GreengrassConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing Units (GPU)
     * and CPU accelerators are supported. If you specify <code>TargetDevice</code>, don't specify
     * <code>CompilerOptions</code>.
     * </p>
     * <p>
     * For more information, see <i>Compiler options</i> in the Amazon Lookout for Vision Developer Guide.
     * </p>
     */
    private String compilerOptions;
    /**
     * <p>
     * The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you specify
     * <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * </p>
     */
    private String targetDevice;
    /**
     * <p>
     * The target platform for the model. If you specify <code>TargetPlatform</code>, you can't specify
     * <code>TargetDevice</code>.
     * </p>
     */
    private TargetPlatform targetPlatform;
    /**
     * <p>
     * An S3 location in which Lookout for Vision stores the component artifacts.
     * </p>
     */
    private S3Location s3OutputLocation;
    /**
     * <p>
     * A name for the AWS IoT Greengrass component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of
     * <code> <i>Model Version</i>.0.0</code> is used.
     * </p>
     */
    private String componentVersion;
    /**
     * <p>
     * A description for the AWS IoT Greengrass component.
     * </p>
     */
    private String componentDescription;
    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing Units (GPU)
     * and CPU accelerators are supported. If you specify <code>TargetDevice</code>, don't specify
     * <code>CompilerOptions</code>.
     * </p>
     * <p>
     * For more information, see <i>Compiler options</i> in the Amazon Lookout for Vision Developer Guide.
     * </p>
     * 
     * @param compilerOptions
     *        Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing Units
     *        (GPU) and CPU accelerators are supported. If you specify <code>TargetDevice</code>, don't specify
     *        <code>CompilerOptions</code>.</p>
     *        <p>
     *        For more information, see <i>Compiler options</i> in the Amazon Lookout for Vision Developer Guide.
     */

    public void setCompilerOptions(String compilerOptions) {
        this.compilerOptions = compilerOptions;
    }

    /**
     * <p>
     * Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing Units (GPU)
     * and CPU accelerators are supported. If you specify <code>TargetDevice</code>, don't specify
     * <code>CompilerOptions</code>.
     * </p>
     * <p>
     * For more information, see <i>Compiler options</i> in the Amazon Lookout for Vision Developer Guide.
     * </p>
     * 
     * @return Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing
     *         Units (GPU) and CPU accelerators are supported. If you specify <code>TargetDevice</code>, don't specify
     *         <code>CompilerOptions</code>.</p>
     *         <p>
     *         For more information, see <i>Compiler options</i> in the Amazon Lookout for Vision Developer Guide.
     */

    public String getCompilerOptions() {
        return this.compilerOptions;
    }

    /**
     * <p>
     * Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing Units (GPU)
     * and CPU accelerators are supported. If you specify <code>TargetDevice</code>, don't specify
     * <code>CompilerOptions</code>.
     * </p>
     * <p>
     * For more information, see <i>Compiler options</i> in the Amazon Lookout for Vision Developer Guide.
     * </p>
     * 
     * @param compilerOptions
     *        Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing Units
     *        (GPU) and CPU accelerators are supported. If you specify <code>TargetDevice</code>, don't specify
     *        <code>CompilerOptions</code>.</p>
     *        <p>
     *        For more information, see <i>Compiler options</i> in the Amazon Lookout for Vision Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withCompilerOptions(String compilerOptions) {
        setCompilerOptions(compilerOptions);
        return this;
    }

    /**
     * <p>
     * The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you specify
     * <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * </p>
     * 
     * @param targetDevice
     *        The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you
     *        specify <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * @see TargetDevice
     */

    public void setTargetDevice(String targetDevice) {
        this.targetDevice = targetDevice;
    }

    /**
     * <p>
     * The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you specify
     * <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * </p>
     * 
     * @return The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you
     *         specify <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * @see TargetDevice
     */

    public String getTargetDevice() {
        return this.targetDevice;
    }

    /**
     * <p>
     * The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you specify
     * <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * </p>
     * 
     * @param targetDevice
     *        The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you
     *        specify <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public GreengrassConfiguration withTargetDevice(String targetDevice) {
        setTargetDevice(targetDevice);
        return this;
    }

    /**
     * <p>
     * The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you specify
     * <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * </p>
     * 
     * @param targetDevice
     *        The target device for the model. Currently the only supported value is <code>jetson_xavier</code>. If you
     *        specify <code>TargetDevice</code>, you can't specify <code>TargetPlatform</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public GreengrassConfiguration withTargetDevice(TargetDevice targetDevice) {
        this.targetDevice = targetDevice.toString();
        return this;
    }

    /**
     * <p>
     * The target platform for the model. If you specify <code>TargetPlatform</code>, you can't specify
     * <code>TargetDevice</code>.
     * </p>
     * 
     * @param targetPlatform
     *        The target platform for the model. If you specify <code>TargetPlatform</code>, you can't specify
     *        <code>TargetDevice</code>.
     */

    public void setTargetPlatform(TargetPlatform targetPlatform) {
        this.targetPlatform = targetPlatform;
    }

    /**
     * <p>
     * The target platform for the model. If you specify <code>TargetPlatform</code>, you can't specify
     * <code>TargetDevice</code>.
     * </p>
     * 
     * @return The target platform for the model. If you specify <code>TargetPlatform</code>, you can't specify
     *         <code>TargetDevice</code>.
     */

    public TargetPlatform getTargetPlatform() {
        return this.targetPlatform;
    }

    /**
     * <p>
     * The target platform for the model. If you specify <code>TargetPlatform</code>, you can't specify
     * <code>TargetDevice</code>.
     * </p>
     * 
     * @param targetPlatform
     *        The target platform for the model. If you specify <code>TargetPlatform</code>, you can't specify
     *        <code>TargetDevice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withTargetPlatform(TargetPlatform targetPlatform) {
        setTargetPlatform(targetPlatform);
        return this;
    }

    /**
     * <p>
     * An S3 location in which Lookout for Vision stores the component artifacts.
     * </p>
     * 
     * @param s3OutputLocation
     *        An S3 location in which Lookout for Vision stores the component artifacts.
     */

    public void setS3OutputLocation(S3Location s3OutputLocation) {
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * <p>
     * An S3 location in which Lookout for Vision stores the component artifacts.
     * </p>
     * 
     * @return An S3 location in which Lookout for Vision stores the component artifacts.
     */

    public S3Location getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    /**
     * <p>
     * An S3 location in which Lookout for Vision stores the component artifacts.
     * </p>
     * 
     * @param s3OutputLocation
     *        An S3 location in which Lookout for Vision stores the component artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withS3OutputLocation(S3Location s3OutputLocation) {
        setS3OutputLocation(s3OutputLocation);
        return this;
    }

    /**
     * <p>
     * A name for the AWS IoT Greengrass component.
     * </p>
     * 
     * @param componentName
     *        A name for the AWS IoT Greengrass component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * A name for the AWS IoT Greengrass component.
     * </p>
     * 
     * @return A name for the AWS IoT Greengrass component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * A name for the AWS IoT Greengrass component.
     * </p>
     * 
     * @param componentName
     *        A name for the AWS IoT Greengrass component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of
     * <code> <i>Model Version</i>.0.0</code> is used.
     * </p>
     * 
     * @param componentVersion
     *        A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of
     *        <code> <i>Model Version</i>.0.0</code> is used.
     */

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    /**
     * <p>
     * A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of
     * <code> <i>Model Version</i>.0.0</code> is used.
     * </p>
     * 
     * @return A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of
     *         <code> <i>Model Version</i>.0.0</code> is used.
     */

    public String getComponentVersion() {
        return this.componentVersion;
    }

    /**
     * <p>
     * A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of
     * <code> <i>Model Version</i>.0.0</code> is used.
     * </p>
     * 
     * @param componentVersion
     *        A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of
     *        <code> <i>Model Version</i>.0.0</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
        return this;
    }

    /**
     * <p>
     * A description for the AWS IoT Greengrass component.
     * </p>
     * 
     * @param componentDescription
     *        A description for the AWS IoT Greengrass component.
     */

    public void setComponentDescription(String componentDescription) {
        this.componentDescription = componentDescription;
    }

    /**
     * <p>
     * A description for the AWS IoT Greengrass component.
     * </p>
     * 
     * @return A description for the AWS IoT Greengrass component.
     */

    public String getComponentDescription() {
        return this.componentDescription;
    }

    /**
     * <p>
     * A description for the AWS IoT Greengrass component.
     * </p>
     * 
     * @param componentDescription
     *        A description for the AWS IoT Greengrass component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withComponentDescription(String componentDescription) {
        setComponentDescription(componentDescription);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassConfiguration withTags(java.util.Collection<Tag> tags) {
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
        if (getCompilerOptions() != null)
            sb.append("CompilerOptions: ").append(getCompilerOptions()).append(",");
        if (getTargetDevice() != null)
            sb.append("TargetDevice: ").append(getTargetDevice()).append(",");
        if (getTargetPlatform() != null)
            sb.append("TargetPlatform: ").append(getTargetPlatform()).append(",");
        if (getS3OutputLocation() != null)
            sb.append("S3OutputLocation: ").append(getS3OutputLocation()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getComponentDescription() != null)
            sb.append("ComponentDescription: ").append(getComponentDescription()).append(",");
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

        if (obj instanceof GreengrassConfiguration == false)
            return false;
        GreengrassConfiguration other = (GreengrassConfiguration) obj;
        if (other.getCompilerOptions() == null ^ this.getCompilerOptions() == null)
            return false;
        if (other.getCompilerOptions() != null && other.getCompilerOptions().equals(this.getCompilerOptions()) == false)
            return false;
        if (other.getTargetDevice() == null ^ this.getTargetDevice() == null)
            return false;
        if (other.getTargetDevice() != null && other.getTargetDevice().equals(this.getTargetDevice()) == false)
            return false;
        if (other.getTargetPlatform() == null ^ this.getTargetPlatform() == null)
            return false;
        if (other.getTargetPlatform() != null && other.getTargetPlatform().equals(this.getTargetPlatform()) == false)
            return false;
        if (other.getS3OutputLocation() == null ^ this.getS3OutputLocation() == null)
            return false;
        if (other.getS3OutputLocation() != null && other.getS3OutputLocation().equals(this.getS3OutputLocation()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        if (other.getComponentDescription() == null ^ this.getComponentDescription() == null)
            return false;
        if (other.getComponentDescription() != null && other.getComponentDescription().equals(this.getComponentDescription()) == false)
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

        hashCode = prime * hashCode + ((getCompilerOptions() == null) ? 0 : getCompilerOptions().hashCode());
        hashCode = prime * hashCode + ((getTargetDevice() == null) ? 0 : getTargetDevice().hashCode());
        hashCode = prime * hashCode + ((getTargetPlatform() == null) ? 0 : getTargetPlatform().hashCode());
        hashCode = prime * hashCode + ((getS3OutputLocation() == null) ? 0 : getS3OutputLocation().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        hashCode = prime * hashCode + ((getComponentDescription() == null) ? 0 : getComponentDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GreengrassConfiguration clone() {
        try {
            return (GreengrassConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.GreengrassConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
