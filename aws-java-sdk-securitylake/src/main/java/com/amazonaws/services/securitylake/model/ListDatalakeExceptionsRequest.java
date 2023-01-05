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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDatalakeExceptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatalakeExceptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List the maximum number of failures in Security Lake.
     * </p>
     */
    private Integer maxFailures;
    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List the Amazon Web Services Regions from which exceptions are retrieved.
     * </p>
     */
    private java.util.List<String> regionSet;

    /**
     * <p>
     * List the maximum number of failures in Security Lake.
     * </p>
     * 
     * @param maxFailures
     *        List the maximum number of failures in Security Lake.
     */

    public void setMaxFailures(Integer maxFailures) {
        this.maxFailures = maxFailures;
    }

    /**
     * <p>
     * List the maximum number of failures in Security Lake.
     * </p>
     * 
     * @return List the maximum number of failures in Security Lake.
     */

    public Integer getMaxFailures() {
        return this.maxFailures;
    }

    /**
     * <p>
     * List the maximum number of failures in Security Lake.
     * </p>
     * 
     * @param maxFailures
     *        List the maximum number of failures in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatalakeExceptionsRequest withMaxFailures(Integer maxFailures) {
        setMaxFailures(maxFailures);
        return this;
    }

    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        List if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged. </p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @return List if there are more results available. The value of nextToken is a unique pagination token for each
     *         page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *         unchanged. </p>
     *         <p>
     *         Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *         InvalidToken error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        List if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged. </p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatalakeExceptionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List the Amazon Web Services Regions from which exceptions are retrieved.
     * </p>
     * 
     * @return List the Amazon Web Services Regions from which exceptions are retrieved.
     * @see Region
     */

    public java.util.List<String> getRegionSet() {
        return regionSet;
    }

    /**
     * <p>
     * List the Amazon Web Services Regions from which exceptions are retrieved.
     * </p>
     * 
     * @param regionSet
     *        List the Amazon Web Services Regions from which exceptions are retrieved.
     * @see Region
     */

    public void setRegionSet(java.util.Collection<String> regionSet) {
        if (regionSet == null) {
            this.regionSet = null;
            return;
        }

        this.regionSet = new java.util.ArrayList<String>(regionSet);
    }

    /**
     * <p>
     * List the Amazon Web Services Regions from which exceptions are retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionSet(java.util.Collection)} or {@link #withRegionSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param regionSet
     *        List the Amazon Web Services Regions from which exceptions are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public ListDatalakeExceptionsRequest withRegionSet(String... regionSet) {
        if (this.regionSet == null) {
            setRegionSet(new java.util.ArrayList<String>(regionSet.length));
        }
        for (String ele : regionSet) {
            this.regionSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List the Amazon Web Services Regions from which exceptions are retrieved.
     * </p>
     * 
     * @param regionSet
     *        List the Amazon Web Services Regions from which exceptions are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public ListDatalakeExceptionsRequest withRegionSet(java.util.Collection<String> regionSet) {
        setRegionSet(regionSet);
        return this;
    }

    /**
     * <p>
     * List the Amazon Web Services Regions from which exceptions are retrieved.
     * </p>
     * 
     * @param regionSet
     *        List the Amazon Web Services Regions from which exceptions are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public ListDatalakeExceptionsRequest withRegionSet(Region... regionSet) {
        java.util.ArrayList<String> regionSetCopy = new java.util.ArrayList<String>(regionSet.length);
        for (Region value : regionSet) {
            regionSetCopy.add(value.toString());
        }
        if (getRegionSet() == null) {
            setRegionSet(regionSetCopy);
        } else {
            getRegionSet().addAll(regionSetCopy);
        }
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
        if (getMaxFailures() != null)
            sb.append("MaxFailures: ").append(getMaxFailures()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRegionSet() != null)
            sb.append("RegionSet: ").append(getRegionSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatalakeExceptionsRequest == false)
            return false;
        ListDatalakeExceptionsRequest other = (ListDatalakeExceptionsRequest) obj;
        if (other.getMaxFailures() == null ^ this.getMaxFailures() == null)
            return false;
        if (other.getMaxFailures() != null && other.getMaxFailures().equals(this.getMaxFailures()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegionSet() == null ^ this.getRegionSet() == null)
            return false;
        if (other.getRegionSet() != null && other.getRegionSet().equals(this.getRegionSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxFailures() == null) ? 0 : getMaxFailures().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRegionSet() == null) ? 0 : getRegionSet().hashCode());
        return hashCode;
    }

    @Override
    public ListDatalakeExceptionsRequest clone() {
        return (ListDatalakeExceptionsRequest) super.clone();
    }

}
