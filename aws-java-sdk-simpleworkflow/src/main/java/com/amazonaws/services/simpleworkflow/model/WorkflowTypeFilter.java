/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to filter workflow execution query results by type. Each parameter, if specified, defines a rule that must be
 * satisfied by each returned result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowTypeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowTypeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the workflow type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version of the workflow type.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Name of the workflow type.
     * </p>
     * 
     * @param name
     *        Name of the workflow type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow type.
     * </p>
     * 
     * @return Name of the workflow type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the workflow type.
     * </p>
     * 
     * @param name
     *        Name of the workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version of the workflow type.
     * </p>
     * 
     * @param version
     *        Version of the workflow type.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version of the workflow type.
     * </p>
     * 
     * @return Version of the workflow type.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version of the workflow type.
     * </p>
     * 
     * @param version
     *        Version of the workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeFilter withVersion(String version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowTypeFilter == false)
            return false;
        WorkflowTypeFilter other = (WorkflowTypeFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowTypeFilter clone() {
        try {
            return (WorkflowTypeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.WorkflowTypeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
