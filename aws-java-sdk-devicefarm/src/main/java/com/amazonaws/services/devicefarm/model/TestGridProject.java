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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Selenium testing project. Projects are used to collect and collate sessions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/TestGridProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestGridProject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for the project.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A human-readable name for the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A human-readable description for the project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * When the project was created.
     * </p>
     */
    private java.util.Date created;

    /**
     * <p>
     * The ARN for the project.
     * </p>
     * 
     * @param arn
     *        The ARN for the project.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the project.
     * </p>
     * 
     * @return The ARN for the project.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the project.
     * </p>
     * 
     * @param arn
     *        The ARN for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridProject withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A human-readable name for the project.
     * </p>
     * 
     * @param name
     *        A human-readable name for the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A human-readable name for the project.
     * </p>
     * 
     * @return A human-readable name for the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A human-readable name for the project.
     * </p>
     * 
     * @param name
     *        A human-readable name for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridProject withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A human-readable description for the project.
     * </p>
     * 
     * @param description
     *        A human-readable description for the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description for the project.
     * </p>
     * 
     * @return A human-readable description for the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description for the project.
     * </p>
     * 
     * @param description
     *        A human-readable description for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridProject withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * When the project was created.
     * </p>
     * 
     * @param created
     *        When the project was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * When the project was created.
     * </p>
     * 
     * @return When the project was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * When the project was created.
     * </p>
     * 
     * @param created
     *        When the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridProject withCreated(java.util.Date created) {
        setCreated(created);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestGridProject == false)
            return false;
        TestGridProject other = (TestGridProject) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        return hashCode;
    }

    @Override
    public TestGridProject clone() {
        try {
            return (TestGridProject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.TestGridProjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
