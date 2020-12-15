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
 * Contains information about a deployment's update to a component's configuration on Greengrass core devices. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html">Update component
 * configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A serialized JSON string that contains the configuration object to merge to target devices. The core device
     * merges this configuration with the component's existing configuration. If this is the first time a component
     * deploys on a device, the core device merges this configuration with the component's default configuration. This
     * means that the core device keeps it's existing configuration for keys and values that you don't specify in this
     * object. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update"
     * >Merge configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private String merge;
    /**
     * <p>
     * The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify each
     * node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to separate the
     * key for each level in the object. For more information, see the <a
     * href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     * >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> reset;

    /**
     * <p>
     * A serialized JSON string that contains the configuration object to merge to target devices. The core device
     * merges this configuration with the component's existing configuration. If this is the first time a component
     * deploys on a device, the core device merges this configuration with the component's default configuration. This
     * means that the core device keeps it's existing configuration for keys and values that you don't specify in this
     * object. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update"
     * >Merge configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param merge
     *        A serialized JSON string that contains the configuration object to merge to target devices. The core
     *        device merges this configuration with the component's existing configuration. If this is the first time a
     *        component deploys on a device, the core device merges this configuration with the component's default
     *        configuration. This means that the core device keeps it's existing configuration for keys and values that
     *        you don't specify in this object. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update"
     *        >Merge configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public void setMerge(String merge) {
        this.merge = merge;
    }

    /**
     * <p>
     * A serialized JSON string that contains the configuration object to merge to target devices. The core device
     * merges this configuration with the component's existing configuration. If this is the first time a component
     * deploys on a device, the core device merges this configuration with the component's default configuration. This
     * means that the core device keeps it's existing configuration for keys and values that you don't specify in this
     * object. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update"
     * >Merge configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return A serialized JSON string that contains the configuration object to merge to target devices. The core
     *         device merges this configuration with the component's existing configuration. If this is the first time a
     *         component deploys on a device, the core device merges this configuration with the component's default
     *         configuration. This means that the core device keeps it's existing configuration for keys and values that
     *         you don't specify in this object. For more information, see <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update"
     *         >Merge configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public String getMerge() {
        return this.merge;
    }

    /**
     * <p>
     * A serialized JSON string that contains the configuration object to merge to target devices. The core device
     * merges this configuration with the component's existing configuration. If this is the first time a component
     * deploys on a device, the core device merges this configuration with the component's default configuration. This
     * means that the core device keeps it's existing configuration for keys and values that you don't specify in this
     * object. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update"
     * >Merge configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param merge
     *        A serialized JSON string that contains the configuration object to merge to target devices. The core
     *        device merges this configuration with the component's existing configuration. If this is the first time a
     *        component deploys on a device, the core device merges this configuration with the component's default
     *        configuration. This means that the core device keeps it's existing configuration for keys and values that
     *        you don't specify in this object. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update"
     *        >Merge configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConfigurationUpdate withMerge(String merge) {
        setMerge(merge);
        return this;
    }

    /**
     * <p>
     * The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify each
     * node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to separate the
     * key for each level in the object. For more information, see the <a
     * href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     * >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return The list of configuration nodes to reset to default values on target devices. Use JSON pointers to
     *         specify each node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward
     *         slashes to separate the key for each level in the object. For more information, see the <a
     *         href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     *         >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public java.util.List<String> getReset() {
        return reset;
    }

    /**
     * <p>
     * The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify each
     * node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to separate the
     * key for each level in the object. For more information, see the <a
     * href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     * >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param reset
     *        The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify
     *        each node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to
     *        separate the key for each level in the object. For more information, see the <a
     *        href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     *        >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public void setReset(java.util.Collection<String> reset) {
        if (reset == null) {
            this.reset = null;
            return;
        }

        this.reset = new java.util.ArrayList<String>(reset);
    }

    /**
     * <p>
     * The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify each
     * node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to separate the
     * key for each level in the object. For more information, see the <a
     * href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     * >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReset(java.util.Collection)} or {@link #withReset(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param reset
     *        The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify
     *        each node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to
     *        separate the key for each level in the object. For more information, see the <a
     *        href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     *        >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConfigurationUpdate withReset(String... reset) {
        if (this.reset == null) {
            setReset(new java.util.ArrayList<String>(reset.length));
        }
        for (String ele : reset) {
            this.reset.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify each
     * node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to separate the
     * key for each level in the object. For more information, see the <a
     * href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     * >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param reset
     *        The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify
     *        each node to reset. JSON pointers start with a forward slash (<code>/</code>) and use forward slashes to
     *        separate the key for each level in the object. For more information, see the <a
     *        href="https://tools.ietf.org/html/rfc6901">JSON pointer specification</a> and <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update"
     *        >Reset configuration updates</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConfigurationUpdate withReset(java.util.Collection<String> reset) {
        setReset(reset);
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
        if (getMerge() != null)
            sb.append("Merge: ").append(getMerge()).append(",");
        if (getReset() != null)
            sb.append("Reset: ").append(getReset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentConfigurationUpdate == false)
            return false;
        ComponentConfigurationUpdate other = (ComponentConfigurationUpdate) obj;
        if (other.getMerge() == null ^ this.getMerge() == null)
            return false;
        if (other.getMerge() != null && other.getMerge().equals(this.getMerge()) == false)
            return false;
        if (other.getReset() == null ^ this.getReset() == null)
            return false;
        if (other.getReset() != null && other.getReset().equals(this.getReset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMerge() == null) ? 0 : getMerge().hashCode());
        hashCode = prime * hashCode + ((getReset() == null) ? 0 : getReset().hashCode());
        return hashCode;
    }

    @Override
    public ComponentConfigurationUpdate clone() {
        try {
            return (ComponentConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ComponentConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
