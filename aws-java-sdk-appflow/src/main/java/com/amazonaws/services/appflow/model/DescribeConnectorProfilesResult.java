/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns information about the connector profiles associated with the flow.
     * </p>
     */
    private java.util.List<ConnectorProfile> connectorProfileDetails;
    /**
     * <p>
     * The pagination token for the next page of data. If <code>nextToken=null</code>, this means that all records have
     * been fetched.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns information about the connector profiles associated with the flow.
     * </p>
     * 
     * @return Returns information about the connector profiles associated with the flow.
     */

    public java.util.List<ConnectorProfile> getConnectorProfileDetails() {
        return connectorProfileDetails;
    }

    /**
     * <p>
     * Returns information about the connector profiles associated with the flow.
     * </p>
     * 
     * @param connectorProfileDetails
     *        Returns information about the connector profiles associated with the flow.
     */

    public void setConnectorProfileDetails(java.util.Collection<ConnectorProfile> connectorProfileDetails) {
        if (connectorProfileDetails == null) {
            this.connectorProfileDetails = null;
            return;
        }

        this.connectorProfileDetails = new java.util.ArrayList<ConnectorProfile>(connectorProfileDetails);
    }

    /**
     * <p>
     * Returns information about the connector profiles associated with the flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorProfileDetails(java.util.Collection)} or
     * {@link #withConnectorProfileDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectorProfileDetails
     *        Returns information about the connector profiles associated with the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorProfilesResult withConnectorProfileDetails(ConnectorProfile... connectorProfileDetails) {
        if (this.connectorProfileDetails == null) {
            setConnectorProfileDetails(new java.util.ArrayList<ConnectorProfile>(connectorProfileDetails.length));
        }
        for (ConnectorProfile ele : connectorProfileDetails) {
            this.connectorProfileDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns information about the connector profiles associated with the flow.
     * </p>
     * 
     * @param connectorProfileDetails
     *        Returns information about the connector profiles associated with the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorProfilesResult withConnectorProfileDetails(java.util.Collection<ConnectorProfile> connectorProfileDetails) {
        setConnectorProfileDetails(connectorProfileDetails);
        return this;
    }

    /**
     * <p>
     * The pagination token for the next page of data. If <code>nextToken=null</code>, this means that all records have
     * been fetched.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data. If <code>nextToken=null</code>, this means that all
     *        records have been fetched.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data. If <code>nextToken=null</code>, this means that all records have
     * been fetched.
     * </p>
     * 
     * @return The pagination token for the next page of data. If <code>nextToken=null</code>, this means that all
     *         records have been fetched.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data. If <code>nextToken=null</code>, this means that all records have
     * been fetched.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data. If <code>nextToken=null</code>, this means that all
     *        records have been fetched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorProfilesResult withNextToken(String nextToken) {
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
        if (getConnectorProfileDetails() != null)
            sb.append("ConnectorProfileDetails: ").append(getConnectorProfileDetails()).append(",");
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

        if (obj instanceof DescribeConnectorProfilesResult == false)
            return false;
        DescribeConnectorProfilesResult other = (DescribeConnectorProfilesResult) obj;
        if (other.getConnectorProfileDetails() == null ^ this.getConnectorProfileDetails() == null)
            return false;
        if (other.getConnectorProfileDetails() != null && other.getConnectorProfileDetails().equals(this.getConnectorProfileDetails()) == false)
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

        hashCode = prime * hashCode + ((getConnectorProfileDetails() == null) ? 0 : getConnectorProfileDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorProfilesResult clone() {
        try {
            return (DescribeConnectorProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
