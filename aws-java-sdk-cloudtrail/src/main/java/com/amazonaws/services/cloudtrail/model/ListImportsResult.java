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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of returned imports.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImportsListItem> imports;
    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of returned imports.
     * </p>
     * 
     * @return The list of returned imports.
     */

    public java.util.List<ImportsListItem> getImports() {
        if (imports == null) {
            imports = new com.amazonaws.internal.SdkInternalList<ImportsListItem>();
        }
        return imports;
    }

    /**
     * <p>
     * The list of returned imports.
     * </p>
     * 
     * @param imports
     *        The list of returned imports.
     */

    public void setImports(java.util.Collection<ImportsListItem> imports) {
        if (imports == null) {
            this.imports = null;
            return;
        }

        this.imports = new com.amazonaws.internal.SdkInternalList<ImportsListItem>(imports);
    }

    /**
     * <p>
     * The list of returned imports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImports(java.util.Collection)} or {@link #withImports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imports
     *        The list of returned imports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withImports(ImportsListItem... imports) {
        if (this.imports == null) {
            setImports(new com.amazonaws.internal.SdkInternalList<ImportsListItem>(imports.length));
        }
        for (ImportsListItem ele : imports) {
            this.imports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of returned imports.
     * </p>
     * 
     * @param imports
     *        The list of returned imports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withImports(java.util.Collection<ImportsListItem> imports) {
        setImports(imports);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of import results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     * 
     * @return A token you can use to get the next page of import results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of import results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withNextToken(String nextToken) {
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
        if (getImports() != null)
            sb.append("Imports: ").append(getImports()).append(",");
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

        if (obj instanceof ListImportsResult == false)
            return false;
        ListImportsResult other = (ListImportsResult) obj;
        if (other.getImports() == null ^ this.getImports() == null)
            return false;
        if (other.getImports() != null && other.getImports().equals(this.getImports()) == false)
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

        hashCode = prime * hashCode + ((getImports() == null) ? 0 : getImports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportsResult clone() {
        try {
            return (ListImportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
