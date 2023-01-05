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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/WorkflowParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameter's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the parameter is optional.
     * </p>
     */
    private Boolean optional;

    /**
     * <p>
     * The parameter's description.
     * </p>
     * 
     * @param description
     *        The parameter's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The parameter's description.
     * </p>
     * 
     * @return The parameter's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The parameter's description.
     * </p>
     * 
     * @param description
     *        The parameter's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the parameter is optional.
     * </p>
     * 
     * @param optional
     *        Whether the parameter is optional.
     */

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * <p>
     * Whether the parameter is optional.
     * </p>
     * 
     * @return Whether the parameter is optional.
     */

    public Boolean getOptional() {
        return this.optional;
    }

    /**
     * <p>
     * Whether the parameter is optional.
     * </p>
     * 
     * @param optional
     *        Whether the parameter is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowParameter withOptional(Boolean optional) {
        setOptional(optional);
        return this;
    }

    /**
     * <p>
     * Whether the parameter is optional.
     * </p>
     * 
     * @return Whether the parameter is optional.
     */

    public Boolean isOptional() {
        return this.optional;
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
        if (getOptional() != null)
            sb.append("Optional: ").append(getOptional());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowParameter == false)
            return false;
        WorkflowParameter other = (WorkflowParameter) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOptional() == null ^ this.getOptional() == null)
            return false;
        if (other.getOptional() != null && other.getOptional().equals(this.getOptional()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOptional() == null) ? 0 : getOptional().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowParameter clone() {
        try {
            return (WorkflowParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.WorkflowParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
