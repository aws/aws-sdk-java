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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the DataIntegration association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DataIntegrationAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataIntegrationAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration association.
     * </p>
     */
    private String dataIntegrationAssociationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN)of the DataIntegration.
     * </p>
     */
    private String dataIntegrationArn;
    /**
     * <p>
     * The identifier for teh client that is associated with the DataIntegration association.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration association.
     * </p>
     * 
     * @param dataIntegrationAssociationArn
     *        The Amazon Resource Name (ARN) of the DataIntegration association.
     */

    public void setDataIntegrationAssociationArn(String dataIntegrationAssociationArn) {
        this.dataIntegrationAssociationArn = dataIntegrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DataIntegration association.
     */

    public String getDataIntegrationAssociationArn() {
        return this.dataIntegrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DataIntegration association.
     * </p>
     * 
     * @param dataIntegrationAssociationArn
     *        The Amazon Resource Name (ARN) of the DataIntegration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIntegrationAssociationSummary withDataIntegrationAssociationArn(String dataIntegrationAssociationArn) {
        setDataIntegrationAssociationArn(dataIntegrationAssociationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the DataIntegration.
     * </p>
     * 
     * @param dataIntegrationArn
     *        The Amazon Resource Name (ARN)of the DataIntegration.
     */

    public void setDataIntegrationArn(String dataIntegrationArn) {
        this.dataIntegrationArn = dataIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the DataIntegration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN)of the DataIntegration.
     */

    public String getDataIntegrationArn() {
        return this.dataIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the DataIntegration.
     * </p>
     * 
     * @param dataIntegrationArn
     *        The Amazon Resource Name (ARN)of the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIntegrationAssociationSummary withDataIntegrationArn(String dataIntegrationArn) {
        setDataIntegrationArn(dataIntegrationArn);
        return this;
    }

    /**
     * <p>
     * The identifier for teh client that is associated with the DataIntegration association.
     * </p>
     * 
     * @param clientId
     *        The identifier for teh client that is associated with the DataIntegration association.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The identifier for teh client that is associated with the DataIntegration association.
     * </p>
     * 
     * @return The identifier for teh client that is associated with the DataIntegration association.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The identifier for teh client that is associated with the DataIntegration association.
     * </p>
     * 
     * @param clientId
     *        The identifier for teh client that is associated with the DataIntegration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIntegrationAssociationSummary withClientId(String clientId) {
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
        if (getDataIntegrationAssociationArn() != null)
            sb.append("DataIntegrationAssociationArn: ").append(getDataIntegrationAssociationArn()).append(",");
        if (getDataIntegrationArn() != null)
            sb.append("DataIntegrationArn: ").append(getDataIntegrationArn()).append(",");
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

        if (obj instanceof DataIntegrationAssociationSummary == false)
            return false;
        DataIntegrationAssociationSummary other = (DataIntegrationAssociationSummary) obj;
        if (other.getDataIntegrationAssociationArn() == null ^ this.getDataIntegrationAssociationArn() == null)
            return false;
        if (other.getDataIntegrationAssociationArn() != null
                && other.getDataIntegrationAssociationArn().equals(this.getDataIntegrationAssociationArn()) == false)
            return false;
        if (other.getDataIntegrationArn() == null ^ this.getDataIntegrationArn() == null)
            return false;
        if (other.getDataIntegrationArn() != null && other.getDataIntegrationArn().equals(this.getDataIntegrationArn()) == false)
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

        hashCode = prime * hashCode + ((getDataIntegrationAssociationArn() == null) ? 0 : getDataIntegrationAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getDataIntegrationArn() == null) ? 0 : getDataIntegrationArn().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public DataIntegrationAssociationSummary clone() {
        try {
            return (DataIntegrationAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.DataIntegrationAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
