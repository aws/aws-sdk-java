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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about the details of an artifact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ArtifactDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of artifacts allowed for the action type.
     * </p>
     */
    private Integer minimumCount;
    /**
     * <p>
     * The maximum number of artifacts allowed for the action type.
     * </p>
     */
    private Integer maximumCount;

    /**
     * <p>
     * The minimum number of artifacts allowed for the action type.
     * </p>
     * 
     * @param minimumCount
     *        The minimum number of artifacts allowed for the action type.
     */

    public void setMinimumCount(Integer minimumCount) {
        this.minimumCount = minimumCount;
    }

    /**
     * <p>
     * The minimum number of artifacts allowed for the action type.
     * </p>
     * 
     * @return The minimum number of artifacts allowed for the action type.
     */

    public Integer getMinimumCount() {
        return this.minimumCount;
    }

    /**
     * <p>
     * The minimum number of artifacts allowed for the action type.
     * </p>
     * 
     * @param minimumCount
     *        The minimum number of artifacts allowed for the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactDetails withMinimumCount(Integer minimumCount) {
        setMinimumCount(minimumCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of artifacts allowed for the action type.
     * </p>
     * 
     * @param maximumCount
     *        The maximum number of artifacts allowed for the action type.
     */

    public void setMaximumCount(Integer maximumCount) {
        this.maximumCount = maximumCount;
    }

    /**
     * <p>
     * The maximum number of artifacts allowed for the action type.
     * </p>
     * 
     * @return The maximum number of artifacts allowed for the action type.
     */

    public Integer getMaximumCount() {
        return this.maximumCount;
    }

    /**
     * <p>
     * The maximum number of artifacts allowed for the action type.
     * </p>
     * 
     * @param maximumCount
     *        The maximum number of artifacts allowed for the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactDetails withMaximumCount(Integer maximumCount) {
        setMaximumCount(maximumCount);
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
        if (getMinimumCount() != null)
            sb.append("MinimumCount: ").append(getMinimumCount()).append(",");
        if (getMaximumCount() != null)
            sb.append("MaximumCount: ").append(getMaximumCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactDetails == false)
            return false;
        ArtifactDetails other = (ArtifactDetails) obj;
        if (other.getMinimumCount() == null ^ this.getMinimumCount() == null)
            return false;
        if (other.getMinimumCount() != null && other.getMinimumCount().equals(this.getMinimumCount()) == false)
            return false;
        if (other.getMaximumCount() == null ^ this.getMaximumCount() == null)
            return false;
        if (other.getMaximumCount() != null && other.getMaximumCount().equals(this.getMaximumCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumCount() == null) ? 0 : getMinimumCount().hashCode());
        hashCode = prime * hashCode + ((getMaximumCount() == null) ? 0 : getMaximumCount().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactDetails clone() {
        try {
            return (ArtifactDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ArtifactDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
