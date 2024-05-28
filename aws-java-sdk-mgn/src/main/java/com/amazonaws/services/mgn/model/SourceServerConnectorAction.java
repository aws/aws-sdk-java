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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Source Server connector action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/SourceServerConnectorAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceServerConnectorAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source Server connector action connector arn.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * Source Server connector action credentials secret arn.
     * </p>
     */
    private String credentialsSecretArn;

    /**
     * <p>
     * Source Server connector action connector arn.
     * </p>
     * 
     * @param connectorArn
     *        Source Server connector action connector arn.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * Source Server connector action connector arn.
     * </p>
     * 
     * @return Source Server connector action connector arn.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * Source Server connector action connector arn.
     * </p>
     * 
     * @param connectorArn
     *        Source Server connector action connector arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServerConnectorAction withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * Source Server connector action credentials secret arn.
     * </p>
     * 
     * @param credentialsSecretArn
     *        Source Server connector action credentials secret arn.
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * <p>
     * Source Server connector action credentials secret arn.
     * </p>
     * 
     * @return Source Server connector action credentials secret arn.
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * <p>
     * Source Server connector action credentials secret arn.
     * </p>
     * 
     * @param credentialsSecretArn
     *        Source Server connector action credentials secret arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServerConnectorAction withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
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
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getCredentialsSecretArn() != null)
            sb.append("CredentialsSecretArn: ").append(getCredentialsSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceServerConnectorAction == false)
            return false;
        SourceServerConnectorAction other = (SourceServerConnectorAction) obj;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public SourceServerConnectorAction clone() {
        try {
            return (SourceServerConnectorAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.SourceServerConnectorActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
