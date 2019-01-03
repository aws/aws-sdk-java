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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response from the server to the request to get the header information for the .csv file for the user
 * import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetCSVHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCSVHeaderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported into.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     */
    private java.util.List<String> cSVHeader;

    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are to be imported into.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported into.
     * </p>
     * 
     * @return The user pool ID for the user pool that the users are to be imported into.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are to be imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are to be imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCSVHeaderResult withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     * 
     * @return The header information for the .csv file for the user import job.
     */

    public java.util.List<String> getCSVHeader() {
        return cSVHeader;
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     * 
     * @param cSVHeader
     *        The header information for the .csv file for the user import job.
     */

    public void setCSVHeader(java.util.Collection<String> cSVHeader) {
        if (cSVHeader == null) {
            this.cSVHeader = null;
            return;
        }

        this.cSVHeader = new java.util.ArrayList<String>(cSVHeader);
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCSVHeader(java.util.Collection)} or {@link #withCSVHeader(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cSVHeader
     *        The header information for the .csv file for the user import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCSVHeaderResult withCSVHeader(String... cSVHeader) {
        if (this.cSVHeader == null) {
            setCSVHeader(new java.util.ArrayList<String>(cSVHeader.length));
        }
        for (String ele : cSVHeader) {
            this.cSVHeader.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The header information for the .csv file for the user import job.
     * </p>
     * 
     * @param cSVHeader
     *        The header information for the .csv file for the user import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCSVHeaderResult withCSVHeader(java.util.Collection<String> cSVHeader) {
        setCSVHeader(cSVHeader);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getCSVHeader() != null)
            sb.append("CSVHeader: ").append(getCSVHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCSVHeaderResult == false)
            return false;
        GetCSVHeaderResult other = (GetCSVHeaderResult) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getCSVHeader() == null ^ this.getCSVHeader() == null)
            return false;
        if (other.getCSVHeader() != null && other.getCSVHeader().equals(this.getCSVHeader()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getCSVHeader() == null) ? 0 : getCSVHeader().hashCode());
        return hashCode;
    }

    @Override
    public GetCSVHeaderResult clone() {
        try {
            return (GetCSVHeaderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
