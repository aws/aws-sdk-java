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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxVolumes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxVolumesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of volumes.
     * </p>
     */
    private java.util.List<KxVolume> kxVolumeSummaries;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary of volumes.
     * </p>
     * 
     * @return A summary of volumes.
     */

    public java.util.List<KxVolume> getKxVolumeSummaries() {
        return kxVolumeSummaries;
    }

    /**
     * <p>
     * A summary of volumes.
     * </p>
     * 
     * @param kxVolumeSummaries
     *        A summary of volumes.
     */

    public void setKxVolumeSummaries(java.util.Collection<KxVolume> kxVolumeSummaries) {
        if (kxVolumeSummaries == null) {
            this.kxVolumeSummaries = null;
            return;
        }

        this.kxVolumeSummaries = new java.util.ArrayList<KxVolume>(kxVolumeSummaries);
    }

    /**
     * <p>
     * A summary of volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKxVolumeSummaries(java.util.Collection)} or {@link #withKxVolumeSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param kxVolumeSummaries
     *        A summary of volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxVolumesResult withKxVolumeSummaries(KxVolume... kxVolumeSummaries) {
        if (this.kxVolumeSummaries == null) {
            setKxVolumeSummaries(new java.util.ArrayList<KxVolume>(kxVolumeSummaries.length));
        }
        for (KxVolume ele : kxVolumeSummaries) {
            this.kxVolumeSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of volumes.
     * </p>
     * 
     * @param kxVolumeSummaries
     *        A summary of volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxVolumesResult withKxVolumeSummaries(java.util.Collection<KxVolume> kxVolumeSummaries) {
        setKxVolumeSummaries(kxVolumeSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxVolumesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getKxVolumeSummaries() != null)
            sb.append("KxVolumeSummaries: ").append(getKxVolumeSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKxVolumesResult == false)
            return false;
        ListKxVolumesResult other = (ListKxVolumesResult) obj;
        if (other.getKxVolumeSummaries() == null ^ this.getKxVolumeSummaries() == null)
            return false;
        if (other.getKxVolumeSummaries() != null && other.getKxVolumeSummaries().equals(this.getKxVolumeSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKxVolumeSummaries() == null) ? 0 : getKxVolumeSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKxVolumesResult clone() {
        try {
            return (ListKxVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
