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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeRefreshSchemasStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRefreshSchemasStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the schema.
     * </p>
     */
    private RefreshSchemasStatus refreshSchemasStatus;

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param refreshSchemasStatus
     *        The status of the schema.
     */

    public void setRefreshSchemasStatus(RefreshSchemasStatus refreshSchemasStatus) {
        this.refreshSchemasStatus = refreshSchemasStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @return The status of the schema.
     */

    public RefreshSchemasStatus getRefreshSchemasStatus() {
        return this.refreshSchemasStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param refreshSchemasStatus
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRefreshSchemasStatusResult withRefreshSchemasStatus(RefreshSchemasStatus refreshSchemasStatus) {
        setRefreshSchemasStatus(refreshSchemasStatus);
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
        if (getRefreshSchemasStatus() != null)
            sb.append("RefreshSchemasStatus: ").append(getRefreshSchemasStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRefreshSchemasStatusResult == false)
            return false;
        DescribeRefreshSchemasStatusResult other = (DescribeRefreshSchemasStatusResult) obj;
        if (other.getRefreshSchemasStatus() == null ^ this.getRefreshSchemasStatus() == null)
            return false;
        if (other.getRefreshSchemasStatus() != null && other.getRefreshSchemasStatus().equals(this.getRefreshSchemasStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRefreshSchemasStatus() == null) ? 0 : getRefreshSchemasStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRefreshSchemasStatusResult clone() {
        try {
            return (DescribeRefreshSchemasStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
