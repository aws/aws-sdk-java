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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/SignalApplicationInstanceNodeInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalApplicationInstanceNodeInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An application instance ID.
     * </p>
     */
    private String applicationInstanceId;
    /**
     * <p>
     * A list of signals.
     * </p>
     */
    private java.util.List<NodeSignal> nodeSignals;

    /**
     * <p>
     * An application instance ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        An application instance ID.
     */

    public void setApplicationInstanceId(String applicationInstanceId) {
        this.applicationInstanceId = applicationInstanceId;
    }

    /**
     * <p>
     * An application instance ID.
     * </p>
     * 
     * @return An application instance ID.
     */

    public String getApplicationInstanceId() {
        return this.applicationInstanceId;
    }

    /**
     * <p>
     * An application instance ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        An application instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalApplicationInstanceNodeInstancesRequest withApplicationInstanceId(String applicationInstanceId) {
        setApplicationInstanceId(applicationInstanceId);
        return this;
    }

    /**
     * <p>
     * A list of signals.
     * </p>
     * 
     * @return A list of signals.
     */

    public java.util.List<NodeSignal> getNodeSignals() {
        return nodeSignals;
    }

    /**
     * <p>
     * A list of signals.
     * </p>
     * 
     * @param nodeSignals
     *        A list of signals.
     */

    public void setNodeSignals(java.util.Collection<NodeSignal> nodeSignals) {
        if (nodeSignals == null) {
            this.nodeSignals = null;
            return;
        }

        this.nodeSignals = new java.util.ArrayList<NodeSignal>(nodeSignals);
    }

    /**
     * <p>
     * A list of signals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeSignals(java.util.Collection)} or {@link #withNodeSignals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nodeSignals
     *        A list of signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalApplicationInstanceNodeInstancesRequest withNodeSignals(NodeSignal... nodeSignals) {
        if (this.nodeSignals == null) {
            setNodeSignals(new java.util.ArrayList<NodeSignal>(nodeSignals.length));
        }
        for (NodeSignal ele : nodeSignals) {
            this.nodeSignals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of signals.
     * </p>
     * 
     * @param nodeSignals
     *        A list of signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalApplicationInstanceNodeInstancesRequest withNodeSignals(java.util.Collection<NodeSignal> nodeSignals) {
        setNodeSignals(nodeSignals);
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
        if (getApplicationInstanceId() != null)
            sb.append("ApplicationInstanceId: ").append(getApplicationInstanceId()).append(",");
        if (getNodeSignals() != null)
            sb.append("NodeSignals: ").append(getNodeSignals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignalApplicationInstanceNodeInstancesRequest == false)
            return false;
        SignalApplicationInstanceNodeInstancesRequest other = (SignalApplicationInstanceNodeInstancesRequest) obj;
        if (other.getApplicationInstanceId() == null ^ this.getApplicationInstanceId() == null)
            return false;
        if (other.getApplicationInstanceId() != null && other.getApplicationInstanceId().equals(this.getApplicationInstanceId()) == false)
            return false;
        if (other.getNodeSignals() == null ^ this.getNodeSignals() == null)
            return false;
        if (other.getNodeSignals() != null && other.getNodeSignals().equals(this.getNodeSignals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationInstanceId() == null) ? 0 : getApplicationInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNodeSignals() == null) ? 0 : getNodeSignals().hashCode());
        return hashCode;
    }

    @Override
    public SignalApplicationInstanceNodeInstancesRequest clone() {
        return (SignalApplicationInstanceNodeInstancesRequest) super.clone();
    }

}
