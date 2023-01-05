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
 * A summary of information about the AWS Lambda function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AwsLambdaFunctionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaFunctionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instruction set architecture that the AWS Lambda function supports. Architecture is a string array with one
     * of the valid values. The default architecture value is <code>x86_64</code>.
     * </p>
     */
    private java.util.List<String> architectures;
    /**
     * <p>
     * The SHA256 hash of the AWS Lambda function's deployment package.
     * </p>
     */
    private String codeSha256;
    /**
     * <p>
     * The AWS Lambda function's execution role.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The name of the AWS Lambda function.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The AWS Lambda function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     * layers</a>. A Lambda function can have up to five layers.
     * </p>
     */
    private java.util.List<String> layers;
    /**
     * <p>
     * The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for .zip
     * file archive.
     * </p>
     */
    private String packageType;
    /**
     * <p>
     * The runtime environment for the AWS Lambda function.
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The version of the AWS Lambda function.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The AWS Lambda function's networking configuration.
     * </p>
     */
    private LambdaVpcConfig vpcConfig;

    /**
     * <p>
     * The instruction set architecture that the AWS Lambda function supports. Architecture is a string array with one
     * of the valid values. The default architecture value is <code>x86_64</code>.
     * </p>
     * 
     * @return The instruction set architecture that the AWS Lambda function supports. Architecture is a string array
     *         with one of the valid values. The default architecture value is <code>x86_64</code>.
     * @see Architecture
     */

    public java.util.List<String> getArchitectures() {
        return architectures;
    }

    /**
     * <p>
     * The instruction set architecture that the AWS Lambda function supports. Architecture is a string array with one
     * of the valid values. The default architecture value is <code>x86_64</code>.
     * </p>
     * 
     * @param architectures
     *        The instruction set architecture that the AWS Lambda function supports. Architecture is a string array
     *        with one of the valid values. The default architecture value is <code>x86_64</code>.
     * @see Architecture
     */

    public void setArchitectures(java.util.Collection<String> architectures) {
        if (architectures == null) {
            this.architectures = null;
            return;
        }

        this.architectures = new java.util.ArrayList<String>(architectures);
    }

    /**
     * <p>
     * The instruction set architecture that the AWS Lambda function supports. Architecture is a string array with one
     * of the valid values. The default architecture value is <code>x86_64</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchitectures(java.util.Collection)} or {@link #withArchitectures(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param architectures
     *        The instruction set architecture that the AWS Lambda function supports. Architecture is a string array
     *        with one of the valid values. The default architecture value is <code>x86_64</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public AwsLambdaFunctionDetails withArchitectures(String... architectures) {
        if (this.architectures == null) {
            setArchitectures(new java.util.ArrayList<String>(architectures.length));
        }
        for (String ele : architectures) {
            this.architectures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instruction set architecture that the AWS Lambda function supports. Architecture is a string array with one
     * of the valid values. The default architecture value is <code>x86_64</code>.
     * </p>
     * 
     * @param architectures
     *        The instruction set architecture that the AWS Lambda function supports. Architecture is a string array
     *        with one of the valid values. The default architecture value is <code>x86_64</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public AwsLambdaFunctionDetails withArchitectures(java.util.Collection<String> architectures) {
        setArchitectures(architectures);
        return this;
    }

    /**
     * <p>
     * The instruction set architecture that the AWS Lambda function supports. Architecture is a string array with one
     * of the valid values. The default architecture value is <code>x86_64</code>.
     * </p>
     * 
     * @param architectures
     *        The instruction set architecture that the AWS Lambda function supports. Architecture is a string array
     *        with one of the valid values. The default architecture value is <code>x86_64</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public AwsLambdaFunctionDetails withArchitectures(Architecture... architectures) {
        java.util.ArrayList<String> architecturesCopy = new java.util.ArrayList<String>(architectures.length);
        for (Architecture value : architectures) {
            architecturesCopy.add(value.toString());
        }
        if (getArchitectures() == null) {
            setArchitectures(architecturesCopy);
        } else {
            getArchitectures().addAll(architecturesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The SHA256 hash of the AWS Lambda function's deployment package.
     * </p>
     * 
     * @param codeSha256
     *        The SHA256 hash of the AWS Lambda function's deployment package.
     */

    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the AWS Lambda function's deployment package.
     * </p>
     * 
     * @return The SHA256 hash of the AWS Lambda function's deployment package.
     */

    public String getCodeSha256() {
        return this.codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the AWS Lambda function's deployment package.
     * </p>
     * 
     * @param codeSha256
     *        The SHA256 hash of the AWS Lambda function's deployment package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withCodeSha256(String codeSha256) {
        setCodeSha256(codeSha256);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda function's execution role.
     * </p>
     * 
     * @param executionRoleArn
     *        The AWS Lambda function's execution role.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The AWS Lambda function's execution role.
     * </p>
     * 
     * @return The AWS Lambda function's execution role.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The AWS Lambda function's execution role.
     * </p>
     * 
     * @param executionRoleArn
     *        The AWS Lambda function's execution role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Lambda function.
     * </p>
     * 
     * @param functionName
     *        The name of the AWS Lambda function.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the AWS Lambda function.
     * </p>
     * 
     * @return The name of the AWS Lambda function.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the AWS Lambda function.
     * </p>
     * 
     * @param functionName
     *        The name of the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time that a user last updated the configuration, in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     * 
     * @return The date and time that a user last updated the configuration, in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time that a user last updated the configuration, in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     * layers</a>. A Lambda function can have up to five layers.
     * </p>
     * 
     * @return The AWS Lambda function's <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *         function can have up to five layers.
     */

    public java.util.List<String> getLayers() {
        return layers;
    }

    /**
     * <p>
     * The AWS Lambda function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     * layers</a>. A Lambda function can have up to five layers.
     * </p>
     * 
     * @param layers
     *        The AWS Lambda function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *        function can have up to five layers.
     */

    public void setLayers(java.util.Collection<String> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new java.util.ArrayList<String>(layers);
    }

    /**
     * <p>
     * The AWS Lambda function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     * layers</a>. A Lambda function can have up to five layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayers(java.util.Collection)} or {@link #withLayers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layers
     *        The AWS Lambda function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *        function can have up to five layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withLayers(String... layers) {
        if (this.layers == null) {
            setLayers(new java.util.ArrayList<String>(layers.length));
        }
        for (String ele : layers) {
            this.layers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Lambda function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     * layers</a>. A Lambda function can have up to five layers.
     * </p>
     * 
     * @param layers
     *        The AWS Lambda function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *        function can have up to five layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withLayers(java.util.Collection<String> layers) {
        setLayers(layers);
        return this;
    }

    /**
     * <p>
     * The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for .zip
     * file archive.
     * </p>
     * 
     * @param packageType
     *        The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for
     *        .zip file archive.
     * @see PackageType
     */

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * <p>
     * The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for .zip
     * file archive.
     * </p>
     * 
     * @return The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code>
     *         for .zip file archive.
     * @see PackageType
     */

    public String getPackageType() {
        return this.packageType;
    }

    /**
     * <p>
     * The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for .zip
     * file archive.
     * </p>
     * 
     * @param packageType
     *        The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for
     *        .zip file archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageType
     */

    public AwsLambdaFunctionDetails withPackageType(String packageType) {
        setPackageType(packageType);
        return this;
    }

    /**
     * <p>
     * The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for .zip
     * file archive.
     * </p>
     * 
     * @param packageType
     *        The type of deployment package. Set to <code>Image</code> for container image and set <code>Zip</code> for
     *        .zip file archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageType
     */

    public AwsLambdaFunctionDetails withPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
        return this;
    }

    /**
     * <p>
     * The runtime environment for the AWS Lambda function.
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the AWS Lambda function.
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime environment for the AWS Lambda function.
     * </p>
     * 
     * @return The runtime environment for the AWS Lambda function.
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime environment for the AWS Lambda function.
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public AwsLambdaFunctionDetails withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the AWS Lambda function.
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public AwsLambdaFunctionDetails withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The version of the AWS Lambda function.
     * </p>
     * 
     * @param version
     *        The version of the AWS Lambda function.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the AWS Lambda function.
     * </p>
     * 
     * @return The version of the AWS Lambda function.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the AWS Lambda function.
     * </p>
     * 
     * @param version
     *        The version of the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda function's networking configuration.
     * </p>
     * 
     * @param vpcConfig
     *        The AWS Lambda function's networking configuration.
     */

    public void setVpcConfig(LambdaVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The AWS Lambda function's networking configuration.
     * </p>
     * 
     * @return The AWS Lambda function's networking configuration.
     */

    public LambdaVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The AWS Lambda function's networking configuration.
     * </p>
     * 
     * @param vpcConfig
     *        The AWS Lambda function's networking configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionDetails withVpcConfig(LambdaVpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getArchitectures() != null)
            sb.append("Architectures: ").append(getArchitectures()).append(",");
        if (getCodeSha256() != null)
            sb.append("CodeSha256: ").append(getCodeSha256()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getLayers() != null)
            sb.append("Layers: ").append(getLayers()).append(",");
        if (getPackageType() != null)
            sb.append("PackageType: ").append(getPackageType()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionDetails == false)
            return false;
        AwsLambdaFunctionDetails other = (AwsLambdaFunctionDetails) obj;
        if (other.getArchitectures() == null ^ this.getArchitectures() == null)
            return false;
        if (other.getArchitectures() != null && other.getArchitectures().equals(this.getArchitectures()) == false)
            return false;
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null)
            return false;
        if (other.getCodeSha256() != null && other.getCodeSha256().equals(this.getCodeSha256()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
            return false;
        if (other.getPackageType() == null ^ this.getPackageType() == null)
            return false;
        if (other.getPackageType() != null && other.getPackageType().equals(this.getPackageType()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitectures() == null) ? 0 : getArchitectures().hashCode());
        hashCode = prime * hashCode + ((getCodeSha256() == null) ? 0 : getCodeSha256().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        hashCode = prime * hashCode + ((getPackageType() == null) ? 0 : getPackageType().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsLambdaFunctionDetails clone() {
        try {
            return (AwsLambdaFunctionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AwsLambdaFunctionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
