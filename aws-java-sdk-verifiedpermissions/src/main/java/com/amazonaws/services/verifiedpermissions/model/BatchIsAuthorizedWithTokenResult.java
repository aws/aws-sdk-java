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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorizedWithToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchIsAuthorizedWithTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     */
    private EntityIdentifier principal;
    /**
     * <p>
     * A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that produced
     * them.
     * </p>
     */
    private java.util.List<BatchIsAuthorizedWithTokenOutputItem> results;

    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     * 
     * @param principal
     *        The identifier of the principal in the ID or access token.
     */

    public void setPrincipal(EntityIdentifier principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     * 
     * @return The identifier of the principal in the ID or access token.
     */

    public EntityIdentifier getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     * 
     * @param principal
     *        The identifier of the principal in the ID or access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedWithTokenResult withPrincipal(EntityIdentifier principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that produced
     * them.
     * </p>
     * 
     * @return A series of <code>Allow</code> or <code>Deny</code> decisions for each request, and the policies that
     *         produced them.
     */

    public java.util.List<BatchIsAuthorizedWithTokenOutputItem> getResults() {
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

    public void setResults(java.util.Collection<BatchIsAuthorizedWithTokenOutputItem> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<BatchIsAuthorizedWithTokenOutputItem>(results);
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

    public BatchIsAuthorizedWithTokenResult withResults(BatchIsAuthorizedWithTokenOutputItem... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<BatchIsAuthorizedWithTokenOutputItem>(results.length));
        }
        for (BatchIsAuthorizedWithTokenOutputItem ele : results) {
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

    public BatchIsAuthorizedWithTokenResult withResults(java.util.Collection<BatchIsAuthorizedWithTokenOutputItem> results) {
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
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

        if (obj instanceof BatchIsAuthorizedWithTokenResult == false)
            return false;
        BatchIsAuthorizedWithTokenResult other = (BatchIsAuthorizedWithTokenResult) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public BatchIsAuthorizedWithTokenResult clone() {
        try {
            return (BatchIsAuthorizedWithTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
