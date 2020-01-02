/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/StartChangeSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     */
    private java.util.List<Change> changeSet;
    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list
     * of change sets.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @return The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeSetRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     * 
     * @return Array of <code>change</code> object.
     */

    public java.util.List<Change> getChangeSet() {
        return changeSet;
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     * 
     * @param changeSet
     *        Array of <code>change</code> object.
     */

    public void setChangeSet(java.util.Collection<Change> changeSet) {
        if (changeSet == null) {
            this.changeSet = null;
            return;
        }

        this.changeSet = new java.util.ArrayList<Change>(changeSet);
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeSet(java.util.Collection)} or {@link #withChangeSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param changeSet
     *        Array of <code>change</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeSetRequest withChangeSet(Change... changeSet) {
        if (this.changeSet == null) {
            setChangeSet(new java.util.ArrayList<Change>(changeSet.length));
        }
        for (Change ele : changeSet) {
            this.changeSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     * 
     * @param changeSet
     *        Array of <code>change</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeSetRequest withChangeSet(java.util.Collection<Change> changeSet) {
        setChangeSet(changeSet);
        return this;
    }

    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list
     * of change sets.
     * </p>
     * 
     * @param changeSetName
     *        Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter
     *        the list of change sets.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list
     * of change sets.
     * </p>
     * 
     * @return Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter
     *         the list of change sets.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list
     * of change sets.
     * </p>
     * 
     * @param changeSetName
     *        Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter
     *        the list of change sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeSetRequest withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique token to identify the request to ensure idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     * 
     * @return A unique token to identify the request to ensure idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique token to identify the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeSetRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getChangeSet() != null)
            sb.append("ChangeSet: ").append(getChangeSet()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartChangeSetRequest == false)
            return false;
        StartChangeSetRequest other = (StartChangeSetRequest) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getChangeSet() == null ^ this.getChangeSet() == null)
            return false;
        if (other.getChangeSet() != null && other.getChangeSet().equals(this.getChangeSet()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getChangeSet() == null) ? 0 : getChangeSet().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartChangeSetRequest clone() {
        return (StartChangeSetRequest) super.clone();
    }

}
