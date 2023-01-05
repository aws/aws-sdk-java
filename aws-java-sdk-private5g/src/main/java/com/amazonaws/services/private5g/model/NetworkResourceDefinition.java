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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a network resource definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/NetworkResourceDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkResourceDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The count in the network resource definition.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The options in the network resource definition.
     * </p>
     */
    private java.util.List<NameValuePair> options;
    /**
     * <p>
     * The type in the network resource definition.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The count in the network resource definition.
     * </p>
     * 
     * @param count
     *        The count in the network resource definition.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The count in the network resource definition.
     * </p>
     * 
     * @return The count in the network resource definition.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The count in the network resource definition.
     * </p>
     * 
     * @param count
     *        The count in the network resource definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceDefinition withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The options in the network resource definition.
     * </p>
     * 
     * @return The options in the network resource definition.
     */

    public java.util.List<NameValuePair> getOptions() {
        return options;
    }

    /**
     * <p>
     * The options in the network resource definition.
     * </p>
     * 
     * @param options
     *        The options in the network resource definition.
     */

    public void setOptions(java.util.Collection<NameValuePair> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<NameValuePair>(options);
    }

    /**
     * <p>
     * The options in the network resource definition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        The options in the network resource definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceDefinition withOptions(NameValuePair... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<NameValuePair>(options.length));
        }
        for (NameValuePair ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The options in the network resource definition.
     * </p>
     * 
     * @param options
     *        The options in the network resource definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceDefinition withOptions(java.util.Collection<NameValuePair> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The type in the network resource definition.
     * </p>
     * 
     * @param type
     *        The type in the network resource definition.
     * @see NetworkResourceDefinitionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type in the network resource definition.
     * </p>
     * 
     * @return The type in the network resource definition.
     * @see NetworkResourceDefinitionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type in the network resource definition.
     * </p>
     * 
     * @param type
     *        The type in the network resource definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceDefinitionType
     */

    public NetworkResourceDefinition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type in the network resource definition.
     * </p>
     * 
     * @param type
     *        The type in the network resource definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceDefinitionType
     */

    public NetworkResourceDefinition withType(NetworkResourceDefinitionType type) {
        this.type = type.toString();
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkResourceDefinition == false)
            return false;
        NetworkResourceDefinition other = (NetworkResourceDefinition) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NetworkResourceDefinition clone() {
        try {
            return (NetworkResourceDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.NetworkResourceDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
