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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** <p/> */
    private java.util.List<ExportInfo> exportsInfo;
    /**
     * <p>
     * The token from the previous call to describe-export-tasks.
     * </p>
     */
    private String nextToken;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ExportInfo> getExportsInfo() {
        return exportsInfo;
    }

    /**
     * <p/>
     * 
     * @param exportsInfo
     */

    public void setExportsInfo(java.util.Collection<ExportInfo> exportsInfo) {
        if (exportsInfo == null) {
            this.exportsInfo = null;
            return;
        }

        this.exportsInfo = new java.util.ArrayList<ExportInfo>(exportsInfo);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportsInfo(java.util.Collection)} or {@link #withExportsInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportsInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportConfigurationsResult withExportsInfo(ExportInfo... exportsInfo) {
        if (this.exportsInfo == null) {
            setExportsInfo(new java.util.ArrayList<ExportInfo>(exportsInfo.length));
        }
        for (ExportInfo ele : exportsInfo) {
            this.exportsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param exportsInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportConfigurationsResult withExportsInfo(java.util.Collection<ExportInfo> exportsInfo) {
        setExportsInfo(exportsInfo);
        return this;
    }

    /**
     * <p>
     * The token from the previous call to describe-export-tasks.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous call to describe-export-tasks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from the previous call to describe-export-tasks.
     * </p>
     * 
     * @return The token from the previous call to describe-export-tasks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from the previous call to describe-export-tasks.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous call to describe-export-tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportConfigurationsResult withNextToken(String nextToken) {
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
        if (getExportsInfo() != null)
            sb.append("ExportsInfo: ").append(getExportsInfo()).append(",");
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

        if (obj instanceof DescribeExportConfigurationsResult == false)
            return false;
        DescribeExportConfigurationsResult other = (DescribeExportConfigurationsResult) obj;
        if (other.getExportsInfo() == null ^ this.getExportsInfo() == null)
            return false;
        if (other.getExportsInfo() != null && other.getExportsInfo().equals(this.getExportsInfo()) == false)
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

        hashCode = prime * hashCode + ((getExportsInfo() == null) ? 0 : getExportsInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportConfigurationsResult clone() {
        try {
            return (DescribeExportConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
