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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeConversionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConversionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the schema conversion project.
     * </p>
     */
    private String migrationProjectIdentifier;
    /**
     * <p>
     * The configuration parameters for the schema conversion project.
     * </p>
     */
    private String conversionConfiguration;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the schema conversion project.
     * </p>
     * 
     * @param migrationProjectIdentifier
     *        The name or Amazon Resource Name (ARN) for the schema conversion project.
     */

    public void setMigrationProjectIdentifier(String migrationProjectIdentifier) {
        this.migrationProjectIdentifier = migrationProjectIdentifier;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the schema conversion project.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) for the schema conversion project.
     */

    public String getMigrationProjectIdentifier() {
        return this.migrationProjectIdentifier;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the schema conversion project.
     * </p>
     * 
     * @param migrationProjectIdentifier
     *        The name or Amazon Resource Name (ARN) for the schema conversion project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConversionConfigurationResult withMigrationProjectIdentifier(String migrationProjectIdentifier) {
        setMigrationProjectIdentifier(migrationProjectIdentifier);
        return this;
    }

    /**
     * <p>
     * The configuration parameters for the schema conversion project.
     * </p>
     * 
     * @param conversionConfiguration
     *        The configuration parameters for the schema conversion project.
     */

    public void setConversionConfiguration(String conversionConfiguration) {
        this.conversionConfiguration = conversionConfiguration;
    }

    /**
     * <p>
     * The configuration parameters for the schema conversion project.
     * </p>
     * 
     * @return The configuration parameters for the schema conversion project.
     */

    public String getConversionConfiguration() {
        return this.conversionConfiguration;
    }

    /**
     * <p>
     * The configuration parameters for the schema conversion project.
     * </p>
     * 
     * @param conversionConfiguration
     *        The configuration parameters for the schema conversion project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConversionConfigurationResult withConversionConfiguration(String conversionConfiguration) {
        setConversionConfiguration(conversionConfiguration);
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
        if (getMigrationProjectIdentifier() != null)
            sb.append("MigrationProjectIdentifier: ").append(getMigrationProjectIdentifier()).append(",");
        if (getConversionConfiguration() != null)
            sb.append("ConversionConfiguration: ").append(getConversionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConversionConfigurationResult == false)
            return false;
        DescribeConversionConfigurationResult other = (DescribeConversionConfigurationResult) obj;
        if (other.getMigrationProjectIdentifier() == null ^ this.getMigrationProjectIdentifier() == null)
            return false;
        if (other.getMigrationProjectIdentifier() != null && other.getMigrationProjectIdentifier().equals(this.getMigrationProjectIdentifier()) == false)
            return false;
        if (other.getConversionConfiguration() == null ^ this.getConversionConfiguration() == null)
            return false;
        if (other.getConversionConfiguration() != null && other.getConversionConfiguration().equals(this.getConversionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationProjectIdentifier() == null) ? 0 : getMigrationProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getConversionConfiguration() == null) ? 0 : getConversionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConversionConfigurationResult clone() {
        try {
            return (DescribeConversionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
