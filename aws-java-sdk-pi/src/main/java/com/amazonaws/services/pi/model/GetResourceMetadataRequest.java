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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @return The Amazon Web Services service for which Performance Insights returns metrics.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetResourceMetadataRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetResourceMetadataRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. To use a DB instance as a data source, specify its
     *        <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @return An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *         Insights gathers metrics from this data source. To use a DB instance as a data source, specify its
     *         <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. To use a DB instance as a data source, specify its
     *        <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetadataRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceMetadataRequest == false)
            return false;
        GetResourceMetadataRequest other = (GetResourceMetadataRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceMetadataRequest clone() {
        return (GetResourceMetadataRequest) super.clone();
    }

}
