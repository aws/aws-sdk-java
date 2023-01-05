/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeUpdateDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUpdateDirectoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of update activities on a directory for the requested update type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UpdateInfoEntry> updateActivities;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of update activities on a directory for the requested update type.
     * </p>
     * 
     * @return The list of update activities on a directory for the requested update type.
     */

    public java.util.List<UpdateInfoEntry> getUpdateActivities() {
        if (updateActivities == null) {
            updateActivities = new com.amazonaws.internal.SdkInternalList<UpdateInfoEntry>();
        }
        return updateActivities;
    }

    /**
     * <p>
     * The list of update activities on a directory for the requested update type.
     * </p>
     * 
     * @param updateActivities
     *        The list of update activities on a directory for the requested update type.
     */

    public void setUpdateActivities(java.util.Collection<UpdateInfoEntry> updateActivities) {
        if (updateActivities == null) {
            this.updateActivities = null;
            return;
        }

        this.updateActivities = new com.amazonaws.internal.SdkInternalList<UpdateInfoEntry>(updateActivities);
    }

    /**
     * <p>
     * The list of update activities on a directory for the requested update type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateActivities(java.util.Collection)} or {@link #withUpdateActivities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param updateActivities
     *        The list of update activities on a directory for the requested update type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateDirectoryResult withUpdateActivities(UpdateInfoEntry... updateActivities) {
        if (this.updateActivities == null) {
            setUpdateActivities(new com.amazonaws.internal.SdkInternalList<UpdateInfoEntry>(updateActivities.length));
        }
        for (UpdateInfoEntry ele : updateActivities) {
            this.updateActivities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of update activities on a directory for the requested update type.
     * </p>
     * 
     * @param updateActivities
     *        The list of update activities on a directory for the requested update type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateDirectoryResult withUpdateActivities(java.util.Collection<UpdateInfoEntry> updateActivities) {
        setUpdateActivities(updateActivities);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <code>NextToken</code> parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateDirectoryResult withNextToken(String nextToken) {
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
        if (getUpdateActivities() != null)
            sb.append("UpdateActivities: ").append(getUpdateActivities()).append(",");
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

        if (obj instanceof DescribeUpdateDirectoryResult == false)
            return false;
        DescribeUpdateDirectoryResult other = (DescribeUpdateDirectoryResult) obj;
        if (other.getUpdateActivities() == null ^ this.getUpdateActivities() == null)
            return false;
        if (other.getUpdateActivities() != null && other.getUpdateActivities().equals(this.getUpdateActivities()) == false)
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

        hashCode = prime * hashCode + ((getUpdateActivities() == null) ? 0 : getUpdateActivities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUpdateDirectoryResult clone() {
        try {
            return (DescribeUpdateDirectoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
