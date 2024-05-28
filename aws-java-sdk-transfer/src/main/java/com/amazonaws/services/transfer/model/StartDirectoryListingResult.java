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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartDirectoryListing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDirectoryListingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a unique identifier for the directory listing call.
     * </p>
     */
    private String listingId;
    /**
     * <p>
     * Returns the file name where the results are stored. This is a combination of the connector ID and the listing ID:
     * <code>&lt;connector-id&gt;-&lt;listing-id&gt;.json</code>.
     * </p>
     */
    private String outputFileName;

    /**
     * <p>
     * Returns a unique identifier for the directory listing call.
     * </p>
     * 
     * @param listingId
     *        Returns a unique identifier for the directory listing call.
     */

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    /**
     * <p>
     * Returns a unique identifier for the directory listing call.
     * </p>
     * 
     * @return Returns a unique identifier for the directory listing call.
     */

    public String getListingId() {
        return this.listingId;
    }

    /**
     * <p>
     * Returns a unique identifier for the directory listing call.
     * </p>
     * 
     * @param listingId
     *        Returns a unique identifier for the directory listing call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDirectoryListingResult withListingId(String listingId) {
        setListingId(listingId);
        return this;
    }

    /**
     * <p>
     * Returns the file name where the results are stored. This is a combination of the connector ID and the listing ID:
     * <code>&lt;connector-id&gt;-&lt;listing-id&gt;.json</code>.
     * </p>
     * 
     * @param outputFileName
     *        Returns the file name where the results are stored. This is a combination of the connector ID and the
     *        listing ID: <code>&lt;connector-id&gt;-&lt;listing-id&gt;.json</code>.
     */

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    /**
     * <p>
     * Returns the file name where the results are stored. This is a combination of the connector ID and the listing ID:
     * <code>&lt;connector-id&gt;-&lt;listing-id&gt;.json</code>.
     * </p>
     * 
     * @return Returns the file name where the results are stored. This is a combination of the connector ID and the
     *         listing ID: <code>&lt;connector-id&gt;-&lt;listing-id&gt;.json</code>.
     */

    public String getOutputFileName() {
        return this.outputFileName;
    }

    /**
     * <p>
     * Returns the file name where the results are stored. This is a combination of the connector ID and the listing ID:
     * <code>&lt;connector-id&gt;-&lt;listing-id&gt;.json</code>.
     * </p>
     * 
     * @param outputFileName
     *        Returns the file name where the results are stored. This is a combination of the connector ID and the
     *        listing ID: <code>&lt;connector-id&gt;-&lt;listing-id&gt;.json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDirectoryListingResult withOutputFileName(String outputFileName) {
        setOutputFileName(outputFileName);
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
        if (getListingId() != null)
            sb.append("ListingId: ").append(getListingId()).append(",");
        if (getOutputFileName() != null)
            sb.append("OutputFileName: ").append(getOutputFileName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDirectoryListingResult == false)
            return false;
        StartDirectoryListingResult other = (StartDirectoryListingResult) obj;
        if (other.getListingId() == null ^ this.getListingId() == null)
            return false;
        if (other.getListingId() != null && other.getListingId().equals(this.getListingId()) == false)
            return false;
        if (other.getOutputFileName() == null ^ this.getOutputFileName() == null)
            return false;
        if (other.getOutputFileName() != null && other.getOutputFileName().equals(this.getOutputFileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListingId() == null) ? 0 : getListingId().hashCode());
        hashCode = prime * hashCode + ((getOutputFileName() == null) ? 0 : getOutputFileName().hashCode());
        return hashCode;
    }

    @Override
    public StartDirectoryListingResult clone() {
        try {
            return (StartDirectoryListingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
