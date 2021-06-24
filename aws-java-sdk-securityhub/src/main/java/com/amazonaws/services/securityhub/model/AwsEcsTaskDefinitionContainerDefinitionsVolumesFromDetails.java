/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A data volume to mount from another container.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the container has read-only access to the volume.
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     */
    private String sourceContainer;

    /**
     * <p>
     * Whether the container has read-only access to the volume.
     * </p>
     * 
     * @param readOnly
     *        Whether the container has read-only access to the volume.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * Whether the container has read-only access to the volume.
     * </p>
     * 
     * @return Whether the container has read-only access to the volume.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Whether the container has read-only access to the volume.
     * </p>
     * 
     * @param readOnly
     *        Whether the container has read-only access to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * Whether the container has read-only access to the volume.
     * </p>
     * 
     * @return Whether the container has read-only access to the volume.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     * 
     * @param sourceContainer
     *        The name of another container within the same task definition from which to mount volumes.
     */

    public void setSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
    }

    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     * 
     * @return The name of another container within the same task definition from which to mount volumes.
     */

    public String getSourceContainer() {
        return this.sourceContainer;
    }

    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     * 
     * @param sourceContainer
     *        The name of another container within the same task definition from which to mount volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails withSourceContainer(String sourceContainer) {
        setSourceContainer(sourceContainer);
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
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getSourceContainer() != null)
            sb.append("SourceContainer: ").append(getSourceContainer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails other = (AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails) obj;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getSourceContainer() == null ^ this.getSourceContainer() == null)
            return false;
        if (other.getSourceContainer() != null && other.getSourceContainer().equals(this.getSourceContainer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getSourceContainer() == null) ? 0 : getSourceContainer().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
