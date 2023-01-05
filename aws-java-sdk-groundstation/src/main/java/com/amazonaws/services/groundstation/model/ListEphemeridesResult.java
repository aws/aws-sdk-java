/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListEphemerides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEphemeridesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of ephemerides.
     * </p>
     */
    private java.util.List<EphemerisItem> ephemerides;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of ephemerides.
     * </p>
     * 
     * @return List of ephemerides.
     */

    public java.util.List<EphemerisItem> getEphemerides() {
        return ephemerides;
    }

    /**
     * <p>
     * List of ephemerides.
     * </p>
     * 
     * @param ephemerides
     *        List of ephemerides.
     */

    public void setEphemerides(java.util.Collection<EphemerisItem> ephemerides) {
        if (ephemerides == null) {
            this.ephemerides = null;
            return;
        }

        this.ephemerides = new java.util.ArrayList<EphemerisItem>(ephemerides);
    }

    /**
     * <p>
     * List of ephemerides.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEphemerides(java.util.Collection)} or {@link #withEphemerides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ephemerides
     *        List of ephemerides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesResult withEphemerides(EphemerisItem... ephemerides) {
        if (this.ephemerides == null) {
            setEphemerides(new java.util.ArrayList<EphemerisItem>(ephemerides.length));
        }
        for (EphemerisItem ele : ephemerides) {
            this.ephemerides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ephemerides.
     * </p>
     * 
     * @param ephemerides
     *        List of ephemerides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesResult withEphemerides(java.util.Collection<EphemerisItem> ephemerides) {
        setEphemerides(ephemerides);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEphemeridesResult withNextToken(String nextToken) {
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
        if (getEphemerides() != null)
            sb.append("Ephemerides: ").append(getEphemerides()).append(",");
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

        if (obj instanceof ListEphemeridesResult == false)
            return false;
        ListEphemeridesResult other = (ListEphemeridesResult) obj;
        if (other.getEphemerides() == null ^ this.getEphemerides() == null)
            return false;
        if (other.getEphemerides() != null && other.getEphemerides().equals(this.getEphemerides()) == false)
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

        hashCode = prime * hashCode + ((getEphemerides() == null) ? 0 : getEphemerides().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEphemeridesResult clone() {
        try {
            return (ListEphemeridesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
