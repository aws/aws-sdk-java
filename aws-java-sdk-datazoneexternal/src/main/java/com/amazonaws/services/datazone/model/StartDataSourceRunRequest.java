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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartDataSourceRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDataSourceRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the data source.
     * </p>
     */
    private String dataSourceIdentifier;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to start a data source run.
     * </p>
     */
    private String domainIdentifier;

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataSourceRunRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @param dataSourceIdentifier
     *        The identifier of the data source.
     */

    public void setDataSourceIdentifier(String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @return The identifier of the data source.
     */

    public String getDataSourceIdentifier() {
        return this.dataSourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @param dataSourceIdentifier
     *        The identifier of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataSourceRunRequest withDataSourceIdentifier(String dataSourceIdentifier) {
        setDataSourceIdentifier(dataSourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to start a data source run.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to start a data source run.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to start a data source run.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which to start a data source run.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to start a data source run.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to start a data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataSourceRunRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDataSourceIdentifier() != null)
            sb.append("DataSourceIdentifier: ").append(getDataSourceIdentifier()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDataSourceRunRequest == false)
            return false;
        StartDataSourceRunRequest other = (StartDataSourceRunRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDataSourceIdentifier() == null ^ this.getDataSourceIdentifier() == null)
            return false;
        if (other.getDataSourceIdentifier() != null && other.getDataSourceIdentifier().equals(this.getDataSourceIdentifier()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDataSourceIdentifier() == null) ? 0 : getDataSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public StartDataSourceRunRequest clone() {
        return (StartDataSourceRunRequest) super.clone();
    }

}
