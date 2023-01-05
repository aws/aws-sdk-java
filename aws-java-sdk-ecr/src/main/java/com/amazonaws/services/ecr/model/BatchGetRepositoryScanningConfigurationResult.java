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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchGetRepositoryScanningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRepositoryScanningConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The scanning configuration for the requested repositories.
     * </p>
     */
    private java.util.List<RepositoryScanningConfiguration> scanningConfigurations;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private java.util.List<RepositoryScanningConfigurationFailure> failures;

    /**
     * <p>
     * The scanning configuration for the requested repositories.
     * </p>
     * 
     * @return The scanning configuration for the requested repositories.
     */

    public java.util.List<RepositoryScanningConfiguration> getScanningConfigurations() {
        return scanningConfigurations;
    }

    /**
     * <p>
     * The scanning configuration for the requested repositories.
     * </p>
     * 
     * @param scanningConfigurations
     *        The scanning configuration for the requested repositories.
     */

    public void setScanningConfigurations(java.util.Collection<RepositoryScanningConfiguration> scanningConfigurations) {
        if (scanningConfigurations == null) {
            this.scanningConfigurations = null;
            return;
        }

        this.scanningConfigurations = new java.util.ArrayList<RepositoryScanningConfiguration>(scanningConfigurations);
    }

    /**
     * <p>
     * The scanning configuration for the requested repositories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanningConfigurations(java.util.Collection)} or
     * {@link #withScanningConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scanningConfigurations
     *        The scanning configuration for the requested repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoryScanningConfigurationResult withScanningConfigurations(RepositoryScanningConfiguration... scanningConfigurations) {
        if (this.scanningConfigurations == null) {
            setScanningConfigurations(new java.util.ArrayList<RepositoryScanningConfiguration>(scanningConfigurations.length));
        }
        for (RepositoryScanningConfiguration ele : scanningConfigurations) {
            this.scanningConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scanning configuration for the requested repositories.
     * </p>
     * 
     * @param scanningConfigurations
     *        The scanning configuration for the requested repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoryScanningConfigurationResult withScanningConfigurations(java.util.Collection<RepositoryScanningConfiguration> scanningConfigurations) {
        setScanningConfigurations(scanningConfigurations);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<RepositoryScanningConfigurationFailure> getFailures() {
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<RepositoryScanningConfigurationFailure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<RepositoryScanningConfigurationFailure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoryScanningConfigurationResult withFailures(RepositoryScanningConfigurationFailure... failures) {
        if (this.failures == null) {
            setFailures(new java.util.ArrayList<RepositoryScanningConfigurationFailure>(failures.length));
        }
        for (RepositoryScanningConfigurationFailure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoryScanningConfigurationResult withFailures(java.util.Collection<RepositoryScanningConfigurationFailure> failures) {
        setFailures(failures);
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
        if (getScanningConfigurations() != null)
            sb.append("ScanningConfigurations: ").append(getScanningConfigurations()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRepositoryScanningConfigurationResult == false)
            return false;
        BatchGetRepositoryScanningConfigurationResult other = (BatchGetRepositoryScanningConfigurationResult) obj;
        if (other.getScanningConfigurations() == null ^ this.getScanningConfigurations() == null)
            return false;
        if (other.getScanningConfigurations() != null && other.getScanningConfigurations().equals(this.getScanningConfigurations()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanningConfigurations() == null) ? 0 : getScanningConfigurations().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRepositoryScanningConfigurationResult clone() {
        try {
            return (BatchGetRepositoryScanningConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
