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
public class DescribeContinuousExportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of continuous export descriptions.
     * </p>
     */
    private java.util.List<ContinuousExportDescription> descriptions;
    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of continuous export descriptions.
     * </p>
     * 
     * @return A list of continuous export descriptions.
     */

    public java.util.List<ContinuousExportDescription> getDescriptions() {
        return descriptions;
    }

    /**
     * <p>
     * A list of continuous export descriptions.
     * </p>
     * 
     * @param descriptions
     *        A list of continuous export descriptions.
     */

    public void setDescriptions(java.util.Collection<ContinuousExportDescription> descriptions) {
        if (descriptions == null) {
            this.descriptions = null;
            return;
        }

        this.descriptions = new java.util.ArrayList<ContinuousExportDescription>(descriptions);
    }

    /**
     * <p>
     * A list of continuous export descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDescriptions(java.util.Collection)} or {@link #withDescriptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param descriptions
     *        A list of continuous export descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousExportsResult withDescriptions(ContinuousExportDescription... descriptions) {
        if (this.descriptions == null) {
            setDescriptions(new java.util.ArrayList<ContinuousExportDescription>(descriptions.length));
        }
        for (ContinuousExportDescription ele : descriptions) {
            this.descriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of continuous export descriptions.
     * </p>
     * 
     * @param descriptions
     *        A list of continuous export descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousExportsResult withDescriptions(java.util.Collection<ContinuousExportDescription> descriptions) {
        setDescriptions(descriptions);
        return this;
    }

    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous call to <code>DescribeExportTasks</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @return The token from the previous call to <code>DescribeExportTasks</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from the previous call to <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous call to <code>DescribeExportTasks</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContinuousExportsResult withNextToken(String nextToken) {
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
        if (getDescriptions() != null)
            sb.append("Descriptions: ").append(getDescriptions()).append(",");
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

        if (obj instanceof DescribeContinuousExportsResult == false)
            return false;
        DescribeContinuousExportsResult other = (DescribeContinuousExportsResult) obj;
        if (other.getDescriptions() == null ^ this.getDescriptions() == null)
            return false;
        if (other.getDescriptions() != null && other.getDescriptions().equals(this.getDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getDescriptions() == null) ? 0 : getDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContinuousExportsResult clone() {
        try {
            return (DescribeContinuousExportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
