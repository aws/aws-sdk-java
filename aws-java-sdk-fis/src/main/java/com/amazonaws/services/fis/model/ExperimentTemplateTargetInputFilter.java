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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter used for the target resource input in an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentTemplateTargetInputFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentTemplateTargetInputFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute path for the filter.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The attribute values for the filter.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The attribute path for the filter.
     * </p>
     * 
     * @param path
     *        The attribute path for the filter.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The attribute path for the filter.
     * </p>
     * 
     * @return The attribute path for the filter.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The attribute path for the filter.
     * </p>
     * 
     * @param path
     *        The attribute path for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTargetInputFilter withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The attribute values for the filter.
     * </p>
     * 
     * @return The attribute values for the filter.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The attribute values for the filter.
     * </p>
     * 
     * @param values
     *        The attribute values for the filter.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The attribute values for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The attribute values for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTargetInputFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attribute values for the filter.
     * </p>
     * 
     * @param values
     *        The attribute values for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTargetInputFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentTemplateTargetInputFilter == false)
            return false;
        ExperimentTemplateTargetInputFilter other = (ExperimentTemplateTargetInputFilter) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentTemplateTargetInputFilter clone() {
        try {
            return (ExperimentTemplateTargetInputFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentTemplateTargetInputFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
