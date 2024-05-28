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
 * Summary information about the Application Association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ApplicationAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Association.
     * </p>
     */
    private String applicationAssociationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The identifier for the client that is associated with the Application Association.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Association.
     * </p>
     * 
     * @param applicationAssociationArn
     *        The Amazon Resource Name (ARN) of the Application Association.
     */

    public void setApplicationAssociationArn(String applicationAssociationArn) {
        this.applicationAssociationArn = applicationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Application Association.
     */

    public String getApplicationAssociationArn() {
        return this.applicationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application Association.
     * </p>
     * 
     * @param applicationAssociationArn
     *        The Amazon Resource Name (ARN) of the Application Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationAssociationSummary withApplicationAssociationArn(String applicationAssociationArn) {
        setApplicationAssociationArn(applicationAssociationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the Application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the Application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationAssociationSummary withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The identifier for the client that is associated with the Application Association.
     * </p>
     * 
     * @param clientId
     *        The identifier for the client that is associated with the Application Association.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The identifier for the client that is associated with the Application Association.
     * </p>
     * 
     * @return The identifier for the client that is associated with the Application Association.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The identifier for the client that is associated with the Application Association.
     * </p>
     * 
     * @param clientId
     *        The identifier for the client that is associated with the Application Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationAssociationSummary withClientId(String clientId) {
        setClientId(clientId);
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
        if (getApplicationAssociationArn() != null)
            sb.append("ApplicationAssociationArn: ").append(getApplicationAssociationArn()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationAssociationSummary == false)
            return false;
        ApplicationAssociationSummary other = (ApplicationAssociationSummary) obj;
        if (other.getApplicationAssociationArn() == null ^ this.getApplicationAssociationArn() == null)
            return false;
        if (other.getApplicationAssociationArn() != null && other.getApplicationAssociationArn().equals(this.getApplicationAssociationArn()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationAssociationArn() == null) ? 0 : getApplicationAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationAssociationSummary clone() {
        try {
            return (ApplicationAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.ApplicationAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
