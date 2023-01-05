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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about how this workspace works with IAM Identity Center.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AwsSsoAuthentication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSsoAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana.
     * </p>
     */
    private String ssoClientId;

    /**
     * <p>
     * The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana.
     * </p>
     * 
     * @param ssoClientId
     *        The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana.
     */

    public void setSsoClientId(String ssoClientId) {
        this.ssoClientId = ssoClientId;
    }

    /**
     * <p>
     * The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana.
     * </p>
     * 
     * @return The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana.
     */

    public String getSsoClientId() {
        return this.ssoClientId;
    }

    /**
     * <p>
     * The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana.
     * </p>
     * 
     * @param ssoClientId
     *        The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsoAuthentication withSsoClientId(String ssoClientId) {
        setSsoClientId(ssoClientId);
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
        if (getSsoClientId() != null)
            sb.append("SsoClientId: ").append(getSsoClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSsoAuthentication == false)
            return false;
        AwsSsoAuthentication other = (AwsSsoAuthentication) obj;
        if (other.getSsoClientId() == null ^ this.getSsoClientId() == null)
            return false;
        if (other.getSsoClientId() != null && other.getSsoClientId().equals(this.getSsoClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSsoClientId() == null) ? 0 : getSsoClientId().hashCode());
        return hashCode;
    }

    @Override
    public AwsSsoAuthentication clone() {
        try {
            return (AwsSsoAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.AwsSsoAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
