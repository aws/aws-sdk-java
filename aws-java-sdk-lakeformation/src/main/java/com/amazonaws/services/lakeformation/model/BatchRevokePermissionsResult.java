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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchRevokePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of failures to revoke permissions to the resources.
     * </p>
     */
    private java.util.List<BatchPermissionsFailureEntry> failures;

    /**
     * <p>
     * A list of failures to revoke permissions to the resources.
     * </p>
     * 
     * @return A list of failures to revoke permissions to the resources.
     */

    public java.util.List<BatchPermissionsFailureEntry> getFailures() {
        return failures;
    }

    /**
     * <p>
     * A list of failures to revoke permissions to the resources.
     * </p>
     * 
     * @param failures
     *        A list of failures to revoke permissions to the resources.
     */

    public void setFailures(java.util.Collection<BatchPermissionsFailureEntry> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<BatchPermissionsFailureEntry>(failures);
    }

    /**
     * <p>
     * A list of failures to revoke permissions to the resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        A list of failures to revoke permissions to the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRevokePermissionsResult withFailures(BatchPermissionsFailureEntry... failures) {
        if (this.failures == null) {
            setFailures(new java.util.ArrayList<BatchPermissionsFailureEntry>(failures.length));
        }
        for (BatchPermissionsFailureEntry ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of failures to revoke permissions to the resources.
     * </p>
     * 
     * @param failures
     *        A list of failures to revoke permissions to the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRevokePermissionsResult withFailures(java.util.Collection<BatchPermissionsFailureEntry> failures) {
        setFailures(failures);
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
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchRevokePermissionsResult == false)
            return false;
        BatchRevokePermissionsResult other = (BatchRevokePermissionsResult) obj;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public BatchRevokePermissionsResult clone() {
        try {
            return (BatchRevokePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
