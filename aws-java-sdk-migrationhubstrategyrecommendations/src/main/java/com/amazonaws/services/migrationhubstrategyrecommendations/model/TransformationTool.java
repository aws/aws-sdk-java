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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information of the transformation tool that can be used to migrate and modernize the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/TransformationTool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformationTool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Description of the tool.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Name of the tool.
     * </p>
     */
    private String name;
    /**
     * <p>
     * URL for installing the tool.
     * </p>
     */
    private String tranformationToolInstallationLink;

    /**
     * <p>
     * Description of the tool.
     * </p>
     * 
     * @param description
     *        Description of the tool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the tool.
     * </p>
     * 
     * @return Description of the tool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the tool.
     * </p>
     * 
     * @param description
     *        Description of the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformationTool withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Name of the tool.
     * </p>
     * 
     * @param name
     *        Name of the tool.
     * @see TransformationToolName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the tool.
     * </p>
     * 
     * @return Name of the tool.
     * @see TransformationToolName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the tool.
     * </p>
     * 
     * @param name
     *        Name of the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformationToolName
     */

    public TransformationTool withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Name of the tool.
     * </p>
     * 
     * @param name
     *        Name of the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformationToolName
     */

    public TransformationTool withName(TransformationToolName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * URL for installing the tool.
     * </p>
     * 
     * @param tranformationToolInstallationLink
     *        URL for installing the tool.
     */

    public void setTranformationToolInstallationLink(String tranformationToolInstallationLink) {
        this.tranformationToolInstallationLink = tranformationToolInstallationLink;
    }

    /**
     * <p>
     * URL for installing the tool.
     * </p>
     * 
     * @return URL for installing the tool.
     */

    public String getTranformationToolInstallationLink() {
        return this.tranformationToolInstallationLink;
    }

    /**
     * <p>
     * URL for installing the tool.
     * </p>
     * 
     * @param tranformationToolInstallationLink
     *        URL for installing the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformationTool withTranformationToolInstallationLink(String tranformationToolInstallationLink) {
        setTranformationToolInstallationLink(tranformationToolInstallationLink);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTranformationToolInstallationLink() != null)
            sb.append("TranformationToolInstallationLink: ").append(getTranformationToolInstallationLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformationTool == false)
            return false;
        TransformationTool other = (TransformationTool) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTranformationToolInstallationLink() == null ^ this.getTranformationToolInstallationLink() == null)
            return false;
        if (other.getTranformationToolInstallationLink() != null
                && other.getTranformationToolInstallationLink().equals(this.getTranformationToolInstallationLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTranformationToolInstallationLink() == null) ? 0 : getTranformationToolInstallationLink().hashCode());
        return hashCode;
    }

    @Override
    public TransformationTool clone() {
        try {
            return (TransformationTool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.TransformationToolMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
