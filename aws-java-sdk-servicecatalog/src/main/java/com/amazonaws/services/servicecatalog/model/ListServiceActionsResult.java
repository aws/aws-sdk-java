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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListServiceActions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about the service actions associated with the provisioning artifact.
     * </p>
     */
    private java.util.List<ServiceActionSummary> serviceActionSummaries;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An object containing information about the service actions associated with the provisioning artifact.
     * </p>
     * 
     * @return An object containing information about the service actions associated with the provisioning artifact.
     */

    public java.util.List<ServiceActionSummary> getServiceActionSummaries() {
        return serviceActionSummaries;
    }

    /**
     * <p>
     * An object containing information about the service actions associated with the provisioning artifact.
     * </p>
     * 
     * @param serviceActionSummaries
     *        An object containing information about the service actions associated with the provisioning artifact.
     */

    public void setServiceActionSummaries(java.util.Collection<ServiceActionSummary> serviceActionSummaries) {
        if (serviceActionSummaries == null) {
            this.serviceActionSummaries = null;
            return;
        }

        this.serviceActionSummaries = new java.util.ArrayList<ServiceActionSummary>(serviceActionSummaries);
    }

    /**
     * <p>
     * An object containing information about the service actions associated with the provisioning artifact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceActionSummaries(java.util.Collection)} or
     * {@link #withServiceActionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serviceActionSummaries
     *        An object containing information about the service actions associated with the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceActionsResult withServiceActionSummaries(ServiceActionSummary... serviceActionSummaries) {
        if (this.serviceActionSummaries == null) {
            setServiceActionSummaries(new java.util.ArrayList<ServiceActionSummary>(serviceActionSummaries.length));
        }
        for (ServiceActionSummary ele : serviceActionSummaries) {
            this.serviceActionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object containing information about the service actions associated with the provisioning artifact.
     * </p>
     * 
     * @param serviceActionSummaries
     *        An object containing information about the service actions associated with the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceActionsResult withServiceActionSummaries(java.util.Collection<ServiceActionSummary> serviceActionSummaries) {
        setServiceActionSummaries(serviceActionSummaries);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceActionsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getServiceActionSummaries() != null)
            sb.append("ServiceActionSummaries: ").append(getServiceActionSummaries()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceActionsResult == false)
            return false;
        ListServiceActionsResult other = (ListServiceActionsResult) obj;
        if (other.getServiceActionSummaries() == null ^ this.getServiceActionSummaries() == null)
            return false;
        if (other.getServiceActionSummaries() != null && other.getServiceActionSummaries().equals(this.getServiceActionSummaries()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceActionSummaries() == null) ? 0 : getServiceActionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceActionsResult clone() {
        try {
            return (ListServiceActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
