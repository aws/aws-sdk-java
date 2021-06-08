/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStorageLensConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * If the request produced more than the maximum number of S3 Storage Lens configuration results, you can pass this
     * value into a subsequent request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of S3 Storage Lens configurations.
     * </p>
     */
    private java.util.List<ListStorageLensConfigurationEntry> storageLensConfigurationList;

    /**
     * <p>
     * If the request produced more than the maximum number of S3 Storage Lens configuration results, you can pass this
     * value into a subsequent request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the request produced more than the maximum number of S3 Storage Lens configuration results, you can
     *        pass this value into a subsequent request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request produced more than the maximum number of S3 Storage Lens configuration results, you can pass this
     * value into a subsequent request to retrieve the next page of results.
     * </p>
     * 
     * @return If the request produced more than the maximum number of S3 Storage Lens configuration results, you can
     *         pass this value into a subsequent request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request produced more than the maximum number of S3 Storage Lens configuration results, you can pass this
     * value into a subsequent request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the request produced more than the maximum number of S3 Storage Lens configuration results, you can
     *        pass this value into a subsequent request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of S3 Storage Lens configurations.
     * </p>
     * 
     * @return A list of S3 Storage Lens configurations.
     */

    public java.util.List<ListStorageLensConfigurationEntry> getStorageLensConfigurationList() {
        return storageLensConfigurationList;
    }

    /**
     * <p>
     * A list of S3 Storage Lens configurations.
     * </p>
     * 
     * @param storageLensConfigurationList
     *        A list of S3 Storage Lens configurations.
     */

    public void setStorageLensConfigurationList(java.util.Collection<ListStorageLensConfigurationEntry> storageLensConfigurationList) {
        if (storageLensConfigurationList == null) {
            this.storageLensConfigurationList = null;
            return;
        }

        this.storageLensConfigurationList = new java.util.ArrayList<ListStorageLensConfigurationEntry>(storageLensConfigurationList);
    }

    /**
     * <p>
     * A list of S3 Storage Lens configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageLensConfigurationList(java.util.Collection)} or
     * {@link #withStorageLensConfigurationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageLensConfigurationList
     *        A list of S3 Storage Lens configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensConfigurationsResult withStorageLensConfigurationList(ListStorageLensConfigurationEntry... storageLensConfigurationList) {
        if (this.storageLensConfigurationList == null) {
            setStorageLensConfigurationList(new java.util.ArrayList<ListStorageLensConfigurationEntry>(storageLensConfigurationList.length));
        }
        for (ListStorageLensConfigurationEntry ele : storageLensConfigurationList) {
            this.storageLensConfigurationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of S3 Storage Lens configurations.
     * </p>
     * 
     * @param storageLensConfigurationList
     *        A list of S3 Storage Lens configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensConfigurationsResult withStorageLensConfigurationList(
            java.util.Collection<ListStorageLensConfigurationEntry> storageLensConfigurationList) {
        setStorageLensConfigurationList(storageLensConfigurationList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStorageLensConfigurationList() != null)
            sb.append("StorageLensConfigurationList: ").append(getStorageLensConfigurationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStorageLensConfigurationsResult == false)
            return false;
        ListStorageLensConfigurationsResult other = (ListStorageLensConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStorageLensConfigurationList() == null ^ this.getStorageLensConfigurationList() == null)
            return false;
        if (other.getStorageLensConfigurationList() != null && other.getStorageLensConfigurationList().equals(this.getStorageLensConfigurationList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStorageLensConfigurationList() == null) ? 0 : getStorageLensConfigurationList().hashCode());
        return hashCode;
    }

    @Override
    public ListStorageLensConfigurationsResult clone() {
        try {
            return (ListStorageLensConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
