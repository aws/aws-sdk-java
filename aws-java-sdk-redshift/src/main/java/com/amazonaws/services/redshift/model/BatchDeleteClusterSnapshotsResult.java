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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchDeleteClusterSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteClusterSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the snapshot identifiers that were deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resources;
    /**
     * <p>
     * A list of any errors returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SnapshotErrorMessage> errors;

    /**
     * <p>
     * A list of the snapshot identifiers that were deleted.
     * </p>
     * 
     * @return A list of the snapshot identifiers that were deleted.
     */

    public java.util.List<String> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resources;
    }

    /**
     * <p>
     * A list of the snapshot identifiers that were deleted.
     * </p>
     * 
     * @param resources
     *        A list of the snapshot identifiers that were deleted.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<String>(resources);
    }

    /**
     * <p>
     * A list of the snapshot identifiers that were deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A list of the snapshot identifiers that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteClusterSnapshotsResult withResources(String... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the snapshot identifiers that were deleted.
     * </p>
     * 
     * @param resources
     *        A list of the snapshot identifiers that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteClusterSnapshotsResult withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     * 
     * @return A list of any errors returned.
     */

    public java.util.List<SnapshotErrorMessage> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<SnapshotErrorMessage>();
        }
        return errors;
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     * 
     * @param errors
     *        A list of any errors returned.
     */

    public void setErrors(java.util.Collection<SnapshotErrorMessage> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<SnapshotErrorMessage>(errors);
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of any errors returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteClusterSnapshotsResult withErrors(SnapshotErrorMessage... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<SnapshotErrorMessage>(errors.length));
        }
        for (SnapshotErrorMessage ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of any errors returned.
     * </p>
     * 
     * @param errors
     *        A list of any errors returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteClusterSnapshotsResult withErrors(java.util.Collection<SnapshotErrorMessage> errors) {
        setErrors(errors);
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteClusterSnapshotsResult == false)
            return false;
        BatchDeleteClusterSnapshotsResult other = (BatchDeleteClusterSnapshotsResult) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteClusterSnapshotsResult clone() {
        try {
            return (BatchDeleteClusterSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
