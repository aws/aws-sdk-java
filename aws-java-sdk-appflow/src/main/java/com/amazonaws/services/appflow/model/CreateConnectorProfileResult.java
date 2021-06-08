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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateConnectorProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectorProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     */
    private String connectorProfileArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     * 
     * @param connectorProfileArn
     *        The Amazon Resource Name (ARN) of the connector profile.
     */

    public void setConnectorProfileArn(String connectorProfileArn) {
        this.connectorProfileArn = connectorProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connector profile.
     */

    public String getConnectorProfileArn() {
        return this.connectorProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector profile.
     * </p>
     * 
     * @param connectorProfileArn
     *        The Amazon Resource Name (ARN) of the connector profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorProfileResult withConnectorProfileArn(String connectorProfileArn) {
        setConnectorProfileArn(connectorProfileArn);
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
        if (getConnectorProfileArn() != null)
            sb.append("ConnectorProfileArn: ").append(getConnectorProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectorProfileResult == false)
            return false;
        CreateConnectorProfileResult other = (CreateConnectorProfileResult) obj;
        if (other.getConnectorProfileArn() == null ^ this.getConnectorProfileArn() == null)
            return false;
        if (other.getConnectorProfileArn() != null && other.getConnectorProfileArn().equals(this.getConnectorProfileArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorProfileArn() == null) ? 0 : getConnectorProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectorProfileResult clone() {
        try {
            return (CreateConnectorProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
