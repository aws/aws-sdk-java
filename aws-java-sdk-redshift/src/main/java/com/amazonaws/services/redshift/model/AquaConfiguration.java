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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The operation that uses this structure is retired. Amazon Redshift automatically determines whether to use AQUA
 * (Advanced Query Accelerator).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AquaConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AquaConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     */
    private String aquaStatus;
    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     */
    private String aquaConfigurationStatus;

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @param aquaStatus
     *        This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *        Accelerator).
     * @see AquaStatus
     */

    public void setAquaStatus(String aquaStatus) {
        this.aquaStatus = aquaStatus;
    }

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @return This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *         Accelerator).
     * @see AquaStatus
     */

    public String getAquaStatus() {
        return this.aquaStatus;
    }

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @param aquaStatus
     *        This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *        Accelerator).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AquaStatus
     */

    public AquaConfiguration withAquaStatus(String aquaStatus) {
        setAquaStatus(aquaStatus);
        return this;
    }

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @param aquaStatus
     *        This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *        Accelerator).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AquaStatus
     */

    public AquaConfiguration withAquaStatus(AquaStatus aquaStatus) {
        this.aquaStatus = aquaStatus.toString();
        return this;
    }

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @param aquaConfigurationStatus
     *        This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *        Accelerator).
     * @see AquaConfigurationStatus
     */

    public void setAquaConfigurationStatus(String aquaConfigurationStatus) {
        this.aquaConfigurationStatus = aquaConfigurationStatus;
    }

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @return This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *         Accelerator).
     * @see AquaConfigurationStatus
     */

    public String getAquaConfigurationStatus() {
        return this.aquaConfigurationStatus;
    }

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @param aquaConfigurationStatus
     *        This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *        Accelerator).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AquaConfigurationStatus
     */

    public AquaConfiguration withAquaConfigurationStatus(String aquaConfigurationStatus) {
        setAquaConfigurationStatus(aquaConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
     * </p>
     * 
     * @param aquaConfigurationStatus
     *        This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query
     *        Accelerator).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AquaConfigurationStatus
     */

    public AquaConfiguration withAquaConfigurationStatus(AquaConfigurationStatus aquaConfigurationStatus) {
        this.aquaConfigurationStatus = aquaConfigurationStatus.toString();
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
        if (getAquaStatus() != null)
            sb.append("AquaStatus: ").append(getAquaStatus()).append(",");
        if (getAquaConfigurationStatus() != null)
            sb.append("AquaConfigurationStatus: ").append(getAquaConfigurationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AquaConfiguration == false)
            return false;
        AquaConfiguration other = (AquaConfiguration) obj;
        if (other.getAquaStatus() == null ^ this.getAquaStatus() == null)
            return false;
        if (other.getAquaStatus() != null && other.getAquaStatus().equals(this.getAquaStatus()) == false)
            return false;
        if (other.getAquaConfigurationStatus() == null ^ this.getAquaConfigurationStatus() == null)
            return false;
        if (other.getAquaConfigurationStatus() != null && other.getAquaConfigurationStatus().equals(this.getAquaConfigurationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAquaStatus() == null) ? 0 : getAquaStatus().hashCode());
        hashCode = prime * hashCode + ((getAquaConfigurationStatus() == null) ? 0 : getAquaConfigurationStatus().hashCode());
        return hashCode;
    }

    @Override
    public AquaConfiguration clone() {
        try {
            return (AquaConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
