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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of a view version's metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ViewVersionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the view version.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description of the view version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the view version.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the view version.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The description of the view version.
     * </p>
     */
    private String versionDescription;

    /**
     * <p>
     * The identifier of the view version.
     * </p>
     * 
     * @param id
     *        The identifier of the view version.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the view version.
     * </p>
     * 
     * @return The identifier of the view version.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the view version.
     * </p>
     * 
     * @param id
     *        The identifier of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewVersionSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the view version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the view version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewVersionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * 
     * @param description
     *        The description of the view version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * 
     * @return The description of the view version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * 
     * @param description
     *        The description of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewVersionSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the view version.
     * </p>
     * 
     * @param name
     *        The name of the view version.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the view version.
     * </p>
     * 
     * @return The name of the view version.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the view version.
     * </p>
     * 
     * @param name
     *        The name of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewVersionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * 
     * @param type
     *        The type of the view version.
     * @see ViewType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * 
     * @return The type of the view version.
     * @see ViewType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * 
     * @param type
     *        The type of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewType
     */

    public ViewVersionSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * 
     * @param type
     *        The type of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewType
     */

    public ViewVersionSummary withType(ViewType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     * 
     * @param version
     *        The sequentially incremented version of the view version.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     * 
     * @return The sequentially incremented version of the view version.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     * 
     * @param version
     *        The sequentially incremented version of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewVersionSummary withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * 
     * @param versionDescription
     *        The description of the view version.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * 
     * @return The description of the view version.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * 
     * @param versionDescription
     *        The description of the view version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewVersionSummary withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewVersionSummary == false)
            return false;
        ViewVersionSummary other = (ViewVersionSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        return hashCode;
    }

    @Override
    public ViewVersionSummary clone() {
        try {
            return (ViewVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ViewVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
