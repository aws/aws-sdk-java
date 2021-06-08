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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetBuildBatches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetBuildBatchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     * </p>
     */
    private java.util.List<BuildBatch> buildBatches;
    /**
     * <p>
     * An array that contains the identifiers of any batch builds that are not found.
     * </p>
     */
    private java.util.List<String> buildBatchesNotFound;

    /**
     * <p>
     * An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     * </p>
     * 
     * @return An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     */

    public java.util.List<BuildBatch> getBuildBatches() {
        return buildBatches;
    }

    /**
     * <p>
     * An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     * </p>
     * 
     * @param buildBatches
     *        An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     */

    public void setBuildBatches(java.util.Collection<BuildBatch> buildBatches) {
        if (buildBatches == null) {
            this.buildBatches = null;
            return;
        }

        this.buildBatches = new java.util.ArrayList<BuildBatch>(buildBatches);
    }

    /**
     * <p>
     * An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuildBatches(java.util.Collection)} or {@link #withBuildBatches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param buildBatches
     *        An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildBatchesResult withBuildBatches(BuildBatch... buildBatches) {
        if (this.buildBatches == null) {
            setBuildBatches(new java.util.ArrayList<BuildBatch>(buildBatches.length));
        }
        for (BuildBatch ele : buildBatches) {
            this.buildBatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     * </p>
     * 
     * @param buildBatches
     *        An array of <code>BuildBatch</code> objects that represent the retrieved batch builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildBatchesResult withBuildBatches(java.util.Collection<BuildBatch> buildBatches) {
        setBuildBatches(buildBatches);
        return this;
    }

    /**
     * <p>
     * An array that contains the identifiers of any batch builds that are not found.
     * </p>
     * 
     * @return An array that contains the identifiers of any batch builds that are not found.
     */

    public java.util.List<String> getBuildBatchesNotFound() {
        return buildBatchesNotFound;
    }

    /**
     * <p>
     * An array that contains the identifiers of any batch builds that are not found.
     * </p>
     * 
     * @param buildBatchesNotFound
     *        An array that contains the identifiers of any batch builds that are not found.
     */

    public void setBuildBatchesNotFound(java.util.Collection<String> buildBatchesNotFound) {
        if (buildBatchesNotFound == null) {
            this.buildBatchesNotFound = null;
            return;
        }

        this.buildBatchesNotFound = new java.util.ArrayList<String>(buildBatchesNotFound);
    }

    /**
     * <p>
     * An array that contains the identifiers of any batch builds that are not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuildBatchesNotFound(java.util.Collection)} or {@link #withBuildBatchesNotFound(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param buildBatchesNotFound
     *        An array that contains the identifiers of any batch builds that are not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildBatchesResult withBuildBatchesNotFound(String... buildBatchesNotFound) {
        if (this.buildBatchesNotFound == null) {
            setBuildBatchesNotFound(new java.util.ArrayList<String>(buildBatchesNotFound.length));
        }
        for (String ele : buildBatchesNotFound) {
            this.buildBatchesNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the identifiers of any batch builds that are not found.
     * </p>
     * 
     * @param buildBatchesNotFound
     *        An array that contains the identifiers of any batch builds that are not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildBatchesResult withBuildBatchesNotFound(java.util.Collection<String> buildBatchesNotFound) {
        setBuildBatchesNotFound(buildBatchesNotFound);
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
        if (getBuildBatches() != null)
            sb.append("BuildBatches: ").append(getBuildBatches()).append(",");
        if (getBuildBatchesNotFound() != null)
            sb.append("BuildBatchesNotFound: ").append(getBuildBatchesNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetBuildBatchesResult == false)
            return false;
        BatchGetBuildBatchesResult other = (BatchGetBuildBatchesResult) obj;
        if (other.getBuildBatches() == null ^ this.getBuildBatches() == null)
            return false;
        if (other.getBuildBatches() != null && other.getBuildBatches().equals(this.getBuildBatches()) == false)
            return false;
        if (other.getBuildBatchesNotFound() == null ^ this.getBuildBatchesNotFound() == null)
            return false;
        if (other.getBuildBatchesNotFound() != null && other.getBuildBatchesNotFound().equals(this.getBuildBatchesNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuildBatches() == null) ? 0 : getBuildBatches().hashCode());
        hashCode = prime * hashCode + ((getBuildBatchesNotFound() == null) ? 0 : getBuildBatchesNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetBuildBatchesResult clone() {
        try {
            return (BatchGetBuildBatchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
