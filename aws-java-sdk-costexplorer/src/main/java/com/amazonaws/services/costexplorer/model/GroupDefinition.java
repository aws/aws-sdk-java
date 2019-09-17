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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a group when you specify a group by criteria or in the response to a query with a specific grouping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GroupDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * 
     * @param type
     *        The string that represents the type of group.
     * @see GroupDefinitionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * 
     * @return The string that represents the type of group.
     * @see GroupDefinitionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * 
     * @param type
     *        The string that represents the type of group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupDefinitionType
     */

    public GroupDefinition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * 
     * @param type
     *        The string that represents the type of group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupDefinitionType
     */

    public GroupDefinition withType(GroupDefinitionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     * 
     * @param key
     *        The string that represents a key for a specified group.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     * 
     * @return The string that represents a key for a specified group.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     * 
     * @param key
     *        The string that represents a key for a specified group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupDefinition withKey(String key) {
        setKey(key);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupDefinition == false)
            return false;
        GroupDefinition other = (GroupDefinition) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public GroupDefinition clone() {
        try {
            return (GroupDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.GroupDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
