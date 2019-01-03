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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListImports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of stack names that are importing the specified exported output value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> imports;
    /**
     * <p>
     * A string that identifies the next page of exports. If there is no additional page, this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of stack names that are importing the specified exported output value.
     * </p>
     * 
     * @return A list of stack names that are importing the specified exported output value.
     */

    public java.util.List<String> getImports() {
        if (imports == null) {
            imports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return imports;
    }

    /**
     * <p>
     * A list of stack names that are importing the specified exported output value.
     * </p>
     * 
     * @param imports
     *        A list of stack names that are importing the specified exported output value.
     */

    public void setImports(java.util.Collection<String> imports) {
        if (imports == null) {
            this.imports = null;
            return;
        }

        this.imports = new com.amazonaws.internal.SdkInternalList<String>(imports);
    }

    /**
     * <p>
     * A list of stack names that are importing the specified exported output value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImports(java.util.Collection)} or {@link #withImports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imports
     *        A list of stack names that are importing the specified exported output value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withImports(String... imports) {
        if (this.imports == null) {
            setImports(new com.amazonaws.internal.SdkInternalList<String>(imports.length));
        }
        for (String ele : imports) {
            this.imports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of stack names that are importing the specified exported output value.
     * </p>
     * 
     * @param imports
     *        A list of stack names that are importing the specified exported output value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withImports(java.util.Collection<String> imports) {
        setImports(imports);
        return this;
    }

    /**
     * <p>
     * A string that identifies the next page of exports. If there is no additional page, this value is null.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of exports. If there is no additional page, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of exports. If there is no additional page, this value is null.
     * </p>
     * 
     * @return A string that identifies the next page of exports. If there is no additional page, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of exports. If there is no additional page, this value is null.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of exports. If there is no additional page, this value is null.
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
