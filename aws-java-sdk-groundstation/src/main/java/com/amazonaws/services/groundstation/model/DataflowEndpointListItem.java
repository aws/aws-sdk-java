/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Item in a list of <code>DataflowEndpoint</code> groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DataflowEndpointListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataflowEndpointListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     */
    private String dataflowEndpointGroupArn;
    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     */
    private String dataflowEndpointGroupId;

    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupArn
     *        ARN of a dataflow endpoint group.
     */

    public void setDataflowEndpointGroupArn(String dataflowEndpointGroupArn) {
        this.dataflowEndpointGroupArn = dataflowEndpointGroupArn;
    }

    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     * 
     * @return ARN of a dataflow endpoint group.
     */

    public String getDataflowEndpointGroupArn() {
        return this.dataflowEndpointGroupArn;
    }

    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupArn
     *        ARN of a dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowEndpointListItem withDataflowEndpointGroupArn(String dataflowEndpointGroupArn) {
        setDataflowEndpointGroupArn(dataflowEndpointGroupArn);
        return this;
    }

    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupId
     *        UUID of a dataflow endpoint group.
     */

    public void setDataflowEndpointGroupId(String dataflowEndpointGroupId) {
        this.dataflowEndpointGroupId = dataflowEndpointGroupId;
    }

    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     * 
     * @return UUID of a dataflow endpoint group.
     */

    public String getDataflowEndpointGroupId() {
        return this.dataflowEndpointGroupId;
    }

    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupId
     *        UUID of a dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowEndpointListItem withDataflowEndpointGroupId(String dataflowEndpointGroupId) {
        setDataflowEndpointGroupId(dataflowEndpointGroupId);
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
        if (getDataflowEndpointGroupArn() != null)
            sb.append("DataflowEndpointGroupArn: ").append(getDataflowEndpointGroupArn()).append(",");
        if (getDataflowEndpointGroupId() != null)
            sb.append("DataflowEndpointGroupId: ").append(getDataflowEndpointGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataflowEndpointListItem == false)
            return false;
        DataflowEndpointListItem other = (DataflowEndpointListItem) obj;
        if (other.getDataflowEndpointGroupArn() == null ^ this.getDataflowEndpointGroupArn() == null)
            return false;
        if (other.getDataflowEndpointGroupArn() != null && other.getDataflowEndpointGroupArn().equals(this.getDataflowEndpointGroupArn()) == false)
            return false;
        if (other.getDataflowEndpointGroupId() == null ^ this.getDataflowEndpointGroupId() == null)
            return false;
        if (other.getDataflowEndpointGroupId() != null && other.getDataflowEndpointGroupId().equals(this.getDataflowEndpointGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataflowEndpointGroupArn() == null) ? 0 : getDataflowEndpointGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDataflowEndpointGroupId() == null) ? 0 : getDataflowEndpointGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DataflowEndpointListItem clone() {
        try {
            return (DataflowEndpointListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.DataflowEndpointListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
