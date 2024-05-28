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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains information about your connector.
     * </p>
     */
    private Connector connector;

    /**
     * <p>
     * A structure that contains information about your connector.
     * </p>
     * 
     * @param connector
     *        A structure that contains information about your connector.
     */

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    /**
     * <p>
     * A structure that contains information about your connector.
     * </p>
     * 
     * @return A structure that contains information about your connector.
     */

    public Connector getConnector() {
        return this.connector;
    }

    /**
     * <p>
     * A structure that contains information about your connector.
     * </p>
     * 
     * @param connector
     *        A structure that contains information about your connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectorResult withConnector(Connector connector) {
        setConnector(connector);
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
        if (getConnector() != null)
            sb.append("Connector: ").append(getConnector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectorResult == false)
            return false;
        GetConnectorResult other = (GetConnectorResult) obj;
        if (other.getConnector() == null ^ this.getConnector() == null)
            return false;
        if (other.getConnector() != null && other.getConnector().equals(this.getConnector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnector() == null) ? 0 : getConnector().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectorResult clone() {
        try {
            return (GetConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
