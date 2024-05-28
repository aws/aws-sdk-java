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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorized"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchIsAuthorizedResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that produced
     * them.
     * </p>
     */
    private java.util.List<BatchIsAuthorizedOutputItem> results;

    /**
     * <p>
     * A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that produced
     * them.
     * </p>
     * 
     * @return A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that
     *         produced them.
     */

    public java.util.List<BatchIsAuthorizedOutputItem> getResults() {
        return results;
    }

    /**
     * <p>
     * A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that produced
     * them.
     * </p>
     * 
     * @param results
     *        A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that
     *        produced them.
     */

    public void setResults(java.util.Collection<BatchIsAuthorizedOutputItem> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<BatchIsAuthorizedOutputItem>(results);
    }

    /**
     * <p>
     * A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that produced
     * them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that
     *        produced them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedResult withResults(BatchIsAuthorizedOutputItem... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<BatchIsAuthorizedOutputItem>(results.length));
        }
        for (BatchIsAuthorizedOutputItem ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that produced
     * them.
     * </p>
     * 
     * @param results
     *        A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that
     *        produced them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedResult withResults(java.util.Collection<BatchIsAuthorizedOutputItem> results) {
        setResults(results);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchIsAuthorizedResult == false)
            return false;
        BatchIsAuthorizedResult other = (BatchIsAuthorizedResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public BatchIsAuthorizedResult clone() {
        try {
            return (BatchIsAuthorizedResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
