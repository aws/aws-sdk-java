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
 * The object containing information about distinct imports or groups for Strategy Recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/Group" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Group implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the specific import group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the specific import group.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key of the specific import group.
     * </p>
     * 
     * @param name
     *        The key of the specific import group.
     * @see GroupName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The key of the specific import group.
     * </p>
     * 
     * @return The key of the specific import group.
     * @see GroupName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The key of the specific import group.
     * </p>
     * 
     * @param name
     *        The key of the specific import group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupName
     */

    public Group withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The key of the specific import group.
     * </p>
     * 
     * @param name
     *        The key of the specific import group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupName
     */

    public Group withName(GroupName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the specific import group.
     * </p>
     * 
     * @param value
     *        The value of the specific import group.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the specific import group.
     * </p>
     * 
     * @return The value of the specific import group.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the specific import group.
     * </p>
     * 
     * @param value
     *        The value of the specific import group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Group clone() {
        try {
            return (Group) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.GroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
