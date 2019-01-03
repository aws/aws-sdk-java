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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeviceDefinitionVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceDefinitionVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The token for the next set of results, or ''null'' if there are no additional results. */
    private String nextToken;
    /** Information about a version. */
    private java.util.List<VersionInformation> versions;

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @return The token for the next set of results, or ''null'' if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceDefinitionVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Information about a version.
     * 
     * @return Information about a version.
     */

    public java.util.List<VersionInformation> getVersions() {
        return versions;
    }

    /**
     * Information about a version.
     * 
     * @param versions
     *        Information about a version.
     */

    public void setVersions(java.util.Collection<VersionInformation> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<VersionInformation>(versions);
    }

    /**
     * Information about a version.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        Information about a version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceDefinitionVersionsResult withVersions(VersionInformation... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<VersionInformation>(versions.length));
        }
        for (VersionInformation ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * Information about a version.
     * 
     * @param versions
     *        Information about a version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceDefinitionVersionsResult withVersions(java.util.Collection<VersionInformation> versions) {
        setVersions(versions);
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
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceDefinitionVersionsResult == false)
            return false;
        ListDeviceDefinitionVersionsResult other = (ListDeviceDefinitionVersionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceDefinitionVersionsResult clone() {
        try {
            return (ListDeviceDefinitionVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
