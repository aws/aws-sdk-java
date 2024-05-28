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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The SQL code of your query.
     * </p>
     */
    private String queryStatement;
    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivers the query results.
     * </p>
     */
    private String deliveryS3Uri;
    /**
     * <p>
     * The alias that identifies a query template.
     * </p>
     */
    private String queryAlias;
    /**
     * <p>
     * The query parameters for the specified <code>QueryAlias</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> queryParameters;

    /**
     * <p>
     * The SQL code of your query.
     * </p>
     * 
     * @param queryStatement
     *        The SQL code of your query.
     */

    public void setQueryStatement(String queryStatement) {
        this.queryStatement = queryStatement;
    }

    /**
     * <p>
     * The SQL code of your query.
     * </p>
     * 
     * @return The SQL code of your query.
     */

    public String getQueryStatement() {
        return this.queryStatement;
    }

    /**
     * <p>
     * The SQL code of your query.
     * </p>
     * 
     * @param queryStatement
     *        The SQL code of your query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withQueryStatement(String queryStatement) {
        setQueryStatement(queryStatement);
        return this;
    }

    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivers the query results.
     * </p>
     * 
     * @param deliveryS3Uri
     *        The URI for the S3 bucket where CloudTrail delivers the query results.
     */

    public void setDeliveryS3Uri(String deliveryS3Uri) {
        this.deliveryS3Uri = deliveryS3Uri;
    }

    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivers the query results.
     * </p>
     * 
     * @return The URI for the S3 bucket where CloudTrail delivers the query results.
     */

    public String getDeliveryS3Uri() {
        return this.deliveryS3Uri;
    }

    /**
     * <p>
     * The URI for the S3 bucket where CloudTrail delivers the query results.
     * </p>
     * 
     * @param deliveryS3Uri
     *        The URI for the S3 bucket where CloudTrail delivers the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withDeliveryS3Uri(String deliveryS3Uri) {
        setDeliveryS3Uri(deliveryS3Uri);
        return this;
    }

    /**
     * <p>
     * The alias that identifies a query template.
     * </p>
     * 
     * @param queryAlias
     *        The alias that identifies a query template.
     */

    public void setQueryAlias(String queryAlias) {
        this.queryAlias = queryAlias;
    }

    /**
     * <p>
     * The alias that identifies a query template.
     * </p>
     * 
     * @return The alias that identifies a query template.
     */

    public String getQueryAlias() {
        return this.queryAlias;
    }

    /**
     * <p>
     * The alias that identifies a query template.
     * </p>
     * 
     * @param queryAlias
     *        The alias that identifies a query template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withQueryAlias(String queryAlias) {
        setQueryAlias(queryAlias);
        return this;
    }

    /**
     * <p>
     * The query parameters for the specified <code>QueryAlias</code>.
     * </p>
     * 
     * @return The query parameters for the specified <code>QueryAlias</code>.
     */

    public java.util.List<String> getQueryParameters() {
        if (queryParameters == null) {
            queryParameters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return queryParameters;
    }

    /**
     * <p>
     * The query parameters for the specified <code>QueryAlias</code>.
     * </p>
     * 
     * @param queryParameters
     *        The query parameters for the specified <code>QueryAlias</code>.
     */

    public void setQueryParameters(java.util.Collection<String> queryParameters) {
        if (queryParameters == null) {
            this.queryParameters = null;
            return;
        }

        this.queryParameters = new com.amazonaws.internal.SdkInternalList<String>(queryParameters);
    }

    /**
     * <p>
     * The query parameters for the specified <code>QueryAlias</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryParameters(java.util.Collection)} or {@link #withQueryParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queryParameters
     *        The query parameters for the specified <code>QueryAlias</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withQueryParameters(String... queryParameters) {
        if (this.queryParameters == null) {
            setQueryParameters(new com.amazonaws.internal.SdkInternalList<String>(queryParameters.length));
        }
        for (String ele : queryParameters) {
            this.queryParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The query parameters for the specified <code>QueryAlias</code>.
     * </p>
     * 
     * @param queryParameters
     *        The query parameters for the specified <code>QueryAlias</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withQueryParameters(java.util.Collection<String> queryParameters) {
        setQueryParameters(queryParameters);
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
        if (getQueryStatement() != null)
            sb.append("QueryStatement: ").append(getQueryStatement()).append(",");
        if (getDeliveryS3Uri() != null)
            sb.append("DeliveryS3Uri: ").append(getDeliveryS3Uri()).append(",");
        if (getQueryAlias() != null)
            sb.append("QueryAlias: ").append(getQueryAlias()).append(",");
        if (getQueryParameters() != null)
            sb.append("QueryParameters: ").append(getQueryParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryRequest == false)
            return false;
        StartQueryRequest other = (StartQueryRequest) obj;
        if (other.getQueryStatement() == null ^ this.getQueryStatement() == null)
            return false;
        if (other.getQueryStatement() != null && other.getQueryStatement().equals(this.getQueryStatement()) == false)
            return false;
        if (other.getDeliveryS3Uri() == null ^ this.getDeliveryS3Uri() == null)
            return false;
        if (other.getDeliveryS3Uri() != null && other.getDeliveryS3Uri().equals(this.getDeliveryS3Uri()) == false)
            return false;
        if (other.getQueryAlias() == null ^ this.getQueryAlias() == null)
            return false;
        if (other.getQueryAlias() != null && other.getQueryAlias().equals(this.getQueryAlias()) == false)
            return false;
        if (other.getQueryParameters() == null ^ this.getQueryParameters() == null)
            return false;
        if (other.getQueryParameters() != null && other.getQueryParameters().equals(this.getQueryParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryStatement() == null) ? 0 : getQueryStatement().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3Uri() == null) ? 0 : getDeliveryS3Uri().hashCode());
        hashCode = prime * hashCode + ((getQueryAlias() == null) ? 0 : getQueryAlias().hashCode());
        hashCode = prime * hashCode + ((getQueryParameters() == null) ? 0 : getQueryParameters().hashCode());
        return hashCode;
    }

    @Override
    public StartQueryRequest clone() {
        return (StartQueryRequest) super.clone();
    }

}
