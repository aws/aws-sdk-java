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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the schema status.
 * </p>
 * <p>
 * A status of <code>READY</code> means that based on the schema analysis rule, queries of the given analysis rule type
 * are properly configured to run queries on this schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/SchemaStatusDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaStatusDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the schema.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reasons why the schema status is set to its current state.
     * </p>
     */
    private java.util.List<SchemaStatusReason> reasons;
    /**
     * <p>
     * The analysis rule type for which the schema status has been evaluated.
     * </p>
     */
    private String analysisRuleType;
    /**
     * <p>
     * The configuration details of the schema analysis rule for the given type.
     * </p>
     */
    private java.util.List<String> configurations;

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @see SchemaStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @return The status of the schema.
     * @see SchemaStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public SchemaStatusDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public SchemaStatusDetail withStatus(SchemaStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reasons why the schema status is set to its current state.
     * </p>
     * 
     * @return The reasons why the schema status is set to its current state.
     */

    public java.util.List<SchemaStatusReason> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * The reasons why the schema status is set to its current state.
     * </p>
     * 
     * @param reasons
     *        The reasons why the schema status is set to its current state.
     */

    public void setReasons(java.util.Collection<SchemaStatusReason> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<SchemaStatusReason>(reasons);
    }

    /**
     * <p>
     * The reasons why the schema status is set to its current state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        The reasons why the schema status is set to its current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaStatusDetail withReasons(SchemaStatusReason... reasons) {
        if (this.reasons == null) {
            setReasons(new java.util.ArrayList<SchemaStatusReason>(reasons.length));
        }
        for (SchemaStatusReason ele : reasons) {
            this.reasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reasons why the schema status is set to its current state.
     * </p>
     * 
     * @param reasons
     *        The reasons why the schema status is set to its current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaStatusDetail withReasons(java.util.Collection<SchemaStatusReason> reasons) {
        setReasons(reasons);
        return this;
    }

    /**
     * <p>
     * The analysis rule type for which the schema status has been evaluated.
     * </p>
     * 
     * @param analysisRuleType
     *        The analysis rule type for which the schema status has been evaluated.
     * @see AnalysisRuleType
     */

    public void setAnalysisRuleType(String analysisRuleType) {
        this.analysisRuleType = analysisRuleType;
    }

    /**
     * <p>
     * The analysis rule type for which the schema status has been evaluated.
     * </p>
     * 
     * @return The analysis rule type for which the schema status has been evaluated.
     * @see AnalysisRuleType
     */

    public String getAnalysisRuleType() {
        return this.analysisRuleType;
    }

    /**
     * <p>
     * The analysis rule type for which the schema status has been evaluated.
     * </p>
     * 
     * @param analysisRuleType
     *        The analysis rule type for which the schema status has been evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public SchemaStatusDetail withAnalysisRuleType(String analysisRuleType) {
        setAnalysisRuleType(analysisRuleType);
        return this;
    }

    /**
     * <p>
     * The analysis rule type for which the schema status has been evaluated.
     * </p>
     * 
     * @param analysisRuleType
     *        The analysis rule type for which the schema status has been evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public SchemaStatusDetail withAnalysisRuleType(AnalysisRuleType analysisRuleType) {
        this.analysisRuleType = analysisRuleType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details of the schema analysis rule for the given type.
     * </p>
     * 
     * @return The configuration details of the schema analysis rule for the given type.
     * @see SchemaConfiguration
     */

    public java.util.List<String> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * The configuration details of the schema analysis rule for the given type.
     * </p>
     * 
     * @param configurations
     *        The configuration details of the schema analysis rule for the given type.
     * @see SchemaConfiguration
     */

    public void setConfigurations(java.util.Collection<String> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<String>(configurations);
    }

    /**
     * <p>
     * The configuration details of the schema analysis rule for the given type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        The configuration details of the schema analysis rule for the given type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaConfiguration
     */

    public SchemaStatusDetail withConfigurations(String... configurations) {
        if (this.configurations == null) {
            setConfigurations(new java.util.ArrayList<String>(configurations.length));
        }
        for (String ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration details of the schema analysis rule for the given type.
     * </p>
     * 
     * @param configurations
     *        The configuration details of the schema analysis rule for the given type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaConfiguration
     */

    public SchemaStatusDetail withConfigurations(java.util.Collection<String> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The configuration details of the schema analysis rule for the given type.
     * </p>
     * 
     * @param configurations
     *        The configuration details of the schema analysis rule for the given type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaConfiguration
     */

    public SchemaStatusDetail withConfigurations(SchemaConfiguration... configurations) {
        java.util.ArrayList<String> configurationsCopy = new java.util.ArrayList<String>(configurations.length);
        for (SchemaConfiguration value : configurations) {
            configurationsCopy.add(value.toString());
        }
        if (getConfigurations() == null) {
            setConfigurations(configurationsCopy);
        } else {
            getConfigurations().addAll(configurationsCopy);
        }
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons()).append(",");
        if (getAnalysisRuleType() != null)
            sb.append("AnalysisRuleType: ").append(getAnalysisRuleType()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaStatusDetail == false)
            return false;
        SchemaStatusDetail other = (SchemaStatusDetail) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        if (other.getAnalysisRuleType() == null ^ this.getAnalysisRuleType() == null)
            return false;
        if (other.getAnalysisRuleType() != null && other.getAnalysisRuleType().equals(this.getAnalysisRuleType()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        hashCode = prime * hashCode + ((getAnalysisRuleType() == null) ? 0 : getAnalysisRuleType().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public SchemaStatusDetail clone() {
        try {
            return (SchemaStatusDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.SchemaStatusDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
