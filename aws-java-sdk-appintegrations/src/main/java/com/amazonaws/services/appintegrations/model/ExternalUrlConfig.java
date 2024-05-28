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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The external URL source for the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ExternalUrlConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalUrlConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL to access the application.
     * </p>
     */
    private String accessUrl;
    /**
     * <p>
     * Additional URLs to allow list if different than the access URL.
     * </p>
     */
    private java.util.List<String> approvedOrigins;

    /**
     * <p>
     * The URL to access the application.
     * </p>
     * 
     * @param accessUrl
     *        The URL to access the application.
     */

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    /**
     * <p>
     * The URL to access the application.
     * </p>
     * 
     * @return The URL to access the application.
     */

    public String getAccessUrl() {
        return this.accessUrl;
    }

    /**
     * <p>
     * The URL to access the application.
     * </p>
     * 
     * @param accessUrl
     *        The URL to access the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalUrlConfig withAccessUrl(String accessUrl) {
        setAccessUrl(accessUrl);
        return this;
    }

    /**
     * <p>
     * Additional URLs to allow list if different than the access URL.
     * </p>
     * 
     * @return Additional URLs to allow list if different than the access URL.
     */

    public java.util.List<String> getApprovedOrigins() {
        return approvedOrigins;
    }

    /**
     * <p>
     * Additional URLs to allow list if different than the access URL.
     * </p>
     * 
     * @param approvedOrigins
     *        Additional URLs to allow list if different than the access URL.
     */

    public void setApprovedOrigins(java.util.Collection<String> approvedOrigins) {
        if (approvedOrigins == null) {
            this.approvedOrigins = null;
            return;
        }

        this.approvedOrigins = new java.util.ArrayList<String>(approvedOrigins);
    }

    /**
     * <p>
     * Additional URLs to allow list if different than the access URL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovedOrigins(java.util.Collection)} or {@link #withApprovedOrigins(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param approvedOrigins
     *        Additional URLs to allow list if different than the access URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalUrlConfig withApprovedOrigins(String... approvedOrigins) {
        if (this.approvedOrigins == null) {
            setApprovedOrigins(new java.util.ArrayList<String>(approvedOrigins.length));
        }
        for (String ele : approvedOrigins) {
            this.approvedOrigins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional URLs to allow list if different than the access URL.
     * </p>
     * 
     * @param approvedOrigins
     *        Additional URLs to allow list if different than the access URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalUrlConfig withApprovedOrigins(java.util.Collection<String> approvedOrigins) {
        setApprovedOrigins(approvedOrigins);
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
        if (getAccessUrl() != null)
            sb.append("AccessUrl: ").append(getAccessUrl()).append(",");
        if (getApprovedOrigins() != null)
            sb.append("ApprovedOrigins: ").append(getApprovedOrigins());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalUrlConfig == false)
            return false;
        ExternalUrlConfig other = (ExternalUrlConfig) obj;
        if (other.getAccessUrl() == null ^ this.getAccessUrl() == null)
            return false;
        if (other.getAccessUrl() != null && other.getAccessUrl().equals(this.getAccessUrl()) == false)
            return false;
        if (other.getApprovedOrigins() == null ^ this.getApprovedOrigins() == null)
            return false;
        if (other.getApprovedOrigins() != null && other.getApprovedOrigins().equals(this.getApprovedOrigins()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessUrl() == null) ? 0 : getAccessUrl().hashCode());
        hashCode = prime * hashCode + ((getApprovedOrigins() == null) ? 0 : getApprovedOrigins().hashCode());
        return hashCode;
    }

    @Override
    public ExternalUrlConfig clone() {
        try {
            return (ExternalUrlConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.ExternalUrlConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
