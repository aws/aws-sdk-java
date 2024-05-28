/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsLocations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessGrantsLocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A container for a list of registered locations in an S3 Access Grants instance.
     * </p>
     */
    private java.util.List<ListAccessGrantsLocationsEntry> accessGrantsLocationsList;

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Pass this value into a subsequent
     *        <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @return A pagination token to request the next page of results. Pass this value into a subsequent
     *         <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Pass this value into a subsequent
     *        <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsLocationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A container for a list of registered locations in an S3 Access Grants instance.
     * </p>
     * 
     * @return A container for a list of registered locations in an S3 Access Grants instance.
     */

    public java.util.List<ListAccessGrantsLocationsEntry> getAccessGrantsLocationsList() {
        return accessGrantsLocationsList;
    }

    /**
     * <p>
     * A container for a list of registered locations in an S3 Access Grants instance.
     * </p>
     * 
     * @param accessGrantsLocationsList
     *        A container for a list of registered locations in an S3 Access Grants instance.
     */

    public void setAccessGrantsLocationsList(java.util.Collection<ListAccessGrantsLocationsEntry> accessGrantsLocationsList) {
        if (accessGrantsLocationsList == null) {
            this.accessGrantsLocationsList = null;
            return;
        }

        this.accessGrantsLocationsList = new java.util.ArrayList<ListAccessGrantsLocationsEntry>(accessGrantsLocationsList);
    }

    /**
     * <p>
     * A container for a list of registered locations in an S3 Access Grants instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessGrantsLocationsList(java.util.Collection)} or
     * {@link #withAccessGrantsLocationsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accessGrantsLocationsList
     *        A container for a list of registered locations in an S3 Access Grants instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsLocationsResult withAccessGrantsLocationsList(ListAccessGrantsLocationsEntry... accessGrantsLocationsList) {
        if (this.accessGrantsLocationsList == null) {
            setAccessGrantsLocationsList(new java.util.ArrayList<ListAccessGrantsLocationsEntry>(accessGrantsLocationsList.length));
        }
        for (ListAccessGrantsLocationsEntry ele : accessGrantsLocationsList) {
            this.accessGrantsLocationsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container for a list of registered locations in an S3 Access Grants instance.
     * </p>
     * 
     * @param accessGrantsLocationsList
     *        A container for a list of registered locations in an S3 Access Grants instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsLocationsResult withAccessGrantsLocationsList(java.util.Collection<ListAccessGrantsLocationsEntry> accessGrantsLocationsList) {
        setAccessGrantsLocationsList(accessGrantsLocationsList);
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
        if (getAccessGrantsLocationsList() != null)
            sb.append("AccessGrantsLocationsList: ").append(getAccessGrantsLocationsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessGrantsLocationsResult == false)
            return false;
        ListAccessGrantsLocationsResult other = (ListAccessGrantsLocationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAccessGrantsLocationsList() == null ^ this.getAccessGrantsLocationsList() == null)
            return false;
        if (other.getAccessGrantsLocationsList() != null && other.getAccessGrantsLocationsList().equals(this.getAccessGrantsLocationsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationsList() == null) ? 0 : getAccessGrantsLocationsList().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessGrantsLocationsResult clone() {
        try {
            return (ListAccessGrantsLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
