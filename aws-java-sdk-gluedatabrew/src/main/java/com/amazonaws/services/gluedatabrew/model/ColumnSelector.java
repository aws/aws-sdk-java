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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Selector of a column from a dataset for profile job configuration. One selector includes either a column name or a
 * regular expression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ColumnSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A regular expression for selecting a column from a dataset.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * The name of a column from a dataset.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A regular expression for selecting a column from a dataset.
     * </p>
     * 
     * @param regex
     *        A regular expression for selecting a column from a dataset.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * A regular expression for selecting a column from a dataset.
     * </p>
     * 
     * @return A regular expression for selecting a column from a dataset.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * A regular expression for selecting a column from a dataset.
     * </p>
     * 
     * @param regex
     *        A regular expression for selecting a column from a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSelector withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * The name of a column from a dataset.
     * </p>
     * 
     * @param name
     *        The name of a column from a dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a column from a dataset.
     * </p>
     * 
     * @return The name of a column from a dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a column from a dataset.
     * </p>
     * 
     * @param name
     *        The name of a column from a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSelector withName(String name) {
        setName(name);
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
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnSelector == false)
            return false;
        ColumnSelector other = (ColumnSelector) obj;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ColumnSelector clone() {
        try {
            return (ColumnSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ColumnSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
