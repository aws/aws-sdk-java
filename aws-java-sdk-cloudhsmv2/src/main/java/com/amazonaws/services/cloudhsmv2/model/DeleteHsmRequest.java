/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHsmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM that you are deleting.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The identifier (ID) of the HSM that you are deleting.
     * </p>
     */
    private String hsmId;
    /**
     * <p>
     * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     */
    private String eniId;
    /**
     * <p>
     * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     */
    private String eniIp;

    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM that you are deleting.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that contains the HSM that you are deleting.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM that you are deleting.
     * </p>
     * 
     * @return The identifier (ID) of the cluster that contains the HSM that you are deleting.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM that you are deleting.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that contains the HSM that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHsmRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM that you are deleting.
     * </p>
     * 
     * @param hsmId
     *        The identifier (ID) of the HSM that you are deleting.
     */

    public void setHsmId(String hsmId) {
        this.hsmId = hsmId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM that you are deleting.
     * </p>
     * 
     * @return The identifier (ID) of the HSM that you are deleting.
     */

    public String getHsmId() {
        return this.hsmId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM that you are deleting.
     * </p>
     * 
     * @param hsmId
     *        The identifier (ID) of the HSM that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHsmRequest withHsmId(String hsmId) {
        setHsmId(hsmId);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     * 
     * @param eniId
     *        The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
     */

    public void setEniId(String eniId) {
        this.eniId = eniId;
    }

    /**
     * <p>
     * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     * 
     * @return The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
     */

    public String getEniId() {
        return this.eniId;
    }

    /**
     * <p>
     * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     * 
     * @param eniId
     *        The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHsmRequest withEniId(String eniId) {
        setEniId(eniId);
        return this;
    }

    /**
     * <p>
     * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     * 
     * @param eniIp
     *        The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
     */

    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }

    /**
     * <p>
     * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     * 
     * @return The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
     */

    public String getEniIp() {
        return this.eniIp;
    }

    /**
     * <p>
     * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
     * </p>
     * 
     * @param eniIp
     *        The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHsmRequest withEniIp(String eniIp) {
        setEniIp(eniIp);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getHsmId() != null)
            sb.append("HsmId: ").append(getHsmId()).append(",");
        if (getEniId() != null)
            sb.append("EniId: ").append(getEniId()).append(",");
        if (getEniIp() != null)
            sb.append("EniIp: ").append(getEniIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHsmRequest == false)
            return false;
        DeleteHsmRequest other = (DeleteHsmRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getHsmId() == null ^ this.getHsmId() == null)
            return false;
        if (other.getHsmId() != null && other.getHsmId().equals(this.getHsmId()) == false)
            return false;
        if (other.getEniId() == null ^ this.getEniId() == null)
            return false;
        if (other.getEniId() != null && other.getEniId().equals(this.getEniId()) == false)
            return false;
        if (other.getEniIp() == null ^ this.getEniIp() == null)
            return false;
        if (other.getEniIp() != null && other.getEniIp().equals(this.getEniIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getHsmId() == null) ? 0 : getHsmId().hashCode());
        hashCode = prime * hashCode + ((getEniId() == null) ? 0 : getEniId().hashCode());
        hashCode = prime * hashCode + ((getEniIp() == null) ? 0 : getEniIp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHsmRequest clone() {
        return (DeleteHsmRequest) super.clone();
    }

}
