/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Filter for pipeline executions that have successfully completed the stage in the current pipeline version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/SucceededInStageFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SucceededInStageFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the stage for filtering for pipeline executions where the stage was successful in the current
     * pipeline version.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The name of the stage for filtering for pipeline executions where the stage was successful in the current
     * pipeline version.
     * </p>
     * 
     * @param stageName
     *        The name of the stage for filtering for pipeline executions where the stage was successful in the current
     *        pipeline version.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage for filtering for pipeline executions where the stage was successful in the current
     * pipeline version.
     * </p>
     * 
     * @return The name of the stage for filtering for pipeline executions where the stage was successful in the current
     *         pipeline version.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage for filtering for pipeline executions where the stage was successful in the current
     * pipeline version.
     * </p>
     * 
     * @param stageName
     *        The name of the stage for filtering for pipeline executions where the stage was successful in the current
     *        pipeline version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SucceededInStageFilter withStageName(String stageName) {
        setStageName(stageName);
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
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SucceededInStageFilter == false)
            return false;
        SucceededInStageFilter other = (SucceededInStageFilter) obj;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public SucceededInStageFilter clone() {
        try {
            return (SucceededInStageFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.SucceededInStageFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
