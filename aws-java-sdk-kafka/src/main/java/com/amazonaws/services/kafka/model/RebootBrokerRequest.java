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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Reboots a node.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/RebootBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootBrokerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a time.
     * </p>
     */
    private java.util.List<String> brokerIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     */
    private String clusterArn;

    /**
     * <p>
     * The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a time.
     * </p>
     * 
     * @return <p>
     *         The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a
     *         time.
     *         </p>
     */

    public java.util.List<String> getBrokerIds() {
        return brokerIds;
    }

    /**
     * <p>
     * The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a time.
     * </p>
     * 
     * @param brokerIds
     *        <p>
     *        The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a
     *        time.
     *        </p>
     */

    public void setBrokerIds(java.util.Collection<String> brokerIds) {
        if (brokerIds == null) {
            this.brokerIds = null;
            return;
        }

        this.brokerIds = new java.util.ArrayList<String>(brokerIds);
    }

    /**
     * <p>
     * The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a time.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBrokerIds(java.util.Collection)} or {@link #withBrokerIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param brokerIds
     *        <p>
     *        The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a
     *        time.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootBrokerRequest withBrokerIds(String... brokerIds) {
        if (this.brokerIds == null) {
            setBrokerIds(new java.util.ArrayList<String>(brokerIds.length));
        }
        for (String ele : brokerIds) {
            this.brokerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a time.
     * </p>
     * 
     * @param brokerIds
     *        <p>
     *        The list of broker IDs to be rebooted. The reboot-broker operation supports rebooting one broker at a
     *        time.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootBrokerRequest withBrokerIds(java.util.Collection<String> brokerIds) {
        setBrokerIds(brokerIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster to be updated.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster to be updated.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster to be updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootBrokerRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
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
        if (getBrokerIds() != null)
            sb.append("BrokerIds: ").append(getBrokerIds()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootBrokerRequest == false)
            return false;
        RebootBrokerRequest other = (RebootBrokerRequest) obj;
        if (other.getBrokerIds() == null ^ this.getBrokerIds() == null)
            return false;
        if (other.getBrokerIds() != null && other.getBrokerIds().equals(this.getBrokerIds()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerIds() == null) ? 0 : getBrokerIds().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        return hashCode;
    }

    @Override
    public RebootBrokerRequest clone() {
        return (RebootBrokerRequest) super.clone();
    }

}
