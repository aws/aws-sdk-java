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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector metadata specific to Salesforce.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SalesforceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired authorization scope for the Salesforce account.
     * </p>
     */
    private java.util.List<String> oAuthScopes;

    /**
     * <p>
     * The desired authorization scope for the Salesforce account.
     * </p>
     * 
     * @return The desired authorization scope for the Salesforce account.
     */

    public java.util.List<String> getOAuthScopes() {
        return oAuthScopes;
    }

    /**
     * <p>
     * The desired authorization scope for the Salesforce account.
     * </p>
     * 
     * @param oAuthScopes
     *        The desired authorization scope for the Salesforce account.
     */

    public void setOAuthScopes(java.util.Collection<String> oAuthScopes) {
        if (oAuthScopes == null) {
            this.oAuthScopes = null;
            return;
        }

        this.oAuthScopes = new java.util.ArrayList<String>(oAuthScopes);
    }

    /**
     * <p>
     * The desired authorization scope for the Salesforce account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOAuthScopes(java.util.Collection)} or {@link #withOAuthScopes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oAuthScopes
     *        The desired authorization scope for the Salesforce account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceMetadata withOAuthScopes(String... oAuthScopes) {
        if (this.oAuthScopes == null) {
            setOAuthScopes(new java.util.ArrayList<String>(oAuthScopes.length));
        }
        for (String ele : oAuthScopes) {
            this.oAuthScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The desired authorization scope for the Salesforce account.
     * </p>
     * 
     * @param oAuthScopes
     *        The desired authorization scope for the Salesforce account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceMetadata withOAuthScopes(java.util.Collection<String> oAuthScopes) {
        setOAuthScopes(oAuthScopes);
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
        if (getOAuthScopes() != null)
            sb.append("OAuthScopes: ").append(getOAuthScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceMetadata == false)
            return false;
        SalesforceMetadata other = (SalesforceMetadata) obj;
        if (other.getOAuthScopes() == null ^ this.getOAuthScopes() == null)
            return false;
        if (other.getOAuthScopes() != null && other.getOAuthScopes().equals(this.getOAuthScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOAuthScopes() == null) ? 0 : getOAuthScopes().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceMetadata clone() {
        try {
            return (SalesforceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SalesforceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
