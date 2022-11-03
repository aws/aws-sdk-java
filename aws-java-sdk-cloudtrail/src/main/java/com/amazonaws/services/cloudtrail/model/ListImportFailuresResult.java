/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImportFailures" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportFailuresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about the import failures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImportFailureListItem> failures;
    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains information about the import failures.
     * </p>
     * 
     * @return Contains information about the import failures.
     */

    public java.util.List<ImportFailureListItem> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<ImportFailureListItem>();
        }
        return failures;
    }

    /**
     * <p>
     * Contains information about the import failures.
     * </p>
     * 
     * @param failures
     *        Contains information about the import failures.
     */

    public void setFailures(java.util.Collection<ImportFailureListItem> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<ImportFailureListItem>(failures);
    }

    /**
     * <p>
     * Contains information about the import failures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Contains information about the import failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFailuresResult withFailures(ImportFailureListItem... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<ImportFailureListItem>(failures.length));
        }
        for (ImportFailureListItem ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the import failures.
     * </p>
     * 
     * @param failures
     *        Contains information about the import failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFailuresResult withFailures(java.util.Collection<ImportFailureListItem> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @return A token you can use to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFailuresResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("Failures: ").append(getFailures()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImportFailuresResult == false)
            return false;
        ListImportFailuresResult other = (ListImportFailuresResult) obj;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportFailuresResult clone() {
        try {
            return (ListImportFailuresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
