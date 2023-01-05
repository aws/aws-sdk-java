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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DataConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataConnector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Lambda function associated with this data connector.
     * </p>
     */
    private LambdaFunction lambda;
    /**
     * <p>
     * A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     * </p>
     */
    private Boolean isNative;

    /**
     * <p>
     * The Lambda function associated with this data connector.
     * </p>
     * 
     * @param lambda
     *        The Lambda function associated with this data connector.
     */

    public void setLambda(LambdaFunction lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * The Lambda function associated with this data connector.
     * </p>
     * 
     * @return The Lambda function associated with this data connector.
     */

    public LambdaFunction getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * The Lambda function associated with this data connector.
     * </p>
     * 
     * @param lambda
     *        The Lambda function associated with this data connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataConnector withLambda(LambdaFunction lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     * </p>
     * 
     * @param isNative
     *        A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     */

    public void setIsNative(Boolean isNative) {
        this.isNative = isNative;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     * </p>
     * 
     * @return A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     */

    public Boolean getIsNative() {
        return this.isNative;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     * </p>
     * 
     * @param isNative
     *        A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataConnector withIsNative(Boolean isNative) {
        setIsNative(isNative);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     * </p>
     * 
     * @return A Boolean value that specifies whether the data connector is native to IoT TwinMaker.
     */

    public Boolean isNative() {
        return this.isNative;
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
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda()).append(",");
        if (getIsNative() != null)
            sb.append("IsNative: ").append(getIsNative());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataConnector == false)
            return false;
        DataConnector other = (DataConnector) obj;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getIsNative() == null ^ this.getIsNative() == null)
            return false;
        if (other.getIsNative() != null && other.getIsNative().equals(this.getIsNative()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getIsNative() == null) ? 0 : getIsNative().hashCode());
        return hashCode;
    }

    @Override
    public DataConnector clone() {
        try {
            return (DataConnector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.DataConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
