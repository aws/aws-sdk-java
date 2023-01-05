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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using an EventBridge event bus as a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetEventBridgeEventBusParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetEventBridgeEventBusParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     */
    private String detailType;
    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if the URL for Endpoint is
     * https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is <code>abcde.veo</code>.
     * </p>
     * <important>
     * <p>
     * When using Java, you must include <code>auth-crt</code> on the class path.
     * </p>
     * </important>
     */
    private String endpointId;
    /**
     * <p>
     * Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any
     * number, including zero, may be present.
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * The source of the event.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">PutEvents</a> call is used.
     * </p>
     */
    private String time;

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event
     *        detail.
     */

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @return A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event
     *         detail.
     */

    public String getDetailType() {
        return this.detailType;
    }

    /**
     * <p>
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event
     *        detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetEventBridgeEventBusParameters withDetailType(String detailType) {
        setDetailType(detailType);
        return this;
    }

    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if the URL for Endpoint is
     * https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is <code>abcde.veo</code>.
     * </p>
     * <important>
     * <p>
     * When using Java, you must include <code>auth-crt</code> on the class path.
     * </p>
     * </important>
     * 
     * @param endpointId
     *        The URL subdomain of the endpoint. For example, if the URL for Endpoint is
     *        https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is <code>abcde.veo</code>.</p>
     *        <important>
     *        <p>
     *        When using Java, you must include <code>auth-crt</code> on the class path.
     *        </p>
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if the URL for Endpoint is
     * https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is <code>abcde.veo</code>.
     * </p>
     * <important>
     * <p>
     * When using Java, you must include <code>auth-crt</code> on the class path.
     * </p>
     * </important>
     * 
     * @return The URL subdomain of the endpoint. For example, if the URL for Endpoint is
     *         https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is <code>abcde.veo</code>.</p>
     *         <important>
     *         <p>
     *         When using Java, you must include <code>auth-crt</code> on the class path.
     *         </p>
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if the URL for Endpoint is
     * https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is <code>abcde.veo</code>.
     * </p>
     * <important>
     * <p>
     * When using Java, you must include <code>auth-crt</code> on the class path.
     * </p>
     * </important>
     * 
     * @param endpointId
     *        The URL subdomain of the endpoint. For example, if the URL for Endpoint is
     *        https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is <code>abcde.veo</code>.</p>
     *        <important>
     *        <p>
     *        When using Java, you must include <code>auth-crt</code> on the class path.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetEventBridgeEventBusParameters withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any
     * number, including zero, may be present.
     * </p>
     * 
     * @return Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily
     *         concerns. Any number, including zero, may be present.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any
     * number, including zero, may be present.
     * </p>
     * 
     * @param resources
     *        Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily
     *        concerns. Any number, including zero, may be present.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any
     * number, including zero, may be present.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily
     *        concerns. Any number, including zero, may be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetEventBridgeEventBusParameters withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any
     * number, including zero, may be present.
     * </p>
     * 
     * @param resources
     *        Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily
     *        concerns. Any number, including zero, may be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetEventBridgeEventBusParameters withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @param source
     *        The source of the event.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @return The source of the event.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @param source
     *        The source of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetEventBridgeEventBusParameters withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">PutEvents</a> call is used.
     * </p>
     * 
     * @param time
     *        The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no
     *        time stamp is provided, the time stamp of the <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">PutEvents</a> call
     *        is used.
     */

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">PutEvents</a> call is used.
     * </p>
     * 
     * @return The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no
     *         time stamp is provided, the time stamp of the <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">PutEvents</a> call
     *         is used.
     */

    public String getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">PutEvents</a> call is used.
     * </p>
     * 
     * @param time
     *        The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no
     *        time stamp is provided, the time stamp of the <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">PutEvents</a> call
     *        is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetEventBridgeEventBusParameters withTime(String time) {
        setTime(time);
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
        if (getDetailType() != null)
            sb.append("DetailType: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append("***Sensitive Data Redacted***").append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append("***Sensitive Data Redacted***").append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeTargetEventBridgeEventBusParameters == false)
            return false;
        PipeTargetEventBridgeEventBusParameters other = (PipeTargetEventBridgeEventBusParameters) obj;
        if (other.getDetailType() == null ^ this.getDetailType() == null)
            return false;
        if (other.getDetailType() != null && other.getDetailType().equals(this.getDetailType()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetEventBridgeEventBusParameters clone() {
        try {
            return (PipeTargetEventBridgeEventBusParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetEventBridgeEventBusParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
