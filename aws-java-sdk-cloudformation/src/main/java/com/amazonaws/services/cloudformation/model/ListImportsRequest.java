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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListImports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value.
     * </p>
     */
    private String exportName;
    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that identifies the next page of stacks that are
     * importing the specified exported output value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value.
     * </p>
     * 
     * @param exportName
     *        The name of the exported output value. AWS CloudFormation returns the stack names that are importing this
     *        value.
     */

    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value.
     * </p>
     * 
     * @return The name of the exported output value. AWS CloudFormation returns the stack names that are importing this
     *         value.
     */

    public String getExportName() {
        return this.exportName;
    }

    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value.
     * </p>
     * 
     * @param exportName
     *        The name of the exported output value. AWS CloudFormation returns the stack names that are importing this
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withExportName(String exportName) {
        setExportName(exportName);
        return this;
    }

    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that identifies the next page of stacks that are
     * importing the specified exported output value.
     * </p>
     * 
     * @param nextToken
     *        A string (provided by the <a>ListImports</a> response output) that identifies the next page of stacks that
     *        are importing the specified exported output value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that identifies the next page of stacks that are
     * importing the specified exported output value.
     * </p>
     * 
     * @return A string (provided by the <a>ListImports</a> response output) that identifies the next page of stacks
     *         that are importing the specified exported output value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that identifies the next page of stacks that are
     * importing the specified exported output value.
     * </p>
     * 
     * @param nextToken
     *        A string (provided by the <a>ListImports</a> response output) that identifies the next page of stacks that
     *        are importing the specified exported output value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withNextToken(String nextToken) {
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
        if (getExportName() != null)
            sb.append("ExportName: ").append(getExportName()).append(",");
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

        if (obj instanceof ListImportsRequest == false)
            return false;
        ListImportsRequest other = (ListImportsRequest) obj;
        if (other.getExportName() == null ^ this.getExportName() == null)
            return false;
        if (other.getExportName() != null && other.getExportName().equals(this.getExportName()) == false)
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

        hashCode = prime * hashCode + ((getExportName() == null) ? 0 : getExportName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportsRequest clone() {
        return (ListImportsRequest) super.clone();
    }

}
