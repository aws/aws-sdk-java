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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a trust store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TrustStore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustStore implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trust store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     */
    private String trustStoreArn;
    /**
     * <p>
     * The current status of the trust store.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The number of ca certificates in the trust store.
     * </p>
     */
    private Integer numberOfCaCertificates;
    /**
     * <p>
     * The number of revoked certificates in the trust store.
     * </p>
     */
    private Long totalRevokedEntries;

    /**
     * <p>
     * The name of the trust store.
     * </p>
     * 
     * @param name
     *        The name of the trust store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trust store.
     * </p>
     * 
     * @return The name of the trust store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trust store.
     * </p>
     * 
     * @param name
     *        The name of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStore withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStore withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
        return this;
    }

    /**
     * <p>
     * The current status of the trust store.
     * </p>
     * 
     * @param status
     *        The current status of the trust store.
     * @see TrustStoreStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the trust store.
     * </p>
     * 
     * @return The current status of the trust store.
     * @see TrustStoreStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the trust store.
     * </p>
     * 
     * @param status
     *        The current status of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustStoreStatus
     */

    public TrustStore withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the trust store.
     * </p>
     * 
     * @param status
     *        The current status of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustStoreStatus
     */

    public TrustStore withStatus(TrustStoreStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The number of ca certificates in the trust store.
     * </p>
     * 
     * @param numberOfCaCertificates
     *        The number of ca certificates in the trust store.
     */

    public void setNumberOfCaCertificates(Integer numberOfCaCertificates) {
        this.numberOfCaCertificates = numberOfCaCertificates;
    }

    /**
     * <p>
     * The number of ca certificates in the trust store.
     * </p>
     * 
     * @return The number of ca certificates in the trust store.
     */

    public Integer getNumberOfCaCertificates() {
        return this.numberOfCaCertificates;
    }

    /**
     * <p>
     * The number of ca certificates in the trust store.
     * </p>
     * 
     * @param numberOfCaCertificates
     *        The number of ca certificates in the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStore withNumberOfCaCertificates(Integer numberOfCaCertificates) {
        setNumberOfCaCertificates(numberOfCaCertificates);
        return this;
    }

    /**
     * <p>
     * The number of revoked certificates in the trust store.
     * </p>
     * 
     * @param totalRevokedEntries
     *        The number of revoked certificates in the trust store.
     */

    public void setTotalRevokedEntries(Long totalRevokedEntries) {
        this.totalRevokedEntries = totalRevokedEntries;
    }

    /**
     * <p>
     * The number of revoked certificates in the trust store.
     * </p>
     * 
     * @return The number of revoked certificates in the trust store.
     */

    public Long getTotalRevokedEntries() {
        return this.totalRevokedEntries;
    }

    /**
     * <p>
     * The number of revoked certificates in the trust store.
     * </p>
     * 
     * @param totalRevokedEntries
     *        The number of revoked certificates in the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStore withTotalRevokedEntries(Long totalRevokedEntries) {
        setTotalRevokedEntries(totalRevokedEntries);
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
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNumberOfCaCertificates() != null)
            sb.append("NumberOfCaCertificates: ").append(getNumberOfCaCertificates()).append(",");
        if (getTotalRevokedEntries() != null)
            sb.append("TotalRevokedEntries: ").append(getTotalRevokedEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustStore == false)
            return false;
        TrustStore other = (TrustStore) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNumberOfCaCertificates() == null ^ this.getNumberOfCaCertificates() == null)
            return false;
        if (other.getNumberOfCaCertificates() != null && other.getNumberOfCaCertificates().equals(this.getNumberOfCaCertificates()) == false)
            return false;
        if (other.getTotalRevokedEntries() == null ^ this.getTotalRevokedEntries() == null)
            return false;
        if (other.getTotalRevokedEntries() != null && other.getTotalRevokedEntries().equals(this.getTotalRevokedEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNumberOfCaCertificates() == null) ? 0 : getNumberOfCaCertificates().hashCode());
        hashCode = prime * hashCode + ((getTotalRevokedEntries() == null) ? 0 : getTotalRevokedEntries().hashCode());
        return hashCode;
    }

    @Override
    public TrustStore clone() {
        try {
            return (TrustStore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
