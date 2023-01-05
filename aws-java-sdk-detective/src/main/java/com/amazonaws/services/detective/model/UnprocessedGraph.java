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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Behavior graphs that could not be processed in the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UnprocessedGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedGraph implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The reason data source package information could not be processed for a behavior graph.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the organization behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     * 
     * @return The ARN of the organization behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the organization behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedGraph withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The reason data source package information could not be processed for a behavior graph.
     * </p>
     * 
     * @param reason
     *        The reason data source package information could not be processed for a behavior graph.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason data source package information could not be processed for a behavior graph.
     * </p>
     * 
     * @return The reason data source package information could not be processed for a behavior graph.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason data source package information could not be processed for a behavior graph.
     * </p>
     * 
     * @param reason
     *        The reason data source package information could not be processed for a behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedGraph withReason(String reason) {
        setReason(reason);
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedGraph == false)
            return false;
        UnprocessedGraph other = (UnprocessedGraph) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedGraph clone() {
        try {
            return (UnprocessedGraph) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.UnprocessedGraphMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
