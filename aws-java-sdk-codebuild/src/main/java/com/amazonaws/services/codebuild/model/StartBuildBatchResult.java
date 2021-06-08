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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StartBuildBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBuildBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>BuildBatch</code> object that contains information about the batch build.
     * </p>
     */
    private BuildBatch buildBatch;

    /**
     * <p>
     * A <code>BuildBatch</code> object that contains information about the batch build.
     * </p>
     * 
     * @param buildBatch
     *        A <code>BuildBatch</code> object that contains information about the batch build.
     */

    public void setBuildBatch(BuildBatch buildBatch) {
        this.buildBatch = buildBatch;
    }

    /**
     * <p>
     * A <code>BuildBatch</code> object that contains information about the batch build.
     * </p>
     * 
     * @return A <code>BuildBatch</code> object that contains information about the batch build.
     */

    public BuildBatch getBuildBatch() {
        return this.buildBatch;
    }

    /**
     * <p>
     * A <code>BuildBatch</code> object that contains information about the batch build.
     * </p>
     * 
     * @param buildBatch
     *        A <code>BuildBatch</code> object that contains information about the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchResult withBuildBatch(BuildBatch buildBatch) {
        setBuildBatch(buildBatch);
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
        if (getBuildBatch() != null)
            sb.append("BuildBatch: ").append(getBuildBatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBuildBatchResult == false)
            return false;
        StartBuildBatchResult other = (StartBuildBatchResult) obj;
        if (other.getBuildBatch() == null ^ this.getBuildBatch() == null)
            return false;
        if (other.getBuildBatch() != null && other.getBuildBatch().equals(this.getBuildBatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuildBatch() == null) ? 0 : getBuildBatch().hashCode());
        return hashCode;
    }

    @Override
    public StartBuildBatchResult clone() {
        try {
            return (StartBuildBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
