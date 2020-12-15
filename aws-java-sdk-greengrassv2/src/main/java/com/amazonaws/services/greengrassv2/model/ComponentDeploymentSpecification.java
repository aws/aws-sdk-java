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
 * Contains information about a component to deploy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentDeploymentSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentDeploymentSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the component.
     * </p>
     */
    private String componentVersion;
    /**
     * <p>
     * The configuration updates to deploy for the component. You can define <i>reset</i> updates and <i>merge</i>
     * updates. A reset updates the keys that you specify to the default configuration for the component. A merge
     * updates the core device's component configuration with the keys and values that you specify. The AWS IoT
     * Greengrass Core software applies reset updates before it applies merge updates. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html">Update
     * component configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private ComponentConfigurationUpdate configurationUpdate;
    /**
     * <p>
     * The system user and group that the AWS IoT Greengrass Core software uses to run component processes on the core
     * device. If you omit this parameter, the AWS IoT Greengrass Core software uses the system user and group that you
     * configure for the core device. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private ComponentRunWith runWith;

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     */

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @return The version of the component.
     */

    public String getComponentVersion() {
        return this.componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDeploymentSpecification withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
        return this;
    }

    /**
     * <p>
     * The configuration updates to deploy for the component. You can define <i>reset</i> updates and <i>merge</i>
     * updates. A reset updates the keys that you specify to the default configuration for the component. A merge
     * updates the core device's component configuration with the keys and values that you specify. The AWS IoT
     * Greengrass Core software applies reset updates before it applies merge updates. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html">Update
     * component configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param configurationUpdate
     *        The configuration updates to deploy for the component. You can define <i>reset</i> updates and
     *        <i>merge</i> updates. A reset updates the keys that you specify to the default configuration for the
     *        component. A merge updates the core device's component configuration with the keys and values that you
     *        specify. The AWS IoT Greengrass Core software applies reset updates before it applies merge updates. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html"
     *        >Update component configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public void setConfigurationUpdate(ComponentConfigurationUpdate configurationUpdate) {
        this.configurationUpdate = configurationUpdate;
    }

    /**
     * <p>
     * The configuration updates to deploy for the component. You can define <i>reset</i> updates and <i>merge</i>
     * updates. A reset updates the keys that you specify to the default configuration for the component. A merge
     * updates the core device's component configuration with the keys and values that you specify. The AWS IoT
     * Greengrass Core software applies reset updates before it applies merge updates. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html">Update
     * component configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return The configuration updates to deploy for the component. You can define <i>reset</i> updates and
     *         <i>merge</i> updates. A reset updates the keys that you specify to the default configuration for the
     *         component. A merge updates the core device's component configuration with the keys and values that you
     *         specify. The AWS IoT Greengrass Core software applies reset updates before it applies merge updates. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html"
     *         >Update component configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public ComponentConfigurationUpdate getConfigurationUpdate() {
        return this.configurationUpdate;
    }

    /**
     * <p>
     * The configuration updates to deploy for the component. You can define <i>reset</i> updates and <i>merge</i>
     * updates. A reset updates the keys that you specify to the default configuration for the component. A merge
     * updates the core device's component configuration with the keys and values that you specify. The AWS IoT
     * Greengrass Core software applies reset updates before it applies merge updates. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html">Update
     * component configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param configurationUpdate
     *        The configuration updates to deploy for the component. You can define <i>reset</i> updates and
     *        <i>merge</i> updates. A reset updates the keys that you specify to the default configuration for the
     *        component. A merge updates the core device's component configuration with the keys and values that you
     *        specify. The AWS IoT Greengrass Core software applies reset updates before it applies merge updates. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html"
     *        >Update component configurations</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDeploymentSpecification withConfigurationUpdate(ComponentConfigurationUpdate configurationUpdate) {
        setConfigurationUpdate(configurationUpdate);
        return this;
    }

    /**
     * <p>
     * The system user and group that the AWS IoT Greengrass Core software uses to run component processes on the core
     * device. If you omit this parameter, the AWS IoT Greengrass Core software uses the system user and group that you
     * configure for the core device. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param runWith
     *        The system user and group that the AWS IoT Greengrass Core software uses to run component processes on the
     *        core device. If you omit this parameter, the AWS IoT Greengrass Core software uses the system user and
     *        group that you configure for the core device. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *        >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public void setRunWith(ComponentRunWith runWith) {
        this.runWith = runWith;
    }

    /**
     * <p>
     * The system user and group that the AWS IoT Greengrass Core software uses to run component processes on the core
     * device. If you omit this parameter, the AWS IoT Greengrass Core software uses the system user and group that you
     * configure for the core device. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return The system user and group that the AWS IoT Greengrass Core software uses to run component processes on
     *         the core device. If you omit this parameter, the AWS IoT Greengrass Core software uses the system user
     *         and group that you configure for the core device. For more information, see <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *         >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer
     *         Guide</i>.
     */

    public ComponentRunWith getRunWith() {
        return this.runWith;
    }

    /**
     * <p>
     * The system user and group that the AWS IoT Greengrass Core software uses to run component processes on the core
     * device. If you omit this parameter, the AWS IoT Greengrass Core software uses the system user and group that you
     * configure for the core device. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param runWith
     *        The system user and group that the AWS IoT Greengrass Core software uses to run component processes on the
     *        core device. If you omit this parameter, the AWS IoT Greengrass Core software uses the system user and
     *        group that you configure for the core device. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *        >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDeploymentSpecification withRunWith(ComponentRunWith runWith) {
        setRunWith(runWith);
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
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getConfigurationUpdate() != null)
            sb.append("ConfigurationUpdate: ").append(getConfigurationUpdate()).append(",");
        if (getRunWith() != null)
            sb.append("RunWith: ").append(getRunWith());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentDeploymentSpecification == false)
            return false;
        ComponentDeploymentSpecification other = (ComponentDeploymentSpecification) obj;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        if (other.getConfigurationUpdate() == null ^ this.getConfigurationUpdate() == null)
            return false;
        if (other.getConfigurationUpdate() != null && other.getConfigurationUpdate().equals(this.getConfigurationUpdate()) == false)
            return false;
        if (other.getRunWith() == null ^ this.getRunWith() == null)
            return false;
        if (other.getRunWith() != null && other.getRunWith().equals(this.getRunWith()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        hashCode = prime * hashCode + ((getConfigurationUpdate() == null) ? 0 : getConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getRunWith() == null) ? 0 : getRunWith().hashCode());
        return hashCode;
    }

    @Override
    public ComponentDeploymentSpecification clone() {
        try {
            return (ComponentDeploymentSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ComponentDeploymentSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
