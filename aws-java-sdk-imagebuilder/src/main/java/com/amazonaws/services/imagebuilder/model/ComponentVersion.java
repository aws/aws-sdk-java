/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A high-level overview of a component semantic version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ComponentVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The semantic version of the component.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The description of the component.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The platform of the component.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The owner of the component.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The date that the component was created.
     * </p>
     */
    private String dateCreated;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the component.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVersion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVersion withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The semantic version of the component.
     * </p>
     * 
     * @param version
     *        The semantic version of the component.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The semantic version of the component.
     * </p>
     * 
     * @return The semantic version of the component.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The semantic version of the component.
     * </p>
     * 
     * @param version
     *        The semantic version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVersion withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The description of the component.
     * </p>
     * 
     * @param description
     *        The description of the component.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component.
     * </p>
     * 
     * @return The description of the component.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the component.
     * </p>
     * 
     * @param description
     *        The description of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @param platform
     *        The platform of the component.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @return The platform of the component.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @param platform
     *        The platform of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ComponentVersion withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @param platform
     *        The platform of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ComponentVersion withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * </p>
     * 
     * @param type
     *        The type of the component denotes whether the component is used to build the image or only to test it.
     * @see ComponentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * </p>
     * 
     * @return The type of the component denotes whether the component is used to build the image or only to test it.
     * @see ComponentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * </p>
     * 
     * @param type
     *        The type of the component denotes whether the component is used to build the image or only to test it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public ComponentVersion withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * </p>
     * 
     * @param type
     *        The type of the component denotes whether the component is used to build the image or only to test it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public ComponentVersion withType(ComponentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the component.
     * </p>
     * 
     * @param owner
     *        The owner of the component.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the component.
     * </p>
     * 
     * @return The owner of the component.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the component.
     * </p>
     * 
     * @param owner
     *        The owner of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVersion withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The date that the component was created.
     * </p>
     * 
     * @param dateCreated
     *        The date that the component was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date that the component was created.
     * </p>
     * 
     * @return The date that the component was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date that the component was created.
     * </p>
     * 
     * @param dateCreated
     *        The date that the component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentVersion withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentVersion == false)
            return false;
        ComponentVersion other = (ComponentVersion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        return hashCode;
    }

    @Override
    public ComponentVersion clone() {
        try {
            return (ComponentVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ComponentVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
