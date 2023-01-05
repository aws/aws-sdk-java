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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the AWS IoT Greengrass component created by a model packaging job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/GreengrassOutputDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GreengrassOutputDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     */
    private String componentVersionArn;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The version of the component.
     * </p>
     */
    private String componentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param componentVersionArn
     *        The Amazon Resource Name (ARN) of the component.
     */

    public void setComponentVersionArn(String componentVersionArn) {
        this.componentVersionArn = componentVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component.
     */

    public String getComponentVersionArn() {
        return this.componentVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param componentVersionArn
     *        The Amazon Resource Name (ARN) of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassOutputDetails withComponentVersionArn(String componentVersionArn) {
        setComponentVersionArn(componentVersionArn);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassOutputDetails withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

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

    public GreengrassOutputDetails withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
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
        if (getComponentVersionArn() != null)
            sb.append("ComponentVersionArn: ").append(getComponentVersionArn()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GreengrassOutputDetails == false)
            return false;
        GreengrassOutputDetails other = (GreengrassOutputDetails) obj;
        if (other.getComponentVersionArn() == null ^ this.getComponentVersionArn() == null)
            return false;
        if (other.getComponentVersionArn() != null && other.getComponentVersionArn().equals(this.getComponentVersionArn()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentVersionArn() == null) ? 0 : getComponentVersionArn().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        return hashCode;
    }

    @Override
    public GreengrassOutputDetails clone() {
        try {
            return (GreengrassOutputDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.GreengrassOutputDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
