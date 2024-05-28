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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Required: Algorithm; Required: Recovery point types; IncludeVaults(one or more). Optional: SelectionWindowDays ('30'
 * if not specified);ExcludeVaults (list of selectors), defaults to empty list if not listed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreTestingRecoveryPointSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingRecoveryPointSelection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * </p>
     */
    private String algorithm;
    /**
     * <p>
     * Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     * </p>
     */
    private java.util.List<String> excludeVaults;
    /**
     * <p>
     * Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     * ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...] ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     * </p>
     */
    private java.util.List<String> includeVaults;
    /**
     * <p>
     * These are the types of recovery points.
     * </p>
     */
    private java.util.List<String> recoveryPointTypes;
    /**
     * <p>
     * Accepted values are integers from 1 to 365.
     * </p>
     */
    private Integer selectionWindowDays;

    /**
     * <p>
     * Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * </p>
     * 
     * @param algorithm
     *        Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * @see RestoreTestingRecoveryPointSelectionAlgorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * </p>
     * 
     * @return Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * @see RestoreTestingRecoveryPointSelectionAlgorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * </p>
     * 
     * @param algorithm
     *        Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreTestingRecoveryPointSelectionAlgorithm
     */

    public RestoreTestingRecoveryPointSelection withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * </p>
     * 
     * @param algorithm
     *        Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreTestingRecoveryPointSelectionAlgorithm
     */

    public RestoreTestingRecoveryPointSelection withAlgorithm(RestoreTestingRecoveryPointSelectionAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * <p>
     * Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     * </p>
     * 
     * @return Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     */

    public java.util.List<String> getExcludeVaults() {
        return excludeVaults;
    }

    /**
     * <p>
     * Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     * </p>
     * 
     * @param excludeVaults
     *        Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     */

    public void setExcludeVaults(java.util.Collection<String> excludeVaults) {
        if (excludeVaults == null) {
            this.excludeVaults = null;
            return;
        }

        this.excludeVaults = new java.util.ArrayList<String>(excludeVaults);
    }

    /**
     * <p>
     * Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeVaults(java.util.Collection)} or {@link #withExcludeVaults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludeVaults
     *        Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingRecoveryPointSelection withExcludeVaults(String... excludeVaults) {
        if (this.excludeVaults == null) {
            setExcludeVaults(new java.util.ArrayList<String>(excludeVaults.length));
        }
        for (String ele : excludeVaults) {
            this.excludeVaults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     * </p>
     * 
     * @param excludeVaults
     *        Accepted values include specific ARNs or list of selectors. Defaults to empty list if not listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingRecoveryPointSelection withExcludeVaults(java.util.Collection<String> excludeVaults) {
        setExcludeVaults(excludeVaults);
        return this;
    }

    /**
     * <p>
     * Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     * ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...] ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     * </p>
     * 
     * @return Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     *         ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
     *         ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     */

    public java.util.List<String> getIncludeVaults() {
        return includeVaults;
    }

    /**
     * <p>
     * Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     * ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...] ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     * </p>
     * 
     * @param includeVaults
     *        Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     *        ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
     *        ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     */

    public void setIncludeVaults(java.util.Collection<String> includeVaults) {
        if (includeVaults == null) {
            this.includeVaults = null;
            return;
        }

        this.includeVaults = new java.util.ArrayList<String>(includeVaults);
    }

    /**
     * <p>
     * Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     * ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...] ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeVaults(java.util.Collection)} or {@link #withIncludeVaults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includeVaults
     *        Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     *        ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
     *        ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingRecoveryPointSelection withIncludeVaults(String... includeVaults) {
        if (this.includeVaults == null) {
            setIncludeVaults(new java.util.ArrayList<String>(includeVaults.length));
        }
        for (String ele : includeVaults) {
            this.includeVaults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     * ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...] ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     * </p>
     * 
     * @param includeVaults
     *        Accepted values include wildcard ["*"] or by specific ARNs or ARN wilcard replacement
     *        ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
     *        ["arn:aws:backup:*:*:backup-vault:asdf-*", ...]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingRecoveryPointSelection withIncludeVaults(java.util.Collection<String> includeVaults) {
        setIncludeVaults(includeVaults);
        return this;
    }

    /**
     * <p>
     * These are the types of recovery points.
     * </p>
     * 
     * @return These are the types of recovery points.
     * @see RestoreTestingRecoveryPointType
     */

    public java.util.List<String> getRecoveryPointTypes() {
        return recoveryPointTypes;
    }

    /**
     * <p>
     * These are the types of recovery points.
     * </p>
     * 
     * @param recoveryPointTypes
     *        These are the types of recovery points.
     * @see RestoreTestingRecoveryPointType
     */

    public void setRecoveryPointTypes(java.util.Collection<String> recoveryPointTypes) {
        if (recoveryPointTypes == null) {
            this.recoveryPointTypes = null;
            return;
        }

        this.recoveryPointTypes = new java.util.ArrayList<String>(recoveryPointTypes);
    }

    /**
     * <p>
     * These are the types of recovery points.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryPointTypes(java.util.Collection)} or {@link #withRecoveryPointTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recoveryPointTypes
     *        These are the types of recovery points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreTestingRecoveryPointType
     */

    public RestoreTestingRecoveryPointSelection withRecoveryPointTypes(String... recoveryPointTypes) {
        if (this.recoveryPointTypes == null) {
            setRecoveryPointTypes(new java.util.ArrayList<String>(recoveryPointTypes.length));
        }
        for (String ele : recoveryPointTypes) {
            this.recoveryPointTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These are the types of recovery points.
     * </p>
     * 
     * @param recoveryPointTypes
     *        These are the types of recovery points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreTestingRecoveryPointType
     */

    public RestoreTestingRecoveryPointSelection withRecoveryPointTypes(java.util.Collection<String> recoveryPointTypes) {
        setRecoveryPointTypes(recoveryPointTypes);
        return this;
    }

    /**
     * <p>
     * These are the types of recovery points.
     * </p>
     * 
     * @param recoveryPointTypes
     *        These are the types of recovery points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreTestingRecoveryPointType
     */

    public RestoreTestingRecoveryPointSelection withRecoveryPointTypes(RestoreTestingRecoveryPointType... recoveryPointTypes) {
        java.util.ArrayList<String> recoveryPointTypesCopy = new java.util.ArrayList<String>(recoveryPointTypes.length);
        for (RestoreTestingRecoveryPointType value : recoveryPointTypes) {
            recoveryPointTypesCopy.add(value.toString());
        }
        if (getRecoveryPointTypes() == null) {
            setRecoveryPointTypes(recoveryPointTypesCopy);
        } else {
            getRecoveryPointTypes().addAll(recoveryPointTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Accepted values are integers from 1 to 365.
     * </p>
     * 
     * @param selectionWindowDays
     *        Accepted values are integers from 1 to 365.
     */

    public void setSelectionWindowDays(Integer selectionWindowDays) {
        this.selectionWindowDays = selectionWindowDays;
    }

    /**
     * <p>
     * Accepted values are integers from 1 to 365.
     * </p>
     * 
     * @return Accepted values are integers from 1 to 365.
     */

    public Integer getSelectionWindowDays() {
        return this.selectionWindowDays;
    }

    /**
     * <p>
     * Accepted values are integers from 1 to 365.
     * </p>
     * 
     * @param selectionWindowDays
     *        Accepted values are integers from 1 to 365.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingRecoveryPointSelection withSelectionWindowDays(Integer selectionWindowDays) {
        setSelectionWindowDays(selectionWindowDays);
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getExcludeVaults() != null)
            sb.append("ExcludeVaults: ").append(getExcludeVaults()).append(",");
        if (getIncludeVaults() != null)
            sb.append("IncludeVaults: ").append(getIncludeVaults()).append(",");
        if (getRecoveryPointTypes() != null)
            sb.append("RecoveryPointTypes: ").append(getRecoveryPointTypes()).append(",");
        if (getSelectionWindowDays() != null)
            sb.append("SelectionWindowDays: ").append(getSelectionWindowDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTestingRecoveryPointSelection == false)
            return false;
        RestoreTestingRecoveryPointSelection other = (RestoreTestingRecoveryPointSelection) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getExcludeVaults() == null ^ this.getExcludeVaults() == null)
            return false;
        if (other.getExcludeVaults() != null && other.getExcludeVaults().equals(this.getExcludeVaults()) == false)
            return false;
        if (other.getIncludeVaults() == null ^ this.getIncludeVaults() == null)
            return false;
        if (other.getIncludeVaults() != null && other.getIncludeVaults().equals(this.getIncludeVaults()) == false)
            return false;
        if (other.getRecoveryPointTypes() == null ^ this.getRecoveryPointTypes() == null)
            return false;
        if (other.getRecoveryPointTypes() != null && other.getRecoveryPointTypes().equals(this.getRecoveryPointTypes()) == false)
            return false;
        if (other.getSelectionWindowDays() == null ^ this.getSelectionWindowDays() == null)
            return false;
        if (other.getSelectionWindowDays() != null && other.getSelectionWindowDays().equals(this.getSelectionWindowDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getExcludeVaults() == null) ? 0 : getExcludeVaults().hashCode());
        hashCode = prime * hashCode + ((getIncludeVaults() == null) ? 0 : getIncludeVaults().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointTypes() == null) ? 0 : getRecoveryPointTypes().hashCode());
        hashCode = prime * hashCode + ((getSelectionWindowDays() == null) ? 0 : getSelectionWindowDays().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTestingRecoveryPointSelection clone() {
        try {
            return (RestoreTestingRecoveryPointSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreTestingRecoveryPointSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
