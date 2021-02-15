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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutStoredQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStoredQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the query. For example,
     * arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
     * </p>
     */
    private String queryArn;

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

    public PutStoredQueryResult withQueryArn(String queryArn) {
        setQueryArn(queryArn);
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
        if (getQueryArn() != null)
            sb.append("QueryArn: ").append(getQueryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutStoredQueryResult == false)
            return false;
        PutStoredQueryResult other = (PutStoredQueryResult) obj;
        if (other.getQueryArn() == null ^ this.getQueryArn() == null)
            return false;
        if (other.getQueryArn() != null && other.getQueryArn().equals(this.getQueryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryArn() == null) ? 0 : getQueryArn().hashCode());
        return hashCode;
    }

    @Override
    public PutStoredQueryResult clone() {
        try {
            return (PutStoredQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
