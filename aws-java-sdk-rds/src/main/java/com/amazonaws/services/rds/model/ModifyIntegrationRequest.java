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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyIntegration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the integration to modify.
     * </p>
     */
    private String integrationIdentifier;
    /**
     * <p>
     * A new name for the integration.
     * </p>
     */
    private String integrationName;
    /**
     * <p>
     * A new data filter for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Zero_ETL_Filtering.html">Data filtering
     * for Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     */
    private String dataFilter;
    /**
     * <p>
     * A new description for the integration.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The unique identifier of the integration to modify.
     * </p>
     * 
     * @param integrationIdentifier
     *        The unique identifier of the integration to modify.
     */

    public void setIntegrationIdentifier(String integrationIdentifier) {
        this.integrationIdentifier = integrationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the integration to modify.
     * </p>
     * 
     * @return The unique identifier of the integration to modify.
     */

    public String getIntegrationIdentifier() {
        return this.integrationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the integration to modify.
     * </p>
     * 
     * @param integrationIdentifier
     *        The unique identifier of the integration to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIntegrationRequest withIntegrationIdentifier(String integrationIdentifier) {
        setIntegrationIdentifier(integrationIdentifier);
        return this;
    }

    /**
     * <p>
     * A new name for the integration.
     * </p>
     * 
     * @param integrationName
     *        A new name for the integration.
     */

    public void setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
    }

    /**
     * <p>
     * A new name for the integration.
     * </p>
     * 
     * @return A new name for the integration.
     */

    public String getIntegrationName() {
        return this.integrationName;
    }

    /**
     * <p>
     * A new name for the integration.
     * </p>
     * 
     * @param integrationName
     *        A new name for the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIntegrationRequest withIntegrationName(String integrationName) {
        setIntegrationName(integrationName);
        return this;
    }

    /**
     * <p>
     * A new data filter for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Zero_ETL_Filtering.html">Data filtering
     * for Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     * 
     * @param dataFilter
     *        A new data filter for the integration. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Zero_ETL_Filtering.html">Data
     *        filtering for Aurora zero-ETL integrations with Amazon Redshift</a>.
     */

    public void setDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
    }

    /**
     * <p>
     * A new data filter for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Zero_ETL_Filtering.html">Data filtering
     * for Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     * 
     * @return A new data filter for the integration. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Zero_ETL_Filtering.html">Data
     *         filtering for Aurora zero-ETL integrations with Amazon Redshift</a>.
     */

    public String getDataFilter() {
        return this.dataFilter;
    }

    /**
     * <p>
     * A new data filter for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Zero_ETL_Filtering.html">Data filtering
     * for Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     * 
     * @param dataFilter
     *        A new data filter for the integration. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Zero_ETL_Filtering.html">Data
     *        filtering for Aurora zero-ETL integrations with Amazon Redshift</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIntegrationRequest withDataFilter(String dataFilter) {
        setDataFilter(dataFilter);
        return this;
    }

    /**
     * <p>
     * A new description for the integration.
     * </p>
     * 
     * @param description
     *        A new description for the integration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the integration.
     * </p>
     * 
     * @return A new description for the integration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the integration.
     * </p>
     * 
     * @param description
     *        A new description for the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIntegrationRequest withDescription(String description) {
        setDescription(description);
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
        if (getIntegrationIdentifier() != null)
            sb.append("IntegrationIdentifier: ").append(getIntegrationIdentifier()).append(",");
        if (getIntegrationName() != null)
            sb.append("IntegrationName: ").append(getIntegrationName()).append(",");
        if (getDataFilter() != null)
            sb.append("DataFilter: ").append(getDataFilter()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIntegrationRequest == false)
            return false;
        ModifyIntegrationRequest other = (ModifyIntegrationRequest) obj;
        if (other.getIntegrationIdentifier() == null ^ this.getIntegrationIdentifier() == null)
            return false;
        if (other.getIntegrationIdentifier() != null && other.getIntegrationIdentifier().equals(this.getIntegrationIdentifier()) == false)
            return false;
        if (other.getIntegrationName() == null ^ this.getIntegrationName() == null)
            return false;
        if (other.getIntegrationName() != null && other.getIntegrationName().equals(this.getIntegrationName()) == false)
            return false;
        if (other.getDataFilter() == null ^ this.getDataFilter() == null)
            return false;
        if (other.getDataFilter() != null && other.getDataFilter().equals(this.getDataFilter()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegrationIdentifier() == null) ? 0 : getIntegrationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIntegrationName() == null) ? 0 : getIntegrationName().hashCode());
        hashCode = prime * hashCode + ((getDataFilter() == null) ? 0 : getDataFilter().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIntegrationRequest clone() {
        return (ModifyIntegrationRequest) super.clone();
    }

}
