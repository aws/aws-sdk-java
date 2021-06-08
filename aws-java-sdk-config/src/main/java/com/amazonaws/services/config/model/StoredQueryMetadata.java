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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns details of a specific query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StoredQueryMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StoredQueryMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the query. For example,
     * arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     * </p>
     */
    private String queryArn;
    /**
     * <p>
     * The name of the query.
     * </p>
     */
    private String queryName;
    /**
     * <p>
     * A unique description for the query.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the query.
     * </p>
     * 
     * @param queryId
     *        The ID of the query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the query.
     * </p>
     * 
     * @return The ID of the query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the query.
     * </p>
     * 
     * @param queryId
     *        The ID of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoredQueryMetadata withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the query. For example,
     * arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     * </p>
     * 
     * @param queryArn
     *        Amazon Resource Name (ARN) of the query. For example,
     *        arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     */

    public void setQueryArn(String queryArn) {
        this.queryArn = queryArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the query. For example,
     * arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the query. For example,
     *         arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     */

    public String getQueryArn() {
        return this.queryArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the query. For example,
     * arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     * </p>
     * 
     * @param queryArn
     *        Amazon Resource Name (ARN) of the query. For example,
     *        arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoredQueryMetadata withQueryArn(String queryArn) {
        setQueryArn(queryArn);
        return this;
    }

    /**
     * <p>
     * The name of the query.
     * </p>
     * 
     * @param queryName
     *        The name of the query.
     */

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    /**
     * <p>
     * The name of the query.
     * </p>
     * 
     * @return The name of the query.
     */

    public String getQueryName() {
        return this.queryName;
    }

    /**
     * <p>
     * The name of the query.
     * </p>
     * 
     * @param queryName
     *        The name of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoredQueryMetadata withQueryName(String queryName) {
        setQueryName(queryName);
        return this;
    }

    /**
     * <p>
     * A unique description for the query.
     * </p>
     * 
     * @param description
     *        A unique description for the query.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A unique description for the query.
     * </p>
     * 
     * @return A unique description for the query.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A unique description for the query.
     * </p>
     * 
     * @param description
     *        A unique description for the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoredQueryMetadata withDescription(String description) {
        setDescription(description);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getQueryArn() != null)
            sb.append("QueryArn: ").append(getQueryArn()).append(",");
        if (getQueryName() != null)
            sb.append("QueryName: ").append(getQueryName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StoredQueryMetadata == false)
            return false;
        StoredQueryMetadata other = (StoredQueryMetadata) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryArn() == null ^ this.getQueryArn() == null)
            return false;
        if (other.getQueryArn() != null && other.getQueryArn().equals(this.getQueryArn()) == false)
            return false;
        if (other.getQueryName() == null ^ this.getQueryName() == null)
            return false;
        if (other.getQueryName() != null && other.getQueryName().equals(this.getQueryName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryArn() == null) ? 0 : getQueryArn().hashCode());
        hashCode = prime * hashCode + ((getQueryName() == null) ? 0 : getQueryName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public StoredQueryMetadata clone() {
        try {
            return (StoredQueryMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.StoredQueryMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
