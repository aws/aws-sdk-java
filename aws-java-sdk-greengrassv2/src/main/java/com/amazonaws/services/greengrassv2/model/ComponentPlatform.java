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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a platform that a component supports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentPlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentPlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The friendly name of the platform. This name helps you identify the platform.
     * </p>
     * <p>
     * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the <code>os</code> and
     * <code>architecture</code> of the platform.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A dictionary of attributes for the platform. The AWS IoT Greengrass Core software defines the <code>os</code> and
     * <code>platform</code> by default. You can specify additional platform attributes for a core device when you
     * deploy the AWS IoT Greengrass nucleus component. For more information, see the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The friendly name of the platform. This name helps you identify the platform.
     * </p>
     * <p>
     * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the <code>os</code> and
     * <code>architecture</code> of the platform.
     * </p>
     * 
     * @param name
     *        The friendly name of the platform. This name helps you identify the platform.</p>
     *        <p>
     *        If you omit this parameter, AWS IoT Greengrass creates a friendly name from the <code>os</code> and
     *        <code>architecture</code> of the platform.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the platform. This name helps you identify the platform.
     * </p>
     * <p>
     * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the <code>os</code> and
     * <code>architecture</code> of the platform.
     * </p>
     * 
     * @return The friendly name of the platform. This name helps you identify the platform.</p>
     *         <p>
     *         If you omit this parameter, AWS IoT Greengrass creates a friendly name from the <code>os</code> and
     *         <code>architecture</code> of the platform.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the platform. This name helps you identify the platform.
     * </p>
     * <p>
     * If you omit this parameter, AWS IoT Greengrass creates a friendly name from the <code>os</code> and
     * <code>architecture</code> of the platform.
     * </p>
     * 
     * @param name
     *        The friendly name of the platform. This name helps you identify the platform.</p>
     *        <p>
     *        If you omit this parameter, AWS IoT Greengrass creates a friendly name from the <code>os</code> and
     *        <code>architecture</code> of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPlatform withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A dictionary of attributes for the platform. The AWS IoT Greengrass Core software defines the <code>os</code> and
     * <code>platform</code> by default. You can specify additional platform attributes for a core device when you
     * deploy the AWS IoT Greengrass nucleus component. For more information, see the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return A dictionary of attributes for the platform. The AWS IoT Greengrass Core software defines the
     *         <code>os</code> and <code>platform</code> by default. You can specify additional platform attributes for
     *         a core device when you deploy the AWS IoT Greengrass nucleus component. For more information, see the <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     *         Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A dictionary of attributes for the platform. The AWS IoT Greengrass Core software defines the <code>os</code> and
     * <code>platform</code> by default. You can specify additional platform attributes for a core device when you
     * deploy the AWS IoT Greengrass nucleus component. For more information, see the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param attributes
     *        A dictionary of attributes for the platform. The AWS IoT Greengrass Core software defines the
     *        <code>os</code> and <code>platform</code> by default. You can specify additional platform attributes for a
     *        core device when you deploy the AWS IoT Greengrass nucleus component. For more information, see the <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     *        Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A dictionary of attributes for the platform. The AWS IoT Greengrass Core software defines the <code>os</code> and
     * <code>platform</code> by default. You can specify additional platform attributes for a core device when you
     * deploy the AWS IoT Greengrass nucleus component. For more information, see the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param attributes
     *        A dictionary of attributes for the platform. The AWS IoT Greengrass Core software defines the
     *        <code>os</code> and <code>platform</code> by default. You can specify additional platform attributes for a
     *        core device when you deploy the AWS IoT Greengrass nucleus component. For more information, see the <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     *        Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPlatform withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see ComponentPlatform#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPlatform addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentPlatform clearAttributesEntries() {
        this.attributes = null;
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentPlatform == false)
            return false;
        ComponentPlatform other = (ComponentPlatform) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ComponentPlatform clone() {
        try {
            return (ComponentPlatform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ComponentPlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
