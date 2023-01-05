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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a scanning rule for a private registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/RegistryScanningRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistryScanningRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type is
     * specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and <code>SCAN_ON_PUSH</code>. When
     * the <code>BASIC</code> scan type is specified, the <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan
     * frequencies are supported.
     * </p>
     */
    private String scanFrequency;
    /**
     * <p>
     * The repository filters associated with the scanning configuration for a private registry.
     * </p>
     */
    private java.util.List<ScanningRepositoryFilter> repositoryFilters;

    /**
     * <p>
     * The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type is
     * specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and <code>SCAN_ON_PUSH</code>. When
     * the <code>BASIC</code> scan type is specified, the <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan
     * frequencies are supported.
     * </p>
     * 
     * @param scanFrequency
     *        The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type
     *        is specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and
     *        <code>SCAN_ON_PUSH</code>. When the <code>BASIC</code> scan type is specified, the
     *        <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan frequencies are supported.
     * @see ScanFrequency
     */

    public void setScanFrequency(String scanFrequency) {
        this.scanFrequency = scanFrequency;
    }

    /**
     * <p>
     * The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type is
     * specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and <code>SCAN_ON_PUSH</code>. When
     * the <code>BASIC</code> scan type is specified, the <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan
     * frequencies are supported.
     * </p>
     * 
     * @return The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan
     *         type is specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and
     *         <code>SCAN_ON_PUSH</code>. When the <code>BASIC</code> scan type is specified, the
     *         <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan frequencies are supported.
     * @see ScanFrequency
     */

    public String getScanFrequency() {
        return this.scanFrequency;
    }

    /**
     * <p>
     * The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type is
     * specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and <code>SCAN_ON_PUSH</code>. When
     * the <code>BASIC</code> scan type is specified, the <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan
     * frequencies are supported.
     * </p>
     * 
     * @param scanFrequency
     *        The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type
     *        is specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and
     *        <code>SCAN_ON_PUSH</code>. When the <code>BASIC</code> scan type is specified, the
     *        <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan frequencies are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanFrequency
     */

    public RegistryScanningRule withScanFrequency(String scanFrequency) {
        setScanFrequency(scanFrequency);
        return this;
    }

    /**
     * <p>
     * The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type is
     * specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and <code>SCAN_ON_PUSH</code>. When
     * the <code>BASIC</code> scan type is specified, the <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan
     * frequencies are supported.
     * </p>
     * 
     * @param scanFrequency
     *        The frequency that scans are performed at for a private registry. When the <code>ENHANCED</code> scan type
     *        is specified, the supported scan frequencies are <code>CONTINUOUS_SCAN</code> and
     *        <code>SCAN_ON_PUSH</code>. When the <code>BASIC</code> scan type is specified, the
     *        <code>SCAN_ON_PUSH</code> and <code>MANUAL</code> scan frequencies are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanFrequency
     */

    public RegistryScanningRule withScanFrequency(ScanFrequency scanFrequency) {
        this.scanFrequency = scanFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The repository filters associated with the scanning configuration for a private registry.
     * </p>
     * 
     * @return The repository filters associated with the scanning configuration for a private registry.
     */

    public java.util.List<ScanningRepositoryFilter> getRepositoryFilters() {
        return repositoryFilters;
    }

    /**
     * <p>
     * The repository filters associated with the scanning configuration for a private registry.
     * </p>
     * 
     * @param repositoryFilters
     *        The repository filters associated with the scanning configuration for a private registry.
     */

    public void setRepositoryFilters(java.util.Collection<ScanningRepositoryFilter> repositoryFilters) {
        if (repositoryFilters == null) {
            this.repositoryFilters = null;
            return;
        }

        this.repositoryFilters = new java.util.ArrayList<ScanningRepositoryFilter>(repositoryFilters);
    }

    /**
     * <p>
     * The repository filters associated with the scanning configuration for a private registry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryFilters(java.util.Collection)} or {@link #withRepositoryFilters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param repositoryFilters
     *        The repository filters associated with the scanning configuration for a private registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryScanningRule withRepositoryFilters(ScanningRepositoryFilter... repositoryFilters) {
        if (this.repositoryFilters == null) {
            setRepositoryFilters(new java.util.ArrayList<ScanningRepositoryFilter>(repositoryFilters.length));
        }
        for (ScanningRepositoryFilter ele : repositoryFilters) {
            this.repositoryFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The repository filters associated with the scanning configuration for a private registry.
     * </p>
     * 
     * @param repositoryFilters
     *        The repository filters associated with the scanning configuration for a private registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryScanningRule withRepositoryFilters(java.util.Collection<ScanningRepositoryFilter> repositoryFilters) {
        setRepositoryFilters(repositoryFilters);
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
        if (getScanFrequency() != null)
            sb.append("ScanFrequency: ").append(getScanFrequency()).append(",");
        if (getRepositoryFilters() != null)
            sb.append("RepositoryFilters: ").append(getRepositoryFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistryScanningRule == false)
            return false;
        RegistryScanningRule other = (RegistryScanningRule) obj;
        if (other.getScanFrequency() == null ^ this.getScanFrequency() == null)
            return false;
        if (other.getScanFrequency() != null && other.getScanFrequency().equals(this.getScanFrequency()) == false)
            return false;
        if (other.getRepositoryFilters() == null ^ this.getRepositoryFilters() == null)
            return false;
        if (other.getRepositoryFilters() != null && other.getRepositoryFilters().equals(this.getRepositoryFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanFrequency() == null) ? 0 : getScanFrequency().hashCode());
        hashCode = prime * hashCode + ((getRepositoryFilters() == null) ? 0 : getRepositoryFilters().hashCode());
        return hashCode;
    }

    @Override
    public RegistryScanningRule clone() {
        try {
            return (RegistryScanningRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.RegistryScanningRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
