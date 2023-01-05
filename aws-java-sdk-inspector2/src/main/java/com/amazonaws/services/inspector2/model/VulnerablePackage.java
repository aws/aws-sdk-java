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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the vulnerable package identified by a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/VulnerablePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VulnerablePackage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The architecture of the vulnerable package.
     * </p>
     */
    private String arch;
    /**
     * <p>
     * The epoch of the vulnerable package.
     * </p>
     */
    private Integer epoch;
    /**
     * <p>
     * The file path of the vulnerable package.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The version of the package that contains the vulnerability fix.
     * </p>
     */
    private String fixedInVersion;
    /**
     * <p>
     * The name of the vulnerable package.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The package manager of the vulnerable package.
     * </p>
     */
    private String packageManager;
    /**
     * <p>
     * The release of the vulnerable package.
     * </p>
     */
    private String release;
    /**
     * <p>
     * The code to run in your environment to update packages with a fix available.
     * </p>
     */
    private String remediation;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the AWS Lambda function affected by a finding.
     * </p>
     */
    private String sourceLambdaLayerArn;
    /**
     * <p>
     * The source layer hash of the vulnerable package.
     * </p>
     */
    private String sourceLayerHash;
    /**
     * <p>
     * The version of the vulnerable package.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The architecture of the vulnerable package.
     * </p>
     * 
     * @param arch
     *        The architecture of the vulnerable package.
     */

    public void setArch(String arch) {
        this.arch = arch;
    }

    /**
     * <p>
     * The architecture of the vulnerable package.
     * </p>
     * 
     * @return The architecture of the vulnerable package.
     */

    public String getArch() {
        return this.arch;
    }

    /**
     * <p>
     * The architecture of the vulnerable package.
     * </p>
     * 
     * @param arch
     *        The architecture of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withArch(String arch) {
        setArch(arch);
        return this;
    }

    /**
     * <p>
     * The epoch of the vulnerable package.
     * </p>
     * 
     * @param epoch
     *        The epoch of the vulnerable package.
     */

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    /**
     * <p>
     * The epoch of the vulnerable package.
     * </p>
     * 
     * @return The epoch of the vulnerable package.
     */

    public Integer getEpoch() {
        return this.epoch;
    }

    /**
     * <p>
     * The epoch of the vulnerable package.
     * </p>
     * 
     * @param epoch
     *        The epoch of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withEpoch(Integer epoch) {
        setEpoch(epoch);
        return this;
    }

    /**
     * <p>
     * The file path of the vulnerable package.
     * </p>
     * 
     * @param filePath
     *        The file path of the vulnerable package.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The file path of the vulnerable package.
     * </p>
     * 
     * @return The file path of the vulnerable package.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The file path of the vulnerable package.
     * </p>
     * 
     * @param filePath
     *        The file path of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The version of the package that contains the vulnerability fix.
     * </p>
     * 
     * @param fixedInVersion
     *        The version of the package that contains the vulnerability fix.
     */

    public void setFixedInVersion(String fixedInVersion) {
        this.fixedInVersion = fixedInVersion;
    }

    /**
     * <p>
     * The version of the package that contains the vulnerability fix.
     * </p>
     * 
     * @return The version of the package that contains the vulnerability fix.
     */

    public String getFixedInVersion() {
        return this.fixedInVersion;
    }

    /**
     * <p>
     * The version of the package that contains the vulnerability fix.
     * </p>
     * 
     * @param fixedInVersion
     *        The version of the package that contains the vulnerability fix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withFixedInVersion(String fixedInVersion) {
        setFixedInVersion(fixedInVersion);
        return this;
    }

    /**
     * <p>
     * The name of the vulnerable package.
     * </p>
     * 
     * @param name
     *        The name of the vulnerable package.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the vulnerable package.
     * </p>
     * 
     * @return The name of the vulnerable package.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the vulnerable package.
     * </p>
     * 
     * @param name
     *        The name of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The package manager of the vulnerable package.
     * </p>
     * 
     * @param packageManager
     *        The package manager of the vulnerable package.
     * @see PackageManager
     */

    public void setPackageManager(String packageManager) {
        this.packageManager = packageManager;
    }

    /**
     * <p>
     * The package manager of the vulnerable package.
     * </p>
     * 
     * @return The package manager of the vulnerable package.
     * @see PackageManager
     */

    public String getPackageManager() {
        return this.packageManager;
    }

    /**
     * <p>
     * The package manager of the vulnerable package.
     * </p>
     * 
     * @param packageManager
     *        The package manager of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageManager
     */

    public VulnerablePackage withPackageManager(String packageManager) {
        setPackageManager(packageManager);
        return this;
    }

    /**
     * <p>
     * The package manager of the vulnerable package.
     * </p>
     * 
     * @param packageManager
     *        The package manager of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageManager
     */

    public VulnerablePackage withPackageManager(PackageManager packageManager) {
        this.packageManager = packageManager.toString();
        return this;
    }

    /**
     * <p>
     * The release of the vulnerable package.
     * </p>
     * 
     * @param release
     *        The release of the vulnerable package.
     */

    public void setRelease(String release) {
        this.release = release;
    }

    /**
     * <p>
     * The release of the vulnerable package.
     * </p>
     * 
     * @return The release of the vulnerable package.
     */

    public String getRelease() {
        return this.release;
    }

    /**
     * <p>
     * The release of the vulnerable package.
     * </p>
     * 
     * @param release
     *        The release of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withRelease(String release) {
        setRelease(release);
        return this;
    }

    /**
     * <p>
     * The code to run in your environment to update packages with a fix available.
     * </p>
     * 
     * @param remediation
     *        The code to run in your environment to update packages with a fix available.
     */

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * The code to run in your environment to update packages with a fix available.
     * </p>
     * 
     * @return The code to run in your environment to update packages with a fix available.
     */

    public String getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * The code to run in your environment to update packages with a fix available.
     * </p>
     * 
     * @param remediation
     *        The code to run in your environment to update packages with a fix available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withRemediation(String remediation) {
        setRemediation(remediation);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the AWS Lambda function affected by a finding.
     * </p>
     * 
     * @param sourceLambdaLayerArn
     *        The Amazon Resource Number (ARN) of the AWS Lambda function affected by a finding.
     */

    public void setSourceLambdaLayerArn(String sourceLambdaLayerArn) {
        this.sourceLambdaLayerArn = sourceLambdaLayerArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the AWS Lambda function affected by a finding.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the AWS Lambda function affected by a finding.
     */

    public String getSourceLambdaLayerArn() {
        return this.sourceLambdaLayerArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the AWS Lambda function affected by a finding.
     * </p>
     * 
     * @param sourceLambdaLayerArn
     *        The Amazon Resource Number (ARN) of the AWS Lambda function affected by a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withSourceLambdaLayerArn(String sourceLambdaLayerArn) {
        setSourceLambdaLayerArn(sourceLambdaLayerArn);
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

    public VulnerablePackage withSourceLayerHash(String sourceLayerHash) {
        setSourceLayerHash(sourceLayerHash);
        return this;
    }

    /**
     * <p>
     * The version of the vulnerable package.
     * </p>
     * 
     * @param version
     *        The version of the vulnerable package.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the vulnerable package.
     * </p>
     * 
     * @return The version of the vulnerable package.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the vulnerable package.
     * </p>
     * 
     * @param version
     *        The version of the vulnerable package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VulnerablePackage withVersion(String version) {
        setVersion(version);
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
        if (getArch() != null)
            sb.append("Arch: ").append(getArch()).append(",");
        if (getEpoch() != null)
            sb.append("Epoch: ").append(getEpoch()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getFixedInVersion() != null)
            sb.append("FixedInVersion: ").append(getFixedInVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPackageManager() != null)
            sb.append("PackageManager: ").append(getPackageManager()).append(",");
        if (getRelease() != null)
            sb.append("Release: ").append(getRelease()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getSourceLambdaLayerArn() != null)
            sb.append("SourceLambdaLayerArn: ").append(getSourceLambdaLayerArn()).append(",");
        if (getSourceLayerHash() != null)
            sb.append("SourceLayerHash: ").append(getSourceLayerHash()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VulnerablePackage == false)
            return false;
        VulnerablePackage other = (VulnerablePackage) obj;
        if (other.getArch() == null ^ this.getArch() == null)
            return false;
        if (other.getArch() != null && other.getArch().equals(this.getArch()) == false)
            return false;
        if (other.getEpoch() == null ^ this.getEpoch() == null)
            return false;
        if (other.getEpoch() != null && other.getEpoch().equals(this.getEpoch()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFixedInVersion() == null ^ this.getFixedInVersion() == null)
            return false;
        if (other.getFixedInVersion() != null && other.getFixedInVersion().equals(this.getFixedInVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPackageManager() == null ^ this.getPackageManager() == null)
            return false;
        if (other.getPackageManager() != null && other.getPackageManager().equals(this.getPackageManager()) == false)
            return false;
        if (other.getRelease() == null ^ this.getRelease() == null)
            return false;
        if (other.getRelease() != null && other.getRelease().equals(this.getRelease()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getSourceLambdaLayerArn() == null ^ this.getSourceLambdaLayerArn() == null)
            return false;
        if (other.getSourceLambdaLayerArn() != null && other.getSourceLambdaLayerArn().equals(this.getSourceLambdaLayerArn()) == false)
            return false;
        if (other.getSourceLayerHash() == null ^ this.getSourceLayerHash() == null)
            return false;
        if (other.getSourceLayerHash() != null && other.getSourceLayerHash().equals(this.getSourceLayerHash()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArch() == null) ? 0 : getArch().hashCode());
        hashCode = prime * hashCode + ((getEpoch() == null) ? 0 : getEpoch().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFixedInVersion() == null) ? 0 : getFixedInVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPackageManager() == null) ? 0 : getPackageManager().hashCode());
        hashCode = prime * hashCode + ((getRelease() == null) ? 0 : getRelease().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getSourceLambdaLayerArn() == null) ? 0 : getSourceLambdaLayerArn().hashCode());
        hashCode = prime * hashCode + ((getSourceLayerHash() == null) ? 0 : getSourceLayerHash().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public VulnerablePackage clone() {
        try {
            return (VulnerablePackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.VulnerablePackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
