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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMappedResourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMappedResourceConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     */
    private java.util.List<MappedResourceConfigurationListItem> mappedResourceConfigurationList;
    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     * 
     * @return A structure that encapsulates, or contains, the media storage configuration properties.
     */

    public java.util.List<MappedResourceConfigurationListItem> getMappedResourceConfigurationList() {
        return mappedResourceConfigurationList;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     * 
     * @param mappedResourceConfigurationList
     *        A structure that encapsulates, or contains, the media storage configuration properties.
     */

    public void setMappedResourceConfigurationList(java.util.Collection<MappedResourceConfigurationListItem> mappedResourceConfigurationList) {
        if (mappedResourceConfigurationList == null) {
            this.mappedResourceConfigurationList = null;
            return;
        }

        this.mappedResourceConfigurationList = new java.util.ArrayList<MappedResourceConfigurationListItem>(mappedResourceConfigurationList);
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMappedResourceConfigurationList(java.util.Collection)} or
     * {@link #withMappedResourceConfigurationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param mappedResourceConfigurationList
     *        A structure that encapsulates, or contains, the media storage configuration properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMappedResourceConfigurationResult withMappedResourceConfigurationList(MappedResourceConfigurationListItem... mappedResourceConfigurationList) {
        if (this.mappedResourceConfigurationList == null) {
            setMappedResourceConfigurationList(new java.util.ArrayList<MappedResourceConfigurationListItem>(mappedResourceConfigurationList.length));
        }
        for (MappedResourceConfigurationListItem ele : mappedResourceConfigurationList) {
            this.mappedResourceConfigurationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     * 
     * @param mappedResourceConfigurationList
     *        A structure that encapsulates, or contains, the media storage configuration properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMappedResourceConfigurationResult withMappedResourceConfigurationList(
            java.util.Collection<MappedResourceConfigurationListItem> mappedResourceConfigurationList) {
        setMappedResourceConfigurationList(mappedResourceConfigurationList);
        return this;
    }

    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token that was used in the <code>NextToken</code>request to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the next set of results.
     * </p>
     * 
     * @return The token that was used in the <code>NextToken</code>request to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token that was used in the <code>NextToken</code>request to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMappedResourceConfigurationResult withNextToken(String nextToken) {
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
        if (getMappedResourceConfigurationList() != null)
            sb.append("MappedResourceConfigurationList: ").append(getMappedResourceConfigurationList()).append(",");
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

        if (obj instanceof DescribeMappedResourceConfigurationResult == false)
            return false;
        DescribeMappedResourceConfigurationResult other = (DescribeMappedResourceConfigurationResult) obj;
        if (other.getMappedResourceConfigurationList() == null ^ this.getMappedResourceConfigurationList() == null)
            return false;
        if (other.getMappedResourceConfigurationList() != null
                && other.getMappedResourceConfigurationList().equals(this.getMappedResourceConfigurationList()) == false)
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

        hashCode = prime * hashCode + ((getMappedResourceConfigurationList() == null) ? 0 : getMappedResourceConfigurationList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMappedResourceConfigurationResult clone() {
        try {
            return (DescribeMappedResourceConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
