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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to retrieve results from a completed archive search job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearchResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveSearchResultsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the completed search job.
     * </p>
     */
    private String searchId;

    /**
     * <p>
     * The identifier of the completed search job.
     * </p>
     * 
     * @param searchId
     *        The identifier of the completed search job.
     */

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    /**
     * <p>
     * The identifier of the completed search job.
     * </p>
     * 
     * @return The identifier of the completed search job.
     */

    public String getSearchId() {
        return this.searchId;
    }

    /**
     * <p>
     * The identifier of the completed search job.
     * </p>
     * 
     * @param searchId
     *        The identifier of the completed search job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveSearchResultsRequest withSearchId(String searchId) {
        setSearchId(searchId);
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
        if (getSearchId() != null)
            sb.append("SearchId: ").append(getSearchId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchiveSearchResultsRequest == false)
            return false;
        GetArchiveSearchResultsRequest other = (GetArchiveSearchResultsRequest) obj;
        if (other.getSearchId() == null ^ this.getSearchId() == null)
            return false;
        if (other.getSearchId() != null && other.getSearchId().equals(this.getSearchId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSearchId() == null) ? 0 : getSearchId().hashCode());
        return hashCode;
    }

    @Override
    public GetArchiveSearchResultsRequest clone() {
        return (GetArchiveSearchResultsRequest) super.clone();
    }

}
