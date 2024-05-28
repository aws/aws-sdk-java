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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary details of an archive search job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/SearchSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the search job.
     * </p>
     */
    private String searchId;
    /**
     * <p>
     * The current status of the search job.
     * </p>
     */
    private SearchStatus status;

    /**
     * <p>
     * The unique identifier of the search job.
     * </p>
     * 
     * @param searchId
     *        The unique identifier of the search job.
     */

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    /**
     * <p>
     * The unique identifier of the search job.
     * </p>
     * 
     * @return The unique identifier of the search job.
     */

    public String getSearchId() {
        return this.searchId;
    }

    /**
     * <p>
     * The unique identifier of the search job.
     * </p>
     * 
     * @param searchId
     *        The unique identifier of the search job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSummary withSearchId(String searchId) {
        setSearchId(searchId);
        return this;
    }

    /**
     * <p>
     * The current status of the search job.
     * </p>
     * 
     * @param status
     *        The current status of the search job.
     */

    public void setStatus(SearchStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the search job.
     * </p>
     * 
     * @return The current status of the search job.
     */

    public SearchStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the search job.
     * </p>
     * 
     * @param status
     *        The current status of the search job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSummary withStatus(SearchStatus status) {
        setStatus(status);
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
            sb.append("SearchId: ").append(getSearchId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSummary == false)
            return false;
        SearchSummary other = (SearchSummary) obj;
        if (other.getSearchId() == null ^ this.getSearchId() == null)
            return false;
        if (other.getSearchId() != null && other.getSearchId().equals(this.getSearchId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSearchId() == null) ? 0 : getSearchId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SearchSummary clone() {
        try {
            return (SearchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.SearchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
