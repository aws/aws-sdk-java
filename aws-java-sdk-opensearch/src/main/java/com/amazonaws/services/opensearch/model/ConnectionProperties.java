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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connection properties of an outbound connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <important>
     * <p>
     * The Endpoint attribute cannot be modified.
     * </p>
     * </important>
     * <p>
     * The endpoint of the remote domain. Applicable for VPC_ENDPOINT connection mode.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The connection properties for cross cluster search.
     * </p>
     */
    private CrossClusterSearchConnectionProperties crossClusterSearch;

    /**
     * <important>
     * <p>
     * The Endpoint attribute cannot be modified.
     * </p>
     * </important>
     * <p>
     * The endpoint of the remote domain. Applicable for VPC_ENDPOINT connection mode.
     * </p>
     * 
     * @param endpoint
     *        <p>
     *        The Endpoint attribute cannot be modified.
     *        </p>
     *        </important>
     *        <p>
     *        The endpoint of the remote domain. Applicable for VPC_ENDPOINT connection mode.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <important>
     * <p>
     * The Endpoint attribute cannot be modified.
     * </p>
     * </important>
     * <p>
     * The endpoint of the remote domain. Applicable for VPC_ENDPOINT connection mode.
     * </p>
     * 
     * @return <p>
     *         The Endpoint attribute cannot be modified.
     *         </p>
     *         </important>
     *         <p>
     *         The endpoint of the remote domain. Applicable for VPC_ENDPOINT connection mode.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <important>
     * <p>
     * The Endpoint attribute cannot be modified.
     * </p>
     * </important>
     * <p>
     * The endpoint of the remote domain. Applicable for VPC_ENDPOINT connection mode.
     * </p>
     * 
     * @param endpoint
     *        <p>
     *        The Endpoint attribute cannot be modified.
     *        </p>
     *        </important>
     *        <p>
     *        The endpoint of the remote domain. Applicable for VPC_ENDPOINT connection mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionProperties withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The connection properties for cross cluster search.
     * </p>
     * 
     * @param crossClusterSearch
     *        The connection properties for cross cluster search.
     */

    public void setCrossClusterSearch(CrossClusterSearchConnectionProperties crossClusterSearch) {
        this.crossClusterSearch = crossClusterSearch;
    }

    /**
     * <p>
     * The connection properties for cross cluster search.
     * </p>
     * 
     * @return The connection properties for cross cluster search.
     */

    public CrossClusterSearchConnectionProperties getCrossClusterSearch() {
        return this.crossClusterSearch;
    }

    /**
     * <p>
     * The connection properties for cross cluster search.
     * </p>
     * 
     * @param crossClusterSearch
     *        The connection properties for cross cluster search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionProperties withCrossClusterSearch(CrossClusterSearchConnectionProperties crossClusterSearch) {
        setCrossClusterSearch(crossClusterSearch);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getCrossClusterSearch() != null)
            sb.append("CrossClusterSearch: ").append(getCrossClusterSearch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionProperties == false)
            return false;
        ConnectionProperties other = (ConnectionProperties) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getCrossClusterSearch() == null ^ this.getCrossClusterSearch() == null)
            return false;
        if (other.getCrossClusterSearch() != null && other.getCrossClusterSearch().equals(this.getCrossClusterSearch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCrossClusterSearch() == null) ? 0 : getCrossClusterSearch().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionProperties clone() {
        try {
            return (ConnectionProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ConnectionPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
