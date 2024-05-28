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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings that Image Builder uses to configure the ECR repository and the output container images that Amazon
 * Inspector scans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/EcrConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcrConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container repository that Amazon Inspector scans to identify findings for your container images.
     * The name includes the path for the repository location. If you don’t provide this information, Image Builder
     * creates a repository in your account named <code>image-builder-image-scanning-repository</code> for vulnerability
     * scans of your output container images.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you identify
     * and manage your scanned images.
     * </p>
     */
    private java.util.List<String> containerTags;

    /**
     * <p>
     * The name of the container repository that Amazon Inspector scans to identify findings for your container images.
     * The name includes the path for the repository location. If you don’t provide this information, Image Builder
     * creates a repository in your account named <code>image-builder-image-scanning-repository</code> for vulnerability
     * scans of your output container images.
     * </p>
     * 
     * @param repositoryName
     *        The name of the container repository that Amazon Inspector scans to identify findings for your container
     *        images. The name includes the path for the repository location. If you don’t provide this information,
     *        Image Builder creates a repository in your account named
     *        <code>image-builder-image-scanning-repository</code> for vulnerability scans of your output container
     *        images.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the container repository that Amazon Inspector scans to identify findings for your container images.
     * The name includes the path for the repository location. If you don’t provide this information, Image Builder
     * creates a repository in your account named <code>image-builder-image-scanning-repository</code> for vulnerability
     * scans of your output container images.
     * </p>
     * 
     * @return The name of the container repository that Amazon Inspector scans to identify findings for your container
     *         images. The name includes the path for the repository location. If you don’t provide this information,
     *         Image Builder creates a repository in your account named
     *         <code>image-builder-image-scanning-repository</code> for vulnerability scans of your output container
     *         images.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the container repository that Amazon Inspector scans to identify findings for your container images.
     * The name includes the path for the repository location. If you don’t provide this information, Image Builder
     * creates a repository in your account named <code>image-builder-image-scanning-repository</code> for vulnerability
     * scans of your output container images.
     * </p>
     * 
     * @param repositoryName
     *        The name of the container repository that Amazon Inspector scans to identify findings for your container
     *        images. The name includes the path for the repository location. If you don’t provide this information,
     *        Image Builder creates a repository in your account named
     *        <code>image-builder-image-scanning-repository</code> for vulnerability scans of your output container
     *        images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcrConfiguration withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you identify
     * and manage your scanned images.
     * </p>
     * 
     * @return Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you
     *         identify and manage your scanned images.
     */

    public java.util.List<String> getContainerTags() {
        return containerTags;
    }

    /**
     * <p>
     * Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you identify
     * and manage your scanned images.
     * </p>
     * 
     * @param containerTags
     *        Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you
     *        identify and manage your scanned images.
     */

    public void setContainerTags(java.util.Collection<String> containerTags) {
        if (containerTags == null) {
            this.containerTags = null;
            return;
        }

        this.containerTags = new java.util.ArrayList<String>(containerTags);
    }

    /**
     * <p>
     * Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you identify
     * and manage your scanned images.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerTags(java.util.Collection)} or {@link #withContainerTags(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param containerTags
     *        Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you
     *        identify and manage your scanned images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcrConfiguration withContainerTags(String... containerTags) {
        if (this.containerTags == null) {
            setContainerTags(new java.util.ArrayList<String>(containerTags.length));
        }
        for (String ele : containerTags) {
            this.containerTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you identify
     * and manage your scanned images.
     * </p>
     * 
     * @param containerTags
     *        Tags for Image Builder to apply to the output container image that &amp;INS; scans. Tags can help you
     *        identify and manage your scanned images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcrConfiguration withContainerTags(java.util.Collection<String> containerTags) {
        setContainerTags(containerTags);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getContainerTags() != null)
            sb.append("ContainerTags: ").append(getContainerTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcrConfiguration == false)
            return false;
        EcrConfiguration other = (EcrConfiguration) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getContainerTags() == null ^ this.getContainerTags() == null)
            return false;
        if (other.getContainerTags() != null && other.getContainerTags().equals(this.getContainerTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getContainerTags() == null) ? 0 : getContainerTags().hashCode());
        return hashCode;
    }

    @Override
    public EcrConfiguration clone() {
        try {
            return (EcrConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.EcrConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
