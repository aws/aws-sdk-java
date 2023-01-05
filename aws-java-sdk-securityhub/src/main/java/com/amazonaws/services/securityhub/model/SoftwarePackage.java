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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a software package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SoftwarePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SoftwarePackage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the software package.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the software package.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The epoch of the software package.
     * </p>
     */
    private String epoch;
    /**
     * <p>
     * The release of the software package.
     * </p>
     */
    private String release;
    /**
     * <p>
     * The architecture used for the software package.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The source of the package.
     * </p>
     */
    private String packageManager;
    /**
     * <p>
     * The file system path to the package manager inventory file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The version of the software package in which the vulnerability has been resolved.
     * </p>
     */
    private String fixedInVersion;
    /**
     * <p>
     * Describes the actions a customer can take to resolve the vulnerability in the software package.
     * </p>
     */
    private String remediation;
    /**
     * <p>
     * The source layer hash of the vulnerable package.
     * </p>
     */
    private String sourceLayerHash;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source layer.
     * </p>
     */
    private String sourceLayerArn;

    /**
     * <p>
     * The name of the software package.
     * </p>
     * 
     * @param name
     *        The name of the software package.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the software package.
     * </p>
     * 
     * @return The name of the software package.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the software package.
     * </p>
     * 
     * @param name
     *        The name of the software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the software package.
     * </p>
     * 
     * @param version
     *        The version of the software package.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the software package.
     * </p>
     * 
     * @return The version of the software package.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the software package.
     * </p>
     * 
     * @param version
     *        The version of the software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The epoch of the software package.
     * </p>
     * 
     * @param epoch
     *        The epoch of the software package.
     */

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    /**
     * <p>
     * The epoch of the software package.
     * </p>
     * 
     * @return The epoch of the software package.
     */

    public String getEpoch() {
        return this.epoch;
    }

    /**
     * <p>
     * The epoch of the software package.
     * </p>
     * 
     * @param epoch
     *        The epoch of the software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withEpoch(String epoch) {
        setEpoch(epoch);
        return this;
    }

    /**
     * <p>
     * The release of the software package.
     * </p>
     * 
     * @param release
     *        The release of the software package.
     */

    public void setRelease(String release) {
        this.release = release;
    }

    /**
     * <p>
     * The release of the software package.
     * </p>
     * 
     * @return The release of the software package.
     */

    public String getRelease() {
        return this.release;
    }

    /**
     * <p>
     * The release of the software package.
     * </p>
     * 
     * @param release
     *        The release of the software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withRelease(String release) {
        setRelease(release);
        return this;
    }

    /**
     * <p>
     * The architecture used for the software package.
     * </p>
     * 
     * @param architecture
     *        The architecture used for the software package.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture used for the software package.
     * </p>
     * 
     * @return The architecture used for the software package.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture used for the software package.
     * </p>
     * 
     * @param architecture
     *        The architecture used for the software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The source of the package.
     * </p>
     * 
     * @param packageManager
     *        The source of the package.
     */

    public void setPackageManager(String packageManager) {
        this.packageManager = packageManager;
    }

    /**
     * <p>
     * The source of the package.
     * </p>
     * 
     * @return The source of the package.
     */

    public String getPackageManager() {
        return this.packageManager;
    }

    /**
     * <p>
     * The source of the package.
     * </p>
     * 
     * @param packageManager
     *        The source of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withPackageManager(String packageManager) {
        setPackageManager(packageManager);
        return this;
    }

    /**
     * <p>
     * The file system path to the package manager inventory file.
     * </p>
     * 
     * @param filePath
     *        The file system path to the package manager inventory file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The file system path to the package manager inventory file.
     * </p>
     * 
     * @return The file system path to the package manager inventory file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The file system path to the package manager inventory file.
     * </p>
     * 
     * @param filePath
     *        The file system path to the package manager inventory file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The version of the software package in which the vulnerability has been resolved.
     * </p>
     * 
     * @param fixedInVersion
     *        The version of the software package in which the vulnerability has been resolved.
     */

    public void setFixedInVersion(String fixedInVersion) {
        this.fixedInVersion = fixedInVersion;
    }

    /**
     * <p>
     * The version of the software package in which the vulnerability has been resolved.
     * </p>
     * 
     * @return The version of the software package in which the vulnerability has been resolved.
     */

    public String getFixedInVersion() {
        return this.fixedInVersion;
    }

    /**
     * <p>
     * The version of the software package in which the vulnerability has been resolved.
     * </p>
     * 
     * @param fixedInVersion
     *        The version of the software package in which the vulnerability has been resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withFixedInVersion(String fixedInVersion) {
        setFixedInVersion(fixedInVersion);
        return this;
    }

    /**
     * <p>
     * Describes the actions a customer can take to resolve the vulnerability in the software package.
     * </p>
     * 
     * @param remediation
     *        Describes the actions a customer can take to resolve the vulnerability in the software package.
     */

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * Describes the actions a customer can take to resolve the vulnerability in the software package.
     * </p>
     * 
     * @return Describes the actions a customer can take to resolve the vulnerability in the software package.
     */

    public String getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * Describes the actions a customer can take to resolve the vulnerability in the software package.
     * </p>
     * 
     * @param remediation
     *        Describes the actions a customer can take to resolve the vulnerability in the software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withRemediation(String remediation) {
        setRemediation(remediation);
        return this;
    }

    /**
     * <p>
     * The source layer hash of the vulnerable package.
     * </p>
     * 
     * @param sourceLayerHash
     *        The source layer hash of the vulnerable package.
     */

    public void setSourceLayerHash(String sourceLayerHash) {
        this.sourceLayerHash = sourceLayerHash;
    }

    /**
     * <p>
     * The source layer hash of the vulnerable package.
     * </p>
     * 
     * @return The source layer hash of the vulnerable package.
     */

    public String getSourceLayerHash() {
        return this.sourceLayerHash;
    }

    /**
     * <p>
     * The source layer hash of the vulnerable package.
     * </p>
     * 
     * @param sourceLayerHash
     *        The source layer hash of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withSourceLayerHash(String sourceLayerHash) {
        setSourceLayerHash(sourceLayerHash);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source layer.
     * </p>
     * 
     * @param sourceLayerArn
     *        The Amazon Resource Name (ARN) of the source layer.
     */

    public void setSourceLayerArn(String sourceLayerArn) {
        this.sourceLayerArn = sourceLayerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source layer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source layer.
     */

    public String getSourceLayerArn() {
        return this.sourceLayerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source layer.
     * </p>
     * 
     * @param sourceLayerArn
     *        The Amazon Resource Name (ARN) of the source layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwarePackage withSourceLayerArn(String sourceLayerArn) {
        setSourceLayerArn(sourceLayerArn);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getEpoch() != null)
            sb.append("Epoch: ").append(getEpoch()).append(",");
        if (getRelease() != null)
            sb.append("Release: ").append(getRelease()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getPackageManager() != null)
            sb.append("PackageManager: ").append(getPackageManager()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getFixedInVersion() != null)
            sb.append("FixedInVersion: ").append(getFixedInVersion()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getSourceLayerHash() != null)
            sb.append("SourceLayerHash: ").append(getSourceLayerHash()).append(",");
        if (getSourceLayerArn() != null)
            sb.append("SourceLayerArn: ").append(getSourceLayerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SoftwarePackage == false)
            return false;
        SoftwarePackage other = (SoftwarePackage) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getEpoch() == null ^ this.getEpoch() == null)
            return false;
        if (other.getEpoch() != null && other.getEpoch().equals(this.getEpoch()) == false)
            return false;
        if (other.getRelease() == null ^ this.getRelease() == null)
            return false;
        if (other.getRelease() != null && other.getRelease().equals(this.getRelease()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getPackageManager() == null ^ this.getPackageManager() == null)
            return false;
        if (other.getPackageManager() != null && other.getPackageManager().equals(this.getPackageManager()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFixedInVersion() == null ^ this.getFixedInVersion() == null)
            return false;
        if (other.getFixedInVersion() != null && other.getFixedInVersion().equals(this.getFixedInVersion()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getSourceLayerHash() == null ^ this.getSourceLayerHash() == null)
            return false;
        if (other.getSourceLayerHash() != null && other.getSourceLayerHash().equals(this.getSourceLayerHash()) == false)
            return false;
        if (other.getSourceLayerArn() == null ^ this.getSourceLayerArn() == null)
            return false;
        if (other.getSourceLayerArn() != null && other.getSourceLayerArn().equals(this.getSourceLayerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getEpoch() == null) ? 0 : getEpoch().hashCode());
        hashCode = prime * hashCode + ((getRelease() == null) ? 0 : getRelease().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getPackageManager() == null) ? 0 : getPackageManager().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFixedInVersion() == null) ? 0 : getFixedInVersion().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getSourceLayerHash() == null) ? 0 : getSourceLayerHash().hashCode());
        hashCode = prime * hashCode + ((getSourceLayerArn() == null) ? 0 : getSourceLayerArn().hashCode());
        return hashCode;
    }

    @Override
    public SoftwarePackage clone() {
        try {
            return (SoftwarePackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SoftwarePackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
