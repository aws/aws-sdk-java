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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details on a container instance bind mount host volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskVolumeHostDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskVolumeHostDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a <code>sourcePath</code> to declare the path on the host
     * container instance that's presented to the container.
     * </p>
     */
    private String sourcePath;

    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a <code>sourcePath</code> to declare the path on the host
     * container instance that's presented to the container.
     * </p>
     * 
     * @param sourcePath
     *        When the <code>host</code> parameter is used, specify a <code>sourcePath</code> to declare the path on the
     *        host container instance that's presented to the container.
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a <code>sourcePath</code> to declare the path on the host
     * container instance that's presented to the container.
     * </p>
     * 
     * @return When the <code>host</code> parameter is used, specify a <code>sourcePath</code> to declare the path on
     *         the host container instance that's presented to the container.
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * <p>
     * When the <code>host</code> parameter is used, specify a <code>sourcePath</code> to declare the path on the host
     * container instance that's presented to the container.
     * </p>
     * 
     * @param sourcePath
     *        When the <code>host</code> parameter is used, specify a <code>sourcePath</code> to declare the path on the
     *        host container instance that's presented to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskVolumeHostDetails withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
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
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskVolumeHostDetails == false)
            return false;
        AwsEcsTaskVolumeHostDetails other = (AwsEcsTaskVolumeHostDetails) obj;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskVolumeHostDetails clone() {
        try {
            return (AwsEcsTaskVolumeHostDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskVolumeHostDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
