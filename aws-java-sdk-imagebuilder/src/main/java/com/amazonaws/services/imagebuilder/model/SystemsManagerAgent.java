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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains settings for the Systems Manager agent on your build instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/SystemsManagerAgent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemsManagerAgent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Controls whether the Systems Manager agent is removed from your final build image, prior to creating the new AMI.
     * If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is
     * left in, so that it is included in the new AMI. The default value is false.
     * </p>
     */
    private Boolean uninstallAfterBuild;

    /**
     * <p>
     * Controls whether the Systems Manager agent is removed from your final build image, prior to creating the new AMI.
     * If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is
     * left in, so that it is included in the new AMI. The default value is false.
     * </p>
     * 
     * @param uninstallAfterBuild
     *        Controls whether the Systems Manager agent is removed from your final build image, prior to creating the
     *        new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false,
     *        then the agent is left in, so that it is included in the new AMI. The default value is false.
     */

    public void setUninstallAfterBuild(Boolean uninstallAfterBuild) {
        this.uninstallAfterBuild = uninstallAfterBuild;
    }

    /**
     * <p>
     * Controls whether the Systems Manager agent is removed from your final build image, prior to creating the new AMI.
     * If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is
     * left in, so that it is included in the new AMI. The default value is false.
     * </p>
     * 
     * @return Controls whether the Systems Manager agent is removed from your final build image, prior to creating the
     *         new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false,
     *         then the agent is left in, so that it is included in the new AMI. The default value is false.
     */

    public Boolean getUninstallAfterBuild() {
        return this.uninstallAfterBuild;
    }

    /**
     * <p>
     * Controls whether the Systems Manager agent is removed from your final build image, prior to creating the new AMI.
     * If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is
     * left in, so that it is included in the new AMI. The default value is false.
     * </p>
     * 
     * @param uninstallAfterBuild
     *        Controls whether the Systems Manager agent is removed from your final build image, prior to creating the
     *        new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false,
     *        then the agent is left in, so that it is included in the new AMI. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemsManagerAgent withUninstallAfterBuild(Boolean uninstallAfterBuild) {
        setUninstallAfterBuild(uninstallAfterBuild);
        return this;
    }

    /**
     * <p>
     * Controls whether the Systems Manager agent is removed from your final build image, prior to creating the new AMI.
     * If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is
     * left in, so that it is included in the new AMI. The default value is false.
     * </p>
     * 
     * @return Controls whether the Systems Manager agent is removed from your final build image, prior to creating the
     *         new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false,
     *         then the agent is left in, so that it is included in the new AMI. The default value is false.
     */

    public Boolean isUninstallAfterBuild() {
        return this.uninstallAfterBuild;
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
        if (getUninstallAfterBuild() != null)
            sb.append("UninstallAfterBuild: ").append(getUninstallAfterBuild());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemsManagerAgent == false)
            return false;
        SystemsManagerAgent other = (SystemsManagerAgent) obj;
        if (other.getUninstallAfterBuild() == null ^ this.getUninstallAfterBuild() == null)
            return false;
        if (other.getUninstallAfterBuild() != null && other.getUninstallAfterBuild().equals(this.getUninstallAfterBuild()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUninstallAfterBuild() == null) ? 0 : getUninstallAfterBuild().hashCode());
        return hashCode;
    }

    @Override
    public SystemsManagerAgent clone() {
        try {
            return (SystemsManagerAgent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.SystemsManagerAgentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
