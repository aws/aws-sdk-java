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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListExtensibleSourceServers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExtensibleSourceServersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of extensible source servers to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token of the next extensible source server to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Id of the staging Account to retrieve extensible source servers from.
     * </p>
     */
    private String stagingAccountID;

    /**
     * <p>
     * The maximum number of extensible source servers to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of extensible source servers to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of extensible source servers to retrieve.
     * </p>
     * 
     * @return The maximum number of extensible source servers to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of extensible source servers to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of extensible source servers to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensibleSourceServersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token of the next extensible source server to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next extensible source server to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token of the next extensible source server to retrieve.
     * </p>
     * 
     * @return The token of the next extensible source server to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token of the next extensible source server to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next extensible source server to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensibleSourceServersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Id of the staging Account to retrieve extensible source servers from.
     * </p>
     * 
     * @param stagingAccountID
     *        The Id of the staging Account to retrieve extensible source servers from.
     */

    public void setStagingAccountID(String stagingAccountID) {
        this.stagingAccountID = stagingAccountID;
    }

    /**
     * <p>
     * The Id of the staging Account to retrieve extensible source servers from.
     * </p>
     * 
     * @return The Id of the staging Account to retrieve extensible source servers from.
     */

    public String getStagingAccountID() {
        return this.stagingAccountID;
    }

    /**
     * <p>
     * The Id of the staging Account to retrieve extensible source servers from.
     * </p>
     * 
     * @param stagingAccountID
     *        The Id of the staging Account to retrieve extensible source servers from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensibleSourceServersRequest withStagingAccountID(String stagingAccountID) {
        setStagingAccountID(stagingAccountID);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStagingAccountID() != null)
            sb.append("StagingAccountID: ").append(getStagingAccountID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExtensibleSourceServersRequest == false)
            return false;
        ListExtensibleSourceServersRequest other = (ListExtensibleSourceServersRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStagingAccountID() == null ^ this.getStagingAccountID() == null)
            return false;
        if (other.getStagingAccountID() != null && other.getStagingAccountID().equals(this.getStagingAccountID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStagingAccountID() == null) ? 0 : getStagingAccountID().hashCode());
        return hashCode;
    }

    @Override
    public ListExtensibleSourceServersRequest clone() {
        return (ListExtensibleSourceServersRequest) super.clone();
    }

}
