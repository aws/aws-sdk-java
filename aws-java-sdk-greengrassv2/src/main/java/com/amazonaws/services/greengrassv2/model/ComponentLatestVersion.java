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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the latest version of a component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentLatestVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentLatestVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The version of the component.
     * </p>
     */
    private String componentVersion;
    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The description of the component version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The publisher of the component version.
     * </p>
     */
    private String publisher;
    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     */
    private java.util.List<ComponentPlatform> platforms;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         component version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentLatestVersion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     */

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @return The version of the component.
     */

    public String getComponentVersion() {
        return this.componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentLatestVersion withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
        return this;
    }

    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the component was created, expressed in ISO 8601 format.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the component was created, expressed in ISO 8601 format.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the component was created, expressed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentLatestVersion withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The description of the component version.
     * </p>
     * 
     * @param description
     *        The description of the component version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component version.
     * </p>
     * 
     * @return The description of the component version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the component version.
     * </p>
     * 
     * @param description
     *        The description of the component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentLatestVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The publisher of the component version.
     * </p>
     * 
     * @param publisher
     *        The publisher of the component version.
     */

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * <p>
     * The publisher of the component version.
     * </p>
     * 
     * @return The publisher of the component version.
     */

    public String getPublisher() {
        return this.publisher;
    }

    /**
     * <p>
     * The publisher of the component version.
     * </p>
     * 
     * @param publisher
     *        The publisher of the component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentLatestVersion withPublisher(String publisher) {
        setPublisher(publisher);
        return this;
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * 
     * @return The platforms that the component version supports.
     */

    public java.util.List<ComponentPlatform> getPlatforms() {
        return platforms;
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * 
     * @param platforms
     *        The platforms that the component version supports.
     */

    public void setPlatforms(java.util.Collection<ComponentPlatform> platforms) {
        if (platforms == null) {
            this.platforms = null;
            return;
        }

        this.platforms = new java.util.ArrayList<ComponentPlatform>(platforms);
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatforms(java.util.Collection)} or {@link #withPlatforms(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param platforms
     *        The platforms that the component version supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentLatestVersion withPlatforms(ComponentPlatform... platforms) {
        if (this.platforms == null) {
            setPlatforms(new java.util.ArrayList<ComponentPlatform>(platforms.length));
        }
        for (ComponentPlatform ele : platforms) {
            this.platforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * 
     * @param platforms
     *        The platforms that the component version supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentLatestVersion withPlatforms(java.util.Collection<ComponentPlatform> platforms) {
        setPlatforms(platforms);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPublisher() != null)
            sb.append("Publisher: ").append(getPublisher()).append(",");
        if (getPlatforms() != null)
            sb.append("Platforms: ").append(getPlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentLatestVersion == false)
            return false;
        ComponentLatestVersion other = (ComponentLatestVersion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPublisher() == null ^ this.getPublisher() == null)
            return false;
        if (other.getPublisher() != null && other.getPublisher().equals(this.getPublisher()) == false)
            return false;
        if (other.getPlatforms() == null ^ this.getPlatforms() == null)
            return false;
        if (other.getPlatforms() != null && other.getPlatforms().equals(this.getPlatforms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        hashCode = prime * hashCode + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        return hashCode;
    }

    @Override
    public ComponentLatestVersion clone() {
        try {
            return (ComponentLatestVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ComponentLatestVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
