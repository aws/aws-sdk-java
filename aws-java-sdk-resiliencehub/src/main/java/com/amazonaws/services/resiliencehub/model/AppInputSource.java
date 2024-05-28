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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of Resilience Hub application input sources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AppInputSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInputSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     */
    private EksSourceClusterNamespace eksSourceClusterNamespace;
    /**
     * <p>
     * The resource type of the input source.
     * </p>
     */
    private String importType;
    /**
     * <p>
     * The number of resources.
     * </p>
     */
    private Integer resourceCount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The name of the input source.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The name of the Terraform s3 state ﬁle.
     * </p>
     */
    private TerraformSource terraformSource;

    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     * 
     * @param eksSourceClusterNamespace
     *        The namespace on your Amazon Elastic Kubernetes Service cluster.
     */

    public void setEksSourceClusterNamespace(EksSourceClusterNamespace eksSourceClusterNamespace) {
        this.eksSourceClusterNamespace = eksSourceClusterNamespace;
    }

    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     * 
     * @return The namespace on your Amazon Elastic Kubernetes Service cluster.
     */

    public EksSourceClusterNamespace getEksSourceClusterNamespace() {
        return this.eksSourceClusterNamespace;
    }

    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster.
     * </p>
     * 
     * @param eksSourceClusterNamespace
     *        The namespace on your Amazon Elastic Kubernetes Service cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInputSource withEksSourceClusterNamespace(EksSourceClusterNamespace eksSourceClusterNamespace) {
        setEksSourceClusterNamespace(eksSourceClusterNamespace);
        return this;
    }

    /**
     * <p>
     * The resource type of the input source.
     * </p>
     * 
     * @param importType
     *        The resource type of the input source.
     * @see ResourceMappingType
     */

    public void setImportType(String importType) {
        this.importType = importType;
    }

    /**
     * <p>
     * The resource type of the input source.
     * </p>
     * 
     * @return The resource type of the input source.
     * @see ResourceMappingType
     */

    public String getImportType() {
        return this.importType;
    }

    /**
     * <p>
     * The resource type of the input source.
     * </p>
     * 
     * @param importType
     *        The resource type of the input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceMappingType
     */

    public AppInputSource withImportType(String importType) {
        setImportType(importType);
        return this;
    }

    /**
     * <p>
     * The resource type of the input source.
     * </p>
     * 
     * @param importType
     *        The resource type of the input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceMappingType
     */

    public AppInputSource withImportType(ResourceMappingType importType) {
        this.importType = importType.toString();
        return this;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @param resourceCount
     *        The number of resources.
     */

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @return The number of resources.
     */

    public Integer getResourceCount() {
        return this.resourceCount;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @param resourceCount
     *        The number of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInputSource withResourceCount(Integer resourceCount) {
        setResourceCount(resourceCount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the input source. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInputSource withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The name of the input source.
     * </p>
     * 
     * @param sourceName
     *        The name of the input source.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name of the input source.
     * </p>
     * 
     * @return The name of the input source.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The name of the input source.
     * </p>
     * 
     * @param sourceName
     *        The name of the input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInputSource withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The name of the Terraform s3 state ﬁle.
     * </p>
     * 
     * @param terraformSource
     *        The name of the Terraform s3 state ﬁle.
     */

    public void setTerraformSource(TerraformSource terraformSource) {
        this.terraformSource = terraformSource;
    }

    /**
     * <p>
     * The name of the Terraform s3 state ﬁle.
     * </p>
     * 
     * @return The name of the Terraform s3 state ﬁle.
     */

    public TerraformSource getTerraformSource() {
        return this.terraformSource;
    }

    /**
     * <p>
     * The name of the Terraform s3 state ﬁle.
     * </p>
     * 
     * @param terraformSource
     *        The name of the Terraform s3 state ﬁle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInputSource withTerraformSource(TerraformSource terraformSource) {
        setTerraformSource(terraformSource);
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
        if (getEksSourceClusterNamespace() != null)
            sb.append("EksSourceClusterNamespace: ").append(getEksSourceClusterNamespace()).append(",");
        if (getImportType() != null)
            sb.append("ImportType: ").append(getImportType()).append(",");
        if (getResourceCount() != null)
            sb.append("ResourceCount: ").append(getResourceCount()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getTerraformSource() != null)
            sb.append("TerraformSource: ").append(getTerraformSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInputSource == false)
            return false;
        AppInputSource other = (AppInputSource) obj;
        if (other.getEksSourceClusterNamespace() == null ^ this.getEksSourceClusterNamespace() == null)
            return false;
        if (other.getEksSourceClusterNamespace() != null && other.getEksSourceClusterNamespace().equals(this.getEksSourceClusterNamespace()) == false)
            return false;
        if (other.getImportType() == null ^ this.getImportType() == null)
            return false;
        if (other.getImportType() != null && other.getImportType().equals(this.getImportType()) == false)
            return false;
        if (other.getResourceCount() == null ^ this.getResourceCount() == null)
            return false;
        if (other.getResourceCount() != null && other.getResourceCount().equals(this.getResourceCount()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getTerraformSource() == null ^ this.getTerraformSource() == null)
            return false;
        if (other.getTerraformSource() != null && other.getTerraformSource().equals(this.getTerraformSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEksSourceClusterNamespace() == null) ? 0 : getEksSourceClusterNamespace().hashCode());
        hashCode = prime * hashCode + ((getImportType() == null) ? 0 : getImportType().hashCode());
        hashCode = prime * hashCode + ((getResourceCount() == null) ? 0 : getResourceCount().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getTerraformSource() == null) ? 0 : getTerraformSource().hashCode());
        return hashCode;
    }

    @Override
    public AppInputSource clone() {
        try {
            return (AppInputSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppInputSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
