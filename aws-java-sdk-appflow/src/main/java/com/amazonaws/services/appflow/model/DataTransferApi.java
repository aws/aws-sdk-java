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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The API of the connector application that Amazon AppFlow uses to transfer your data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DataTransferApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataTransferApi implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the connector application API.
     * </p>
     */
    private String name;
    /**
     * <p>
     * You can specify one of the following types:
     * </p>
     * <dl>
     * <dt>AUTOMATIC</dt>
     * <dd>
     * <p>
     * The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run, Amazon
     * AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run transfers.
     * </p>
     * </dd>
     * <dt>SYNC</dt>
     * <dd>
     * <p>
     * A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     * </p>
     * </dd>
     * <dt>ASYNC</dt>
     * <dd>
     * <p>
     * An asynchronous API. This type of API optimizes a flow for large datasets.
     * </p>
     * </dd>
     * </dl>
     */
    private String type;

    /**
     * <p>
     * The name of the connector application API.
     * </p>
     * 
     * @param name
     *        The name of the connector application API.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the connector application API.
     * </p>
     * 
     * @return The name of the connector application API.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the connector application API.
     * </p>
     * 
     * @param name
     *        The name of the connector application API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransferApi withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * You can specify one of the following types:
     * </p>
     * <dl>
     * <dt>AUTOMATIC</dt>
     * <dd>
     * <p>
     * The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run, Amazon
     * AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run transfers.
     * </p>
     * </dd>
     * <dt>SYNC</dt>
     * <dd>
     * <p>
     * A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     * </p>
     * </dd>
     * <dt>ASYNC</dt>
     * <dd>
     * <p>
     * An asynchronous API. This type of API optimizes a flow for large datasets.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        You can specify one of the following types:</p>
     *        <dl>
     *        <dt>AUTOMATIC</dt>
     *        <dd>
     *        <p>
     *        The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run,
     *        Amazon AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run
     *        transfers.
     *        </p>
     *        </dd>
     *        <dt>SYNC</dt>
     *        <dd>
     *        <p>
     *        A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     *        </p>
     *        </dd>
     *        <dt>ASYNC</dt>
     *        <dd>
     *        <p>
     *        An asynchronous API. This type of API optimizes a flow for large datasets.
     *        </p>
     *        </dd>
     * @see DataTransferApiType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * You can specify one of the following types:
     * </p>
     * <dl>
     * <dt>AUTOMATIC</dt>
     * <dd>
     * <p>
     * The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run, Amazon
     * AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run transfers.
     * </p>
     * </dd>
     * <dt>SYNC</dt>
     * <dd>
     * <p>
     * A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     * </p>
     * </dd>
     * <dt>ASYNC</dt>
     * <dd>
     * <p>
     * An asynchronous API. This type of API optimizes a flow for large datasets.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return You can specify one of the following types:</p>
     *         <dl>
     *         <dt>AUTOMATIC</dt>
     *         <dd>
     *         <p>
     *         The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run,
     *         Amazon AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run
     *         transfers.
     *         </p>
     *         </dd>
     *         <dt>SYNC</dt>
     *         <dd>
     *         <p>
     *         A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     *         </p>
     *         </dd>
     *         <dt>ASYNC</dt>
     *         <dd>
     *         <p>
     *         An asynchronous API. This type of API optimizes a flow for large datasets.
     *         </p>
     *         </dd>
     * @see DataTransferApiType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * You can specify one of the following types:
     * </p>
     * <dl>
     * <dt>AUTOMATIC</dt>
     * <dd>
     * <p>
     * The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run, Amazon
     * AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run transfers.
     * </p>
     * </dd>
     * <dt>SYNC</dt>
     * <dd>
     * <p>
     * A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     * </p>
     * </dd>
     * <dt>ASYNC</dt>
     * <dd>
     * <p>
     * An asynchronous API. This type of API optimizes a flow for large datasets.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        You can specify one of the following types:</p>
     *        <dl>
     *        <dt>AUTOMATIC</dt>
     *        <dd>
     *        <p>
     *        The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run,
     *        Amazon AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run
     *        transfers.
     *        </p>
     *        </dd>
     *        <dt>SYNC</dt>
     *        <dd>
     *        <p>
     *        A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     *        </p>
     *        </dd>
     *        <dt>ASYNC</dt>
     *        <dd>
     *        <p>
     *        An asynchronous API. This type of API optimizes a flow for large datasets.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataTransferApiType
     */

    public DataTransferApi withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * You can specify one of the following types:
     * </p>
     * <dl>
     * <dt>AUTOMATIC</dt>
     * <dd>
     * <p>
     * The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run, Amazon
     * AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run transfers.
     * </p>
     * </dd>
     * <dt>SYNC</dt>
     * <dd>
     * <p>
     * A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     * </p>
     * </dd>
     * <dt>ASYNC</dt>
     * <dd>
     * <p>
     * An asynchronous API. This type of API optimizes a flow for large datasets.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        You can specify one of the following types:</p>
     *        <dl>
     *        <dt>AUTOMATIC</dt>
     *        <dd>
     *        <p>
     *        The default. Optimizes a flow for datasets that fluctuate in size from small to large. For each flow run,
     *        Amazon AppFlow chooses to use the SYNC or ASYNC API type based on the amount of data that the run
     *        transfers.
     *        </p>
     *        </dd>
     *        <dt>SYNC</dt>
     *        <dd>
     *        <p>
     *        A synchronous API. This type of API optimizes a flow for small to medium-sized datasets.
     *        </p>
     *        </dd>
     *        <dt>ASYNC</dt>
     *        <dd>
     *        <p>
     *        An asynchronous API. This type of API optimizes a flow for large datasets.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataTransferApiType
     */

    public DataTransferApi withType(DataTransferApiType type) {
        this.type = type.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataTransferApi == false)
            return false;
        DataTransferApi other = (DataTransferApi) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DataTransferApi clone() {
        try {
            return (DataTransferApi) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.DataTransferApiMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
