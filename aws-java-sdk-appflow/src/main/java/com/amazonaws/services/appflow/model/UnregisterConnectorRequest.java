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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UnregisterConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnregisterConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     */
    private String connectorLabel;
    /**
     * <p>
     * Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or more
     * connector profiles. The default value is false.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     * 
     * @param connectorLabel
     *        The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon
     *        Web Services account.
     */

    public void setConnectorLabel(String connectorLabel) {
        this.connectorLabel = connectorLabel;
    }

    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     * 
     * @return The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your
     *         Amazon Web Services account.
     */

    public String getConnectorLabel() {
        return this.connectorLabel;
    }

    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account.
     * </p>
     * 
     * @param connectorLabel
     *        The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon
     *        Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnregisterConnectorRequest withConnectorLabel(String connectorLabel) {
        setConnectorLabel(connectorLabel);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or more
     * connector profiles. The default value is false.
     * </p>
     * 
     * @param forceDelete
     *        Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or
     *        more connector profiles. The default value is false.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or more
     * connector profiles. The default value is false.
     * </p>
     * 
     * @return Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one
     *         or more connector profiles. The default value is false.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or more
     * connector profiles. The default value is false.
     * </p>
     * 
     * @param forceDelete
     *        Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or
     *        more connector profiles. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnregisterConnectorRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one or more
     * connector profiles. The default value is false.
     * </p>
     * 
     * @return Indicates whether Amazon AppFlow should unregister the connector, even if it is currently in use in one
     *         or more connector profiles. The default value is false.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getConnectorLabel() != null)
            sb.append("ConnectorLabel: ").append(getConnectorLabel()).append(",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnregisterConnectorRequest == false)
            return false;
        UnregisterConnectorRequest other = (UnregisterConnectorRequest) obj;
        if (other.getConnectorLabel() == null ^ this.getConnectorLabel() == null)
            return false;
        if (other.getConnectorLabel() != null && other.getConnectorLabel().equals(this.getConnectorLabel()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorLabel() == null) ? 0 : getConnectorLabel().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public UnregisterConnectorRequest clone() {
        return (UnregisterConnectorRequest) super.clone();
    }

}
