/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgeOutputConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     */
    private String s3OutputLocation;
    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker
     * uses the default KMS key for Amazon S3 for your role's account.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     * Greengrass Version 2 components.
     * </p>
     */
    private String presetDeploymentType;
    /**
     * <p>
     * The configuration used to create deployment artifacts. Specify configuration options with a JSON string. The
     * available configuration options for each type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComponentName</code> (optional) - Name of the GreenGrass V2 component. If not specified, the default name
     * generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager packaging job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentDescription</code> (optional) - Description of the component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentVersion</code> (optional) - The version of the component.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a<i>
     * major.minor.patch</i> number system. For example, version 1.0.0 represents the first major release for a
     * component. For more information, see the <a href="https://semver.org/">semantic version specification</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>PlatformOS</code> (optional) - The name of the operating system for the platform. Supported platforms
     * include Windows and Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformArchitecture</code> (optional) - The processor architecture for the platform.
     * </p>
     * <p>
     * Supported architectures Windows include: Windows32_x86, Windows64_x64.
     * </p>
     * <p>
     * Supported architectures for Linux include: Linux x86_64, Linux ARMV8.
     * </p>
     * </li>
     * </ul>
     */
    private String presetDeploymentConfig;

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     * 
     * @param s3OutputLocation
     *        The Amazon Simple Storage (S3) bucker URI.
     */

    public void setS3OutputLocation(String s3OutputLocation) {
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     * 
     * @return The Amazon Simple Storage (S3) bucker URI.
     */

    public String getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     * 
     * @param s3OutputLocation
     *        The Amazon Simple Storage (S3) bucker URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeOutputConfig withS3OutputLocation(String s3OutputLocation) {
        setS3OutputLocation(s3OutputLocation);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker
     * uses the default KMS key for Amazon S3 for your role's account.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon
     *        SageMaker uses the default KMS key for Amazon S3 for your role's account.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker
     * uses the default KMS key for Amazon S3 for your role's account.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses
     *         to encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon
     *         SageMaker uses the default KMS key for Amazon S3 for your role's account.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker
     * uses the default KMS key for Amazon S3 for your role's account.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon
     *        SageMaker uses the default KMS key for Amazon S3 for your role's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeOutputConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     * Greengrass Version 2 components.
     * </p>
     * 
     * @param presetDeploymentType
     *        The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     *        Greengrass Version 2 components.
     * @see EdgePresetDeploymentType
     */

    public void setPresetDeploymentType(String presetDeploymentType) {
        this.presetDeploymentType = presetDeploymentType;
    }

    /**
     * <p>
     * The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     * Greengrass Version 2 components.
     * </p>
     * 
     * @return The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     *         Greengrass Version 2 components.
     * @see EdgePresetDeploymentType
     */

    public String getPresetDeploymentType() {
        return this.presetDeploymentType;
    }

    /**
     * <p>
     * The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     * Greengrass Version 2 components.
     * </p>
     * 
     * @param presetDeploymentType
     *        The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     *        Greengrass Version 2 components.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePresetDeploymentType
     */

    public EdgeOutputConfig withPresetDeploymentType(String presetDeploymentType) {
        setPresetDeploymentType(presetDeploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     * Greengrass Version 2 components.
     * </p>
     * 
     * @param presetDeploymentType
     *        The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT
     *        Greengrass Version 2 components.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePresetDeploymentType
     */

    public EdgeOutputConfig withPresetDeploymentType(EdgePresetDeploymentType presetDeploymentType) {
        this.presetDeploymentType = presetDeploymentType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration used to create deployment artifacts. Specify configuration options with a JSON string. The
     * available configuration options for each type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComponentName</code> (optional) - Name of the GreenGrass V2 component. If not specified, the default name
     * generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager packaging job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentDescription</code> (optional) - Description of the component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentVersion</code> (optional) - The version of the component.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a<i>
     * major.minor.patch</i> number system. For example, version 1.0.0 represents the first major release for a
     * component. For more information, see the <a href="https://semver.org/">semantic version specification</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>PlatformOS</code> (optional) - The name of the operating system for the platform. Supported platforms
     * include Windows and Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformArchitecture</code> (optional) - The processor architecture for the platform.
     * </p>
     * <p>
     * Supported architectures Windows include: Windows32_x86, Windows64_x64.
     * </p>
     * <p>
     * Supported architectures for Linux include: Linux x86_64, Linux ARMV8.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetDeploymentConfig
     *        The configuration used to create deployment artifacts. Specify configuration options with a JSON string.
     *        The available configuration options for each type are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ComponentName</code> (optional) - Name of the GreenGrass V2 component. If not specified, the default
     *        name generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager packaging
     *        job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ComponentDescription</code> (optional) - Description of the component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ComponentVersion</code> (optional) - The version of the component.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a<i>
     *        major.minor.patch</i> number system. For example, version 1.0.0 represents the first major release for a
     *        component. For more information, see the <a href="https://semver.org/">semantic version specification</a>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>PlatformOS</code> (optional) - The name of the operating system for the platform. Supported
     *        platforms include Windows and Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PlatformArchitecture</code> (optional) - The processor architecture for the platform.
     *        </p>
     *        <p>
     *        Supported architectures Windows include: Windows32_x86, Windows64_x64.
     *        </p>
     *        <p>
     *        Supported architectures for Linux include: Linux x86_64, Linux ARMV8.
     *        </p>
     *        </li>
     */

    public void setPresetDeploymentConfig(String presetDeploymentConfig) {
        this.presetDeploymentConfig = presetDeploymentConfig;
    }

    /**
     * <p>
     * The configuration used to create deployment artifacts. Specify configuration options with a JSON string. The
     * available configuration options for each type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComponentName</code> (optional) - Name of the GreenGrass V2 component. If not specified, the default name
     * generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager packaging job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentDescription</code> (optional) - Description of the component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentVersion</code> (optional) - The version of the component.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a<i>
     * major.minor.patch</i> number system. For example, version 1.0.0 represents the first major release for a
     * component. For more information, see the <a href="https://semver.org/">semantic version specification</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>PlatformOS</code> (optional) - The name of the operating system for the platform. Supported platforms
     * include Windows and Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformArchitecture</code> (optional) - The processor architecture for the platform.
     * </p>
     * <p>
     * Supported architectures Windows include: Windows32_x86, Windows64_x64.
     * </p>
     * <p>
     * Supported architectures for Linux include: Linux x86_64, Linux ARMV8.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The configuration used to create deployment artifacts. Specify configuration options with a JSON string.
     *         The available configuration options for each type are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ComponentName</code> (optional) - Name of the GreenGrass V2 component. If not specified, the
     *         default name generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager
     *         packaging job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ComponentDescription</code> (optional) - Description of the component.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ComponentVersion</code> (optional) - The version of the component.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a<i>
     *         major.minor.patch</i> number system. For example, version 1.0.0 represents the first major release for a
     *         component. For more information, see the <a href="https://semver.org/">semantic version
     *         specification</a>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>PlatformOS</code> (optional) - The name of the operating system for the platform. Supported
     *         platforms include Windows and Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PlatformArchitecture</code> (optional) - The processor architecture for the platform.
     *         </p>
     *         <p>
     *         Supported architectures Windows include: Windows32_x86, Windows64_x64.
     *         </p>
     *         <p>
     *         Supported architectures for Linux include: Linux x86_64, Linux ARMV8.
     *         </p>
     *         </li>
     */

    public String getPresetDeploymentConfig() {
        return this.presetDeploymentConfig;
    }

    /**
     * <p>
     * The configuration used to create deployment artifacts. Specify configuration options with a JSON string. The
     * available configuration options for each type are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComponentName</code> (optional) - Name of the GreenGrass V2 component. If not specified, the default name
     * generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager packaging job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentDescription</code> (optional) - Description of the component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComponentVersion</code> (optional) - The version of the component.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a<i>
     * major.minor.patch</i> number system. For example, version 1.0.0 represents the first major release for a
     * component. For more information, see the <a href="https://semver.org/">semantic version specification</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>PlatformOS</code> (optional) - The name of the operating system for the platform. Supported platforms
     * include Windows and Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformArchitecture</code> (optional) - The processor architecture for the platform.
     * </p>
     * <p>
     * Supported architectures Windows include: Windows32_x86, Windows64_x64.
     * </p>
     * <p>
     * Supported architectures for Linux include: Linux x86_64, Linux ARMV8.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetDeploymentConfig
     *        The configuration used to create deployment artifacts. Specify configuration options with a JSON string.
     *        The available configuration options for each type are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ComponentName</code> (optional) - Name of the GreenGrass V2 component. If not specified, the default
     *        name generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager packaging
     *        job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ComponentDescription</code> (optional) - Description of the component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ComponentVersion</code> (optional) - The version of the component.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a<i>
     *        major.minor.patch</i> number system. For example, version 1.0.0 represents the first major release for a
     *        component. For more information, see the <a href="https://semver.org/">semantic version specification</a>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>PlatformOS</code> (optional) - The name of the operating system for the platform. Supported
     *        platforms include Windows and Linux.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PlatformArchitecture</code> (optional) - The processor architecture for the platform.
     *        </p>
     *        <p>
     *        Supported architectures Windows include: Windows32_x86, Windows64_x64.
     *        </p>
     *        <p>
     *        Supported architectures for Linux include: Linux x86_64, Linux ARMV8.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeOutputConfig withPresetDeploymentConfig(String presetDeploymentConfig) {
        setPresetDeploymentConfig(presetDeploymentConfig);
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
        if (getS3OutputLocation() != null)
            sb.append("S3OutputLocation: ").append(getS3OutputLocation()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPresetDeploymentType() != null)
            sb.append("PresetDeploymentType: ").append(getPresetDeploymentType()).append(",");
        if (getPresetDeploymentConfig() != null)
            sb.append("PresetDeploymentConfig: ").append(getPresetDeploymentConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeOutputConfig == false)
            return false;
        EdgeOutputConfig other = (EdgeOutputConfig) obj;
        if (other.getS3OutputLocation() == null ^ this.getS3OutputLocation() == null)
            return false;
        if (other.getS3OutputLocation() != null && other.getS3OutputLocation().equals(this.getS3OutputLocation()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPresetDeploymentType() == null ^ this.getPresetDeploymentType() == null)
            return false;
        if (other.getPresetDeploymentType() != null && other.getPresetDeploymentType().equals(this.getPresetDeploymentType()) == false)
            return false;
        if (other.getPresetDeploymentConfig() == null ^ this.getPresetDeploymentConfig() == null)
            return false;
        if (other.getPresetDeploymentConfig() != null && other.getPresetDeploymentConfig().equals(this.getPresetDeploymentConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputLocation() == null) ? 0 : getS3OutputLocation().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPresetDeploymentType() == null) ? 0 : getPresetDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getPresetDeploymentConfig() == null) ? 0 : getPresetDeploymentConfig().hashCode());
        return hashCode;
    }

    @Override
    public EdgeOutputConfig clone() {
        try {
            return (EdgeOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgeOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
