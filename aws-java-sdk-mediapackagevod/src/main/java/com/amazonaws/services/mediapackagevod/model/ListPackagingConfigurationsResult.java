/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackagingConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A token that can be used to resume pagination from the end of the collection. */
    private String nextToken;
    /** A list of MediaPackage VOD PackagingConfiguration resources. */
    private java.util.List<PackagingConfiguration> packagingConfigurations;

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @return A token that can be used to resume pagination from the end of the collection.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagingConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     * 
     * @return A list of MediaPackage VOD PackagingConfiguration resources.
     */

    public java.util.List<PackagingConfiguration> getPackagingConfigurations() {
        return packagingConfigurations;
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     * 
     * @param packagingConfigurations
     *        A list of MediaPackage VOD PackagingConfiguration resources.
     */

    public void setPackagingConfigurations(java.util.Collection<PackagingConfiguration> packagingConfigurations) {
        if (packagingConfigurations == null) {
            this.packagingConfigurations = null;
            return;
        }

        this.packagingConfigurations = new java.util.ArrayList<PackagingConfiguration>(packagingConfigurations);
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackagingConfigurations(java.util.Collection)} or
     * {@link #withPackagingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param packagingConfigurations
     *        A list of MediaPackage VOD PackagingConfiguration resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagingConfigurationsResult withPackagingConfigurations(PackagingConfiguration... packagingConfigurations) {
        if (this.packagingConfigurations == null) {
            setPackagingConfigurations(new java.util.ArrayList<PackagingConfiguration>(packagingConfigurations.length));
        }
        for (PackagingConfiguration ele : packagingConfigurations) {
            this.packagingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * A list of MediaPackage VOD PackagingConfiguration resources.
     * 
     * @param packagingConfigurations
     *        A list of MediaPackage VOD PackagingConfiguration resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagingConfigurationsResult withPackagingConfigurations(java.util.Collection<PackagingConfiguration> packagingConfigurations) {
        setPackagingConfigurations(packagingConfigurations);
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
        if (getPackagingConfigurations() != null)
            sb.append("PackagingConfigurations: ").append(getPackagingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPackagingConfigurationsResult == false)
            return false;
        ListPackagingConfigurationsResult other = (ListPackagingConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPackagingConfigurations() == null ^ this.getPackagingConfigurations() == null)
            return false;
        if (other.getPackagingConfigurations() != null && other.getPackagingConfigurations().equals(this.getPackagingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPackagingConfigurations() == null) ? 0 : getPackagingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListPackagingConfigurationsResult clone() {
        try {
            return (ListPackagingConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
