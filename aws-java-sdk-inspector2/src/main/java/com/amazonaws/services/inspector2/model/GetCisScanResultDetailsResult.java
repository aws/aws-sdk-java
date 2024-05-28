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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetCisScanResultDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCisScanResultDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The scan result details.
     * </p>
     */
    private java.util.List<CisScanResultDetails> scanResultDetails;

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @return The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The scan result details.
     * </p>
     * 
     * @return The scan result details.
     */

    public java.util.List<CisScanResultDetails> getScanResultDetails() {
        return scanResultDetails;
    }

    /**
     * <p>
     * The scan result details.
     * </p>
     * 
     * @param scanResultDetails
     *        The scan result details.
     */

    public void setScanResultDetails(java.util.Collection<CisScanResultDetails> scanResultDetails) {
        if (scanResultDetails == null) {
            this.scanResultDetails = null;
            return;
        }

        this.scanResultDetails = new java.util.ArrayList<CisScanResultDetails>(scanResultDetails);
    }

    /**
     * <p>
     * The scan result details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanResultDetails(java.util.Collection)} or {@link #withScanResultDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param scanResultDetails
     *        The scan result details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsResult withScanResultDetails(CisScanResultDetails... scanResultDetails) {
        if (this.scanResultDetails == null) {
            setScanResultDetails(new java.util.ArrayList<CisScanResultDetails>(scanResultDetails.length));
        }
        for (CisScanResultDetails ele : scanResultDetails) {
            this.scanResultDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scan result details.
     * </p>
     * 
     * @param scanResultDetails
     *        The scan result details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanResultDetailsResult withScanResultDetails(java.util.Collection<CisScanResultDetails> scanResultDetails) {
        setScanResultDetails(scanResultDetails);
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
        if (getScanResultDetails() != null)
            sb.append("ScanResultDetails: ").append(getScanResultDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCisScanResultDetailsResult == false)
            return false;
        GetCisScanResultDetailsResult other = (GetCisScanResultDetailsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScanResultDetails() == null ^ this.getScanResultDetails() == null)
            return false;
        if (other.getScanResultDetails() != null && other.getScanResultDetails().equals(this.getScanResultDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScanResultDetails() == null) ? 0 : getScanResultDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetCisScanResultDetailsResult clone() {
        try {
            return (GetCisScanResultDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
