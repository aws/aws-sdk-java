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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListResourcesForTagOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesForTagOptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the resources.
     * </p>
     */
    private java.util.List<ResourceDetail> resourceDetails;
    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * Information about the resources.
     * </p>
     * 
     * @return Information about the resources.
     */

    public java.util.List<ResourceDetail> getResourceDetails() {
        return resourceDetails;
    }

    /**
     * <p>
     * Information about the resources.
     * </p>
     * 
     * @param resourceDetails
     *        Information about the resources.
     */

    public void setResourceDetails(java.util.Collection<ResourceDetail> resourceDetails) {
        if (resourceDetails == null) {
            this.resourceDetails = null;
            return;
        }

        this.resourceDetails = new java.util.ArrayList<ResourceDetail>(resourceDetails);
    }

    /**
     * <p>
     * Information about the resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceDetails(java.util.Collection)} or {@link #withResourceDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceDetails
     *        Information about the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForTagOptionResult withResourceDetails(ResourceDetail... resourceDetails) {
        if (this.resourceDetails == null) {
            setResourceDetails(new java.util.ArrayList<ResourceDetail>(resourceDetails.length));
        }
        for (ResourceDetail ele : resourceDetails) {
            this.resourceDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resources.
     * </p>
     * 
     * @param resourceDetails
     *        Information about the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForTagOptionResult withResourceDetails(java.util.Collection<ResourceDetail> resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @return The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForTagOptionResult withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesForTagOptionResult == false)
            return false;
        ListResourcesForTagOptionResult other = (ListResourcesForTagOptionResult) obj;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesForTagOptionResult clone() {
        try {
            return (ListResourcesForTagOptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
