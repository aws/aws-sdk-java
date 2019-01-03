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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of supported product configurations which allow user-supplied arguments. EMR accepts these arguments and
 * forwards them to the corresponding installation script as bootstrap action arguments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SupportedProductConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedProductConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the product configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> args;

    /**
     * <p>
     * The name of the product configuration.
     * </p>
     * 
     * @param name
     *        The name of the product configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the product configuration.
     * </p>
     * 
     * @return The name of the product configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the product configuration.
     * </p>
     * 
     * @param name
     *        The name of the product configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedProductConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     * 
     * @return The list of user-supplied arguments.
     */

    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return args;
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     * 
     * @param args
     *        The list of user-supplied arguments.
     */

    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new com.amazonaws.internal.SdkInternalList<String>(args);
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        The list of user-supplied arguments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedProductConfig withArgs(String... args) {
        if (this.args == null) {
            setArgs(new com.amazonaws.internal.SdkInternalList<String>(args.length));
        }
        for (String ele : args) {
            this.args.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     * 
     * @param args
     *        The list of user-supplied arguments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedProductConfig withArgs(java.util.Collection<String> args) {
        setArgs(args);
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
        if (getArgs() != null)
            sb.append("Args: ").append(getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedProductConfig == false)
            return false;
        SupportedProductConfig other = (SupportedProductConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public SupportedProductConfig clone() {
        try {
            return (SupportedProductConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.SupportedProductConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
