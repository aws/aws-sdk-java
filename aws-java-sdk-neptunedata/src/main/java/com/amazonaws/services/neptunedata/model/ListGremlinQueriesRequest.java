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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListGremlinQueries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGremlinQueriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If set to <code>TRUE</code>, the list returned includes waiting queries. The default is <code>FALSE</code>;
     * </p>
     */
    private Boolean includeWaiting;

    /**
     * <p>
     * If set to <code>TRUE</code>, the list returned includes waiting queries. The default is <code>FALSE</code>;
     * </p>
     * 
     * @param includeWaiting
     *        If set to <code>TRUE</code>, the list returned includes waiting queries. The default is <code>FALSE</code>
     *        ;
     */

    public void setIncludeWaiting(Boolean includeWaiting) {
        this.includeWaiting = includeWaiting;
    }

    /**
     * <p>
     * If set to <code>TRUE</code>, the list returned includes waiting queries. The default is <code>FALSE</code>;
     * </p>
     * 
     * @return If set to <code>TRUE</code>, the list returned includes waiting queries. The default is
     *         <code>FALSE</code>;
     */

    public Boolean getIncludeWaiting() {
        return this.includeWaiting;
    }

    /**
     * <p>
     * If set to <code>TRUE</code>, the list returned includes waiting queries. The default is <code>FALSE</code>;
     * </p>
     * 
     * @param includeWaiting
     *        If set to <code>TRUE</code>, the list returned includes waiting queries. The default is <code>FALSE</code>
     *        ;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGremlinQueriesRequest withIncludeWaiting(Boolean includeWaiting) {
        setIncludeWaiting(includeWaiting);
        return this;
    }

    /**
     * <p>
     * If set to <code>TRUE</code>, the list returned includes waiting queries. The default is <code>FALSE</code>;
     * </p>
     * 
     * @return If set to <code>TRUE</code>, the list returned includes waiting queries. The default is
     *         <code>FALSE</code>;
     */

    public Boolean isIncludeWaiting() {
        return this.includeWaiting;
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
        if (getIncludeWaiting() != null)
            sb.append("IncludeWaiting: ").append(getIncludeWaiting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGremlinQueriesRequest == false)
            return false;
        ListGremlinQueriesRequest other = (ListGremlinQueriesRequest) obj;
        if (other.getIncludeWaiting() == null ^ this.getIncludeWaiting() == null)
            return false;
        if (other.getIncludeWaiting() != null && other.getIncludeWaiting().equals(this.getIncludeWaiting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeWaiting() == null) ? 0 : getIncludeWaiting().hashCode());
        return hashCode;
    }

    @Override
    public ListGremlinQueriesRequest clone() {
        return (ListGremlinQueriesRequest) super.clone();
    }

}
