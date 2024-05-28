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
package com.amazonaws.services.controlcatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An optional filter that narrows the results to a specific objective.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/CommonControlFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommonControlFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The objective that's used as filter criteria.
     * </p>
     * <p>
     * You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     * <code>CommonControlFilter</code> isn’t currently supported.
     * </p>
     */
    private java.util.List<ObjectiveResourceFilter> objectives;

    /**
     * <p>
     * The objective that's used as filter criteria.
     * </p>
     * <p>
     * You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     * <code>CommonControlFilter</code> isn’t currently supported.
     * </p>
     * 
     * @return The objective that's used as filter criteria.</p>
     *         <p>
     *         You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     *         <code>CommonControlFilter</code> isn’t currently supported.
     */

    public java.util.List<ObjectiveResourceFilter> getObjectives() {
        return objectives;
    }

    /**
     * <p>
     * The objective that's used as filter criteria.
     * </p>
     * <p>
     * You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     * <code>CommonControlFilter</code> isn’t currently supported.
     * </p>
     * 
     * @param objectives
     *        The objective that's used as filter criteria.</p>
     *        <p>
     *        You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     *        <code>CommonControlFilter</code> isn’t currently supported.
     */

    public void setObjectives(java.util.Collection<ObjectiveResourceFilter> objectives) {
        if (objectives == null) {
            this.objectives = null;
            return;
        }

        this.objectives = new java.util.ArrayList<ObjectiveResourceFilter>(objectives);
    }

    /**
     * <p>
     * The objective that's used as filter criteria.
     * </p>
     * <p>
     * You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     * <code>CommonControlFilter</code> isn’t currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectives(java.util.Collection)} or {@link #withObjectives(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param objectives
     *        The objective that's used as filter criteria.</p>
     *        <p>
     *        You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     *        <code>CommonControlFilter</code> isn’t currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommonControlFilter withObjectives(ObjectiveResourceFilter... objectives) {
        if (this.objectives == null) {
            setObjectives(new java.util.ArrayList<ObjectiveResourceFilter>(objectives.length));
        }
        for (ObjectiveResourceFilter ele : objectives) {
            this.objectives.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The objective that's used as filter criteria.
     * </p>
     * <p>
     * You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     * <code>CommonControlFilter</code> isn’t currently supported.
     * </p>
     * 
     * @param objectives
     *        The objective that's used as filter criteria.</p>
     *        <p>
     *        You can use this parameter to specify one objective ARN at a time. Passing multiple ARNs in the
     *        <code>CommonControlFilter</code> isn’t currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommonControlFilter withObjectives(java.util.Collection<ObjectiveResourceFilter> objectives) {
        setObjectives(objectives);
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
        if (getObjectives() != null)
            sb.append("Objectives: ").append(getObjectives());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommonControlFilter == false)
            return false;
        CommonControlFilter other = (CommonControlFilter) obj;
        if (other.getObjectives() == null ^ this.getObjectives() == null)
            return false;
        if (other.getObjectives() != null && other.getObjectives().equals(this.getObjectives()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectives() == null) ? 0 : getObjectives().hashCode());
        return hashCode;
    }

    @Override
    public CommonControlFilter clone() {
        try {
            return (CommonControlFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controlcatalog.model.transform.CommonControlFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
