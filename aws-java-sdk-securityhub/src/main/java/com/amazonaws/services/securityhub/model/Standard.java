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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a specific standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Standard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Standard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     */
    private String standardsArn;
    /**
     * <p>
     * The name of the standard.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the standard.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @param standardsArn
     *        The ARN of a standard.
     */

    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @return The ARN of a standard.
     */

    public String getStandardsArn() {
        return this.standardsArn;
    }

    /**
     * <p>
     * The ARN of a standard.
     * </p>
     * 
     * @param standardsArn
     *        The ARN of a standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Standard withStandardsArn(String standardsArn) {
        setStandardsArn(standardsArn);
        return this;
    }

    /**
     * <p>
     * The name of the standard.
     * </p>
     * 
     * @param name
     *        The name of the standard.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the standard.
     * </p>
     * 
     * @return The name of the standard.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the standard.
     * </p>
     * 
     * @param name
     *        The name of the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Standard withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the standard.
     * </p>
     * 
     * @param description
     *        A description of the standard.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the standard.
     * </p>
     * 
     * @return A description of the standard.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the standard.
     * </p>
     * 
     * @param description
     *        A description of the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Standard withDescription(String description) {
        setDescription(description);
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
        if (getStandardsArn() != null)
            sb.append("StandardsArn: ").append(getStandardsArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Standard == false)
            return false;
        Standard other = (Standard) obj;
        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Standard clone() {
        try {
            return (Standard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
