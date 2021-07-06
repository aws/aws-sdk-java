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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an API operation that an entity invoked for an affected resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ApiCallDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiCallDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the operation that was invoked most recently and produced the finding.
     * </p>
     */
    private String api;
    /**
     * <p>
     * The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
     * </p>
     */
    private String apiServiceName;
    /**
     * <p>
     * The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced the
     * finding.
     * </p>
     */
    private java.util.Date firstSeen;
    /**
     * <p>
     * The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was
     * invoked and produced the finding.
     * </p>
     */
    private java.util.Date lastSeen;

    /**
     * <p>
     * The name of the operation that was invoked most recently and produced the finding.
     * </p>
     * 
     * @param api
     *        The name of the operation that was invoked most recently and produced the finding.
     */

    public void setApi(String api) {
        this.api = api;
    }

    /**
     * <p>
     * The name of the operation that was invoked most recently and produced the finding.
     * </p>
     * 
     * @return The name of the operation that was invoked most recently and produced the finding.
     */

    public String getApi() {
        return this.api;
    }

    /**
     * <p>
     * The name of the operation that was invoked most recently and produced the finding.
     * </p>
     * 
     * @param api
     *        The name of the operation that was invoked most recently and produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCallDetails withApi(String api) {
        setApi(api);
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
     * </p>
     * 
     * @param apiServiceName
     *        The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
     */

    public void setApiServiceName(String apiServiceName) {
        this.apiServiceName = apiServiceName;
    }

    /**
     * <p>
     * The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
     * </p>
     * 
     * @return The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
     */

    public String getApiServiceName() {
        return this.apiServiceName;
    }

    /**
     * <p>
     * The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
     * </p>
     * 
     * @param apiServiceName
     *        The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCallDetails withApiServiceName(String apiServiceName) {
        setApiServiceName(apiServiceName);
        return this;
    }

    /**
     * <p>
     * The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced the
     * finding.
     * </p>
     * 
     * @param firstSeen
     *        The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced
     *        the finding.
     */

    public void setFirstSeen(java.util.Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * <p>
     * The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced the
     * finding.
     * </p>
     * 
     * @return The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced
     *         the finding.
     */

    public java.util.Date getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * <p>
     * The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced the
     * finding.
     * </p>
     * 
     * @param firstSeen
     *        The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced
     *        the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCallDetails withFirstSeen(java.util.Date firstSeen) {
        setFirstSeen(firstSeen);
        return this;
    }

    /**
     * <p>
     * The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was
     * invoked and produced the finding.
     * </p>
     * 
     * @param lastSeen
     *        The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was
     *        invoked and produced the finding.
     */

    public void setLastSeen(java.util.Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * <p>
     * The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was
     * invoked and produced the finding.
     * </p>
     * 
     * @return The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api)
     *         was invoked and produced the finding.
     */

    public java.util.Date getLastSeen() {
        return this.lastSeen;
    }

    /**
     * <p>
     * The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was
     * invoked and produced the finding.
     * </p>
     * 
     * @param lastSeen
     *        The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was
     *        invoked and produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCallDetails withLastSeen(java.util.Date lastSeen) {
        setLastSeen(lastSeen);
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
        if (getApi() != null)
            sb.append("Api: ").append(getApi()).append(",");
        if (getApiServiceName() != null)
            sb.append("ApiServiceName: ").append(getApiServiceName()).append(",");
        if (getFirstSeen() != null)
            sb.append("FirstSeen: ").append(getFirstSeen()).append(",");
        if (getLastSeen() != null)
            sb.append("LastSeen: ").append(getLastSeen());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiCallDetails == false)
            return false;
        ApiCallDetails other = (ApiCallDetails) obj;
        if (other.getApi() == null ^ this.getApi() == null)
            return false;
        if (other.getApi() != null && other.getApi().equals(this.getApi()) == false)
            return false;
        if (other.getApiServiceName() == null ^ this.getApiServiceName() == null)
            return false;
        if (other.getApiServiceName() != null && other.getApiServiceName().equals(this.getApiServiceName()) == false)
            return false;
        if (other.getFirstSeen() == null ^ this.getFirstSeen() == null)
            return false;
        if (other.getFirstSeen() != null && other.getFirstSeen().equals(this.getFirstSeen()) == false)
            return false;
        if (other.getLastSeen() == null ^ this.getLastSeen() == null)
            return false;
        if (other.getLastSeen() != null && other.getLastSeen().equals(this.getLastSeen()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApi() == null) ? 0 : getApi().hashCode());
        hashCode = prime * hashCode + ((getApiServiceName() == null) ? 0 : getApiServiceName().hashCode());
        hashCode = prime * hashCode + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        hashCode = prime * hashCode + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        return hashCode;
    }

    @Override
    public ApiCallDetails clone() {
        try {
            return (ApiCallDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ApiCallDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
