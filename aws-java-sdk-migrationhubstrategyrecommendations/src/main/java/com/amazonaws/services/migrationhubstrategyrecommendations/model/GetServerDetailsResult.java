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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServerDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     * </p>
     */
    private java.util.List<AssociatedApplication> associatedApplications;
    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Detailed information about the server.
     * </p>
     */
    private ServerDetail serverDetail;

    /**
     * <p>
     * The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     * </p>
     * 
     * @return The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     */

    public java.util.List<AssociatedApplication> getAssociatedApplications() {
        return associatedApplications;
    }

    /**
     * <p>
     * The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     * </p>
     * 
     * @param associatedApplications
     *        The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     */

    public void setAssociatedApplications(java.util.Collection<AssociatedApplication> associatedApplications) {
        if (associatedApplications == null) {
            this.associatedApplications = null;
            return;
        }

        this.associatedApplications = new java.util.ArrayList<AssociatedApplication>(associatedApplications);
    }

    /**
     * <p>
     * The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedApplications(java.util.Collection)} or
     * {@link #withAssociatedApplications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedApplications
     *        The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerDetailsResult withAssociatedApplications(AssociatedApplication... associatedApplications) {
        if (this.associatedApplications == null) {
            setAssociatedApplications(new java.util.ArrayList<AssociatedApplication>(associatedApplications.length));
        }
        for (AssociatedApplication ele : associatedApplications) {
            this.associatedApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     * </p>
     * 
     * @param associatedApplications
     *        The associated application group the server belongs to, as defined in AWS Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerDetailsResult withAssociatedApplications(java.util.Collection<AssociatedApplication> associatedApplications) {
        setAssociatedApplications(associatedApplications);
        return this;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerDetailsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Detailed information about the server.
     * </p>
     * 
     * @param serverDetail
     *        Detailed information about the server.
     */

    public void setServerDetail(ServerDetail serverDetail) {
        this.serverDetail = serverDetail;
    }

    /**
     * <p>
     * Detailed information about the server.
     * </p>
     * 
     * @return Detailed information about the server.
     */

    public ServerDetail getServerDetail() {
        return this.serverDetail;
    }

    /**
     * <p>
     * Detailed information about the server.
     * </p>
     * 
     * @param serverDetail
     *        Detailed information about the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerDetailsResult withServerDetail(ServerDetail serverDetail) {
        setServerDetail(serverDetail);
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
        if (getAssociatedApplications() != null)
            sb.append("AssociatedApplications: ").append(getAssociatedApplications()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerDetail() != null)
            sb.append("ServerDetail: ").append(getServerDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServerDetailsResult == false)
            return false;
        GetServerDetailsResult other = (GetServerDetailsResult) obj;
        if (other.getAssociatedApplications() == null ^ this.getAssociatedApplications() == null)
            return false;
        if (other.getAssociatedApplications() != null && other.getAssociatedApplications().equals(this.getAssociatedApplications()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerDetail() == null ^ this.getServerDetail() == null)
            return false;
        if (other.getServerDetail() != null && other.getServerDetail().equals(this.getServerDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedApplications() == null) ? 0 : getAssociatedApplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerDetail() == null) ? 0 : getServerDetail().hashCode());
        return hashCode;
    }

    @Override
    public GetServerDetailsResult clone() {
        try {
            return (GetServerDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
