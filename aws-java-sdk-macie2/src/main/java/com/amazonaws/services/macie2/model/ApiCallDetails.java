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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/ApiCallDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiCallDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String api;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String apiServiceName;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.Date firstSeen;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.Date lastSeen;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param api
     *        Reserved for future use.
     */

    public void setApi(String api) {
        this.api = api;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getApi() {
        return this.api;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param api
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCallDetails withApi(String api) {
        setApi(api);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param apiServiceName
     *        Reserved for future use.
     */

    public void setApiServiceName(String apiServiceName) {
        this.apiServiceName = apiServiceName;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getApiServiceName() {
        return this.apiServiceName;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param apiServiceName
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCallDetails withApiServiceName(String apiServiceName) {
        setApiServiceName(apiServiceName);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param firstSeen
     *        Reserved for future use.
     */

    public void setFirstSeen(java.util.Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public java.util.Date getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param firstSeen
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCallDetails withFirstSeen(java.util.Date firstSeen) {
        setFirstSeen(firstSeen);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param lastSeen
     *        Reserved for future use.
     */

    public void setLastSeen(java.util.Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public java.util.Date getLastSeen() {
        return this.lastSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param lastSeen
     *        Reserved for future use.
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
