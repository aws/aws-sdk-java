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
 * Contains details about this version of the workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/WorkflowVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the workflow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The semantic version of the workflow resource. The format includes three nodes:
     * &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Describes the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The timestamp when Image Builder created the workflow version.
     * </p>
     */
    private String dateCreated;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the workflow resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the workflow resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowVersion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param name
     *        The name of the workflow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @return The name of the workflow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param name
     *        The name of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowVersion withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The semantic version of the workflow resource. The format includes three nodes:
     * &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;.
     * </p>
     * 
     * @param version
     *        The semantic version of the workflow resource. The format includes three nodes:
     *        &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The semantic version of the workflow resource. The format includes three nodes:
     * &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;.
     * </p>
     * 
     * @return The semantic version of the workflow resource. The format includes three nodes:
     *         &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The semantic version of the workflow resource. The format includes three nodes:
     * &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;.
     * </p>
     * 
     * @param version
     *        The semantic version of the workflow resource. The format includes three nodes:
     *        &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowVersion withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @param description
     *        Describes the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @return Describes the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @param description
     *        Describes the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @param type
     *        The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *        stage workflows.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @return The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *         stage workflows.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @param type
     *        The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *        stage workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowVersion withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @param type
     *        The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *        stage workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowVersion withType(WorkflowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     * 
     * @param owner
     *        The owner of the workflow resource.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     * 
     * @return The owner of the workflow resource.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     * 
     * @param owner
     *        The owner of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowVersion withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The timestamp when Image Builder created the workflow version.
     * </p>
     * 
     * @param dateCreated
     *        The timestamp when Image Builder created the workflow version.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The timestamp when Image Builder created the workflow version.
     * </p>
     * 
     * @return The timestamp when Image Builder created the workflow version.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The timestamp when Image Builder created the workflow version.
     * </p>
     * 
     * @param dateCreated
     *        The timestamp when Image Builder created the workflow version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowVersion withDateCreated(String dateCreated) {
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

        if (obj instanceof WorkflowVersion == false)
            return false;
        WorkflowVersion other = (WorkflowVersion) obj;
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowVersion clone() {
        try {
            return (WorkflowVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.WorkflowVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
