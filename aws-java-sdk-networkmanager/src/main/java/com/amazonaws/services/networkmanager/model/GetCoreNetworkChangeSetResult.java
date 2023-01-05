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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoreNetworkChangeSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes a core network changes.
     * </p>
     */
    private java.util.List<CoreNetworkChange> coreNetworkChanges;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes a core network changes.
     * </p>
     * 
     * @return Describes a core network changes.
     */

    public java.util.List<CoreNetworkChange> getCoreNetworkChanges() {
        return coreNetworkChanges;
    }

    /**
     * <p>
     * Describes a core network changes.
     * </p>
     * 
     * @param coreNetworkChanges
     *        Describes a core network changes.
     */

    public void setCoreNetworkChanges(java.util.Collection<CoreNetworkChange> coreNetworkChanges) {
        if (coreNetworkChanges == null) {
            this.coreNetworkChanges = null;
            return;
        }

        this.coreNetworkChanges = new java.util.ArrayList<CoreNetworkChange>(coreNetworkChanges);
    }

    /**
     * <p>
     * Describes a core network changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoreNetworkChanges(java.util.Collection)} or {@link #withCoreNetworkChanges(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param coreNetworkChanges
     *        Describes a core network changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreNetworkChangeSetResult withCoreNetworkChanges(CoreNetworkChange... coreNetworkChanges) {
        if (this.coreNetworkChanges == null) {
            setCoreNetworkChanges(new java.util.ArrayList<CoreNetworkChange>(coreNetworkChanges.length));
        }
        for (CoreNetworkChange ele : coreNetworkChanges) {
            this.coreNetworkChanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes a core network changes.
     * </p>
     * 
     * @param coreNetworkChanges
     *        Describes a core network changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreNetworkChangeSetResult withCoreNetworkChanges(java.util.Collection<CoreNetworkChange> coreNetworkChanges) {
        setCoreNetworkChanges(coreNetworkChanges);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreNetworkChangeSetResult withNextToken(String nextToken) {
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
        if (getCoreNetworkChanges() != null)
            sb.append("CoreNetworkChanges: ").append(getCoreNetworkChanges()).append(",");
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

        if (obj instanceof GetCoreNetworkChangeSetResult == false)
            return false;
        GetCoreNetworkChangeSetResult other = (GetCoreNetworkChangeSetResult) obj;
        if (other.getCoreNetworkChanges() == null ^ this.getCoreNetworkChanges() == null)
            return false;
        if (other.getCoreNetworkChanges() != null && other.getCoreNetworkChanges().equals(this.getCoreNetworkChanges()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkChanges() == null) ? 0 : getCoreNetworkChanges().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCoreNetworkChangeSetResult clone() {
        try {
            return (GetCoreNetworkChangeSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
